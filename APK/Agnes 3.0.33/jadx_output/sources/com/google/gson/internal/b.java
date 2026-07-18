package com.google.gson.internal;

/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final /* synthetic */ class b implements ObjectConstructor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f23198b;

    public /* synthetic */ b(String str, int i6) {
        this.f23197a = i6;
        this.f23198b = str;
    }

    @Override // com.google.gson.internal.ObjectConstructor
    public final Object construct() {
        switch (this.f23197a) {
            case 0:
                return ConstructorConstructor.lambda$newUnsafeAllocator$20(this.f23198b);
            case 1:
                return ConstructorConstructor.lambda$newDefaultConstructor$7(this.f23198b);
            case 2:
                return ConstructorConstructor.lambda$newDefaultConstructor$8(this.f23198b);
            case 3:
                return ConstructorConstructor.lambda$get$2(this.f23198b);
            case 4:
                return ConstructorConstructor.lambda$get$3(this.f23198b);
            default:
                return ConstructorConstructor.lambda$get$4(this.f23198b);
        }
    }
}
