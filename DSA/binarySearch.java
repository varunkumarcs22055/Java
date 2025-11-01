class Search{
    public int Searchbinary(int arr[],int x,int st,int en){
        // int st = 0;
        // int en = arr.length - 1;
        // int mid = st + (en-st)/2;
        // while(st<en){
        //     if(arr[mid]==x){
        //         return mid;
        //     }
        //     else if(arr[mid]<x){
        //         st = mid +1;
        //     }
        //     else{
        //         en = mid -1;
        //     }
        //     mid = st + (en-st)/2;
        // }
        // return -1;

        if(st>en){
            return -1;
        }

        int mid = st + (en-st)/2;
        if(arr[mid]==x){
            return mid;
        }
        else if(arr[mid]<x){
            return Searchbinary(arr,x,mid+1,en);
        }
        else{
            return Searchbinary(arr,x,st,mid-1);
        }
    }
}

public class binarySearch {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int x=50;
        Search obj=new Search();
        int index = obj.Searchbinary(arr, x,0,arr.length-1);
        if(index != -1){
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}
