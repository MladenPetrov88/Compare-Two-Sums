import java.util.Scanner;

public class LeftAndRightSUm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sumFirstNumbers = 0;
        int sumSecondNumbers = 0;

        for (int i = 1; i <= n; i++) {
            int numbers = Integer.parseInt(scanner.nextLine());
            sumFirstNumbers += numbers;

        }

        for (int i = 1; i <= n; i++) {
            int numbers = Integer.parseInt(scanner.nextLine());
            sumSecondNumbers += numbers;

        }

        if (sumFirstNumbers == sumSecondNumbers) {
            System.out.printf("Yes, sum = %d",sumFirstNumbers);
        } else {
            System.out.printf("No, diff = %d", Math.abs(sumFirstNumbers - sumSecondNumbers));
        }
    }
}