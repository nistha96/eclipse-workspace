package JavaTraning;

public class StaticVar {

	String name;
	String address;
	static String city = "Bangalore";
	
	public StaticVar(String name ,String address)
	{
		this.name = name;
		this.address = address;
		//this.city = city;
	} 
	public void getAddress()
	{
		System.out.println(address+ " "+ city);
		
	}
	public static void getCity()
	{
		System.out.println(city);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVar sv = new StaticVar("Nistha","BTM");
		sv.getAddress();
		StaticVar.getCity();
		
	}

}
