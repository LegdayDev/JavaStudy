package ex06;

public class Gugudan {
	//구구단!
	public static void main(String[] args) {
		System.out.println("=======구구단 프로그램========");
		
		for(int i=1;i<=9;i++) {
			System.out.println("<"+i+"단 시작>");
			for(int j=1;j<=9;j++) {
				System.out.println(i + " * " +j +" = " +(i*j));
			}
			System.out.println();
		}

		
	}
}
