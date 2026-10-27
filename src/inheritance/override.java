package inheritance;
class akshat {
	public akshat() {
		System.out.println("HI from constructor");
	}
	public void show() {
		System.out.println("hi from ak show");
	}
}
class ishat extends akshat{
	public void show2() {
		System.out.println("hi from ishat show");
	}
}
public class override {
	public static void main(String[] args) {
		//new akshat();
		akshat a=new ishat();
		a.show();   //override bcoz same method name
		ishat b= new akshat();
		b.show();
	}
}
