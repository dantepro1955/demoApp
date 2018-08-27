package com.p000;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.internal.ServerProtocol;

/* renamed from: bms */
public class bms {
    private final bmw zzadO;

    protected bms(bmw bmw) {
        aoi.m4679a((Object) bmw);
        this.zzadO = bmw;
    }

    private void zza(int i, String str, Object obj, Object obj2, Object obj3) {
        bnx bnx = null;
        if (this.zzadO != null) {
            bnx = this.zzadO.m9772g();
        }
        if (bnx != null) {
            bnx.m10040a(i, str, obj, obj2, obj3);
            return;
        }
        String str2 = (String) bnp.f7133c.m9985a();
        if (Log.isLoggable(str2, i)) {
            Log.println(i, str2, bms.zzc(str, obj, obj2, obj3));
        }
    }

    protected static String zzc(String str, Object obj, Object obj2, Object obj3) {
        if (str == null) {
            Object obj4 = "";
        }
        Object zzk = bms.zzk(obj);
        Object zzk2 = bms.zzk(obj2);
        Object zzk3 = bms.zzk(obj3);
        StringBuilder stringBuilder = new StringBuilder();
        String str2 = "";
        if (!TextUtils.isEmpty(obj4)) {
            stringBuilder.append(obj4);
            str2 = ": ";
        }
        if (!TextUtils.isEmpty(zzk)) {
            stringBuilder.append(str2);
            stringBuilder.append(zzk);
            str2 = ", ";
        }
        if (!TextUtils.isEmpty(zzk2)) {
            stringBuilder.append(str2);
            stringBuilder.append(zzk2);
            str2 = ", ";
        }
        if (!TextUtils.isEmpty(zzk3)) {
            stringBuilder.append(str2);
            stringBuilder.append(zzk3);
        }
        return stringBuilder.toString();
    }

    private static String zzk(Object obj) {
        if (obj == null) {
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof Boolean)) {
            return obj instanceof Throwable ? ((Throwable) obj).toString() : obj.toString();
        } else {
            return obj == Boolean.TRUE ? ServerProtocol.DIALOG_RETURN_SCOPES_TRUE : "false";
        }
    }

    protected Context getContext() {
        return this.zzadO.m9767b();
    }

    public void zza(String str, Object obj) {
        zza(2, str, obj, null, null);
    }

    public void zza(String str, Object obj, Object obj2) {
        zza(2, str, obj, obj2, null);
    }

    public void zza(String str, Object obj, Object obj2, Object obj3) {
        zza(3, str, obj, obj2, obj3);
    }

    public void zzb(String str, Object obj) {
        zza(3, str, obj, null, null);
    }

    public void zzb(String str, Object obj, Object obj2) {
        zza(3, str, obj, obj2, null);
    }

    public void zzb(String str, Object obj, Object obj2, Object obj3) {
        zza(5, str, obj, obj2, obj3);
    }

    public void zzbP(String str) {
        zza(2, str, null, null, null);
    }

    public void zzbQ(String str) {
        zza(3, str, null, null, null);
    }

    public void zzbR(String str) {
        zza(4, str, null, null, null);
    }

    public void zzbS(String str) {
        zza(5, str, null, null, null);
    }

    public void zzbT(String str) {
        zza(6, str, null, null, null);
    }

    public void zzc(String str, Object obj) {
        zza(4, str, obj, null, null);
    }

    public void zzc(String str, Object obj, Object obj2) {
        zza(5, str, obj, obj2, null);
    }

    public void zzd(String str, Object obj) {
        zza(5, str, obj, null, null);
    }

    public void zzd(String str, Object obj, Object obj2) {
        zza(6, str, obj, obj2, null);
    }

    public void zze(String str, Object obj) {
        zza(6, str, obj, null, null);
    }

    public boolean zzkI() {
        return Log.isLoggable((String) bnp.f7133c.m9985a(), 2);
    }

    protected bmr zzmA() {
        return this.zzadO.m9774i();
    }

    protected bog zzmB() {
        return this.zzadO.m9777l();
    }

    protected void zzmR() {
        this.zzadO.m9784s();
    }

    public alc zzmu() {
        return this.zzadO.m9776k();
    }

    public bmw zznQ() {
        return this.zzadO;
    }

    protected apt zznR() {
        return this.zzadO.m9769d();
    }

    protected bnx zznS() {
        return this.zzadO.m9771f();
    }

    protected bni zznT() {
        return this.zzadO.m9770e();
    }

    protected alq zznU() {
        return this.zzadO.m9773h();
    }

    protected bnm zznV() {
        return this.zzadO.m9775j();
    }

    protected boa zznW() {
        return this.zzadO.m9778m();
    }

    protected bne zznX() {
        return this.zzadO.m9781p();
    }

    protected bmq zznY() {
        return this.zzadO.m9780o();
    }

    protected bnb zznZ() {
        return this.zzadO.m9782q();
    }

    protected bnl zzoa() {
        return this.zzadO.m9783r();
    }
}
