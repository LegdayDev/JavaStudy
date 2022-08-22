package communication;

import java.io.InputStream;

public class InputEx01 {

	public static void main(String[] args) {
		//Byte Stream
		InputStream in = System.in;
		
		try {
			int number = in.read(); //키보드 입력값을 8bit를 끊어서 읽는다
			System.out.println((char)number);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
