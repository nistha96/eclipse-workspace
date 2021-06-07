package JavaTraning;

public class childDemo extends parentDemo{
	
	String str = "QAClickAcademy" ;
	public childDemo()
	{
		super();
		System.out.println("Child constructor");
	}
	
	public void getStringData()
	{
		
		System.out.println(str);
		System.out.println(super.str);
	}
	public void getData()
	{
		System.out.println("I am in child class");
		super.getData();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		childDemo cd = new childDemo();
		cd.getStringData();
		cd.getData();
	}

}
