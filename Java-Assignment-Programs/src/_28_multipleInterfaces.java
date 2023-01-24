interface i1{
	public void bike();
}

interface i2{
	public void car();
}

class iclass implements i1,i2
{
	public void i1()
	{
		System.out.println("Hello");
	}
	
	public void i2()
	{
		System.out.println("World");
	}
}
public class _28_multipleInterfaces {

	public static void main(String[] args) {
		iclass a=new iclass();
		a.i1();
		a.i2();
	}
}

