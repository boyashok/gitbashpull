package GenericUtility;

import java.util.Random;
/**
 * This class contains all the java related concept methods
 * @author DELL
 *
 */
public class Java_Utility {
	/**
	 * This method is used to avoid the duplicate values
	 * @return
	 * @author DELL
	 */
   public int randNum() {
	   Random r= new Random();
	   int rand=r.nextInt(100);
	   return rand;
   }
}
