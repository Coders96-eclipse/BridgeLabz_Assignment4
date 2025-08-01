import java.util.Scanner;

public class LargestDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        while (number != 0) {
            if (index == maxDigit) {
                break;
            }
            digits[index] = number % 10;
            number /= 10;
            index++;
        }

        int largest = -1;
        int secondLargest = -1;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + (secondLargest == -1 ? "Not available" : secondLargest));
    }
}
