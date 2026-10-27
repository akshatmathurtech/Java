package vege_app;

import java.util.Scanner;

public class vegi {
	public static void main(String[] args) {
		String vegetables[]= new String[550];
		vegetables[0]="Id:1   Tomato";
		vegetables[1]="Id:2   Potato";
		vegetables[2]="Id:3   Apple";
		vegetables[3]="Id:4   Banana";
		for (int i=0;i<4;i++) {
			System.out.println(vegetables[i] );
		}
		int bill=0;
		Scanner sc=new Scanner(System.in);
		int t=8, p=5, a=10, b=8;
		
		while (true) {
			System.out.println("Do you want to continue y/n:");
			String ch=sc.next();
			if (ch.equalsIgnoreCase("y")) {
				System.out.println("Select a vegetable Id: ");
				int v=sc.nextInt();
				if (v==1) {
					System.out.println("Tomato 60rs/kg  Availability: "+t+" kg");
					System.out.println("Enter the qty you want to buy:");
					int to= sc.nextInt();
					t=t-to;
					bill=bill+to*60;
				}
				if (v==2) {
					System.out.println("Potato 40rs/kg  Availability: "+p+" kg");
					System.out.println("Enter the qty you want to buy:");
					int po= sc.nextInt();
					p=p-po;
					bill=bill+po*40;
				}
				if (v==3) {
					System.out.println("Apple 150rs/kg  Availability: "+a+" kg");
					System.out.println("Enter the qty you want to buy:");
					int ap= sc.nextInt();
					a=a-ap;
					bill=bill+ap*150;
				}
				if (v==4) {
					System.out.println("Banana 50rs/kg  Availability: "+b+" kg");
					System.out.println("Enter the qty you want to buy:");
					int ba= sc.nextInt();
					b=b-ba;
					bill=bill+ba*50;
				}
				
			}
			else {
				break;
			}
		}
				
		System.out.println("Your total bill is: "+ bill+"Rs.");	
	}
}
