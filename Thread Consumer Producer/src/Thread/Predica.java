package Thread;

import java.util.function.Function;
import java.util.function.Predicate;

public class Predica {

	public static void main (String [] args) {
		String []s = {"yash","rupali","siddharth","poonam"};
	Function<String,Integer> p = o-> o.length();
	for(String x:s) {
		System.out.println(p.apply(x));
	}
	
}}
