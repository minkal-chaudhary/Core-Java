class GenArr1<T>
{
T x[];

GenArr1(T x[])
{
this.x=x;
}
void showTypes()
{
System.out.println("Show Types:"+x.getClass().getName());
}
T[] retOb()
{
return x;
}

public static void main(String [] args)
{
GenArr1<?> i[]=new GenArr1<?>[2];
i[0]=new GenArr1<Integer>(new Integer[]{1,2,3,4});
i[0].showTypes();
System.out.println(i[0].retOb().length);
for(int j=0;j<i[0].retOb().length;j++)
{System.out.println(i[0].retOb()[j]);
}
}
}