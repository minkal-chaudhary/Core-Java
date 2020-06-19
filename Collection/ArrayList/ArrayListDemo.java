import java.util.*;

class ArrayListDemo
{
public static void main(String [] args)
{
MyArrayList<String> al=new MyArrayList<>();
System.out.println(al.size());
System.out.println(al.capacity());
System.out.println(al.isEmpty());
al.add("hi");
al.add("hello");
al.add("welcome");
al.add("bye");
al.add("4");
al.add("5");
al.add("6");
al.add("7");
al.add("8");
al.add("9");
al.add("10");
al.add("11");
System.out.println(al.isEmpty());
System.out.println(al.size());
System.out.println(al.capacity());
al.remove(2);
al.remove(7);
al.set(1,"wuhhuu");
System.out.println(al);
System.out.println(al.size());
System.out.println(al.capacity());
Iterator<String> i=al.iterator();
i.remove();
while(i.hasNext())
{
System.out.println(i.next());
}

}
}
class MyArrayList<T> implements Iterator
{
int next=0;
int capacity;
int size=-1;
int size1;
Object[] obj;
public MyArrayList()
{
capacity=10;
obj=new Object[capacity];
}
public MyArrayList(int i)
{
capacity=i;
obj=new Object[capacity];
}
public int capacity()
{return capacity;
}
public int size()
{return size+1;
}
public void add(T ob)
{
if(size+1==capacity)
{
int tempsize=capacity+(capacity/2);
Object temp[]=new Object[tempsize];
capacity=tempsize;
for(int i=0;i<obj.length;i++)
temp[i]=obj[i];
obj=temp;
}
size++;
obj[size]=ob;
}
public void remove()
{
size--;
}
public Iterator iterator()
{
return this;
}
public Object next()
{
next=next+1;
return obj[next-1];
}  
public boolean hasNext()
{
if(next>size)
return false;
else 
return true;
}
public String toString()
{
String str="[";

for(int i=0;i<=size;i++)
{
if(i==size)
str+=obj[i]+"]";
else
str+=obj[i]+",";
} 
return str;
}
public void addAll(T[] ob)
{
for(int i=0;i<ob.length;i++)
{
add(ob[i]);
}
}
public void remove(int p)
{
Object temp[]=new Object[capacity];
for(int i=0;i<p;i++)
temp[i]=obj[i];
for(int i=p+1;i<=size;i++)
temp[i-1]=obj[i];
size--;
obj=temp;
}
public boolean set(int i,T ob)
{
if(i<0)
return false;
if(i>size)
{
add(ob);
return true;
}

obj[i]=ob;
return true;
}

public boolean isEmpty()
{
return size==-1;
}



}