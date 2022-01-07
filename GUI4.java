import java.awt.*;

class GUI4
{
	public static void main(String arg[])
	{
		MarvellousWindow mobj1= new MarvellousWindow("Fisrt", 500,500);
		MarvellousWindow mobj2= new MarvellousWindow("Second", 200,200);

		
	}
}

class MarvellousWindow extends Frame
{
	public MarvellousWindow(String str, int x, int y)
	{
		super();
		setSize(x,y);
		setVisible(true);
		setTitle(str);
	}
}








