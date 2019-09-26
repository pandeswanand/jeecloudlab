import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lab8_3 {

	public static void main(String[] args) throws IOException {

		File f=new File("C:\\java.txt");
		FileInputStream fileInputStream = new FileInputStream(f);
		InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		String line;
		int countWord = 0;
		int countLine = 0;
		int countChar = 0;
		while((line = bufferedReader.readLine()) != null)
		{
			if(!(line.equals("")))
			{
				countChar+=line.length();
				String []s=line.split("\\s+");
				countWord+=s.length;
			}
			countLine++;
		}
		System.out.println("Word : "+countWord);
		System.out.println("Character : "+countChar);
		System.out.println("Line : "+countLine);
		bufferedReader.close();
		inputStreamReader.close();
		fileInputStream.close();
	}
}
