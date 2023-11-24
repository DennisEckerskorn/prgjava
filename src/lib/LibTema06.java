package lib;
import java.util.Scanner;
public class LibTema06 {
    public static  Scanner lector = new Scanner(System.in);
    
    public static int solicitarInt (String mensaje){       
        int n;
        System.out.println(mensaje);
        n = Integer.parseInt(lector.nextLine());
        return n;
    }

    public static String solicitarString(String mensaje, int longitudMinima, int longitudMaxima){
		boolean valido;
		String resultado;
		do {
			System.out.println(mensaje);
			resultado = lector.nextLine();
			valido = resultado.length() >= longitudMinima && resultado.length() <= longitudMaxima;
			if(!valido){
				System.out.printf("Error => Longitud mínima: %d, Longitud máxima: %d\n", longitudMinima, longitudMaxima);
			}
		}while(!valido);
		return resultado;
	}
}
