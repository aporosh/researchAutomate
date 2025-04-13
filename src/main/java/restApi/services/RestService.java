package restApi.services;


import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public abstract class RestService {
    private static final String BASE_URL = "https://petstore.swagger.io/v2";
    protected static RequestSpecification REQ_SPEC;
    protected ResponseSpecification RES_SPEC;
    protected abstract String getBasePath();

    public RestService(){


        REQ_SPEC = new RequestSpecBuilder()

                .setBaseUri(BASE_URL)
                .setBasePath(getBasePath())
                .setContentType(ContentType.JSON)
                .build();
    }
}
