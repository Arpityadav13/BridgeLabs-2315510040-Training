package Level_3_Java_Methods_Practice_Problems;
import java.util.*;
public class FootballHeights {
    static int findSum(int[] arr) {
        int sum = 0;
        for (int x : arr) sum += x;
        return sum;
    }
    static double findMean(int[] arr) {
        return (double) findSum(arr) / arr.length;
    }
    static int findShortest(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int x : arr) if (x < min) min = x;
        return min;
    }
    static int findTallest(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int x : arr) if (x > max) max = x;
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] heights = new int[11];
        Random r = new Random();
        for (int i = 0; i < 11; i++) heights[i] = r.nextInt(101) + 150;
        System.out.println("Heights: " + Arrays.toString(heights));
        System.out.println("Shortest: " + findShortest(heights));
        System.out.println("Tallest: " + findTallest(heights));
        System.out.println("Mean: " + findMean(heights));
    }
}
