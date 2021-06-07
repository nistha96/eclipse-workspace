package alphaPackage;
import org.apache.logging.log4j.*;
public class Demo {

	
	private static Logger Log = LogManager.getLogger(Demo.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Log.debug("I am Debugging");
		if(5>4)
			Log.info("Object is present");
		Log.error("Object is not present");
		
		Log.fatal("This is fatal error");
	}

}
