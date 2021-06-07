package JavaTraning;

public class constructDemo {

	
	public constructDemo()
	{
		System.out.println("I am in constructor");
		System.out.println("I am in constructor lecture 1");
	}
	
	public constructDemo(int a, int b)
	{
		System.out.println("I am in paremeterized constructor");
	}
	
	public void getdata()
	{
		System.out.println("I am in method");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		constructDemo cd = new constructDemo();
		constructDemo pcd = new constructDemo(4,5);
		
		
		
	}

}
