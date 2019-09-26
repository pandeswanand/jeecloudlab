import java.util.Scanner;


interface Input{
	public boolean accept();
}
public class Validate13_3 {

	public static void main(String[] args) {
		
		String username = "Swanand";
		String password = "Swanand@mn24";
		Input data=()->{
			
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter your username: ");
			String name = scanner.next();
			System.out.println("Enter your password: ");
			String userPassword = scanner.next();
			
			if(name.equals(username))
				if(password.equals(userPassword)) {
					return true;
				}					
				else {
					return false;
				}
			else {
				return false;
			}
		};
		
		System.out.println(data.accept());

	}
}
