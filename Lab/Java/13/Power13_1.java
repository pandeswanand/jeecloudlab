import java.util.*;

interface Calculate
{
	public double power(double a,double b);
}

class Power13_1{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number");
		double x = scanner.nextInt();
		System.out.println("Enter Second number");
		double y = scanner.nextInt();
		
		Calculate z=(a, b)->Math.pow(a, b);
		System.out.println(z.power(x, y));
		scanner.close();
	}
}
