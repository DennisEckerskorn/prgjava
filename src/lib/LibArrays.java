package lib;

public class LibArrays {
    
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
    public static int contarElementosArray(double[] array, double num){
        int contador = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] >= num){
                contador++;
            }
        }
        return contador;
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
}
