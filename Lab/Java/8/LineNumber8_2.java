import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;

public class LineNumber8_2 {

	public static void main(String[] args) throws IOException {
		FileReader fileReader = new FileReader("C:\\java.txt");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		int i=1;
		String item;
		while((item = bufferedReader.readLine()) != null)
		{
			System.out.println(i+" "+item);
			i++;
		}
		bufferedReader.close();
		fileReader.close();
	}

}
