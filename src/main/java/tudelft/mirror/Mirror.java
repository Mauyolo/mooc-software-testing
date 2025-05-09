package tudelft.mirror;

public class Mirror {

    public String mirrorEnds(String string) {
        String mirror = "";

        int begin = 0;
        int end = string.length() - 1;

        // Compara los caracteres del principio y del final
        while (begin <= end && string.charAt(begin) == string.charAt(end)) {
            mirror += string.charAt(begin);  // Añadir al resultado
            begin++;
            end--;
        }

        return mirror;  // Devuelve el fragmento reflejado
    }
}


