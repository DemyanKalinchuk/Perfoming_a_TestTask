package rest;

import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.login.LoginPage;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.requestSpecification;
import static org.hamcrest.Matchers.equalTo;

public class RestTest {
    private static final Logger logger = LoggerFactory.getLogger(RestTest.class);

    @Test
    public void receiveData(){

        given()
                .baseUri("https://swapi.dev/api/starships/9/")
                .basePath("")
                .contentType(ContentType.JSON)
                .when().get()
                .then()
                .statusCode(200)
                .body("name", equalTo("Death Star"));

logger.info("Name == Death Star");
    }
}
