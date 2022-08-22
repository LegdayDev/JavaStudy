package communication;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class InputEx03 {

	public static BufferedReader read() throws Exception {
		BufferedReader br = new BufferedReader
				(new InputStreamReader(System.in)
			);
		return br;
	} //ÇÔ¼ö·Î »©Áàµµ ´í´Ù.
	
	public static void main(String[] args) {
		
		try {
			String s = read().readLine();
			System.out.println(s);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
