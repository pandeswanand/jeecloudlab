
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Square9_3 {

	public Map<Integer, Integer> getSquares(int[] elem) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i : elem) {
			map.put(i, i * i);
		}
		return map;
	}

	public static void main(String[] args) {
		int[] elem = new int[10];
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int no = scanner.nextInt();
		System.out.println("Enter " + no + " elements");
		for (int i = 0; i < no; i++) {
			elem[i] = scanner.nextInt();
		}

		Square9_3 square = new Square9_3();
		Map<Integer, Integer> map = square.getSquares(elem);
		map.entrySet().forEach(entry->{
		    System.out.println(entry.getKey() + ":" + entry.getValue());  
		 });
		scanner.close();
	}

}
