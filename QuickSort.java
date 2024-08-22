public class QuickSort {
    public static void printArr(int Arr[]){
        for(int i=0 ; i<Arr.length;i++){
            System.out.print(Arr[i] +" ");
        }
    }
        public static void quickSort(int Arr[],int si,int ei){
            if(si>=ei){
                return;
            }
           int pIdx =  partition(Arr,si,ei);
            quickSort(Arr,si,pIdx-1);
            quickSort(Arr,pIdx+1,ei);
        }
        public static int partition(int Arr[],int si,int ei){
            int pivot = Arr[ei]; // pivot = ending element
            int i = si-1;
            for(int j=si; j<ei; j++){
                if(Arr[j] <= pivot){
                    i++;
                    int temp=Arr[j];
                    Arr[j]=Arr[i];
                    Arr[i]=temp;
                }
            }
            i++;
            int temp=Arr[ei];
            Arr[ei]=Arr[i];
            Arr[i]=temp;
            return i;
        }
    
    public static void main(String args[]){
        int Arr[] = {6 , 3 , 5 , 7 ,2 , 8};
        quickSort(Arr,0,Arr.length-1);
        printArr(Arr);

    }
    
}
