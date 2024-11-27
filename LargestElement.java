
import java.util.Scanner;

public class LargestElement {
   public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for(int num : arr)
        {
            if(num > max)
            {
                max = num;
            }
        }
        System.out.println("Largest element: " +max);
    }
   } 
}
