package tema06;

public class Ejercicios {
    //Ejercicio 1: Convertir la primera letra a Mayusculas:
    public static String primeraMayuscula(String s1){
        if (s1 == null && s1.length() == 0){
            return "";
        }
        StringBuilder sb = new StringBuilder(s1);
        sb.append(Character.toUpperCase(s1.charAt(0)));
        sb.append(s1.substring(1));
        return sb.toString();
    }
}
