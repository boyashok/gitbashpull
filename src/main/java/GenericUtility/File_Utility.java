package GenericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
/**
 * This class contains all the File utility methods
 * @author DELL
 *
 */
public class File_Utility {
  /**
   * This method is used to read the from properties file
   * @param key
   * @return
   * @throws IOException
   */
	 public String getKeyandValue(String key) throws IOException {
		 FileInputStream fis = new FileInputStream("./src/test/resources/data.properties.txt");
			Properties p = new Properties();
			p.load(fis);
			String value = p.getProperty(key);
			return value;
			
	 }
}
