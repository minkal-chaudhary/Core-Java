import java.util.*;

class HashSetEx
{
public static void main(String [] args)
{
HashSet<String> al=new HashSet<>();
System.out.println(al.size());
al.add("hi1");
al.add("hi2");
al.add("Hi3");
System.out.println(al.size());
System.out.println(al);
al.add("hi1");
System.out.println(al.size());
//System.out.println(al.remove(new String("hi2")));
al.remove("hi1");
System.out.println(al);
}
}
