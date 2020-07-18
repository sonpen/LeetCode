package com.redson;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by sonpen on 20. 7. 18.
 */
public class LongestSubstringWithoutRepeatingCharacters {
    private boolean hasRepeatCharacters(String s) {
        Set<Character> charSet = new HashSet<>();
        for(int i = 0; i < s.length(); i++ ) {
            if(charSet.contains(s.charAt(i)) == true )
                return true;
            else
                charSet.add(s.charAt(i));
        }
        return false;
    }

    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        for( int i = 0; i < s.length(); i++) {
            for( int j = i+1; j <= s.length(); j++) {
                String substr = s.substring(i, j);
                if( hasRepeatCharacters(substr) == false && maxLength < substr.length())
                    maxLength = substr.length();
            }
        }

        return maxLength;
    }
}
