package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public class C1198y extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f19441a;

    public static C1198y a() {
        return new C1198y("Protocol message had invalid UTF-8.");
    }

    public static C1197x b() {
        return new C1197x("Protocol message tag had invalid wire type.");
    }

    public static C1198y c() {
        return new C1198y("CodedInputStream encountered a malformed varint.");
    }

    public static C1198y d() {
        return new C1198y("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static C1198y e() {
        return new C1198y("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
