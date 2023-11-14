import tema06.CadenasIguales;
import tema06.EjcompareTo;

public class Main{
    public static void main(String[] args){
        //Se crea una variable booleana ya que la función devuelve un booleano. Se compara si 2 Strings son iguales.
        boolean cadenaIgual = CadenasIguales.cadenasIguales("Hola", "Halo");
        System.out.println(cadenaIgual);

        //Se comparan las dos cadenas considerando el orden alfábetico, A viene primero a es decir: 65 es menor que 97 = -32
        //Si fuera a, A sería 32. La primera cadena al ser menor sale un número positivo y a l réves negativo.
        int comparacion = EjcompareTo.compararStrings("A", "a");
        System.out.println(comparacion);
    }
}