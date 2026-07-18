package com.google.android.gms.internal.measurement;

import android.net.Uri;
import q.C3582e;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public abstract class L1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3582e f22079a = new C3582e(0);

    public static synchronized Uri a() {
        C3582e c3582e = f22079a;
        Uri uri = (Uri) c3582e.get("com.google.android.gms.measurement");
        if (uri != null) {
            return uri;
        }
        Uri uri2 = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
        c3582e.put("com.google.android.gms.measurement", uri2);
        return uri2;
    }
}
