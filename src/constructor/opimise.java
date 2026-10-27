package constructor;

class consta{
	public static void showy() {
		System.out.println("sys");
	}
	public consta(){
		System.out.println("called");	
	}
} 

public class opimise {
	public static void main(String[] args) {
		new consta();
		consta.showy();	
		
	}
}
