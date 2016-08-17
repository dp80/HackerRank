package codedays;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner scan = new Scanner(System.in);
	        double mealCost = 12.0; // original meal price
	        int tipPercent = 20; // tip percentage
	        int taxPercent = 8; // tax percentage
	        scan.close();
	      
	        // Write your calculation code here.
	         double dblMealTax = mealCost * ((double)taxPercent/100);
	         double dblMealTip = mealCost * ((double)tipPercent/100);
	         double dblMealTotal = dblMealTax + dblMealTip + mealCost;
	        // cast the result of the rounding operation to an int and save it as totalCost 
	        int totalCost = (int) Math.round(dblMealTotal);
	        
	        // Print your result
	        System.out.println("The total meal cost is " + totalCost + " dollars.");
	}

}
