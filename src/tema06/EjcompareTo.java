package tema06;

public class EjcompareTo {
    public static int compararStrings(String s1, String s2){
        int suma1 = 0;
        int suma2 = 0;
        //Bucle que recorre la longitud de las dos cadenas y convierte a Entero el caracter indicado. compareTo().
        for (int i = 0; i < s1.length() && i < s2.length(); i++){
            suma1 += (int) s1.charAt(i);
            suma2 += (int) s2.charAt(i);
        }
        return suma1 - suma2;
    }
}
