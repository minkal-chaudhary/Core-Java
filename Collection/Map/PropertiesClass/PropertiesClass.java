import java.util.*;
import java.io.*;

class PropertiesClass
{
//FileInputStream fi=null;
public static void loadProp()
{
Properties p=new Properties();
try
{
FileInputStream fi=new FileInputStream("app.properties");
p.load(fi);

Enumeration e=p.propertyNames();
while(e.hasMoreElements())
{
String key=(String)e.nextElement();
String v=p.getProperty(key);
System.out.println(key+v);
}
}catch(Exception e)
{
System.out.println(e);
}
}
public static void main(String []args)
{
loadProp();
}
}
