package org.testing.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyfileLoad {
	public static Properties propertiesFile() throws IOException
	{
		File f = new File ("../APIAutomationFramework/Enviornment.properties");
		FileInputStream fi = new FileInputStream(f);
		Properties pr = new Properties();
		pr.load(fi);
		return pr;
	}

}
