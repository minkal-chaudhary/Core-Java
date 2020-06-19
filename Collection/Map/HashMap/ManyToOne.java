import java.util.*;
import java.util.Map.*;

class ManyToOne
{
public static void main(String [] args)
{
HashMap<Integer,List<String>> hm=new HashMap<>();
add(hm,1,"one");
add(hm,1,"two");
add(hm,2,"three");
add(hm,2,"four");
add(hm,3,"five");
System.out.println(hm);
}
public static void add(Map<Integer,List<String>> hm,int key,String value)
{
if(hm.containsKey(key))
{
List l=hm.get(key);
l.add(value);
}
else
{
List<String> l=new ArrayList<>();
l.add(value);
hm.put(key,l);
}
}
}

