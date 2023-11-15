package tema06;

public class Concatenar {
    //Dos strings usar + , si son mas usar StringBuilder
    public static String concatenar(String s1, String s2){
        StringBuilder sb = new StringBuilder(s1.length() + s2.length());
        sb.append(s1).append(s2);

        return sb.toString();
    }
}
