package betaPackage;
import org.apache.logging.log4j.*;
public class Demo1 {

	
	private static Logger Log = LogManager.getLogger(Demo1.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Log.debug("I am Debugging");
		if(5>4)
			Log.info("Object is present");
		Log.error("Object is not present");
		
		Log.fatal("This is fatal error");
	}

}
