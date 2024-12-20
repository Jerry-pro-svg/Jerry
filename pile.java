public class pile {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int sum = a + b;
        int diff = a - b;
        int multp = a * b;
        int modu = a % b;

       // Direct way
        System.out.println("Addition is : " + sum);
        System.out.println("Subtraction is : " + diff);
        System.out.println("Multiplication is " + multp);
        System.out.println("Modulus is : " + modu);


        // Indirect way
        System.out.println("Addition is : " + (a + b));
        System.out.println("Subtraction is : " + (a - b));
        System.out.println("Multiplication is : " + (a * b));
        System.out.println("Modulus is : " + (a % b));

          


    }

}