class Thread1 implements Runnable
{
public void run()
{
}
}

class Thread2 implements Runnable
{
public void run()
{
}
}

class Thread3 implements Runnable
{
public void run()
{
}
}
class Priority
{
public static void main(String [] args)
{Thread main=Thread.currentThread();
System.out.println(main.getPriority());
main.setPriority(10);

Thread1 t1=new Thread1();
Thread2 t2=new Thread2();
Thread3 t3=new Thread3();
Thread a1=new Thread(t1); 
Thread a2=new Thread(t2);
Thread a3=new Thread(t3);

System.out.println(a1.getPriority());
System.out.println(a2.getPriority());
System.out.println(a3.getPriority());
a1.setPriority(5);
System.out.println(a1.getPriority());
System.out.println(main.getPriority());
}
}