package D_in.kanha.nestedif;

public class LogedinForm {

	public static void main(String[] args) {
		
		String username = "kanha";
		int pass = 123;
		
		if(username == "kanha") {
			
			if(pass == 123) {
				
				System.out.println("Logged In Successfull....");
			}
			else {
				System.out.println("incorrect password....");
			}
		}
		else {
			System.out.println("incorect username....");
		}
		
	}
}
