package week4.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharacter {

	public static void main(String[] args) {

		String value="testleaf";
		char[] ch = value.toCharArray();
		String output="";
		
		//empty set
		Set<Character> removechar=new LinkedHashSet<Character>();
		
		for (Character duplicate : ch) {
			removechar.add(duplicate);//adding value in set
		}
		
		System.out.println(removechar);//removing duplicate char
		
		for (Character character : removechar) {
			output+=character;//return string value
			//output=output+character
		}
		System.out.println(output);
	}

}
