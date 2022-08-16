package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DeptDao {
	
	public ArrayList<Dept> 부서목록보기() {
		ArrayList<Dept> depts = new ArrayList<>();
		try {
			Connection conn = DbConnection.connection();
			PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM dept");
			ResultSet rs = pstmt.executeQuery(); //Read(select)할때만 executeQuery를 쓴다.(commit을 안한다.)
		
			while(rs.next()) {
				Dept dept = new Dept();
				dept.setDeptno(rs.getInt("deptno"));
				dept.setDname(rs.getString("dname"));
				dept.setLoc(null);
				depts.add(dept);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return depts;
	}
	public int 부서추가(Dept dept) {
		int result = -1; 
		
		try {
			
			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO dept ");
			sql.append("VALUES(?,?,?)"); //?는 1부터 시작함(DB는 1번지부터 시작함 , JAVA는 0번지)
			//2) DB Session
			Connection conn = DbConnection.connection();
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
			//3) 문장완성
			pstmt.setInt(1, dept.getDeptno());
			pstmt.setString(2, dept.getDname());
			pstmt.setString(3, dept.getLoc());
			
			
			//4) DBMS에 전송
			result = pstmt.executeUpdate(); //문장전송->commit
			//result가 0:변경안됨,-1:오류, 그 외 : 행의 갯수
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public int 부서삭제(int deptno) {
		int result = -1; 
		
		try {
			StringBuilder sql = new StringBuilder();
			sql.append("DELETE FROM dept WHERE deptno = ?");
			Connection conn = DbConnection.connection();
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
			pstmt.setInt(1, deptno);

			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public int 부서수정(String dname, String loc, int deptno) {
		int result = -1;
		try {
			StringBuilder sql = new StringBuilder();
			sql.append("UPDATE dept SET dname = ?, loc = ? WHERE deptno = ?");
			Connection conn = DbConnection.connection();
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, dname);
			pstmt.setString(2, loc);
			pstmt.setInt(3, deptno);
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public Dept 부서한건보기(int index){
		Dept dept = new Dept();
	
		try {
			Connection conn = DbConnection.connection();
			PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM dept WHERE deptno="+index);
			ResultSet rs = pstmt.executeQuery(); 
		
			while(rs.next()) {
				dept.setDeptno(rs.getInt("deptno"));
				dept.setDname(rs.getString("dname"));
				dept.setLoc(rs.getString("loc"));

			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dept;
	}




	
}
