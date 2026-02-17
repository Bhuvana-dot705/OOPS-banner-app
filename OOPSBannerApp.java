/**
 * OOPSBannerApp UC3 - OOPS Banner using String.join()
 *
 * This program prints OOPS banner using String.join()
 * for better memory efficiency and cleaner code.
 *
 * @author Bhuvan Bham
 * @version 3.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Define a String array
        String[] lines = new String[7];
        
        // Populate each index of the array with the corresponding banner line
        lines[0] = String.join(" ", " ***** ", " ***** ", " ******", " ******");
        lines[1] = String.join(" ", "*     *", "*     *", "*     *", "*     ");
        lines[2] = String.join(" ", "*     *", "*     *", "*     *", "*     ");
        lines[3] = String.join(" ", "*     *", "*     *", "****** ", " *****");
        lines[4] = String.join(" ", "*     *", "*     *", "*      ", "     *");
        lines[5] = String.join(" ", "*     *", "*     *", "*      ", "*    *");
        lines[6] = String.join(" ", " ***** ", " ***** ", "*      ", " ****");
        
        // Use a for-each loop to iterate through the array and print each line
        for (String line : lines) {
            System.out.println(line);
        }

    }
}