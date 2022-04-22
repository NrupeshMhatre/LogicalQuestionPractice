package logicpracticecoding;

import java.util.ArrayList;
//import java.util.EventObject;

public class ArrayListPrinting {

	public static void main(String[] args) {
	ArrayList list=new ArrayList();
	list.add(20);
	list.add(30);
	list.add(40);
	for(Object e: list) {
		System.out.print(e+ " ");
		
	}
	}

}
