package ex06;


public class ExampleTest01 {

	public static void main(String[] args) {

		int []arrayList= {30,20,10};
		
		//Cycle 2ȸ
		for(int i=0;i<2;i++) {
			if(arrayList[0]>arrayList[1]) {
				int temp = arrayList[0];
				arrayList[0]=arrayList[1];
				arrayList[1]=temp;
			}
			
			if(arrayList[1]>arrayList[2]) {
				int temp = arrayList[1];
				arrayList[1]=arrayList[2];
				arrayList[2]=temp;
			}
		}
		
		for(int i=0;i<3;i++) {
			System.out.println(arrayList[i] + " ");
		}
	}

}
