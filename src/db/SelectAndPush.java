package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class SelectAndPush {
	static void send(ArrayList<Emp> datas) { //통신을 한다고 가정
		
	}
	static Connection connection() { // DB session 연결하기 위한 함수
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
		ArrayList<Emp> emps = new ArrayList<>();
		try {
			// 1) DB연결
			Connection conn = connection();
			// 2) Query 문장 완성해서 pstmt 에 저장
			PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM emp");
			// 3) Query 문장 전송
			ResultSet rs = pstmt.executeQuery(); //ResultSet 클래스로 응답내용을 return 받는다 . 여기서 rs객체는 DB에서 커서와 같다.현재 커서는 첫번째열 위를 가리키고있다
			
			// 4) 커서(rs)를 false때까지 내리기
			
			while(rs.next()) {
				Emp emp= new Emp();
				
				emp.setEmpno(rs.getInt("empno"));
				emp.setEname(rs.getString("ename"));
				emp.setJob(rs.getString("job"));
				emp.setMgr(rs.getInt("mgr"));
				emp.setHiredate(rs.getTimestamp("hiredate"));
				emp.setSal(rs.getInt("sal"));
				emp.setComm(rs.getInt("comm"));
				emp.setDeptno(rs.getInt("deptno"));
				
				emps.add(emp);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		int size = emps.size();
		for(int i=0;i<size;i++) {
			System.out.println(emps.get(i).getEname());
		}
		
		//데이터 전송하기
		send(emps);
	}

}
