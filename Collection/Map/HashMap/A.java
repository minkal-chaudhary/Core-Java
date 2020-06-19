class ArrayDemo
{
public static void hey()
{
String arr[]=new String[10];
for(int i=0;i<10;i++)
System.out.println(arr[i]);
}
public class Demo
{
public void nested()
{
System.out.println("NEsted class");
}
}
}
class A
{
public static void main(String [] args)
{
//ArrayDemo ad=new ArrayDemo();
//ad.hey();
Demo d=new Demo();
d.nested();
}
} 