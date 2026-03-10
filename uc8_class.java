import java.util.HashMap;
import java.util.Map;

/**
 * OOPSBannerApp
 * Displays OOPS banner using HashMap for character patterns
 *
 * @author Harish
 * @version 1.0
 */

public class uc8_class {

    public static void main(String[] args) {

        Map<Character, String[]> patternMap = buildCharacterPatterns();

        String message = "OOPS";

        renderBanner(message, patternMap);
    }

    /**
     * Builds and returns the HashMap containing character patterns
     * @return Map of character patterns
     */
    public static Map<Character, String[]> buildCharacterPatterns() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                "  *****  ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                "  *****  "
        });

        map.put('P', new String[]{
                " ******  ",
                " *     * ",
                " *     * ",
                " ******  ",
                " *       ",
                " *       ",
                " *       "
        });

        map.put('S', new String[]{
                " ******  ",
                " *       ",
                " *       ",
                " *****   ",
                "      *  ",
                "      *  ",
                " ******  "
        });

        return map;
    }

    /**
     * Renders the banner for the given message
     * @param message Word to display
     * @param patternMap Map containing character patterns
     */
    public static void renderBanner(String message, Map<Character, String[]> patternMap) {

        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : message.toCharArray()) {

                String[] pattern = patternMap.get(ch);

                if (pattern != null) {
                    line.append(pattern[row]).append(" ");
                }
            }

            System.out.println(line);
        }
    }
}