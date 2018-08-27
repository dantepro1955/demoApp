package com.p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.under9.android.lib.network.model.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: ShareHistoryTracker */
/* renamed from: did */
public class did {
    /* renamed from: a */
    private Context f21685a;
    /* renamed from: b */
    private ArrayList<String> f21686b;
    /* renamed from: c */
    private List<String> f21687c;
    /* renamed from: d */
    private List<String> f21688d;
    /* renamed from: e */
    private String f21689e;
    /* renamed from: f */
    private Drawable f21690f;

    public did(Context context, List<String> list) {
        this.f21685a = context;
        this.f21686b = new ArrayList(list);
        m27360b(null);
    }

    /* renamed from: a */
    public void m27358a(List<String> list) {
        this.f21687c = list;
    }

    /* renamed from: b */
    public void m27359b(List<String> list) {
        this.f21688d = list;
    }

    /* renamed from: a */
    public void m27357a(String str) {
        if (!TextUtils.isEmpty(str)) {
            Intent a = djs.m27614a("", "");
            a.setComponent(ComponentName.unflattenFromString(str.replace(":", Constants.SEP)));
            if (djs.m27616a(this.f21685a, a)) {
                this.f21689e = str;
                m27355c(str);
            }
        }
    }

    /* renamed from: a */
    public List<String> m27356a() {
        return this.f21686b;
    }

    /* renamed from: b */
    public boolean m27360b(String str) {
        boolean z;
        Iterator it;
        String str2;
        ArrayList arrayList = new ArrayList();
        if (this.f21687c != null) {
            arrayList.addAll(this.f21687c);
        }
        if (str != null) {
            if (!arrayList.contains(str)) {
                arrayList.add(str);
            }
            if ((this.f21688d == null || !this.f21688d.contains(str)) && !TextUtils.equals(this.f21689e, str)) {
                this.f21689e = str;
                m27355c(this.f21689e);
                z = true;
                it = this.f21686b.iterator();
                while (it.hasNext()) {
                    str2 = (String) it.next();
                    if (!arrayList.contains(str2)) {
                        arrayList.add(str2);
                    }
                }
                this.f21686b = arrayList;
                return z;
            }
        }
        z = false;
        it = this.f21686b.iterator();
        while (it.hasNext()) {
            str2 = (String) it.next();
            if (!arrayList.contains(str2)) {
                arrayList.add(str2);
            }
        }
        this.f21686b = arrayList;
        return z;
    }

    /* renamed from: c */
    private void m27355c(String str) {
        if (str != null) {
            String[] split = str.split(Constants.SEP);
            if (split.length == 1) {
                this.f21690f = djr.m27611a(this.f21685a.getPackageManager(), split[0], null);
            } else if (split.length >= 2) {
                this.f21690f = djr.m27611a(this.f21685a.getPackageManager(), split[0], split[1]);
            }
        }
    }
}
