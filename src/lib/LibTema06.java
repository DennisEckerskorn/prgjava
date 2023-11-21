package lib;
import java.util.Scanner;
public class LibTema06 {
    
    public static int solicitarInt (String mensaje){
        Scanner lector = new Scanner(System.in);
        int n;
        System.out.println(mensaje);
        n = Integer.parseInt(lector.nextLine());
        return n;
    }
}
