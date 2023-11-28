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
     * 
     * @param array
     * @return
     */
     public static double calcularMediaArray(double[] array){
        if(array.length == 0){
            return 0.0f;
        }

        int suma = 0;
        for (int i = 0; i < array.length; i++){
            suma += array[i];
        }
        return (double) suma / array.length;
    }

    public static void posicionArrayPar(char[] array){
        for (int i = 0; i < array.length; i += 2){
            System.out.printf("a[%d] = %c\n", i, array[i]);
        }
    }

    public static void posicionArrayImpar(char[] array){
        for (int i = 1; i < array.length; i += 2){
            System.out.printf("a[%d] = %c\n", i, array[i]);
        }
    }
}
