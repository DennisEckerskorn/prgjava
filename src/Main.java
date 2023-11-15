import tema06.CadenasIguales;
import tema06.EjcompareTo;
import tema06.Concatenar;
import tema06.Substring;
import tema06.IndexOf;

public class Main{
    public static void main(String[] args){
        //Se crea una variable booleana ya que la función devuelve un booleano. Se compara si 2 Strings son iguales.
        boolean cadenaIgual = CadenasIguales.cadenasIguales("Hola", "Halo");
        System.out.println(cadenaIgual);

        //Se comparan las dos cadenas considerando el orden alfábetico, A viene primero a es decir: 65 es menor que 97 = -32
        //Si fuera a, A sería 32. La primera cadena al ser menor sale un número positivo y a l réves negativo.
        int comparacion = EjcompareTo.compararStringsDos("AA", "a");
        System.out.println(comparacion);

        String concatenarCadenas = Concatenar.concatenar("Hola,esto", " es una prueba!");
        System.out.println(concatenarCadenas);

        String substring = Substring.substringFuncionamiento("Hola esto es una prueba", 4, 7);
        System.out.println(substring);

        int indexOf = IndexOf.indexOfFuncionamiento("Hola", "ol" );
        System.out.println(indexOf);
    }
}