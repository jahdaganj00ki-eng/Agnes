package com.agnes.feature_task.enums;

import hc.a;
import java.util.Iterator;
import kotlin.jvm.internal.f;
import xc.r;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: C:\Users\JahDaGanj\AgnesAI-Chat\APK\Agnes 3.0.33\base\classes.dex */
public final class ToolCallEnum {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ToolCallEnum[] $VALUES;
    public static final Companion Companion;
    private final String valueName;
    public static final ToolCallEnum Other = new ToolCallEnum("Other", 0, "Other");
    public static final ToolCallEnum QueryWeather = new ToolCallEnum("QueryWeather", 1, "query_weather");
    public static final ToolCallEnum WebSearch = new ToolCallEnum("WebSearch", 2, "web_search");
    public static final ToolCallEnum ImageSearch = new ToolCallEnum("ImageSearch", 3, "image_search");
    public static final ToolCallEnum GenerateImage = new ToolCallEnum("GenerateImage", 4, "generate_image");
    public static final ToolCallEnum WriteReport = new ToolCallEnum("WriteReport", 5, "write_report");
    public static final ToolCallEnum WriteFile = new ToolCallEnum("WriteFile", 6, "write_file");
    public static final ToolCallEnum Execute = new ToolCallEnum("Execute", 7, "execute");
    public static final ToolCallEnum LoadSkill = new ToolCallEnum("LoadSkill", 8, "load_skill");
    public static final ToolCallEnum ProfileData = new ToolCallEnum("ProfileData", 9, "profile_data");
    public static final ToolCallEnum ReadFile = new ToolCallEnum("ReadFile", 10, "read_file");
    public static final ToolCallEnum ListFiles = new ToolCallEnum("ListFiles", 11, "list_files");
    public static final ToolCallEnum EditFile = new ToolCallEnum("EditFile", 12, "edit_file");

    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final ToolCallEnum fromString(String str) {
            Object next;
            Iterator it = ToolCallEnum.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (r.t(((ToolCallEnum) next).getValueName(), str)) {
                    break;
                }
            }
            ToolCallEnum toolCallEnum = (ToolCallEnum) next;
            return toolCallEnum == null ? ToolCallEnum.Other : toolCallEnum;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ ToolCallEnum[] $values() {
        return new ToolCallEnum[]{Other, QueryWeather, WebSearch, ImageSearch, GenerateImage, WriteReport, WriteFile, Execute, LoadSkill, ProfileData, ReadFile, ListFiles, EditFile};
    }

    static {
        ToolCallEnum[] toolCallEnumArr$values = $values();
        $VALUES = toolCallEnumArr$values;
        $ENTRIES = rc.a.o(toolCallEnumArr$values);
        Companion = new Companion(null);
    }

    private ToolCallEnum(String str, int i6, String str2) {
        this.valueName = str2;
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static ToolCallEnum valueOf(String str) {
        return (ToolCallEnum) Enum.valueOf(ToolCallEnum.class, str);
    }

    public static ToolCallEnum[] values() {
        return (ToolCallEnum[]) $VALUES.clone();
    }

    public final String getValueName() {
        return this.valueName;
    }
}
