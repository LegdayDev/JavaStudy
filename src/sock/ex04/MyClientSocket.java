package sock.ex04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class MyClientSocket {

	Socket socket;
	BufferedWriter bw;
	BufferedReader br,keyBoard;
	
	public class ReadThread implements Runnable{
		@Override
		public void run() {
			try {
				while(true) {
					String msg = br.readLine();
					System.out.println("return message : "+msg);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	}
	private void init() {
		
		try {
			socket = new Socket("localhost",10000); //ip주소,port주소
		
			bw = new BufferedWriter(
					new OutputStreamWriter(socket.getOutputStream())
			); //BufferedWriter 서버에 연결
			
			br = new BufferedReader(
					new InputStreamReader(socket.getInputStream()) 
			); //BufferedReader 키보드에 연결
			
			keyBoard = new BufferedReader(
					new InputStreamReader(System.in) //target은 system.in 해서 키보드에 연결
			);
			
			//일기쓰레드는 읽기만
			Thread t1 = new Thread(new ReadThread());
			t1.start();
			
			
			
			//메인쓰레드는 쓰기만 
			while(true) {
				String keyBoardMsg = keyBoard.readLine(); //readLine() 키보드엔터키 받을때 까지 대기
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

