package com.p000;

import android.content.Context;
import android.util.Log;
import com.ninegag.android.library.upload.model.MediaMeta;
import java.io.File;
import p000.cug.C4521a;
import p000.cuk.C4159a;

/* compiled from: MediaProcessor */
/* renamed from: cue */
public class cue {
    /* renamed from: a */
    private cug f19921a;
    /* renamed from: b */
    private cuk f19922b;
    /* renamed from: c */
    private Context f19923c;
    /* renamed from: d */
    private C4159a f19924d;
    /* renamed from: e */
    private C4521a f19925e;

    public cue(Context context, C4159a c4159a, C4521a c4521a) {
        this.f19923c = context;
        this.f19924d = c4159a;
        this.f19925e = c4521a;
    }

    /* renamed from: a */
    public void m24257a(String str, String str2) {
        MediaMeta b = m24254b(str);
        this.f19922b = m24255a(b.f18786i, mo4104a(b.f18786i), this.f19924d);
        boolean a = this.f19922b.m25020a(b);
        boolean b2 = this.f19922b.mo4159b(b);
        if (a && b2) {
            this.f19921a.m25009a(b, str2);
        }
    }

    /* renamed from: a */
    protected cul mo4104a(int i) {
        switch (i) {
            case 0:
                return new cum();
            case 1:
                return new cun();
            case 2:
                return new cur();
            default:
                return new cum();
        }
    }

    /* renamed from: a */
    protected cuk m24255a(int i, cul cul, C4159a c4159a) {
        switch (i) {
            case 0:
            case 1:
                return new cuo(cul, c4159a);
            case 2:
                return new cuq(cul, c4159a);
            default:
                return null;
        }
    }

    /* renamed from: b */
    protected cug m24258b(int i) {
        switch (i) {
            case 0:
                return new cui();
            case 1:
                return new cuh();
            case 2:
                return new cuj();
            default:
                return new cui();
        }
    }

    /* renamed from: b */
    private MediaMeta m24254b(String str) {
        if (str == null) {
            return null;
        }
        int a = cue.m24253a(str);
        File file = new File(str);
        this.f19921a = m24258b(a);
        this.f19921a.m25010a(this.f19925e);
        return this.f19921a.mo4157a(file);
    }

    /* renamed from: a */
    public static int m24253a(String str) {
        if (str == null) {
            return 0;
        }
        try {
            String toLowerCase = str.substring(str.lastIndexOf("."), str.length()).toLowerCase();
            int i = -1;
            switch (toLowerCase.hashCode()) {
                case 1472726:
                    if (toLowerCase.equals(".gif")) {
                        i = 0;
                        break;
                    }
                    break;
                case 1478659:
                    if (toLowerCase.equals(".mp4")) {
                        i = 1;
                        break;
                    }
                    break;
            }
            switch (i) {
                case 0:
                    return 1;
                case 1:
                    return 2;
                default:
                    return 0;
            }
        } catch (Throwable e) {
            Log.e("MediaProcessor", "getFileType: ", e);
            return 0;
        }
    }
}
