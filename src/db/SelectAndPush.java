package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class SelectAndPush {
	static void send(ArrayList<Emp> datas) { //����� �Ѵٰ� ����
		
	}
	static Connection connection() { // DB session �����ϱ� ���� �Լ�
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); //Ŭ���� ���
			
			Connection conn = DriverManager.getConnection(//���������̸�,ID,PW
					"jdbc:oracle:thin:@localhost:1521:xe", //xe��� �̸��� �����ʸ� ���ؼ� ����
					"SCOTT", //DB ���̵�
					"TIGER" //DB ���
					);
			return conn;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}

	public static void main(String[] args) {
		// DBS�� �ƴ� DBMS�� ����
		// DBS�� �ϵ��ũ�� �ִ� �ý����̶� ����X
		ArrayList<Emp> emps = new ArrayList<>();
		try {
			// 1) DB����
			Connection conn = connection();
			// 2) Query ���� �ϼ��ؼ� pstmt �� ����
			PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM emp");
			// 3) Query ���� ����
			ResultSet rs = pstmt.executeQuery(); //ResultSet Ŭ������ ���䳻���� return �޴´� . ���⼭ rs��ü�� DB���� Ŀ���� ����.���� Ŀ���� ù��°�� ���� ����Ű���ִ�
			
			// 4) Ŀ��(rs)�� false������ ������
			
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
		
		//������ �����ϱ�
		send(emps);
	}

}
