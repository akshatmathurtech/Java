package JAVA;

import java.util.Scanner;

public class scanf {
	public static void main(String[] args)
	{
		Scanner a = new Scanner(System.in);
		System.out.println("Enter");
		int x=a.nextInt();
		System.out.print(x);
		a.close();
	}
}
