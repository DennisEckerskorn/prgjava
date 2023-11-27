package tema06;

public class Ejercicios {
    //Ejercicio 1:  Escribe un método que dada una frase devuelva la misma pero con la primera letra en mayúsculas.
    public static String primeraMayuscula(String s1){
        if (s1 == null && s1.length() == 0){
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Character.toUpperCase(s1.charAt(0)));
        sb.append(s1.substring(1));
        return sb.toString();
    }

    //Ejercicio 2: Escribe un programa que muestre el número de vocales y el número de consonantes de una frase.
    public static String numeroVocalesConsonantes(String s1){
        StringBuilder sb = new StringBuilder();
        String vocales = "aeiouáéíóúàèìòùäëïöü";
        String consonantes = "bcdfghjklmnñpqrstvwxyz";
        int contadorVocales = 0;
        int contadorConsonantes = 0;
        s1 = s1.toLowerCase();
        for (int i = 0; i < s1.length(); i++){
            char letra = s1.charAt(i);
            if (vocales.indexOf(letra) != -1){
                contadorVocales++;
            }
            if (consonantes.indexOf(letra) != -1){
                contadorConsonantes++;
            }    
        }
        sb.append("Vocales: ").append(contadorVocales).append(" Consonantes: ").append(contadorConsonantes);
        return sb.toString();
    }

    //Ejercicio 3: Escribe un método que cuente el número de palabras que contiene. Asumimos que cada palabra está separada por solo un espacio en blanco.
    public static String cuentaPalabras(String s1){
        StringBuilder sb = new StringBuilder();
        //Se quitan los espacion en blanco al principio y final, luego se dividen las palabras cada vez que encuentra un espacio "\\s+".
        String[] palabras = s1.trim().split("\\s+");
        //Se cuenta la longitud del array, cada palabra se guarda en una posicion del array.
        int contadorPalabra = palabras.length;
        sb.append("Palabras del texto: ").append(contadorPalabra);
        return sb.toString();
    }

    //Ejercicio 4: Escribe un programa que muestre el número de vocales y el número de consonantes de cada palabra de una frase.
    public static String cuentaVocalesConsonantesPalabra(String s1){
        StringBuilder sb = new StringBuilder();
        //Se cortan espacios del principio y final, se dividen las palabras cada vez que encuentra uno o mas espacions y se guarda en el array.
        String[] palabras = s1.trim().split("\\s+");
        String vocales = "aeiouáéíóúàèìòùäëïöü";
        String consonantes = "bcdfghjklmnñpqrstvwxyz";
        //Primer bucle itera sobre todas las palabras del array.
        for (int i = 0; i < palabras.length; i++){
            String palabra = palabras[i];
            int contadorVocales = 0;
            int contadorConsonantes = 0;
            //Segundo bucle itera sobre cada caracter de cada palabra.
            for (int j = 0; j < palabra.length(); j++){
                char letra = palabra.charAt(j);
                if(vocales.indexOf(letra) != -1){
                    contadorVocales++;
                }
                if (consonantes.indexOf(letra) != -1){
                    contadorConsonantes++;
                }
            }
            sb.append("Palabras: ").append(palabra)
            .append(", Vocales: ").append(contadorVocales)
            .append(", Consonantes: ").append(contadorConsonantes).append("\n");
        }
        return sb.toString();
    }

    //Ejercicio 5: Escribe un programa que lea una frase y encuentre la palabra de mayor longitud. El programa debe imprimir la palabra y el número de caracteres que contiene.
    public static String palabraMayorLongitud(String frase){
        StringBuilder sb = new StringBuilder();
        //Cortamos los espacios y separamos palabras cuando se encuentren espacios.
        String palabras[] = frase.trim().split("\\s+");
        int maximo = Integer.MIN_VALUE;
        for (int i = 0; i < palabras.length; i++){
            if(palabras[i].length() > maximo){
                maximo = palabras[i].length();
                //Se reinicia el StringBuilder cuando la nueva palabra maximo es encontrada.
                sb.setLength(0);
                sb.append(palabras[i]).append(" ").append(palabras[i].length());
            } else if (palabras[i].length() == maximo){
                sb.append("\n").append(palabras[i]).append(" ").append(palabras[i].length());
            }
        }
       return sb.toString();
    }
    
