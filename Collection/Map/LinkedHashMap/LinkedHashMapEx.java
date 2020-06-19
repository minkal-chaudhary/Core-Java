import java.util.*;
import java.util.Map.Entry;

class LinkedHashMapEx
{
public static void main(String [] args)
{
LinkedHashMap<String,String> hm=new LinkedHashMap(10,.75f);
//LinkedHashMap<String,String> hm=new LinkedHashMap(10,.75f,true);
//to remember the last acces order set boolean order true

hm.put("4","four");
hm.put("2","two");
hm.put("3","three");
System.out.println(hm);
String []st={"2","3","4"};
Iterator i=hm.entrySet().iterator();
while(i.hasNext())
{
System.out.println(i.next());
}
for(int p=0;p<hm.size();p++)
{
System.out.println(hm.get(st[p]));
}
System.out.println(hm);


}}
