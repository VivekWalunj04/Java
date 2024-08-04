import java.util.*;
public class largestandsmallest {
    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;//-infinity
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest number in array is :"+smallest);
        return largest;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr size of array:");
        int n = sc.nextInt();
        int numbers[] = new int[n];
        System.out.println("Enter number in array:");
        for(int i=0;i<n;i++){
            numbers[i] =  sc.nextInt();
        }
        System.out.println("Largest number in array is :"+getLargest(numbers));

    }
    
}
