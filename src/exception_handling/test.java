package exception_handling;
//try cant happen without catch(handles exception) or finally(always executed)


import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		int a,b;
		Scanner s =new Scanner(System.in);
		try {
			System.out.println("Enter your numbers: ");
			a= s.nextInt();
			b= s.nextInt();
			System.out.println(a/b);
		}
		catch (Exception abc) {
			
			test.main(args);   //Recall
		}
		finally {
			System.out.println("Always Executed ");
		}
		
	}

}
