package loops;

import java.util.Scanner;

class value{
	public int SoD(int num) {
		int sum=0;
		for ( ;num>0;) {
			sum=sum+num%10;
			num=num/10;
		}
		return sum;
	}
}
public class sumOFdigits {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a=scanner.nextInt();
		value val= new value();
		System.out.println(val.SoD(a));
		scanner.close();
	}
}
