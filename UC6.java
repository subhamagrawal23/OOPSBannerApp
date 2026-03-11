public class UC6 {
        public static String[] O() {
        return new String[]{
                "  ***  ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                "  ***  "
        };
    }

    public static String[] P() {
        return new String[]{
                "  ** ",
                " *     * ",
                " *     * ",
                "  ** ",
                " *       ",
                " *       ",
                " *       "
        };
    }

    public static String[] S() {
        return new String[]{
                "  ** ",
                " *       ",
                " *       ",
                "  ***  ",
                "       * ",
                "       * ",
                "  ** "
        };
    
}
    public static void main(String[] args) {

        String[] O = O();
        String[] P = P();
        String[] S = S();

        System.out.println("\n--- OOPS Banner (UC6) ---\n");

        for (int i = 0; i < O.length; i++) {
            System.out.println(O[i] + " " +O[i]+ " " + P[i] + " " + S[i]);
        }
    }
}

