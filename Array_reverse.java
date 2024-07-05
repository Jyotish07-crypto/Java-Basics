package Arrays;

public class Array_reverse {
    public static int reverse_Arr(int arr[])
    {
        int first=0, last=arr.length-1;
        while (first<=last) {
            int temp = arr[first];
            arr[first]=arr[last];
            arr[last]=temp;
            first++;
            last--;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        reverse_Arr(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }
}
