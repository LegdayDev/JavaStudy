package ex06;

public class ExampleText06 {

	public static void main(String[] args) {
		//2�� 100���̿� �ִ� ��� �Ҽ��� ã�� ���α׷��� �����
		
		
		for(int k=2;k<100;k++) {
			int checkSum = 0;
			for(int j=2;j<k;j++) {
				if(k%j==0) { //�Ҽ��� �ƴϴ�.
					checkSum++;
				}
			}
			if(checkSum == 0) {
				System.out.println(k+"�� �Ҽ��Դϴ�.");
			}
		}
		
		// 1����Ŭ k=2

		// 2����Ŭ k=3
		// k % 2 == 1 �Ҽ�

		// 3����Ŭ k=4
		// k % 2 == 0 �Ҽ��� �ƴ�
		// k % 3 == 1 �Ҽ�
		
		// 4����Ŭ k=5
		// k % 2 == 1
		// k % 3 == 2
		// k % 4 == 1
		
		// 2~6
		// k % 2 == 0 �Ҽ����ƴ�
		// k % 3 == 0 �Ҽ����ƴ�
		// k % 4 == 0 �Ҽ����ƴ�
		// k % 5 == 0 �Ҽ����ƴ�
		// k % 6 == 0 �Ҽ����ƴ�
	}

}
