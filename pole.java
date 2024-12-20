public class pole {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        // UNINRARY AND BINARY OPERATORS
        System.out.println("Uninary Operator is " + (++a));
        System.out.println("Binary Operator is " + (a++));

        // FURTHER EXCERCISE
        System.out.println("Binary Operators");
        System.out.println("1+2" + 1 + 2);
        System.out.println("1+2" + (1 + 2));
        System.out.println(1+2 +"= 3");



        // TERNARY OPERATORS
        int largestnumber = (a>b)?a:b;
        System.out.println("The Largest of the two numbers is " + largestnumber);



        
    }
    
}
