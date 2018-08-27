package com.p000;

import android.util.Log;
import java.io.Writer;

/* compiled from: LogWriter */
/* renamed from: hl */
public class hl extends Writer {
    /* renamed from: a */
    private final String f23799a;
    /* renamed from: b */
    private StringBuilder f23800b = new StringBuilder(128);

    public hl(String str) {
        this.f23799a = str;
    }

    public void close() {
        m30586a();
    }

    public void flush() {
        m30586a();
    }

    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                m30586a();
            } else {
                this.f23800b.append(c);
            }
        }
    }

    /* renamed from: a */
    private void m30586a() {
        if (this.f23800b.length() > 0) {
            Log.d(this.f23799a, this.f23800b.toString());
            this.f23800b.delete(0, this.f23800b.length());
        }
    }
}
