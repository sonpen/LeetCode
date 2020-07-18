package com.redson;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by sonpen on 20. 7. 18.
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        for( int i = 0; i < s.length(); i++) {
            Set<Character> strSet = new HashSet<>();
            for( int j = i; j < s.length(); j++) {
                if( strSet.contains(s.charAt(j)) == true )
                    break;
                else
                    strSet.add(s.charAt(j));
            }
            maxLength = Math.max(maxLength, strSet.size());
        }

        return maxLength;
    }
}
