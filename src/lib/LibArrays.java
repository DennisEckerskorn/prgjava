package lib;
import java.util.Random;
import java.util.Scanner;

public class LibArrays {
    
    private static Random rnd = new Random();
    private static Scanner lector = new Scanner(System.in);

    /**
     * Función que calcula la media de un array de varios números enteros.
     * @param array Array de números enteros.
     * @return devuelve la media del array, haciendo un casting a float.
     */
    public static float calcularMediaArray(int[] array){
        if(array.length == 0){
            return 0.0f;
        }

        int suma = 0;
        for (int i = 0; i < array.length; i++){
            suma += array[i];
        }
        return (float) suma / array.length;
    }

    /**
     * Función que calcula la media de un array de varios números con decimales (double).
     * @param array array de double.
     * @return
     */
     public static double calcularMediaArray(double[] array){
        if(array.length == 0){
            return 0.0;
        }

        int suma = 0;
        for (int i = 0; i < array.length; i++){
            suma += array[i];
        }
        return (double) suma / array.length;
    }

    /**
     * Función que calcula la media de todos los elementos del array que sean >= que num.
     * @param array array de tipo double.
     * @param num numero de tipo entero para la condición.
     * @return devuelve la media de los elementos que sean >= que num.
     */
    public static double calcularMediaMayorQueArray(double[]array, double num){
        if(array.length == 0){
            return 0.0;
        }
        int suma = 0;
        int contador = 0;
        for (int i = 0; i < array.length; i++){
            if(array[i] >= num){
                suma += array[i];
                contador++;
            }
        }
        if(contador == 0){
            return -1.0;
        }
        return (double) suma / array.length;
    }

