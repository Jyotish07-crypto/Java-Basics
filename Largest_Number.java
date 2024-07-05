package Array;

public class Largest_Number {
    public static int find_larger(int arr[])
    {
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
                largest=arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int arr[]= {4,6,3,1,8,10};
        System.out.println("Largest Number is " + find_larger(arr));
    }
}
