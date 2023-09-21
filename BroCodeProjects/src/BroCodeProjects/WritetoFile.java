package BroCodeProjects;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WritetoFile 
{
	public static void main(String[] args) throws IOException {
		
		try {
			FileWriter write = new FileWriter("poem");
			
			write.write("The text file created will be inside the Java>> BroCode Projects section.");
			write.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			FileReader reader= new FileReader("poem");
			int data= reader.read();
			
			while(data!=-1)
			{
				System.out.print((char)data);
				data= reader.read();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