    /**
     * Función para contar la cantidad de veces que un número sea mayor o igual que el elemento del array.
     * @param array array de doubles
     * @param num numero de tipo double.
     * @return devuelve un entero con las veces que aparace un número igual o mayor que array[i].
     */
    public static double[] contarElementosArrayMayorQue(double[] array, double num){
        double[] resultado;
        int contador = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] > num){
                contador++;
            }
        }
        resultado = new double[contador];
        contador = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] > num){
                resultado[contador++] = array[i];
            }
        }
        return resultado;
    }
    /**
     * Funcion que crea un array resultado a partir de la longitud del array que se le pasa como parámetro y reemplaza los valores <= num por -1.
     * @param arrayP array entero
     * @param num numero entero
     * @return devuelve el array resultado con los valores reemplazados por -1.
     */
    public static int[] contarElementosMayoMenor(int[] arrayP, int num){
        int[] resultado = new int[arrayP.length];
        int contador = 0;

        for (int i = 0; i < arrayP.length; i++){
            if(arrayP[i] > num){
                resultado[contador++] = arrayP[i];
            } else {
                resultado[contador++] = -1;
            }
        }
        return resultado;
    }

    /**
     * Función para mostrar los elementos de las posiciones pares del array.
     * @param array array de tipo char.
     */
    public static void posicionArrayPar(char[] array){
        for (int i = 0; i < array.length; i += 2){
            System.out.printf("a[%d] = %c\n", i, array[i]);
        }
    }

    /**
     * Función para mostrar los elementos de las posiciones impares del array.
     * @param array array de tipo char.
     */
    public static void posicionArrayImpar(char[] array){
        for (int i = 1; i < array.length; i += 2){
            System.out.printf("a[%d] = %c\n", i, array[i]);
        }
    }

    /**
     * Función que suma dos arrays que se pasan como parámetros y guarda el resutado en el array resultado.
     * @param arrayUno double
     * @param arrayDos double
     * @return devuelve el array con los números sumados.
     */
    public static double[] sumaArrays(double[] arrayUno, double[] arrayDos){
        int longitud = arrayUno.length; 
        double[] resultado = new double[longitud];
        for (int i = 0; i < longitud; i++){
              resultado[i] = arrayUno[i] + arrayDos[i];
        }
        return resultado;
    }

    /**
     * Función que hace una división con los valores de dos arrays que se pasan como parámetros y guarda el resutado en el array resultado.
     * @param arrayUno double
     * @param arrayDos double
     * @return devuelve un array con el resultado de la división.
     */
    public static double[] divisionArrays(double[] arrayUno, double[] arrayDos){
        int longitud = arrayUno.length; 
        double[] resultado = new double[longitud];
        for (int i = 0; i < longitud; i++){
              resultado[i] = arrayUno[i] / arrayDos[i];
        }
        return resultado;
    }

    /**
     * Función que calcula el múltiplo que se indica como parámetro de los valores de un array.
     * @param array Integer
     * @param multiplo Integer
     * @return devuelve los valores que son múltiplo del parámetro indicado.
     */
    public static int[] multiplos(int[] array, int multiplo){
        if(multiplo == 0){
            return new int[0];
        }

        int contador = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] % multiplo == 0){
                contador++;
            }
        }
        
        int[] resultado = new int[contador];
        contador = 0;
        for (int i = 0; i < array.length; i++){
             if(array[i] % multiplo == 0){
                resultado[contador] = array[i];
                contador++;
             }
        }
        return resultado;
    }

    /**
     * Función que comprueba si el array contiene el número indicado como valor en alguna posicion.
     * @param array Integer
     * @param n Integer
     * @return devuelve el número encontrado.
     */
    public static int[] arrayContainsNum(int[] array, int n){
        int contador = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] == n){
                contador++;
            }
        }
        
        int[] resultado = new int[contador];
        contador = 0;
        for (int i = 0; i < array.length; i++){
             if(array[i] == n){
                resultado[contador] = array[i];
                contador++;
             }
        }
        return resultado;
    }

    /**
     * a) Rellena el array con números aleatorios del 0 al 50.
     */
    public static void crearArray(int[] vector){
        int min = 0;
        int max = 50;
        for (int i = 0; i < vector.length; i++){
            vector[i] = rnd.nextInt((max - min + 1) + 1);
        }
    }

    /**
     * b) visualiza todo el contenido del array.
     */
    public static void visualitzarArray(int[] vector){
        for (int i = 0; i < vector.length; i++){
            System.out.printf("[%d]=[%d]  ", i, vector[i]);
        }
        System.out.printf("\n");
    }

    /**
     * c) muestra la posicion y el contenido de los elementos que tienen valor par.
     */
    public static void visualitzarParell(int[] vector){
        boolean allZeros = true;
        for (int i = 0; i < vector.length; i += 2){
            if(vector[i] != 0){
                allZeros = false;
                System.out.printf("[%d]=[%d]  ", i, vector[i]);
            }
        }
        System.out.printf("\n");
        if(allZeros){
            System.out.printf("Elige la opción 1 para rellenar el array, no hay valores asignados al array\n");
        }   
    }

    /**
     * d) muestra la posicion y el contenido de los elementos que son múltiplo de 3.
     */
    public static void visualitzarMultiple3(int[] vector){
        boolean multiplesFound = false;
        for (int i = 0; i < vector.length; i++){
            if(vector[i] != 0){
                if(vector[i] % 3 == 0){
                    System.out.printf("[%d]=[%d]  ", i, vector[i]);
                    multiplesFound = true;
                } 
            }
            
        }
        System.out.printf("\n");
        
        if(!multiplesFound){
            System.out.printf("No se han encontrado múltiplos de 3, rellena el array con la opción 1.\n");
        }
    }

    public static int[] arrayInvertido(int[] array){
        int[] resultadoInvertido;
        int contador = 0;
        for (int i = 0; i < array.length; i++){
            contador++;
        }
        resultadoInvertido = new int[contador];
        contador = 0;
        for (int i = array.length -1; i >= 0; i--){
            resultadoInvertido[contador++] = array[i]; 
        }
        return resultadoInvertido;
    }
}
