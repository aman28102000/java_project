package fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class createfile {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		File myfile = new File("D:\\java fsd1\\javademos\\helloindia\\src");
		try {
			if (myfile.createNewFile()) {
				System.out.println("File created: " + myfile.getName());

			} else {
				System.out.println("File already exists.");
			}
		} catch (IOException e) {
			System.out.println("an error occurred");
			e.printStackTrace();
		}
		System.out.println(
				"please select one of the below operations\n\t w for write mode\n\t r for read mode\n\t a for append mode\n\t");
		Scanner in = new Scanner(System.in);
		String s = in.next();
		if (s.equalsIgnoreCase("r")) {
			filereading(s);
		} else if (s.equalsIgnoreCase("w") || s.equalsIgnoreCase("a")) {
			writingoffile(s);
		} else {
			System.out.println("sorry try again");
		}
		in.close();
	}

	public static void writingoffile(String s) {
		Scanner in = null;
		try {
		String source = "";
		File f = new File("samplefile");
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		FileWriter f0 = null;
		if (s.equalsIgnoreCase("w")) {

			f0 = new FileWriter(f, false);
			System.out.println("write 'stop' when you finish writing file");
			f.delete();
			f.createNewFile();
			while(!(source=bf.readLine()).equalsIgnoreCase("stop")) {
				f0.write(source+System.getProperty("line.separator"));
			}
			bf.close();
			System.out.println("done");
		}
		else {
			f0=new FileWriter(f,true);
			System.out.println("write 'stop' when you finish appending file");
			while(!(source=bf.readLine()).equalsIgnoreCase("stop")) {
				f0.append(source+System.getProperty("line.separator"));
			}
		}
		System.out.println("done");
		f0.close();
		} catch(Exception e) {
			System.out.println("error: ");
			e.printStackTrace();
		}
	}
	public static void filereading(String s) {
		
		try {
			File myobj=new File("samplefile");
			Scanner myread=new Scanner(myobj);
		
		while(myread.hasNextLine()) {
			String content=myread.nextLine();
			System.out.println(content);
			
		}
		myread.close();
	}catch (FileNotFoundException e) {
		System.out.println("an error occurred");
		e.printStackTrace();
	}

		
		
	}
}
