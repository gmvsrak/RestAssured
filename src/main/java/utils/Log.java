package utils;

import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;

public class Log {
	
	// Initialize Log4j logs
	 
		 public static Logger Log = Logger.getLogger(Log.class);//
	 
	 // This is to print log for the beginning of the test case, as we usually run so many test cases as a test suite
		 
		 public static void startTestCase(String sTestCaseName){
			 
				Log.info("****************************************************************************************");
			 
				Log.info("****************************************************************************************");
			 
				Log.info("$$$$$$$$$$$$$$$$$$$$$                 "+sTestCaseName+ "       $$$$$$$$$$$$$$$$$$$$$$$$$");
			 
				Log.info("****************************************************************************************");
			 
				Log.info("****************************************************************************************");
			 
				}

		 public static void endTestCase(String sTestCaseName){
			 
				Log.info("XXXXXXXXXXXXXXXXXXXXXXX             "+"-E---N---D-"+"             XXXXXXXXXXXXXXXXXXXXXX");
			 
				Log.info("X");
			 
				Log.info("X");
			 
				Log.info("X");
			 
				Log.info("X");
			 
				}
	 
	 public static void info(String message) {
	 
			Log.info(message);
	 
			}
	 
	 public static void warn(String message) {
	 
	    Log.warn(message);
	 
		}
	 
	 public static void error(String message) {
	 
	    Log.error(message);
	 
		}
	 
	 public static void fatal(String message) {
	 
	    Log.fatal(message);
	 
		}
	 
	 public static void debug(String message) {
	 
	    Log.debug(message);
	 
		}
	 
	}
