package ex06;

public class BubbleEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {50,5,4,10,30,8};
		
		for(int i=0; i<5; i++) {
	         if (arr[i] > arr[i+1]) {
	            int temp;
	            temp = arr[i];
	            arr[i] = arr[i+1];
	            arr[i+1] = temp;
	         }
	      }

	      for (int i = 0; i < arr.length; i++) {
	         System.out.println(arr[i]);
	      }
	      System.out.println("ù��° ����Ŭ ����====");

	      // �ι�° ����Ŭ
	      for(int i=0; i<4; i++) {
	         if (arr[i] > arr[i+1]) {
	            int temp;
	            temp = arr[i];
	            arr[i] = arr[i+1];
	            arr[i+1] = temp;
	         }
	      }
	      
	      for (int i = 0; i < arr.length; i++) {
	         System.out.println(arr[i]);
	      }
	      System.out.println("�ι�° ����Ŭ ����====");

	      // ����° ����Ŭ
	      for(int i=0; i<3; i++) {
	         if (arr[i] > arr[i+1]) {
	            int temp;
	            temp = arr[i];
	            arr[i] = arr[i+1];
	            arr[i+1] = temp;
	         }
	      }

	      for (int i = 0; i < arr.length; i++) {
	         System.out.println(arr[i]);
	      }
	      System.out.println("����° ����Ŭ ����====");

	      // �׹�° ����Ŭ
	      for(int i=0; i<2; i++) {
	         if (arr[i] > arr[i+1]) {
	            int temp;
	            temp = arr[i];
	            arr[i] = arr[i+1];
	            arr[i+1] = temp;
	         }
	      }

	      for (int i = 0; i < arr.length; i++) {
	         System.out.println(arr[i]);
	      }
	      System.out.println("�׹�° ����Ŭ ����====");
	      
	      
	      // �ټ���° ����Ŭ
	      for(int i=0; i<1; i++) {
	         if (arr[i] > arr[i+1]) {
	            int temp;
	            temp = arr[i];
	            arr[i] = arr[i+1];
	            arr[i+1] = temp;
	         }
	      }

	      for (int i = 0; i < arr.length; i++) {
	         System.out.println(arr[i]);
	      }
	      System.out.println("�ټ���° ����Ŭ ����====");
	   }


}//class
