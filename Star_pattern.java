import java.util.*;

public class Star_pattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Give number of lines ");
        int NoOfLine = sc.nextInt();
        for(int Line=1;Line<=NoOfLine;Line++){
            for(int star=1;star<=Line;star++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
