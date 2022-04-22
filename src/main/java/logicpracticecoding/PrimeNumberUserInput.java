package logicpracticecoding;

import java.util.Scanner;

public class PrimeNumberUserInput {
public static void main(String[] args) {
	int i,j,n,count;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter Value:");
	n=sc.nextInt();
	System.out.print("prime number between  1 to " +n+ "are :");
	for(i=2;i<=n;i++) {
		count=0;
		for(j=1;j<=i;j++) {
			
			if(i%j==0) {
			count++;	
			}
		}
		if(count==2) {
			System.out.print(j+ " ");
		}
	}
}
}

