
public class Main {

	public static void main(String[] args) {
		 Logger logger = Logger.getInstance();
         logger.log("This is a log message.");
         Logger anotherLogger = Logger.getInstance();
		      if (logger == anotherLogger) {
		            System.out.println("Same instance");
		      } else {
		            System.out.println("Different instances");
		        }
   	}

}
