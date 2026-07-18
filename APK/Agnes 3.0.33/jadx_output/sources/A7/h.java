package A7;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class h extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f361a;

    public h(float f10) {
        this.f361a = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && Float.compare(this.f361a, ((h) obj).f361a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f361a);
    }

    public final String toString() {
        return "OnVoiceDb(db=" + this.f361a + ")";
    }
}
