class Thread1 extends Thread
{
Thread1(String s)
{
super(s);
}
public void run()
{
System.out.println(getName());
try{
Thread.sleep(6000);
}catch(Exception e){System.out.println(e);}
System.out.println(getName()+"dead");
}
}
class Thread2 extends Thread
{Thread t;
Thread2(String s,Thread1 t)
{super(s);
this.t=t;
}
public void run()
{
System.out.println(getName());
try{
t.interrupt();

t.join();
}catch(Exception e1){System.out.println(e1);}
System.out.println(getName());
}
}
class Interrupt
{
public static void main(String... s)
{
Thread1 t=new Thread1("First");
t.setPriority(10);
Thread2 t2=new Thread2("second",t);
t.start();
t2.start();
}
}
