package week1.day2;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {

int[] age= {12,45,32,56,13,44,67,42};

System.out.println("first index value :"+age[0]);

int arraylength = age.length;
System.out.println(" total length of the array "+arraylength);
   
System.out.println("last index value "+age[arraylength-1]);
	
Arrays.sort(age);	
System.out.println("after sort the valu last index value "+age[arraylength-1]);

for (int i = 0; i < age.length; i++) {
	System.out.println(age[i]);
}

	}

}
