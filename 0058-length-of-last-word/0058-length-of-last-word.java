class Solution {
   static int lengthOfLastWord(String str) {
        str = str.trim();
        int len = 0;
        str = str.replaceAll("\\s+", " ");
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == ' ') {
                break;
            } else
                len = len + 1;

        }
        return len;
    }
}