package internationalisation;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ApplicationProperties  {

		static Properties prop;
		InputStream input = null;
		private static ApplicationProperties applicationProperties = null;

		
		public static ApplicationProperties getInstance(String fileName) {
			if(applicationProperties == null)
				applicationProperties = new ApplicationProperties(fileName);
			return applicationProperties;
		}
		
		
		public ApplicationProperties(String fileName) {
			prop = new Properties();
			try {
				input = new FileInputStream(fileName);
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				prop.load(input);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		public String getProperty(String key) {
			return prop.getProperty(key);
		}

		
		
		
		
	}




