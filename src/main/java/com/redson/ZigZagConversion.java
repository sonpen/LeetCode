package com.redson;

/**
 * Created by 1109806 on 2020-07-20.
 */
public class ZigZagConversion {
    public String convert(String s, int numRows) {
        StringBuilder sb = new StringBuilder();
        int len = s.length();
        for( int idxRow = 0 ; idxRow < numRows ; idxRow++) {
            int i = idxRow;
            while( i < len ) {
                sb.append(i);

            }

        }

        sb.append(1);

        return sb.toString();
    }
}
