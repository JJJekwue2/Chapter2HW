import java.util.Scanner;
public class AreaCalc {
    public static void main(String [] args){
        Scanner  input = new Scanner(System.in);
    // Make the area of a door and window a constant variable //
        final int windowArea = 15;
        final int doorArea = 21;
    // Prompt the user to enter the length and width of the room //
        System.out.println("Enter length");
        double Length = input.nextDouble();
        System.out.println("Enter width");
        double Width = input.nextDouble();
    // Prompt the user to enter the number of windows and doors of room //
        System.out.println("Enter number of windows");
        int windowNum = input.nextInt();
        System.out.println("Enter number of doors");
        int doorNum = input.nextInt();
    // Multiply the number of doors/windows by the area to get the total amount of area taken up by doors or windows //
        int totalWindow = windowArea * windowNum;
        int totalDoor = doorNum * doorArea;
    // First the raw, length x width area is found, then subtracted by the area of the doors and windows //
        double rawArea = (Length * Width);
        double newArea = ((rawArea - totalWindow)-(totalDoor));
    // If statement to eliminate negatives in newArea //
        if (newArea <= 0) {
            newArea *= -1;
        }
    // Finally, finding the number of quartz and gallons needed for a room //
        int totalGallons = (int) (newArea / 350);
        double totalQuartz = (newArea / 87.5);

        System.out.println("The total number of gallons needed to paint the room is"+ totalGallons);
        System.out.println("The total number of quartz needed to paint the room is"+ totalQuartz);





    }
}
