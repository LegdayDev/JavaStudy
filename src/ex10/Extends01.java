package ex10;

class ������{
	int armCount = 2;
	int legCount = 2;
	public void hello() {;
		System.out.println("hello()������");
	}
}

class �ƽþ��� extends ������{ 
	String hairColor = "����";
	public void hello() {;
		System.out.println("hello()�ƽþ���");
	}
}

class �ѱ��� extends �ƽþ���{
	String faceColor = "Ȳ��";
	public void hello() {;
		System.out.println("hello()�ѱ���");
	}
}
public class Extends01 {

	public static void main(String[] args) {
		
		������ a = new �ƽþ���();
		
		a.hello();
		System.out.println(a.armCount);
		//�ѱ��� h1 = new �ѱ���();
		
//		System.out.println(h1.faceColor);
//		System.out.println(h1.hairColor);
//		System.out.println(h1.armCount);
//		System.out.println(h1.legCount);
		
		//�ѱ��� h2 = h1; //������ �ƴ� a2�� a������ ����Ų��(reference type)
		/*
		System.out.println("�ٲٱ� �� : "+a.faceColor);
		a2.faceColor="Ȳ�ݻ�";
		System.out.println(a.faceColor);
		System.out.println(a2.faceColor);//���� �ּҸ� �����ϱ� ������ a2���� �ٲ㵵 a1�� �ٲ��.
		*/
		
		//�ƽþ��� a1 = h2;
		//������ han1 = new �ѱ���(); //������Ŭ������ �����ؼ� �ѱ���Ŭ������ ��ӹް� �������ִ°� �پ���.
		//�ѱ��� han2 = new �ƽþ���(); //�ƽþ���Ŭ������ heap�� �����߱� ������ ������,�ƽþ��� ��ü�ۿ� ������.
	
		
		
		
	}
}
