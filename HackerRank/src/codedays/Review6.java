package codedays;

import java.util.ArrayList;
import java.util.Scanner;

public class Review6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		ArrayList<String> stringLines = new ArrayList<>();
		System.out.println("enter the number of lines of strings");
		int lines = scan.nextInt();
		for(int i=0; i < lines; i++){
			System.out.println("what is next line string: ");
			stringLines.add(scan.next());
			
		}
		System.out.println("entered "+stringLines.size()+ " of strings");
		for(int x=0; x < stringLines.size(); x++){
			char[] c = stringLines.get(x).toCharArray();
			for(int i=0; i < c.length; i=+2)
				System.out.print(c[i]);
			
			System.out.print(" ");
			
			for(int i=1; i < c.length; i=+2)
				System.out.print(c[i]);
			
		}
		
	}

}
