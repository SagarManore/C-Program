class Virtual
{
	public static void main(String arg[])
	{
		Base bp = new Derived();   // Upcasting
		bp.fun();
		bp.gun();
		// bp.sun();

	}
}

class Base
{
	public void fun()
	{
		System.out.println("Base fun");
	}
	public void gun()
	{
		System.out.println("Base gun");
	}


}

class Derived extends Base
{
	public void fun()    // Overriding
	{
		System.out.println("Derived fun");
	}

	public void sun()
	{
		System.out.println("Derived sun");
	}


}












