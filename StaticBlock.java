
class StaticBlock
{
    public static void main(String Arg[])
    {
        System.out.println("Inside Main");
        // System.out.println(Demo.x);
        
        Demo obj1 = new Demo();
        Demo obj2 = new Demo();


    }
}

class Demo
{
    public int i,j;
    public static int x,y;

    static
    {
        System.out.println("Insuide static block");
        x =10;
        y=20;
    }

    public Demo()
    {
        System.out.println("Inside Constructor");
        i=10;
        j=20;
    }
}
