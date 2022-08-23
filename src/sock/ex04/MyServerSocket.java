package sock.ex04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;



public class MyServerSocket {
	
	ServerSocket serverSocket; //상속하지않고 의존성주입(DI)
	BufferedReader br,keyboard;
	BufferedWriter bw;
	
	class ReadThread implements Runnable{
		
		@Override
		public void run() {
			try {
				while(true){ 
					String msg =br.readLine();
					System.out.println("return message : "+msg);
					
					if(msg.equals("bye")) 
						break;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	} 
	
	public void init(){
		System.out.println("-------Server Start-------");
		
		try {
			serverSocket = new ServerSocket(10000); //0~65536 중에서 0~1023 well known port(노건들),8080,1521(oracle)
			Socket socket = serverSocket.accept(); //리스너가 리스닝을 시작(while을 돌면서), SOCKET을 리턴
			//여기서 socket 객체는 target이다!!
			System.out.println("Client connection....");
			
			
			br = new BufferedReader(
					new InputStreamReader(socket.getInputStream())
			); 
			bw = new BufferedWriter(
					new OutputStreamWriter(socket.getOutputStream())
			);
			keyboard = new BufferedReader(
					new InputStreamReader(System.in)
			); 
			
			//새로운 스레드는 받은메시지 읽기만
			Thread t1 = new Thread(new ReadThread());
			t1.start();

			while(true) {
				String keyBoardMsg = keyboard.readLine(); //읽어서 버퍼를 비운다
				bw.write(keyBoardMsg+"\n");
				bw.flush();
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		MyServerSocket ms = new MyServerSocket();
		ms.init();
	}
}
