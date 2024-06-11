package week3.day2;

public class ExecutionClass extends ICICIBank{

	public void withdrawals() {
System.out.println("10L");		
	}

	public void loan() {
System.out.println("8%");		
	}

	@Override
	public void card() {
System.out.println("credit card");		
	}
	
	public static void main(String[] args) {
		
		ExecutionClass ec=new ExecutionClass();
		ec.card();
		ec.kyc();
		ec.limitBalance();
		ec.loan();
		ec.withdrawals();
	}

}
