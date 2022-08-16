package ex06;

import java.util.Scanner;

public class Test02 {
	static Scanner sc = new Scanner(System.in);

	static void p1() {
		
		int ArrayList[] = new int[3];
		for(int i=0;i<ArrayList.length;i++) {
			ArrayList[i]=sc.nextInt();
		}
		//sort() �޼��带 �̿��� �������� ����
		/*
		Arrays.sort(ArrayList);
		
		for(int i=0;i<ArrayList.length;i++) {
			System.out.print(ArrayList[i] + " ");
		}
		*/
		
		//Bubble Sort()�� �̿��� �������� ����
		
		for(int i=1;i<ArrayList.length;i++) {
			for(int j=0;j<ArrayList.length-i;j++) {
				if(ArrayList[j]>ArrayList[j+1]) {
					int temp= ArrayList[j];
					ArrayList[j]=ArrayList[j+1];
					ArrayList[j+1]=temp;
				}
			}
		}
		for(int i=0;i<ArrayList.length;i++) {
			System.out.print(ArrayList[i] + " ");
		}
		
	}
	static void p2() {
		String inputChar = sc.next();
		inputChar = inputChar.toUpperCase(); // ��� �빮�ڷ� ��ȯ
		
		switch (inputChar.charAt(0)) {
		case 'A':
			System.out.println("����");
			break;
		case 'E':
			System.out.println("����");
			break;
		case 'I':
			System.out.println("����");
			break;
		case 'O':
			System.out.println("����");
			break;
		case 'U':
			System.out.println("����");
			break;
		default:
			System.out.println("����");
			break;
		}
	}
	static void p3() {
		System.out.print("Ű�� �Է��Ͻÿ� : ");
		double userHei = sc.nextDouble();
		System.out.print("�����Ը� �Է��Ͻÿ� : ");
		double userWei = sc.nextDouble();
		double basicWei = (userHei - 100) * 0.9;

		if (userWei > basicWei)
			System.out.println("��ü���Դϴ�");
		else if (userWei < basicWei)
			System.out.println("��ü���Դϴ�");
		else
			System.out.println("ǥ��ü���Դϴ�.");
	}
	static void p4() {
		System.out.print("���� 3���� �Է��Ͻÿ� : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if(a<=b) {
			if(b<=c) {
				System.out.println("�ּҰ� : "+a);
			}
			else if(b>=c) {
				if(a>=c) {
					System.out.println("�ּҰ� : "+c);
				}
				else {
					System.out.println("�ּҰ� : "+a);;
				}
			}
		}
		else if(a>=b) {
			if(b>=c) {
				System.out.println("�ּҰ� : "+c);
			}
			else if(b<=c) {
				if(a>=c) {
					System.out.println("�ּҰ� : "+b);
				}
				else {
					System.out.println("�ּҰ� : "+b);
				}
			}
		}

	}
	static void p5() {
		System.out.print("x���� �Է��Ͻÿ� : ");
		int userNum=sc.nextInt();
		
		if(userNum>0) {
			userNum*=7;
			userNum+=2;
		}
		else {
			userNum=userNum*userNum*userNum;
			userNum*=(-9);
			userNum+=2;
		}
		System.out.println("x���� : "+userNum);
	}
	static void p6() {
		for(int num=2;num<=100;num++) {
			int count=0;
			for(int i=2;i<num;i++) {
				if(num%i==0) count++;
			}
			if(count==0)	System.out.println(num);
		}
	}
	static void p7() {

		for(int a=1;a<100;a++) {
			for(int b=1;b<100;b++) {
				for(int c=1;c<100;c++) {
					if(((a*a)+(b*b))==(c*c)) { 
						System.out.println("a : "+a+", b: "+b+", c: "+c);
					}
				}
			}
		}
	}
	static void p8() {
		for(int i=1;i<10;i++) {
			for(int j=1;j<10;j++) {
				System.out.print((i*j)+"\t");
			}
			System.out.println();
		}
	}
	static void p9() {
		System.out.print("�����ڸ� �Է��Ͻÿ�(+,-,*,/) : ");
		String operator = sc.next(); //������ �����Է�!
		System.out.print("�� ������ �Է��Ͻÿ� : ");
		int operandA = sc.nextInt();
		int operandB = sc.nextInt();
		
		if(operator.charAt(0)=='+') {
			System.out.println(operandA+" + "+operandB + " = "+ (operandA+operandB));
		}
		else if(operator.charAt(0)=='-') {
			System.out.println(operandA+" - "+operandB + " = "+ (operandA-operandB));
		}
		else if(operator.charAt(0)=='*') {
			System.out.println(operandA+" * "+operandB + " = "+ (operandA*operandB));
		}
		else if(operator.charAt(0)=='/') {
			if(operandA==0 || operandB==0)	System.out.println("�ǿ����ڸ� �ٽ� �Է��Ͻÿ�");
			else System.out.println(operandA+" % "+operandB + " = "+ (operandA/(double)operandB));
		}
		else {
			System.out.println("�����ڸ� �ٽ� �Է��Ͻÿ�.");
		}

	}
	static void p10() {
		System.out.print("�� ��° �ױ��� ����ϰڽ��ϱ�? ");
		int fiboLen = sc.nextInt();
		int a=0;
		int b=1;
		int c;
		System.out.print(a+" "+b+" ");
		for(int i=2;i<fiboLen;i++) {
			c=a+b;
			System.out.print(c+ " ");
			a=b;
			b=c;
		}
	}
	public static void main(String[] args) {

//		p1();
//		p2();
//		p3();
//		p4();
//		p5();
//		p6();
//		p7();
//		p8();
//		p9();
//		p10();
		sc.close();
	}

}
