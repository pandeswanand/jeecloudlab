import java.util.Scanner;

public class Lab8_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any String");
		String data = scanner.nextLine();
		boolean flag = true;
		for(int i=1; i<data.length(); i++)
		{
			if((int)data.charAt(i)<(int)(data.charAt(i-1)))
			{
				flag = false;
				break;
			}
		}
		if(flag == true)
		{
			System.out.println("Positive String");
		}
		else
		{
			System.out.println("Not a Positive String");
		}
		scanner.close();
	}
}
