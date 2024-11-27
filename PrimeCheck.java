
import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            boolean isPrime = true;
            for(int i = 2; i <= n / 2; i++)
            {
                if(n % i == 0)
                {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime)
            {
                System.out.println(n+ " is a Prime Number");
            }
            else
            {
                System.out.println(n+ " is not a Prime Number");
            }
        }
    }
}
