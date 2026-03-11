class CharacterPattern {
    private char character;
    private String[] pattern;

    // Constructor to store character data and its 7-line pattern
    public CharacterPattern(char character, String[] pattern) {
        this.character = character;
        this.pattern = pattern;
    }

    public String[] getPattern() {
        return pattern;
    }

    public char getCharacter() {
        return character;
    }
}

public class UC7 {
    public static void main(String[] args) {
        // 1. Define patterns using the new CharacterPattern class
        CharacterPattern oPattern = new CharacterPattern('O', new String[]{
            "  ***** ",
            " * * ",
            " * * ",
            " * * ",
            " * * ",
            " * * ",
            "  ***** "
        });

        CharacterPattern pPattern = new CharacterPattern('P', new String[]{
            "  ****** ",
            " * * ",
            " * * ",
            "  ****** ",
            " * ",
            " * ",
            " * "
        });

        CharacterPattern sPattern = new CharacterPattern('S', new String[]{
            "  ****** ",
            " * ",
            " * ",
            "  ***** ",
            "      * ",
            "      * ",
            "  ****** "
        });

    
        CharacterPattern[] word = { oPattern, oPattern, pPattern, sPattern };

        System.out.println("\n--- OOPS Banner (Encapsulated) ---\n");

      
        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();
            for (CharacterPattern cp : word) {
                line.append(cp.getPattern()[i]).append("  ");
            }
            System.out.println(line.toString());
        }
    }
}