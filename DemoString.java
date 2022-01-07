import javax.swing.text.Style;

class DemoString
{
	public static void main(String arg[])
	{
		String str1= "Hello";  //1

		String str2= new String("Hello");   //2

		char Arr[]= {'H','e','l','l','o'};   // 3

		String str3= new String(Arr);

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);

		System.out.println("String length is :"+ str1.length());   // Length Method
		System.out.println("Array length is :"+ Arr.length);      // Length Property

		String s1= "Demo";
		String s2= "Demo";
		String s3= "Demo";

		String s4= new String("Demo");
		String s5= new String("Demo");
		String s6= new String("Demo");

		System.out.println(s6.charAt(3));

		for(int j=0; j < s4.length(); j++)
		{
			System.out.println(s4.charAt(j));
		}

		char Brr[]=s6.toCharArray();
		for(int i=0; i< Brr.length; i++)
		{
			System.out.println(Brr[i]);
		}

		String sobj1= "Hello";
		String sobj2= "Hello";
		String sobj3= new String ("Hello");

		if(sobj1 == sobj3)   // Compare the Reference
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("Not equal");
		}

		if(sobj1.equals(sobj3))   // Compare the Data
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("Not equal");
		}
	}

}