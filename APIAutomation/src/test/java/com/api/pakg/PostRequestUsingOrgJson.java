package com.api.pakg;

import org.json.JSONObject;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.*;

//body data using org.json library//
public class PostRequestUsingOrgJson {
	public static void main(String[] args) {
		//Preparing body data /
		JSONObject js = new JSONObject();
		js.put("id", "super");
		js.put("FirstName","Rahul");
		js.put("LastName", "Singh");
		js.put("Age","24");
		
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
