public class ClassA 
{
    void meth1()
    {
        ClassA aobj1=new ClassA();
        ClassA aobj2=new ClassA();

        System.out.println(aobj1.equals(aobj2));
        System.out.println(aobj1.equals(aobj1));
        System.out.println(aobj1.equals(new ClassA()));
        System.out.println(new ClassA().equals(new ClassA()));
        System.out.println(aobj2.equals(new ClassA()));
        System.out.println(aobj2.equals(aobj2));

        System.err.println("--------------------------");

        System.out.println("getClass() : "+aobj1.getClass());
        System.out.println("getClass() : " +aobj2.getClass());

        System.err.println("--------------------------");

        System.out.println("toString() : "+aobj1.toString());
        System.out.println("toString () : "+aobj2.toString());
    }

    public static void main(String[] args)
    {
        new ClassA().meth1(); 
    }

}
