package com.configuration.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {


	public static Properties p; //null

	public  Configuration_Reader() throws IOException {


		File f = new File
				("C:\\Users\\ADMIN\\eclipse-workspace\\Maven_NK\\src\\main\\java\\configuration.properties");

		FileInputStream fis = new FileInputStream(f);   //FileNotFound

		p = new Properties();

		p.load(fis);  //IO Exception


	}


	public String get_Config_url() throws IOException {

		String url = p.getProperty("url");         //case Sensitive

		return url;

	}

	public String get_config_username() throws IOException {

		String name = p.getProperty("username");

		return name;


	}

}
