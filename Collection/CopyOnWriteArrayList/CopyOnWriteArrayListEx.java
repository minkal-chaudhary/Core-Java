import java.util.*;
import java.util.concurrent.*;


class CopyOnWriteArrayListEx
{
public static void main(String [] args)
{
ArrayList<String> al=new ArrayList<>();
//CopyOnWriteArrayList<String> al=new CopyOnWriteArrayList<>();
al.add("a");
al.add("b");
al.add("c");

Th1 t=new Th1(al);
Thread tt1=new Thread(t);

//tt1.start();

Th2 t1=new Th2(al);
Thread tt2=new Thread(t1);
tt1.start();
tt1.setPriority(10);
tt2.start();
try
{

tt1.join();
tt2.join();
}catch(Exception e3){}
System.out.println(al);
}
}
class Th1 implements Runnable
{

ArrayList<String> al;
//CopyOnWriteArrayList<String> al;
public Th1(ArrayList<String> al)
{
this.al=al;
}
public void run()
{
Iterator i=al.iterator();
while(i.hasNext())
{
System.out.println(i.next());
try
{
Thread.sleep(4000);
}catch(Exception e)
{System.out.println(e);
System.exit(0);
}
//System.out.println(i.next());
}
}
}
class Th2 implements Runnable
{
ArrayList<String> al;
//CopyOnWriteArrayList<String> al;
public Th2(ArrayList<String> al)
{
this.al=al;
}
public void run()
{
for(int i=0;i<5;i++)
{
al.add("america");
try
{
Thread.sleep(110);
}catch(Exception e4)
{System.out.println(e4);
}
al.add("cannada");
}
}
}
