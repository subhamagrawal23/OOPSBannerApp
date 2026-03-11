import java.util.HashMap;
import java.util.Map;

class BannerCharacter {
    private final String[] pattern;

    public BannerCharacter(String[] pattern) {
        this.pattern = pattern;
    }

    public String getLine(int index) {
        return pattern[index];
    }
}

public class UC8 {
    private static final Map<Character, BannerCharacter> fontLibrary = new HashMap<>();

    public static void main(String[] args) {
        // 1. Initialize the Font Library (The "Map")
        initializeLibrary();

        // 2. Define the word to be printed
        String wordToPrint = "OOPS";

        System.out.println("\n--- Efficient OOPS Banner (UC7) ---\n");

        // 3. Render the banner line by line (assuming 7 lines per char)
        for (int i = 0; i < 7; i++) {
            StringBuilder row = new StringBuilder();
            
            for (char c : wordToPrint.toCharArray()) {
                BannerCharacter bc = fontLibrary.get(Character.toUpperCase(c));
                
                if (bc != null) {
                    row.append(bc.getLine(i)).append("  ");
                }
            }
            System.out.println(row.toString());
        }
    }

    private static void initializeLibrary() {
        fontLibrary.put('O', new BannerCharacter(new String[]{
            "  ** ", " * * ", " * * ", " * * ", " * * ", " * * ", "  ** "
        }));
        
        fontLibrary.put('P', new BannerCharacter(new String[]{
            "  ** ", " * * ", " * * ", "  ** ", " * ", " * ", " * "
        }));

        fontLibrary.put('S', new BannerCharacter(new String[]{
            "  ** ", " * ", " * ", "  ** ", "       * ", "       * ", "  *** "
        }));
    }
}