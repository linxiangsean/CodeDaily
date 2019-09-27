
class lastSubstring{
    public static void main(String[] args) {
        String s = "aaa";

        System.out.println(last(s));

    }

    public static String last(String s) {
        int i = 0, j = 1, offset = 0, len = s.length();
        while (i + offset < len && j + offset < len) {
            char a = s.charAt(i + offset), b = s.charAt(j + offset);
            if (a == b) {
                ++offset;
            }else {
                if (a < b)  { i += offset + 1; } 
                else { j += offset + 1; } 
                if (i == j) { ++i; } // avoid duplicate start indices. 
                offset = 0; // reset offset to 0.
            }
        }
        return s.substring(Math.min(i, j));
}



}