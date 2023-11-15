package tema06;

public class Substring {
    public static String substringFuncionamiento(String s1, int inicio, int fin){
        StringBuilder sb = new StringBuilder(fin - inicio + 1);
        for (int i = inicio; i < fin; i++){
            sb.append(s1.charAt(i));
        }
        return sb.toString();
    }
}
