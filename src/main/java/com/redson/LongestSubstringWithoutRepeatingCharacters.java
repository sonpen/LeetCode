package com.redson;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by sonpen on 20. 7. 18.
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0, i = 0, j = 0;
        int n = s.length();
        Map<Character, Integer> m = new HashMap<>();
        while(i < n && j < n ) {
            if( !m.containsKey(s.charAt(j))) {
                m.put(s.charAt(j), j);
                j++;
                ans = Math.max(ans, j-i);
            }
            else {
                i = m.get(s.charAt(j)) +1;
                j = i;
                m.clear();
            }
        }

        return ans;
    }
}
