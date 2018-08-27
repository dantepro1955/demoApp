package com.p000;

import android.content.ContentValues;
import com.facebook.AccessToken;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.ServerProtocol;
import com.facebook.places.model.PlaceFields;
import com.facebook.share.internal.ShareConstants;
import com.inmobi.commons.analytics.db.AnalyticsSQLiteHelper;
import com.millennialmedia.android.MMRequest;
import com.millennialmedia.android.MMSDK$Event;
import com.mopub.common.AdType;

/* compiled from: GagContentValuesFactory */
/* renamed from: cik */
public class cik {
    /* renamed from: a */
    public static ContentValues m13752a(ckb ckb) {
        return cik.m13744a(null, ckb);
    }

    /* renamed from: a */
    public static ContentValues m13744a(ContentValues contentValues, ckb ckb) {
        if (contentValues == null) {
            contentValues = new ContentValues();
        }
        contentValues.put(ShareConstants.WEB_DIALOG_RESULT_PARAM_POST_ID, ckb.f9492b);
        contentValues.put("type", ckb.f9495e);
        contentValues.put("title", ckb.f9493c);
        contentValues.put("channel", ckb.f9494d);
        contentValues.put("comment_system", ckb.f9496f);
        contentValues.put("comment_op_client_id", ckb.f9497g);
        contentValues.put("comment_op_signature", ckb.f9498h);
        contentValues.put("comments_count", Integer.valueOf(ckb.f9499i));
        contentValues.put("up_vote_count", Integer.valueOf(ckb.f9500j));
        contentValues.put("down_vote_count", Integer.valueOf(ckb.f9501k));
        contentValues.put("repost_count", Integer.valueOf(ckb.f9502l));
        contentValues.put("user_voted", Integer.valueOf(ckb.f9503m));
        contentValues.put("nsfw", Integer.valueOf(ckb.f9504n));
        contentValues.put("has_long_post_cover", Integer.valueOf(ckb.f9506p));
        contentValues.put(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, Integer.valueOf(ckb.f9505o));
        contentValues.put("user_score", Integer.valueOf(ckb.f9508r));
        contentValues.put("creation_timestamp", Long.valueOf(ckb.f9509s));
        contentValues.put("created", ckb.f9510t);
        contentValues.put("via_domain", ckb.f9511u);
        contentValues.put("via_url", ckb.f9512v);
        contentValues.put("creator_id", Long.valueOf(ckb.f9482E));
        contentValues.put("image_url", ckb.f9483F);
        contentValues.put("image_width", Integer.valueOf(ckb.f9485H));
        contentValues.put("image_height", Integer.valueOf(ckb.f9486I));
        contentValues.put("short_image_url", ckb.f9484G);
        contentValues.put("short_image_width", Integer.valueOf(ckb.f9487J));
        contentValues.put("short_image_height", Integer.valueOf(ckb.f9488K));
        contentValues.put("gag_media_json", ckb.f9515y);
        contentValues.put("album_web_url", ckb.f9513w);
        contentValues.put("has_image_tile", Integer.valueOf(ckb.f9507q));
        contentValues.put("post_tile_json", ckb.f9516z);
        contentValues.put("targeted_ad_tags", ckb.f9478A);
        return contentValues;
    }

    /* renamed from: a */
    public static ContentValues m13753a(cki cki) {
        return cik.m13745a(null, cki);
    }

    /* renamed from: a */
    public static ContentValues m13745a(ContentValues contentValues, cki cki) {
        if (contentValues == null) {
            contentValues = new ContentValues();
        }
        contentValues.put(ShareConstants.WEB_DIALOG_RESULT_PARAM_POST_ID, cki.f9534b);
        contentValues.put("comment_json", cki.f9535c);
        contentValues.put("fetch_time", Long.valueOf(cki.f9536d));
        return contentValues;
    }

    /* renamed from: a */
    public static ContentValues m13754a(ckj ckj) {
        return cik.m13746a(null, ckj);
    }

    /* renamed from: a */
    public static ContentValues m13746a(ContentValues contentValues, ckj ckj) {
        if (contentValues == null) {
            contentValues = new ContentValues();
        }
        contentValues.put(ShareConstants.WEB_DIALOG_RESULT_PARAM_POST_ID, ckj.f9537b);
        contentValues.put("comment_json", ckj.f9538c);
        return contentValues;
    }

    /* renamed from: a */
    public static ContentValues m13757a(ckr ckr) {
        return cik.m13750a(null, ckr);
    }

    /* renamed from: a */
    public static ContentValues m13750a(ContentValues contentValues, ckr ckr) {
        if (contentValues == null) {
            contentValues = new ContentValues();
        }
        contentValues.put(AccessToken.USER_ID_KEY, ckr.f9603b);
        contentValues.put("user_name", ckr.f9604c);
        contentValues.put("profile_url", ckr.f9605d);
        contentValues.put("avatar_url_small", ckr.f9606e);
        return contentValues;
    }

