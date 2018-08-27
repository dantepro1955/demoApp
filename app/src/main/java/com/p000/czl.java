package com.p000;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.Log;
import com.facebook.internal.ServerProtocol;
import com.facebook.places.model.PlaceFields;
import com.facebook.stetho.common.Utf8Charset;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: czl */
public final class czl {
    /* renamed from: a */
    private boolean f20787a = Build.PRODUCT.equals(ServerProtocol.DIALOG_PARAM_SDK_VERSION);
    /* renamed from: b */
    private final Context f20788b;

    public czl(Object obj) {
        this.f20788b = (Context) obj;
    }

    /* renamed from: a */
    public static dni m25825a(drh drh, Map<String, dtk> map) {
        dni u = drh.m28833u();
        for (Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            dtk dtk = (dtk) entry.getValue();
            switch (dtk.m29275f()) {
                case 0:
                    u.mo4459b(str, dtk.m29272c());
                    break;
                case 1:
                    u.mo4458b(str, dtk.m29273d());
                    break;
                case 2:
                    u.mo4453a(str, czl.m25825a(drh, dtk.m29270a()));
                    break;
                case 3:
                    u.mo4454a(str, czl.m25826a(drh, dtk.m29271b()));
                    break;
                case 4:
                    u.mo4456a(str, dtk.m29274e());
                    break;
                default:
                    break;
            }
        }
        return u;
    }

    /* renamed from: a */
    public static dnj m25826a(drh drh, List<dtk> list) {
        dnj v = drh.m28834v();
        for (dtk dtk : list) {
            switch (dtk.m29275f()) {
                case 0:
                    v.mo4468a(dtk.m29272c());
                    break;
                case 1:
                    v.mo4471c(dtk.m29273d());
                    break;
                case 2:
                    v.mo4466a(czl.m25825a(drh, dtk.m29270a()));
                    break;
                case 3:
                    v.mo4467a(czl.m25826a(drh, dtk.m29271b()));
                    break;
                case 4:
                    v.mo4470b(dtk.m29274e());
                    break;
                default:
                    break;
            }
        }
        return v;
    }

    /* renamed from: a */
    public static List<czk> m25827a(byte[] bArr) throws IllegalArgumentException {
        if (bArr == null || bArr.length < 4) {
            throw new IllegalArgumentException("Cannot parse results: The buffer length is too small to be containing any results.");
        }
        dqn a = dqo.m28752a(bArr);
        List<czk> arrayList = new ArrayList();
        for (int i = 0; i < a.mo4551a(); i++) {
            arrayList.add(new czm(a.mo4552a(i)));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static void m25828a(Object obj, String str) {
        Log.i("SpeechKit", czl.m25832d(obj, str));
    }

    /* renamed from: a */
    public static void m25829a(Object obj, String str, Throwable th) {
        Log.e("SpeechKit", czl.m25832d(obj, str), th);
    }

    /* renamed from: b */
    public static void m25830b(Object obj, String str) {
        Log.w("SpeechKit", czl.m25832d(obj, str));
    }

    /* renamed from: c */
    public static void m25831c(Object obj, String str) {
        Log.e("SpeechKit", czl.m25832d(obj, str));
    }

    /* renamed from: d */
    private static String m25832d(Object obj, String str) {
        if (qt.f25252a || obj == null) {
            return str;
        }
        String name = obj.getClass().getName();
        if (name == null || name.length() == 0) {
            return str;
        }
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            lastIndexOf++;
            if (lastIndexOf < name.length()) {
                name = name.substring(lastIndexOf);
            }
        }
        return name + ": " + str;
    }

    /* renamed from: h */
    public static String m25833h() {
        return czy.m25918e().mo4262a();
    }

    /* renamed from: i */
    public static String m25834i() {
        return czy.m25918e().mo4263b();
    }

    /* renamed from: j */
    public static String m25835j() {
        return czy.m25918e().mo4264c();
    }

    /* renamed from: k */
    public static String m25836k() {
        return czy.m25918e().mo4265d();
    }

    /* renamed from: a */
    public final String m25837a() {
        String networkOperatorName = ((TelephonyManager) this.f20788b.getSystemService(PlaceFields.PHONE)).getNetworkOperatorName();
        return (networkOperatorName == null || networkOperatorName.length() == 0) ? "carrier" : networkOperatorName;
    }

    /* renamed from: b */
    public final String m25838b() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f20788b.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            String typeName = activeNetworkInfo.getTypeName();
            if (typeName != null && typeName.length() > 0) {
                return activeNetworkInfo.getTypeName();
            }
        }
        return null;
    }

    /* renamed from: c */
    public final String m25839c() {
        String f = new czy(this.f20788b).m25923f();
        return (f == null || f.length() != 0) ? f : null;
    }

    /* renamed from: d */
    public final rg m25840d() {
        return (((AudioManager) this.f20788b.getSystemService("audio")).isBluetoothScoOn() || this.f20787a) ? rg.f25315a : rg.f25316b;
    }

    /* renamed from: e */
    public final rg m25841e() {
        return ((AudioManager) this.f20788b.getSystemService("audio")).isBluetoothScoOn() ? rg.f25315a : rg.f25316b;
    }

    /* renamed from: f */
    public final byte[] m25842f() {
        try {
            ApplicationInfo applicationInfo = this.f20788b.getApplicationInfo();
            if (applicationInfo.name != null) {
                return applicationInfo.name.getBytes(Utf8Charset.NAME);
            }
            if (applicationInfo.packageName != null) {
                String[] split = applicationInfo.packageName.split(".");
                if (split.length > 1) {
                    return split[split.length - 1].getBytes(Utf8Charset.NAME);
                }
            }
            return new byte[0];
        } catch (UnsupportedEncodingException e) {
        }
    }

    /* renamed from: g */
    public final byte[] m25843g() {
        try {
            ApplicationInfo applicationInfo = this.f20788b.getApplicationInfo();
            if (applicationInfo.packageName != null) {
                return applicationInfo.packageName.getBytes(Utf8Charset.NAME);
            }
        } catch (UnsupportedEncodingException e) {
        }
        return new byte[0];
    }
}
