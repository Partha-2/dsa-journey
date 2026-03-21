public class SimpleCalculator{
    public static void main(String[] args)
    {
        int num1 = 10;
        int num2 = 3;
        
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2;
        int remainder = num1 % num2;
        
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        System.out.println("Check Bigger one: " + (num1 > num2));
        System.out.println("are they equal : " + (num1==num2));

        //type casting
        double result = (double) num1 / num2;
        System.out.println("Division with type casting: " + result);
    }
}

