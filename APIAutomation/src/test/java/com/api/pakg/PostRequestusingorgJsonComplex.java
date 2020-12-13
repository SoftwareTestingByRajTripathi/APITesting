package com.api.pakg;

import static com.jayway.restassured.RestAssured.given;

import org.json.JSONObject;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class PostRequestusingorgJsonComplex {
	public static void main(String[] args) {
		JSONObject Address = new JSONObject();// inner object
		Address.put("HouseNum","123");
		Address.put("Landmarks","Gaurcity");
		Address.put("Sector","1");
		
		JSONObject js = new JSONObject();// outer object
		js.put("id", "post");
		js.put("FirstName","Rahul");
		js.put("LastName", "Singh");
		js.put("Age","24");
		js.put("Add",Address);
		
		Response res=
		given().contentType(ContentType.JSON)
		.body(js.toString())
		.when()
		.post("http://localhost:3000/EmployeeData");
		System.out.println("Ststus code is "+res.statusCode());
		System.out.println("Data is: ");
		System.out.println(res.asString());
		
	}

}
