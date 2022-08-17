package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

//DAO : Data Access Object(데이터 접근 객체)
//역할 : DB에 접근해서 Date를 Access하는 역할
public class EmpDao {

	private Connection conn;
	public EmpDao() {
		// TODO Auto-generated constructor stub
	}
	public EmpDao(Connection conn) {
		this.conn = conn;
	}

	public int 직원수정(int sal, int comm, int empno) {
		int result = -1;
		try {
			StringBuilder sql = new StringBuilder();
			sql.append("UPDATE emp SET sal = ?, comm = ? WHERE empno = ?");
			
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
			pstmt.setInt(1, sal);
			pstmt.setInt(2, comm);
			pstmt.setInt(3, empno);
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public int 직원수정(int deptno, int empno) {
		int result = -1;
		try {
			StringBuilder sql = new StringBuilder();
			sql.append("UPDATE emp SET deptno = ? WHERE empno = ?");
			
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
			pstmt.setInt(1, deptno);
			pstmt.setInt(2, empno);
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public int 직원삭제(int empno) {
		int result = -1; 
		
		try {
			StringBuilder sql = new StringBuilder();
			sql.append("DELETE FROM emp WHERE empno = ?");
			
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
			pstmt.setInt(1, empno);

			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public int 직원추가(Emp emp) {
		int result = -1; 
		
		try {
			//StringBuilde : 메모리에 차곡차곡 저장(문자열전용)
			//쿼리가 길어지면 StringBuilder가 가독성이 좋다
			//1) sql작성
			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO emp ");
			sql.append("VALUES(?,?,?,?,sysdate,?,?,?)"); //?는 1부터 시작함(DB는 1번지부터 시작함 , JAVA는 0번지)
			//2) DB Session
			
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
			//3) 문장완성
			pstmt.setInt(1, emp.getEmpno());
			pstmt.setString(2, emp.getEname());
			pstmt.setString(3, emp.getJob());
			pstmt.setInt(4, emp.getMgr());
			pstmt.setInt(5, emp.getSal());
			pstmt.setInt(6, emp.getComm());
			pstmt.setInt(7, emp.getDeptno());
			
			//4) DBMS에 전송
			result = pstmt.executeUpdate(); //문장전송->commit
			//result가 0:변경안됨,-1:오류, 그 외 : 행의 갯수
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	
	public ArrayList<Emp> 직원목록보기() {
		ArrayList<Emp> emps = new ArrayList<>();
		try {
			
			PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM emp");
			ResultSet rs = pstmt.executeQuery(); //Read(select)할때만 executeQuery를 쓴다.(commit을 안한다.)
		
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
		return emps;
	}//end of 직원목록보기

	public Emp 직원한건보기(int index){
		Emp emp = new Emp();
	
		try {
			
			PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM emp WHERE empno="+index);
			ResultSet rs = pstmt.executeQuery(); 
		
			while(rs.next()) {
				emp.setEmpno(rs.getInt("empno"));
				emp.setEname(rs.getString("ename"));
				emp.setJob(rs.getString("job"));
				emp.setMgr(rs.getInt("mgr"));
				emp.setHiredate(rs.getTimestamp("hiredate"));
				emp.setSal(rs.getInt("sal"));
				emp.setComm(rs.getInt("comm"));
				emp.setDeptno(rs.getInt("deptno"));

			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return emp;
	}
	
}
