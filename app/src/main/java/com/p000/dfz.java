package com.p000;

import java.util.HashMap;

/* compiled from: Logger */
/* renamed from: dfz */
public interface dfz {
    void log(String str, String str2, String str3);

    void logBreadcrumb(String str, HashMap<String, Object> hashMap);

    void logCount(String str, int i);
}
