class SortingEle{
    //bubble sort
    void bubbleSort(int arr[]){
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    //selection sort
    void selectionSort(int arr[]){
        int n = arr.length;
        int flag = 0;
        for (int idx = 0; idx < arr.length-1; idx++) {
            int min = idx;
            for(int j = idx+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min = j;
                    flag = 1;
                }
            }
            if(flag == 1){
                //swap
                int temp = arr[idx];
                arr[idx] = arr[min];
                arr[min] = temp;
            }else{
                break;
            }
        }
    }

    // insertion sort
    void InsertionSort(int arr[])
    {
        int n = arr.length;
        for(int i=1;i<n;i++){
            int temp = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }

    public void quickSort(int arr[],int low,int high){
        if(low<high){ 
            // To find pivot element such that
            // elements smaller than pivot are on left
            int pi = partition(arr, low, high);
            // For left and right subarrays around pivot
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }

    private static int partition(int arr[],int low ,int high){
       int pivot = arr[high];
       int i = low - 1;
       for(int j = low;j<high;j++){
        // less than pivot on the left side
           if(arr[j]<pivot){
               i++;
               //swap the elements at i and j
               int temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
           }
       }
       //swap the pivot element by the partition index
       int temp = arr[i+1];
       arr[i+1] = arr[high];
       arr[high] = temp;
       return i+1;
    }

    //merge sort
    void mergeSort(int arr[],int left,int right){
        if(left<right){
            int mid = left + (right - left)/2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid+1, right);
            merge(arr, left, mid, right);
        }
    }
    
    private void merge(int arr[], int left , int mid , int right){
        int n1 = mid - left + 1;
        int n2 = right - mid;
        
        int Larr[] = new int[n1];
        int Rarr[] = new int[n2];
        for(int i=0;i<n1;i++){
            Larr[i] = arr[left + i];
        }
        for(int j=0;j<n2;j++){
            Rarr[j] = arr[mid + 1 + j];
        }
        int i= 0 , j=0,k= left;
        while(i<n1 && j<n2){
            if(Larr[i]<=Rarr[j]){
                arr[k] = Larr[i];
                i++;
            }else{
                arr[k] = Rarr[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k] = Larr[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k] = Rarr[j];
            j++;
            k++;
        }
    }
}

public class Sorting {
    public static void main(String[] args) {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        SortingEle obj = new SortingEle();
        obj.bubbleSort(arr);
        System.out.println("Bubble Sorted array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int arr2[] = {64, 34, 25, 12, 22, 11, 90};
        obj.selectionSort(arr2);
        System.out.println("Selection Sorted array");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        
        int arr3[] = {64, 34, 25, 12, 22, 11, 90};
        obj.InsertionSort(arr3);
        System.out.println("Insertion Sorted array");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }

        System.out.println();
        int arr4[] = {64, 34, 25, 12, 22, 11, 90};
        obj.quickSort(arr4, 0, arr4.length - 1);
        System.out.println("Quick Sorted array");
        for (int i = 0; i < arr4.length; i++) {
            System.out.print(arr4[i] + " ");
        }

        System.out.println();
        int arr5[] = {64, 34, 25, 12, 22, 11, 90};
        obj.mergeSort(arr5, 0, arr5.length - 1);
        System.out.println("Merge Sorted array");
        for (int i = 0; i < arr5.length; i++) {
            System.out.print(arr5[i] + " ");
        }
    }
}
