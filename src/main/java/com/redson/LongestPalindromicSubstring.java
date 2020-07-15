package com.redson;

/**
 * Created by 1109806 on 2020-07-10.
 */
public class LongestPalindromicSubstring {
    String result;

    /**
     * 알고리즘: 특정 위치에서 좌우로 확장하면서 비교
     *
     * a b c d c b b
     *    <->
     *  <-   ->
     *<-       ->
     */

    public void updatePalindromicSubstring(String s, int i, int j) {
        int len = s.length();
        while( i >= 0 && j < len && s.charAt(i) == s.charAt(j)) {
            i--;
            j++;
        }
        i++;
        j--;
        if( result.length() < j-i+1 )
            result = s.substring(i, j+1);
    }

    public String longestPalindrome(String s) {
        result = "";
        if( s == null || s.isEmpty() == true)
            return result;

        for(int i = 0; i < s.length(); i++) {
            updatePalindromicSubstring(s, i, i);
            updatePalindromicSubstring(s, i, i+1);
        }
        return result;
    }
}
