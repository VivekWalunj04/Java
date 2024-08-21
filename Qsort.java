public class Qsort {

    public static void printArr(int Arr[]){
        for(int i = 0; i < Arr.length; i++){
            System.out.print(Arr[i] + " ");
        }
    }
    
    
    public static void quickSort(int Arr[], int si, int ei){
        if(si >= ei){
            return;
        }
        int pIdx = partition(Arr, si, ei);
        quickSort(Arr, si, pIdx-1);
        quickSort(Arr, pIdx+1, ei);
    }
    
    
    public static int partition(int Arr[], int si, int ei){
        int pivot = Arr[si]; // starting element is pivot
        int i = si + 1;
        int j = ei;

        while(i <= j){
            // Find elements on left that should be on right
            while(i <= ei && Arr[i] <= pivot){
                i++;
            }
            // Find elements on right that should be on left
            while(j >= si && Arr[j] > pivot){
                j--;
            }
            // Swap the elements that are out of order
            if(i < j){
                int temp = Arr[i];
                Arr[i] = Arr[j];
                Arr[j] = temp;
            }
        }
        
        // Swap pivot with the rightmost element of the left subarray
        int temp = Arr[si];
        Arr[si] = Arr[j];
        Arr[j] = temp;
        
        return j;
    }
    
    
    public static void main(String[] args) {
    
        int Arr[] = { 6, 3, 5, 7, 8, 5 };
        quickSort(Arr, 0, Arr.length - 1);
        printArr(Arr);
    }
}

