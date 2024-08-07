import java.util.*;
public class plaindrome {
    public static boolean plaindromeString(String name){

        for(int i=0;i<name.length()/2;i++){
            int n = name.length();
            if(name.charAt(i) != name.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println( plaindromeString(name));
       
        sc.close();
    }
}
