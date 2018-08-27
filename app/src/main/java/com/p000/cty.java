package com.p000;

import android.content.Intent;
import java.util.UUID;

/* compiled from: Util */
/* renamed from: cty */
public class cty {
    /* renamed from: a */
    public static String m24966a() {
        return UUID.randomUUID().toString();
    }

    /* renamed from: a */
    public static String m24967a(int i) {
        if (i == 1) {
            return "imageData";
        }
        if (i == 2) {
            return "metaData";
        }
        if (i == 3) {
            return "triggerCreation";
        }
        return "";
    }

    /* renamed from: a */
    public static Intent m24965a(Intent intent, String str) {
        intent.putExtra("command", 4);
        intent.putExtra("upload_id", str);
        return intent;
    }
}
