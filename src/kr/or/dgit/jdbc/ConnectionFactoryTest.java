package kr.or.dgit.jdbc;

import java.sql.Connection;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.dgit.jdbc.util.ConnectionFactory;
import kr.or.dgit.jdbc.util.JdbcUtil;

public class ConnectionFactoryTest {
	private static Connection ins;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ins = ConnectionFactory.getConnection();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		JdbcUtil.close(ins);
	}

	@Test
	public void test() {
		Assert.assertNotNull(ins);
	}

}
