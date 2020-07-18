package com.redson;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by sonpen on 20. 7. 18.
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0, i = 0, j = 0;
        int n = s.length();
        Set<Character> set = new HashSet<>();
        while(i < n && j < n ) {
            if( !set.contains(s.charAt(j))) {
                set.add(s.charAt(j));
                j++;
                ans = Math.max(ans, j-i);
            }
            else {
                set.remove(s.charAt(i));
                i++;
            }
        }

        return ans;
    }
}
