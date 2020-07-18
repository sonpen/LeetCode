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
        int ans = 0, i = 0;
        int n = s.length();
        Map<Character, Integer> m = new HashMap<>();
        for(int j = 0; j < n; j++) {
            if( m.containsKey(s.charAt(j))) {
                i = Math.max(m.get(s.charAt(j))+1, i);
            }
            ans = Math.max(ans, j-i+1);
            m.put(s.charAt(j), j);
        }

        return ans;
    }
}
