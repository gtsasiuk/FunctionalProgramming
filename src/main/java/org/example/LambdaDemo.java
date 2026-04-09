package org.example;

import java.util.Arrays;
import java.util.List;

public class LambdaDemo  {
    static void main() {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 8, 10);
        List<Double> doubles = Arrays.asList(2.5, 3.5, 4.0, 5.5);
        List<String> strings = Arrays.asList("Banana", "Apple", "Cherry", "Kiwi", " ");
        String sentence = "Java lambda expressions are powerful and concise";

        System.out.println("1. Odd numbers: "
                + LambdaTasks.findsOddNums(integers));

        System.out.println("2. Average: "
                + LambdaTasks.calcAvgDouble(doubles));

        System.out.println("3. Sorted alphabetically: "
                + LambdaTasks.strToAlphabeticalOrder(strings));

        System.out.println("4. Sum of even numbers: "
                + LambdaTasks.sumEvenNums(integers));

        System.out.println("5. Factorial of 5: "
                + LambdaTasks.calcFactorial(5));

        System.out.println("6. Sum and Product: \n"
                + LambdaTasks.sumAndProduct(integers));

        System.out.println("7. Squares: "
                + LambdaTasks.squareNums(integers));

        System.out.println("8. Sorted by length: "
                + LambdaTasks.sortStrByLength(strings));

        System.out.println("9. Word count: "
                + LambdaTasks.countWords(sentence));

        System.out.println("10. First non-empty string: "
                + LambdaTasks.findFirstNonEmpty(strings).orElse("Not found"));

        System.out.println("11. All start with uppercase: "
                + LambdaTasks.allStartWithUppercase(strings));

        System.out.println("12. Second largest number: "
                + LambdaTasks.findSecondLargest(integers).orElse(null));

        System.out.println("13. Largest even number: "
                + LambdaTasks.findMaxEven(integers).orElse(null));
    }
}
