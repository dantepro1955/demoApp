package com.p000;

import android.annotation.TargetApi;
import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

@TargetApi(13)
/* compiled from: ParcelableCompatHoneycombMR2 */
/* renamed from: gw */
class gw<T> implements ClassLoaderCreator<T> {
    /* renamed from: a */
    private final gv<T> f23750a;

    public gw(gv<T> gvVar) {
        this.f23750a = gvVar;
    }

    public T createFromParcel(Parcel parcel) {
        return this.f23750a.m30488b(parcel, null);
    }

    public T createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return this.f23750a.m30488b(parcel, classLoader);
    }

    public T[] newArray(int i) {
        return this.f23750a.m30489b(i);
    }
}
