package com.testcan.canbus;

public class BitUtils {

    public static boolean isBitSet(long value, int bitIndex) {
        return ((value & (1 << bitIndex))) != 0;
    }

}