package com.redson;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by 1109806 on 2020-07-10.
 */
public class LongestPalindromicSubstringTest {

    @Test
    public void test() {
        LongestPalindromicSubstring lps = new LongestPalindromicSubstring();
        assertEquals("abc", lps.longestPalindromicSubstring("abc"));
    }
}
