package restApiTests;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import restApi.pojos.petstore.Category;
import restApi.pojos.petstore.PetData;
import restApi.pojos.petstore.Tag;
import restApi.services.PetService;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.FactoryBasedNavigableListAssert.assertThat;

public class PetTests {

    @DisplayName("Создание пользователя")
    @Story("Create user")
    @Description("Проверяет отправку запроса на создлание пользователя и что в системе создался юзер с указанным именем")
    @Test
    public void createPet() throws IOException {
//        String[] photoUrls = {"string1", "string2"};
//        ArrayList<String> photoUrlList = new ArrayList<>(Arrays.asList(photoUrls));
//        Tag tag = new Tag(1, "test1");
//        Tag tag2 = new Tag(2, "test2");
//        ArrayList<Tag> tagList = new ArrayList<>();
//        tagList.add(tag);
//        tagList.add(tag2);
//        Category category = new Category(2, "category1");
//
//        PetData rq = new PetData(13, category, "doggie", photoUrlList, tagList, "available");
//
        PetData rq = new ObjectMapper().readValue(new File("src/test/resources/requestTemplates/petRequest.json"), PetData.class);
        rq.getCategory().setName("category34");
        rq.getPhotoUrls().add(1, "url2");
        rq.tags.get(0).setName("newTag");
        //rq.tags.clear();
        PetData rs = PetService.addPet(rq);

        assertThat(rs)
                .isNotNull();
//                .extracting(PetData::getStatus)
//                .isEqualTo(rq.getStatus());
    }
}
