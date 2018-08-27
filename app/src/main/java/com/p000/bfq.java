package com.p000;

import android.app.AlertDialog.Builder;
import android.app.DownloadManager;
import android.app.DownloadManager.Request;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.inmobi.commons.analytics.iat.impl.AdTrackerConstants;
import java.util.Map;
import p000.ahs.C0181c;

@bhd
/* renamed from: bfq */
public class bfq extends bft {
    /* renamed from: a */
    private final Map<String, String> f6009a;
    /* renamed from: b */
    private final Context f6010b;

    /* renamed from: bfq$2 */
    class C11512 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ bfq f6008a;

        C11512(bfq bfq) {
            this.f6008a = bfq;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f6008a.m8158b("User canceled the download.");
        }
    }

    public bfq(blo blo, Map<String, String> map) {
        super(blo, "storePicture");
        this.f6009a = map;
        this.f6010b = blo.mo1316f();
    }

    /* renamed from: a */
    Request m8180a(String str, String str2) {
        Request request = new Request(Uri.parse(str));
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, str2);
        ako.m2345g().mo1262a(request);
        return request;
    }

    /* renamed from: a */
    String m8181a(String str) {
        return Uri.parse(str).getLastPathSegment();
    }

    /* renamed from: a */
    public void m8182a() {
        if (this.f6010b == null) {
            m8158b("Activity context is not available");
        } else if (ako.m2343e().m9134e(this.f6010b).m7049c()) {
            final String str = (String) this.f6009a.get("iurl");
            if (TextUtils.isEmpty(str)) {
                m8158b("Image url cannot be empty.");
            } else if (URLUtil.isValidUrl(str)) {
                final String a = m8181a(str);
                if (ako.m2343e().m9129c(a)) {
                    Resources t = ako.m2347i().m8965t();
                    Builder d = ako.m2343e().m9131d(this.f6010b);
                    d.setTitle(t != null ? t.getString(C0181c.store_picture_title) : "Save image");
                    d.setMessage(t != null ? t.getString(C0181c.store_picture_message) : "Allow Ad to store image in Picture gallery?");
                    d.setPositiveButton(t != null ? t.getString(C0181c.accept) : "Accept", new OnClickListener(this) {
                        /* renamed from: c */
                        final /* synthetic */ bfq f6007c;

                        public void onClick(DialogInterface dialogInterface, int i) {
                            try {
                                ((DownloadManager) this.f6007c.f6010b.getSystemService(AdTrackerConstants.GOAL_DOWNLOAD)).enqueue(this.f6007c.m8180a(str, a));
                            } catch (IllegalStateException e) {
                                this.f6007c.m8158b("Could not store picture.");
                            }
                        }
                    });
                    d.setNegativeButton(t != null ? t.getString(C0181c.decline) : "Decline", new C11512(this));
                    d.create().show();
                    return;
                }
                r1 = "Image type not recognized: ";
                str = String.valueOf(a);
                m8158b(str.length() != 0 ? r1.concat(str) : new String(r1));
            } else {
                r1 = "Invalid image url: ";
                str = String.valueOf(str);
                m8158b(str.length() != 0 ? r1.concat(str) : new String(r1));
            }
        } else {
            m8158b("Feature is not supported by the device.");
        }
    }
}
