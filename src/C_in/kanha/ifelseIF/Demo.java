package C_in.kanha.ifelseIF;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a and b");
	    int a = s.nextInt();
	    int b = s.nextInt();
		
		if(a<b) {
			System.out.println(b +" is big....");
		}
		else if(a == b) {
			System.out.println(a+" and "+ b +" is same...");
		}
		else if(a > b) {
			System.out.println(a+" is big....");
		}
		else {
			System.out.println("Invalide number");
		}
	}
}
