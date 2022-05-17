
class Testexceptionx {

	public static void main(String[] args) {
		try
		{
	try
	{
	int a=1/0;
		}
	catch(ArithmeticException e1)
		{
		System.out.println("First block gets executes..");
		}
		try
		{
			String b=null;
			System.out.println(b.length());
		}
	catch(NullPointerException e2)
		{
		System.out.println("Null pointer exception handled:");
		}
	}
		finally
		{
			System.out.println("Arithmetic Exception handled:");
		}
	    }
		}
        

         
