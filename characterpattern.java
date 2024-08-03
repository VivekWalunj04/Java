import java.util.*;
public class characterpattern {
    public static void main(String argd[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines:");
        int n = sc.nextInt();
        char ch ='A';
        for(int line=1;line<=n;line++){
            for(int chars=1;chars<=line;chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
