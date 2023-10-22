import java.util.Scanner;

public class Missing {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int n;
        int sum = 0;
        System.out.println("Enter the size of the array: ");
        n = reader.nextInt();

        int osum = (n * (n + 1)) / 2;

        int[] arr = new int[n];

        System.out.println("Enter the array elements : ");
        for (int i = 0; i < n - 1; i++)
            arr[i] = reader.nextInt();

        for (int i = 0; i < n - 1; i++)
            sum += arr[i];

        System.out.println("The missing element is " + (osum - sum));
        reader.close();
    }
}