package ex06;

public class ExampleTest03 {
	
	static double ǥ��ü�߰��(int height) {
		double standardWeight = (height-100)*0.9;
		
		return standardWeight;
	}
	static void ü�ߺ񱳹����(double standardWeight, double weight) {
		if(standardWeight>weight) {	System.out.println("������");}
		else if(standardWeight<weight) {System.out.println("��ü��");}
		else {System.out.println("ǥ��ü��");}
	}

	
	public static void main(String[] args) {
		
		int height = 180;
		double weight = 70;
		//ǥ�� ü���� ����� ��
		double standardWeight = ǥ��ü�߰��(height);
		//�ڽ��� ü�߰� ���ؼ� ��ü��,ǥ��ü��,��ü������ �Ǵ��ϴ� ���α׷�
		ü�ߺ񱳹����(standardWeight,weight);
		
	}

}
