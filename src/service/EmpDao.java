package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

//DAO : Data Access Object(������ ���� ��ü)
//���� : DB�� �����ؼ� Date�� Access�ϴ� ����
public class EmpDao {

	private Connection conn;
	public EmpDao() {
		// TODO Auto-generated constructor stub
	}
	public EmpDao(Connection conn) {
		this.conn = conn;
	}

	public int ��������(int sal, int comm, int empno) {
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
	
	public int ��������(int deptno, int empno) {
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
	
	public int ��������(int empno) {
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

	public int �����߰�(Emp emp) {
		int result = -1; 
		
		try {
			//StringBuilde : �޸𸮿� �������� ����(���ڿ�����)
			//������ ������� StringBuilder�� �������� ����
			//1) sql�ۼ�
			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO emp ");
			sql.append("VALUES(?,?,?,?,sysdate,?,?,?)"); //?�� 1���� ������(DB�� 1�������� ������ , JAVA�� 0����)
			//2) DB Session
			
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
			//3) ����ϼ�
			pstmt.setInt(1, emp.getEmpno());
			pstmt.setString(2, emp.getEname());
			pstmt.setString(3, emp.getJob());
			pstmt.setInt(4, emp.getMgr());
			pstmt.setInt(5, emp.getSal());
			pstmt.setInt(6, emp.getComm());
			pstmt.setInt(7, emp.getDeptno());
			
			//4) DBMS�� ����
			result = pstmt.executeUpdate(); //��������->commit
			//result�� 0:����ȵ�,-1:����, �� �� : ���� ����
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	
	public ArrayList<Emp> ������Ϻ���() {
		ArrayList<Emp> emps = new ArrayList<>();
		try {
			
			PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM emp");
			ResultSet rs = pstmt.executeQuery(); //Read(select)�Ҷ��� executeQuery�� ����.(commit�� ���Ѵ�.)
		
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
	}//end of ������Ϻ���

	public Emp �����ѰǺ���(int index){
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
