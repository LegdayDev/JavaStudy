package ex06;

public class ExampleText06 {

	public static void main(String[] args) {
		//2와 100사이에 있는 모든 소수를 찾는 프로그램을 만들기
		
		
		for(int k=2;k<100;k++) {
			int checkSum = 0;
			for(int j=2;j<k;j++) {
				if(k%j==0) { //소수가 아니다.
					checkSum++;
				}
			}
			if(checkSum == 0) {
				System.out.println(k+"는 소수입니다.");
			}
		}
		
		// 1사이클 k=2

		// 2사이클 k=3
		// k % 2 == 1 소수

		// 3사이클 k=4
		// k % 2 == 0 소수가 아님
		// k % 3 == 1 소수
		
		// 4사이클 k=5
		// k % 2 == 1
		// k % 3 == 2
		// k % 4 == 1
		
		// 2~6
		// k % 2 == 0 소수가아님
		// k % 3 == 0 소수가아님
		// k % 4 == 0 소수가아님
		// k % 5 == 0 소수가아님
		// k % 6 == 0 소수가아님
	}

}
