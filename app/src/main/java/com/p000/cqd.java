package com.p000;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.FragmentManager;
import com.facebook.AccessToken;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.NativeProtocol;
import com.facebook.share.internal.ShareConstants;
import com.mopub.mobileads.FlurryAgentWrapper;
import com.mopub.mobileads.VastIconXmlManager;
import com.ninegag.android.app.browser.DefaultInAppBrowserActivity;
import com.ninegag.android.app.browser.GagInAppBrowserActivity;
import com.ninegag.android.app.component.youtube.DefaultYouTubePlayerActivity;
import com.ninegag.android.app.feedback.ui.FeedbackActivity;
import com.ninegag.android.app.otto.postlist.GoOverlayTriggeredEvent;
import com.ninegag.android.app.ui.DebugHistoryActivity;
import com.ninegag.android.app.ui.EditProfileActivity;
import com.ninegag.android.app.ui.ExclusiveAuthActivity;
import com.ninegag.android.app.ui.FeaturedListActivity;
import com.ninegag.android.app.ui.ForgotPasswordActivity;
import com.ninegag.android.app.ui.HomeActivity;
import com.ninegag.android.app.ui.MultiPageSectionListActivity;
import com.ninegag.android.app.ui.OverlayActivity;
import com.ninegag.android.app.ui.OverlayActivityV2;
import com.ninegag.android.app.ui.PollingActivity;
import com.ninegag.android.app.ui.PostCommentsActivity;
import com.ninegag.android.app.ui.SearchActivity;
import com.ninegag.android.app.ui.SettingActivity;
import com.ninegag.android.app.ui.SimpleOverlayActivity;
import com.ninegag.android.app.ui.SocialLoginActivity;
import com.ninegag.android.app.ui.SocialSignUpActivity;
import com.ninegag.android.app.ui.SplashScreenActivity;
import com.ninegag.android.app.ui.UserProfileListActivity;
import com.ninegag.android.app.ui.activity.setting.NotificationSettingsActivity;
import com.ninegag.android.app.ui.activity.setting.SocialSettingsActivity;
import com.ninegag.android.app.ui.fragments.dialogs.GagProgressDialogFragment;
import com.ninegag.android.app.upload.UploadActivity;
import com.ninegag.android.app.upload.UploadFragmentHolderActivity;
import com.ninegag.android.app.upload.UploadSourceActivity;
import com.ninegag.android.library.upload.BaseUploadSourceActivity;
import com.ninegag.android.library.upload.model.DefaultRemoteMediaMeta;
import com.ninegag.android.library.upload.model.MediaMeta;
import com.ninegag.android.tv.component.youtube.YoutubeActivity;

/* compiled from: NavigationHelper */
/* renamed from: cqd */
public class cqd {
    /* renamed from: b */
    private static caf f19958b = caf.a();
    /* renamed from: a */
    Context f19959a;

    public cqd(Context context) {
        this.f19959a = context;
    }

    /* renamed from: a */
    public void m24370a(cct cct, int i, String str, int i2) {
        if (cct != null) {
            diu diu = new diu();
            diu.m27495a(2, "TriggeredFrom", "PostList");
            diu.m27495a(3, "PostKey", cct.e());
            chn.a("PostAction", "TapPostImage", cct.e(), null, diu);
            boolean z = cct.o() && cct.p();
            dhe.m27280a().m27269c(new GoOverlayTriggeredEvent(cct, z));
            Intent intent = new Intent(this.f19959a, OverlayActivityV2.class);
            intent.putExtra(ShareConstants.WEB_DIALOG_RESULT_PARAM_POST_ID, cct.e());
            intent.putExtra("list_type", i);
            intent.putExtra("group_id", str);
            intent.putExtra("curr_position", i2);
            this.f19959a.startActivity(intent);
            if (this.f19959a instanceof Activity) {
                ((Activity) this.f19959a).overridePendingTransition(0, 0);
            }
        }
    }

