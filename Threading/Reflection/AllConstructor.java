import java.lang.reflect.*;

class AllConstructor
{
public static void main(String [] args)
{
//String s=new String("hi");
Comp cu=new Comp(10);

printAllConstructor(cu);
}
public static void printAllConstructor(Object o)
{
Class c=o.getClass();
Constructor []cs=c.getConstructors();
for(int i=0;i<cs.length;i++)
{
System.out.print(cs[i].getName()+"(");
Class []p=cs[i].getParameterTypes();
for(int j=0;j<p.length;j++)
{
System.out.print(p[j].getName() + ",");
}
System.out.println(")");
}
}
}
class Comp
{
public Comp()
{}
public Comp(int x)
{}
public Comp(int x,int y)
{}
}