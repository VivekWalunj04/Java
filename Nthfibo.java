import java.util.*;
public class Nthfibo {
    public static int fibo(int n){
        if(n==1 || n==0){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  series number to find :");
        int n = sc.nextInt();
        System.out.println(fibo(n));
    }
    
}
