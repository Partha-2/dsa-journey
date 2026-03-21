public class Day1BigO{
    public static void main(String[] args) {
        int n=8;
        int[] arr={1,2,3,4,5,6,7,8};

        //O(1) constant
        System.out.println("\nconstant\n");
        System.out.println(arr[0]);

        //O(n) Linear 
        System.out.println("\nLinear\n ");
        for(int i=0;i<n;i++)
        {
            System.out.println(i);
        }

        //O(n2) Quardratic
        System.out.println("\nQuardratic\n");

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.println(i+" "+j);
            }
            
        }

        //O Binary 
        System.out.println("\nBinary\n");
        int i=1;
        while(i<n)
        {
            i=i*2;
            System.out.println(i);

        }

        
    }
}