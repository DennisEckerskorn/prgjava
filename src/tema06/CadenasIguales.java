package tema06;

public class CadenasIguales {
    //Función que compara la longitud de 2 strings y recorre el String y compara caracter por caracter. equals().
    public static boolean cadenasIguales(String s1, String s2){
        if (s1.length() != s2.length()){
            return false;
        }
        for (int i = 0; i < s1.length(); i++){
            if (s1.charAt(i) != s2.charAt(i)){
                return false;
            }
        }
        return true;
    }
}