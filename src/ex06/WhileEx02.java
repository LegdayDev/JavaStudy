package ex06;

public class WhileEx02 {

	public static void main(String[] args) {
		int num = 1;
		while(true) {
			System.out.println("현재 num의 값은 "+num);
			if(num==10) break;
			num++;
		}
	}

}
