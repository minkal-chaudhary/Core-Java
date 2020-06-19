class GenArr<T>
{
T x;

GenArr(T x)
{
this.x=x;
}
void showTypes()
{
System.out.println(x.getClass().getName());
}
T retOb()
{
return x;
}

public static void main(String [] args)
{
GenArr<?> i[]=new GenArr<?>[2];
i[0]=new GenArr<Integer>(100);
i[0].showTypes();
System.out.println(i[0].retOb());
}
}