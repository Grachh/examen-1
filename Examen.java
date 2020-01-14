
public class Examen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [] nif1 = {'0','3','4','4','5','0','8','5','Z'};
		char [] nif2 = {'0','3','4','?','5','0','8','5','Z'};
		char [] nif3 = {'0','3','4','?','8','5','Z'};
		int [] num = {1,2,3};
		
		System.out.println(tieneFormatoNIF(nif1));
		System.out.println(tieneFormatoNIF(nif2));
		System.out.println(tieneFormatoNIF(nif3));
		System.out.println (aNumero (num) );
	}

	public static boolean tieneFormatoNIF (char[] nif)
	{
		return (nif.length == 9) && esCorrectoNumero(nif) && esLetraMayuscula(nif[8]);
	}

	// PROBLEMA DE TIPO TODOS
	public static boolean esCorrectoNumero(char[] nif)
	{
		boolean todosDig = true;
		int i=0;
		while (i < nif.length-1 && todosDig)
		{ 
			if (!esDigito(nif[i]))
				todosDig = false;
			else
				i++;
		}
		return todosDig;
	}

	public static boolean esLetraMayuscula (char caracter){
		return 'A' <= caracter && caracter <= 'Z';
	}
	public static boolean esDigito (char caracter){
		return '0' <= caracter && caracter <= '9';
	}
	
	
	// PROBLEMA DE TIPO SUMA
	public static int aNumero (int [] col)
	{
		int suma = 0;
		for (int i=0; i<col.length; i++)
		{
			suma += col[i]*Math.pow(10,col.length-i-1);
		}
		return suma;
	}

	public static int aDigito (char c)
	{
		return c - '0';
	}
	
	// PROBLEMA DE TIPO MAP
	public static int[] sacarDigitos (char []nif)
	{
		int[] solucion = new int[nif.length-1];
		
		for (int i=0; i<solucion.length; i++)
			solucion[i] = aDigito(nif[i]);
		
		return solucion;
	}
		
	public static int aNum (char [] nif)
	{
		return aNumero(sacarDigitos(nif));
	}
		
}
