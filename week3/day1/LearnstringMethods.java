package week3.day1;

public class LearnstringMethods {

	public static void main(String[] args) {
		
		String name="Testleaf";
		String comName=new String("Testleaf");
		
		//length 
		int noOfChar = name.length();
		System.out.println("total number of chars :"+noOfChar);
		
// equals 
		if(name.equals("Testleaf")) {
			System.out.println("content same");
		}else {
			System.out.println("content not same");
		}
	
	
	//b/w .equals and ==
	if(comName.equals(name)) {
		System.out.println("content will be same .equals");
	}else {
		System.out.println("not same");
	}
	
	
	//== it will check the memory address  where its stored
	if(name==comName) {
		System.out.println("content same ==");
	}else {
		System.out.println("content is not same ==");
	}
	
	//equalignorecase
	String str="dilip";
	String str1="Dilip";
	
	if(str.equalsIgnoreCase(str1)) {
		System.out.println(" content is same and it ignore case");
	}else {
		System.out.println(" content is not same and ignore case");
	}
	
	//contains
	String value="selenium";
	
	boolean contains = value.contains("eleum");
	System.out.println(contains);
	
	//charAT
	String data="java";
	char charAt = data.charAt(3);
	System.out.println(charAt);
	
	//tocharArray
	
	String name2="Test leaf 1 @";
	
	char[] charArray = name2.toCharArray();
	
	for (int i = 0; i < charArray.length; i++) {
		System.out.print(charArray[i]);
	}
	
	}
	
	
	
	

}
