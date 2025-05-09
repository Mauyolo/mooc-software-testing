package tudelft.sum;

import java.util.ArrayList;
import java.util.Collections;

// Source: https://leetcode.com/problems/add-two-numbers/description/
class TwoNumbersSum {

    public ArrayList<Integer> addTwoNumbers(ArrayList<Integer> first, ArrayList<Integer> second) {
        // Revertir las listas para sumar desde las unidades
        Collections.reverse(first);
        Collections.reverse(second);

        int complement = 0;
        ArrayList<Integer> result = new ArrayList<>();

        // Sumar los números mientras haya elementos en las listas
        for (int i = 0; i < Math.max(first.size(), second.size()); i++) {
            int firstVal = i < first.size() ? first.get(i) : 0;
            int secondVal = i < second.size() ? second.get(i) : 0;
            int total = firstVal + secondVal + complement;
            complement = 0;

            // Manejar el acarreo
            if (total >= 10) {
                complement = 1;
                total -= 10;
            }

            // Agregar el total al resultado
            result.add(total);
        }

        // Si hay un acarreo al final, agregarlo
        if (complement != 0) {
            result.add(complement);
        }

        // Revertir el resultado final
        Collections.reverse(result);
        return result;
    }
}
