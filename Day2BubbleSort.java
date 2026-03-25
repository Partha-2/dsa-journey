class Day2BubbleSort{
    public static void main(String[] args){

        //Bubble sort

        int[] arr={5,3,8,1,2};


        // O(n2) nxn => 5*5 =25
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        for(int x:arr){
            System.out.print(x);
        }
    }
}