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
			socket = new Socket("localhost",10000); //ip�ּ�,port�ּ�
		
			bw = new BufferedWriter(
					new OutputStreamWriter(socket.getOutputStream())
			); //BufferedWriter ������ ����
			
			br = new BufferedReader(
					new InputStreamReader(socket.getInputStream()) 
			); //BufferedReader Ű���忡 ����
			
			keyBoard = new BufferedReader(
					new InputStreamReader(System.in) //target�� system.in �ؼ� Ű���忡 ����
			);
			
			//�ϱ⾲����� �б⸸
			Thread t1 = new Thread(new ReadThread());
			t1.start();
			
			
			
			//���ξ������ ���⸸ 
			while(true) {
				String keyBoardMsg = keyBoard.readLine(); //readLine() Ű���忣��Ű ������ ���� ���
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

