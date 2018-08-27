package com.p000;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.android.gms.internal.zzmk;
import java.io.IOException;

@bhd
/* renamed from: bjq */
public final class bjq implements bjs {
    /* renamed from: a */
    public ble<Info> mo1251a(final Context context) {
        final ble blb = new blb();
        if (azp.m6789a().m9300d(context)) {
            bkf.m9059a(new Runnable(this) {
                public void run() {
                    Throwable e;
                    try {
                        blb.m7770b(AdvertisingIdClient.getAdvertisingIdInfo(context));
                        return;
                    } catch (IOException e2) {
                        e = e2;
                    } catch (IllegalStateException e3) {
                        e = e3;
                    } catch (ank e4) {
                        e = e4;
                    } catch (anl e5) {
                        e = e5;
                    }
                    blb.m7769a(e);
                    bky.m9007b("Exception while getting advertising Id info", e);
                }
            });
        }
        return blb;
    }

    /* renamed from: a */
    public ble<String> mo1252a(zzmk zzmk) {
        return new blc(zzmk.f15039h);
    }
}
