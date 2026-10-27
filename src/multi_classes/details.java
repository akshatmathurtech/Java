package multi_classes;

import java.util.Scanner;

class one111{
	public static int age(int a){
		return a;
	}
	public static String firstName(String b){
		return b;
	}
}
class two222{
	public static float fees(float a){
		return a;
	}
	public static char initial(char a){
		return a;
	}
}

public class details {
	//String a;
	public static void main(String[] args) {		
		Scanner scani = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age=scani.nextInt();
		
		System.out.println("Enter your name: ");
		String stri=scani.next();
		
		System.out.println("Enter your Initial letter: ");
		char i=scani.next().charAt(0);
				
		System.out.println("Enter your fees: ");
		float f =scani.nextFloat();
		
		
		System.out.println( one111.age(age));
		System.out.println(one111.firstName(stri));
		System.out.println(two222.fees(f));
		System.out.println(two222.initial(i));
		scani.close();
	}

}
