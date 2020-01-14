
public class Examen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [] nif1 = {'0','3','4','4','5','0','8','5','Z'};
		char [] nif2 = {'0','3','4','?','5','0','8','5','Z'};
		char [] nif3 = {'0','3','4','?','8','5','Z'};
		
		System.out.println(tieneFormatoNIF(nif1));
		System.out.println(tieneFormatoNIF(nif2));
		System.out.println(tieneFormatoNIF(nif3));
	}

	public static boolean tieneFormatoNIF (char[] nif)
	{
		return (nif.length == 9) && esCorrectoNumero(nif) && esLetraMayuscula(nif[8]);
	}

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

}
