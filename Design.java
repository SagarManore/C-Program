import java.time.format.SignStyle;

final class Singleton
{
    public int X,Y;
    private static Singleton obj= new Singleton();
    private Singleton()
    {
        System.out.println("Inside constructor");
    }
    public static Singleton GetObject()
    {
        return obj;
    }
}
    

class Design
{
    public static void main(String aaa[])
    {
        //Singleton bobj= new Singleton();
        Singleton sobj1= Singleton.GetObject();
        Singleton sobj2= Singleton.GetObject();


    }
}
