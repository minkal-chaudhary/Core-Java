import java.util.Date;
class Thread1 extends Thread
{
Thread1(String s)
{
super(s);
}
public void run()
{
for(int i=0;i<20;i++)
{
try{
Thread.sleep(2000);
}catch(Exception e){System.out.println(e);}
System.out.println(Thread.currentThread().getName()+new Date());
}
System.out.println(Thread.currentThread().getName()+":dead");
}}

class Thread2 extends Thread
{
Thread2(String s)
{
super(s);
}
public void run()
{
for(int i=0;i<7;i++)
{
try{
Thread.sleep(2000);
}catch(Exception e){System.out.println(e);}
System.out.println(Thread.currentThread().getName()+new Date());
}
System.out.println(Thread.currentThread().getName()+":dead");
}}

class Thread3 extends Thread
{
Thread3(String s)
{
super(s);
}
public void run()
{
for(int i=0;i<10;i++)
{
try{
Thread.sleep(2000);
}catch(Exception e){System.out.println(e);}
System.out.println(Thread.currentThread().getName()+new Date());
}
System.out.println(Thread.currentThread().getName()+":dead");
}}
class JoinEx
{
public static void main(String []args)
{
Thread1 t1=new Thread1("first");
Thread2 t2=new Thread2("Second");
Thread3 t3=new Thread3("third");
t1.start();
t2.start();
t3.start();
try{
t1.join();
}catch(Exception e){System.out.println(e);}

//t2.start();
try{
t2.join();
}catch(Exception e){System.out.println(e);}

//t3.start();
try{
t3.join();
}catch(Exception e){System.out.println(e);}
System.out.println("main exiting");
}
}