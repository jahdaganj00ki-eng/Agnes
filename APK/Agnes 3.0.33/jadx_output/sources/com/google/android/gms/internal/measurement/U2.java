package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public abstract class U2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f22157a = 0;

    static {
        if (S2.f22142e && S2.f22141d) {
            int i6 = U1.f22156a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0076 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x007a A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(byte[] bArr, int i6, int i10) {
        while (i6 < i10 && bArr[i6] >= 0) {
            i6++;
        }
        if (i6 >= i10) {
            return true;
        }
        while (i6 < i10) {
            int i11 = i6 + 1;
            int iD = bArr[i6];
            if (iD >= 0) {
                i6 = i11;
            } else if (iD < -32) {
                if (i11 >= i10) {
                    return iD == 0;
                }
                if (iD < -62) {
                    return false;
                }
                i6 += 2;
                if (bArr[i11] > -65) {
                    return false;
                }
            } else if (iD < -16) {
                if (i11 >= i10 - 1) {
                    iD = d(bArr, i11, i10);
                    if (iD == 0) {
                    }
                } else {
                    int i12 = i6 + 2;
                    char c2 = bArr[i11];
                    if (c2 > -65) {
                        return false;
                    }
                    if (iD == -32 && c2 < -96) {
                        return false;
                    }
                    if (iD == -19 && c2 >= -96) {
                        return false;
                    }
                    i6 += 3;
                    if (bArr[i12] > -65) {
                        return false;
                    }
                }
            } else if (i11 >= i10 - 2) {
                iD = d(bArr, i11, i10);
                if (iD == 0) {
                }
            } else {
                int i13 = i6 + 2;
                int i14 = bArr[i11];
                if (i14 > -65) {
                    return false;
                }
                if ((((i14 + 112) + (iD << 28)) >> 30) != 0) {
                    return false;
                }
                int i15 = i6 + 3;
                if (bArr[i13] > -65) {
                    return false;
                }
                i6 += 4;
                if (bArr[i15] > -65) {
                    return false;
                }
            }
        }
        return true;
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
                int length2 = str.length();
                while (i10 < length2) {
                    char cCharAt2 = str.charAt(i10);
                    if (cCharAt2 < 2048) {
                        i6 += (127 - cCharAt2) >>> 31;
                    } else {
                        i6 += 2;
                        if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(str, i10) < 65536) {
                                throw new T2(i10, length2);
                            }
                            i10++;
                        }
                    }
                    i10++;
                }
                i11 += i6;
            }
        }
        if (i11 >= length) {
            return i11;
        }
        long j4 = ((long) i11) + 4294967296L;
        StringBuilder sb = new StringBuilder(String.valueOf(j4).length() + 34);
        sb.append("UTF-8 length does not fit in int: ");
        sb.append(j4);
        throw new IllegalArgumentException(sb.toString());
    }

    public static int c(String str, byte[] bArr, int i6, int i10) {
        int i11;
        int i12;
        int i13;
        char cCharAt;
        int length = str.length();
        int i14 = 0;
        while (true) {
            i11 = i6 + i10;
            if (i14 >= length || (i13 = i14 + i6) >= i11 || (cCharAt = str.charAt(i14)) >= 128) {
                break;
            }
            bArr[i13] = (byte) cCharAt;
            i14++;
        }
        if (i14 == length) {
            return i6 + length;
        }
        int i15 = i6 + i14;
        while (i14 < length) {
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
                    if (i15 > i11 - 4) {
                        if (cCharAt2 >= 55296 && cCharAt2 <= 57343 && ((i12 = i14 + 1) == str.length() || !Character.isSurrogatePair(cCharAt2, str.charAt(i12)))) {
                            throw new T2(i14, length);
                        }
                        StringBuilder sb = new StringBuilder(String.valueOf(cCharAt2).length() + 25 + String.valueOf(i15).length());
                        sb.append("Failed writing ");
                        sb.append(cCharAt2);
                        sb.append(" at index ");
                        sb.append(i15);
                        throw new ArrayIndexOutOfBoundsException(sb.toString());
                    }
                    int i16 = i14 + 1;
                    if (i16 != str.length()) {
                        char cCharAt3 = str.charAt(i16);
                        if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                            int i17 = i15 + 3;
                            int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                            bArr[i15] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i15 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            bArr[i15 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i15 += 4;
                            bArr[i17] = (byte) ((codePoint & 63) | 128);
                            i14 = i16;
                        } else {
                            i14 = i16;
                        }
                    }
                    throw new T2(i14 - 1, length);
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

    public static /* synthetic */ int d(byte[] bArr, int i6, int i10) {
        int i11 = i10 - i6;
        byte b10 = bArr[i6 - 1];
        if (i11 == 0) {
            if (b10 <= -12) {
                return b10;
            }
            return -1;
        }
        if (i11 == 1) {
            byte b11 = bArr[i6];
            if (b10 > -12 || b11 > -65) {
                return -1;
            }
            return (b11 << 8) ^ b10;
        }
        if (i11 != 2) {
            throw new AssertionError();
        }
        byte b12 = bArr[i6];
        byte b13 = bArr[i6 + 1];
        if (b10 > -12 || b12 > -65 || b13 > -65) {
            return -1;
        }
        return (b13 << 16) ^ ((b12 << 8) ^ b10);
    }
}
