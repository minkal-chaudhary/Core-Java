import java.util.*;
import java.util.Map.Entry;

class TreeMapEx2
{
public static void main(String [] args)
{
TreeMap<Emp,String> ts=new TreeMap<>();
ts.put(new Emp(23),"23");
ts.put(new Emp(27),"34");
ts.put(new Emp(11),"11");
ts.put(new Emp(43),"43");

System.out.println(ts);
Iterator i=ts.entrySet().iterator();
while(i.hasNext())
{
Entry e=(Entry)i.next();
Emp e1=(Emp)e.getKey();
System.out.println(e1.salary+"="+e.getValue());
}
}
}
class Emp implements Comparable
{
int salary;
public Emp(int s)
{salary=s;
}
public int compareTo(Object o)
{
Emp e=(Emp)o;
if(this.salary<e.salary)
return -1;
else if(this.salary>e.salary)
return 1;
else
return 0;
}
}