    /* renamed from: a */
    public void m24371a(cct cct, String str, int i, int i2) {
        if (cct != null) {
            if (12 == i2 || 16 == i2) {
                diu diu = new diu();
                diu.m27495a(2, "TriggeredFrom", "PostList");
                diu.m27495a(3, "PostKey", cct.e());
                chn.a("PostAction", "TapPostImage", cct.e(), null, diu);
                boolean z = cct.o() && cct.p();
                dhe.m27280a().m27269c(new GoOverlayTriggeredEvent(cct, z));
                Intent intent = new Intent(this.f19959a, OverlayActivityV2.class);
                intent.putExtra("list_type", i2);
                intent.putExtra("group_id", AppEventsConstants.EVENT_PARAM_VALUE_NO);
                intent.putExtra("search_key", str);
                intent.putExtra("curr_position", i);
                this.f19959a.startActivity(intent);
                if (this.f19959a instanceof Activity) {
                    ((Activity) this.f19959a).overridePendingTransition(0, 0);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Invalid search type. Support [GagList.LIST_TYPE_SEARCH and GagList.LIST_TYPE_TAG_SEARCH] only");
        }
    }

    /* renamed from: b */
    public void m24388b(cct cct, int i, String str, int i2) {
        if (cct != null) {
            diu diu = new diu();
            diu.m27495a(2, "TriggeredFrom", "PostList");
            diu.m27495a(3, "PostKey", cct.e());
            chn.a("PostAction", "TapPostImage", cct.e(), null, diu);
            boolean z = cct.o() && cct.p();
            dhe.m27280a().m27269c(new GoOverlayTriggeredEvent(cct, z));
            Intent intent = new Intent(this.f19959a, OverlayActivity.class);
            intent.putExtra("list_type", i);
            intent.putExtra(AccessToken.USER_ID_KEY, str);
            intent.putExtra("group_id", AppEventsConstants.EVENT_PARAM_VALUE_NO);
            intent.putExtra("curr_position", i2);
            this.f19959a.startActivity(intent);
            if (this.f19959a instanceof Activity) {
                ((Activity) this.f19959a).overridePendingTransition(0, 0);
            }
        }
    }

    /* renamed from: a */
    public void m24374a(String str) {
        Intent intent = new Intent(this.f19959a, SimpleOverlayActivity.class);
        intent.putExtra("url", str);
        this.f19959a.startActivity(intent);
    }

    /* renamed from: a */
    public void m24372a(MediaMeta mediaMeta) {
        Intent intent = new Intent(this.f19959a, SimpleOverlayActivity.class);
        intent.putExtra("media_meta", mediaMeta);
        this.f19959a.startActivity(intent);
    }

    /* renamed from: a */
    public void m24382a(String str, String str2, String str3, boolean z, boolean z2) {
        m24379a(str, str2, 0, str3, z, z2, false);
    }

    /* renamed from: a */
    public void m24379a(String str, String str2, int i, String str3, boolean z, boolean z2, boolean z3) {
        Intent intent = new Intent(this.f19959a, PostCommentsActivity.class);
        intent.putExtra(ShareConstants.WEB_DIALOG_RESULT_PARAM_POST_ID, str);
        intent.putExtra("group_id", str2);
        intent.putExtra("list_type", i);
        intent.putExtra("highlight_comment_id", str3);
        intent.putExtra("embed_post", z);
        intent.putExtra("external", z2);
        intent.putExtra("force_expand_long_post", z3);
        this.f19959a.startActivity(intent);
    }

    /* renamed from: a */
    public void m24383a(String str, String str2, boolean z, boolean z2) {
        m24382a(str, str2, null, z, z2);
    }

    /* renamed from: a */
    public void m24377a(String str, long j) {
        Intent intent;
        if (m24363q()) {
            intent = new Intent(this.f19959a, DefaultYouTubePlayerActivity.class);
            intent.putExtra(FlurryAgentWrapper.PARAM_API_KEY, "AIzaSyBSFny5_aJCVxxQns9bK_bp-NN7bkvL0bo");
            intent.putExtra("videoId", str);
            intent.putExtra("playsInline", true);
            intent.putExtra("play", true);
            intent.putExtra("startTs", j);
        } else if (str != null) {
            intent = new Intent("android.intent.action.VIEW", Uri.parse(String.format("http://www.youtube.com/watch?v=%s", new Object[]{str})));
        } else {
            return;
        }
        this.f19959a.startActivity(intent);
    }

    /* renamed from: a */
    public void m24369a(cct cct) {
        if (cct.m()) {
            cke l = cct.l();
            if (l != null && l.b()) {
                Intent intent;
                if (m24363q()) {
                    intent = new Intent(this.f19959a, DefaultYouTubePlayerActivity.class);
                    intent.putExtra(ShareConstants.WEB_DIALOG_RESULT_PARAM_POST_ID, cct.e());
                    intent.putExtra("trigger_from", "PostList");
                    intent.putExtra("trigger_page", "PostList");
                    intent.putExtra(FlurryAgentWrapper.PARAM_API_KEY, "AIzaSyBSFny5_aJCVxxQns9bK_bp-NN7bkvL0bo");
                    intent.putExtra("videoId", cct.l().f9526i);
                    intent.putExtra("playsInline", true);
                    intent.putExtra("play", true);
                    intent.putExtra("startTs", l.f9523f);
                } else {
                    String a = cct.l().a();
                    if (a != null) {
                        intent = new Intent("android.intent.action.VIEW", Uri.parse(a));
                    } else {
                        return;
                    }
                }
                this.f19959a.startActivity(intent);
            }
        }
    }

    /* renamed from: a */
    public void m24376a(String str, int i, String str2) {
        String str3 = str + "-" + i;
        crw a = crw.m24653a(cco.a("", i, str).b());
        if (a != null) {
            a.clear();
        }
        f19958b.h().f(i, str);
        chn.d(str, i);
        Intent intent = new Intent(this.f19959a, MultiPageSectionListActivity.class);
        intent.putExtra("list_type", i);
        intent.putExtra("group_id", str);
        intent.putExtra("tag", str3);
        intent.putExtra("section_name", str2);
        this.f19959a.startActivity(intent);
    }

    /* renamed from: q */
    private boolean m24363q() {
        return bsp.a(this.f19959a) == bsq.SUCCESS;
    }

    /* renamed from: b */
    public void m24389b(String str) {
        Intent intent = new Intent(this.f19959a, UserProfileListActivity.class);
        intent.putExtra("list_type", 10);
        intent.putExtra("group_id", AppEventsConstants.EVENT_PARAM_VALUE_NO);
        intent.putExtra("profile_type", 1);
        intent.putExtra("account_id", str);
        intent.putExtra("tag", "10-0-" + str);
        this.f19959a.startActivity(intent);
    }

    /* renamed from: c */
    public void m24394c(String str) {
        Intent intent = new Intent(this.f19959a, UserProfileListActivity.class);
        intent.putExtra("list_type", 10);
        intent.putExtra("group_id", AppEventsConstants.EVENT_PARAM_VALUE_NO);
        intent.putExtra("profile_type", 2);
        intent.putExtra("username", str);
        intent.putExtra("tag", "10-0-" + str);
        this.f19959a.startActivity(intent);
    }

    /* renamed from: a */
    public void m24364a() {
        Intent intent = new Intent(this.f19959a, PollingActivity.class);
        intent.addFlags(67108864);
        intent.putExtra("go_language_selection", true);
        this.f19959a.startActivity(intent);
    }

    /* renamed from: d */
    public void m24397d(String str) {
        try {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            this.f19959a.startActivity(intent);
        } catch (Exception e) {
        }
    }

    /* renamed from: b */
    public void m24385b() {
        Intent intent = new Intent(this.f19959a, HomeActivity.class);
        intent.addFlags(67108864);
        intent.putExtra("go_profile", true);
        this.f19959a.startActivity(intent);
    }

    /* renamed from: c */
    public void m24392c() {
        this.f19959a.startActivity(new Intent(this.f19959a, SettingActivity.class));
    }

    /* renamed from: d */
    public void m24396d() {
        chn.a("goHome", "navHelper");
        Intent intent = new Intent(this.f19959a, HomeActivity.class);
        intent.addFlags(67108864);
        this.f19959a.startActivity(intent);
    }

    /* renamed from: e */
    public void m24398e() {
        Intent intent = new Intent(this.f19959a, DebugHistoryActivity.class);
        intent.addFlags(268435456);
        this.f19959a.startActivity(intent);
    }

    /* renamed from: f */
    public void m24400f() {
        Intent intent = new Intent(this.f19959a, HomeActivity.class);
        intent.addFlags(67108864);
        intent.putExtra("go_hot", true);
        this.f19959a.startActivity(intent);
    }

    /* renamed from: g */
    public void m24402g() {
        Intent intent = new Intent(this.f19959a, HomeActivity.class);
        intent.addFlags(67108864);
        intent.putExtra("go_home_hot", true);
        this.f19959a.startActivity(intent);
    }

    /* renamed from: h */
    public void m24404h() {
    }

    /* renamed from: a */
    public void m24384a(String str, boolean z) {
        Intent intent = new Intent(this.f19959a, UploadSourceActivity.class);
        intent.putExtra("source", BaseUploadSourceActivity.SOURCE_GALLERY);
        intent.putExtra(UploadSourceActivity.KEY_UPLOAD_GROUP_ID, str);
        intent.putExtra(BaseUploadSourceActivity.KEY_ALLOW_VIDEO_UPLOAD, z);
        ((Activity) this.f19959a).startActivityForResult(intent, HomeActivity.REQ_CODE_SELECT_IMAGE);
    }

    /* renamed from: e */
    public void m24399e(String str) {
        Intent intent = new Intent(this.f19959a, UploadSourceActivity.class);
        intent.putExtra("source", BaseUploadSourceActivity.SOURCE_CAPTURE);
        intent.putExtra(UploadSourceActivity.KEY_UPLOAD_GROUP_ID, str);
        ((Activity) this.f19959a).startActivityForResult(intent, HomeActivity.REQ_CODE_SELECT_IMAGE);
    }

    /* renamed from: f */
    public void m24401f(String str) {
        Intent intent = new Intent(this.f19959a, UploadSourceActivity.class);
        intent.putExtra("source", BaseUploadSourceActivity.SOURCE_3RD_PARTY);
        intent.putExtra(BaseUploadSourceActivity.KEY_PACKAGE, "com.memeful.android");
        intent.putExtra(UploadSourceActivity.KEY_UPLOAD_GROUP_ID, str);
        ((Activity) this.f19959a).startActivityForResult(intent, HomeActivity.REQ_CODE_SELECT_IMAGE);
    }

    /* renamed from: a */
    public void m24378a(String str, String str2) {
        Intent intent = new Intent(this.f19959a, UploadSourceActivity.class);
        intent.putExtra("source", BaseUploadSourceActivity.SOURCE_DIRECT);
        intent.putExtra(BaseUploadSourceActivity.KEY_FILE_PATH, str);
        intent.putExtra(UploadSourceActivity.KEY_UPLOAD_GROUP_ID, str2);
        ((Activity) this.f19959a).startActivityForResult(intent, HomeActivity.REQ_CODE_SELECT_IMAGE);
    }

    /* renamed from: b */
    public void m24390b(String str, String str2) {
        Intent intent = new Intent(this.f19959a, UploadFragmentHolderActivity.class);
        intent.putExtra(UploadFragmentHolderActivity.KEY_FRAGMENT_TYPE, 0);
        intent.putExtra(UploadSourceActivity.KEY_UPLOAD_GROUP_ID, str);
        intent.putExtra("prefill_link", str2);
        ((Activity) this.f19959a).startActivityForResult(intent, HomeActivity.REQ_CODE_SELECT_IMAGE);
    }

    /* renamed from: g */
    public void m24403g(String str) {
        Intent intent = new Intent(this.f19959a, UploadFragmentHolderActivity.class);
        intent.putExtra(UploadFragmentHolderActivity.KEY_FRAGMENT_TYPE, 1);
        intent.putExtra("already_added_tags", str);
        ((Activity) this.f19959a).startActivityForResult(intent, UploadActivity.REQ_CODE_ADD_TAGS);
    }

    /* renamed from: a */
    public void m24373a(MediaMeta mediaMeta, String str) {
        Intent intent = new Intent(this.f19959a, UploadActivity.class);
        intent.putExtra("media_meta", mediaMeta);
        intent.putExtra(UploadSourceActivity.KEY_UPLOAD_GROUP_ID, str);
        intent.putExtra("source", "link");
        intent.setFlags(33554432);
        if (mediaMeta instanceof DefaultRemoteMediaMeta) {
            intent.putExtra(BaseUploadSourceActivity.KEY_TMP_PATH, ((DefaultRemoteMediaMeta) mediaMeta).f18787a);
        } else {
            intent.putExtra(BaseUploadSourceActivity.KEY_TMP_PATH, mediaMeta.f18781d);
        }
        intent.putExtra(BaseUploadSourceActivity.KEY_MEDIA_TYPE, mediaMeta.f18786i);
        ((Activity) this.f19959a).startActivity(intent);
    }

    /* renamed from: h */
    public void m24405h(String str) {
        Intent intent = new Intent(this.f19959a, FeedbackActivity.class);
        intent.putExtra("feedback_type", str);
        this.f19959a.startActivity(intent);
    }

    /* renamed from: i */
    public void m24407i(String str) {
        Intent intent = new Intent(this.f19959a, FeaturedListActivity.class);
        intent.putExtra(ShareConstants.WEB_DIALOG_RESULT_PARAM_POST_ID, str);
        this.f19959a.startActivity(intent);
    }

    /* renamed from: i */
    public void m24406i() {
        this.f19959a.startActivity(new Intent(this.f19959a, SplashScreenActivity.class));
    }

    /* renamed from: a */
    public void m24365a(int i) {
        Intent intent = new Intent(this.f19959a, ExclusiveAuthActivity.class);
        intent.putExtra(NativeProtocol.WEB_DIALOG_ACTION, i);
        this.f19959a.startActivity(intent);
    }

    /* renamed from: b */
    public void m24386b(int i) {
        Intent intent = new Intent(this.f19959a, SocialLoginActivity.class);
        intent.putExtra(NativeProtocol.WEB_DIALOG_ACTION, i);
        this.f19959a.startActivity(intent);
    }

    /* renamed from: c */
    public void m24393c(int i) {
        Intent intent = new Intent(this.f19959a, SocialSignUpActivity.class);
        intent.putExtra(NativeProtocol.WEB_DIALOG_ACTION, i);
        this.f19959a.startActivity(intent);
    }

    /* renamed from: a */
    public void m24366a(Intent intent) {
        Intent intent2 = new Intent(this.f19959a, SocialLoginActivity.class);
        intent2.fillIn(intent, 0);
        this.f19959a.startActivity(intent2);
    }

    /* renamed from: b */
    public void m24387b(Intent intent) {
        Intent intent2 = new Intent(this.f19959a, SocialSignUpActivity.class);
        intent2.fillIn(intent, 0);
        this.f19959a.startActivity(intent2);
    }

    /* renamed from: j */
    public void m24408j() {
        this.f19959a.startActivity(new Intent(this.f19959a, ForgotPasswordActivity.class));
    }

    /* renamed from: k */
    public void m24410k() {
        try {
            this.f19959a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.ninegag.android.app")));
        } catch (Exception e) {
        }
    }

    /* renamed from: j */
    public void m24409j(String str) {
        try {
            this.f19959a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (Exception e) {
        }
    }

    /* renamed from: l */
    public void m24412l() {
        cij.a().e();
    }

    /* renamed from: a */
    public void m24368a(FragmentManager fragmentManager, String str) {
        GagProgressDialogFragment a;
        GagProgressDialogFragment gagProgressDialogFragment = (GagProgressDialogFragment) fragmentManager.findFragmentByTag("loading_dialog");
        boolean z;
        if (gagProgressDialogFragment == null) {
            a = GagProgressDialogFragment.m22660a(str);
            z = false;
        } else {
            boolean isVisible = gagProgressDialogFragment.isVisible();
            gagProgressDialogFragment.m22659c(str);
            boolean z2 = isVisible;
            a = gagProgressDialogFragment;
            z = z2;
        }
        if (!a.isAdded() && !r0) {
            a.show(fragmentManager, "loading_dialog");
            fragmentManager.executePendingTransactions();
        }
    }

    /* renamed from: a */
    public void m24367a(FragmentManager fragmentManager) {
        GagProgressDialogFragment gagProgressDialogFragment = (GagProgressDialogFragment) fragmentManager.findFragmentByTag("loading_dialog");
        if (gagProgressDialogFragment != null) {
            gagProgressDialogFragment.dismissAllowingStateLoss();
        }
    }

    /* renamed from: c */
    public void m24395c(String str, String str2) {
        Intent intent = new Intent(this.f19959a, GagInAppBrowserActivity.class);
        intent.putExtra("url", str);
        intent.putExtra(ShareConstants.WEB_DIALOG_RESULT_PARAM_POST_ID, str2);
        this.f19959a.startActivity(intent);
    }

    /* renamed from: a */
    public void m24381a(String str, String str2, String str3, String str4, boolean z) {
        Intent intent = new Intent(this.f19959a, DefaultInAppBrowserActivity.class);
        intent.putExtra("url", str);
        intent.putExtra("share_url", str2);
        intent.putExtra("title", str3);
        intent.putExtra("log_screen_name", str4);
        intent.putExtra("nsfw", z);
        this.f19959a.startActivity(intent);
    }

    /* renamed from: a */
    public void m24380a(String str, String str2, String str3, String str4, int i, int i2, String str5, boolean z) {
        if (bsp.a(this.f19959a) == bsq.SUCCESS) {
            Intent intent = new Intent(this.f19959a, YoutubeActivity.class);
            intent.putExtra("post_url", str2);
            intent.putExtra("youtube_id", str4);
            intent.putExtra("start_time", i);
            intent.putExtra("title", str3);
            intent.putExtra(VastIconXmlManager.DURATION, i2);
            intent.putExtra(ShareConstants.WEB_DIALOG_RESULT_PARAM_POST_ID, str5);
            intent.putExtra("nsfw", z);
            this.f19959a.startActivity(intent);
            return;
        }
        m24381a(str, str2, str3, "VideoBrowser", z);
    }

    /* renamed from: k */
    public void m24411k(String str) {
        m24381a(str, null, null, null, false);
    }

    /* renamed from: l */
    public void m24413l(String str) {
        m24379a(str, null, 0, null, true, false, true);
    }

    /* renamed from: b */
    public void m24391b(String str, boolean z) {
        m24383a(str, null, true, z);
    }

    /* renamed from: m */
    public void m24414m() {
        this.f19959a.startActivity(new Intent(this.f19959a, EditProfileActivity.class));
    }

    /* renamed from: n */
    public void m24415n() {
        this.f19959a.startActivity(new Intent(this.f19959a, SocialSettingsActivity.class));
    }

    /* renamed from: o */
    public void m24416o() {
        this.f19959a.startActivity(new Intent(this.f19959a, NotificationSettingsActivity.class));
    }

    /* renamed from: p */
    public void m24417p() {
        this.f19959a.startActivity(new Intent("android.settings.LOCALE_SETTINGS"));
    }

    /* renamed from: a */
    public void m24375a(String str, int i) {
        Intent intent = new Intent(this.f19959a, SearchActivity.class);
        intent.putExtra(SearchActivity.KEY_SEARCH_KEY, str);
        intent.putExtra(SearchActivity.KEY_SEARCH_TYPE, i);
        this.f19959a.startActivity(intent);
    }
}
