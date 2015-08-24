class FraccionException extends Exception
{
	private String descripcion;

	public FraccionException()
	{
		descripcion = "Fraccion con denominador = 0";		
	}

	public String getDescripcion()
	{ 
		return descripcion; 
	}

	public String getMessage()
	{
		return descripcion;
	}
}

public class Fraccion
{
	private int numerador;
	private int denominador;

	public Fraccion(int num, int den) throws FraccionException
	{
		if (den == 0) throw new FraccionException();
		numerador = num;
		denominador = den;
	}

	public int getNumerador()
	{ 
		return numerador;  
	}

	public int getDenominador()
	{  
		return denominador; 
	}

	public Fraccion sumar(Fraccion f) throws FraccionException
	{
		int num = (this.numerador * f.denominador) + (f.numerador * this.denominador);
		int den = this.denominador * f.denominador;
		return new Fraccion(num,den);
	}

	public Fraccion restar(Fraccion f) throws FraccionException
	{
		int num = (this.numerador * f.denominador) - (f.numerador * this.denominador);
		int den = this.denominador * f.denominador;
		return new Fraccion(num,den);
	}

	public Fraccion multiplicar(Fraccion f)
	{
		try{
			int num = this.numerador * f.numerador;
			int den = this.denominador * f.denominador;
			return new Fraccion(num,den);
		}catch(FraccionException e){
			// Se puede tratar así porque nunca se va a producir la excepcion
			return null;
		}
	}

	public Fraccion dividir(Fraccion f) throws FraccionException
	{  
		if ((this.denominador == 0) || (f.numerador == 0)) throw new FraccionException();
		int num = this.numerador * f.denominador;
		int den = this.denominador * f.numerador;
		return new Fraccion(num,den);
	}

	public void visualizar()
	{
		System.out.println(numerador + " / " + denominador);
	}

	public static void main(String[] args)
	{
		Fraccion f1,f2,f3;
		try{
			f1 = new Fraccion(1,0);
		}catch(FraccionException e){
			System.out.println(e.getMessage());
		}
		try{
			f1 = new Fraccion(3,2);
			f2 = new Fraccion(0,2);
			f3 = f1.sumar(f2);
			f3.visualizar();
			f3 = f1.restar(f2);
			f3.visualizar();
			f3 = f1.multiplicar(f2);
			f3.visualizar();
			f3 = f1.dividir(f2);
			f3.visualizar();
		}catch(FraccionException e){
			System.out.println(e.getMessage());
		}
		try{
			f1 = new Fraccion(4,3);
			f2 = new Fraccion(1,2);
			f3 = f1.sumar(f2);
			f3.visualizar();
			f3 = f1.restar(f2);
			f3.visualizar();
			f3 = f1.multiplicar(f2);
			f3.visualizar();
			f3 = f1.dividir(f2);
			f3.visualizar();
		}catch(FraccionException e){
			System.out.println(e.getMessage());
		}	
	} 
}
