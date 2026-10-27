package multi_classes;
import java.util.Scanner;

class one {
	public static String first() {
		return "one called";
	}
}
class two {
	public static void second() {
		System.out.println("two called");
	}
}
public class multi {
	public static void main(String[] args) {
		int a;
		System.out.println("enter a:");
		Scanner scam= new Scanner(System.in);
		a=scam.nextInt();
		if (a==1) {
			//one on= new one();
			//on.first();
			System.out.println(one.first());
		}
		else if (a==2) {
			two.second();
		}
		else {
			System.out.println("enter 1 or 2");
			multi.main(args);
		}
		scam.close();
	}
}
