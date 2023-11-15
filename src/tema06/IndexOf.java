package tema06;

public class IndexOf {
    public static int indexOfFuncionamiento(String s1, String s2){
        for (int i = 0; i < s1.length(); i++){
            String aux = Substring.substringFuncionamiento(s1, i, i +s2.length() + s2.length());
            if (aux.equals(s2)){
                return i;
            }
        }
        return -1;       
    }
}
