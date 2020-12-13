package com.api.pakg;

import static com.jayway.restassured.RestAssured.given;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class PostDataUsingPojoClassInfromofArray {
	public static void main(String[] args) {
		
	AddressData1 address[] = new AddressData1[2];
	address[0]= new AddressData1();
	address[0].HouseNum="124";
	address[0].StrretNumber="DLF";
	address[0].Sector="sector63";
	address[0].Landmarks="FortuneCapitals";
	address[1]= new AddressData1();
	address[1].HouseNum="12";
	address[1].StrretNumber="DLFCybercity";
	address[1].Sector="63";
	address[1].Landmarks="LogixParks";
	BodyData2 bodyinfArray = new BodyData2();
	bodyinfArray.setFirstName("Rahul");
	bodyinfArray.setLastName("Mahajan");
	bodyinfArray.setAge("39");
	bodyinfArray.setId("Mahajan1");
	bodyinfArray.setAddress(address);
	Response res=
			given().contentType(ContentType.JSON)
			.body(bodyinfArray)
			.when()
			.post("http://localhost:3000/EmployeeData");
			System.out.println("Ststus code is "+res.statusCode());
			System.out.println("Data is: ");
			System.out.println(res.asString());
	
	
	
	
	

}}
