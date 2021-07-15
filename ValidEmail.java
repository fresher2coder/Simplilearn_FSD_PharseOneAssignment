package assignments;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidEmail {

	public static void main(String[] args) {
		
		String str = "abc12@gmail.com personal@gmail personal1.1995@gmail.com official12@yahoo.edu";
		String arr[] = str.split(" ");
		
		
		
		
		Pattern p = Pattern.compile("^[\\.\\w_-]*@(gmail|yahoo)[.](net|com|edu|in)");
		
		for(int i=0; i<arr.length; i++) {
			Matcher m = p.matcher(arr[i]);
			
			
			while(m.find()) {
				System.out.println(m.group());
				
			}
		}
		
	}

}
