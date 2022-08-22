package communication;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import com.google.gson.Gson;

public class GongEx02 {

	public static void main(String[] args) {

		try {
			URL url = new URL("http://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getUltraSrtNcst?serviceKey=%2FBKGfux%2Bde%2Bi0jFLG%2BmFKccXFkvro4xnwk9SpIptRUr6KXmn7wNn7FJCquD4VzMZKSuR%2BjoNcP9jo%2FxzTJNs9A%3D%3D&pageNo=1&numOfRows=1000&dataType=JSON&base_date=20220822&base_time=1500&nx=98&ny=75");
			
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			
			BufferedReader br = new BufferedReader(
					new InputStreamReader(conn.getInputStream())
			);
			StringBuilder sb = new StringBuilder();
			String temp = null;
			
			while((temp = br.readLine())!=null) {
				sb.append(temp);
			}
			
			//json처럼 생긴 String을 RespDto로 변환
			Gson gson = new Gson();
			RespDto respDto = gson.fromJson(sb.toString(), RespDto.class);
			String str = respDto.getResponse().getBody().getItems().getItem().get(3).getObsrValue();
			System.out.println(str);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
