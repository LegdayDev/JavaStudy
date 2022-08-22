package communication;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;


public class FileEx01 {

	public static void main(String[] args) {

		File file = new File("src/communication/tsetFile.txt"); //상대경로로 파일생성
		try {
			// ./현재경로
			// ../바로 위폴더
			// / 최상위폴더
			FileWriter fw = new FileWriter(file,true); //2번째 값이 true면 새로 컴파일할때 이어쓴다.(defalut 값은 false 덮어쓰기다)
			BufferedWriter bw = new BufferedWriter(fw); //BufferedWriter를 이용해 쓰고,읽을 예정

			bw.write("ㅎㅇ"); //"ㅎㅇ"입력
			bw.newLine(); //엔터키
			bw.flush(); //버퍼에있는 내용을 다읽어서 버퍼를 비워둔다.
			
			
			FileReader fr = new FileReader(file); //
			BufferedReader br = new BufferedReader(fr);
			String str = new String();
			
			while((str=br.readLine())!=null) {
				System.out.println(str);
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
