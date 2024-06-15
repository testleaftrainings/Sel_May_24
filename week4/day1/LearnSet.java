package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {

		int[] age= {23,45,34,12,45,67,89,90,76,43,67};
		
		//print index of 5
		Set<Integer> value=new TreeSet<Integer>();
		
//		for (int i = 0; i < age.length; i++) {
//			value.add(age[i]);
//			
//		}
		
		//for each loop - collection -no need init,cond,incr/decr
		
		for (Integer data : age) {
			value.add(data);
		}
		
		System.out.println(value);
		
		//convert set into list
		List<Integer> findValue=new ArrayList<Integer>(value);
		Integer i = findValue.get(5);
		System.out.println(i);
		
		
		//set -will not use collections.sort()
		//Tree set -ascii
	}

}
