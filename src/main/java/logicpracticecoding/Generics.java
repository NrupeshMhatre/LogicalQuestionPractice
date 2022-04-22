package logicpracticecoding;

public class Generics<T,U> {
	T obj1;
	U obj2;
	public Generics(T obj1,U obj2) {
		this.obj1=obj1;
		this.obj2=obj2;
	}
	public void print() {
		System.out.println(obj1);
		System.out.println(obj2);
		
	}
	public static void main(String[] args) {
		Generics<String,Integer> G=new Generics<String,Integer>("NXM" , 45);
		G.print();
	}
}
