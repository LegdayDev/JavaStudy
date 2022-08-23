package sock.ex01;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class MyClientSocket {

	Socket socket;
	
	private void init() {
		
		try {
			socket = new Socket("localhost",10000); //ip林家,port林家
			//杰 ip林家 : 192.168.0.132
			BufferedWriter bw = new BufferedWriter(
					new OutputStreamWriter(socket.getOutputStream())
			);
			bw.write("Hello\n");
			bw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		MyClientSocket ms = new MyClientSocket();
		ms.init();
	}

}
