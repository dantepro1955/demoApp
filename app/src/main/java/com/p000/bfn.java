package com.p000;

import android.annotation.TargetApi;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.CalendarContract.Events;
import android.text.TextUtils;
import com.facebook.places.model.PlaceFields;
import java.util.Map;
import p000.ahs.C0181c;

@bhd
/* renamed from: bfn */
public class bfn extends bft {
    /* renamed from: a */
    private final Map<String, String> f5975a;
    /* renamed from: b */
    private final Context f5976b;
    /* renamed from: c */
    private String f5977c;
    /* renamed from: d */
    private long f5978d;
    /* renamed from: e */
    private long f5979e;
    /* renamed from: f */
    private String f5980f;
    /* renamed from: g */
    private String f5981g;

    /* renamed from: bfn$1 */
    class C11471 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ bfn f5971a;

        C11471(bfn bfn) {
            this.f5971a = bfn;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            ako.m2343e().m9098a(this.f5971a.f5976b, this.f5971a.m8166b());
        }
    }

    /* renamed from: bfn$2 */
    class C11482 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ bfn f5972a;

        C11482(bfn bfn) {
            this.f5972a = bfn;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f5972a.m8158b("Operation denied by user.");
        }
    }

    public bfn(blo blo, Map<String, String> map) {
        super(blo, "createCalendarEvent");
        this.f5975a = map;
        this.f5976b = blo.mo1316f();
        m8163c();
    }

    /* renamed from: a */
    private String m8162a(String str) {
        return TextUtils.isEmpty((CharSequence) this.f5975a.get(str)) ? "" : (String) this.f5975a.get(str);
    }

    /* renamed from: c */
    private void m8163c() {
        this.f5977c = m8162a("description");
        this.f5980f = m8162a("summary");
        this.f5978d = m8164e("start_ticks");
        this.f5979e = m8164e("end_ticks");
        this.f5981g = m8162a(PlaceFields.LOCATION);
    }

    /* renamed from: e */
    private long m8164e(String str) {
        String str2 = (String) this.f5975a.get(str);
        if (str2 == null) {
            return -1;
        }
        try {
            return Long.parseLong(str2);
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    /* renamed from: a */
    public void m8165a() {
        if (this.f5976b == null) {
            m8158b("Activity context is not available.");
        } else if (ako.m2343e().m9134e(this.f5976b).m7050e()) {
            Builder d = ako.m2343e().m9131d(this.f5976b);
            Resources t = ako.m2347i().m8965t();
            d.setTitle(t != null ? t.getString(C0181c.create_calendar_title) : "Create calendar event");
            d.setMessage(t != null ? t.getString(C0181c.create_calendar_message) : "Allow Ad to create a calendar event?");
            d.setPositiveButton(t != null ? t.getString(C0181c.accept) : "Accept", new C11471(this));
            d.setNegativeButton(t != null ? t.getString(C0181c.decline) : "Decline", new C11482(this));
            d.create().show();
        } else {
            m8158b("This feature is not available on the device.");
        }
    }

    @TargetApi(14)
    /* renamed from: b */
    Intent m8166b() {
        Intent data = new Intent("android.intent.action.EDIT").setData(Events.CONTENT_URI);
        data.putExtra("title", this.f5977c);
        data.putExtra("eventLocation", this.f5981g);
        data.putExtra("description", this.f5980f);
        if (this.f5978d > -1) {
            data.putExtra("beginTime", this.f5978d);
        }
        if (this.f5979e > -1) {
            data.putExtra("endTime", this.f5979e);
        }
        data.setFlags(268435456);
        return data;
    }
}
