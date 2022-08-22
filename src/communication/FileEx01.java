package communication;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;


public class FileEx01 {

	public static void main(String[] args) {

		File file = new File("src/communication/tsetFile.txt"); //����η� ���ϻ���
		try {
			// ./������
			// ../�ٷ� ������
			// / �ֻ�������
			FileWriter fw = new FileWriter(file,true); //2��° ���� true�� ���� �������Ҷ� �̾��.(defalut ���� false ������)
			BufferedWriter bw = new BufferedWriter(fw); //BufferedWriter�� �̿��� ����,���� ����

			bw.write("����"); //"����"�Է�
			bw.newLine(); //����Ű
			bw.flush(); //���ۿ��ִ� ������ ���о ���۸� ����д�.
			
			
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
