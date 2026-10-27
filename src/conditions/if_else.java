package conditions;

import java.util.Scanner;

public class if_else {
	public static void main(String[] args) {
		int a;
		Scanner scaning= new Scanner(System.in);
		a= scaning.nextInt();
		if(a>=10) {
			System.out.println(a+" is grater than 10");
		}
		else {
			System.out.println(a+" is less than 10");
		}
		scaning.close();
	}
}
