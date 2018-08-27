package com.p000;

import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable.Creator;

/* compiled from: ParcelableCompat */
/* renamed from: gu */
public final class gu {

    /* compiled from: ParcelableCompat */
    /* renamed from: gu$a */
    static class C5349a<T> implements Creator<T> {
        /* renamed from: a */
        final gv<T> f23749a;

        public C5349a(gv<T> gvVar) {
            this.f23749a = gvVar;
        }

        public T createFromParcel(Parcel parcel) {
            return this.f23749a.m30488b(parcel, null);
        }

        public T[] newArray(int i) {
            return this.f23749a.m30489b(i);
        }
    }

    /* renamed from: a */
    public static <T> Creator<T> m30487a(gv<T> gvVar) {
        if (VERSION.SDK_INT >= 13) {
            return gx.m30490a(gvVar);
        }
        return new C5349a(gvVar);
    }
}
