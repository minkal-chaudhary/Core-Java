import java.util.*;
import java.util.Map.*;

class MultiAttributesKeyInHashMap
{
public static void main(String [] args)
{
HashMap<Price,String> hm=new HashMap<>();
hm.put(new Price("banana",20),"banana");
hm.put(new Price("banana",40),"banana");
hm.put(new Price("banana",20),"banana");
hm.put(new Price("mango",50),"mango");
hm.put(new Price("guava",20),"guava");

System.out.println(hm);
Iterator i=hm.entrySet().iterator();
while(i.hasNext())
{
Entry e=(Entry)i.next();
Price p=(Price)e.getKey();
System.out.println(p.price+" "+p.item+":"+e.getValue());
}
}
}
class Price
{
int price;
String item;
Price(String s,int i)
{
price=i;
item=s;
}
public int hashCode()
{
int hashcode=price;
hashcode+=item.hashCode();
return hashcode;
}
public boolean equals(Object o)
{
Price p=(Price)o;
if(this.price==p.price&&this.item.equals(p.item))
return true;
else 
return false;
}
}