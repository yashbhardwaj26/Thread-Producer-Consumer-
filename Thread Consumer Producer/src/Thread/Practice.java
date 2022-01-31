
package Thread;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "yashbhardwaj{{{{{{{!!!!!!jijijijijiji";
		System.out.println(name.replaceAll("[^a-zA-Z0-9]", ""));
		String reversed="";
		for (int i =name.length()-1;i>=0;i--) {
			reversed= reversed+ name.charAt(i);
		}
		System.out.println(reversed);
		
		
	String repeated = "yash is yash is yash of yash by yash";
			String [] rw= repeated.split(" ");
			Map<String, Integer> storage = new HashMap<String,Integer>();
			for (String a : rw) {
				
				if (storage.containsKey(a)) {
					storage.put(a, storage.get(a)+1);
				}
				
				else {
					storage.put(a, 1);
				}
			}
			Set<String> h =  storage.keySet();
			for (String b :h ) {
				System.out.println("the word is " + b+" and the count is "+ storage.get(b));
			}
	}
	
	
}