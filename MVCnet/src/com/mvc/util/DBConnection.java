package com.mvc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mvc.exception.ExceptionMessages;
import com.mvc.exception.LoginException;

public class DBConnection {

	private static Connection connection=null;
	public static Connection getConnection() throws ClassNotFoundException, LoginException {
		System.out.println("conn");
		
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				connection = DriverManager.getConnection("jdbc:oracle:thin:@10.219.34.3:1521/orcl","trg707","training707");
				}catch(SQLException e) {
					throw new LoginException(ExceptionMessages.MESSAGE1);
				}
		
		return connection;
	}
}
