package multi_classes;
import java.util.Scanner;
import conditions.odd_even;

public class callingDIFFclasses {
	public static void main(String[] args) {
		System.out.println("enter number: ");
		Scanner ac=new Scanner(System.in);
		int d;
		d= ac.nextInt();
		if (d==1) {
			odd_even.main(args);
		}
		else if(d==2) {
			multi.main(args);
		}
		else {
			System.out.println("select proper from 1 or 2");
			callingDIFFclasses.main(args);	
		}
		ac.close();
	}
}
