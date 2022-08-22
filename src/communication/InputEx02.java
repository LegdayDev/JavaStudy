package communication;

import java.io.InputStreamReader;

public class InputEx02 {

	public static void main(String[] args) {
	//array stream
	//가변적이지 못하기 때문에 불편
	// 데이터가 정적일때 쓰면 좋음
		char[] dataArr = new char[13];
		try {
			
			InputStreamReader ir = new InputStreamReader(System.in);
			ir.read(dataArr);
			for(int i=0;i<dataArr.length;i++) {
				System.out.print(dataArr[i]+" ");
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	
	}
	
}
