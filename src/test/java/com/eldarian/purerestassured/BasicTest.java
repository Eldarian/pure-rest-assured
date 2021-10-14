package com.eldarian.purerestassured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicTest {

    @Test
    public void testSimpleGetRequest() {
        Response response = RestAssured.get("https://reqres.in/api/users?page=2");
        System.out.println(response.asString());
        Assert.assertEquals(response.statusCode(), 200);
    }
}
