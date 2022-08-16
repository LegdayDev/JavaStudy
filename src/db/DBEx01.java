package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBEx01 {
	
	static Connection connection() {
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
		
		try {
			// 1) DB����
			Connection conn = connection();
			// 2) Query ���� �ϼ��ؼ� pstmt �� ����
			PreparedStatement pstmt = conn.prepareStatement("SELECT empno, ename FROM emp WHERE empno=7369");
			// 3) Query ���� ����
			ResultSet rs = pstmt.executeQuery(); //ResultSet Ŭ������ ���䳻���� return �޴´� . ���⼭ rs��ü�� DB���� Ŀ���� ����.���� Ŀ���� ù��°�� ���� ����Ű���ִ�
			rs.next(); //Ŀ���� ������ �޼���(Ŀ���� ������ ���� �޼��带 ����Ѵ�.)
			//���� ������ ���� 1���ۿ� ���⶧���� �ѹ��� Ŀ���� ������ �ȴ�.
			
			System.out.println(rs.getInt("empno")); //empno�� number�����̱� ������ int��
			System.out.println(rs.getString("ename")); //ename �� varchar�����̱� ������ string��
		} catch (Exception e) {
			e.printStackTrace();
		}
	

	}

}
