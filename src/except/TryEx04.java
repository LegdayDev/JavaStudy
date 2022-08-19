package except;

import java.io.IOException;
import java.sql.SQLException;

class Car{
	String name = "�ҳ�Ÿ";
	public void namePring() {System.out.println(name);}
}
public class TryEx04 {

	
	public static void start(Car c) throws NullPointerException {
		c.namePring();
	}
	public static void start2(Car c) throws IOException {
		c.namePring();
	}
	public static void start3(Car c) throws SQLException {
		c.namePring();
	}
	public static void main(String[] args) {
		try {
			start(null);
		} catch (RuntimeException e) {
			System.out.println("��Ÿ�� ����");
		}
		
		try {
			start2(null);
			start3(null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("������ ����");
		}


	}

}
