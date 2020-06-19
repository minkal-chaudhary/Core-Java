import java.util.*;
import java.util.Map.Entry;
import java.util.Map.*;

class HashMapVsIdentityHashMap
{
public static void main(String [] args)
{
HashMap<String,String> hm=new HashMap<>();
IdentityHashMap<String,String> ihm=new IdentityHashMap<>();

hm.put(new String("swing"),"java");
hm.put("swing","awt");

System.out.println(hm);


ihm.put(new String("swing"),"java");
ihm.put("swing","awt");
ihm.put("swing","javax");


ihm.put(new String("swing"),"java");

System.out.println(ihm);
}
}



