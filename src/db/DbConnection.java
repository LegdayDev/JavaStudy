package db;

import java.sql.Connection;
import java.sql.DriverManager;

//DB연결 클래스
public class DbConnection {
	public static Connection connection() { // DB session 연결하기 위한 함수
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); //클래스 경로
			
			Connection conn = DriverManager.getConnection(//프로토콜이름,ID,PW
					"jdbc:oracle:thin:@localhost:1521:xe", //xe라는 이름의 리스너를 통해서 접근
					"SCOTT", //DB 아이디
					"TIGER" //DB 비번
					);
			return conn;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}
}
