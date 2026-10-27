package conditions;

import java.util.Scanner;

public class odd_even {
	public static void main(String[] args) {
		System.out.println("enter number: ");
		Scanner a=new Scanner(System.in);
		int b;
		b= a.nextInt();
		
		if(b==0) {
			System.out.println("nither odd nor even");
		}
		else if(b<0) {
			System.out.println("negative number");
		}
		else if(b%2==0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
		a.close();
	}
}
