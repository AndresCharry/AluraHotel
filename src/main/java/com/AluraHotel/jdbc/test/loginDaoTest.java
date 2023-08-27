package com.AluraHotel.jdbc.test;

import java.util.List;

import com.AluraHotel.jdbc.dao.LoginDao;
import com.AluraHotel.jdbc.factory.ConnectionFactory;
import com.AluraHotel.jdbc.model.User;

public class loginDaoTest {
	public static void main(String[] args) {
		ConnectionFactory factory = new  ConnectionFactory();
		LoginDao login = new LoginDao(factory.reconnection());
		
		List<User> users = login.ConfirmUser("admin1", "admin");
		users.forEach(user -> {
		System.out.println("the user is: " + user.getUsername());
		System.out.println("the password is: " + user.getPassword());
		});
	}
}
