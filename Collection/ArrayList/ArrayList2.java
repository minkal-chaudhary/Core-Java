import java.util.*;
class ArrayList2
{
public static void main(String [] args)
{
ArrayList<Integer> al=new ArrayList<Integer>();
int [] arr={-1,-3,-5,0,1,3,6};
for(int j=0;j<arr.length;j++)
{
al.add(arr[j]);
}
System.out.println(al);
Iterator<Integer> i=al.iterator();
while(i.hasNext())
{
Integer z=i.next();
if(z.intValue()<0)
i.remove();
}
System.out.println(al);

Object o[]=al.toArray();
for(Integer in:al)
System.out.println(in);

for(int j=0;j<o.length;j++)
{
System.out.println(o[j]);
Integer p=(Integer)o[j];
System.out.println(p);
System.out.println(p.intValue());
}
}
}