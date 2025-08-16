import java.util.Scanner;
public class SumNaturalNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n <= 0) {
            System.out.println("Not a Natural Number");
            input.close();
            return;
        }
        int sumLoop = 0;
        int i = 1;
        while (i <= n) {
            sumLoop += i;
            i++;
        }
        int sumFormula = n * (n + 1) / 2;
        System.out.println(sumLoop);
        System.out.println(sumFormula);
        System.out.println(sumLoop == sumFormula);
        input.close();
    }
}