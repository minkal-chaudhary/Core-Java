import java.util.*;
import java.util.Map.Entry;
import java.util.Map.*;

class TreeMapComp
{
public static void main(String [] args)
{
NavigableMap<Emp,String> ts=new TreeMap<>(new SalaryComp());
ts.put(new Emp(43,"jan"),"one");
ts.put(new Emp(42,"mac"),"two");
ts.put(new Emp(67,"bani"),"three");
ts.put(new Emp(8,"jon"),"four");
ts.put(new Emp(65,"abc"),"five");
ts.put(new Emp(9,"bcd"),"six");
ts.put(new Emp(77,"efg"),"seven");
//ts.pollLastEntry();
//Entry a=(Entry)ts.lastEntry();

Emp a1=(Emp)ts.higherKey(new Emp(65,"abc"));
System.out.println(a1.salary+" : ");
SortedMap m=ts.subMap(new Emp(43,"jan"),new Emp(65,"abc"));
//Map m=ts.headMap(new Emp(43,"jan"),true);
//Map m=ts.tailMap(new Emp(43,"jan");
//System.out.println(ts);
//Map m=ts.descendingMap();
Iterator i=m.entrySet().iterator();

while(i.hasNext())
{
Entry e=(Entry)i.next();
Emp e1=(Emp)e.getKey();
System.out.println(e1.salary+"="+e1.name+"  :"+e.getValue());
}
}
}
class Emp
{
int salary;
String name;
Emp(int salary,String name)
{
this.name=name;
this.salary=salary;
}
public int getsalary()
{
return salary;
}
public String getName()
{return name;
}
}

class SalaryComp implements Comparator
{
public int compare(Object o1,Object o2)
{
Emp e1=(Emp)o1;
Emp e2=(Emp)o2;
if(e1.salary>e2.salary)
return 1;
else if(e1.salary<e2.salary)
return -1;
else
return 0;
}
}
class NameComp implements Comparator
{
public int compare(Object o1,Object o2)
{
Emp e1=(Emp)o1;
Emp e2=(Emp)o2;
return e1.name.compareTo(e2.name);
}}