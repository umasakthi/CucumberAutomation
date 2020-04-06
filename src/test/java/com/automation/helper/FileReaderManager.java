package com.automation.helper;

import java.io.IOException;

public class FileReaderManager {

	private FileReaderManager() {
		// empty constructor, this object should not be created any where.
		// singleton design pattern
	}

	public static FileReaderManager getInstance() {
		FileReaderManager fr = new FileReaderManager();
		return fr;
	}

	public ConfigurationReader getcrInstance() throws IOException {
		ConfigurationReader cr = new ConfigurationReader();
		return cr;
	}

}