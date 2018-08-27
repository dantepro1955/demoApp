package com.p000;

import android.database.Cursor;
import com.facebook.AccessToken;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.ServerProtocol;
import com.facebook.places.model.PlaceFields;
import com.facebook.share.internal.ShareConstants;
import com.inmobi.commons.analytics.db.AnalyticsSQLiteHelper;
import com.millennialmedia.android.MMRequest;
import com.millennialmedia.android.MMSDK$Event;
import com.mopub.common.AdType;

/* compiled from: DB */
/* renamed from: cii */
public class cii {

    /* compiled from: DB */
    /* renamed from: cii$a */
    public static class C1744a {
        /* renamed from: a */
        public static ckn m13670a(ckn ckn, Cursor cursor) {
            boolean z;
            boolean z2 = true;
            ckn.a = cursor.getLong(cursor.getColumnIndex(AnalyticsSQLiteHelper.GENERAL_ID));
            ckn.f9565b = cursor.getString(cursor.getColumnIndex(AccessToken.USER_ID_KEY));
            ckn.f9566c = cursor.getString(cursor.getColumnIndex("account_id"));
            ckn.f9567d = cursor.getString(cursor.getColumnIndex("login_name"));
            ckn.f9568e = cursor.getString(cursor.getColumnIndex("full_name"));
            ckn.f9569f = cursor.getString(cursor.getColumnIndex(MMSDK$Event.INTENT_EMAIL));
            ckn.f9570g = cursor.getString(cursor.getColumnIndex("fb_user_id"));
            ckn.f9572i = cursor.getString(cursor.getColumnIndex("fb_display_name"));
            ckn.f9573j = cursor.getString(cursor.getColumnIndex("fb_account_name"));
            ckn.f9571h = cursor.getString(cursor.getColumnIndex("gplus_user_id"));
            ckn.f9574k = cursor.getString(cursor.getColumnIndex("gplus_display_name"));
            ckn.f9575l = cursor.getString(cursor.getColumnIndex("gplus_account_name"));
            ckn.f9576m = cursor.getInt(cursor.getColumnIndex("can_post_to_fb")) > 0;
            if (cursor.getInt(cursor.getColumnIndex("fb_publish")) > 0) {
                z = true;
            } else {
                z = false;
            }
            ckn.f9577n = z;
            if (cursor.getInt(cursor.getColumnIndex("fb_timeline")) > 0) {
                z = true;
            } else {
                z = false;
            }
            ckn.f9578o = z;
            if (cursor.getInt(cursor.getColumnIndex("fb_like_action")) > 0) {
                z = true;
            } else {
                z = false;
            }
            ckn.f9579p = z;
            if (cursor.getInt(cursor.getColumnIndex("safeMode")) > 0) {
                z = true;
            } else {
                z = false;
            }
            ckn.f9581r = z;
            ckn.f9582s = cursor.getString(cursor.getColumnIndex(PlaceFields.ABOUT));
            ckn.f9583t = cursor.getString(cursor.getColumnIndex("lang"));
            ckn.f9584u = cursor.getString(cursor.getColumnIndex(PlaceFields.LOCATION));
            ckn.f9585v = cursor.getString(cursor.getColumnIndex("timezone_gmt_offset"));
            ckn.f9586w = cursor.getString(cursor.getColumnIndex(PlaceFields.WEBSITE));
            ckn.f9587x = cursor.getString(cursor.getColumnIndex("profile_url"));
            ckn.f9588y = cursor.getString(cursor.getColumnIndex("avatar_url_medium"));
            ckn.f9589z = cursor.getString(cursor.getColumnIndex("avatar_url_small"));
            ckn.f9560A = cursor.getString(cursor.getColumnIndex("avatar_url_tiny"));
            if (cursor.getInt(cursor.getColumnIndex("has_password")) <= 0) {
                z2 = false;
            }
            ckn.f9580q = z2;
            ckn.f9561B = cursor.getString(cursor.getColumnIndex(MMRequest.KEY_GENDER));
            ckn.f9562C = cursor.getString(cursor.getColumnIndex("birthday"));
            ckn.f9563D = cursor.getString(cursor.getColumnIndex("hide_upvote"));
            ckn.f9564E = cursor.getString(cursor.getColumnIndex("permissions_json"));
            return ckn;
        }

