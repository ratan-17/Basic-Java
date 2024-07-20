public class Constructor 
{
     public int a;
     public String b;

     public Constructor()
    {
        a=45;
        b="Ratan";
    }

    public void meth5()
    {
        System.out.println("the value of a= "+this.a);
        System.out.println("the value of b= "+this.b);
    }
 
    public static void main(String[] args) 
    {
        Constructor aobj=new Constructor();
        //aobj.meth1();

    }
}
