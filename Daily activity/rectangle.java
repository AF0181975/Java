class testclass1
{
int length=10, breadth=20; 
void disp(int l, int b) 
{ 
 length =l; 
 breadth =b; 
} 
void show() 
{
int area =length*breadth;
System.out.println("area of rectangle"+area);
}
}
class rectangle
{
public static void main(String args[])
{
testclass1 t = new testclass1();
t.show();
}
}
 
      