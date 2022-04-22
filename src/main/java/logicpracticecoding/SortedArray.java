package logicpracticecoding;

public class SortedArray {

	public static void main(String[] args) {
		int[] arr= {10,3,2,5,4,6,9,7,8};
		int temp=0;
		
		for(int i=0;i<arr.length;i++) {
			int min=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[min]) {
					min=j;
				
				}
			}
			temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
			
}
		for(int e: arr) {
			System.out.print(e+ " ");
	//	for(int i=0;i<arr.length;i++) {
		//	System.out.print(arr[i]+ " " );
		}
	}

}
