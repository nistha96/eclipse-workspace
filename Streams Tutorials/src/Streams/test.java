package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//import com.sun.tools.javac.util.Assert;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class test {
	//
		// TODO Auto-generated method stub
		
	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\Nistha-Work\\New\\chromedriver.exe");	
		//WebDriver driver= new ChromeDriver();
		/*ArrayList<String> names = new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");
		int count = 0;
		for( int i = 0 ; i<names.size(); i++)
		{
			String actual = names.get(i);
			if(actual.startsWith("A"))
			{
				count++;
			}
				
		}
		System.out.println(count);	*/
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");
		Stream.of("Abhijeet","Don","Alekhya","Adam","Ram").filter(s->s.startsWith("A")).count();
		Long c = names.stream().filter(s->s.startsWith("A")).count();
		
		System.out.println(c);
		
		ArrayList<String> name1 = new ArrayList<String>();
		name1.add("man");
		name1.add("Don");
		name1.add("women");
		
		//print all the name of the arraylist
		names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
		
		Stream.of("Abhijeet","Don","Alekhya","Adam","Rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
		.forEach(s->System.out.println(s));
		
		// sorting 
		List<String> name = Arrays.asList("Azbhijeet","Don","Alekhya","Adam","Rama");
		name.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase())
		.forEach(s->System.out.println(s));
		
		//merging nd sorting
		Stream<String> newStream = Stream.concat(name.stream(),name1.stream());
		//newStream.sorted().forEach(s->System.out.println(s));
		boolean flag = newStream.anyMatch(s->s.equalsIgnoreCase("Adam"));
		System.out.println(flag);
		//Assert.assertTrue(flag);
		
		//covert back into list nd send it to other method for proccessing
		
		 List<String> ls = Stream.of("Abhijeet","Don","Alekhya","Adam","Rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
		.collect(Collectors.toList());
		 System.out.println(ls.get(0));
		 
		 List<Integer> values = Arrays.asList(3,2,2,7,5,1,9,7);
		 //values.stream().distinct().forEach(s->System.out.println(s));
		 // after sort print 3rd index value
		 List<Integer> li = values.stream().distinct().sorted().collect(Collectors.toList());
		 System.out.println(li.get(2));
	}
	
}

