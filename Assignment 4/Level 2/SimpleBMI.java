import java.util.Scanner;

public class SimpleBMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("\nPerson " + i);
            System.out.print("Enter height (in meters): ");
            double height = sc.nextDouble();
            System.out.print("Enter weight (in kg): ");
            double weight = sc.nextDouble();

            double bmi = weight / (height * height);
            String status;

            if (bmi <= 18.4)
                status = "Underweight";
            else if (bmi <= 24.9)
                status = "Normal";
            else if (bmi <= 39.9)
                status = "Overweight";
            else
                status = "Obese";

            System.out.printf("BMI: %.2f, Status: %s\n", bmi, status);
        }

        sc.close();
	}
}