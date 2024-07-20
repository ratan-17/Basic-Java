import java.util.Scanner;

public class Basic
 {
    void meth1()
    {
       Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       sc.nextLine();
       String s=sc.nextLine();

       System.out.println("int a= "+a);
       System.out.println("String s= "+s);
       System.out.println("-----------------------------------");
    }

    public void meth2(int a,int b)
    {
        if (a<b)
        {
            System.out.println("The value of b is greater : "+ b );
        }
         else
         {
            System.out.println("the Valur of A is greater : "+a);
         }
         System.out.println("-----------------------------------");
    }

    public void loopWhile()
    {
        int i=1;
         while (i<=5)
         {
              System.out.println("Ratan: "+i);
              i=i+1;
         }
         System.out.println("-----------------------------------");
         
    }
     
    public void loopFor()
    {
        int i=1;
        for (;i<=5;)
        {
            System.out.println("Mr. Ratan : "+i );
            i=i+1;
        } 
        System.out.println("-----------------------------------");
    }
     
       public String meth3()
       {

        return new Basic().meth4(" is awesome");
       }

       public String meth4(String s)
       {
        return s;
       }


    public static void main(String[] args)
     {
        Basic base =new Basic();
       base.meth1();
       base.meth2(10, 25);
        base.loopWhile();
      base.loopFor();

      System.out.println("Java"+ base.meth3());
      
      Constructor bobj=new Constructor();
      bobj.meth5();

      System.out.println("-----------------------------------");

      GetSet cobj=new GetSet();
      cobj.setA(10);
      cobj.setB("Shreyas");

      System.out.println("THIS IS MY ROLL NUMBER "+ cobj.getA());
      System.out.println("THIS IS MY NAME "+ cobj.getB());
      System.out.println("-----------------------------------");

      Son son=new Son();
      son.Name();
      son.surname();
    }
 }
