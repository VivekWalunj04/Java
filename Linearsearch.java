import java.util.*;
public class Linearsearch {
    public static int linearSearch(int numbers[], int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size :");
        int n = sc.nextInt();
        int numbers[]=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<numbers.length;i++){
            numbers[i] = sc.nextInt();
        }
        System.out.print("Enter number which you want to find in array:");
        int key = sc.nextInt();

        int index = linearSearch(numbers , key);
        if(index == -1){
            System.out.println("Not found !");
        }else{
            System.out.println("Key is at index :"+ index);
        }

    }
    
}
