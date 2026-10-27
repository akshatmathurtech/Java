package multi_classes;

import java.util.Scanner;

class one1{
	public static int multi(int a){
		int b=10;
		return a*b;
	}
	public static String first(){
		return "Hello";
	}
}
class two2{
	public static float multip(float a){
		float b=2.5f;
		return a*b;
	}
	public static char charact(char a){
		return a;
	}
}

public class Classes3 {
	public static void main(String[] args) {		
		System.out.println( one1.multi(5));
		System.out.println(one1.first());
		System.out.println("enter a float number");
		Scanner scani = new Scanner(System.in);
		float b=scani.nextFloat();
		System.out.println(two2.multip(b));
		System.out.println(two2.charact('a'));
		scani.close();
	}
}
