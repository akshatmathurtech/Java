package loops;

import java.util.Scanner;

class reversing{
	public int reverse(int num) {
		int sum=0;
		for ( ;num!=0;) {
			int rem=num%10;
			if(rem==0) {
				for( rem=0; rem!=0;) {
					System.out.print(0);
				}
				sum= sum*10+ num%10;
				num=num/10;
			}
			else {
			sum= sum*10+ num%10;
			num=num/10;
			}
		}
		return sum;     
	}
}
public class reversenum {
	public static void main(String[] args) {

		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a=scanner.nextInt();
		
		reversing rev= new reversing();
		System.out.println(rev.reverse(a));
		scanner.close();
	}
}
