import java.util.Scanner;

class Demo3
{
    public static void main(String Arg[])
    {
        Scanner sobj= new Scanner (System.in);
        System.out.println("Enter Redius");
        float value=sobj.nextFloat();
        Marvellous mobj=new Marvellous();
        float fret=0.0f;
        fret=mobj.area(value);
        System.out.println("Area is:"+fret);
        fret=mobj.circumfarance(value);
        System.out.println("circumfaranceis:"+fret);
        System.out.println("Valaue of PI:"+Circle.PI);
        // Circle.PI=6.14f; // error. this is final
    }
}

interface Circle
{
    float PI=3.14f;  //  public static final
    float area(float radius);  // public abstract
    float circumfarance(float radius);
}

class Marvellous implements Circle
{
    public float area(float radius)
    {
        float ret=0.0f;
        ret=PI * radius*radius;
        return ret;
    }
    public float circumfarance(float radius)
    {
        float ret=0.0f;
        ret=2*PI*radius;
        return ret;
    }
}