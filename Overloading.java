import java.lang.*;


class Overloading
{
    public static void main (String Arg[])
    {
        System.out.println("Inside main");
        Demo obj;    // reference

        obj = new Demo();

        System.out.println("Addition of 2 Integer :" +obj.Add(10.5,11.3));
        System.out.println("Addition of 2 Float" +obj.Add(10.5f , 11.3f));
    }
}


class Demo
{
    //Overloading by changing the data type
    public int Add(int no1, int no2)
    {
        System.out.println("Inside first Add");
        return no1 + no2;
    }

    public float Add(float no1, float no2)
    {
        System.out.println("Inside Second Add");
        return no1 + no2;
    }
}