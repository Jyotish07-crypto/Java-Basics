package Array;

public class MaxSubArrSum {
    public static void maxSubSum(int arr[])
    {
        int sum=0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                sum=0;
                for(int k=i;k<=j;k++)
                {
                    sum+=arr[k];
                }
                if(sum>maxSum)
                {
                    maxSum=sum;
                }
            }
            System.out.println();
        }
      
        System.out.println("Max SUb arr sum " + maxSum);
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        maxSubSum(arr);

    }
}
