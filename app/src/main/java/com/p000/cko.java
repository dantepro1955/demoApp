package com.p000;

import com.ninegag.android.app.model.api.ApiGag;
import com.ninegag.android.app.model.api.ApiGagMedia;
import com.ninegag.android.app.model.api.ApiLoginAccount;
import com.ninegag.android.app.model.api.ApiNotifResponse.Item;
import com.ninegag.android.app.model.api.ApiUser;
import java.util.ArrayList;

/* compiled from: ModelFactory */
/* renamed from: cko */
public class cko {
    /* renamed from: a */
    public static ckb m14204a(ApiGag apiGag) {
        if (apiGag == null) {
            return null;
        }
        ckb ckb = new ckb();
        ckb.f9492b = apiGag.id;
        ckb.f9493c = apiGag.title;
        ckb.f9494d = apiGag.channel;
        ckb.f9496f = apiGag.commentSystem;
        ckb.f9499i = apiGag.commentsCount;
        ckb.f9500j = apiGag.upVoteCount;
        ckb.f9501k = apiGag.downVoteCount;
        ckb.f9505o = apiGag.version;
        ckb.f9508r = apiGag.userScore;
        ckb.f9504n = apiGag.nsfw;
        ckb.f9506p = apiGag.hasLongPostCover;
        ckb.f9495e = apiGag.type;
        ckb.f9514x = apiGag.featuredImageUrl;
        ckb.f9497g = apiGag.commentOpClientId;
        ckb.f9498h = apiGag.commentOpSignature;
        ckb.f9513w = apiGag.albumWebUrl;
        ArrayList arrayList = new ArrayList();
        ckb.f9480C = arrayList;
        if (apiGag.images != null) {
            arrayList.add(cko.m14205a(apiGag.images.image460, 0));
            arrayList.add(cko.m14205a(apiGag.images.image700, 1));
            arrayList.add(cko.m14205a(apiGag.images.imageFbThumbnail, 6));
            if (ckb.f9506p == 1) {
                arrayList.add(cko.m14205a(apiGag.images.image460c, 5));
            }
            if (ckb.m14161m()) {
                arrayList.add(cko.m14205a(apiGag.images.image460sa, 2));
                arrayList.add(cko.m14205a(apiGag.images.image700ba, 3));
                arrayList.add(cko.m14205a(apiGag.images.image460sv, 7));
            }
        }
        if (ckb.m14160l()) {
            arrayList.add(cko.m14209b(apiGag));
        }
        ckb.f9479B = cko.m14208a(apiGag.creator);
        ckb.f9483F = ckb.m14158j();
        ckb.f9485H = ckb.m14156h();
        ckb.f9486I = ckb.m14157i();
        ckb.f9484G = ckb.m14153e();
        ckb.f9487J = ckb.m14154f();
        ckb.f9488K = ckb.m14155g();
        ckb.f9515y = cpy.a((cke[]) ckb.f9480C.toArray(new cke[0]), 1);
        ckb.f9507q = apiGag.hasImageTile;
        ckb.f9516z = cpy.a(cpu.a(apiGag), 1);
        ckb.f9478A = cpy.a(apiGag.targetedAdTags, 1);
        return ckb;
    }

    /* renamed from: a */
    public static cke m14205a(ApiGagMedia apiGagMedia, int i) {
        if (apiGagMedia == null) {
            return null;
        }
        cke cke = new cke();
        cke.f9519b = apiGagMedia.width;
        cke.f9520c = apiGagMedia.height;
        cke.f9525h = apiGagMedia.url;
        cke.f9521d = i;
        return cke;
    }

    /* renamed from: b */
    public static cke m14209b(ApiGag apiGag) {
        cke cke = new cke();
        cke.f9519b = 480;
        cke.f9520c = 360;
        cke.f9525h = apiGag.imageUrlVideoPreview;
        cke.f9521d = 4;
        cke.f9526i = apiGag.videoId;
        cke.f9522e = 0;
        return cke;
    }

    /* renamed from: a */
    public static ckr m14208a(ApiUser apiUser) {
        ckr ckr = new ckr();
        ckr.f9603b = apiUser.userId;
        ckr.f9604c = apiUser.userName;
        ckr.f9605d = apiUser.profileUrl;
        ckr.f9606e = apiUser.avatarUrlSmall;
        return ckr;
    }

    /* renamed from: a */
    public static ckn m14206a(ApiLoginAccount apiLoginAccount) {
        boolean z;
        boolean z2 = false;
        ckn ckn = new ckn();
        ckn.f9565b = apiLoginAccount.userId;
        ckn.f9566c = apiLoginAccount.accountId;
        ckn.f9567d = apiLoginAccount.loginName;
        ckn.f9568e = apiLoginAccount.fullName;
        ckn.f9569f = apiLoginAccount.email;
        ckn.f9570g = apiLoginAccount.fbUserId;
        ckn.f9573j = apiLoginAccount.fbAccountName;
        ckn.f9572i = apiLoginAccount.fbDisplayName;
        ckn.f9571h = apiLoginAccount.gplusUserId;
        ckn.f9575l = apiLoginAccount.gplusAccountName;
        ckn.f9574k = apiLoginAccount.gplusDisplayName;
        ckn.f9576m = apiLoginAccount.canPostToFB > 0;
        if (apiLoginAccount.fbPublish > 0) {
            z = true;
        } else {
            z = false;
        }
        ckn.f9577n = z;
        if (apiLoginAccount.fbTimeline > 0) {
            z = true;
        } else {
            z = false;
        }
        ckn.f9578o = z;
        if (apiLoginAccount.fbLikeAction > 0) {
            z = true;
        } else {
            z = false;
        }
        ckn.f9579p = z;
        if (apiLoginAccount.safeMode > 0) {
            z = true;
        } else {
            z = false;
        }
        ckn.f9581r = z;
        ckn.f9582s = apiLoginAccount.about;
        ckn.f9583t = apiLoginAccount.lang;
        ckn.f9584u = apiLoginAccount.location;
        ckn.f9585v = apiLoginAccount.timezoneGmtOffset;
        ckn.f9586w = apiLoginAccount.website;
        ckn.f9587x = apiLoginAccount.profileUrl;
        ckn.f9588y = apiLoginAccount.avatarUrlMedium;
        ckn.f9589z = apiLoginAccount.avatarUrlSmall;
        ckn.f9560A = apiLoginAccount.avatarUrlTiny;
        if (apiLoginAccount.hasPassword > 0) {
            z2 = true;
        }
        ckn.f9580q = z2;
        ckn.f9561B = apiLoginAccount.gender;
        ckn.f9562C = apiLoginAccount.birthday;
        ckn.f9563D = apiLoginAccount.hideUpvote;
        ckn.f9564E = cpy.a(apiLoginAccount.permissionGroup, 1);
        return ckn;
    }

    /* renamed from: a */
    public static ckp m14207a(Item item) {
        if (item == null) {
            return null;
        }
        ckp ckp = new ckp();
        ckp.f9592d = item.id;
        ckp.f9594f = item.type;
        ckp.f9593e = djm.a(item);
        ckp.f9595g = item.timestamp;
        ckp.f9597i = item.isRead ? ckp.f9591c : ckp.f9590b;
        return ckp;
    }
}
