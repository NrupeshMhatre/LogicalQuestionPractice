package logicpracticecoding;

public class ForLoopReverse {
	
	public static void main(String[] args) 
	{
		 int reverse=0;
		 for(int num=12345; num!=0 ; num=num/10 )
		 {
			 int remainder=num%10;
			 reverse=reverse*10+remainder;
		 }
		 
		System.out.print("reverse number:"+ reverse);
	}
	}


