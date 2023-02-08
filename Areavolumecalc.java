
import java.util.Scanner;
public class Areavolumecalc {
    public static void main(String [] args){
        final double PI = 3.1416;
        Scanner  input = new Scanner(System.in);
        System.out.print("What is the length?");
        float length = (float) input.nextDouble();

        System.out.print("What is the radius?");
        float radius  = (float) input.nextDouble();
        /*
        The formula for area is A = 2π * r * l  +  2π * r^2
        The first part before the addition is the "left side" and after the addition
        is the "right side
        */
        // area calculation//
        float leftSide = (float) (2 * PI * radius * length);
        float rightSide = (float) (2 * PI * (radius * radius));
        float area = leftSide + rightSide;
        //volume calculation//
        float volume = (float) (PI * (radius * radius)* length);

        System.out.println("The area is"+ area);
        System.out.println("the Volume is" + volume);



















    }
}
