package week3.day2;

public class CountNumberChars {

	public static void main(String[] args) {
String name="testleaf";
//count for e =2
//int count variable
int count=0;

for (int i = 0; i < name.length(); i++) {
	if(name.charAt(i)=='a') {
		count++;
	}
}
System.out.println("the number of occurrences of 'a' :"+count);
	}

}
