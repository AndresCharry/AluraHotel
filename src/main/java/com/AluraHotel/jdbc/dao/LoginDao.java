package com.AluraHotel.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.AluraHotel.jdbc.model.User;

public class LoginDao {
	//attributes
	final private Connection con;
	
	public LoginDao(Connection con) {
		this.con = con;
	}
	
	public List<User> ConfirmUser(String userName, String password) {
		List<User> resultado = new ArrayList<>();
		try {
			final PreparedStatement statement = con.prepareStatement("SELECT user, password "
					+ "FROM Users "
					+ "WHERE user = ? AND password = ?");
			try(statement){
				statement.setString(1, userName);
				statement.setString(2, password);
				
				statement.execute();
				
				ResultSet resultSet = statement.getResultSet();
//				System.out.println(resultSet.getString("user"));
				while(resultSet.next()) {
					User user = new User(
							resultSet.getString("user"),
							resultSet.getString("password"));
					resultado.add(user);
				}
				return resultado;
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
