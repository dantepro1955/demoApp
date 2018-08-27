package com.p000;

import android.text.TextUtils;
import com.facebook.internal.NativeProtocol;
import java.util.Map;

@bhd
/* renamed from: bcw */
public final class bcw implements bcy {
    /* renamed from: a */
    private long m7511a(long j) {
        return (j - ako.m2349k().mo606a()) + ako.m2349k().mo607b();
    }

    /* renamed from: b */
    private void m7512b(blo blo, Map<String, String> map) {
        String str = (String) map.get("label");
        String str2 = (String) map.get("start_label");
        String str3 = (String) map.get("timestamp");
        if (TextUtils.isEmpty(str)) {
            bky.m9011e("No label given for CSI tick.");
        } else if (TextUtils.isEmpty(str3)) {
            bky.m9011e("No timestamp given for CSI tick.");
        } else {
            try {
                long a = m7511a(Long.parseLong(str3));
                if (TextUtils.isEmpty(str2)) {
                    str2 = "native:view_load";
                }
                blo.mo1345y().m7160a(str, str2, a);
            } catch (Throwable e) {
                bky.m9009c("Malformed timestamp for CSI tick.", e);
            }
        }
    }

    /* renamed from: c */
    private void m7513c(blo blo, Map<String, String> map) {
        String str = (String) map.get("value");
        if (TextUtils.isEmpty(str)) {
            bky.m9011e("No value given for CSI experiment.");
            return;
        }
        bbj a = blo.mo1345y().m7158a();
        if (a == null) {
            bky.m9011e("No ticker for WebView, dropping experiment ID.");
        } else {
            a.m7165a("e", str);
        }
    }

    /* renamed from: d */
    private void m7514d(blo blo, Map<String, String> map) {
        String str = (String) map.get("name");
        String str2 = (String) map.get("value");
        if (TextUtils.isEmpty(str2)) {
            bky.m9011e("No value given for CSI extra.");
        } else if (TextUtils.isEmpty(str)) {
            bky.m9011e("No name given for CSI extra.");
        } else {
            bbj a = blo.mo1345y().m7158a();
            if (a == null) {
                bky.m9011e("No ticker for WebView, dropping extra parameter.");
            } else {
                a.m7165a(str, str2);
            }
        }
    }

    /* renamed from: a */
    public void mo277a(blo blo, Map<String, String> map) {
        String str = (String) map.get(NativeProtocol.WEB_DIALOG_ACTION);
        if ("tick".equals(str)) {
            m7512b(blo, map);
        } else if ("experiment".equals(str)) {
            m7513c(blo, map);
        } else if ("extra".equals(str)) {
            m7514d(blo, map);
        }
    }
}
