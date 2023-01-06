package com.database.zipcontroll;

import java.util.HashMap;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.database.zip.ZipCode;

@RestController
public class ZipControl {
	
	@RequestMapping("/add/{zipcode}")
	public ZipCode add(@PathVariable int zipcode){
		HashMap<Integer, ZipCode> address=new HashMap<>();
		address.put(532001, new ZipCode("AP","Sklm", "India"));
		address.put(532002, new ZipCode("TS","Hyd", "India"));
		address.put(532004, new ZipCode("TN","chen", "India"));
		
		return address.get(zipcode);
		
	}

}
