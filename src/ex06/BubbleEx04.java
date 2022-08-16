package ex06;

public class BubbleEx04 {

	public static void main(String[] args) {

		int []arr = {5,4,3,2,1};
		System.out.println("<초기배열>");
		System.out.print("( ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println(") ");
		System.out.println("Bubble Sort Start");
		for(int i=1;i<arr.length;i++) {
			for(int j=0;j<arr.length-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[j]+ " ");
			}System.out.println();
			System.out.println(i+"번째 싸이클 종료");
		}
	   }//main()
}//class
