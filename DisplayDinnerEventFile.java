import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public abstract class DisplayDinnerEventFile 
{
	public abstract void main(String[] args);
	{
		Path file = Paths.get("C:\\Document\\Eclipse-Workspace\\Carlys.txt");
		String s = "";
		try
		{
			InputStream input = new
					BufferedInputStream(Files.newInputStream(file));
			BufferedReader reader = new
					BufferedReader(new InputStreamReader(input));
			s = reader.readLine();
			while(s != null)
			{
				System.out.println(s);
				s = reader.readLine();
			}
			reader.close();
		}
		catch(Exception e)
		{
			System.out.println("Message: " + e);
		}
	}
}
