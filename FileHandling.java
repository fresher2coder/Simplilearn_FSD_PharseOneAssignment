package assignments;
import java.io.*;
import java.util.Vector;
import java.util.*;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class FileHandling {

	public static void main(String[] args) throws IOException {
		
		BufferedWriter out = new BufferedWriter(new FileWriter("D:\\1 ONE FOR ALL\\JAVA\\Simplilearn\\Assignments\\FileHandling.txt", true));
		
		
		out.write("Java is a object oriented programming language.\n");
		out.append("It supports inheritance, abstraction, polymorphism, encapsulation");
		
		out.close();
		
		BufferedReader in = new BufferedReader(new FileReader("D:\\1 ONE FOR ALL\\JAVA\\Simplilearn\\Assignments\\FileHandling.txt"));
		String str;
		while((str=in.readLine())!=null)
			System.out.println(str);
		
	}

}
