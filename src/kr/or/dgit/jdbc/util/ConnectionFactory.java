package kr.or.dgit.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	private static final ConnectionFactory ins = new ConnectionFactory();

	public static Connection getConnection() {
		return ins.createConnection();
	}

	private Connection createConnection() {
		Connection connection = null;
		String url = "jdbc:mysql://localhost:3306/mybatis";
		String user = "root";
		String password = "rootroot";
		try {
			connection = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			System.err.printf("Error : Unable to Connection DataBase");
		}
		return connection;
	}

	private ConnectionFactory() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.err.printf("MYSQL Driver not Found!!");
			System.exit(-1);
		}
	}

}
