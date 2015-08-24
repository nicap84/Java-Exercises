package practica5;

import java.util.Random;

class PruebaString
{
 	public static void main(String args[])
  	{
    		String s = new String("Esta es una prueba para el tratamiento de objetos de tipo String ");

    		int vocales[]=new int[5];
    		for (int i=0;i<s.length();i++)
    		{
      		switch (s.charAt(i))
      		{
          			case 'a': vocales[0]++; break;
          			case 'e': vocales[1]++; break;
          			case 'i': vocales[2]++; break;
          			case 'o': vocales[3]++; break;
          			case 'u': vocales[4]++;
      		}
    		}
    		for (int i=0;i<5;i++) System.out.println(vocales[i]);
    
    		int ini = 0;
		int fin = 0;
		boolean finalString = false;
    		while (!finalString)
    		{
      		fin = s.indexOf(" ",ini);
			if (fin == -1){
				finalString = true;
			}else{
      			System.out.println(s.substring(ini,fin));
      			ini = fin+1;
			}
    		}
    		
		Random r = new Random();

    		String frase = new String("Números generados: [ ");
    		for (int x=0;x<10;x++)
    		{
      		int i = r.nextInt(20001);
        		frase = frase.concat(String.valueOf(i));
        		frase = frase.concat(" ");
    		}
    		frase = frase.concat("]");
    		System.out.println(frase);
  	}
}