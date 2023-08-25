package com.AluraHotel.jdbc.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionFactory {
	
	public Connection reconnection() {
		try {
			return DriverManager.getConnection(
					"jdbc:mysql://localhost/alura_hotel?useTime_Zone=true&serverTimeZone=UTC",
					"root",
					"");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
