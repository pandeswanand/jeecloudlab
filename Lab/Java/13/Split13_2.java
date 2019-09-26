import java.util.*;

interface Split
{
		public void data(String str);
}

public class Split13_2 {

	public static void main(String[] args) {
			
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter the Input:");
			String input = scanner.next();
			
			Split name=(str)->{
				String[] temp = str.split("");
				String result = "";
				String space = " ";
				for(int i=0; i<temp.length;i++) {
					result = result + temp[i] + space;
				}
				System.out.println(result);
			};
			name.data(input);
			scanner.close();

		}

}
