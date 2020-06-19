import java.util.*;
import java.util.Map.Entry;

class TreeMapEx
{
public static void main(String [] args)
{
TreeMap<Integer,String> ts=new TreeMap<>();
ts.put(2,"two");
ts.put(1,"one");
ts.put(5,"five");
ts.put(4,"four");
System.out.println(ts);
Iterator i=ts.entrySet().iterator();
while(i.hasNext())
{
System.out.println(i.next());
}
}
}