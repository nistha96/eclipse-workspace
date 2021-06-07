package JavaTraning;

public class childClassInheritance extends parentClassInheritance{

	public void engine()
	{
		System.out.println("Engine is new");
	}
	public void color()
	{
		System.out.println(color);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childClassInheritance cci= new childClassInheritance();
		cci.audiosystem();
		cci.brakes();
		cci.Gear();
		cci.color();
		cci.engine();

	}

}
