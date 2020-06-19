import java.util.*;

class LinkedListDemo
{
public static void main(String [] args)
{
LinkedList<String> l=new LinkedList();
System.out.println(l.size());
l.add("hello");
l.addFirst("first");
l.addLast("last");
System.out.println(l);
System.out.println(l.size());
l.removeFirst();
l.removeLast();
l.push("hi");
l.pop();
System.out.println(l);
System.out.println(l.size());
}
}                               