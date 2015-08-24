public class DivisionPorCero
{
	public static void main(String[] args)
	{
		try{
			int r = 1/0;
		}catch(ArithmeticException e){
			System.out.println("Error: division por cero");
		}
	} 
}
