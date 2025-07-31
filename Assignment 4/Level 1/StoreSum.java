import java.util.Scanner;

public class StoreSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] values = new double[10];
        double total = 0.0;
        int index = 0;

        while (true) {
            if (index == 10) break;

            System.out.print("Enter a number (0 or negative to stop): ");
            double input = sc.nextDouble();
            if (input <= 0) break;

            values[index++] = input;
        }

        for (int i = 0; i < index; i++) {
            total += values[i];
        }

        System.out.println("Sum of values = " + total);
    }
}
