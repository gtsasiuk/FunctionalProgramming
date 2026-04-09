package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.LongStream;

public class LambdaTasks {
    public static List<Integer> findsOddNums(List<Integer> nums) {
        return nums.stream()
                .filter(n -> n % 2 != 0)
                .toList();
    }

    public static Double calcAvgDouble(List<Double> nums) {
        return nums.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);
    }

    public static List<String> strToAlphabeticalOrder(List<String> strings) {
        return strings.stream()
                .sorted(String::compareTo)
                .toList();
    }

    public static Integer sumEvenNums(List<Integer> nums) {
        return nums.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
    }

    public static Long calcFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        return LongStream.rangeClosed(1, n)
                .reduce(1, (a, b) -> a * b);
    }

    public static String sumAndProduct(List<Integer> nums) {
        Integer sum = nums.stream()
                .mapToInt(Integer::intValue)
                .sum();

        Integer product = nums.stream()
                .reduce(1, (a, b) -> a * b);

        StringBuilder result = new StringBuilder();
        result.append("Sum: ").append(sum).append("\nProduct: ").append(product);

        return result.toString();
    }

    public static List<Integer> squareNums(List<Integer> nums) {
        return nums.stream()
                .map(n -> n * n)
                .toList();
    }

    public static List<String> sortStrByLength(List<String> strings) {
        return strings.stream()
                .sorted(Comparator.comparingInt(String::length))
                .toList();
    }

    public static Long countWords(String sentence) {
        return Arrays.stream(sentence.split("\\s+"))
                .filter(word -> !word.isEmpty())
                .count();
    }

    public static Optional<String> findFirstNonEmpty(List<String> strings) {
        return strings.stream()
                .filter(s -> s != null && !s.trim().isEmpty())
                .findFirst();
    }

    public static Boolean allStartWithUppercase(List<String> strings) {
        return strings.stream()
                .allMatch(s -> s != null && !s.isEmpty()
                        && Character.isUpperCase(s.charAt(0)));
    }

    public static Optional<Integer> findSecondLargest(List<Integer> nums) {
        return nums.stream()
                .distinct()
                .sorted((a, b) -> b - a)
                .skip(1)
                .findFirst();
    }

    public static Optional<Integer> findMaxEven(List<Integer> nums) {
        return nums.stream()
                .filter(n -> n % 2 == 0)
                .max(Integer::compareTo);
    }
}
