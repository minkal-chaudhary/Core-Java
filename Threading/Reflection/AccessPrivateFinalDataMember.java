import java.lang.reflect.*;

class AccessPrivateFinalDataMember
{
public static void main(String [] args)throws Exception
{
Atharv a=new Atharv();
Class c=a.getClass();
//a.x=10;
Field f=c.getDeclaredField("x");
f.setAccessible(true);
System.out.println(f);
System.out.println(f.get(a));
f.set(a,40);
System.out.println(f.get(a));
a.show();
}
}
class Atharv
{
private final int x=1000;
public void show()
{
System.out.println("Show from atharv");
}
}
