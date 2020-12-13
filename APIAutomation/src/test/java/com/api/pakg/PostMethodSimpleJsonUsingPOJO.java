package com.api.pakg;

import static com.jayway.restassured.RestAssured.*;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
//In simple json using pojoclass//

public class PostMethodSimpleJsonUsingPOJO {
	public static void main(String[] args) {
		
	
	BodyData bodydatapojo= new BodyData();
	bodydatapojo.setFirstName("Raj");
	bodydatapojo.setLastName("Tripathi");
	bodydatapojo.setAge("28");
	bodydatapojo.setAddress("Sector1 Gr.Noida");
	bodydatapojo.setId("ecovillege1");
	Response res=
			given().contentType(ContentType.JSON)
			.body(bodydatapojo)
			.when()
			.post("http://localhost:3000/EmployeeData");
			System.out.println("Ststus code is "+res.statusCode());
			System.out.println("Data is: ");
			System.out.println(res.asString());
			
	
	}
}
