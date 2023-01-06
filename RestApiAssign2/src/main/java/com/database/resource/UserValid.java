package com.database.resource;

public class UserValid {

	public boolean userval(String user, String pass) {
		if(user.equals("sravani") && pass.equals("abc"))
			return true;
		else
			return false;
		
	}
}
