package com.p000;

import com.facebook.appevents.AppEventsConstants;

/* compiled from: DateTimeHelper */
/* renamed from: djf */
public final class djf {
    /* renamed from: a */
    public static String m27570a(long j) {
        int i = (int) (j % 60);
        int i2 = (int) ((j / 60) % 60);
        int i3 = (int) ((j / 3600) % 24);
        if (i3 > 0) {
            return (i3 < 10 ? AppEventsConstants.EVENT_PARAM_VALUE_NO + i3 : Integer.valueOf(i3)) + ":" + (i2 < 10 ? AppEventsConstants.EVENT_PARAM_VALUE_NO + i2 : Integer.valueOf(i2)) + ":" + (i < 10 ? AppEventsConstants.EVENT_PARAM_VALUE_NO + i : Integer.valueOf(i));
        }
        return (i2 < 10 ? AppEventsConstants.EVENT_PARAM_VALUE_NO + i2 : Integer.valueOf(i2)) + ":" + (i < 10 ? AppEventsConstants.EVENT_PARAM_VALUE_NO + i : Integer.valueOf(i));
    }
}
