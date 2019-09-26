import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;

public class Lab9_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		System.out.println("Enter five names");
		String[] names = new String[5];
		for (int i = 0; i < 5; i++) {
			names[i] = scanner.next();
			map.put(i, names[i]);
		}

		Lab9_1 lab = new Lab9_1();
		List<String> myList = lab.getValues(map);
		myList.forEach(item->{
			System.out.println(item);
		});
		scanner.close();
	}

	public ArrayList<String> getValues(HashMap<Integer, String> map) {

		TreeSet<String> tree = new TreeSet<String>(map.values());
		ArrayList<String> list = new ArrayList<String>(tree);
		return list;
	}
}