    //Ejercicio 6: Escribe un programa que lea una frase y un factor de multiplicación y devuelve la frase repetida tantas veces como indique el factor de multiplicación. 
    public static String fraseRepetidaN(String frase, int n){
        StringBuilder sb = new StringBuilder();
        int contadorVeces = 0;
        for (int i = 0; i < n; i++){
            contadorVeces++;
            sb.append(contadorVeces).append(". ").append(frase).append("\n");
        }
        return sb.toString();
    }

    //Ejercicio 7: Escribe un programa que lea una frase y muestre cada palabra en una línea diferente.
    public static String mostrarPalabraPorLinea(String frase){
        StringBuilder sb = new StringBuilder();
        String[] palabras = frase.trim().split("\\s+");
        for (String palabra : palabras){
            sb.append(palabra).append("\n");
        }
        return sb.toString();
    }

    //Ejercicio 8: Escribe un programa que dada una frase escriba en 2 columnas cada palabra seguida del número de caracteres que contiene.
    public static String palabrasLongitudColumnas(String frase){
        StringBuilder sb = new StringBuilder();
        String[] palabras = frase.trim().split("\\s+");
        int longitud;
        for (String palabra : palabras){
            longitud = palabra.length();
            sb.append(String.format("%-20s %d\n",palabra, longitud));
        }
        return sb.toString();
    }

    //9. Escribe un método que dada una frase devuelva otra pero con solo los caracteres de las posiciones impares.
    public static String posicionesImpares(String frase){
        StringBuilder sb = new StringBuilder();
        String[] palabras = frase.trim().split("\\s+");
        
        for (int i = 1; i < palabras.length; i+=2){
            String caracteres = palabras[i];
            sb.append(caracteres);
        }
        return sb.toString();
    }

    //10. Escribe un método que devuelva true si una palabra es palíndroma (se escribe igual de izquierda a derecha que de derecha a izquierda) y false si no lo es.
    public static boolean palabraPalindroma(String frase){
        boolean palindroma = true;
        frase = frase.toLowerCase().trim().replaceAll("\\s+", "");
        for (int i = 0; i < frase.length() - 1 - i; i++){
            if(frase.charAt(i) != frase.charAt(frase.length() - 1 - i)){
                palindroma = false;
                break;
            }
        }
        return palindroma;
    }

    /* 
        11. Escribe un un programa que solicite tres cadenas de caracteres, una que se denomine nombre, la
        otra primerCognom y la otra segonCognom. El programa debe crear una cadena con el nombre
        completo y después mostrar por pantalla lo siguiente:
        a) El nombre completo con todos el caracteres en minúscula, después en mayúscula y después su longitud.
        b) Los 5 primeros caracteres de la cadena (solo en el caso de que la longitud sea de 5 o más caracteres).
        c) Los dos últimos caracteres de la cadena (solo en el caso de que la longitud sea de dos o más caracteres).
        d) El número de ocurrencias en la cadena del último carácter.
        e) La cadena con todas las ocurrencias del primer carácter en mayúscula
        f) La cadena con tres * por delante y por detrás.
        g) La cadena invertida.
    */
    /**
     * Función que hace uso de otra funciones para mostrar resultados de los ejercicios.
     * @param nombre
     * @param cogNom
     * @param segonCognom
     * @return Devuelve un String con todos los resultados.
     */
    public static String cadenaNombre(String nombre, String cogNom, String segonCognom){
        StringBuilder sb = new StringBuilder();
        sb.append(cadenaMinuscula(nombre, cogNom, segonCognom))
        .append("\n")
        .append(cadenaMayuscula(nombre, cogNom, segonCognom))
        .append("\n")
        .append(cadenaLongitud(nombre, cogNom, segonCognom))
        .append("\n")
        .append(primerosCaracteres(5, nombre, cogNom, segonCognom))
        .append("\n")
        .append(ultimosCaracteres(2, nombre, cogNom, segonCognom))
        .append("\n")
        .append(numVecesUltimoCaracter(nombre, cogNom, segonCognom))
        .append("\n")
        .append(ocurrenciasPrimerCaracterMayus(nombre, cogNom, segonCognom))
        .append("\n")
        .append(cadenaAsteriscos(nombre, cogNom, segonCognom))
        .append("\n")
        .append(cadenaInvertida(nombre, cogNom, segonCognom));
        return sb.toString();
    }

