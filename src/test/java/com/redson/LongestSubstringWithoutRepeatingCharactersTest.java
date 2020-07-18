package com.redson;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by sonpen on 20. 7. 18.
 */
public class LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    public void test() {
        LongestSubstringWithoutRepeatingCharacters l = new LongestSubstringWithoutRepeatingCharacters();
        assertEquals(3, l.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(1, l.lengthOfLongestSubstring("bbbbbbb"));
        assertEquals(3, l.lengthOfLongestSubstring("pwwkew"));
    }
}
