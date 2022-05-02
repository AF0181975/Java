class Test	
{
static int a=1;
Test()
{
a++;
System.out.println(a);
}
public static void main(String args[])
{
Test t=new Test();
Test t1=new Test();
Test t2=new Test();
Test t3=new Test();
}
}