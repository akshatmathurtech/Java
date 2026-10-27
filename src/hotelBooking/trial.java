package hotelBooking;

import java.util.ArrayList; 
import java.util.List;
import java.util.Scanner;

public class trial {
	public static List<Hotels> displayAllHotels() {
		Scanner sc= new Scanner(System.in);
		int n;
		System.out.println("Enter number of hotels");
		n= sc.nextInt();
		
		
//		Hotels h1= new Hotels(1,"Sarover","A",5000);
//		Hotels h2= new Hotels(2,"Siyaji","A",10000);
//		Hotels h3= new Hotels(3,"Bluewhale","A",7000);
		
		List<Hotels> list = new ArrayList<Hotels>();
		for (int i=1; i<=n; i++) {
			System.out.println("Enter name of hotel "+i+": ");
			String name=sc.next();
			System.out.println("Enter Roomtype of hotel "+i+": ");
			String type=sc.next();
			System.out.println("Enter price of hotel "+i+": ");
			float price= sc.nextFloat();			
			Hotels h= new Hotels(i, name, type, price);
			list.add(h);
		}																																				
//		list.add(h1);
//		list.add(h2);
//		list.add(h3);
		

		return list;	
	}
}
