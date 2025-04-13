package restApi.services;

import restApi.pojos.petstore.Category;
import restApi.pojos.petstore.PetData;
import restApi.pojos.petstore.Tag;

import java.util.ArrayList;
import java.util.Arrays;

public class PetGenerator {
    static Category defaultCategory = new Category(2, "category1");
    static ArrayList<String> defaultPhotoUrls = new ArrayList<>(Arrays.asList("string1", "string2"));
    private static final ArrayList<Tag> defaultTagList = new ArrayList<>() ;
    Tag tag = new Tag(1, "tag1");
    Tag tag2 = new Tag(2, "tag2");

    public static PetData getSimplePet(){
        return PetData.builder()
                .id(10)
                .category(defaultCategory)
                .name("testName")
                .photoUrls(defaultPhotoUrls)
                .tags(defaultTagList)
                .status("available")
                .build();
    }
}
