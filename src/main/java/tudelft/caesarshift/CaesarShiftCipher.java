package tudelft.caesarshift;
public class CaesarShiftCipher {

    public String encrypt(String message, int shift) {
        if (message == null || message.isEmpty()) {
            return "invalid";
        }
        StringBuilder sb = new StringBuilder();
        shift = shift % 26; // Normaliza el shift dentro del rango de 0-25

        for (char currentChar : message.toCharArray()) {
            if (Character.isLetter(currentChar) && Character.isLowerCase(currentChar)) {
                char newChar = (char) (currentChar + shift);

                // Ajuste si el carácter sobrepasa 'z' o 'a'
                if (newChar > 'z') {
                    newChar -= 26;
                } else if (newChar < 'a') {
                    newChar += 26;
                }
                sb.append(newChar);
            } else if (currentChar == ' ') { // Permitir espacios
                sb.append(currentChar);
            } else {
                return "invalid"; // Si hay un carácter inválido, devolver "invalid"
            }
        }

        return sb.toString();
    }
}
