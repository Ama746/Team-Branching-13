   import java.util.Scanner;
   /********************************
    Developer: Amatullaah Stevenson
    University ID: 160158221
    Function: This function takes two inputs as integers and returns the maximum one.
    ********************************/

     public class MathFunctions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  first number: ");
        int a = sc.nextInt();
        System.out.print("Enter  second number: ");
        int b = sc.nextInt();
                // Max
        System.out.println("Maximum integer is: " + max(a,b));
    }
    
    public static int max(int a, int b) {
        if (a > b ) {
            return a;
        } else {
            return b;
        }
    }
}