package C5;

import com.agnes.feature_task.enums.ToolCallEnum;

/* JADX INFO: renamed from: C5.j1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public abstract /* synthetic */ class AbstractC0109j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f2000a;

    static {
        int[] iArr = new int[ToolCallEnum.values().length];
        try {
            iArr[ToolCallEnum.QueryWeather.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ToolCallEnum.WebSearch.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ToolCallEnum.ImageSearch.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ToolCallEnum.LoadSkill.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ToolCallEnum.GenerateImage.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[ToolCallEnum.WriteReport.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[ToolCallEnum.ReadFile.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[ToolCallEnum.WriteFile.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[ToolCallEnum.Execute.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[ToolCallEnum.ProfileData.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[ToolCallEnum.ListFiles.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[ToolCallEnum.EditFile.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        f2000a = iArr;
    }
}
