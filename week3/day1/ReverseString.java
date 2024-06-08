package week3.day1;

public class ReverseString {

	public static void main(String[] args) {

		String input="Dilip";
		//piliD
		//tochararray
		//for loop
		//print value
		
		char[] ch = input.toCharArray();
		
		for (int i =ch.length-1 ; i >=0 ; i--) {
			
			System.out.print(ch[i]);
		}
	}

}
