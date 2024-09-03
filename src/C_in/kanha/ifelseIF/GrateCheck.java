package C_in.kanha.ifelseIF;

import java.util.Scanner;

public class GrateCheck {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter your mark  : ");
	    int a = s.nextInt();
	    
	    if(a<=100 && a>=80)
	    {
	    	System.out.println(a+" belongs to" + "'A'" + "grade..");
	    }
	    else if(a>=70 && a<=79) {
	    	System.out.println(a+" belongs to" + "'B'" + "grade..");
	    }
	    else if(a>=60 && a<=69) {
	    	System.out.println(a+" belongs to" + "'C'" + "grade..");
	    }
	    else if(a>=50 && a<=59) {
	    	System.out.println(a+" belongs to" + "'D'" + "grade..");
	    }
	    else {
	    	System.out.println("Fail.. Best of luck :(");
	    }
	    
	}

}
