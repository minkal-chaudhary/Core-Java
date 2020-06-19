import  java.util.*;
import java.util.concurrent.*;
import java.util.Map.Entry;

class ExConcurrentHashMap
{
public static void main(String [] args)
{
HashMap<Integer,Integer> hm=new HashMap<>();

ConcurrentHashMap<Integer,Integer> chm=new ConcurrentHashMap<>();
 hm.put(1,1);
hm.put(2,2);
hm.put(3,3);
hm.put(4,4);
hm.put(5,5);

chm.put(2,2);
chm.put(3,3);
chm.put(4,4);
chm.put(5,5);

Iterator i=chm.entrySet().iterator();
System.out.println("Before "+chm);
while(i.hasNext())
{
Entry e=(Entry)i.next();
int key=(Integer)e.getKey();
if(key==3)
chm.put(7,33);
}
System.out.println("after"+chm);



Iterator i1=hm.entrySet().iterator();
System.out.println("Before "+hm);
while(i1.hasNext())
{
Entry e=(Entry)i1.next();
int key=(Integer)e.getKey();
if(key==3)
hm.put(7,33);
}
System.out.println("after"+hm);
}
}