import java.util.ArrayList;
import java.util.Scanner;

public class SubArraySum {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n, s;
        ArrayList<Integer> ans = new ArrayList<Integer>();
        System.out.println("enter the size of the array: ");
        n = reader.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements of the array: ");
        for (int i = 0; i < n; i++)
            arr[i] = reader.nextInt();
        System.out.println("enter the sum");
        s = reader.nextInt();

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum == s) {
                    ans.add(i);
                    ans.add(j);
                    break;
                }
            }
        }

        if (ans.size() == -1) {
            System.out.println("The array dont have any such sub array");
        } else {
            System.out.println("The first and last index are: ");
            System.out.println(ans.get(0) + " " + ans.get(1));
        }
        reader.close();
    }
}