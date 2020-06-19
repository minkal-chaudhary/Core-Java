import java.util.*;

class HashMapDemo2
{
public static void main(String [] args)
{
HashMap<Emp,String> hm=new HashMap<>();
hm.put(new Emp(1001),"aaaa");
hm.put(new Emp(1001),"bbbb");
hm.put(new Emp(1003),"cccc");
hm.put(new Emp(1004),"dddd");
//System.out.println(hm);
Iterator i=hm.entrySet().iterator();
while(i.hasNext())
{
//System.out.println(i.next());
Map.Entry m=(Map.Entry)i.next();
Emp e=(Emp)m.getKey();
System.out.println(e.id+"="+m.getValue());

}
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
System.out.println("HashCode");
return 10*id;
}
public boolean equals(Object e)
{
System.out.println("Equals");
Emp c=(Emp)e;
if(c.id==this.id)
{return true;
}
else
return false;
}
}