        /* renamed from: a */
        public static ckr m13673a(ckr ckr, Cursor cursor) {
            ckr.a = cursor.getLong(cursor.getColumnIndex("u__id"));
            ckr.f9603b = cursor.getString(cursor.getColumnIndex("u_user_id"));
            ckr.f9604c = cursor.getString(cursor.getColumnIndex("u_user_name"));
            ckr.f9605d = cursor.getString(cursor.getColumnIndex("u_profile_url"));
            ckr.f9606e = cursor.getString(cursor.getColumnIndex("u_avatar_url_small"));
            return ckr;
        }

        /* renamed from: a */
        public static ckb m13667a(ckb ckb, Cursor cursor) {
            ckb.a = cursor.getLong(cursor.getColumnIndex("g__id"));
            ckb.f9492b = cursor.getString(cursor.getColumnIndex("g_post_id"));
            ckb.f9495e = cursor.getString(cursor.getColumnIndex("g_type"));
            ckb.f9493c = cursor.getString(cursor.getColumnIndex("g_title"));
            ckb.f9494d = cursor.getString(cursor.getColumnIndex("g_channel"));
            ckb.f9496f = cursor.getString(cursor.getColumnIndex("g_comment_system"));
            ckb.f9497g = cursor.getString(cursor.getColumnIndex("g_comment_op_client_id"));
            ckb.f9498h = cursor.getString(cursor.getColumnIndex("g_comment_op_signature"));
            ckb.f9499i = cursor.getInt(cursor.getColumnIndex("g_comments_count"));
            ckb.f9500j = cursor.getInt(cursor.getColumnIndex("g_up_vote_count"));
            ckb.f9501k = cursor.getInt(cursor.getColumnIndex("g_down_vote_count"));
            ckb.f9502l = cursor.getInt(cursor.getColumnIndex("g_repost_count"));
            ckb.f9503m = cursor.getInt(cursor.getColumnIndex("g_user_voted"));
            ckb.f9504n = cursor.getInt(cursor.getColumnIndex("g_nsfw"));
            ckb.f9506p = cursor.getInt(cursor.getColumnIndex("g_has_long_post_cover"));
            ckb.f9505o = cursor.getInt(cursor.getColumnIndex("g_version"));
            ckb.f9508r = cursor.getInt(cursor.getColumnIndex("g_user_score"));
            ckb.f9509s = cursor.getLong(cursor.getColumnIndex("g_creation_timestamp"));
            ckb.f9510t = cursor.getString(cursor.getColumnIndex("g_created"));
            ckb.f9511u = cursor.getString(cursor.getColumnIndex("g_via_domain"));
            ckb.f9512v = cursor.getString(cursor.getColumnIndex("g_via_url"));
            ckb.f9482E = cursor.getLong(cursor.getColumnIndex("g_creator_id"));
            ckb.f9483F = cursor.getString(cursor.getColumnIndex("g_image_url"));
            ckb.f9485H = cursor.getInt(cursor.getColumnIndex("g_image_width"));
            ckb.f9486I = cursor.getInt(cursor.getColumnIndex("g_image_height"));
            ckb.f9484G = cursor.getString(cursor.getColumnIndex("g_short_image_url"));
            ckb.f9487J = cursor.getInt(cursor.getColumnIndex("g_short_image_width"));
            ckb.f9488K = cursor.getInt(cursor.getColumnIndex("g_short_image_height"));
            ckb.f9515y = cursor.getString(cursor.getColumnIndex("g_gag_media_json"));
            ckb.f9513w = cursor.getString(cursor.getColumnIndex("g_album_web_url"));
            ckb.f9507q = cursor.getInt(cursor.getColumnIndex("g_has_image_tile"));
            ckb.f9516z = cursor.getString(cursor.getColumnIndex("g_post_tile_json"));
            ckb.f9478A = cursor.getString(cursor.getColumnIndex("g_targeted_ad_tags"));
            return ckb;
        }

        /* renamed from: a */
        public static ckj m13669a(ckj ckj, Cursor cursor) {
            ckj.a = cursor.getLong(cursor.getColumnIndex(AnalyticsSQLiteHelper.GENERAL_ID));
            ckj.f9537b = cursor.getString(cursor.getColumnIndex(ShareConstants.WEB_DIALOG_RESULT_PARAM_POST_ID));
            ckj.f9538c = cursor.getString(cursor.getColumnIndex("comment_json"));
            return ckj;
        }

