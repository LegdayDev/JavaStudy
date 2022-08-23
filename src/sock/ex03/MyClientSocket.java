package sock.ex03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

import com.google.gson.Gson;

public class MyClientSocket {

	Socket socket;
	
	private void init() {
		
		try {
			socket = new Socket("localhost",10000); //ip주소,port주소
			//쌤 ip주소 : 192.168.0.132
			BufferedWriter bw = new BufferedWriter(
					new OutputStreamWriter(socket.getOutputStream())
			); //BufferedWriter 서버에 연결
			BufferedReader br = new BufferedReader(
					new InputStreamReader(System.in)
			); //BufferedReader 키보드에 연결
			String keyBoardMsg = null;
			while((keyBoardMsg = br.readLine())!=null) {
				
				MyDto dto = new MyDto(1,"통신성공",keyBoardMsg);
				
				Gson gson = new Gson();
				String sendData = gson.toJson(dto);
				
				bw.write(sendData+"\n");
				bw.flush();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		MyClientSocket ms = new MyClientSocket();
		ms.init();
	}

}
