import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Count9_2 {

	public Map<Character, Integer> countCharacter(char[] elem){
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0; i<elem.length; i++)
		{
			if(map.containsKey(elem[i])) 
			{
				int count = map.get(elem[i]);
				map.put(elem[i], count+1);
			}
			else 
			{
				map.put(elem[i], 1);
			}
		}
		return map;
	}
	public static void main(String[] args) {
		char[] elem = new char[10];
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int no = scanner.nextInt();
		System.out.println("Enter "+no+" elements");
		for(int i=0; i<no; i++) {
			elem[i] = scanner.next().charAt(0);
		}
		
		Count9_2 count = new Count9_2();
		Map<Character, Integer> map = count.countCharacter(elem);
		map.entrySet().forEach(entry->{
		    System.out.println(entry.getKey() + ":" + entry.getValue());  
		});
		scanner.close();
	}
}
