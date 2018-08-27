package com.p000;

import android.annotation.TargetApi;
import android.app.Activity;
import android.view.ViewGroup;
import p000.dfr.C4878b;
import p000.dhi.C4909a;

/* compiled from: DefaultSnackbarOnDeniedPermissionListenerFactory */
/* renamed from: dhj */
public final class dhj {
    @TargetApi(23)
    /* renamed from: a */
    public static dhi m27298a(ViewGroup viewGroup, int i, String str) {
        C4909a a = C4909a.m27292a(viewGroup, i);
        if (viewGroup.getContext() instanceof Activity) {
            Activity activity = (Activity) viewGroup.getContext();
            djt djt = new djt(activity);
            if (!djt.m27626b("hasRequested" + str)) {
                djt.m27623a("hasRequested" + str, true);
            } else if (!cy.m25608a(activity, str)) {
                a.m27294a(C4878b.permission_setting);
            }
        }
        return a.m27296a();
    }
}
