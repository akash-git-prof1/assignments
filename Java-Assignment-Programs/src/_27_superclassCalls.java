class p1 {
	void type()
	{
		System.out.println("Hello");
	}

	public void type1() {
	}
}

class child1 extends p1
{
	
	public void type1()
	{
		System.out.println("World");
	}
}

public class _27_superclassCalls {

	public static void main(String[] args) {

		p1 c=new child1();
		c.type1();

	}

}
