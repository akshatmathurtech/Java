package experiments;
import java.util.Scanner;

public class exp3 {
	public static void main(String[] args) {
		int a;
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter an Integer: ");
		a= scanner.nextInt();
		System.out.println("Your entered Integer is: "+a);
		scanner.close();
	}
}
