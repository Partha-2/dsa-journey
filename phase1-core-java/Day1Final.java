public class Day1Final {
    public static void main(String[] args)
    {
        //Student and their details

        String name = "Partha";
        int age = 23;
        int cgpa = 8;
        char section = 'A';
        Boolean isPlaced = false;

        // variable declaration and initialization
        System.out.println("\n>==> Student Details <==<");
        System.out.println("Student Name:"+ name);
        System.out.println("Student Age:"+ age);
        System.out.println("Student CGPA:"+ cgpa);
        System.out.println("Student Section:"+ section);
        System.out.println("Is the student placed? "+ isPlaced);        

        // if else statement
        System.out.println("\n>==> Grade Calculation <==<");
        if(cgpa >=9){
            System.out.println("A Grade");
        }
        else if(cgpa >=8){
            System.out.println("B Grade");
        }
        else if(cgpa >=7){
            System.out.println("C Grade");
        }
        else{
            System.out.println("Fail");
        }

        //Type casting
         System.out.println("\n>==> Type Casting <==<");
         float cgpaFloat=(float)cgpa;
         System.out.println(cgpaFloat);

         //Ternary Operator

        System.out.println("\n>==> Ternary Operator <==<");
        String placementStatus= isPlaced?"Congralations ! You are placed." : "Keep Trying !";
        System.out.println(placementStatus);
    }
}
