interface I
{
void disp();
}
class Child implements I
{
public void disp()
{
System.out.println("Interface method...");
}
public static void main(String args[])
{
Child c=new Child();
}
}