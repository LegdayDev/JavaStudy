package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DeptDao {
	
	public ArrayList<Dept> �μ���Ϻ���() {
		ArrayList<Dept> depts = new ArrayList<>();
		try {
			Connection conn = DbConnection.connection();
			PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM dept");
			ResultSet rs = pstmt.executeQuery(); //Read(select)�Ҷ��� executeQuery�� ����.(commit�� ���Ѵ�.)
		
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
	public int �μ��߰�(Dept dept) {
		int result = -1; 
		
		try {
			
			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO dept ");
			sql.append("VALUES(?,?,?)"); //?�� 1���� ������(DB�� 1�������� ������ , JAVA�� 0����)
			//2) DB Session
			Connection conn = DbConnection.connection();
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
			//3) ����ϼ�
			pstmt.setInt(1, dept.getDeptno());
			pstmt.setString(2, dept.getDname());
			pstmt.setString(3, dept.getLoc());
			
			
			//4) DBMS�� ����
			result = pstmt.executeUpdate(); //��������->commit
			//result�� 0:����ȵ�,-1:����, �� �� : ���� ����
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public int �μ�����(int deptno) {
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
	
	public int �μ�����(String dname, String loc, int deptno) {
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
	
	public Dept �μ��ѰǺ���(int index){
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
