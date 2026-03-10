/**
 * OOPSBannerApp
 * Displays OOPS banner using CharacterPatternMap class
 *
 * @author Harish
 * @version 1.0
 */

public class uc7_class {

    /**
     * Inner static class to store character and its banner pattern
     */
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        /**
         * Constructor
         * @param character Character symbol
         * @param pattern Banner pattern (7 lines)
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Getter for character
         * @return character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Getter for pattern
         * @return pattern array
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        CharacterPatternMap[] patterns = {

            new CharacterPatternMap('O', new String[]{
                    "  *****  ",
                    " *     * ",
                    " *     * ",
                    " *     * ",
                    " *     * ",
                    " *     * ",
                    "  *****  "
            }),

            new CharacterPatternMap('P', new String[]{
                    " ******  ",
                    " *     * ",
                    " *     * ",
                    " ******  ",
                    " *       ",
                    " *       ",
                    " *       "
            }),

            new CharacterPatternMap('S', new String[]{
                    " ******  ",
                    " *       ",
                    " *       ",
                    " *****   ",
                    "      *  ",
                    "      *  ",
                    " ******  "
            })
        };

        String word = "OOPS";

        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (char c : word.toCharArray()) {

                for (CharacterPatternMap cp : patterns) {

                    if (cp.getCharacter() == c) {
                        line.append(cp.getPattern()[row]).append(" ");
                    }
                }
            }

            System.out.println(line);
        }
    }
}