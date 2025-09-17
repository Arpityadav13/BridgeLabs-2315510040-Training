package Arrays_Extra_Practice_Problems;

import java.util.Arrays;

public class RearrangeArray {
    public static int[] rearrange(int[] arr) {
        int n = arr.length;
        int[] pos = new int[n];
        int[] neg = new int[n];
        int posCount = 0, negCount = 0;

        for (int num : arr) {
            if (num >= 0) pos[posCount++] = num;
            else neg[negCount++] = num;
        }

        int[] result = new int[n];
        int i = 0, p = 0, q = 0;
        boolean turn = true;

        while (p < posCount && q < negCount) {
            if (turn) result[i++] = pos[p++];
            else result[i++] = neg[q++];
            turn = !turn;
        }

        while (p < posCount) result[i++] = pos[p++];
        while (q < negCount) result[i++] = neg[q++];

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(rearrange(new int[]{1, 2, 3, -4, -1, 4})));
        System.out.println(Arrays.toString(rearrange(new int[]{-5, -2, 5, 2, 4, 7, 1, 8, 0, -8})));
    }
}

