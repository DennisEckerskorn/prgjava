import tema06.MetodosString;

public class Main{
    public static void main(String[] args){
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


    }
}