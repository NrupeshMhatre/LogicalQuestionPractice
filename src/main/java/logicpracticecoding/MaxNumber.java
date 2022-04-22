package logicpracticecoding;

public class MaxNumber {

	public static void main(String[] args) {
		int[] arr= {32,25,15,40};
		int max=0;
		for(int e:arr) {
			if(e>max) {
				max=e;
			}
		}
System.out.print(max);
	}

}
