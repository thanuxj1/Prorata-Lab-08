import java.util.Scanner;

public class IT22629180Lab8Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[6];

        int i = 0;
        while (i < 6) {
            System.out.print("Enter a Positive Number (" + (i + 1) + "/6): ");
            int num = sc.nextInt();
            if (num <= 0) {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
                continue;
            }
            numbers[i] = num;
            i++;
        }

        int max = numbers[0];
        for (int j = 1; j < numbers.length; j++) {
            if (numbers[j] > max) {
                max = numbers[j];
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < numbers.length; j++) {
            sb.append(numbers[j]);
            if (j < numbers.length - 1) {
                sb.append(" ");
            }
        }

        System.out.println();
        System.out.println("Array Contents:");
        System.out.println(sb.toString());
        System.out.println("The Maximum Number Entered: " + max);
    }
}
