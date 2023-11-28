package tema06;
import java.util.Scanner;

import lib.LibTema06;

public class EjerciciosArrays {
    Scanner lector = new Scanner(System.in);
    //13. Escribe un programa para introducir los valores de un array de 10 elementos numéricos y posteriormente visualizar-los. Visualizar también la media de los elementos.
    public static void arrayNumerosMedia(){
        StringBuilder sb = new StringBuilder();
        int arrayNum [] = {1, 40, 3, 89, 5, 6, 76, 8, 9, 10};
        int num = 0;
        int suma = 0;
        double media;
        for (int i = 0; i < arrayNum.length; i++){
            num = arrayNum[i];
            suma += arrayNum[i];
            sb.append(num).append("\n");
        }
        //Se saca la media de la suma de los números y la longitud (posiciones) del array.
        media = suma / arrayNum.length;
        sb.append("La media es: ").append(media);
        sb.toString();
        System.out.println(sb);
    }
    /* 
    //Sacar la media de un array //Libreria Logica
    public static float mediaArray(int[] array){
        int suma = 0;
        for (int i = 0; i < array.length; i++){
            suma += array[i];
        }
        return (float) suma / array.length;
    }
    */

    //14. Escribe un programa que permita introducir un array de 10 elementos de tipos char y después visualizar los que ocupan la posición par. Repetir para las posiciones impar.
    public static void arrayCaracterParImpar(){
        char[] arrayChar = new char [10];
        for (int i = 0; i < arrayChar.length; i++){
            arrayChar[i] = lector.next().charAt(0);
        }
    }

    //Metodo para lib pedir datos de un array //Libreria entrada / salida
     public static void solicitarDatosArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.printf("a[%d]\n", i);
            array[i] = Lib.solicitarInt("Ingresa un número");
            
        }
    }
    
}
