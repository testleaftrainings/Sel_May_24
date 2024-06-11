package week3.day2;

public class LearnStringMethods {

	public static void main(String[] args) {

		String data="Welcome to TestLeaf";
		String[] split = data.split("e");
		// W 
		//lcom
		// to T 
		//stL 
		//af
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}
		
		
		//input = Learn String Methods
		//output = LearnStringMethods
		String value="Learn String Methods";
		String[] split2 = value.split(" ");
		for (int i = 0; i < split2.length; i++) {
			System.out.print(split2[i]);
		}
		
		System.out.println();
	//replace
		String name="Selenium";
		String replace = name.replace('e', 'E');
		System.out.println(replace);
		
		//replaceAll
		String data1="testLeaf2024@gmail.COm";
		String replaceAll = data1.replaceAll("[^A-Z 0-9]", "");
		System.out.println(replaceAll);
		
		//input =A2b4cd5k5TUD -replaceAll
		//output=AbcdkTUD- ["0-9",""]
		//output=A#b#cd#k#TUD-["0-9","#"]
		
		//substring
		
		String val="Leaftaps application login";
		
		//m1 -index value start from '0'
		String substring = val.substring(9);
		System.out.println(substring);
		
		//m2 starting n ending index-1
		String substring2 = val.substring(9, 20);
		System.out.println(substring2);
		
		//touppercase & tolowercase
		String d="testLEAF";
		String upperCase = d.toUpperCase();
		System.out.println(upperCase);
		
		String lowerCase = d.toLowerCase();
		System.out.println(lowerCase);
		
		//integer.parseInt
		String number="2024";
		int parseInt = Integer.parseInt(number);
		System.out.println(parseInt);
		
		
	}

}
