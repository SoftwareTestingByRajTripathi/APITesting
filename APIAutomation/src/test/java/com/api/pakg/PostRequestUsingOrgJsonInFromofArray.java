package com.api.pakg;

import static com.jayway.restassured.RestAssured.given;

import org.json.JSONArray;
import org.json.JSONObject;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class PostRequestUsingOrgJsonInFromofArray {
	public static void main(String[] args) {
		JSONObject Secondry = new JSONObject();
		Secondry.put("HouseNum","13");
		Secondry.put("Sector","78");
		Secondry.put("LandMark","Near Globus");
		
		JSONObject Primary = new JSONObject();
		Primary.put("HouseNum","17");
		Primary.put("Sector","78");
		Primary.put("LandMark","Near Ryan School");
		
		JSONArray address = new JSONArray();
		address.put(0,Primary);
		address.put(1,Secondry);
		
		JSONObject BasicInfo = new JSONObject();
		BasicInfo.put("id","basic");
		BasicInfo.put("FirstName","Rohan");
		BasicInfo.put("LastName","Thakur");
		BasicInfo.put("Desig","TL");
		BasicInfo.put("Address",address);
		Response res=
				given().contentType(ContentType.JSON)
				.body(BasicInfo.toString())
				.when()
				.post("http://localhost:3000/EmployeeData");
				System.out.println("Ststus code is "+res.statusCode());
				System.out.println("Data is: ");
				System.out.println(res.asString());
		
		
		
	}

}
