import java.util.Scanner;
public class Grade_Revision
{
    String name;
    int bas;
    int expn;
    double inc;
    double nbas;
    Grade_Revision()
    {
        name  = "";
        bas = 0;
        expn = 0;
        inc = 0.0;
        nbas = 0.0;
        
    }
    public void accept()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter name , basic and experience");
        name = sc.next();
        bas = sc.nextInt();
        expn = sc.nextInt();
        
    }
    public void increment()
    {
        if(expn <= 3)
        inc = 1000.0 + (10.0/100.0) * bas;
        else if(expn >=3 && expn <=5)
        inc = 3000.0 + (12.0/100.0) * bas;
        else if(expn <=5 && expn >= 10)
        inc = 5000.0 + (15.0/100.0) * bas;
        else
        inc = 8000.0 + (20.0/100.0) * bas;
        nbas = bas +inc;
    }
    public void display()
    {
        System.out.println("name = "+name);
        System.out.println("basic salary = "+bas);
        System.out.println("experience = "+expn);
        System.out.println("increment = "+inc);
        System.out.println("new basic salary"+nbas);
        
        
    }
    public static void main()
    {
        Grade_Revision ob = new Grade_Revision();
        ob.accept();
        ob.increment();
        ob.display();
    }
}