
public class Testoutertry1 
{

	public static void main(String[] args) 
{
		try
		{
			
		int array[]= {10,20,40};
		System.out.println(array[3]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
		System.out.println("Invalid index:");
		}
				
		finally
		{
			System.out.println("finally block gets excute...");
		

	}
	}

	}


