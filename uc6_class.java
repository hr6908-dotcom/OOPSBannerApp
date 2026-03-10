/**
 * OOPSBannerApp
 * Displays OOPS banner using helper methods
 *
 * @author Harish
 * @version 1.0
 */

public class uc6_class {

    public static void main(String[] args) {

        String[] O = getOPattern();
        String[] P = getPPattern();
        String[] S = getSPattern();

        // Print banner line by line
        for (int i = 0; i < 7; i++) {
            System.out.println(
                String.join(" ",
                    O[i],
                    O[i],
                    P[i],
                    S[i]
                )
            );
        }
    }

    // Method for O pattern
    public static String[] getOPattern() {
        return new String[]{
            "  *****  ",
            " *     * ",
            " *     * ",
            " *     * ",
            " *     * ",
            " *     * ",
            "  *****  "
        };
    }

    // Method for P pattern
    public static String[] getPPattern() {
        return new String[]{
            " ******  ",
            " *     * ",
            " *     * ",
            " ******  ",
            " *       ",
            " *       ",
            " *       "
        };
    }

    // Method for S pattern
    public static String[] getSPattern() {
        return new String[]{
            " ******  ",
            " *       ",
            " *       ",
            " *****   ",
            "      *  ",
            "      *  ",
            " ******  "
        };
    }
}