package ex06;

public class ExampleTest03 {
	
	static double 표준체중계산(int height) {
		double standardWeight = (height-100)*0.9;
		
		return standardWeight;
	}
	static void 체중비교및출력(double standardWeight, double weight) {
		if(standardWeight>weight) {	System.out.println("과제충");}
		else if(standardWeight<weight) {System.out.println("저체중");}
		else {System.out.println("표준체중");}
	}

	
	public static void main(String[] args) {
		
		int height = 180;
		double weight = 70;
		//표준 체중을 계산하 후
		double standardWeight = 표준체중계산(height);
		//자신의 체중과 비교해서 저체중,표중체중,과체중인지 판단하는 프로그램
		체중비교및출력(standardWeight,weight);
		
	}

}
