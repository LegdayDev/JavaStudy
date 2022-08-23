package sock.ex01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServerSocket {
	
	ServerSocket serverSocket; //상속하지않고 의존성주입(DI)
	
	public void init(){
		System.out.println("-------Server Start-------");
		
		try {
			serverSocket = new ServerSocket(10000); //0~65536 중에서 0~1023 well known port(노건들),8080,1521(oracle)
			Socket socket = serverSocket.accept(); //리스너가 리스닝을 시작(while을 돌면서), SOCKET을 리턴
			//여기서 socket 객체는 target이다!!
			System.out.println("Client connection....");
			
			
			BufferedReader br = new BufferedReader(
					new InputStreamReader(socket.getInputStream())
			); 
			System.out.println("return message....");
			System.out.println(br.readLine());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		MyServerSocket ms = new MyServerSocket();
		ms.init();
	}
}
