import java.util.*;
public class Reverse {
    public static void reverse(int numbers[]){
        int first =0 , last=numbers.length-1;
        while(first < last){
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;
            first++;
            last--;
                }
    

    }
    public static void main(String argd[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n = sc.nextInt();
        int numbers[] = new int[n];
        System.out.println("Enter elements in array:");
        for(int i=0;i<numbers.length;i++){
            numbers[i] = sc.nextInt();
        }
        reverse(numbers);
        System.out.println("Reverse array is :");
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
    }
}
