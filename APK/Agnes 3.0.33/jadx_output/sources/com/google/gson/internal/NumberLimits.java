package com.google.gson.internal;

import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public class NumberLimits {
    private static final int MAX_NUMBER_STRING_LENGTH = 10000;

    private NumberLimits() {
    }

    private static void checkNumberStringLength(String str) {
        if (str.length() <= MAX_NUMBER_STRING_LENGTH) {
            return;
        }
        throw new NumberFormatException("Number string too large: " + str.substring(0, 30) + "...");
    }

    public static BigDecimal parseBigDecimal(String str) {
        checkNumberStringLength(str);
        BigDecimal bigDecimal = new BigDecimal(str);
        if (Math.abs(bigDecimal.scale()) < 10000) {
            return bigDecimal;
        }
        throw new NumberFormatException(T0.a.D("Number has unsupported scale: ", str));
    }

    public static BigInteger parseBigInteger(String str) {
        checkNumberStringLength(str);
        return new BigInteger(str);
    }
}