    /**
     * Función que devuelve una cadena en minuscula.
     * @param s1
     * @return s1 en lowerCase
     */
    public static String cadenaMinuscula(String s1, String s2, String s3){
        StringBuilder sb = new StringBuilder();
        sb.append(s1).append(" ").append(s2).append(" ").append(s3);
        return sb.toString().toLowerCase();
    }

    /**
     * Función que devuelve una cadena en mayúscula.
     * @param s1
     * @return s1 en upperCase()
     */
    public static String cadenaMayuscula(String s1, String s2, String s3){
        StringBuilder sb = new StringBuilder();
        sb.append(s1).append(" ").append(s2).append(" ").append(s3);
        return sb.toString().toUpperCase();
    }

    /**
     * Función que devuelve la longitud de una cadena, eliminando espacios al principio y final y entre palabras.
     * @param s1
     * @return longitud en entero.
     */
    public static int cadenaLongitud(String s1, String s2, String s3){
        s1 = s1.trim().replaceAll("\\s+", "");
        int longitud = s1.length();
        return longitud;
    }

    /**
     * Función que devuelve los primeros caracteres de una cadena.
     * @param nCaracteres
     * @param s1
     * @param s2
     * @param s3
     * @return s con los primeros caracteres.
     */
    public static String primerosCaracteres(int nCaracteres, String s1, String s2, String s3){
        StringBuilder sb = new StringBuilder();
         sb.append(s1).append(s2).append(s3);
         String s = sb.toString();
         if(s.length() >= nCaracteres) {
            return s.substring(0, nCaracteres);
         }
         return "";
    }

    /**
     * Función que recibe 3 strings y y el número de posiciones desde el final.
     * @param nCaracteres
     * @param s1
     * @param s2
     * @param s3
     * @return String con los utlimos caracteres.
     */
    public static String ultimosCaracteres(int nCaracteres, String s1, String s2, String s3){
        StringBuilder sb =  new StringBuilder();
        sb.append(s1).append(s2).append(s3);
        String s = sb.toString();
        if(s.length() >= 2){
            return s.substring(s.length() - nCaracteres , s.length());
        }
        return "";
    }

    /**
     * Función que mediante una condición busca el caracter de la última posición de cada String.
     * Llama a otra funcion para contar las ocurrencias del último caracter.
     * @param s1
     * @param s2
     * @param s3
     * @return devuelve un String con el resultado de cada String nombre, carácter, cantidad de veces.
    */
    public static String numVecesUltimoCaracter (String s1, String s2, String s3){
        StringBuilder sb = new StringBuilder();
        char ultimoCaracter1 = s1.length() > 0 ? s1.charAt(s1.length() - 1) : '\0';
        char ultimoCaracter2 = s2.length() > 0 ? s2.charAt(s2.length() - 1) : '\0';
        char ultimoCaracter3 = s3.length() > 0 ? s3.charAt(s3.length() - 1) : '\0';

        int contadorUno = contarOcurrencias(s1, ultimoCaracter1);
        int contadorDos = contarOcurrencias(s2, ultimoCaracter2);
        int contadorTres = contarOcurrencias(s3, ultimoCaracter3);

        sb.append(s1).append(" --- ").append(ultimoCaracter1).append(" --- ").append(contadorUno).append("\n")
        .append(s2).append(" --- ").append(ultimoCaracter2).append(" --- ").append(contadorDos).append("\n")
        .append(s3).append(" --- ").append(ultimoCaracter3).append(" --- ").append(contadorTres);

        return sb.toString();
    }

