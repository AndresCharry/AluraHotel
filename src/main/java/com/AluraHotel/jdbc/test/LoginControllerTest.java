package com.AluraHotel.jdbc.test;

import com.AluraHotel.jdbc.controller.LoginController;

public class LoginControllerTest {
	public static void main(String[] args) {
		var controller = new LoginController();
		var isEmpty = controller.confirmUser("admin", "admin");
		
		System.out.println(isEmpty);
	}
}
