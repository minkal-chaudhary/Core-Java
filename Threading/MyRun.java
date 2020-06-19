class Thread1 implements Runnable
{
public void run()
{

for(int i=0;i<5;i++)
{
try{
Thread.sleep(2000);
}
catch(Exception e){System.out.println(e);}
System.out.println(Thread.currentThread().getName());
}
System.out.println(Thread.currentThread().getName()+"dead");
}
}
class MyRun
{
public static void main(String []args)
{
Thread1 t1=new Thread1();
Thread tt1=new Thread(t1,"First");
tt1.start();
Thread tt2=new Thread(t1,"Second");
tt2.start();
}
}