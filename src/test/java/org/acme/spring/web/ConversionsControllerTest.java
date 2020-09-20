package org.acme.spring.web;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class ConversionsControllerTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/conversions/ktoc")
          .then()
             .statusCode(200)
             .body(is("hello"));
    }

}