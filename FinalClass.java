
class FinalClass
{
    public static void main(String Arg[])
    {
        Base bobj = new Base();
        bobj.fun();
        Demo dobj = new Demo();
        dobj.gun();  //Composit Call
    }
}

final class Base
{
    public int i;
    
    public void fun()
    {
        System.out.println("Base fun");
    }
}

class Demo
{
    public Base bobj; // public Base bobj = new Base ();  // Both Composition
    public Demo()
    {
        bobj = new Base ();
    }
    public void gun()
    {
        bobj.fun();
    }
}
/*class Derived extends Base  // final class error
{
}*/