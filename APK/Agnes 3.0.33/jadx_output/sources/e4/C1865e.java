package e4;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: renamed from: e4.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class C1865e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f23715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f23716d;

    public C1865e(int i6, int i10, long j4, long j10) {
        this.f23713a = i6;
        this.f23714b = i10;
        this.f23715c = j4;
        this.f23716d = j10;
    }

    public static C1865e a(File file) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            C1865e c1865e = new C1865e(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return c1865e;
        } finally {
        }
    }

    public final void b(File file) throws IOException {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f23713a);
            dataOutputStream.writeInt(this.f23714b);
            dataOutputStream.writeLong(this.f23715c);
            dataOutputStream.writeLong(this.f23716d);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C1865e)) {
            C1865e c1865e = (C1865e) obj;
            if (this.f23714b == c1865e.f23714b && this.f23715c == c1865e.f23715c && this.f23713a == c1865e.f23713a && this.f23716d == c1865e.f23716d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f23714b), Long.valueOf(this.f23715c), Integer.valueOf(this.f23713a), Long.valueOf(this.f23716d));
    }
}
