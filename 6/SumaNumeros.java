public class SumaNumeros
{
	public static void main(String[] args)
	{
		int suma = 0;
		for (int i=0; i < args.length; i++)
		{
			try{
				int numero = Integer.parseInt(args[i]);
				suma = suma + numero;
			}catch(NumberFormatException e){
				System.out.println("La cadena " + args[i] + " no es un entero");
			}
		}
		System.out.println("La suma es " + suma);
	} 
}
