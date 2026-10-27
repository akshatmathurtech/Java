package constructor;
// 
//keywords -> static this final abstract


class construc{
		public static void show() {
			System.out.println("sys");
		}
	public construc(){
		System.out.println("called");	
		construc.show();
	}
}

public class testConst {
	public static void main(String[] args) {
		new construc();	
	}
}



//class construc{
//	public void construct(){
//		System.out.println("called");
//	}
//}
//public class testConst {
//	public static void main(String[] args) {
//		construc con= new construc();
//		con.construct();
//	}
//}