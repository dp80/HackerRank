package challenges;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MaximumSubarraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		//int querynum = scan.nextInt();
		
		String s = "saveChangesInTheEditor";
		String[] arr = s.split("[A-Z]");
		System.out.println(arr.length);
		
		System.out.println(s);
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}
	}

}
