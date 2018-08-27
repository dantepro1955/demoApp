package com.p000;

import android.util.SparseArray;
import com.ninegag.android.app.model.api.ApiAccountPermissionGroup;
import com.ninegag.android.app.model.api.ApiAccountPermissionGroup.C4068a;
import com.ninegag.android.app.model.api.ApiConfigResponse.ApiJSONString;
import com.ninegag.android.app.model.api.ApiConfigResponse.C4069a;
import com.ninegag.android.app.model.api.ApiFeaturedItem;
import com.ninegag.android.app.model.api.ApiFeaturedItem.C4070a;
import com.ninegag.android.app.model.api.ApiGag;
import com.ninegag.android.app.model.api.ApiGag.C4071a;
import com.ninegag.android.app.model.api.ApiGagMedia;
import com.ninegag.android.app.model.api.ApiGagMedia.C4072a;
import com.ninegag.android.app.model.api.ApiGagMediaGroup;
import com.ninegag.android.app.model.api.ApiGagMediaGroup.C4073a;
import com.ninegag.android.app.model.api.ApiGagTile;
import com.ninegag.android.app.model.api.ApiGagTile.C4074a;
import com.ninegag.android.app.model.api.ApiGagTileGroup;
import com.ninegag.android.app.model.api.ApiGagTileGroup.C4075a;
import com.ninegag.android.app.model.api.ApiGagTileImage;
import com.ninegag.android.app.model.api.ApiGagTileImage.C4076a;
import com.ninegag.android.app.model.api.ApiLoginAccount;
import com.ninegag.android.app.model.api.ApiLoginAccount.C4077a;
import com.ninegag.android.app.model.api.ApiNotifResponse.C4078a;
import com.ninegag.android.app.model.api.ApiNotifResponse.Item;
import com.ninegag.android.app.model.api.ApiPostsResponse.C4079a;
import com.ninegag.android.app.model.api.ApiPostsResponse.Data;
import com.ninegag.android.app.model.api.ApiTopCommentResponse.ApiTopComments;
import com.ninegag.android.app.model.api.ApiTopCommentResponse.C4080a;
import com.ninegag.android.app.model.api.ApiUser;
import com.ninegag.android.app.model.api.ApiUser.C4081a;

/* compiled from: GsonFactory */
/* renamed from: cpy */
public class cpy {
    /* renamed from: a */
    private static SparseArray<bub> f19953a = new SparseArray();

    /* renamed from: a */
    public static bub m24348a(int i) {
        bub bub = (bub) f19953a.get(i);
        if (bub != null) {
            return bub;
        }
        bub = cpy.m24352b(i);
        f19953a.put(i, bub);
        return bub;
    }

    /* renamed from: a */
    public static <T> T m24349a(String str, Class<T> cls, int i) {
        try {
            bub a = cpy.m24348a(i);
            if (a != null) {
                return a.a(str, cls);
            }
        } catch (buq e) {
        }
        return null;
    }

    /* renamed from: a */
    public static String m24350a(Object obj, int i) {
        try {
            bub a = cpy.m24348a(i);
            if (a != null) {
                return a.a(obj);
            }
        } catch (buq e) {
        }
        return null;
    }

    /* renamed from: b */
    private static bub m24352b(int i) {
        switch (i) {
            case 2:
                return cpy.m24351b();
            default:
                return cpy.m24347a();
        }
    }

    /* renamed from: a */
    private static bub m24347a() {
        return new buc().a();
    }

    /* renamed from: b */
    private static bub m24351b() {
        buc buc = new buc();
        buc.a(ApiAccountPermissionGroup.class, new C4068a());
        buc.a(ApiTopComments.class, new C4080a());
        buc.a(ApiJSONString.class, new C4069a());
        buc.a(ApiUser.class, new C4081a());
        buc.a(ApiGagMediaGroup.class, new C4073a());
        buc.a(ApiGagMedia.class, new C4072a());
        buc.a(ApiGagTileGroup.class, new C4075a());
        buc.a(ApiGagTile.class, new C4074a());
        buc.a(ApiGagTileImage.class, new C4076a());
        buc.a(ApiGag.class, new C4071a());
        buc.a(ApiFeaturedItem.class, new C4070a());
        buc.a(ApiLoginAccount.class, new C4077a());
        buc.a(Item.class, new C4078a());
        buc.a(Data.class, new C4079a());
        return buc.a();
    }
}
