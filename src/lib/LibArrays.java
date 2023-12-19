package lib;
import java.util.Random;

public class LibArrays {
    
    private static Random rnd = new Random();
    
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
    /**
     * Función que recibe un array de enteros e invierte el array, es decir el último valor estrá en la primera posición.
     * @param array Integer
     * @return devuelve un array de x elementos invertido.
     */
    public static int[] arrayInvertido(int[] array){
        int[] resultadoInvertido;
        int contador = 0;
        resultadoInvertido = new int[contador];
        for (int i = array.length -1; i >= 0; i--){
            resultadoInvertido[contador++] = array[i]; 
        }
        return resultadoInvertido;
    }

    /**
     * Recibe un array y el número de iteraciones para hacer el sumatorio, guarda el resultado en otro array.
     * @param array Integer
     * @param iteraciones Integer
     * @return devuelve el resultado del sumatorio en un array aparte.
     */
    public static int[] arraySumatorio(int[] array, int iteraciones){
        int[] valorSumatorioV = new int[iteraciones];
        int[] resultadoSumatorioP = new int[iteraciones];
        int sumaAcumulativa = 0;
        for (int i = 0; i < iteraciones; i++){
            valorSumatorioV [i] = i;
            sumaAcumulativa = 0;
            for (int j = 0; j <= i; j++){
                sumaAcumulativa += valorSumatorioV[j];
            }
            resultadoSumatorioP[i] = sumaAcumulativa;
        }
        return resultadoSumatorioP;
    }

