package com.cg.LabAssgn.q5;
import java.util.*;

class trafficLight5_1{
	
	public static void main(String args[]) {
		int choice;
		do {
			System.out.println("Enter your choice");
			System.out.println("1 for Red");
			System.out.println("2 for Yellow");
			System.out.println("3 for Green");
			System.out.println("4 to exit");
			Scanner scanner = new Scanner(System.in);
			choice = scanner.nextInt();
			
			switch(choice) {
				case 1: System.out.println("Stop");
			            break;
			            
				case 2: System.out.println("Ready");
				        break;
				        
				case 3: System.out.println("Go");
				        break;
				        
				case 4: break;
				
				default: System.exit(0);
				         break;

			}			
		}while(choice != 4);
	}
}