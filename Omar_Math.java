/******************************
 * Developer: Omar Fareh
 * University ID: [230087675]
 * Function: Takes two integers as input and returns the modulus (remainder)
 ******************************/
public class Omar_Math {

    public int Mod(int x, int y) {
        if (y == 0) {
            System.out.println("Error: Cannot divide by zero.");
            return 0;
        } else {
            return x % y;
        }
    }

    
    public static void main(String[] args) {
        Omar_Math m = new Omar_Math();
        System.out.println("Result of 8 % 3 = " + m.Mod(8, 3)); // Expected: 2
    }
}
