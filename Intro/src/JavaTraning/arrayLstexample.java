package JavaTraning;

import java.util.ArrayList;

public class arrayLstexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<String>();
		a.add("Nistha");
		a.add("java");
		System.out.println(a);
		a.add(0, "student");
		System.out.println(a);
		/*a.remove(1);
		a.remove("java");
		System.out.println(a);*/
		System.out.println(a.get(2));
		//testing
		System.out.println(a.contains("testing"));
		System.out.println(a.indexOf("Nistha"));
		System.out.println(a.size());
		

	}

}
