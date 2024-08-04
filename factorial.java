import java.util.*;

public class factorial {

    public static int fact(int n){
        int f=1;
        
        if(n>0){
            
        for(int i=1;i<=n;i++){
            f = f*i;
        }
    }
        return f;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int n = sc.nextInt();
        factorial F= new factorial();
       System.out.println(F.fact(n));
    }
}
