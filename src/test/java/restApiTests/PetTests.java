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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.FactoryBasedNavigableListAssert.assertThat;

public class PetTests {

    @DisplayName("Создание пользователя")
    @Story("Create user")
    @Description("Проверяет отправку запроса на создлание пользователя и что в системе создался юзер с указанным именем")
    @Test
    public void createPet() throws IOException, ParseException {
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


        SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date(1212121212121L);
        System.out.println(formater.format(date));

        long time = date.getTime();
        System.out.println(time);

        Date current = new Date(105, 5, 4, 12, 15, 0);
        SimpleDateFormat formatter = new SimpleDateFormat("MMM-dd-YYYY");
        String message = formatter.format(current);
        System.out.println(message);

        java.util.Date currentDate = new java.util.Date();
        System.out.println(currentDate);

        java.time.LocalDateTime currentDateTime = java.time.LocalDateTime.now();
        System.out.println(currentDateTime);




        String dateString = "2021-01-01";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date formatedDate = sdf.parse(dateString);

        Calendar c = Calendar.getInstance();
        c.setTime(formatedDate);
        c.add(Calendar.DATE, 1);  // number of days to add
        formatedDate = c.getTime();

        System.out.println(sdf.format(formatedDate)); // 2021-01-02


        Date dateTime = new Date();
        dateTime.setTime( Date.parse("Jul 06 12:15:00 2019") );


    }
}
