public class Day2RecursiveAlgorithm {
    static void printNumbers(int n){
        if(n==0) return;
        System.out.println(n);
        printNumbers(n-1);
    }

    static void printHalfNumbers(int n){
        if(n==0) return;
        System.out.println(n);
        printHalfNumbers(n/2);
    }


    public static void main(String[] args)
    {
        System.out.println("O(n)---Print Numbers");
        printNumbers(5);

        System.out.println("O(log n)---Print Half Numbers");
        printHalfNumbers(16);

    }

    
}
