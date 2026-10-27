package experiments;
import java.util.Scanner;

public class exp4 {
	public static void main(String[] args) {
		String name;
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter your text: ");
		name= scanner.nextLine();
		System.out.println("Your entered text is: "+name);
		scanner.close();
	}
}