        /* renamed from: a */
        public static cks m13674a(cks cks, Cursor cursor) {
            cks.f9607a = cursor.getLong(cursor.getColumnIndex(AnalyticsSQLiteHelper.GENERAL_ID));
            cks.f9608b = cursor.getString(cursor.getColumnIndex(ShareConstants.WEB_DIALOG_RESULT_PARAM_POST_ID));
            cks.f9609c = cursor.getString(cursor.getColumnIndex("view_type"));
            cks.f9610d = cursor.getInt(cursor.getColumnIndex(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS));
            cks.f9611e = cursor.getInt(cursor.getColumnIndex("vote"));
            return cks;
        }

        /* renamed from: a */
        public static ckq m13672a(ckq ckq, Cursor cursor) {
            ckq.f9598a = cursor.getLong(cursor.getColumnIndex(AnalyticsSQLiteHelper.GENERAL_ID));
            ckq.f9599b = cursor.getString(cursor.getColumnIndex(ShareConstants.WEB_DIALOG_RESULT_PARAM_POST_ID));
            ckq.f9600c = cursor.getString(cursor.getColumnIndex("view_type"));
            ckq.f9601d = cursor.getInt(cursor.getColumnIndex(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS));
            ckq.f9602e = cursor.getInt(cursor.getColumnIndex("reason"));
            return ckq;
        }

        /* renamed from: a */
        public static cki m13668a(cki cki, Cursor cursor) {
            cki.a = cursor.getLong(cursor.getColumnIndex(AnalyticsSQLiteHelper.GENERAL_ID));
            cki.f9534b = cursor.getString(cursor.getColumnIndex(ShareConstants.WEB_DIALOG_RESULT_PARAM_POST_ID));
            cki.f9535c = cursor.getString(cursor.getColumnIndex("comment_json"));
            cki.f9536d = cursor.getLong(cursor.getColumnIndex("fetch_time"));
            return cki;
        }

        /* renamed from: a */
        public static cju m13666a(cju cju, Cursor cursor) {
            cju.f9440a = cursor.getLong(cursor.getColumnIndex(AnalyticsSQLiteHelper.GENERAL_ID));
            cju.f9441b = cursor.getString(cursor.getColumnIndex("key"));
            cju.f9442c = cursor.getString(cursor.getColumnIndex("value"));
            return cju;
        }

        /* renamed from: a */
        public static ckp m13671a(ckp ckp, Cursor cursor) {
            ckp.a = cursor.getLong(cursor.getColumnIndex(AnalyticsSQLiteHelper.GENERAL_ID));
            ckp.f9592d = cursor.getString(cursor.getColumnIndex("id"));
            ckp.f9593e = cursor.getString(cursor.getColumnIndex(AdType.STATIC_NATIVE));
            ckp.f9594f = cursor.getString(cursor.getColumnIndex("notif_type"));
            ckp.f9595g = cursor.getLong(cursor.getColumnIndex("timestamp"));
            ckp.f9596h = cursor.getInt(cursor.getColumnIndex("display_status"));
            ckp.f9597i = cursor.getInt(cursor.getColumnIndex("read_state"));
            return ckp;
        }
    }

