package ex06;

public class BubbleEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {5,4,10,30,8};
		
		System.out.println("<Array>");
		System.out.println(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]);
		//버블정렬(BubbleSort)
		int cycle=0;
		while(true) {
			int count=0;
			if(arr[0]>arr[1]) {
				int temp=arr[0];
				arr[0]=arr[1];
				arr[1]=temp;
				count++;
			}
			if(arr[1]>arr[2]) {
				int temp=arr[1];
				arr[1]=arr[2];
				arr[2]=temp;
				count++;
			}
			if(arr[2]>arr[3]) {
				int temp=arr[2];
				arr[2]=arr[3];
				arr[3]=temp;
				count++;
			}
			if(arr[3]>arr[4]) {
				int temp=arr[3];
				arr[3]=arr[4];
				arr[4]=temp;
				count++;
			}
			
			if(count==0) break;
			cycle++;
		}
		System.out.println("sort finish(cycle : "+cycle+") : "+ arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]);
		
//		if(arr[0]>arr[1]) {
//			int temp=arr[0];
//			arr[0]=arr[1];
//			arr[1]=temp;
//		}
//		if(arr[1]>arr[2]) {
//			int temp=arr[1];
//			arr[1]=arr[2];
//			arr[2]=temp;
//		}
//		if(arr[2]>arr[3]) {
//			int temp=arr[2];
//			arr[2]=arr[3];
//			arr[3]=temp;
//		}
//		if(arr[3]>arr[4]) {
//			int temp=arr[3];
//			arr[3]=arr[4];
//			arr[4]=temp;
//		}
//		System.out.println("1 cycle : "+ arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]);
//		if(arr[0]>arr[1]) {
//			int temp=arr[0];
//			arr[0]=arr[1];
//			arr[1]=temp;
//		}
//		if(arr[1]>arr[2]) {
//			int temp=arr[1];
//			arr[1]=arr[2];
//			arr[2]=temp;
//		}
//		if(arr[2]>arr[3]) {
//			int temp=arr[2];
//			arr[2]=arr[3];
//			arr[3]=temp;
//		}
//		if(arr[3]>arr[4]) {
//			int temp=arr[3];
//			arr[3]=arr[4];
//			arr[4]=temp;
//		}
//		System.out.println("2 cycle : "+ arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]);
//		if(arr[0]>arr[1]) {
//			int temp=arr[0];
//			arr[0]=arr[1];
//			arr[1]=temp;
//		}
//		if(arr[1]>arr[2]) {
//			int temp=arr[1];
//			arr[1]=arr[2];
//			arr[2]=temp;
//		}
//		if(arr[2]>arr[3]) {
//			int temp=arr[2];
//			arr[2]=arr[3];
//			arr[3]=temp;
//		}
//		if(arr[3]>arr[4]) {
//			int temp=arr[3];
//			arr[3]=arr[4];
//			arr[4]=temp;
//		}
//		System.out.println("3 cycle : "+ arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]);
	}

}
