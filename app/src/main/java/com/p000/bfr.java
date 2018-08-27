package com.p000;

import com.millennialmedia.android.MMSDK$Event;
import org.json.JSONObject;

@bhd
/* renamed from: bfr */
public class bfr {
    /* renamed from: a */
    private final boolean f6016a;
    /* renamed from: b */
    private final boolean f6017b;
    /* renamed from: c */
    private final boolean f6018c;
    /* renamed from: d */
    private final boolean f6019d;
    /* renamed from: e */
    private final boolean f6020e;

    /* renamed from: bfr$a */
    public static final class C1153a {
        /* renamed from: a */
        private boolean f6011a;
        /* renamed from: b */
        private boolean f6012b;
        /* renamed from: c */
        private boolean f6013c;
        /* renamed from: d */
        private boolean f6014d;
        /* renamed from: e */
        private boolean f6015e;

        /* renamed from: a */
        public C1153a m8188a(boolean z) {
            this.f6011a = z;
            return this;
        }

        /* renamed from: a */
        public bfr m8189a() {
            return new bfr();
        }

        /* renamed from: b */
        public C1153a m8190b(boolean z) {
            this.f6012b = z;
            return this;
        }

        /* renamed from: c */
        public C1153a m8191c(boolean z) {
            this.f6013c = z;
            return this;
        }

        /* renamed from: d */
        public C1153a m8192d(boolean z) {
            this.f6014d = z;
            return this;
        }

        /* renamed from: e */
        public C1153a m8193e(boolean z) {
            this.f6015e = z;
            return this;
        }
    }

    private bfr(C1153a c1153a) {
        this.f6016a = c1153a.f6011a;
        this.f6017b = c1153a.f6012b;
        this.f6018c = c1153a.f6013c;
        this.f6019d = c1153a.f6014d;
        this.f6020e = c1153a.f6015e;
    }

    /* renamed from: a */
    public JSONObject m8194a() {
        try {
            return new JSONObject().put(MMSDK$Event.INTENT_TXT_MESSAGE, this.f6016a).put(MMSDK$Event.INTENT_PHONE_CALL, this.f6017b).put(MMSDK$Event.INTENT_CALENDAR_EVENT, this.f6018c).put("storePicture", this.f6019d).put("inlineVideo", this.f6020e);
        } catch (Throwable e) {
            bky.m9007b("Error occured while obtaining the MRAID capabilities.", e);
            return null;
        }
    }
}
