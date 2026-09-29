import java.util.Scanner;

public class IT22629180Lab8Q1A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] myArray = new int[5];

        System.out.println("Enter 5 Numbers:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Number " + (i + 1) + ": ");
            myArray[i] = sc.nextInt();
        }

        StringBuilder sb = new StringBuilder();
        for (int i = myArray.length - 1; i >= 0; i--) {
            sb.append(myArray[i]);
            if (i > 0) {
                sb.append(" ");
            }
        }

        System.out.println();
        System.out.println("Array in Reverse Order:");
        System.out.println(sb.toString());
    }
}
