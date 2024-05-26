package week1.day2;

public class LearnForLoop {

	//jump stmt - break,continue
	//break -once it reach value program stop
	//continue - value which given in condition skip
	public static void main(String[] args) {

		int num=10;
		//for=ctrl +space => choose second option
		for (int i = 1; i < num; i++) {
			//if(4==4)
			if(i==4) {
				break;
			}
			System.out.println(i);
		}
		
		System.out.println(" ");
		
		
		//i--=i-1
		for (int i = 9; i >0; i--) {
			if(i==5 || i==6) {
				continue;
			}
			System.out.println(i);
		}
	}

}
