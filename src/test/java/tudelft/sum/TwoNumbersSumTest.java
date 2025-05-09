package tudelft.sum;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class TwoNumbersSumTest {

    @Test
    public void testAddTwoNumbers() {
        TwoNumbersSum twoNumbersSum = new TwoNumbersSum();

        // Caso 1: Sumar [1, 2] y [4, 5]
        ArrayList<Integer> num1 = new ArrayList<>(Arrays.asList(1, 2)); // 12
        ArrayList<Integer> num2 = new ArrayList<>(Arrays.asList(4, 5)); // 45
        ArrayList<Integer> expectedResult = new ArrayList<>(Arrays.asList(5, 7)); // 57
        assertEquals(expectedResult, twoNumbersSum.addTwoNumbers(num1, num2));
        // Caso 2: Sumar [9, 9] y [1]
        num1 = new ArrayList<>(Arrays.asList(9, 9)); // 99
        num2 = new ArrayList<>(Arrays.asList(1)); // 1
        expectedResult = new ArrayList<>(Arrays.asList(1, 0, 0)); // 100
        assertEquals(expectedResult, twoNumbersSum.addTwoNumbers(num1, num2));
        // Caso 3: Sumar [9] y [1]
        num1 = new ArrayList<>(Arrays.asList(9)); // 9
        num2 = new ArrayList<>(Arrays.asList(1)); // 1
        expectedResult = new ArrayList<>(Arrays.asList(1, 0)); // 10
        assertEquals(expectedResult, twoNumbersSum.addTwoNumbers(num1, num2));
        // Caso 4: Sumar listas vacías
        num1 = new ArrayList<>();
        num2 = new ArrayList<>();
        expectedResult = new ArrayList<>();
        assertEquals(expectedResult, twoNumbersSum.addTwoNumbers(num1, num2));
    }
}