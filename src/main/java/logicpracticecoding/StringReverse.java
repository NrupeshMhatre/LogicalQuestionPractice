package logicpracticecoding;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
	String str;
	System.out.print("ENter string :");
	Scanner sc=new Scanner(System.in);
	str=sc.nextLine();
	StringBuilder str1=new StringBuilder();
	str1.append(str);
	str1=str1.reverse();
	System.out.print(str1);
	}
	}
