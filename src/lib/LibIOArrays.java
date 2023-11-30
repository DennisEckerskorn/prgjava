package lib;

public class LibIOArrays {
        private static int integerMinValue = Integer.MIN_VALUE;
        private static int integerMaxValue = Integer.MAX_VALUE;
        private static double doubleMinValue = Double.MIN_VALUE;
        private static double doubleMaxValue = Double.MAX_VALUE;
    /**
     * Función para mostrar los números de un array de enteros.
     * @param array Array de números enteros.
     */
    public static void showArray(int[] array){
        for (int i = 0; i < array.length; i++){
             System.out.printf("array[%d] = %d\n", i, array[i]);
        } 
     }

     /**
      * Función para mostrar los carácteres de un array de carácteres.
      * @param array Array de tipo char.
      */
     public static void showArray(char[] array){
         for (int i = 0; i < array.length; i++){
             System.out.printf("array[%d] = %c\n", i, array[i]);
         }
     }

      /**
      * Función para mostrar números decimales(Double) de un array.
      * @param array Array de tipo double.
      */
     public static void showArray(double[] array){
         for (int i = 0; i < array.length; i++){
             System.out.printf("array[%d] = %e\n", i, array[i]);
         }
     }

     /** Corregir min-value y max-value (Math.max(String.valueOf(min).length)). Ajustar ancho columna sin usar tabulador
      * Función que muestra la lista de números del array de forma tabulada, cuando se llega a 4 elementos se añade un salto de línea.
      * @param array array de enteros.
      */
     public static String showArrayFormated(int[] array){
        int max = integerMinValue;
        int min = integerMaxValue;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
                
            if(array[i] < min){
                min = array[i];
            }

            int anchoColumna = Math.max(String.valueOf(min).length(), String.valueOf(max).length() + 1);
            
            for (int j = 0; j < 4; j++){
                sb.append(String.format("%-" + anchoColumna + "d", array[i]));
            }
            sb.append("\n");
        }
        return sb.toString();
     }

     /**
     * Función para generar números aleatorios de tipo double dentro de un array.
     * @param array array de tipo double.
     */
    public static void showRandomNumbersArray(double[] array){
        for (int i = 0; i < array.length; i++){
            array[i] = LibEntradaSalida.random(0.0, 10.0);
            System.out.printf("array[%d] = %.2f\n", i, array[i]); 
        }
    }

    /**
     * Función que recorre el array, si el elemento es igual o mayor que num se imprimará en pantalla.
     * @param array array de tipo double.
     * @param num parámetro de tipo entero.
     */
    public static void showRandomNumbersArrayGreaterThen(double[] array, int num){
        for (int i = 0; i < array.length; i++){
            if(array[i] >= num){
                System.out.printf("array[%d] = %.2f\n", i, array[i]);
            }
        }
    }

    /**
     * Función que pide números enteros para un array de enteros. Usa la función solicitarEntero para leer y validar el valor min y max.
     * @param array Array de números enteros.
     */
    public static void solicitarDatosArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.printf("array[%d]\n", i);
            array[i] = LibEntradaSalida.solicitarEntero("Ingresa un número", integerMinValue, integerMaxValue );
        }
    }

    /**
     * Función que pide carácteres para un array de carácteres. usa la función solicitarCaracter para mostrar un mensaje y leer el carácter.
     * @param array Array de carácteres.
     */
    public static void solicitarDatosArray(char[] array){
        for (int i = 0; i < array.length; i++){
            System.out.printf("array[%d]\n", i);
            array[i] = LibEntradaSalida.solicitarCaracter("Ingresa un carácter");
        }
    }

    /**
     * Función que pide cadenas de texto para un array de Strings. Usa la función solicitarString para leer la cadena.
     * @param array array de String
     */
    public static void solicitarDatosArray(String[] array){
        for (int i = 0;i < array.length; i++){
            System.out.printf("array[%d]\n", i);
            array[i] = LibEntradaSalida.solicitarString("Ingresa una cadena de texto:", 0, 100);
        }
    }

    /**
     * Función que pide números con decimales para un array de double. Usa la función solicitarDouble para leer los números.
     * @param array
     */
    public static void solicitarDatosArray(double[] array){
        for (int i = 0;i < array.length; i++){
            System.out.printf("array[%d]\n", i);
            array[i] = LibEntradaSalida.solicitarDouble("Ingresa una número con decimales:", doubleMinValue, doubleMaxValue);
        }
    }

    /**
     * Función para inicializar un array de enteros con tamaño p.
     * @param p posiciones del array
     * @return devuelve un array de enteros con tamaño p.
     */
    public static int[] inicializarArrayInteger(int p){
        int[] arrayInteger = new int[p];
        return arrayInteger;
    }

    /**
     * Función para inicializar un array de float con tamaño p.
     * @param p posiciones del array
     * @return devuelve un array de float con tamaño p.
     */
    public static float[] inicializarArrayFloat(int p){
        float[] arrayFloat = new float[p];
        return arrayFloat;
    }

    /**
     * Función para inicializar un array de double con tamaño p.
     * @param p posiciones del array.
     * @return devuelve un array de double con tamaño p.
     */
    public static double[] inicializarArrayDouble(int p){
        double[] arrayDouble = new double[p];
        return arrayDouble;
    }

    /**
     * Función para inicializar un array de char con tamaño p.
     * @param p posiciones del array.
     * @return devuelve un array de char con tamaño p.
     */
    public static char[] inicializarArrayChar(int p){
        char[] arrayChar = new char[p];
        return arrayChar;
    }

    /**
     * Función para inicializar un array de String con tamaño p.
     * @param p posiciones del array.
     * @return devuelve un array de String con tamaño p.
     */
    public static String[] inicializarArrayString(int p){
        String[] arrayString = new String[p];
        return arrayString;
    }
}
