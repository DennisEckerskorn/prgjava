package lib;
import java.util.Scanner;
import java.util.Random;


public class LibEntradaSalida {
    private static  Scanner lector = new Scanner(System.in);
	private static Random rnd = new Random();
	
    /**
	 * Función para devolver un numero aleatorio entre un rango min y max (INTEGER).
	 * @param min valor min(incluido).
	 * @param max valor max(incluido).
	 * @return devuelve números aleatorios dentro del rango min y max de tipo entero.
	 */
	public static int random(int min, int max){
		return rnd.nextInt(max - min + 1) + min;
	}

	/**
	 * Función para devolver un numero aleatorio entre un rango min y max (DOUBLE).
	 * @param min valor min(incluido).
	 * @param max valor max(incluido).
	 * @return devuelve números aleatorios dentro del rango min y max de tipo double.
	 */
	public static double random(double min, double max){
		return rnd.nextDouble() * (max - min) + min;
	}

	/**
	 * Función para leer un String con Scanner, validando el valor min y max (longitud).
	 * @param mensaje tipo String, mensaje que se muestra por pantalla.
	 * @param longitudMinima tipo entero, longitud mínima del String.
	 * @param longitudMaxima tipo entero, longitud máxima del String.
	 * @return devuelve el String ingresado por el usuario, si es válido. Si no, devuelve un mensaje y repite hasta que sea váldio. 
	 */
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

	/**
	 * Función para leer un carácter con Scanner.
	 * @param mensaje muestra un mensaje por pantalla.
	 * @return devuelve el carácter introducido por el usuario.
	 */
	public static char solicitarCaracter(String mensaje){
		System.out.println("Ingresa un carácter:");
		return lector.nextLine().charAt(0);
	}
	
	/**
	 * Función para leer un Integer con Scanner para determinar el tamaño del array.
	 * @param mensaje 
	 * @return devuelve un Integer introducido por el usuario.
	 */
	public static int solicitarInteger(String mensaje){
		System.out.println(mensaje);
		return Integer.parseInt(lector.nextLine());
	}
	
	/**
	 * Función para leer un double con Scanner.
	 * @param mensaje muestra un mensaje por pantalla.
	 * @return devuelve un double introducido por el usuario.
	 */
	public static double solicitarDouble(String mensaje){
		System.out.println("Ingresa un número con decimales:");
		return Double.parseDouble(lector.nextLine());
	}

	/**
	 * Función para leer un carácter con Scanner y validar si el carácter introducido es el carácter deseado.
	 * @param mensaje tipo String, muestra un mensaje por pantalla.
	 * @param op1 tipo char.
	 * @return devuelve un carácter ingresado por consola, si es el carácter deseado, si no muestra un mensaje y vuelve a pedir el carácter.
	 */
	public static char solicitarCaracter(String mensaje, char op1){
		char resultado;
		boolean valido;
		do{
			System.out.println(mensaje);
			resultado = lector.nextLine().toLowerCase().charAt(0);
			valido = resultado == Character.toLowerCase(op1);
			if(!valido){
				System.out.printf("Error => El carácter debe ser %c o %c\n", op1);
			}
		}while(!valido);
		return resultado;
	}

	/**
	 * Función para leer dos caracteres con Scanner y validar si los caracteres introducidos son los caracteres deseados.
	 * @param mensaje tipo String, muestra un mensaje por pantalla.
	 * @param op1 tipo char.
	 * @param op2 tipo char.
	 * @return devuelve los caracteres ingresados por consola, si los caracteres son los deseados los muestra, si no muestra un mensaje y vuelve a pedir los caracteres.
	 */
	public static char solicitarCaracter(String mensaje, char op1, char op2){
		char resultado;
		boolean valido;
		do{
			System.out.println(mensaje);
			resultado = lector.nextLine().toLowerCase().charAt(0);
			valido = (op1 + "" + op2).toLowerCase().indexOf(resultado) != -1;
			//valido = resultado == Character.toLowerCase(op1) || resultado == Character.toLowerCase(op2);
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

	//Función para leer un Float, validando valor min y max.
	public static double solicitarFloat(String mensaje, float valorMin, float valorMax){
		boolean valido;
		float resultado;
		do{
			System.out.println(mensaje);
			resultado = Float.parseFloat(lector.nextLine());
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

	//Función para solicitar un Entero, especificamente para un DNI.
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
