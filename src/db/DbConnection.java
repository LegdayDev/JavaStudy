package db;

import java.sql.Connection;
import java.sql.DriverManager;

//DB���� Ŭ����
public class DbConnection {
	public static Connection connection() { // DB session �����ϱ� ���� �Լ�
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
}
