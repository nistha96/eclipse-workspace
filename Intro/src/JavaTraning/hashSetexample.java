package JavaTraning;

import java.util.HashSet;
import java.util.Iterator;

public class hashSetexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>();
		hs.add("USA");
		hs.add("US");
		hs.add("INDIA");
		hs.add("JAPAN");
		hs.add("UK");
		System.out.println(hs);
		//System.out.println(hs.remove("US"));
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		//System.out.println(hs);
		Iterator<String> i = hs.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}


	}

}
