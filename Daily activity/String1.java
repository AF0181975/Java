import java.util.Scanner;
class String1
{
public static void main(String args[])
{
String a,b="";
int length;
Scanner s=new Scanner(System.in);
System.out.println("Enter the string:");
a=s.nextLine();
length=a.length();
for(int i=length-1;i>=0;i--)
{
char ch;
ch=a.charAt(i);
b=b+ch;
}
System.out.println("Reverse string is:"+b);
}
}