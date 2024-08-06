import java.util.*;
public class Array2D{
    public static int twoDimension(int Arr[][] , int key){
        for(int i=0;i<Arr.length;i++){
            for(int j=0;j<Arr[0].length;j++){
                
              System.out.print(Arr[i][j] +" ");
            }
            System.out.println();
        }
        for(int i=0;i<Arr.length;i++){
            for(int j=0;j<Arr[0].length;j++){
                if(Arr[i][j]==key){
              System.out.println("found at cell (" +i +"," +j+")");
              return -1;
                }
            }
            
        }
        System.out.println("Key not found");
        return 1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int Arr[][] = new int[3][3];
        int n = Arr.length;
        System.out.print("Enter number to find in array:");
        int key = sc.nextInt();
        int m = Arr[0].length;
        System.out.print("Enter elements in array:");
        for(int i=0;i<n;i++){
          for(int j=0;j<m;j++){
            Arr[i][j] = sc.nextInt();
          }
        }
        System.out.println("Matix ");
        twoDimension(Arr,key);
        
    }
}
