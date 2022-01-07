
class Abstract
{
    public static void main(String Arg[])
    {
        //Demo obj = new Demo(); // Not Allowed
        Demo obj; // Allowed
        obj = new Hello();  //  Upcasting
        obj.fun();  // fun of Hello
        obj.gun();  // gun of Demo
        obj.sun();  // sun of Hello
        System.out.println(obj.i);  // 10
        System.out.println(obj.j);  // 20
    }
}

abstract class Demo
{
    public int i,j;
    public Demo()
    {
        System.out.println("Inside constroctor of Demo");
        i=10;
        j=20;

    }
    public void fun()
    {
        System.out.println("Inside fun of Demo");
    }
    public void gun()
    {
        System.out.println("Inside gun of Demo");

    }
    public abstract void sun(); // visrtual void sun () =0; in C++ syntax
    
}

class Hello extends Demo
{
    public int x,y;
    public Hello()
    {
        System.out.println("Inside constructor of Hello");
        x=10;
        y=20;
    }
    public void fun()    // Overriding
    {
        System.out.println("Insid fun of Hello");
    }
    public void sun()
    {
        System.out.println("Inside sun of Hello");
    }

}