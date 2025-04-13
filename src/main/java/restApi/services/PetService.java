package restApi.services;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import restApi.pojos.petstore.PetData;

import static io.restassured.RestAssured.given;
import io.qameta.allure.Step;

public class PetService{
//    @Override
//    protected String getBasePath(){
//        return "/pet";
//    }
//    public PetService(){
//        super();
//    }
    private static final String base_url = "https://petstore.swagger.io/v2";
    static RequestSpecification Req_Spec = given()
            .baseUri(base_url)
            .basePath("/pet")
            .log().all()
            .contentType(ContentType.JSON);

    @Step("Добавление нового питомца в магаз")
    public static PetData addPet(PetData rq){
        return given().spec(Req_Spec).body(rq).log().all().post().as(PetData.class);
    }

}
