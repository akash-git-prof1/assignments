interface interface1 {
	public void hello();
}

class class1 implements interface1{
	public void hello() {
		System.out.println("Hello World");
	}
}
public class _25_abstClass {

	public static void main(String[] args) {
		class1 a= new class1();
		a.hello();
	}
}
