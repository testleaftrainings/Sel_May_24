package week3.day1;

public class LearnMethodOverLoading {

	public void browser() {
System.out.println("no input agrs");
	}
	
	
	public void browser(String name) {
System.out.println("browser name is :"+name);
	}
	
	public int browser(int version) {
		return version;

	}
	
	public static void main(String[] args) {
		LearnMethodOverLoading ol=new LearnMethodOverLoading();
		
		ol.browser();
		ol.browser("chrome browser");
		System.out.println(ol.browser(121));
	}
	
	
}
