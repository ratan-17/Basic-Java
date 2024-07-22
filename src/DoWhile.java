public class DoWhile 
{
    void meth()
    {
        int i=1;

        do
        {
            System.out.println("Ratan : "+i);
            i++;

        }
          while(i<5);
    }

    void meth6()
    {
        int a=1;
        while (a<5)
         {
            System.out.println("Shreyas : "+a);
            a++;
        }
    }

    public static void main(String [] args)
    {
        new DoWhile().meth();
        new DoWhile().meth6();
    }
    
}
