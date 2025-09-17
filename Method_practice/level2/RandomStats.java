package Level_2_Java_Methods_Practice_Problems;

import java.util.Random;

public class RandomStats {
    public static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = 1000 + rand.nextInt(9000);
        }
        return arr;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0], max = numbers[0], sum = 0;
        for (int num : numbers) {
            sum += num;
            if (num < min) min = num;
            if (num > max) max = num;
        }
        double avg = (double) sum / numbers.length;
        return new double[]{avg, min, max};
    }

    public static void main(String[] args) {
        int[] numbers = generate4DigitRandomArray(5);
        for (int n : numbers) System.out.print(n + " ");
        double[] results = findAverageMinMax(numbers);
        System.out.println("\nAverage: " + results[0]);
        System.out.println("Min: " + results[1]);
        System.out.println("Max: " + results[2]);
    }
}

