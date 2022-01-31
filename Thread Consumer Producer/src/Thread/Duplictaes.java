package Thread;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Pattern;
import java.io.*;
public class Duplictaes {
	// Java program to remove
	// duplicates from input.txt and
	// save output to output.txt

	


	
		public static void main(String[] args) throws IOException
		{
			
			 Scanner src = new Scanner(System.in);
		        Object input;
		        System.out.println("Enter input:");
		        input = src.nextLine();
		       // Object obj = (Object) input;
		        if (input instanceof Integer ) {
		        	System.out.println("integer");
		        }
		        else   if (input instanceof Float) {
		        	System.out.println("Float");
		        }
		        else {
		        	System.out.println("String");
		        }
		      //  System.out.println("You entered:" + getDataType(input));
			
			
			
			// PrintWriter object for output.txt
			//PrintWriter pw = new PrintWriter("output.txt");
			
			// BufferedReader object for input.txt
			BufferedReader br1 = new BufferedReader(new FileReader("input.txt"));
			
			String line1 = br1.readLine();
			HashSet<String > h = new HashSet<String>();
			// loop for each line of input.txt
			while(line1 != null)
			{
				boolean flag = false;
				
				if (h.add(line1)== false) {
					System.out.println(line1);
				}
			}
			
				// BufferedReader object for output.txt
			
	

			
}}

		
	
