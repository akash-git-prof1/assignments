class class1
{
	 void method1()
	{
		System.out.println("H1");
	}
}

class i21 extends class1
{
	 void method1()
	{
		System.out.println("H2");
	}
	 void method2()
		{
			super.method1();
		}
	
}
public class _30_superKeywordmethod {

	public static void main(String[] args) {
		i21 obj= new i21();
		obj.method2();
	}
}

