package ex22;

import java.util.ArrayList;
import java.util.Scanner;

public class GenericEx02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		ArrayList<Integer> arr1 = new ArrayList<>();
		
//		for(int i=0;i<10;i++) {
//			arr1.add(i+1);
//		}
//		for(int i=0;i<10;i++) {
//			System.out.print(arr1.get(i)+ " ");
//		}
//		
		ArrayList<String> arr2 = new ArrayList<>();
		for(int i=0;i<5;i++) {
			arr2.add(sc.next());
			
		}
		for(int i=0;i<5;i++) {
			System.out.print(arr2.get(i)+ " ");
		}
	}

}
