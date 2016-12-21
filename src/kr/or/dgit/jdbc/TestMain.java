package kr.or.dgit.jdbc;

import java.sql.Connection;

import kr.or.dgit.jdbc.util.ConnectionFactory;

public class TestMain {
	public static void main(String[] args) {
		Connection con = ConnectionFactory.getConnection();
		
		System.out.println(con);
	}
}
