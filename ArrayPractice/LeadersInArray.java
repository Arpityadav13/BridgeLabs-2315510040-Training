package Arrays_Extra_Practice_Problems;

import java.util.Scanner;

public class LeadersInArray {
	public static void leader(int arr[] ){
		for(int i = 0 ; i < arr.length-1 ; i++) {
			for(int j = i+1 ; j<arr.length ; j++) {
				if(arr[i] < arr[j]) {
					break ;
				}
				else if(j == arr.length-1) {
					System.out.println(arr[i]);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,5,3,1,9,8};
		leader(arr);

	}
}
