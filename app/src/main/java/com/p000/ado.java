package com.p000;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaFormat;
import com.facebook.common.time.Clock;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: MediaFormat */
/* renamed from: ado */
public final class ado {
    /* renamed from: a */
    public final String f620a;
    /* renamed from: b */
    public final String f621b;
    /* renamed from: c */
    public final int f622c;
    /* renamed from: d */
    public final int f623d;
    /* renamed from: e */
    public final long f624e;
    /* renamed from: f */
    public final List<byte[]> f625f;
    /* renamed from: g */
    public final boolean f626g;
    /* renamed from: h */
    public final int f627h;
    /* renamed from: i */
    public final int f628i;
    /* renamed from: j */
    public final int f629j;
    /* renamed from: k */
    public final int f630k;
    /* renamed from: l */
    public final int f631l;
    /* renamed from: m */
    public final float f632m;
    /* renamed from: n */
    public final int f633n;
    /* renamed from: o */
    public final int f634o;
    /* renamed from: p */
    public final int f635p;
    /* renamed from: q */
    public final int f636q;
    /* renamed from: r */
    public final String f637r;
    /* renamed from: s */
    public final long f638s;
    /* renamed from: t */
    private int f639t;
    /* renamed from: u */
    private MediaFormat f640u;

    /* renamed from: a */
    public static ado m814a(String str, String str2, int i, int i2, long j, int i3, int i4, List<byte[]> list) {
        return ado.m815a(str, str2, i, i2, j, i3, i4, list, -1, -1.0f);
    }

    /* renamed from: a */
    public static ado m815a(String str, String str2, int i, int i2, long j, int i3, int i4, List<byte[]> list, int i5, float f) {
        return new ado(str, str2, i, i2, j, i3, i4, i5, f, -1, -1, null, Clock.MAX_TIME, list, false, -1, -1, -1, -1);
    }

    /* renamed from: a */
    public static ado m816a(String str, String str2, int i, int i2, long j, int i3, int i4, List<byte[]> list, String str3) {
        return new ado(str, str2, i, i2, j, -1, -1, -1, -1.0f, i3, i4, str3, Clock.MAX_TIME, list, false, -1, -1, -1, -1);
    }

    /* renamed from: a */
    public static ado m818a(String str, String str2, int i, long j, String str3) {
        return ado.m819a(str, str2, i, j, str3, Clock.MAX_TIME);
    }

    /* renamed from: a */
    public static ado m819a(String str, String str2, int i, long j, String str3, long j2) {
        return new ado(str, str2, i, -1, j, -1, -1, -1, -1.0f, -1, -1, str3, j2, null, false, -1, -1, -1, -1);
    }

    /* renamed from: a */
    public static ado m817a(String str, String str2, int i, long j) {
        return new ado(str, str2, i, -1, j, -1, -1, -1, -1.0f, -1, -1, null, Clock.MAX_TIME, null, false, -1, -1, -1, -1);
    }

    /* renamed from: a */
    public static ado m813a() {
        return ado.m817a(null, "application/id3", -1, -1);
    }

    ado(String str, String str2, int i, int i2, long j, int i3, int i4, int i5, float f, int i6, int i7, String str3, long j2, List<byte[]> list, boolean z, int i8, int i9, int i10, int i11) {
        this.f620a = str;
        this.f621b = ahb.m1513a(str2);
        this.f622c = i;
        this.f623d = i2;
        this.f624e = j;
        this.f627h = i3;
        this.f628i = i4;
        this.f631l = i5;
        this.f632m = f;
        this.f633n = i6;
        this.f634o = i7;
        this.f637r = str3;
        this.f638s = j2;
        if (list == null) {
            list = Collections.emptyList();
        }
        this.f625f = list;
        this.f626g = z;
        this.f629j = i8;
        this.f630k = i9;
        this.f635p = i10;
        this.f636q = i11;
    }

    /* renamed from: a */
    public ado m822a(int i) {
        return new ado(this.f620a, this.f621b, this.f622c, i, this.f624e, this.f627h, this.f628i, this.f631l, this.f632m, this.f633n, this.f634o, this.f637r, this.f638s, this.f625f, this.f626g, this.f629j, this.f630k, this.f635p, this.f636q);
    }

    /* renamed from: a */
    public ado m823a(int i, int i2) {
        return new ado(this.f620a, this.f621b, this.f622c, this.f623d, this.f624e, this.f627h, this.f628i, this.f631l, this.f632m, this.f633n, this.f634o, this.f637r, this.f638s, this.f625f, this.f626g, this.f629j, this.f630k, i, i2);
    }

