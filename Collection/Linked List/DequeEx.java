import java.util.*;
import java.io.*;

class Link<T>
{
T data;
Link next;
public Link(T ob)
{
data=ob;
}
public String toString()
{
return "{"+data+"}";
}
}
class MyDeque<T>
{
private Link first;

public MyDeque()
{
first=null;
}

public void addFirst(T ob)
{
Link newLink=new Link(ob);
newLink.next=first;
first=newLink;
}

public void addLast(T ob)
{
Link newLink=new Link(ob);
Link current=first;
while(current.next!=null)
{
current=current.next;
}
current.next=newLink;
newLink.next=null;
}

public Link removeLast()
{
Link previous=null;
Link current=first;
while(current.next!=null)
{
previous=current;
current=current.next;
}
previous.next=null;
return current;
}

public Link removeFirst()
{
Link previous=first;
first=first.next;
return previous;
}

public String toString()
{
String str="";
Link current=first;
while(current.next!=null)
{
str+=current;
current=current.next;
}
str+=current;
return str;
}

public boolean isEmpty()
{return first==null;
}
}
class DequeEx
{
public static void main(String [] args)throws IOException
{
MyDeque<String> d=new MyDeque();
while(true)
{
System.out.println();
System.out.println("Options");
System.out.println("1.Insert\n2.Delete\n3.Display\n4.exit");
System.out.println("enter your choice");
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int ch=Integer.parseInt(br.readLine());
switch(ch)
{
case 1:
System.out.println("Insertion at\n1.Front-end\n2.Rear-End\n3.Back");
System.out.println("enter your choice");
int ch1=Integer.parseInt(br.readLine());
switch(ch1)
{
case 1:
System.out.println("enter element to insert");
String s=br.readLine();
d.addFirst(s);
break;

case 2:
System.out.println("enter the element to insert");
String s1=br.readLine();
d.addLast(s1);
break;

case 3:
System.out.println("getting main menu");
break;

default:
System.out.println("wrong Choice");
break;

}
break;

case 2:

System.out.println("Deletion at\n1.Front-end\n2.Rear-End\n3.Back");
System.out.println("enter your choice");
int ch2=Integer.parseInt(br.readLine());

switch(ch2)
{
case 1:
d.removeFirst();
System.out.println("front element removed");
break;

case 2:
d.removeLast();
System.out.println("Rear element removed");

break;

case 3:
System.out.println("getting main menu");
break;

default:
System.out.println("wrong choice");
break;
}
break;

case 3:
if(d.isEmpty())
{
System.out.println("Empty");
break;
}
else
{
System.out.println(d);
break;
}


case 4:
System.exit(0);


}


}
}
}