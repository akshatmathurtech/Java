package experiments;
import java.util.Scanner;
class S1{
	public void s(){
		String name;
		int age;
		Scanner scanner =new Scanner(System.in);
		System.err.print("Enter your Name: ");
		name= scanner.next().toString();
		System.out.print("Enter your Age: ");
		age=scanner.nextInt();
		System.out.println("Name is: "+name);
		System.out.println("Age is: "+age);
		scanner.close();
	}
}
public class exp5 {
	public static void main(String[] args) {
		S1 a= new S1();
		a.s();
	}
}
