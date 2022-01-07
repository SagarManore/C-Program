import java.util.*;

class LLStudents
{
    public static void main(String arg[])
    {
        LinkedList <Student> lobj = new LinkedList<Student>();
        lobj.add(new Student("Amit",121,21));
        lobj.add(new Student("Sagar",221,25));
        lobj.add(new Student("Pooja",251,26));

        Student ref=null;

        Iterator<Student> iobj= lobj.iterator();
        while(iobj.hasNext())
        {
            ref=iobj.next();
            ref.Display();
        }
        lobj=null;
        iobj=null;
        ref=null;

    }
}

class Student
{
    public String name;
    public int RID;
    public int Age;

    public Student(String a, int b, int c)
    {
        this.name=a;
        this.RID=b;
        this.Age=c;
    }

    public void Display()
    {
        System.out.println("Student Name"+this.name+"RID :"+this.RID+"Age :"+this.Age);

    }
}