    /* compiled from: DB */
    /* renamed from: cii$b */
    public static class C1745b {
        /* renamed from: a */
        public static String[] f9334a = new String[]{AnalyticsSQLiteHelper.GENERAL_ID, AccessToken.USER_ID_KEY, "account_id", "login_name", "full_name", MMSDK$Event.INTENT_EMAIL, "fb_user_id", "fb_display_name", "fb_account_name", "gplus_user_id", "gplus_display_name", "gplus_account_name", "can_post_to_fb", "fb_publish", "fb_timeline", "fb_like_action", "safeMode", PlaceFields.ABOUT, "lang", PlaceFields.LOCATION, "timezone_gmt_offset", PlaceFields.WEBSITE, "profile_url", "avatar_url_medium", "avatar_url_small", "avatar_url_tiny", "has_password", MMRequest.KEY_GENDER, "birthday", "hide_upvote", "permissions_json"};
        /* renamed from: b */
        public static String[] f9335b = new String[]{AnalyticsSQLiteHelper.GENERAL_ID, AccessToken.USER_ID_KEY, "user_name", "profile_url", "avatar_url_small"};
        /* renamed from: c */
        public static String[] f9336c = new String[]{AnalyticsSQLiteHelper.GENERAL_ID, ShareConstants.WEB_DIALOG_RESULT_PARAM_POST_ID, "type", "title", "channel", "comment_system", "comment_op_client_id", "comment_op_signature", "comments_count", "up_vote_count", "down_vote_count", "repost_count", "user_voted", "nsfw", "has_long_post_cover", ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, "user_score", "creation_timestamp", "created", "via_domain", "via_url", "creator_id", "image_url", "image_width", "image_height", "short_image_url", "short_image_width", "short_image_height", "gag_media_json", "album_web_url", "has_image_tile", "post_tile_json"};
        /* renamed from: d */
        public static String[] f9337d = new String[]{AnalyticsSQLiteHelper.GENERAL_ID, ShareConstants.WEB_DIALOG_RESULT_PARAM_POST_ID, "comment_json"};
        /* renamed from: e */
        public static String[] f9338e = new String[]{AnalyticsSQLiteHelper.GENERAL_ID, ShareConstants.WEB_DIALOG_RESULT_PARAM_POST_ID, "view_type", AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS, "vote"};
        /* renamed from: f */
        public static String[] f9339f = new String[]{AnalyticsSQLiteHelper.GENERAL_ID, ShareConstants.WEB_DIALOG_RESULT_PARAM_POST_ID, "view_type", AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS, "reason"};
        /* renamed from: g */
        public static String[] f9340g = new String[]{AnalyticsSQLiteHelper.GENERAL_ID, "list_type", "group_id", "filter_key", "is_new", "gag_id", "display_status", "order_id", "sort_ts", "force_hide", "featured_image_url", "user_action_label", "highlight_comment_id"};
        /* renamed from: h */
        public static String[] f9341h = new String[]{AnalyticsSQLiteHelper.GENERAL_ID, ShareConstants.WEB_DIALOG_RESULT_PARAM_POST_ID, "comment_json", "fetch_time"};
        /* renamed from: i */
        public static String[] f9342i = new String[]{AnalyticsSQLiteHelper.GENERAL_ID, "id", "url", "name", "list_type", "og_image_url"};
        /* renamed from: j */
        public static String[] f9343j = new String[]{AnalyticsSQLiteHelper.GENERAL_ID, "key", "value"};
        /* renamed from: k */
        public static String[] f9344k = new String[]{AnalyticsSQLiteHelper.GENERAL_ID, "id", AdType.STATIC_NATIVE, "notif_type", "timestamp", "display_status", "read_state"};
        /* renamed from: l */
        public static String[] f9345l = new String[]{"gli._id as gli__id", "gli.list_type as gli_list_type", "gli.group_id as gli_group_id", "gli.filter_key as gli_filter_key", "gli.is_new as gli_is_new", "gli.gag_id as gli_gag_id", "gli.display_status as gli_display_status", "gli.order_id as gli_order_id", "gli.sort_ts as gli_sort_ts", "gli.force_hide as gli_force_hide", "gli.featured_image_url as gli_featured_image_url", "gli.user_action_label as gli_user_action_label", "gli.highlight_comment_id as gli_highlight_comment_id", "g._id as g__id", "g.post_id as g_post_id", "g.type as g_type", "g.title as g_title", "g.channel as g_channel", "g.comment_system as g_comment_system", "g.comment_op_client_id as g_comment_op_client_id", "g.comment_op_signature as g_comment_op_signature", "g.comments_count as g_comments_count", "g.up_vote_count as g_up_vote_count", "g.down_vote_count as g_down_vote_count", "g.repost_count as g_repost_count", "g.user_voted as g_user_voted", "g.nsfw as g_nsfw", "g.has_long_post_cover as g_has_long_post_cover", "g.version as g_version", "g.user_score as g_user_score", "g.creation_timestamp as g_creation_timestamp", "g.created as g_created", "g.via_domain as g_via_domain", "g.via_url as g_via_url", "g.creator_id as g_creator_id", "g.image_url as g_image_url", "g.image_width as g_image_width", "g.image_height as g_image_height", "g.short_image_url as g_short_image_url", "g.short_image_width as g_short_image_width", "g.short_image_height as g_short_image_height", "g.gag_media_json as g_gag_media_json", "g.album_web_url as g_album_web_url", "g.has_image_tile as g_has_image_tile", "g.post_tile_json as g_post_tile_json"};
        /* renamed from: m */
        public static String[] f9346m = new String[]{"g._id as g__id", "g.post_id as g_post_id", "g.type as g_type", "g.title as g_title", "g.channel as g_channel", "g.comment_system as g_comment_system", "g.comment_op_client_id as g_comment_op_client_id", "g.comment_op_signature as g_comment_op_signature", "g.comments_count as g_comments_count", "g.up_vote_count as g_up_vote_count", "g.down_vote_count as g_down_vote_count", "g.repost_count as g_repost_count", "g.user_voted as g_user_voted", "g.nsfw as g_nsfw", "g.has_long_post_cover as g_has_long_post_cover", "g.version as g_version", "g.user_score as g_user_score", "g.creation_timestamp as g_creation_timestamp", "g.created as g_created", "g.via_domain as g_via_domain", "g.via_url as g_via_url", "g.creator_id as g_creator_id", "g.image_url as g_image_url", "g.image_width as g_image_width", "g.image_height as g_image_height", "g.short_image_url as g_short_image_url", "g.short_image_width as g_short_image_width", "g.short_image_height as g_short_image_height", "g.gag_media_json as g_gag_media_json", "g.album_web_url as g_album_web_url", "g.has_image_tile as g_has_image_tile", "g.post_tile_json as g_post_tile_json", "u._id as u__id", "u.user_id as u_user_id", "u.user_name as u_user_name", "u.profile_url as u_profile_url", "u.avatar_url_small as u_avatar_url_small"};
        /* renamed from: n */
        public static String[] f9347n = new String[]{"gli._id as gli__id", "gli.list_type as gli_list_type", "gli.group_id as gli_group_id", "gli.filter_key as gli_filter_key", "gli.is_new as gli_is_new", "gli.gag_id as gli_gag_id", "gli.display_status as gli_display_status", "gli.order_id as gli_order_id", "gli.sort_ts as gli_sort_ts", "gli.force_hide as gli_force_hide", "gli.featured_image_url as gli_featured_image_url", "gli.user_action_label as gli_user_action_label", "gli.highlight_comment_id as gli_highlight_comment_id", "g._id as g__id", "g.post_id as g_post_id", "g.type as g_type", "g.title as g_title", "g.channel as g_channel", "g.comment_system as g_comment_system", "g.comment_op_client_id as g_comment_op_client_id", "g.comment_op_signature as g_comment_op_signature", "g.comments_count as g_comments_count", "g.up_vote_count as g_up_vote_count", "g.down_vote_count as g_down_vote_count", "g.repost_count as g_repost_count", "g.user_voted as g_user_voted", "g.nsfw as g_nsfw", "g.has_long_post_cover as g_has_long_post_cover", "g.version as g_version", "g.user_score as g_user_score", "g.creation_timestamp as g_creation_timestamp", "g.created as g_created", "g.via_domain as g_via_domain", "g.via_url as g_via_url", "g.creator_id as g_creator_id", "g.image_url as g_image_url", "g.image_width as g_image_width", "g.image_height as g_image_height", "g.short_image_url as g_short_image_url", "g.short_image_width as g_short_image_width", "g.short_image_height as g_short_image_height", "g.gag_media_json as g_gag_media_json", "g.album_web_url as g_album_web_url", "g.has_image_tile as g_has_image_tile", "g.post_tile_json as g_post_tile_json", "u._id as u__id", "u.user_id as u_user_id", "u.user_name as u_user_name", "u.profile_url as u_profile_url", "u.avatar_url_small as u_avatar_url_small"};
    }

