import java.util.*;
// Importing the Checkprime class

public class Rangeprime {
    // Checkprime.java

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    
}

    public static void InRangePrime(int n) {
        for(int i=2;i<=n;i++){

        
        if (isPrime(i)) {
            System.out.print(i + " ");
        
        }

    }
    System.out.println();
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range to check prime:");
        int n = sc.nextInt();
        InRangePrime(n);
    }
}
