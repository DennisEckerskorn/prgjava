package lib;
import java.util.Scanner;
import java.util.Random;


public class LibEntradaSalida {
    private static  Scanner lector = new Scanner(System.in);
	private static Random rnd = new Random();
	
    
	//Función para devolver un numero aleatorio entre un rango min y max.
	public static int random(int min, int max){
		return rnd.nextInt(max - min + 1) + min;
	}

	//Función para devolver un numero aleatorio entre un rango min y max con decimales.
	public static double random(double min, double max){
		return rnd.nextDouble() * (max - min) + min;
	}

	//Función para leer un String, validando valor min y max.
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

	//Función para leer un caracter, FALTA VALIDAR Y ACABAR.
	public static char solicitarCaracter(String mensaje, char op1, char op2){
		char resultado;
		boolean valido;
		do{
			System.out.println(mensaje);
			resultado = lector.nextLine().toLowerCase().charAt(0);
			valido = resultado == Character.toLowerCase(op1) || resultado == Character.toLowerCase(op2);
			if(!valido){
				System.out.printf("Error => El carácter debe ser %c o %c\n", op1, op2);
			}
		}while(!valido);
		return resultado;
	}

	//Función para leer un Entero, validando valor min y max.
	public static int solicitarEntero(String mensaje, int valorMin, int valorMax){
		boolean valido;
		int resultado;
		do{
			System.out.println(mensaje);
			resultado = Integer.parseInt(lector.nextLine());
			valido = (resultado >= valorMin && resultado <= valorMax);
			if (!valido){
				System.out.printf("Error => Valor mínimo: %d, Valor máximo: %d\n", valorMin, valorMax);
			}
		}while (!valido);
		return resultado;
	}

	//Función para leer un Double, validando valor min y max.
	public static double solicitarFloat(String mensaje, float valorMin, float valorMax){
		boolean valido;
		float resultado;
		do{
			System.out.println(mensaje);
			resultado = float.parseFloat(lector.nextLine());
			valido = (resultado >= valorMin && resultado <= valorMax);
			if (!valido){
				System.out.printf("Error => Valor mínimo: %e, Valor máximo: %e\n", valorMin, valorMax);
			}
		}while (!valido);
		return resultado;
	}

	//Función para leer un Double, validando valor min y max.
	public static double solicitarDouble(String mensaje, double valorMin, double valorMax){
		boolean valido;
		double resultado;
		do{
			System.out.println(mensaje);
			resultado = Double.parseDouble(lector.nextLine());
			valido = (resultado >= valorMin && resultado <= valorMax);
			if (!valido){
				System.out.printf("Error => Valor mínimo: %e, Valor máximo: %e\n", valorMin, valorMax);
			}
		}while (!valido);
		return resultado;
	}

	//Función para solicitar un entero, especificamente para un DNI.
	public static int solicitarDNI(String mensaje, int valorMin, int valorMax){
		boolean valido;
		int resultado;
		do{
			System.out.println(mensaje);
			resultado = Integer.parseInt(lector.nextLine());
			valido = (resultado >= valorMin && resultado <= valorMax);
			if (!valido){
				System.out.printf("Error => Valor mínimo: %d, Valor máximo: %d\n", valorMin, valorMax);
			}
		}while (!valido);
		return resultado;
	}

	//Función para devolver el DNI con su caracter correspondiente.
	public static String calcularNIF(int dni){
        String resultado = "";
        String caracteresNIF = "TRWAGMYFPDXBNJZSQVHLCKE";
        int modulo = dni % 23;
        char letra = caracteresNIF.charAt(modulo);
        resultado += String.format("%d-%c", dni, letra);
        return resultado;
    }
	//Función para devolver solamente el caracter del NIF que se le pasa
	public static char calcularLetraNif(int nif){
        String caracteresNIF = "TRWAGMYFPDXBNJZSQVHLCKE";
        int modulo = nif % 23;
        char letra = caracteresNIF.charAt(modulo);
        return letra;
	}
}
