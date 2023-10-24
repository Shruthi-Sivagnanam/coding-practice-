import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the array: ");
        n = reader.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the element of the array: ");

        for (int i = 0; i < n; i++)
            arr[i] = reader.nextInt();

        System.out.println("The manipulated array: ");

        for (int i = 0; i < n - 1; i++) {
            int max = arr[i + 1];
            for (int j = i + 1; j < n; j++) {
                if (max < arr[j])
                    max = arr[j];
            }
            System.out.print(max + " ");
        }
        System.out.print("-1");
        reader.close();
    }
}