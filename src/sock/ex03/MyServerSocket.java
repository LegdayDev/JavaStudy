package sock.ex03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

import com.google.gson.Gson;

public class MyServerSocket {

	ServerSocket serverSocket; // ��������ʰ� ����������(DI)

	public void init(){
		System.out.println("-------Server Start-------");
		
		try {
			serverSocket = new ServerSocket(10000); //0~65536 �߿��� 0~1023 well known port(��ǵ�),8080,1521(oracle)
			Socket socket = serverSocket.accept(); //�����ʰ� �������� ����(while�� ���鼭), SOCKET�� ����
			//���⼭ socket ��ü�� target�̴�!!
			System.out.println("Client connection....");
			
			
			BufferedReader br = new BufferedReader(
					new InputStreamReader(socket.getInputStream())
			); 
			

			while(true){ // '\n' �� ���ö����� ���
				String msg =br.readLine();

				int checkIndex = msg.indexOf("bye");
				if(checkIndex!=-1) break;
				System.out.println("return message : "+msg);
			}
				
			
			System.out.println("server exit");

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		MyServerSocket ms = new MyServerSocket();
		ms.init();
	}
}
