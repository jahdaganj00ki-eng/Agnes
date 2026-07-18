package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.b1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public abstract class AbstractC1728b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f22675a = 0;

    static {
        try {
            if (System.getenv("PROTOBUF_DISABLE_UNSAFE_UTF8_PROCESSOR_FOR_TESTING") != null) {
                return;
            }
        } catch (SecurityException unused) {
        }
        if (Z0.f22671e && Z0.f22670d) {
            int i6 = AbstractC1752k0.f22703a;
        }
    }

    public static int a(String str, byte[] bArr, int i6, int i10) {
        int i11;
        int i12;
        int length;
        int i13;
        char cCharAt;
        int length2 = str.length();
        int i14 = 0;
        while (true) {
            i11 = i6 + i10;
            if (i14 >= length2 || (i13 = i14 + i6) >= i11 || (cCharAt = str.charAt(i14)) >= 128) {
                break;
            }
            bArr[i13] = (byte) cCharAt;
            i14++;
        }
        if (i14 == length2) {
            return i6 + length2;
        }
        int i15 = i6 + i14;
        while (i14 < length2) {
            char cCharAt2 = str.charAt(i14);
            if (cCharAt2 < 128 && i15 < i11) {
                bArr[i15] = (byte) cCharAt2;
                i15++;
            } else if (cCharAt2 < 2048 && i15 <= i11 - 2) {
                bArr[i15] = (byte) ((cCharAt2 >>> 6) | 960);
                bArr[i15 + 1] = (byte) ((cCharAt2 & '?') | 128);
                i15 += 2;
            } else {
                if ((cCharAt2 >= 55296 && cCharAt2 <= 57343) || i15 > i11 - 3) {
                    if (i15 <= i11 - 4) {
                        i14++;
                        if (i14 != str.length()) {
                            char cCharAt3 = str.charAt(i14);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int i16 = i15 + 3;
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                bArr[i15] = (byte) ((codePoint >>> 18) | 240);
                                bArr[i15 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                bArr[i15 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                i15 += 4;
                                bArr[i16] = (byte) ((codePoint & 63) | 128);
                            }
                        }
                        byte[] bytes = str.getBytes(A0.f22544a);
                        length = bytes.length;
                        if (length - i6 > i10) {
                            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                        }
                        System.arraycopy(bytes, 0, bArr, i6, length);
                    } else {
                        if (cCharAt2 < 55296 || cCharAt2 > 57343 || ((i12 = i14 + 1) != str.length() && Character.isSurrogatePair(cCharAt2, str.charAt(i12)))) {
                            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                        }
                        byte[] bytes2 = str.getBytes(A0.f22544a);
                        length = bytes2.length;
                        if (length - i6 > i10) {
                            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                        }
                        System.arraycopy(bytes2, 0, bArr, i6, length);
                    }
                    return i6 + length;
                }
                bArr[i15] = (byte) ((cCharAt2 >>> '\f') | 480);
                bArr[i15 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                bArr[i15 + 2] = (byte) ((cCharAt2 & '?') | 128);
                i15 += 3;
            }
            i14++;
        }
        return i15;
    }

    public static int b(String str) {
        int length = str.length();
        int i6 = 0;
        int i10 = 0;
        while (i10 < length && str.charAt(i10) < 128) {
            i10++;
        }
        int i11 = length;
        while (true) {
            if (i10 >= length) {
                break;
            }
            char cCharAt = str.charAt(i10);
            if (cCharAt < 2048) {
                i11 += (127 - cCharAt) >>> 31;
                i10++;
            } else {
                try {
                    int length2 = str.length();
                    while (i10 < length2) {
                        char cCharAt2 = str.charAt(i10);
                        if (cCharAt2 < 2048) {
                            i6 += (127 - cCharAt2) >>> 31;
                        } else {
                            i6 += 2;
                            if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                                if (Character.codePointAt(str, i10) < 65536) {
                                    throw new C1725a1("Unpaired surrogate at index " + i10 + " of " + length2);
                                }
                                i10++;
                            }
                        }
                        i10++;
                    }
                    i11 += i6;
                } catch (C1725a1 unused) {
                    return str.getBytes(A0.f22544a).length;
                }
            }
        }
        if (i11 >= length) {
            return i11;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i11) + 4294967296L));
    }

    public static boolean c(byte[] bArr, int i6, int i10) {
        while (i6 < i10 && bArr[i6] >= 0) {
            i6++;
        }
        if (i6 >= i10) {
            return true;
        }
        while (i6 < i10) {
            int i11 = i6 + 1;
            byte b10 = bArr[i6];
            if (b10 >= 0) {
                i6 = i11;
            } else {
                if (b10 < -32) {
                    if (i11 < i10 && b10 >= -62) {
                        i6 += 2;
                        if (bArr[i11] > -65) {
                        }
                    }
                    return false;
                }
                if (b10 >= -16) {
                    if (i11 >= i10 - 2) {
                        return false;
                    }
                    int i12 = i6 + 2;
                    byte b11 = bArr[i11];
                    if (b11 <= -65) {
                        if ((((b11 + 112) + (b10 << 28)) >> 30) == 0) {
                            int i13 = i6 + 3;
                            if (bArr[i12] <= -65) {
                                i6 += 4;
                                if (bArr[i13] > -65) {
                                }
                            }
                        }
                    }
                    return false;
                }
                if (i11 >= i10 - 1) {
                    return false;
                }
                int i14 = i6 + 2;
                byte b12 = bArr[i11];
                if (b12 > -65 || (b10 == -32 && b12 < -96)) {
                    return false;
                }
                if (b10 == -19 && b12 >= -96) {
                    return false;
                }
                i6 += 3;
                if (bArr[i14] > -65) {
                    return false;
                }
            }
        }
        return true;
    }
}
