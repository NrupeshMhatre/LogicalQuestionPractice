package logicpracticecoding;

public class GenericsMethods {
	 public static <E> void Print(E [] Input) {
		 for(E element : Input) {
			 System.out.print(element+ " ");
			 }
	 }
	 public static void main(String[] args) {
		 Integer[] intArray= {1,2,3,4,5};
		 String[] strArray= {"s","n","m"};
		 
		 System.out.print("Printing array Values: ");
		 Print(intArray);
		 
		 System.out.println("Printing String array Values: ");
		 Print(strArray);
	 }
	 
}
