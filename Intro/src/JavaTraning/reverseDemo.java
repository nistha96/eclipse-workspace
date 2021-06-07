package JavaTraning;

public class reverseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 

		int i = 0;
		String s = "madam" ;
		String t = "";
		for(i=s.length()-1;i>=0;i--)//3
		{
			//System.out.print(s.charAt(i));
			t = t+s.charAt(i);//m,ma,
			
		}
		System.out.println(t);
			if(s.equals(t))
			{
				System.out.println("It is palindrome");
			}
			else
			{
				System.out.println("This is not Palindrome");
			}
	  
	}

}
