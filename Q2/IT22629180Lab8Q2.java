public class IT22629180Lab8Q2 {
    public static void main(String[] args) {
        int[] A = {10, 20, 30, 40, 50};
        int[] B = {34, 67, 12, 89, 12};
        int[] C = new int[5];

        for (int i = 0; i < 5; i++) {
            C[i] = A[i] + B[i];
        }

        System.out.println();
        System.out.println("A Array Contents:");
        printArray(A);

        System.out.println();
        System.out.println("B Array Contents:");
        printArray(B);

        System.out.println();
        System.out.println("C Array Contents (A + B):");
        printArray(C);
    }

    private static void printArray(int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(" ");
            }
        }
        System.out.println(sb.toString());
    }
}
