import java.util.*;
public class Bubble_Sort {
    public static void bubbleSort(int numbers[]){
        for(int turn=0;turn<numbers.length;turn++){
            for(int j=0;j<numbers.length-1-turn;j++){
                if(numbers[j]>numbers[j+1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
    }
    public static void printArr(int numbers[]){
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
    }
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.print("ENter size of array:");
        int n = sc.nextInt();
        int numbers[] = new int[n];
        System.out.println("Enter arrrys elements:");
        for(int i=0;i<n;i++){
            numbers[i]=sc.nextInt();
        }
        bubbleSort(numbers);
        printArr(numbers);
    }
    
}
