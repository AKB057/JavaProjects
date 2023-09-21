package BroCodeProjects;

public class ExceptionCaught 
{
	public static void main(String[] args) {
		try {
			
			int result= divide(10,0);
			
			System.out.println(result);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception");
		}
		catch(Exception e)
		{
			System.out.println("Exception Caught");
		}
		finally {
			System.out.println("Program Ended");
		}
		
	}
	
	public static int divide(int d, int div) throws ArithmeticException
	{
		return div/div;
	}

}
