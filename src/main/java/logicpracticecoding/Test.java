package logicpracticecoding;


interface Cab{
	public void bookCab(String source,String Destination);
}
public class Test {

	public static void main(String[] args) {
		Cab c=(source , destination)->System.out.print("ola cab is Booked.." +source +"  "+ destination );
		
		c.bookCab("hyd", "mum");

	}

}
