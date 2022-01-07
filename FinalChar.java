
class FinalChar
{
    public static void main(String Arg[])
    {
        Demo obj = new Demo();
        System.out.println("Value of j:"+obj.j);
        //obj.j++;
    }
}

//j++
//j = j + 1;


class Demo
{
    public int i;
    public final int j;

    public Demo()
    {
        i=20;
        j=11;
    }
}
