package except;

public class TryEx03 {

	public static void divid(int n1, int n2) {
		try {
			System.out.println(n1/n2);
		} catch (RuntimeException e) {
			System.out.println("0�� ������ȵ�");
			
		}
	}
	public static void runCircle(int []n) {
		try {
			for(int i=0;i<5;i++) {
				System.out.println(n[i]);
			}
		} catch (RuntimeException e) {
			System.out.println("�迭������ ����");
		}
		
	}
	public static void main(String[] args) {
		//divid(5,0);
		int []n = {1,2,3,4};
		runCircle(n);
	}

}
