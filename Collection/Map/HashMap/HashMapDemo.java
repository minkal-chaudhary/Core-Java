import java.util.*;
import java.util.Map.*;
/* no such Element Exception is thrown when i.next() is called and there is no such element*/

class HashMapDemo
{
public static void main(String [] args)
{
HashMap<String,String> hm=new HashMap<>();
//Hashtable hm=new Hashtable<>();
System.out.println(hm.size());
hm.put("1001","aaaa");
hm.put("1001","bbbb");
hm.put("1003","cccc");
hm.put("1004","dddd");
//hm.put(null,null);
//hm.put("101",null);
System.out.println(hm);
Iterator i=hm.entrySet().iterator();
while(i.hasNext())
{
//System.out.println(i.next());
Entry m=(Entry)i.next();
System.out.println((String)m.getKey()+" "+(String)m.getValue());
//String s=(String)m.getKey();
//System.out.println(s);
}
System.out.println(hm.size());
}
}


