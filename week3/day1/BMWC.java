package week3.day1;

public class BMWC extends CarP{

	public void sunroof() {
System.out.println("i am coming from C-Sunroof");
	}

	public void brake() {
		System.out.println(" data is override ");
	}
	
	public void brake(int number) {
		System.out.println(number);
	}
	
	public static void main(String[] args) {
		BMWC c=new BMWC();
		
		c.brake();
		c.horn();
		c.gear();
		c.sunroof();
	}
}
