package constructor;

class construct{
	class hlo{
		public void show() {
			System.out.println("func call in func");
		}
	}
	public construct(){
		System.out.println("called");	
		hlo hi=new hlo();
		hi.show();
	}
}

public class nested {
	public static void main(String[] args) {
		new construct();	
	}
}
