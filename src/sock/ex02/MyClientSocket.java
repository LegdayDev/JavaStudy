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
			socket = new Socket("localhost",10000); //ip�ּ�,port�ּ�
			//�� ip�ּ� : 192.168.0.132
			BufferedWriter bw = new BufferedWriter(
					new OutputStreamWriter(socket.getOutputStream())
			); //BufferedWriter ������ ����
			BufferedReader br = new BufferedReader(
					new InputStreamReader(System.in)
			); //BufferedReader Ű���忡 ����
			while(true) {
				String keyBoardMsg = br.readLine(); //readLine() Ű���忣��Ű ������ ���� ���
				
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
