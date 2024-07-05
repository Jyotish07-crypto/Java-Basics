package Arrays;

class Linear_Search {
    public static int Linear(int number[],int key){
        for(int i=0;i<number.length;i++)
        {
            if(number[i]==key)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[] = {1,2,3,4,5,6,7,8,9,10};
        int key = 5;
        int index = Linear(number, key);
        if(index==-1)
        {
            System.out.println("key not found");
        }
        else{
            System.out.println("Key is at index "+ index);
        }
    }
}