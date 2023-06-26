import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberListOperations {
    public static void main(String[] args) {
        // Произвольный список целых чисел
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите задание для выполнения:");
        System.out.println("1) Удалить чётные числа");
        System.out.println("2) Найти минимальное значение");
        System.out.println("3) Найти максимальное значение");
        System.out.println("4) Найти среднее значение");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> {
                removeEvenNumbers(numbers);
                System.out.println("Список после удаления чётных чисел: " + numbers);
            }
            case 2 -> {
                int minValue = findMinValue(numbers);
                System.out.println("Минимальное значение: " + minValue);
            }
            case 3 -> {
                int maxValue = findMaxValue(numbers);
                System.out.println("Максимальное значение: " + maxValue);
            }
            case 4 -> {
                double averageValue = findAverageValue(numbers);
                System.out.println("Среднее значение: " + averageValue);
            }
            default -> System.out.println("Некорректный выбор.");
        }
    }

    private static void removeEvenNumbers(List<Integer> numbers) {
        numbers.removeIf(number -> number % 2 == 0);
    }

    private static int findMinValue(List<Integer> numbers) {
        int minValue = Integer.MAX_VALUE;
        for (int number : numbers) {
            if (number < minValue) {
                minValue = number;
            }
        }
        return minValue;
    }

    private static int findMaxValue(List<Integer> numbers) {
        int maxValue = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > maxValue) {
                maxValue = number;
            }
        }
        return maxValue;
    }

    private static double findAverageValue(List<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return (double) sum / numbers.size();
    }
}
