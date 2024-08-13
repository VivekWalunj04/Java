import java.util.*;
// this Stair algorithm only work in when matrix is sorted in row and col wise
public class Stair_Search{
    public static boolean stairSearch(int Matrix[][] , int key){
        int row =0 , col = Matrix.length-1;
        while( row<Matrix.length && col>=0){
            if(key == Matrix[row][col]){
                System.out.print("Elements found at ( " + row +" , "+ col +")");
                return true;
            }
            else if(key < Matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("key not found");
        return false;
    }
    public static void main(String args[]){
        int Matrix[][] =new int[3][3];
        Scanner sc = new Scanner(System.in);
        int n = 3;
        int m=3;
        System.out.print("Enter elements to search:");
        int key = sc.nextInt();
        System.out.print("Enter elements in array:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){ 
                Matrix[i][j] = sc.nextInt();
            }
        }
        stairSearch(Matrix, key);
        
    }
}