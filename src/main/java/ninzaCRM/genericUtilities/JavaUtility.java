package ninzaCRM.genericUtilities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * This class consist all the java related utility methods like random no, system date etc
 * @author Khushi Gupta
 */
public class JavaUtility {
	
	/**
	 * This method will generate a random number and return to the caller method
	 * @param limit
	 * @return
	 */
	public int getRandomNumber() {
		Random random= new Random();
		return random.nextInt(1000);
	}
	
	//get current system date
	/**
	 * This method will capture current system date and return it to caller method
	 * @return
	 */
	public String getSystemDate() {
		Date d= new Date();
		SimpleDateFormat s= new SimpleDateFormat("dd-mm-yyyy_hh-mm-ss");
		String date=s.format(d);
		return date;
		
	}

}
