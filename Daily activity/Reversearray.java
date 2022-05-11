import java.util.Scanner;
class Reversearray
{
public static void main(String args[])
{
int a[]=new int[5];
Scanner s=new Scanner(System.in);
for(int i=0;i<5;i++)
{
System.out.println("Enter the values of array:");
a[i]=s.nextInt();
}
System.out.println("Array number in reverse order :");
for(int i=4;i>=0;i--)
{
System.out.println(a[i]);
}
}
}

