import java.util.Scanner;
public class SumUntilZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0.0;
        double value = input.nextDouble();
        while (value != 0) {
            total += value;
            value = input.nextDouble();
        }
        System.out.println(total);
        input.close();
    }
}