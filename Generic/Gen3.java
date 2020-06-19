class Gen3<T,V,agog>
{T x;
V y;
agog z;
Gen3(T x,V y,agog z)
{
this.x=x;
this.y=y;
this.z=z;
}
void showTypes()
{
System.out.println(x.getClass().getName());
System.out.println(y.getClass().getName());
System.out.println(z.getClass().getName());
}
T retOb()
{return x;
}
V retOb1()
{
return y;
}
agog retOb3()
{
return z;
}
public static void main(String [] args)
{
Gen3<String,Integer,Character> i=new Gen3<>("minkal",21,'a');
i.showTypes();
System.out.println(i.retOb());
System.out.println(i.retOb1());
System.out.println(i.retOb3());
}
}