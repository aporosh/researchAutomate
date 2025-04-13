package restApi.services;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import lombok.val;

public class RestApiService {
    private final String base_url;// = "https://petstore.swagger.io/v2";
    //private static RequestSpecification REQ_SPEC;
    //protected ResponseSpecification RES_SPEC;
    private String getBasePath;

    public RestApiService(String base_url, String getBasePath) {
        this.base_url = base_url;
        this.getBasePath = getBasePath;
    }

    public RequestSpecification buildSpec() {

        return RestAssured.given()
                .baseUri(base_url)
                .basePath(getBasePath)
                .contentType(ContentType.JSON);
    }
}
