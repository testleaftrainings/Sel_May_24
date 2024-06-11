package week3.day2;

public abstract class ICICIBank implements RBI{

	//ground 
	public void kyc() {
System.out.println("pan card");		
	}
	
	
	public void limitBalance() {
		System.out.println("5000rs");
	}
	
	//one abstract methods created
	public abstract void card();
	
	//0 to 100% abstract method
	//both implements and unimplements
	
	
		
		//for interface we can able create object : NO
		//RBI r=new RBI();
		
		//for abstract class we can able create object : NO
		//ICICIBank i=new ICICIBank();
	

}
