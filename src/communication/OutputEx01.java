package communication;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class OutputEx01 {

	public static void main(String[] args) {
		BufferedWriter bw = new BufferedWriter(
				new OutputStreamWriter(System.out)
		);
		try {
			bw.write("¾È³ç");
			bw.flush();
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
