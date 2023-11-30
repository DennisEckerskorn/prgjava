import tema06.MetodosString;

import java.util.Arrays;

import lib.*;
import tema06.Ejercicios;

public class Main{
    public static void main(String[] args){
       
    /*
        //Se crea una variable booleana ya que la función devuelve un booleano. Se compara si 2 Strings son iguales.
        boolean cadenaIgual = MetodosString.equals("Hola", "Halo");
        System.out.println(cadenaIgual);

        //Se comparan las dos cadenas considerando el orden alfábetico, A viene primero a es decir: 65 es menor que 97 = -32
        //Si fuera a, A sería 32. La primera cadena al ser menor sale un número positivo y a l réves negativo.
         
        int comparacion = MetodosString.compareTo("AA", "a");
        System.out.println(comparacion);

        String concatenarCadenas = MetodosString.concatenar("Hola,esto", " es una prueba!");
        System.out.println(concatenarCadenas);

        String substring = MetodosString.substring("Hola esto es una prueba", 4, 7);
        System.out.println(substring);

        int indexOf = MetodosString.indexOf("Queria decirte que quiero que te vayas", "que" );
        System.out.println(indexOf);

        int lastIndexOf = MetodosString.lastIndexOf("Queria decirte que quiero que te vayas", "que");
        System.out.println(lastIndexOf);

        boolean endsWith = MetodosString.endsWith("Queria decirte que quiero que te vayas", "vayas");
        System.out.println(endsWith);

        boolean startsWith = MetodosString.startsWith("Queria decirte que quiero que te vayas", "vayas");
        System.out.println(startsWith);

        String replace = MetodosString.replace("Queria decirte que quiero que te vayas", 'q', 'a');
        System.out.println(replace);

        String replaceAll = MetodosString.replaceAll("Queria decirte que quiero que te vayas", "que", "");
        System.out.println(replaceAll);
    */

    /*
        //Ejercicio 1:
        String primeraLetraMayus = Ejercicios.primeraMayuscula("queria decirte que quiero que te vayas ");
        System.out.println(primeraLetraMayus);
        
        //Ejercicio 2:
        String vocalesConsonantes = Ejercicios.numeroVocalesConsonantes("Queria decirte que quiero que te vayas");
        System.out.println(vocalesConsonantes);
        
        //Ejercicio 3:
        String palabras = Ejercicios.cuentaPalabras("Queria decirte que quiero que te vayas");
        System.out.println(palabras);
        
        //Ejercicio 4:
        String vocalesConsonantesPalabras = Ejercicios.cuentaVocalesConsonantesPalabra("Queria decirte que quiero que te vayas");
        System.out.println(vocalesConsonantesPalabras);
    */

    /*
        //Ejemplo Sacar valor minimo de un array de datos INT.
        int datos[] = {12,-12,-13,-18,19,56,89,47};
        int minimo = Integer.MAX_VALUE;
        for (int dato : datos){
            if(dato < minimo){
                minimo = dato;
            }    
        }
        System.out.println(minimo);
    
     
        //Ejercicio 5:
        String longitudPalabra = Ejercicios.palabraMayorLongitud("Queria decirte que quiero que te vayas");
        System.out.println(longitudPalabra);

        //Ejercicio 6:
        int numeroVeces = LibTema06.solicitarInt("Ingresa un multiplicador para repetir la frase:");
        String fraseRepetida = Ejercicios.fraseRepetidaN("Queria decirte que quiero que te vayas", numeroVeces);
        System.out.println(fraseRepetida);
    
        //Ejercicio 7:
        String palabraPorLinea = Ejercicios.mostrarPalabraPorLinea("Queria decirte que quiero que te vayas");
        System.out.println(palabraPorLinea);
    
        //Ejercicio 8:
        String palabrasLongitud = Ejercicios.palabrasLongitudColumnas("Queria decirte que quiero que te vayas");
        System.out.println(palabrasLongitud);
    
        //Ejercicio 9:
        String caracteresPosiscion = Ejercicios.posicionesImpares("Queria decirte que quiero que te vayas");
        System.out.println(caracteresPosiscion);
    
        //Ejercicio 10:
        boolean palabraPalindroma = Ejercicios.palabraPalindroma("Amo la paloma");
        System.out.println(palabraPalindroma);
    

        //Ejercicio 11:
        String nombre = LibTema06.solicitarString("Ingresa tu nombre", 0, 30);
        String apellido = LibTema06.solicitarString("Ingresa tu primer apellido", 0, 30);
        String appelidoDos = LibTema06.solicitarString("Ingresa tu segundo appelido", 0, 30);
        String nombreCompleto = Ejercicios.cadenaNombre(nombre, apellido, appelidoDos);
        System.out.println(nombreCompleto);
        
        //Ejercicio 12:
        String cadenaCaracteres = Ejercicios.sustituirOccurencias("esto1234es5678bueno900");
        System.out.println(cadenaCaracteres);

        String cadenaDigitos = Ejercicios.sustituirDigitos("esto1234es5678bueno900");
        System.out.println(cadenaDigitos);
*/
/*
        //Ejercicio 13:
        int [] arrayNum = new int[10];
        LibIOArrays.solicitarDatosArray(arrayNum);
        LibIOArrays.showArray(arrayNum);
        float media = LibArrays.calcularMediaArray(arrayNum);
        System.out.printf("La media del array es: %.2f\n", media);
        
        //Ejercicio 14:
        char [] arrayCaracter = new char [10];
        LibIOArrays.solicitarDatosArray(arrayCaracter);
        LibIOArrays.showArray(arrayCaracter);
        LibArrays.posicionArrayPar(arrayCaracter);
        LibArrays.posicionArrayImpar(arrayCaracter);

        //Ejercicio 15:
        int [] arrayNumerico = new int[20];
        LibIOArrays.solicitarDatosArray(arrayNumerico);
        String formatted = LibIOArrays.showArrayFormated(arrayNumerico);
        System.out.println(formatted);

      //Ejercicio 16:
        double [] arrayAleatorio = new double [30];
        LibIOArrays.showRandomNumbersArray(arrayAleatorio);
        double mediaNotas = LibArrays.calcularMediaArray(arrayAleatorio);
        System.out.printf("La media total de las notas es: %.2f\n", mediaNotas);
        double mediaNotasMayorQue = LibArrays.calcularMediaMayorQueArray(arrayAleatorio, 5);
        LibIOArrays.showRandomNumbersArrayGreaterThen(arrayAleatorio, 5);
        System.out.printf("La media de los valores mayor o igual que 5 es: %.2f\n", mediaNotasMayorQue);
*/
        //Ejercicio 17:
        int posiciones = LibEntradaSalida.solicitarInteger("Ingresa el tamaño del array (número entero)");
        double[] arrayEstaturas = LibIOArrays.inicializarArrayDouble(posiciones);
        LibIOArrays.solicitarDatosArray(arrayEstaturas);
        double mediaTotal = LibArrays.calcularMediaArray(arrayEstaturas);
        double[] mediaMayorQue = LibArrays.contarElementosArrayMayorQue(arrayEstaturas, mediaTotal);
        System.out.printf("La media de todos los elementos es %.2f\n", mediaTotal);
        System.out.printf("Los elementos mayor que la media total %s", Arrays.toString(mediaMayorQue));
        

        



    } 
}