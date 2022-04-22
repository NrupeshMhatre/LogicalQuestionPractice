package logicpracticecoding;

public class Palidrom {

	public static void main(String[] args) {
		int num=12321;
		int remainder,sum = 0,temp=0;
		
		while(num>0) {
			remainder=num%10;
			sum=(sum*10)+remainder;
			num=num/10;
		}
		if(temp==num) {
			System.out.print("palindrom");
		}else {
			System.out.print("Not palindrome");
		}
	}

}
