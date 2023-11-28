package lib;
import lib.LibEntradaSalida;
public class LibIOArrays {
    
    public static void solicitarDatosArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.printf("a[%d]\n", i);
            array[i] = LibEntradaSalida.solicitarInt("Ingresa un número", 0, 500);
            
        }
    }
}
