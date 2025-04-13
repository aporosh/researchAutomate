package restApiTests;

import com.github.tomakehurst.wiremock.junit.WireMockRule;
import org.junit.jupiter.api.Test;

import static com.github.tomakehurst.wiremock.client.WireMock.*;

public class MessagesTests {
   // @Rule
    public WireMockRule wireMockRule = new WireMockRule(8089); // No-args constructor

    @Test
    public void exampleTest() {
        // Setup the WireMock mapping stub for the test
        stubFor(post("/my/resource")
                .withHeader("Content-Type", containing("xml"))
                .willReturn(ok()
                        .withHeader("Content-Type", "application/json")
                        .withBody("MessagesResponseTemplate.json")));
    }
}
