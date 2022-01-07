import java.lang.*;

class Marvellous
{
    public static void main(String arg[])
    {
        System.out.println("Inside Main");
        Arithematic obj1;  // Reference
        obj1= new Arithematic();  // Dynamic memory allocation
        Arithematic obj2= new Arithematic(21,11);
        int ret =0;
        ret= obj2.Addition();
    	System.out.println("Addition is : "+ret);
    }
}

class Arithematic
{
    // Charecteristic
    public int no1;
    public int no2;
    public Arithematic() // Default Constructor
    {
        this.no1=0;
        this.no2=0;
    }
    public Arithematic(int x, int y) // Parametriesed Constructor
    {
        this.no1=x;
        this.no2=y;
    }
    public int Addition()  // Behavior
    {
        int ans=0;
        ans = this.no1 + this.no2;
        return ans;
    }

    public int Substraction()  // Behavior
    {
        int ans=0;
        ans = this.no1 - this.no2;
        return ans;
    }
}