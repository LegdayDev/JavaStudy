package ex07;

class myCal{
	//static void plus() {System.out.println("plus �޼��尡 ȣ��Ǿ����ϴ�.");}  2�����
	
	int a;	// myCal�� a������ heap�� ����Ǳ� ������ ������ �ȳ���. 
			//calMinus�� �ִ� a������ �޼��尡 ���� �ÿ� stack�� ����Ǿ ����ȴ� 
	int b;
				 
	void calPlus() {System.out.println("calPlus �޼��尡 ȣ��Ǿ����ϴ�.");} //1�� ���
	void calMinus(int a, int b) {System.out.println(a+" - "+b+" = "+(a-b));} //a,b ������ �������� �̱� ������ stack�� �����Ѵ�
	//void calMinus() {System.out.println(a+" - "+b+" = "+(a-b)); //�� �Լ��� �����ϸ� a,b ������ heap������ �������� ��� �����ȴٴ� �����̴�.
	
	int calMinus2(int a, int b) { //�Լ� Ÿ�԰� ��ȯŸ���� �����ϰ� 
		return a-b;
	}
	double calMulti(int a, int b) {
		return a*b;
	}
	double calDivi(int a, int b) {
		return a/(double)b;
	}
}

public class MethEx01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myCal m = new myCal(); 
		//m.calPlus();	//1����� heap������ m�̶�� �ּ��� ��ü�� �����Ͽ� ȣ���ϴ¹��
						//�ѹ� ���� ���� ���̶�� 1������� �´�.
		
		//myCal.plus();	//2����� plus()�޼��忡 static�� ���� ȣ���ϴ� ���
						//static�� ��ΰ� ������ �� ������ ���°� ����.
		
		//m.calMinus(30,20);
		//int res=m.calMinus2(5, 10); //return���� res���� ����. �̶��� returnŸ�԰� �����ϴ� ������ Ÿ���� �����ϰ� �����.
		//System.out.println(res);
		
		double myMul=m.calMulti(10, 30);
		double myDiv=m.calDivi(10, 30);
		
		System.out.println("10 * 30 = "+myMul);
		System.out.println("10 / 30 = "+String.format("%.3f", myDiv));
	}
}
