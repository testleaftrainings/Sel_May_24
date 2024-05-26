package week1.day2;

import java.util.Arrays;

public class RemoveDuplicateValues {

	public static void main(String[] args) {

		int[] num= {12,78,56,90,12,87,45,90,34,27,87};
		
		//for loop -nested for loop
		//if condition
		
		//outer for loop
		//12,78,56,90,12
/*		for (int i = 0; i < num.length; i++) {
			//78,56,90,12,87,45,90,34,27,87
			//56,90,12,87,45,90,34,27,87
			//90,12,87,45,90,34,27,87
			//12,87,45,90,34,27,87
			//87,45,90,34,27,87
			
			//inner for loop
			for (int j = i+1; j < num.length; j++) {
				
				if(num[i]==num[j]) {
					System.out.println("duplicate value is :"+num[j]);
				}
			}
			
			
			*/
			//sort
			Arrays.sort(num);
			//12,12,27,34,45,56,78,87,87,90,90
			
			for (int k = 0; k< num.length-1; k++) {
				if(num[k]==num[k+1]) {
					System.out.println(num[k+1]);
				}
			}
			
		}
	}


