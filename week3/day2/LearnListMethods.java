package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnListMethods {

	public static void main(String[] args) {

		List<String> mentors=new ArrayList<String>();
		mentors.add("Ragu");
		mentors.add("Vinoth");
		mentors.add("Gokul");
		mentors.add("Vineeth");
		
		//print the list
		System.out.println("mentors list :"+mentors);
		
		//
		mentors.add(2, "Dilip");
		
		System.out.println(mentors);
		
		//print vinoth name
		String string = mentors.get(1);
		System.out.println(string);
		
		//check whether vineeth name presented
		boolean contains = mentors.contains("Vineeth");
		System.out.println(contains);
		
		//remove dilip name
		mentors.remove(2);
		System.out.println(mentors +" :after removing ");
		
		Collections.sort(mentors);
		System.out.println(mentors);
		
		for (int i = 0; i < mentors.size(); i++) {
			String string2 = mentors.get(i);
			System.out.println(string2);
		}
		
		
		//clear
		mentors.clear();
		System.out.println(mentors);
				
	}

}
