package com.configuration.helper;

import java.io.IOException;

public class File_Reader_Manager {

	//SDP

	public File_Reader_Manager() {
		// TODO Auto-generated constructor stub

	}


	public static  File_Reader_Manager get_Instance_FRM() {

		File_Reader_Manager helper = new File_Reader_Manager();

		return helper;

	}


	public Configuration_Reader get_Instance_CR() throws Throwable {

		Configuration_Reader reader = new Configuration_Reader();

		return reader;


	}



}
