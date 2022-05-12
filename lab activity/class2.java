import java.util.*;
import java.util.Scanner;
interface class1
{
void disp();
}
class class2 implements class1 
{
@Override
void disp()
{
int x,y,sum,sub,mul,div;
Scanner p=new Scanner(System.in);
System.out.println("Enter first number");
x=p.nextInt();
System.out.println("Enter second number");
y=p.nextInt();
sum=x+y;
System.out.println("Addition of two numbers is " + sum);
sub=x-y;
System.out.println("Subtraction of two numbers is " + sub);
mul=x*y;
System.out.println("Multiplication of two numbers is " + mul);
div=x/y;
System.out.println("Division of two numbers is " + div);
}
public static void main(String args[]) 
{
class2 a = new class2();
a.disp();
}
}
}