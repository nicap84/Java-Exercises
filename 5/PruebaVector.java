package practica5;

import java.util.Vector;
import java.util.Random;

class PruebaVector
{
	public static void main (String args[])
	{
		Vector<Integer> v = new Vector<Integer>(5, 3);

    		v.addElement(1);
    		v.addElement(3);
    		v.addElement(5);
    		v.addElement(7);
    		v.addElement(9);
    		v.addElement(11);
    		System.out.println("El tamaño es " + v.size());
    		System.out.println("Capacidad: " + v.capacity());

    		for (Integer i :v)
    		{
        		System.out.println(i);
    		}

    		Vector<Integer> v1 = (Vector<Integer>) v.clone();
		
		int tamanyo = v.size();
    		for (int i=0;i<tamanyo;i++)
    		{
      		System.out.println(v.lastElement());

      		v.removeElementAt(v.size()-1);
    		}

    		System.out.println("(Original) El tamaño es: " + v.size());
    		System.out.println("(Original) Capacidad: " + v.capacity());
    		System.out.println("(Copia) El tamaño es: " + v1.size());
    		System.out.println("(Copia) Capacidad: " + v1.capacity());

    		Random r = new Random();	//Objeto generador de nº aleatorios

    		int i;
    		for (int x=0;x<7;x++)
    		{
        		i = r.nextInt(13);	// Numero aleatorio entre [0-12] 
        		boolean b = v1.contains(new Integer(i));

        		System.out.println("Contiene " + i + " " + b);
    		}
 	}
}