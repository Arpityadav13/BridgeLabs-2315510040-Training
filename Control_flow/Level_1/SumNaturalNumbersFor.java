import java.util.Scanner;
public class SumNaturalNumbersFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n <= 0) {
            System.out.println("Not a Natural Number");
            input.close();
            return;
        }
        int sumLoop = 0;
        for (int i = 1; i <= n; i++) {
            sumLoop += i;
        }
        int sumFormula = n * (n + 1) / 2;
        System.out.println(sumLoop);
        System.out.println(sumFormula);
        System.out.println(sumLoop == sumFormula);
        input.close();
    }
}
