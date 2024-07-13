package week8.day1;

public class ExceptionHandlingJava {
	public static void main(String[] args) throws InterruptedException {

int[] age= {2,4,6,2,5,9};
//0-5


try {
	System.out.println(age[7]);
} 


catch (ArrayIndexOutOfBoundsException e) {
	System.out.println(age[5]);
	
}
//common exception should be last one
catch(Exception e) {
	System.out.println("common exception");
}finally {
	System.out.println("this is finally block");
}

Thread.sleep(3000);




System.out.println("Array done");


	}
}