    /* renamed from: a */
    public static ContentValues m13747a(ContentValues contentValues, ckn ckn) {
        if (contentValues == null) {
            contentValues = new ContentValues();
        }
        contentValues.put(AnalyticsSQLiteHelper.GENERAL_ID, Long.valueOf(ckn.a));
        contentValues.put(AccessToken.USER_ID_KEY, ckn.f9565b);
        contentValues.put("account_id", ckn.f9566c);
        contentValues.put("login_name", ckn.f9567d);
        contentValues.put("full_name", ckn.f9568e);
        contentValues.put(MMSDK$Event.INTENT_EMAIL, ckn.f9569f);
        contentValues.put("fb_user_id", ckn.f9570g);
        contentValues.put("fb_display_name", ckn.f9572i);
        contentValues.put("fb_account_name", ckn.f9573j);
        contentValues.put("gplus_user_id", ckn.f9571h);
        contentValues.put("gplus_display_name", ckn.f9574k);
        contentValues.put("gplus_account_name", ckn.f9575l);
        contentValues.put("can_post_to_fb", Boolean.valueOf(ckn.f9576m));
        contentValues.put("fb_publish", Boolean.valueOf(ckn.f9577n));
        contentValues.put("fb_timeline", Boolean.valueOf(ckn.f9578o));
        contentValues.put("fb_like_action", Boolean.valueOf(ckn.f9579p));
        contentValues.put("safeMode", Boolean.valueOf(ckn.f9581r));
        contentValues.put(PlaceFields.ABOUT, ckn.f9582s);
        contentValues.put("lang", ckn.f9583t);
        contentValues.put(PlaceFields.LOCATION, ckn.f9584u);
        contentValues.put("timezone_gmt_offset", ckn.f9585v);
        contentValues.put(PlaceFields.WEBSITE, ckn.f9586w);
        contentValues.put("profile_url", ckn.f9587x);
        contentValues.put("avatar_url_medium", ckn.f9588y);
        contentValues.put("avatar_url_small", ckn.f9589z);
        contentValues.put("avatar_url_tiny", ckn.f9560A);
        contentValues.put("has_password", Boolean.valueOf(ckn.f9580q));
        contentValues.put(MMRequest.KEY_GENDER, ckn.f9561B);
        contentValues.put("birthday", ckn.f9562C);
        contentValues.put("hide_upvote", ckn.f9563D);
        contentValues.put("permissions_json", ckn.f9564E);
        return contentValues;
    }

    /* renamed from: a */
    public static ContentValues m13758a(cks cks) {
        return cik.m13751a(null, cks);
    }

    /* renamed from: a */
    public static ContentValues m13751a(ContentValues contentValues, cks cks) {
        if (contentValues == null) {
            contentValues = new ContentValues();
        }
        contentValues.put(AnalyticsSQLiteHelper.GENERAL_ID, Long.valueOf(cks.f9607a));
        contentValues.put(ShareConstants.WEB_DIALOG_RESULT_PARAM_POST_ID, cks.f9608b);
        contentValues.put(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS, Integer.valueOf(cks.f9610d));
        contentValues.put("view_type", cks.f9609c);
        contentValues.put("vote", Integer.valueOf(cks.f9611e));
        return contentValues;
    }

    /* renamed from: a */
    public static ContentValues m13756a(ckq ckq) {
        return cik.m13749a(null, ckq);
    }

    /* renamed from: a */
    public static ContentValues m13749a(ContentValues contentValues, ckq ckq) {
        if (contentValues == null) {
            contentValues = new ContentValues();
        }
        contentValues.put(AnalyticsSQLiteHelper.GENERAL_ID, Long.valueOf(ckq.f9598a));
        contentValues.put(ShareConstants.WEB_DIALOG_RESULT_PARAM_POST_ID, ckq.f9599b);
        contentValues.put("view_type", ckq.f9600c);
        contentValues.put(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS, Integer.valueOf(ckq.f9601d));
        contentValues.put("reason", Integer.valueOf(ckq.f9602e));
        return contentValues;
    }

    /* renamed from: a */
    public static ContentValues m13755a(ckp ckp) {
        return cik.m13748a(null, ckp);
    }

    /* renamed from: a */
    public static ContentValues m13748a(ContentValues contentValues, ckp ckp) {
        if (contentValues == null) {
            contentValues = new ContentValues();
        }
        contentValues.put(AnalyticsSQLiteHelper.GENERAL_ID, Long.valueOf(ckp.a));
        contentValues.put("id", ckp.f9592d);
        contentValues.put(AdType.STATIC_NATIVE, ckp.f9593e);
        contentValues.put("notif_type", ckp.f9594f);
        contentValues.put("timestamp", Long.valueOf(ckp.f9595g));
        contentValues.put("display_status", Integer.valueOf(ckp.f9596h));
        contentValues.put("read_state", Integer.valueOf(ckp.f9597i));
        return contentValues;
    }
}
