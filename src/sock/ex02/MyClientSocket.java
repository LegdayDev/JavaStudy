package sock.ex02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

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
			while(true) {
				String keyBoardMsg = br.readLine(); //readLine() 키보드엔터키 받을때 까지 대기
				
				bw.write(keyBoardMsg+"\n");
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
