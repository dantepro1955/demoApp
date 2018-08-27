package com.p000;

import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.share.internal.ShareConstants;
import com.ninegag.android.app.component.postlist.overlay.v1.OverlayUIVFragment;

/* compiled from: OverlayFragmentFactory */
/* renamed from: coe */
public class coe {
    /* renamed from: a */
    public static OverlayUIVFragment m14956a(int i, String str, cco cco, String str2) {
        OverlayUIVFragment overlayUIVFragment = new OverlayUIVFragment();
        Bundle a = coe.m14955a(i);
        a.putString(ShareConstants.WEB_DIALOG_RESULT_PARAM_POST_ID, str);
        a.putString("info_scope", cco.f8730b);
        a.putString("group_id", cco.f8732d);
        a.putString(AccessToken.USER_ID_KEY, cco.f8733e);
        a.putString("search_key", cco.f8734f);
        a.putString("list_key", cco.f8729a);
        a.putInt("list_type", cco.f8731c);
        a.putString("entry_post_id", str2);
        overlayUIVFragment.setArguments(a);
        return overlayUIVFragment;
    }

    /* renamed from: a */
    private static Bundle m14955a(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("pos", i);
        return bundle;
    }
}
