package com.api.pakg;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;

public class PostRequestUsingJsonFile {
	public static void main(String[] args) throws FileNotFoundException {
		File f = new File ("../APIAutomation/Test1.json");
		FileReader fr = new FileReader(f); // For stream data//
		JSONTokener js = new JSONTokener(fr);// This is read for json file//
		JSONObject data = new JSONObject();
		System.out.println(data.toString());
		
		
	}

}
