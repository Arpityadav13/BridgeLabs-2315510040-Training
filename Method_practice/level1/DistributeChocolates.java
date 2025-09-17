package Level_1_Java_Methods_Practice_Problems;

import java.util.Scanner;
public class DistributeChocolates {
    public static int[] findRemainderAndQuotient(int total, int children) {
        return new int[]{total / children, total % children};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chocolates = sc.nextInt();
        int children = sc.nextInt();
        int[] result = findRemainderAndQuotient(chocolates, children);
        System.out.println("Each child gets: " + result[0] + ", Remaining chocolates: " + result[1]);
    }
}

