package Thread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.function.Predicate;

import javax.swing.text.html.HTMLDocument.Iterator;

class Employee{
	
	 String name; 
	Integer eno;
	@Override
	public String toString() {
		return "Employee [name=" + name + ", eno=" + eno + "]";
	}
	public Employee(String name, int eno) {
		super();
		this.name = name;
		this.eno = eno; 
	}
	
}

public class sta {

	public static void main(String[] args) {
		
		ArrayList<Employee> l = new ArrayList<Employee>();
		l.add(new Employee("yash",109));
		l.add(new Employee("yash1",103));
		l.add(new Employee("yash2",107));
		l.add(new Employee("yash3",108));
		l.add(new Employee("yash4",102));
		l.add(new Employee("yash5",1011));
		Predicate<Employee> p= e-> e.eno>103;
		for(Employee e : l) {
			if(p.test(e)) {
				System.out.println("hired with"+ e.eno);
			}
		}
		Function<Employee,String> f= t -> {
			if(t.eno>103) {
				return "a grade";
			}
			else {
				return "b grade";
			}
		};
		for (Employee e : l) {
			System.out.println(f.apply(e));
		}
	} 

}
