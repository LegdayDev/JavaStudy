package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBEx01 {
	
	static Connection connection() {
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

	public static void main(String[] args) {
		// DBS가 아닌 DBMS에 연결
		// DBS는 하드디스크에 있는 시스템이라 접근X
		
		try {
			// 1) DB연결
			Connection conn = connection();
			// 2) Query 문장 완성해서 pstmt 에 저장
			PreparedStatement pstmt = conn.prepareStatement("SELECT empno, ename FROM emp WHERE empno=7369");
			// 3) Query 문장 전송
			ResultSet rs = pstmt.executeQuery(); //ResultSet 클래스로 응답내용을 return 받는다 . 여기서 rs객체는 DB에서 커서와 같다.현재 커서는 첫번째열 위를 가리키고있다
			rs.next(); //커서를 내리는 메서드(커서를 내릴때 마다 메서드를 써야한다.)
			//현재 나오는 열은 1개밖에 없기때문에 한번만 커서를 내리면 된다.
			
			System.out.println(rs.getInt("empno")); //empno는 number형식이기 때문에 int형
			System.out.println(rs.getString("ename")); //ename 은 varchar형식이기 때문에 string형
		} catch (Exception e) {
			e.printStackTrace();
		}
	

	}

}
