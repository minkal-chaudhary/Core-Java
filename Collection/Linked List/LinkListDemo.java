import java.util.*;

class Link<T>
{
public T data;
public Link next;

public Link(T id)
{
data=id;
}
public String toString()
{
return "{"+data+"}";
}
}

class LinkList<T> implements Iterator
{
private Link first;
private int index=0;
public LinkList()
{
first=null;
}
public Iterator iterator()
{
return this;
}
public boolean hasNext()
{
int count=0;
Link current=first;
while(current.next!=null)
{
count++;
current=current.next;
}
if(index<=count)
return true;
else 
return false;
}

public Link next()
{
Link current=first;
for(int i=0;i<index;i++)
{
current=current.next;
}
index++;
return current;
}

public void add(T obj)
{
Link newLink=new Link(obj);

Link current=first;
if(current==null)
{
first=newLink;
newLink.next=null;
}
else{
while(current.next!=null)
{
 current=current.next;
}
current.next=newLink;
newLink.next=null;
}
}


public String toString()
{
Link current=first;
String str="";
while(current.next!=null)
{
str+=current.toString();
current=current.next;
}
str+=current.toString();
return str;
}

public void addFirst(T obj)
{
Link newLink=new Link(obj);
newLink.next=first;
first=newLink;
}

public void addLast(T obj)
{
Link newLink=new Link(obj);
Link current=first;
while(current.next!=null)
{
current=current.next;
}
current.next=newLink;
newLink.next=null;
}
/*
public Link remove()
{
if(first==null)
{
return null;
}
else
{
Link temp=first;
first=first.next;
return temp;
}
}

public Link removeFirst()
{
return remove();
}
*/
public Link removeLast()
{
Link previous=null;
Link current=first;
while(current.next!=null)
{previous=current;
current=current.next;
}
previous.next=null;
return current;
}

public Link getFirst()
{
return first;
}

public Link getLast()
{
Link current=first;
while(current.next!=null)
current=current.next;

return current;
}

public Link get(int p)
{
Link current=first;
for(int i=0;i<p;i++)
{
current=current.next;
}
return current;
}

public Link remove(int p)
{
Link previous=null;
Link current=first;
for(int i=0;i<p;i++)
{
previous=current;
current=current.next;
}
previous.next=current.next;
return current;
}

public Link removeFirstOccurence(T obj)
{
Link previous=null;
Link current=first;
while(current.data!=obj)
{previous=current;
current=current.next;
}
previous.next=current.next;
return current;
}

public Link remove(T obj)
{
return removeFirstOccurence(obj);
}

public boolean isEmpty()
{return first==null;
}


}

class LinkListDemo
{
public static void main(String [] args)
{
LinkList<String> l=new LinkList<>();
l.add("Hello");
l.add("hi");
l.addFirst("first");
l.addLast("last");

System.out.println(l);
System.out.println();
System.out.println(l.isEmpty());
System.out.println();
System.out.println();
Iterator i=l.iterator();
while(i.hasNext())
System.out.println(i.next());

}
}