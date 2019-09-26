import java.util.StringTokenizer;
import java.util.Scanner;

public class Token8_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string of numbers separated by space");
		String line = scanner.nextLine();
		int sum=0;
		StringTokenizer stringTokenizer = new StringTokenizer(line);
		while(stringTokenizer.hasMoreTokens())
		{
			int number = Integer.parseInt(stringTokenizer.nextToken());
			System.out.println(number);
			sum = sum + number;
		}
		System.out.println("The Sum is = "+sum);
		scanner.close();
	}
}
