package com.automation.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	public static Properties p;

	public ConfigurationReader() throws IOException {
		File f = new File(
				"C:\\Users\\DELL\\eclipse-workspace\\CucumberAutomation\\src\\test\\java\\com\\automationproperties\\org\\Configuration.Properties");
		FileInputStream fis = new FileInputStream(f);

		p = new Properties();
		p.load(fis);
	}

	public String getBrowserName() {
		String browserName = p.getProperty("browserName");
		return browserName;
	}

	public String geturl() {
		String url = p.getProperty("url");
		return url;
	}
}