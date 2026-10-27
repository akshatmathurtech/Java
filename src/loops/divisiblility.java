package loops;

import java.util.Scanner;

public class divisiblility {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Starting number of range:");
		int a= scanner.nextInt();
		System.out.println("Ending number of range:");
	    int b= scanner.nextInt();
	    int count2=0;
	    int count3=0;
	    int count5=0;
	    for(int i=a; i<=b; i++) {
	    	if(i%2==0) {
	    		count2+=1;
	    	}
	    	if(i%3==0) {
	    		count3+=1;
	    	}
	    if(i%5==0) {
	    		count5+=1;
	    	}
	    }
//	    int t=0,th=0,f=0;
//	    for(int i=a; i<=b; i++) {
//	    	if(i%2==0) {
//	    		t=i;
//	    		System.out.print(t+" ");
//	    	}
//	    	if(i%3==0) {
//	    		th=i;
//	    		System.out.print(th+" ");
//	    	}
//	    	if(i%5==0) {
//	    		f=i;
//	    		//System.out.print(f+" ");
//	    	}
//	    }
//	    System.out.println();
//	    System.out.println("count for divi by 2: "+count2);	    
//	    System.out.println("count for divi by 3: "+count3);
//	    System.out.println("count for divi by 5: "+count5);
	    
	    System.out.println();
	    System.out.println("count for divi by 2: "+count2);
	    for(int i=a;i<=b;i++) {
	    	if(i%2==0) {
	    		System.out.print(i+" ");
	    	}
	    }	    
	    System.out.println();
	    System.out.println("count for divi by 3: "+count3);
	    for(int i=a;i<=b;i++) {
	    	if(i%3==0) {
	    		System.out.print(i+" ");
	    	}
	    }	    
	    System.out.println();
	    System.out.println("count for divi by 5: "+count5);
	    for(int i=a;i<=b;i++) {
	    	if(i%5==0) {
	    		System.out.print(i+" ");
	    	}
	    }
	    scanner.close();
	}
}
