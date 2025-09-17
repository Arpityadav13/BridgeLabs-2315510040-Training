package Level_2_Java_Methods_Practice_Problems;

import java.util.Scanner;

public class Friends {
    public static int findYoungest(int[] ages) {
        int index = 0;
        for (int i = 1; i < ages.length; i++) if (ages[i] < ages[index]) index = i;
        return index;
    }

    public static int findTallest(double[] heights) {
        int index = 0;
        for (int i = 1; i < heights.length; i++) if (heights[i] > heights[index]) index = i;
        return index;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[3];
        double[] heights = new double[3];
        String[] names = {"Amar", "Akbar", "Anthony"};
        for (int i = 0; i < 3; i++) {
            ages[i] = sc.nextInt();
            heights[i] = sc.nextDouble();
        }
        int youngest = findYoungest(ages);
        int tallest = findTallest(heights);
        System.out.println("Youngest: " + names[youngest]);
        System.out.println("Tallest: " + names[tallest]);
    }
}

