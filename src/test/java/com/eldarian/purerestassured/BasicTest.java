package com.eldarian.purerestassured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class BasicTest {

    @Test
    public void testSimpleGetRequest() {
        Response response = RestAssured.get("https://reqres.in/api/users?page=2");
        System.out.println(response.asString());
        Assert.assertEquals(response.statusCode(), 200);

    }

    @Test
    public void testBDDGetRequest() {
        given().
                param("text", "test").
        when().
                get("http://md5.jsontest.com").
        then().
                assertThat().body("md5", equalTo("098f6bcd4621d373cade4e832627b4f6"));

    }
}
