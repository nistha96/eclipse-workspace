package JavaTraning;

public class stringClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "  javatraining";
		System.out.println(a.charAt(2));
		System.out.println(a.indexOf("t"));
		System.out.println(a.substring(3, 6));
		System.out.println(a.substring(5));
		System.out.println(a.concat("Students"));
		System.out.println(a.trim());
		System.out.println(a.length());
		String arr[] = a.split("t");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(a.replace("t", "s"));

	}

}