    /* compiled from: DB */
    /* renamed from: cii$c */
    public static class C1746c {
        /* renamed from: a */
        public static String f9348a = "account";
        /* renamed from: b */
        public static String f9349b = "users";
        /* renamed from: c */
        public static String f9350c = "gags";
        /* renamed from: d */
        public static String f9351d = "gag_top_comments";
        /* renamed from: e */
        public static String f9352e = "votes";
        /* renamed from: f */
        public static String f9353f = "reports";
        /* renamed from: g */
        public static String f9354g = "gag_list_items";
        /* renamed from: h */
        public static String f9355h = "gag_timely_top_comments";
        /* renamed from: i */
        public static String f9356i = "gag_group";
        /* renamed from: j */
        public static String f9357j = "options";
        /* renamed from: k */
        public static String f9358k = "notifs";
        /* renamed from: l */
        public static String f9359l = "gag_list_items gli LEFT JOIN gags g on gli.gag_id = g._id";
        /* renamed from: m */
        public static String f9360m = "gags g LEFT OUTER JOIN users u on g.creator_id = u._id";
        /* renamed from: n */
        public static String f9361n = "gag_list_items gli LEFT JOIN gags g on gli.gag_id = g._id LEFT OUTER JOIN users u on g.creator_id = u._id";
    }
}
