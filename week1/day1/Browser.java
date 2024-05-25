package week1.day1;

public class Browser {

	//global variable
	int age=89;
	
	public static void main(String[] args) {

		//dataType variable= value;
		//variable created inside main methodit called local variable
		
		int noOfTab=5;
		boolean  pageLoaded=true;
		char pageName='a';
		String browserName="Chrome";
		float browser=121.89F;//f or F
		long number=7676868868l;//l or L
		//print the value
		System.out.println("Number of tab opened :"+noOfTab);
		
		System.out.println(pageLoaded+"\n"+pageName+"\n"+browserName);
	}

}
