class Solution {
    public String reverseVowels(String s) {
        char[] ss = s.toCharArray();
        String str = "";
        for (int i = 0; i < ss.length; i++) {
            if (isVowel(ss[i])) {
                str += ss[i];
            }
        }
        char[] newVowels = revString(str).toCharArray();
        str = "";
        int index = 0;
        for (int i = 0; i < ss.length; i++) {
            if (isVowel(ss[i])) {
                str += newVowels[index];
                index++;
                continue;
            }
            str += ss[i];
        }
        return str;
    }
    
    String revString(String str) {
        String newStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            newStr += str.charAt(i);
        }
        return newStr;
    }
    
    boolean isVowel(char ch) {
        char[] vowels = "aeiouAEIOU".toCharArray();
        for (int i = 0; i < vowels.length; i++) {
            if (ch == vowels[i]) {
                return true;
            }
        }
        return false;
    }
}
