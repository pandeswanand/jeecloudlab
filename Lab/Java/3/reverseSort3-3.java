package com.cg.LabAssgn.q3;
import java.util.*;

public class reverseSort3_3 {

	public Integer[] getSorted(Integer[] arr, int length) {
		
		for(int i = 0; i<length; i++) {
			String str = arr[i].toString();
			StringBuilder strbldr= new StringBuilder(str);
			strbldr = strbldr.reverse();
			arr[i] = Integer.parseInt(strbldr.toString()) ;
		}
		
		for(int i = 0; i<length; i++) {
			for(int j = 0; j<length-1; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer arr[] = new Integer[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int size = sc.nextInt();
		System.out.println("Enter "+size+" elements");
		for(int i = 0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		reverseSort sort = new reverseSort();
		Integer result[] = sort.getSorted(arr, size);
		System.out.println("The resulting array is");
		for(int i=0; i<size;i++) {
			System.out.println(result[i]);
		}
		
	}

}
