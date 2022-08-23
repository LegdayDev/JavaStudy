package sock.ex04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;



public class MyServerSocket {
	
	ServerSocket serverSocket; //��������ʰ� ����������(DI)
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
			serverSocket = new ServerSocket(10000); //0~65536 �߿��� 0~1023 well known port(��ǵ�),8080,1521(oracle)
			Socket socket = serverSocket.accept(); //�����ʰ� �������� ����(while�� ���鼭), SOCKET�� ����
			//���⼭ socket ��ü�� target�̴�!!
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
			
			//���ο� ������� �����޽��� �б⸸
			Thread t1 = new Thread(new ReadThread());
			t1.start();

			while(true) {
				String keyBoardMsg = keyboard.readLine(); //�о ���۸� ����
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
