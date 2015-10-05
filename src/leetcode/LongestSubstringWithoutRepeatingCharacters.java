package leetcode;

import java.util.HashSet;

/**
 * Created by Fan on 10/05/2015.
 * Given a string, find the length of the longest substring without repeating characters. For *example, the longest substring without repeating letters for "abcabcbb" is "abc", which the length is 3. For "bbbbb" the longest substring is "b", with the length of 1.
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int max = 0, j = 0;

        for (int i=0; i<s.length(); i++){
            if (!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
                max = max>set.size()?max:set.size();
            }
            else {
                while (set.contains(s.charAt(i))){
                    set.remove(s.charAt(j));
                    j++;
                }
                set.add(s.charAt(i));
            }
        }

        return max;
    }

    public LongestSubstringWithoutRepeatingCharacters() {}

    public static void main(String[] args) {
        String s = "abcabcbb";
        LongestSubstringWithoutRepeatingCharacters a = new LongestSubstringWithoutRepeatingCharacters();
        int max = a.lengthOfLongestSubstring(s);

        System.out.println(max);
    }
}
