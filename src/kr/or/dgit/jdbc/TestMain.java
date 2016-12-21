package kr.or.dgit.jdbc;

import java.util.Date;

import kr.or.dgit.jdbc.dao.StudentService;
import kr.or.dgit.jdbc.dto.Student;

public class TestMain {
	public static void main(String[] args) {
		/*
		 * Connection con = ConnectionFactory.getConnection();
		 * System.out.println(con);
		 */

		Student item = new Student(4, "홍두께", "hdk@test.co.kr", new Date());
		/* StudentService.getInstance().insertItem(item); */

		/*
		 * item.setName("전지현"); StudentService.getInstance().updateItem(item);
		 */
		
		StudentService.getInstance().deleteItem(4);
		
		for (Student s : StudentService.getInstance().selectByAll()) {
			System.out.println(s);
		}
		
		System.out.println();
		System.out.println(StudentService.getInstance().selectByNo(2));
	}
}
