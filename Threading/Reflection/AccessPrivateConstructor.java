import java.lang.reflect.*;

class AccessPrivateConstructor
{
public static void main(String [] args)throws Exception
{
Jim j=new Jim();
Class c=j.getClass();
Constructor cs=c.getDeclaredConstructor();
cs.setAccessible(true);
Jim p=(Jim)cs.newInstance();
p.show();
Constructor cs1=c.getDeclaredConstructor(int.class);
cs1.setAccessible(true);
Jim p1=(Jim)cs1.newInstance(10);
p1.show();
}
}
class Jim
{
Jim()
{
System.out.println("default Constructor");
}
private Jim(int a)
{
System.out.println(a+"Parameterise constructor");
}
public void show()

{System.out.println("Show from jim");
}
}