    /**
     * Función que cuenta las ocurrencias de un caracter dentro de una cadena.
     * @param cadena
     * @param caracter
     * @return Devuelve el número de ocurrencias en Entero.
     */
    public static int contarOcurrencias(String cadena, char caracter){
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++){
            if(cadena.charAt(i) == caracter){
                contador++;
            }
        }
        return contador;
    }

    /**
     * Función que coge el primer carácter de cada String y usa otra función para convertirla a Mayúscula.
     * @param s1
     * @param s2
     * @param s3
     * @return Devuelve un String con las primeras letras.
     */
    public static String ocurrenciasPrimerCaracterMayus(String s1, String s2, String s3) {
        StringBuilder sb = new StringBuilder();
        
        char primerCaracter = (s1.length() > 0) ? s1.charAt(0) : '\0';
        char segundoCaracter = (s2.length() > 0) ? s2.charAt(0) : '\0';
        char tercerCaracter = (s3.length() > 0) ? s3.charAt(0) : '\0';
    
        sb.append(convertirOcurrenciasMayuscula(s1, primerCaracter))
        .append(convertirOcurrenciasMayuscula(s2, segundoCaracter))
        .append(convertirOcurrenciasMayuscula(s3, tercerCaracter));
    
        return sb.toString();
    }
    
    /**
     * Función que convierte el primer cáracter a Mayuscula y solo concatena el primer carácter.
     * @param cadena
     * @param primerCaracter
     * @return Devuelve un String con la primera en mayúscula.
     */
    public static String convertirOcurrenciasMayuscula(String cadena, char primerCaracter) {
        StringBuilder result = new StringBuilder();
    
        if (cadena.length() > 0){
            char primerChar = cadena.charAt(0);
            if (primerChar == primerCaracter) {
                result.append(Character.toUpperCase(primerChar));
            } else {
                result.append(primerChar);
            }
        }
        return result.toString();
    }
    
    /**
     * Función que añade 3 asteriscos al principio y final de la cadena.
     * @param s1
     * @param s2
     * @param s3
     * @return Devuelve un String concatenado por varios Strings.
     */
    public static String cadenaAsteriscos(String s1, String s2, String s3){
        StringBuilder sb = new StringBuilder();
        sb.append("*** ").append(s1).append(" ").append(s2).append(" ").append(s3).append(" ***");
        return sb.toString();
    }

    /**
     * Función que recibe 3 strings, concatena los string e invierte la cadena proporcionada.
     * @param s1
     * @param s2
     * @param s3
     * @return Devuelve un String con la cadena invertida.
     */
    public static String cadenaInvertida(String s1, String s2, String s3) {
        StringBuilder sb = new StringBuilder();
        sb.append(s1).append(" ").append(s2).append(" ").append(s3);
    
        StringBuilder invertido = new StringBuilder();
        for (int i = sb.length() - 1; i >= 0; i--) {
            invertido.append(sb.charAt(i));
        }
        return invertido.toString();
    }

    /*
    * 12. Escribe un método que, dada una cadena de caracteres, sustituya todas las ocurrencias del texto
    * «es» por «no por». Escribe un segundo método que sustituya todos el grupos de dígitos por un
    * único carácter *, es decir, si la cadena de caracteres es «esto1234es5678bueno900», el primer
    * método tiene que devolver «no porto1234no por5678bueno900» y el segundo tiene que devolver
    * «esto*es*bueno*».
    * Nota:
    * a) La expresión regular \\d+ significa un dígito o más.
    * b) Podemos usar replaceAll(“\\d”, “*”);
    */

    /**
     * Función que reemplaza unos caracteres por otros.
     * @param s1
     * @return Devuelve un String con los caracteres reemplazados.
     */
    public static String sustituirOccurencias(String s1){
        StringBuilder sb = new StringBuilder();
        sb.append(s1.replaceAll("es", "no por"));
        return sb.toString();
    }

    /**
     * Función que busca todos los dígitos y los reemplaza por un caracter especial *.
     * @param s1
     * @return Devuelve un String con el resultado del reemplazo.
     */
    public static String sustituirDigitos(String s1){
        StringBuilder sb = new StringBuilder();
        sb.append(s1.replaceAll("\\d+", "*"));
        return sb.toString();
    }
}
