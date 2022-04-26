import java.util.Scanner;
class arithmetic
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter first number");
int a=s.nextInt();
System.out.println("Enter second number");
int b=s.nextInt();
System.out.println("addition of two numbers:"+(a+b));
System.out.println("subtraction of two numbers:"+(a-b));
System.out.println("multipication of two numbers:"+(a*b));
System.out.println("division of two numbers:"+(a/b));
System.out.println("module of two numbers:"+(a%b));
}
}