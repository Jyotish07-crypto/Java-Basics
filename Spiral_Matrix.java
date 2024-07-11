public class Spiral_Matrix{
    public static void Print_Spiral(int arr[][])
    {
        int sR =0, sC=0;
        int eR=arr.length-1, eC = arr[0].length-1;
        while(sR<=eR && sC<=eC)
        {
            //Top
            for(int i=sC; i<=eC;i++)
            {
                System.out.print(arr[sR][i]+" ");
            }
            //Right
            for(int i=sR+1; i<=eR;i++)
            {
                System.out.print(arr[i][eC]+" ");
            }
            //Bottom
            for(int i=eC-1; i>=sC;i--)
            {
                System.out.print(arr[eR][i]+" ");
            }
            //left
            for(int i=eR-1;i>=sR+1;i--)
            {
                System.out.print(arr[i][sC]+" ");
            }
            sR++;
            sC++;
            eC--;
            eR--;
        }

    
    }
    public static void main(String[] args) {
        int arr[][] =  {
                        {1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}
                    };
        Print_Spiral(arr);

    }
}