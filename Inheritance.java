class Inheritance
{
	public static void main(String arg[])
	{
		Base bobj = new Base();
		bobj.fun();

		Derived dobj = new Derived();
		dobj.fun();
		dobj.gun();
	}
}

class Base
{
	public int x,y;

	public Base()
	{
		System.out.println("Base Constructor");
		this.x = 0;
		this.y = 0;
	}
	public Base(int i, int j)
	{
		System.out.println("Base Constructor");
		this.x = i;
		this.y = j;
	}
	public void fun()
	{
		System.out.println("Base fun");
	}
}

class Derived extends Base 		// class Derived : public Base
{
	public int a,b;
	public Derived()
	{	
		System.out.println("Derived constructor");
		this.a = 0;
		this.b = 0;
	}
	public Derived(int no1, int no2)
	{	
		System.out.println("Derived constructor");
		this.a = no1;
		this.b = no2;
	}
	public void gun()
	{
		System.out.println("Derived gun");
	}
}











