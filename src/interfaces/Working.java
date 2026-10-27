package interfaces;

import java.util.Scanner;

//implement logic
interface Gmail{
	public void name();
	public void password();
	public void zipcode();
}

interface Info{
	abstract int id();
	String Address();
}


class UserMail implements Gmail, Info{
	Scanner scan = new Scanner(System.in);

	@Override
	public void name() {
		// TODO Auto-generated method stub
		String name=scan.next();
	}

	@Override
	public void password() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void zipcode() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int id() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String Address() {
		// TODO Auto-generated method stub
		return null;
	}
		
}

public class Working {
	public static void main(String[] args) {
		UserMail user= new UserMail();
		user.name();
		
	}

}
