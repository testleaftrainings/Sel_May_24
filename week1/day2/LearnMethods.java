package week1.day2;

public class LearnMethods {

	//type methodName -ctrl space -change into public
	public void browser() {
System.out.println("Chrome");
	}
	
	private int browserVersion() {
		return 121;
		
	}
	
	public int browserValue(int a,int b) {
		return a+b;
	}
	
	
	public static void main(String[] args) {
		//className objName=new clasName();
		LearnMethods method=new LearnMethods();
		
		//objectName.method();
		method.browser();
		
		//ctrl+2 -> L
		int browserValue = method.browserValue(5, 9);
		System.out.println(browserValue);
		
		System.out.println(method.browserVersion());
		
	}

}
