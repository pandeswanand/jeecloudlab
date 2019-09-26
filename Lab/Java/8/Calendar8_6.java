import java.util.Scanner;
import java.util.Calendar;

public class Calendar8_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Calendar calendar = Calendar.getInstance();
		System.out.println("Enter date in format DD-MM-YYYY");
		String date = scanner.next();
		String[] arr = date.split("\\-");
		if((Integer.parseInt(arr[2])-(calendar.get(Calendar.YEAR)))>0)
		{
			System.out.println("Invalid Date");
		}
		else
		{
			System.out.println("Days: "+((calendar.get(Calendar.DATE))-Integer.parseInt(arr[0])));
			System.out.println("Months: "+(Integer.parseInt(arr[1])-(calendar.get(Calendar.MONTH)+1)));
			System.out.println("Year: "+((calendar.get(Calendar.YEAR))-Integer.parseInt(arr[2])));	
		}	
		scanner.close();
	}
}
