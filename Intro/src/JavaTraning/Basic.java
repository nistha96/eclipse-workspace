package JavaTraning;

public class Basic {

	//public void getData()
	public String getData()
	{
		//System.out.println("I am in method");
		return "Hello";
	}
	static int a= 4;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Basic b = new Basic();
		System.out.println(b.getData());
		System.out.println(b.a);
		System.out.println("Hello World");
	}

}
