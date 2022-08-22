package communication;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class NaverProgram {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://www.naver.com");
			URL url2 = new URL("https://weather.naver.com/");//패키지파일 경로는 .net으로 할것!
			HttpsURLConnection conn = (HttpsURLConnection)url2.openConnection();
			
			BufferedReader br = new BufferedReader(
					new InputStreamReader(conn.getInputStream())
			);
			String temp = null;
			
			while((temp = br.readLine())!=null) {
				
				System.out.println(temp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
