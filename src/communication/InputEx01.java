package communication;

import java.io.InputStream;

public class InputEx01 {

	public static void main(String[] args) {
		//Byte Stream
		InputStream in = System.in;
		
		try {
			int number = in.read(); //Ű���� �Է°��� 8bit�� ��� �д´�
			System.out.println((char)number);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
