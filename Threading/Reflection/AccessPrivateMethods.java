import java.lang.reflect.*;
 
class AccessPrivateMethods
{
public static void main(String [] args)throws Exception
{
Nick n=new Nick();
Class c=n.getClass();
Method m=c.getDeclaredMethod("div",int.class,int.class);

m.setAccessible(true);
System.out.println(m.getName());
double d=(double)m.invoke(n,10,5);
System.out.println(d);
}
}
class Nick
{
private double div(int a,int b)
{
return a/b;
}
}