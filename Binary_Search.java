package Array;

public class Binary_Search {
    public static int Binary(int arr[],int key)
    {
        int first =0;
        int last =arr.length-1;
        while(first<=last)
        {
            int mid = (first + last)/2;
            if(arr[mid]==key)
            {
                return mid;
            }

            else if(arr[mid]<key){
                first= mid+1;
            }
            else{
                last=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6,7,8,9,10};
        int key = 10;
        int index = Binary(arr, key);
        if(index==-1){
            System.out.println("Key doesn't found");
        }
        else{
            System.out.println("Key found at index  "+ index);
        }
        

    }
}

