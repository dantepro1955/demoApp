package com.p000;

import com.facebook.common.util.UriUtil;
import com.under9.android.lib.network.model.Constants;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: ImageDownloader */
/* renamed from: cxy */
public interface cxy {

    /* compiled from: ImageDownloader */
    /* renamed from: cxy$a */
    public enum C4660a {
        HTTP("http"),
        HTTPS("https"),
        FILE(UriUtil.LOCAL_FILE_SCHEME),
        CONTENT("content"),
        ASSETS("assets"),
        DRAWABLE("drawable"),
        UNKNOWN("");
        
        /* renamed from: h */
        private String f20655h;
        /* renamed from: i */
        private String f20656i;

        private C4660a(String str) {
            this.f20655h = str;
            this.f20656i = str + Constants.SCHEME_SEP;
        }

        /* renamed from: a */
        public String m25570a(String str) {
            return this.f20656i + str;
        }
    }

    /* renamed from: a */
    InputStream m25571a(String str, Object obj) throws IOException;
}
