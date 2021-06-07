package JavaTraning;

public class AustralianTraffic implements CentralTraffic{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CentralTraffic a = new AustralianTraffic();
		a.redStop();
		a.flashYellow();
		a.greenGo();
	}
	public void greenGo()
	{
		System.out.println("green go implementation");
	}
	public void redStop()
	{
		System.out.println("red stop implementation");
		
	}
	public void flashYellow()
	{
		System.out.println("flash yellow implementation");
	}

}
