class Search{
    public int Searchlinear(int arr[],int x){
        for(int i= 0 ;i<arr.length;i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }
}

public class linearSearch {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int x=30;
        Search obj=new Search();
        int index = obj.Searchlinear(arr, x);
        if(index != -1){
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}
