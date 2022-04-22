package logicpracticecoding;

import java.util.Scanner;

public class PrimeNmb {
public static void main(String[] args) {
	System.out.print("Enter number");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int temp=0;
	for (int i=2;i<num-1;i++) {
		if(num%2==0) {
			temp=temp+1;
		}
	}
	if(temp>0) {
		System.out.print(num +"number is not prime");
	}else {
		System.out.print(num +"Number is  prime");
	}
}
}
