package tema06;

public class EjcompareTo {
  /*   No funciona si le pasas valores de diferentes tamaños.
        public static int compararStrings(String s1, String s2){
        int suma1 = 0;
        int suma2 = 0;
        //Bucle que recorre la longitud de las dos cadenas y convierte a Entero el caracter indicado. compareTo().
        
        for (int i = 0; i < s1.length() || i < s2.length(); i++){
            suma1 += (int) s1.charAt(i);
            suma2 += (int) s2.charAt(i);
        }
        return suma1 - suma2;
    }
    */
     
    public static int compararStringsDos(String s1, String s2){
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
/* 
    public static int length(String s1){
        boolean seguir = true;
        int contador = 0;
        while (seguir){
            try{
                s1.charAt(contador);
                contador++;
            } catch (StringIndexOutOfBoundsException e){
                seguir = false;
            }
            
        }
    }
    */
}
