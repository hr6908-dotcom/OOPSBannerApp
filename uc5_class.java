/**
 * OOPSBannerApp
 * Displays OOPS banner using Inline Array Initialization
 *
 * @author Harish
 * @version 1.0
 */

public class uc5_class {

    public static void main(String[] args) {

        String[] banner = {
            String.join(" ", "  *****  ", "  *****  ", " ******  ", " ****** "),
            String.join(" ", " *     * ", " *     * ", " *     * ", " *      *"),
            String.join(" ", " *     * ", " *     * ", " *     * ", " *      "),
            String.join(" ", " *     * ", " *     * ", " ******  ", " ***** "),
            String.join(" ", " *     * ", " *     * ", " *      ", "      *"),
            String.join(" ", " *     * ", " *     * ", " *      ", " *     *"),
            String.join(" ", "  *****  ", "  *****  ", " *      ", " ***** ")
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}