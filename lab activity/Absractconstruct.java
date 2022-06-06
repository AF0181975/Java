package absractconstruct;
abstract class Content {
 int a;
 public Content(int a)

 {
  
this.a = a;

 }

 abstract int multiply(int val);
}

class GFG extends Content {

 GFG()

 {

     super(2);

 }

 public int multiply(int val)

 {

     return this.a * val;

 }
}
public class Absractconstruct {

 public static void main(String args[])

 {
     Content c = new GFG();
     System.out.println(c.multiply(3));

 }
}
