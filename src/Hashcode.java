public class Hashcode
{

    void meth1()
    {
        System.out.println("meth1() called");
    }


    public static void main(String[] args) 
   {
         Hashcode aobj1=new Hashcode();
         Hashcode aobj2=new Hashcode();

         int aobj1code=aobj1.hashCode();
         int aobj2code=aobj2.hashCode();

         System.out.println("aobj1 hashcode : "+aobj1code);
         System.out.println("aobj2 hashocde : "+aobj2code);
    }
}