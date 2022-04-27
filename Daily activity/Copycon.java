class Copycon
{
int empid;
String name;
Copycon(int e, String n)
{
empid=e;
name=n;
}
Copycon()
{
}
void disp()
{
System.out.println(empid+" "+name);
}
public static void main(String args[])
{
Copycon c=new Copycon(10,"carolin");
Copycon c1=new Copycon();
c1.empid=c.empid;
c1.name=c.name;
c.disp();
c1.disp();
}
}
