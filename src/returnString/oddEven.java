package returnString;

import java.util.Scanner;

class imp{
	public static String check(int a) {
		if(a%2==0) {
			return "Even";
		}
		else {
			return "Odd";
		}
	}
}
public class oddEven {
	public static void main(String[] args) {
		System.out.println("Enter a number to check: ");
		Scanner sca= new Scanner(System.in);
		int a= sca.nextInt();
		System.out.println(imp.check(a));
		sca.close();
	}

}
