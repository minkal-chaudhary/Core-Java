import java.util.*;
class ArrayListContains
{
public static void main(String [] args)
{
ArrayList<String> al=new ArrayList<>();
al.add("hi");
al.add("helo");
al.add("gm");
ArrayList<String> al1=new ArrayList<>();
al1.add("hu");
al1.add("gm");
ArrayList al2=new ArrayList();
for(String s:al)
{
al2.add(al1.contains(s)?"Yes":"no");
}
System.out.println(al2);
}
}  