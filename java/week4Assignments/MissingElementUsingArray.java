package week4Assignments;

import java.util.Collections;

public class MissingElementUsingArray {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 10, 6, 8};
		//sorting the element
		for(int i=0; i<arr.length - 1; i++) {
			if(arr[i] > arr[i+1]) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1]=temp;
			}
		}
		
//		for(int value: arr) {
//			System.out.println(value);
//		}
		
		for(int i=0;i<arr.length - 1;i++) {
			int gap = arr[i+1] - arr[i] ;
			
			for(int j=1;j<gap;j++) {
				System.out.println(arr[i] + j);
			}
			
//			if(lastValue != arr[i+1]) {
//				
//				System.out.println(arr[i]);
//			}
		}
	}
}