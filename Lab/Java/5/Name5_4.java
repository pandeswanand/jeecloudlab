import java.util.Scanner;

public class Name5_4 {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter First Name");
	String fname = scanner.next();
	System.out.println("Enter Last Name");
	String lname = scanner.next();
	try {
		if(fname.isEmpty() || lname.isEmpty()) {
			throw new NameException("Name cannot be empty!");
		}
		else
			System.out.println("The name entered is "fname+lname);
	}catch(NameException e) {
		System.out.println(e.getMessage());
	}
	
  }
}
