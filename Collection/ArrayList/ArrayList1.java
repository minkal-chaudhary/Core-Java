import java.util.*;
class ArrayList1
{
public static void main(String s[])
{
//ArrayList<String>  al=new ArrayList<String>();
ArrayList  al=new ArrayList();
System.out.println(al.size());
al.add(null);
al.add(null);
al.add("a");
al.add("b");
al.add(new Integer(10));
System.out.println(al.size());
al.remove(2);
System.out.println(al.size());
System.out.println(al);
}
}