    /**
     * Función que recorre un array para ver si todas las posiciones no son igual a 0, si lo son se muestra un mensaje.
     * El contador solo incrementa si el valor es diferente a 0, de este modo sse asegura que cada posición contiene el valor 0.
     * @param array Integer
     * @param mensaje String
     * @return StringBuilder con el mensaje en caso de ser un array nulo.
     */
    public static String mostrarMensajeArrayNulo(int[] array, String mensaje){
        StringBuilder sb = new StringBuilder();
        int contador = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] != 0){
                contador++;
            }
        }
        if(contador == 0){
            sb.append(mensaje);
        }
        return sb.toString();
    }

    /**
     * Función que recibe un array de n elementos y crea otro array con los valores par de ese array inicial.
     * Solo tiene en cuenta los valores que no son igual a 0.
     * @param arrayV Integer
     * @param iteraciones Integer
     * @return array int[] con los valores pares desde el  array inicial, sin devolver un valor 0. 
     */
    public static int[] valorParArray(int[] arrayV){
        int[] resultadoPar;
        int contador = 0;

        for(int i = 0; i < arrayV.length; i++){
            if(arrayV[i] != 0 && arrayV[i] % 2 == 0){
                contador++;
            }
        }

        resultadoPar = new int[contador];
        contador = 0;

        for (int i = 0; i < arrayV.length; i++){
            if(arrayV[i] != 0 && arrayV[i] % 2 == 0){
                resultadoPar[contador++] = arrayV[i];
            }
        }
        return resultadoPar;
    }
    
    /**
     * Función para ordenar un array de int de menor a mayor.
     * Se usan dos índices para recorrer el array i desde la posicion 0 hasta la penúltima y j desde la primera hasta la última pocisicón.
     * Si el valor de j es menor que el valor de i se intercambia.
     * @param array int
     * @return array ordenado de menor a mayor.
     */
    public static int[] ordenarArray(int[] array){
        int aux;
        int valorMinimo;
        for (int i = 0; i < array.length - 1; i++){
            valorMinimo = i;
            for(int j = i + 1; j < array.length; j++){
                if(array[j] < array[valorMinimo]){
                    valorMinimo = j;
                }
            }
            aux = array[valorMinimo];
            array[valorMinimo] = array[i];
            array[i] = aux;
        }
        return array;
    }
    /**
     * Funcion que ordena un array usando countSort, recorre el array y cuenta en un segundo array las apariciones del primer array.
     * Luego descomprime el array y asigna el valor del segundo array a las posiciones.
     * array1 = 0, 3, 5, 3, 5, 2;
     * array2 = 1, 1, 2, 2;
     * array3 = 0, 3, 3, 5, 5;
     * @param array int
     * @return array de int ordenado.
     */
    public static int[] ordenarCount(int[] array){
        int max = maximoArray(array); //Crear metodo que calcula el maximo de un array
        int[] resultado = new int[max];
        int[] resultadoFinal = new int[array.length];
        int contador = 0; 
        for (int i = 0; i < array.length; i++){
            resultado[array[i]]++;
        }
        contador = 0;
        for(int i = 0; i < resultado.length; i++){
             for (int j = 0; j < resultado[i]; j++){
                resultadoFinal[contador++] = i;
            } 
        }
        return resultadoFinal;
    }

    /**
     * Funcion que cuenta las posiciones que hay en un array.
     * @param array int
     * @return las posiciones totales de un array.
     */
    public static int maximoArray(int[] array){
        int contador = 0;
        for (int i = 0; i < array.length; i++){
            contador++;
        }
        return contador;
    }

    public static int[][] matrizRandom(int[][] matriz, int max, int min){
        for(int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = rnd.nextInt(max - min + 1) + min;
            }
        }
        return matriz;
    }

    public static void mostrarMatrizCompleta(int[][] matriz){
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.printf("%d ", matriz[i][j]);
            } 
            System.out.printf("\n");
        }
    }

     public static void mostrarMatrizCompleta(double[][] matriz){
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.printf("%.2f ", matriz[i][j]);
            } 
            System.out.printf("\n");
        }
    }

    public static void mostrarMatrizTraspuesta(int[][] matriz){
        for (int j = 0; j < matriz[0].length; j++){
            for (int i = 0; i < matriz.length; i++){
                System.out.printf("%d ", matriz[i][j]);
            }
            System.out.printf("\n");
        }
    }

    public static int[][] sumaValoresMatriz(int[][] matriz){
        int[][] matrizResultado = new int[matriz.length][matriz[0].length + 1];
        for (int i = 0; i < matriz.length; i++){
            int sumaFila = 0;
            for (int j = 0; j < matriz[i].length; j++){
                matrizResultado[i][j] = matriz[i][j];
                sumaFila += matriz[i][j];
            }
            matrizResultado[i][matriz[0].length] = sumaFila;
        }
        return matrizResultado;
    }

    /**
     * Función que busca el valor máximo y mínimo de cada fila de la matriz, el valor se guarda max = penúltima posición, min = última posicion.
     * @param matriz matriz Integer.
     * @return devuelve una nueva matriz con la longitud + 2, para añadir los valores max y min.
     */
    public static int[][] valoresMaxMinMatriz(int[][] matriz){
        int[][] matrizResultado = new int[matriz.length][matriz[0].length + 2];
        for(int i = 0; i < matriz.length; i++){
            int valorMaximo = matriz[i][0]; //Asumimos la primera posicion como valor máximo, se actualiza.
            int valorMinimo = matriz[i][0]; //Asumimos la segunda posicion como valor mínimo, se actualiza.
            for (int j = 0; j < matriz[i].length; j++){
                int valorActual = matriz[i][j];
                //Se actualiza el máximo si es necesario.
                if(valorActual > valorMaximo){
                    valorMaximo = valorActual;
                }
                //Se actualiza el valor mínimo si es necesario.
                if(valorActual < valorMinimo){
                    valorMinimo = valorActual;
                }
                
                matrizResultado[i][j] = valorActual;
            }
            //Se guarda el valor máximo en la penúltima posición y el mínimo en la última.
            matrizResultado[i][matriz[0].length] = valorMaximo;
            matrizResultado[i][matriz[0].length + 1] = valorMinimo;
        }
        return matrizResultado;
    }

    public static double[][] mediaTotalMatriz(int[][] matriz){
        double[][] matrizResultado = new double[matriz.length][matriz[0].length + 1];
        for (int i = 0; i < matriz.length; i++){
            int suma = 0;
            for (int j = 0; j < matriz[i].length; j++){
                matrizResultado[i][j] = matriz[i][j];
                suma += matriz[i][j];
            }
            matrizResultado[i][matriz[i].length] = (double) suma / matriz[i].length;
        }
        return matrizResultado;
    }
}
