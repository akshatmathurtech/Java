package menuDrive;

import java.util.Scanner;

import exception_handling.test;

public class menuDriven {
	public static void main(String[] args) {
		System.out.println("enter 1 for exception");
		System.out.println("enter 2 for thread");
		System.out.println("enter 3 for Exit");
		Scanner sc= new Scanner(System.in);
		int a= sc.nextInt();
		if (a==1) {
			try {
				System.out.println("Enter your numbers: ");
				int c= sc.nextInt();
				int b= sc.nextInt();
				System.out.println(c/b);
			}
			catch (Exception abc) {
				System.out.println("hi");
				menuDriven.main(args);   //Recall
			}
		}
	}

}
