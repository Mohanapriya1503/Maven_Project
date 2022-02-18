package com.helper;

public class File_Reader_Manager {
	
	// private constructor
	 
	private File_Reader_Manager() {
	
	}
	
	//static methods
	
	public static File_Reader_Manager getInstanceFRC() {
		
		File_Reader_Manager frc = new File_Reader_Manager();
		
		return frc;
	}
	
	//non static methods
	
	public Configuration_Reader getInstanceCR() throws Throwable {
		
		Configuration_Reader cr = new Configuration_Reader();
		
		return cr;
	}
	
	

	}



