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
        boolean palindroma;

        
    }
}
