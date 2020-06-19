class Gen<T>
{
T x;
Gen(T x)
{this.x=x;
}
T returnOb()
{
return x;
}

void showTypes()
{

System.out.println("SHow Type:"+x.getClass().getName());
}
public static void main(String [] args)
{
Gen<Integer> i=new Gen<>(10);
i.showTypes();
System.out.println(i.returnOb());
Gen<String> i1=new Gen<>("abac");
i1.showTypes();
System.out.println(i1.returnOb());
Gen<Emp> i3=new Gen<>(new Emp());
i3.showTypes();
System.out.println(i3.returnOb().e);
}
}
class Emp
{
int e=676;
}