    @SuppressLint({"InlinedApi"})
    @TargetApi(16)
    /* renamed from: b */
    public final MediaFormat m824b() {
        if (this.f640u == null) {
            MediaFormat mediaFormat = new MediaFormat();
            mediaFormat.setString("mime", this.f621b);
            ado.m821a(mediaFormat, "language", this.f637r);
            ado.m820a(mediaFormat, "max-input-size", this.f623d);
            ado.m820a(mediaFormat, "width", this.f627h);
            ado.m820a(mediaFormat, "height", this.f628i);
            ado.m820a(mediaFormat, "rotation-degrees", this.f631l);
            ado.m820a(mediaFormat, "max-width", this.f629j);
            ado.m820a(mediaFormat, "max-height", this.f630k);
            ado.m820a(mediaFormat, "channel-count", this.f633n);
            ado.m820a(mediaFormat, "sample-rate", this.f634o);
            ado.m820a(mediaFormat, "encoder-delay", this.f635p);
            ado.m820a(mediaFormat, "encoder-padding", this.f636q);
            for (int i = 0; i < this.f625f.size(); i++) {
                mediaFormat.setByteBuffer("csd-" + i, ByteBuffer.wrap((byte[]) this.f625f.get(i)));
            }
            if (this.f624e != -1) {
                mediaFormat.setLong("durationUs", this.f624e);
            }
            this.f640u = mediaFormat;
        }
        return this.f640u;
    }

    public String toString() {
        return "MediaFormat(" + this.f620a + ", " + this.f621b + ", " + this.f622c + ", " + this.f623d + ", " + this.f627h + ", " + this.f628i + ", " + this.f631l + ", " + this.f632m + ", " + this.f633n + ", " + this.f634o + ", " + this.f637r + ", " + this.f624e + ", " + this.f626g + ", " + this.f629j + ", " + this.f630k + ", " + this.f635p + ", " + this.f636q + ")";
    }

    public int hashCode() {
        int i = 0;
        if (this.f639t == 0) {
            int hashCode = (this.f637r == null ? 0 : this.f637r.hashCode()) + (((((((((((((((this.f626g ? 1231 : 1237) + (((((((((((((((((this.f621b == null ? 0 : this.f621b.hashCode()) + (((this.f620a == null ? 0 : this.f620a.hashCode()) + 527) * 31)) * 31) + this.f622c) * 31) + this.f623d) * 31) + this.f627h) * 31) + this.f628i) * 31) + this.f631l) * 31) + Float.floatToRawIntBits(this.f632m)) * 31) + ((int) this.f624e)) * 31)) * 31) + this.f629j) * 31) + this.f630k) * 31) + this.f635p) * 31) + this.f636q) * 31) + this.f633n) * 31) + this.f634o) * 31);
            while (i < this.f625f.size()) {
                hashCode = Arrays.hashCode((byte[]) this.f625f.get(i)) + (hashCode * 31);
                i++;
            }
            this.f639t = hashCode;
        }
        return this.f639t;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ado ado = (ado) obj;
        if (this.f626g != ado.f626g || this.f622c != ado.f622c || this.f623d != ado.f623d || this.f627h != ado.f627h || this.f628i != ado.f628i || this.f631l != ado.f631l || this.f632m != ado.f632m || this.f629j != ado.f629j || this.f630k != ado.f630k || this.f635p != ado.f635p || this.f636q != ado.f636q || this.f633n != ado.f633n || this.f634o != ado.f634o || !ahr.m1601a(this.f620a, ado.f620a) || !ahr.m1601a(this.f637r, ado.f637r) || !ahr.m1601a(this.f621b, ado.f621b) || this.f625f.size() != ado.f625f.size()) {
            return false;
        }
        for (int i = 0; i < this.f625f.size(); i++) {
            if (!Arrays.equals((byte[]) this.f625f.get(i), (byte[]) ado.f625f.get(i))) {
                return false;
            }
        }
        return true;
    }

    @TargetApi(16)
    /* renamed from: a */
    private static final void m821a(MediaFormat mediaFormat, String str, String str2) {
        if (str2 != null) {
            mediaFormat.setString(str, str2);
        }
    }

    @TargetApi(16)
    /* renamed from: a */
    private static final void m820a(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }
}
