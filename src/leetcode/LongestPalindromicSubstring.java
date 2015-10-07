package leetcode;

/**
 * Created by Fan on 10/05/2015.
 * Given a string S, find the longest palindromic substring in S.
 * You may assume that the maximum length of S is 1000, and there exists one unique longest palindromic substring.
 */
public class LongestPalindromicSubstring {
    public LongestPalindromicSubstring() {}

    public String longestPalindrome(String s) {
        if ( s==null || s.length()==0)
            return "";

        String res = "", temp;
        int maxLen = 0;
        int left, right;

        for (int i=0; i<2*s.length()-1; i++){
            left = i/2;
            right = i/2;
            if (i%2 == 1)
                right += 1;
            temp = palindromeSub(s, left, right);
            if (maxLen < temp.length()){
                maxLen = temp.length();
                res = temp;
            }
        }

        return res;

    }

    public String palindromeSub(String s, int left, int right) {
        while (left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }

        return s.substring(left+1, right);
    }

    // Alternative solution
    public String longestPalindromeAlt(String s) {
        if (s==null || s.length()==0)
            return "";
        int maxLen = 0;
        String res = "";
        boolean flag[][] = new boolean[s.length()][s.length()];

        for (int i=s.length()-1; i>=0; i--){
            for (int j=i; j<s.length(); j++){
                if (s.charAt(j)==s.charAt(i) && (j-i<=2 || flag[i+1][j-1])){
                    flag[i][j] = true;
                    if (j-i+1 > maxLen){
                        maxLen = j-i+1;
                        res = s.substring(i, j+1);
                    }
                }
            }
        }

        return res;

    }

    public static void main(String[] args) {
        LongestPalindromicSubstring a = new LongestPalindromicSubstring();
        String s = "aafqwrasdawf";
        String res1 = a.longestPalindrome(s);
        String res2 = a.longestPalindromeAlt(s);
        System.out.println(res1);
        System.out.println(res2);
    }
}
