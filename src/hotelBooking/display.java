package hotelBooking;

import java.util.List; 
import java.util.Scanner;

public class display {
	public static void main(String[] args) {
		List<Hotels> listnew = trial.displayAllHotels();
		for (Hotels x:listnew) {
			System.out.println(x.getId()+" "+ x.getName()+" "+ x.getRoomType()+" "+ x.getPrice() );
		}
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Select hotel by name:");
		String a= scan.next();
		System.out.println("For how many days: ");
		int days= scan.nextInt();
		float bill= 0.0f;
		for (Hotels y:listnew) {
			if (a.equals(y.getName())) {
				bill= days*y.getPrice();
			}
		}
		System.out.println(bill);		
		
	}

}
