package demoPkg;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class FileHandling 
{
	
	public static void readprop() throws Exception 
	{
		FileReader fr = new FileReader("./Data/testdata.properties");
		
		Properties prop = new Properties();
		
		prop.load(fr);
		System.out.println(prop.get("Name"));
		
		System.out.println(prop.get("Language"));
		
		System.out.println(prop.get("Skill"));
		
	}
		
	public static void writedata() throws Exception
	{
		
		File f = new File("./Data/xyz.txt");
		FileWriter fw = new FileWriter(f,true);
		
		fw.write("\nthis is the forth line");
		fw.flush();
		fw.close();
		
	}

	public static void readData() throws Exception 
	{
		
		//File f = new File("./Data/abc.txt");   //file connection
		
		FileReader fr = new FileReader("./Data/abc.txt");
		
		int r = fr.read();  //116
		
		while(r!=-1) 
		{
			System.out.print((char)r);  //this
			r = fr.read();
		}
		
	}
	
	public static void main(String[] args) throws Exception 
	{
		FileHandling.readprop();
		FileHandling.readData();
		FileHandling.writedata();
		
	}
	
}
