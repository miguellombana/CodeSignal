package dad;

public class Ejercicio3 {
    boolean solution(String inputString) {

       String text = inputString.replaceAll("\\s+", "").toLowerCase();

        int left = 0;
        int right = text.length() - 1;

        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false; // Si los caracteres en las posiciones izquierda y derecha no coinciden, no es un palíndromo
            }
            left++;
            right--;
        }

        return true; // Si llegamos aquí, es un palíndromo



    }
}
