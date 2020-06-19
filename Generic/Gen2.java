class Gen2<T,V>
{
T x;
V y;
Gen2(T x,V y)
{
this.x=x;
this.y=y;
}
void showTypes()
{
System.out.println(x.getClass().getName());
System.out.println(y.getClass().getName());
}
T returnob()
{
return x;
}
V returnob1()
{
return y;
}
public static void main(String [] args)
{
Gen2<Integer,String> i=new Gen2<>("billlu","illuu");
i.showTypes();
System.out.println(i.returnob());
System.out.println(i.returnob1());
}
}