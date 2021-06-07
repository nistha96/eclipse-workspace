package JavaTraning;

public class ChildIndig extends ParentAircraft{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChildIndig ch = new ChildIndig();
		ch.bodyColor();
		ch.engine();
		ch.safetyGuidelines();
	}

	@Override
	public void bodyColor() {
		// TODO Auto-generated method stub
		System.out.println("Red color on the body");
	}

}
