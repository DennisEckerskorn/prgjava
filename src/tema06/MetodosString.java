package tema06;

public class MetodosString {
    //Función que compara la longitud de 2 strings y recorre el String y compara caracter por caracter. equals().
    public static boolean equals(String s1, String s2){
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

     //Dos strings usar + , si son mas usar StringBuilder
    public static String concatenar(String s1, String s2){
        StringBuilder sb = new StringBuilder(s1.length() + s2.length());
        sb.append(s1).append(s2);

        return sb.toString();
    }
    //Compara las dos cadenas considerando el orden alfabético (de la tabla ASCII).
    public static int compareTo(String s1, String s2){
        int suma1 = 0;
        int suma2 = 0;
        int i = 0;
        int max = Math.max(s1.length(), s2.length());
        while (i < max){
            if (i < s1.length()){
                suma1 += s1.charAt(i);
            }
            if (i < s2.length()){
                suma2 += s2.charAt(i);
            }
            i++;
        }
        return suma1 - suma2;
    }
    //Devuelve la primera posición en la cual aparece un texto concreto en la cadena.
    public static int indexOf(String s1, String s2){
        for (int i = 0; i < s1.length(); i++){
            String aux = substring(s1, i, i + s2.length());
            if (aux.equals(s2)){
                return i;
            }
        }
        return -1;       
    }
    //Devuelve un segmento de una cadena que va desde un índice inicial hasta un índice final (el índice final no se incluye).
    public static String substring(String s1, int inicio, int fin){
        StringBuilder sb = new StringBuilder(fin - inicio + 1);
        for (int i = inicio; i < fin; i++){
            sb.append(s1.charAt(i));
        }
        return sb.toString();
    }
    //Devuelve la última posición en la cual aparece un texto concreto en la cadena.
    public static int lastIndexOf(String s1, String s2){
        for (int i = s1.length() - s2.length(); i >= 0; i--){
            String aux = substring(s1, i, i + s2.length());
            if(aux.equals(s2)){
                return i;
            }
        }
        return -1;
    }

    //Se comprueba si el string finaliza con una palabra y devuelve un booleano.
    public static boolean endsWith(String s1, String suffix){
        for (int i = 0; i < suffix.length(); i++){
            int suffixIndex = s1.length() - suffix.length() + i;
            if (suffixIndex < 0 || s1.charAt(suffixIndex) != suffix.charAt(i)){
                return false;
            }
        }
        return true;
    }

    //Se comprueba si el string comienza con una palabra concreta y devuelve un booleano.
    public static boolean startsWith(String s1, String prefix){
        for (int i = 0; i < prefix.length(); i++){
            if (i >= s1.length() || s1.charAt(i) != prefix.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    //Reemplaza un caracter por otro en un String.
    public static String replace(String s1, char oldChar, char newChar) {
        StringBuilder sb = new StringBuilder();
    
        for (int i = 0; i < s1.length(); i++) {
            char currentChar = s1.charAt(i);
    
            if (currentChar == oldChar) {
                sb.append(newChar);
            } else {
                sb.append(currentChar);
            }
        }
        return sb.toString();
    }

    //Reemplaza un String por otro.
    public static String replaceAll(String s1, String oldString, String newString){
        StringBuilder sb = new StringBuilder();

        int index = 0;
        int oldStringLength = oldString.length();

        while (index < s1.length()){
            int indexOfOldString = s1.indexOf(oldString, index);
            if (indexOfOldString == -1){
                sb.append(s1.substring(index));
                break;
            }
            sb.append(s1, index, indexOfOldString);
            sb.append(newString);
            index = indexOfOldString + oldStringLength;
        }
        return sb.toString();
    }
}
