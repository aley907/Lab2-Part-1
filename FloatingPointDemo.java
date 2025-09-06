
/**
 * Write a description of class Imprecision here.
 *
 * @author Alexander Ley, aley@student.sdccd.edu
 * @version V1.0
 * @sinc 9/6/2025
 */
public class FloatingPointDemo {
    public static void main(String[] args) {
        // Define three double variables
        double x, y, z;

        // Assign values
        x = 12345.6789e200;
        y = 1 / x;
        z = x * y;

        // Display values line by line using print + newline
        System.out.print("The value of x is: " + x + "\n");
        System.out.print("The value of y is: " + y + "\n");
        System.out.print("The value of z (x*y) is: " + z + "\n");
        System.out.print("The value of 1 - z is: " + (1 - z) + "\n");
    }
}
