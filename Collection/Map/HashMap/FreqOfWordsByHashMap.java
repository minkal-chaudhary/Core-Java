import java.util.*;

class FreqOfWordsByHashMap
{
public static void main(String [] args)
{
String s="this is the test is the name of the test";
String [] ss=s.split(" ");

HashMap<String,Integer> hm=new HashMap<>();

for(int i=0;i<ss.length;i++)
{
if(hm.containsKey(ss[i]))
{
int count=hm.get(ss[i]);
count++;
hm.put(ss[i],count);
}
else
{
hm.put(ss[i],1);
}
}
System.out.println(hm);
}
}