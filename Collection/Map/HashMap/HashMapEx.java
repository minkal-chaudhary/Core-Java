import java.util.*;
import java.util.Map.*;

class HashMapEx
{
public static void main(String [] args)
{
HashMap<Emp,String> hm=new HashMap<>();
hm.put(new Emp(10),"Nitin");
hm.put(new Emp(11),"Archit");
hm.put(new Emp(12),"Arpit");
hm.put(new Emp(10),"abc");
Emp e1=new Emp(10);
String s=hm.get(e1);
System.out.println("Value at index 10 "+s);

System.out.println(hm);
Iterator i=hm.entrySet().iterator();
while(i.hasNext())
{
Entry e=(Entry)i.next();
Emp e2=(Emp)e.getKey();
System.out.println(e2.id+" "+e.getValue());
}
//Emp e=new Emp(11);
hm.remove(e1);
System.out.println(hm);
System.out.println(hm.isEmpty());
hm.clear();
System.out.println(hm);
}
}
class Emp
{
int id;
public Emp(int id)
{
this.id=id;
}
public int hashCode()
{
return id*10;
}
public boolean equals(Object o)
{
Emp e=(Emp)o;
if(e.id==this.id)
return true;
else 
return false;
}
}