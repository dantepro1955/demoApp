package com.p000;

import com.ninegag.android.app.model.api.ApiGag;
import com.ninegag.android.app.model.api.ApiGagTileGroup;
import com.ninegag.android.app.model.api.ApiGagTileImage;

/* compiled from: GagTileWrapperConverter */
/* renamed from: cpu */
public class cpu {
    /* renamed from: a */
    public static ckh m24332a(ApiGag apiGag) {
        if (apiGag == null || apiGag.hasImageTile != 1 || apiGag.postTile == null || apiGag.postTile.h800 == null || apiGag.postTile.h800.images == null) {
            return null;
        }
        ckh ckh = new ckh();
        ckg[] ckgArr = new ckg[apiGag.postTile.h800.images.length];
        for (int i = 0; i < ckgArr.length; i++) {
            ApiGagTileImage apiGagTileImage = apiGag.postTile.h800.images[i];
            ckgArr[i] = new ckg(apiGagTileImage.url, apiGagTileImage.width, apiGagTileImage.height);
        }
        ckh.f9533a = new ckf(apiGag.postTile.h800.width, apiGag.postTile.h800.height, ckgArr);
        return ckh;
    }

    /* renamed from: a */
    public static ckh m24333a(ApiGagTileGroup apiGagTileGroup) {
        if (apiGagTileGroup == null || apiGagTileGroup.h800 == null || apiGagTileGroup.h800.images == null) {
            return null;
        }
        ckh ckh = new ckh();
        ckg[] ckgArr = new ckg[apiGagTileGroup.h800.images.length];
        for (int i = 0; i < ckgArr.length; i++) {
            ApiGagTileImage apiGagTileImage = apiGagTileGroup.h800.images[i];
            ckgArr[i] = new ckg(apiGagTileImage.url, apiGagTileImage.width, apiGagTileImage.height);
        }
        ckh.f9533a = new ckf(apiGagTileGroup.h800.width, apiGagTileGroup.h800.height, ckgArr);
        return ckh;
    }
}
