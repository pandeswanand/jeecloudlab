package com.cg.LabAssgn.q3;
import java.util.*;

public class sortString3_2 {

	public String[] sort(String str[],int length) {
		
		int i, j;
		//int length = str.length;
		//System.out.println(str);
		String temp;
		for(i = 0; i<length; i++) {
			for(j=0; j<length-1; j++) {
				if(str[j].charAt(0)>str[j+1].charAt(0)) {
					temp = str[j];
					str[j+1] = str[j];
					str[j] = temp;
				}
			}
		}
		//System.out.println(str);
		if(length%2==0) {
			for(i=0; i<length/2; i++) {
				str[i] = str[i].toUpperCase();
			}
			for(i=length/2; i<length; i++) {
				str[i] = str[i].toLowerCase();
			}
		}
		if(length%2!=0) {
			for(i=0; i<=length/2; i++) {
				str[i] = str[i].toUpperCase();
			}
			for(i=(length/2)+1; i<length; i++) {
				str[i] = str[i].toLowerCase();
			}
		}
		//System.out.println(str);
		return str;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length = 0;
		String str[] = new String[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		System.out.println("Enter "+size+" strings");
		for(int i = 0; i<size; i++) {
			str[i] = sc.next();
			//System.out.println(str[i]);
			length = length + 1;
		}
		//sc.nextLine();
		//System.out.println(length);
		//System.out.println(Arrays.toString(str));
		sortString obj = new sortString();
		String arr[] = obj.sort(str,length);
		System.out.println("The strings in sorted order are");
		for(int i=0; i<length; i++) {
			System.out.println(arr[i]);
		}
	}

}
