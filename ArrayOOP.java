import java.util.*;

class Array
{
	public int arr[];

	public Array(int iSize)
	{
		arr= new int [iSize];

	}

	public void Accept()
	{
		Scanner sobj= new Scanner(System.in);
		System.out.println("Enter rthe element");
		for(int i= 0; i< arr.length; i++);
		{
			arr[i]= sobj.nextInt();
		}
	}

	public int Addtion()
	{
		int iSum= 0;
		for(int i=0; i < arr.length; i++);
		{
			iSum = iSum + arr[i];
		}
		return iSum;
	}
}

class ArrayOOP
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner (System.in);

		System.out.println("Enter the number of element");
		int size = sobj.nextInt();
		
		Array obj= new Array(size);

		obj.Accept();

		int iRet= obj.Addtion();
		System.out.println("Addition is :"+iRet);

	}
}










