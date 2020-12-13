package com.api.pakg;

import static com.jayway.restassured.RestAssured.given;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

//Using complex json using Pojo Class Part 3 / step 3//
public class PostMethodComplexJsonUsingPojo {
	public static void main(String[] args) {
		AddressData address = new AddressData();
		address.setHouseNum("123");
		address.setStreet("ashokmarg");
		address.setSector("Sector12");
		address.setLandmark("NearGaurcity");
		
		BodyData1 compojo = new BodyData1();
		compojo.setFirstName("Vikrat");
		compojo.setLastName("Singh");
		compojo.setAge("28");
		compojo.setId("gaur");
		compojo.setAddress(address);
		Response res=
				given().contentType(ContentType.JSON)
				.body(compojo)
				.when()
				.post("http://localhost:3000/EmployeeData");
				System.out.println("Ststus code is "+res.statusCode());
				System.out.println("Data is: ");
				System.out.println(res.asString());
				
		
	}
	

}
