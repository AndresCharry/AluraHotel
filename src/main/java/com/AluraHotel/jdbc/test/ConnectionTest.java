package com.AluraHotel.jdbc.test;

import java.sql.Connection;
import java.sql.SQLException;

import com.AluraHotel.jdbc.factory.ConnectionFactory;

public class ConnectionTest {

	public static void main(String[] args) throws SQLException {
		ConnectionFactory factory = new ConnectionFactory();
		Connection con = factory.reconnection();
		System.out.println(con);
		con.close();
	}

}
