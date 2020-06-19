import java.util.*;
class ArrayList4
{
public static void main(String [] args)
{
String arr[]={"hi","hey"};
List<String> l=Arrays.asList(arr);
System.out.println(l);

ArrayList al=new ArrayList(l);
System.out.println(al);
}
}