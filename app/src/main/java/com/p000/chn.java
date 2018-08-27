package com.p000;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.internal.NativeProtocol;
import com.facebook.share.widget.ShareDialog;
import com.flurry.android.FlurryAgent;
import com.flurry.android.FlurryAgent.Builder;
import com.flurry.android.FlurryAgentListener;
import com.inmobi.commons.analytics.iat.impl.AdTrackerConstants;
import com.millennialmedia.InterstitialAd.InterstitialErrorStatus;
import com.millennialmedia.android.MMSDK$Event;
import com.ninegag.android.library.rlogger.RLogger;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Kit;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import p000.abk.C0047a;
import p000.zv.C5816a;

/* compiled from: MetricsController */
/* renamed from: chn */
public class chn {
    /* renamed from: a */
    protected static boolean f9243a = false;
    /* renamed from: b */
    private static HashSet<String> f9244b = new HashSet();
    /* renamed from: c */
    private static final Handler f9245c = new Handler(Looper.getMainLooper());
    /* renamed from: d */
    private static Handler f9246d;
    /* renamed from: e */
    private static caf f9247e = caf.m12046a();
    /* renamed from: f */
    private static final HashSet<String> f9248f = new HashSet();
    /* renamed from: g */
    private static boolean f9249g = false;
    /* renamed from: h */
    private static int f9250h = 0;
    /* renamed from: i */
    private static HashMap<String, Long> f9251i = new HashMap();

    /* compiled from: MetricsController */
    /* renamed from: chn$1 */
    static class C17301 implements abm {
        C17301() {
        }

        /* renamed from: a */
        public void mo15a() {
            chn.m13407e();
        }
    }

    /* compiled from: MetricsController */
    /* renamed from: chn$2 */
    static class C17312 implements FlurryAgentListener {
        C17312() {
        }

        public void onSessionStarted() {
        }
    }

    /* compiled from: MetricsController */
    /* renamed from: chn$3 */
    static class C17323 implements Callback {
        C17323() {
        }

        public boolean handleMessage(Message message) {
            Bundle data = message.getData();
            String string;
            switch (message.what) {
                case 0:
                    string = data.getString("category");
                    String string2 = data.getString(NativeProtocol.WEB_DIALOG_ACTION);
                    String string3 = data.getString("label");
                    String string4 = data.getString("value");
                    Long l = null;
                    if (string4 != null) {
                        try {
                            l = Long.valueOf(Long.parseLong(string4));
                        } catch (NumberFormatException e) {
                        }
                    }
                    diu diu = (diu) data.getSerializable("cvars");
                    cib.m13643a(string, string2, string3, l);
                    dit.a(string, string2, string3, l, diu);
                    dhe.c("DebugHeadService", new cia(string, string2, string3, l, diu));
                    if (chn.f9248f.contains(string2)) {
                        if (!"ViewSearch".equals(string2)) {
                            dix.a(string, string3);
                            break;
                        }
                        dix.a(string3);
                        break;
                    }
                    break;
                case 1:
                    string = data.getString("screen_name");
                    String string5 = data.getString("other_user_id");
                    cib.m13642a(string);
                    if (TextUtils.isEmpty(string5)) {
                        dit.h(string);
                    } else {
                        dit.b(string, string5);
                    }
                    dhe.c("DebugHeadService", new chk(string, string5));
                    break;
            }
            return false;
        }
    }

    /* renamed from: a */
    public static void m13369a(Context context, String str, String str2, String str3) {
        RLogger.getInstance().setDomainMapperModule(f9247e.m12090t());
        RLogger.getInstance().init("android.9gag.main.release", str, context, str2, str3);
        if (!(f9243a || caf.m12036A())) {
            abk a = new C0047a().m316a(new C17301()).m317a();
            Fabric.a(context, new Kit[]{new C5816a().a(a).a()});
            f9243a = true;
        }
        if (!caf.m12036A()) {
            zv.a(str2);
            FlurryAgent.setUserId(str2);
        }
        chn.m13354Q();
        chn.m13352P();
    }

    /* renamed from: a */
    public static void m13368a(Context context) {
        new Builder().withLogEnabled(false).withLogLevel(2).withPulseEnabled(true).withListener(new C17312()).build(context, "V2NV5D9PMW7D2MCFBKJG");
        FlurryAgent.addOrigin("Flurry_Mopub_Android", "6.4.2");
        FlurryAgent.onStartSession(context);
    }

    /* renamed from: b */
    public static void m13389b(Context context) {
        try {
            FlurryAgent.onEndSession(context);
        } catch (Exception e) {
        }
    }

    /* renamed from: a */
    public static void m13384a(HashSet<String> hashSet) {
        f9244b = hashSet;
        if (f9244b == null) {
            f9244b = new HashSet();
        }
    }

    /* renamed from: X */
    private static boolean m13362X(String str) {
        return f9244b.contains(str);
    }

    /* renamed from: a */
    public static void m13382a(String str, HashMap<String, Object> hashMap) {
        RLogger.getInstance().logBreadcrumb(str, hashMap);
    }

    /* renamed from: a */
    public static void m13377a(String str, String str2) {
        RLogger.getInstance().logBreadcrumb(str, new cpz("caller", str2).a());
    }

    /* renamed from: b */
    public static void m13393b(String str, String str2) {
        RLogger.getInstance().logBreadcrumb(str, new cpz("activity", str2).a());
    }

    /* renamed from: c */
    public static void m13399c(String str, String str2) {
        RLogger.getInstance().logBreadcrumb(str, new cpz("fragment", str2).a());
    }

    /* renamed from: d */
    public static void m13405d(String str, String str2) {
        RLogger.getInstance().logBreadcrumb(str, new cpz("dialogFragment", str2).a());
    }

    /* renamed from: a */
    public static void m13378a(String str, String str2, String str3) {
        RLogger.getInstance().logBreadcrumb("switchContent", new cpz(new Object[]{"caller", str, "fragment", str2, "tag", str3}).a());
    }

    /* renamed from: a */
    public static void m13373a(String str, int i) {
        Map hashMap = new HashMap();
        hashMap.put("vote", chn.m13386b(i));
        FlurryAgent.logEvent("Post_Vote", hashMap);
        RLogger.getInstance().logBreadcrumb("vote", new cpz(new Object[]{"score", Integer.valueOf(i), "post", str}).a());
    }

    /* renamed from: e */
    public static void m13409e(String str, String str2) {
        RLogger.getInstance().logBreadcrumb("share post", new cpz(new Object[]{"post", str, NativeProtocol.WEB_DIALOG_ACTION, str2}).a());
    }

    /* renamed from: a */
    public static void m13364a() {
        FlurryAgent.logEvent("Clear_Cache");
        RLogger.getInstance().logBreadcrumb("manual clear cache", new cpz().a());
    }

    /* renamed from: a */
    public static void m13366a(int i, String str) {
        String str2 = null;
        if (cie.m13651c(i)) {
            str2 = "SCROLL_RESTORE_FAIL";
        } else if (cie.m13649a(i)) {
            str2 = "SCROLL_RESTORE_SKIPPED";
        } else if (cie.m13650b(i)) {
            str2 = "SCROLL_RESTORE_SUCCESS";
        }
        if (str2 != null) {
            chn.m13406d(str2, "DEBUG", str);
        }
    }

    /* renamed from: b */
    public static void m13388b(int i, String str) {
        String str2 = "UNKNOWN_FAIL";
        if (i == 101) {
            str2 = "IMAGE_REQUEST_FAIL";
        } else if (i == InterstitialErrorStatus.EXPIRED) {
            str2 = "PRODUCT_FINISHED_WITH_FAIL";
        }
        chn.m13406d(str2, "DEBUG", str);
    }

    /* renamed from: a */
    public static void m13372a(String str) {
        chn.m13406d("SCROLL_SAVE_LIST", "DEBUG", str);
    }

    /* renamed from: b */
    public static void m13390b(String str) {
        chn.m13406d("NO_QUOTA", "API_ERRORS", str);
    }

    /* renamed from: f */
    public static void m13412f(String str, String str2) {
        chn.m13406d("API_LOG", "API_ERRORS", str2 + " " + str);
    }

    /* renamed from: g */
    public static void m13415g(String str, String str2) {
        chn.m13406d("UNAUTHORIZED_ERROR", "API_ERRORS", str2 + " " + str);
    }

    /* renamed from: h */
    public static void m13418h(String str, String str2) {
        chn.m13406d("HTTP_CODE_ERROR", "API_ERRORS", str2 + " " + str);
    }

    /* renamed from: i */
    public static void m13421i(String str, String str2) {
        chn.m13406d("SERVER_ERROR", "API_ERRORS", str2 + " " + str);
    }

    /* renamed from: j */
    public static void m13424j(String str, String str2) {
        chn.m13406d("CONNECTION_TIMED_OUT", "API_ERRORS", str2 + " " + str);
    }

    /* renamed from: k */
    public static void m13427k(String str, String str2) {
        chn.m13406d("API_STATUS_ERROR", "API_ERRORS", str + " " + str2);
    }

    /* renamed from: c */
    public static void m13397c(String str) {
        chn.m13406d("ABNORMAL_STATUS_META", "API_ERRORS", str);
    }

    /* renamed from: l */
    public static void m13430l(String str, String str2) {
        chn.m13406d("API_UPLOAD_EVENT", "API_ERRORS", str + " " + str2);
    }

    /* renamed from: m */
    public static void m13433m(String str, String str2) {
        f9249g = true;
        chn.m13406d("UNEXPECTED_DATA_TYPE", "API_ERRORS", str + "\n" + str2);
    }

    /* renamed from: d */
    public static void m13403d(String str) {
        f9249g = true;
        chn.m13406d("UNEXPECTED_DATA_TYPE", "API_ERRORS", "Not a valid JSON Object\n" + str);
    }

    /* renamed from: e */
    public static void m13408e(String str) {
        if (f9249g) {
            chn.m13406d("UNEXPECTED_DATA_TYPE", "API_ERRORS", "Extra info:\n" + str);
            f9249g = false;
        }
    }

    /* renamed from: f */
    public static void m13411f(String str) {
        chn.m13406d("UNKNOWN_HOST", "TV_API_ERRORS", str);
    }

    /* renamed from: a */
    public static void m13365a(int i) {
        chn.m13406d("AUTH_SUCCESS", "AUTH", "LoginMethod: " + ctm.a(i));
    }

    /* renamed from: c */
    public static void m13396c(int i, String str) {
        chn.m13406d("AUTH_FAIL", "AUTH", "LoginMethod: " + ctm.a(i) + " err:" + str);
    }

    /* renamed from: g */
    public static void m13414g(String str) {
        chn.m13406d("AUTH_TASK_EVENT", "AUTH", str);
    }

    /* renamed from: h */
    public static void m13417h(String str) {
        chn.m13406d("FACEBOOK_AUTH_EVENT", "AUTH", str);
    }

    /* renamed from: i */
    public static void m13420i(String str) {
        chn.m13406d("GPLUS_AUTH_EVENT", "AUTH", str);
    }

    /* renamed from: j */
    public static void m13423j(String str) {
        if (Math.random() < 0.01d) {
            chn.m13406d("NOTI_BADGE", "DEBUG", str);
        }
    }

    /* renamed from: k */
    public static void m13426k(String str) {
        chn.m13406d("ANR", "DEBUG", str);
    }

    /* renamed from: l */
    public static void m13429l(String str) {
        chn.m13406d("OOM", "DEBUG", str);
    }

    /* renamed from: m */
    public static void m13432m(String str) {
        chn.m13406d("HANDLED_EXCEPTION", "DEBUG", str);
    }

    /* renamed from: a */
    public static void m13376a(String str, Exception exception) {
        chn.m13432m(str + " " + Log.getStackTraceString(exception));
    }

    /* renamed from: a */
    public static void m13371a(Exception exception) {
        chn.m13432m(Log.getStackTraceString(exception));
    }

    /* renamed from: d */
    public static void m13402d(int i, String str) {
        String str2 = "";
        switch (i) {
            case 1:
                str2 = MMSDK$Event.INTENT_EMAIL;
                break;
            case 2:
                str2 = "facebook";
                break;
            case 3:
                str2 = MMSDK$Event.INTENT_EMAIL;
                break;
            case 4:
                str2 = "gplus";
                break;
            default:
                return;
        }
        try {
            Long valueOf = Long.valueOf(Long.parseLong(f9247e.m12075g().m13729g().f9566c));
            diu diu = new diu();
            diu.a(2, "method", str2);
            if (str != null) {
                diu.a(3, AdTrackerConstants.REFERRER, str);
            }
            chn.m13381a("AUTH", "USER_LOG_IN", f9247e.m12077h().mo1774n(), valueOf, diu);
        } catch (NumberFormatException e) {
        }
    }

    /* renamed from: n */
    public static void m13435n(String str) {
        chn.m13406d("LOGIN_FAIL", "AUTH", str);
    }

    /* renamed from: o */
    public static void m13438o(String str) {
        chn.m13406d("GPLUS_LOGIN_FAIL", "AUTH", str);
    }

    /* renamed from: p */
    public static void m13441p(String str) {
        chn.m13406d("FB_LOGIN_FAIL", "AUTH", str);
    }

    /* renamed from: b */
    public static void m13387b() {
        chn.m13445q("AUTH", "USER_LOG_OUT");
    }

    /* renamed from: q */
    public static void m13444q(String str) {
        Map hashMap = new HashMap();
        hashMap.put("from_activity", str);
        FlurryAgent.logEvent("Action_Bar_Menu_Null", hashMap);
    }

    /* renamed from: r */
    public static void m13447r(String str) {
        RLogger.getInstance().logBreadcrumb(ShareDialog.WEB_SHARE_DIALOG, new cpz("key", str).a());
        String a = djs.a(str);
        if (a == null) {
            a = "other";
        }
        chn.m13406d("SMART_SHARE." + a, "SMART_SHARE", "");
    }

    /* renamed from: n */
    public static void m13436n(String str, String str2) {
        f9250h++;
        if (f9250h >= 10) {
            chn.m13375a("DOWNLOAD_FAIL", f9250h, "USER_EXPERIENCE", String.format("[sampled log] url:%s error:%s", new Object[]{str, str2}));
            f9250h = 0;
        }
    }

    /* renamed from: b */
    private static String m13386b(int i) {
        if (i == 1) {
            return "up";
        }
        if (i == -1) {
            return "down";
        }
        if (i == 0) {
            return "unvote";
        }
        return null;
    }

    /* renamed from: s */
    public static void m13450s(String str) {
        chn.m13406d("APP_DID_LAUNCH_FROM_NOTIFICATION", "APP_LIFECYCLE", str);
    }

    /* renamed from: a */
    public static void m13383a(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11) {
        chn.m13406d("APP_DID_LAUNCH", "APP_LIFECYCLE", str);
        if (z) {
            RLogger.getInstance().logCount("MOBILE_COVER_ON", 1);
        }
        if (z2) {
            RLogger.getInstance().logCount("MP4_ENABLED", 1);
        }
        if (z3) {
            RLogger.getInstance().logCount("AUTO_PLAY_ENABLED", 1);
        }
        if (z4) {
            RLogger.getInstance().logCount("AUTO_PLAY_VIDEO_ENABLED", 1);
        }
        if (z5) {
            RLogger.getInstance().logCount("TRIGGERED_HORIZONTAL_SWIPE", 1);
        }
        if (z6) {
            RLogger.getInstance().logCount("TRIGGERED_SWIPE_DISMISS", 1);
        }
        if (z7) {
            RLogger.getInstance().logCount("TRIGGERED_ACCIDENTAL_SWIPE_DISMISS", 1);
        }
        if (z8) {
            RLogger.getInstance().logCount("USE_EXOPLAYER", 1);
        }
        if (z9) {
            RLogger.getInstance().logCount("VOLUME_SCROLLING", 1);
        }
        if (z10) {
            RLogger.getInstance().logCount("BULLET_COMMENT", 1);
        }
        if (z11) {
            RLogger.getInstance().logCount("ROTATION_LOCK", 1);
        }
    }

    /* renamed from: c */
    public static void m13395c() {
        RLogger.getInstance().setBufferMode(true);
        RLogger.getInstance().logCount("APP_DID_BECOME_ACTIVE", 1);
        RLogger.getInstance().startTimedLog("APP_SESSION_DURATION", "APP_SESSION_DURATION", "");
    }

    /* renamed from: d */
    public static void m13401d() {
        RLogger.getInstance().logCount("APP_WILL_RESIGN_ACTIVE", 1);
        RLogger.getInstance().endTimedLog("APP_SESSION_DURATION");
        RLogger.getInstance().setBufferMode(false);
    }

    /* renamed from: t */
    public static void m13453t(String str) {
        RLogger.getInstance().log("APP_FIRST_LAUNCH", "APP_LIFECYCLE", str);
    }

    /* renamed from: u */
    public static void m13456u(String str) {
        chn.m13406d("APP_ON_LOW_MEMORY", "APP_LIFECYCLE", str);
    }

    /* renamed from: e */
    public static void m13407e() {
        chn.m13406d("DID_CRASH_ON_LAST_LOAD", "USER_EXPERIENCE", "Last app launch crashed");
        RLogger.getInstance().sendPreviousBreadcrumb();
    }

    /* renamed from: v */
    public static void m13458v(String str) {
        chn.m13406d("LEAVE_SETTING", "ASSERTIONS", str);
    }

    /* renamed from: f */
    public static void m13410f() {
        RLogger.getInstance().sendCurrentBreadcrumb();
    }

    /* renamed from: w */
    public static void m13460w(String str) {
        chn.m13406d("USER_FORCED_LOGOUT", "USER_EXPERIENCE", str);
    }

    /* renamed from: x */
    public static void m13462x(String str) {
        chn.m13406d("OTHER_FORCED_LOGOUT", "USER_EXPERIENCE", str);
    }

    /* renamed from: y */
    public static void m13464y(String str) {
        chn.m13406d("DECODE_FAIL", "USER_EXPERIENCE", str);
    }

    /* renamed from: z */
    public static void m13466z(String str) {
        chn.m13406d("DECODE_FAIL_ADULT_FILTER", "USER_EXPERIENCE", str);
    }

    /* renamed from: A */
    public static void m13323A(String str) {
        chn.m13406d("DECODE_FAIL_NETWORK_FILTER", "USER_EXPERIENCE", str);
    }

    /* renamed from: B */
    public static void m13325B(String str) {
        chn.m13406d("DECODE_PROCESS_INFO", "USER_EXPERIENCE", str);
    }

    /* renamed from: C */
    public static void m13327C(String str) {
        chn.m13406d("CLEAR_CACHE", "ASSERTIONS", str);
    }

    /* renamed from: g */
    public static void m13413g() {
        chn.m13406d("SMART_SHARE.save", "SMART_SHARE", "");
    }

    /* renamed from: h */
    public static void m13416h() {
        chn.m13406d("SMART_SHARE.saveGif", "SMART_SHARE", "");
    }

    /* renamed from: i */
    public static void m13419i() {
        chn.m13406d("SMART_SHARE.copylink", "SMART_SHARE", "");
    }

    /* renamed from: j */
    public static void m13422j() {
        RLogger.getInstance().logCount("PUSH_NOTIFICATION_RECEIVED", 1);
    }

    /* renamed from: k */
    public static void m13425k() {
        RLogger.getInstance().logCount("PUSH_NOTIFICATION_RECEIVED_RAW", 1);
    }

    /* renamed from: l */
    public static void m13428l() {
        RLogger.getInstance().logCount("PUSH_NOTIFICATION_RECEIVED_VALID", 1);
    }

    /* renamed from: m */
    public static void m13431m() {
        RLogger.getInstance().logCount("PUSH_NOTIFICATION_CREATED", 1);
    }

    /* renamed from: n */
    public static void m13434n() {
        RLogger.getInstance().logCount("PUSH_NOTIFICATION_OPENED", 1);
    }

    /* renamed from: o */
    public static void m13437o() {
        RLogger.getInstance().logCount("LINK_PUSH_NOTIFICATION_RECEIVED", 1);
    }

    /* renamed from: p */
    public static void m13440p() {
        RLogger.getInstance().logCount("LINK_PUSH_NOTIFICATION_CREATED", 1);
    }

    /* renamed from: q */
    public static void m13443q() {
        RLogger.getInstance().logCount("LINK_PUSH_NOTIFICATION_OPENED", 1);
    }

    /* renamed from: D */
    public static void m13329D(String str) {
        RLogger.getInstance().logCount("COMMENT_INIT_WITH_TOP_COMMENT", 1);
    }

    /* renamed from: r */
    public static void m13446r() {
        RLogger.getInstance().logCount("CLICKED_NATIVE_AD", 1);
    }

    /* renamed from: s */
    public static void m13449s() {
        RLogger.getInstance().logCount("DAU_COUNTER", 1);
    }

    /* renamed from: t */
    public static void m13452t() {
        RLogger.getInstance().logCount("DAU_EXPAND_LONG_POST", 1);
    }

    /* renamed from: u */
    public static void m13455u() {
        RLogger.getInstance().logCount("DAU_AUTO_PLAY_GIF", 1);
    }

    /* renamed from: v */
    public static void m13457v() {
        RLogger.getInstance().logCount("DAU_AUTO_PLAY_VIDEO", 1);
    }

    /* renamed from: w */
    public static void m13459w() {
        RLogger.getInstance().logCount("DAU_AUTO_DARK_MODE", 1);
    }

    /* renamed from: x */
    public static void m13461x() {
        RLogger.getInstance().logCount("DAU_POPUP_COMMENT", 1);
    }

    /* renamed from: y */
    public static void m13463y() {
        RLogger.getInstance().logCount("DAU_VOLUME_SCROLLING", 1);
    }

    /* renamed from: z */
    public static void m13465z() {
        RLogger.getInstance().logCount("DAU_ROTATION_LOCK", 1);
    }

    /* renamed from: a */
    public static void m13367a(int i, boolean z) {
        String str = z ? "auth" : "cancel";
        String str2 = null;
        switch (i) {
            case 1:
                str2 = "upvote";
                break;
            case 2:
                str2 = "downvote";
                break;
            case 3:
                str2 = "upload";
                break;
            case 4:
                str2 = "report";
                break;
            case 5:
                str2 = "nsfw";
                break;
            case 6:
                str2 = "drawer";
                break;
            case 7:
                str2 = "list";
                break;
            case 9:
                str2 = "comment";
                break;
        }
        if (str2 != null) {
            chn.m13406d("LOGIN_POPUP." + str2 + "." + str, "LOGIN_POPUP", "");
        }
    }

    /* renamed from: o */
    public static void m13439o(String str, String str2) {
        if (str2 != null) {
            RLogger.getInstance().logCount("USER_ACTIONS" + (".in-app-purchase." + str2.replace(".", "-") + "." + str), 1);
        }
    }

    /* renamed from: A */
    public static void m13322A() {
        RLogger.getInstance().logCount("USER_ACTIONS" + ".in-app-purchase.cancel-purchase", 1);
    }

    /* renamed from: b */
    public static void m13391b(String str, int i) {
        if (str != null) {
            RLogger.getInstance().logCount("USER_ACTIONS" + (".in-app-purchase." + str.replace(".", "-") + "." + "error-purchase" + "." + i), 1);
        }
    }

    /* renamed from: a */
    public static void m13385a(boolean z, String str) {
        RLogger.getInstance().logCount("USER_ACTIONS" + (".external.valid." + z), 1);
        if (z) {
            RLogger.getInstance().logCount("USER_ACTIONS" + (".external.type." + str), 1);
        }
    }

    /* renamed from: E */
    public static void m13331E(String str) {
        RLogger.getInstance().logCount("USER_ACTIONS" + (".edit-profile." + str), 1);
    }

    /* renamed from: F */
    public static void m13333F(String str) {
        RLogger.getInstance().logCount("USER_ACTIONS" + (".ad-refresh." + str), 1);
    }

    /* renamed from: a */
    public static void m13374a(String str, int i, String str2, int i2) {
        RLogger.getInstance().logCount("USER_ACTIONS" + (".list." + str + "." + cqa.a(i) + "." + str2), i2);
    }

    /* renamed from: B */
    public static void m13324B() {
        RLogger.getInstance().logCount("USER_ACTIONS" + ".nav.featured", 1);
    }

    /* renamed from: G */
    public static void m13335G(String str) {
        RLogger.getInstance().logCount("USER_ACTIONS" + (".broadcast." + str), 1);
    }

    /* renamed from: C */
    public static void m13326C() {
        RLogger.getInstance().logCount("USER_ACTIONS" + ".nav.search", 1);
    }

    /* renamed from: D */
    public static void m13328D() {
        RLogger.getInstance().logCount("USER_ACTIONS" + ".nav.settings", 1);
    }

    /* renamed from: c */
    public static void m13398c(String str, int i) {
        RLogger.getInstance().logCount("USER_ACTIONS" + (".list." + str + "." + cqa.a(i) + ".new-posts-indicator-refresh"), 1);
    }

    /* renamed from: E */
    public static void m13330E() {
        RLogger.getInstance().logCount("USER_ACTIONS" + ".profile-menu.logout", 1);
    }

    /* renamed from: F */
    public static void m13332F() {
        RLogger.getInstance().logCount("USER_ACTIONS" + ".profile-menu.edit-profile", 1);
    }

    /* renamed from: G */
    public static void m13334G() {
        RLogger.getInstance().logCount("USER_ACTIONS" + ".profile-menu.share-this-app", 1);
    }

    /* renamed from: H */
    public static void m13336H() {
        RLogger.getInstance().logCount("USER_ACTIONS" + ".profile-menu.suggest-something", 1);
    }

    /* renamed from: I */
    public static void m13338I() {
        RLogger.getInstance().logCount("USER_ACTIONS" + ".profile-menu.report-problem", 1);
    }

    /* renamed from: J */
    public static void m13340J() {
        RLogger.getInstance().logCount("USER_ACTIONS" + ".profile-menu.rate-experience", 1);
    }

    /* renamed from: K */
    public static void m13342K() {
        RLogger.getInstance().logCount("USER_ACTIONS" + ".profile-menu.settings", 1);
    }

    /* renamed from: H */
    public static void m13337H(String str) {
        RLogger.getInstance().logCount("USER_ACTIONS" + (".notifications." + str), 1);
    }

    /* renamed from: d */
    public static void m13404d(String str, int i) {
        RLogger.getInstance().logCount("USER_ACTIONS" + (".sections-list.section." + str + "." + cqa.a(i)), 1);
    }

    /* renamed from: I */
    public static void m13339I(String str) {
        RLogger.getInstance().logCount("USER_ACTIONS" + (".comment_system." + str), 1);
    }

    /* renamed from: J */
    public static void m13341J(String str) {
        RLogger.getInstance().logCount("USER_ACTIONS" + (".comment_system.in_app_browser." + str), 1);
    }

    /* renamed from: K */
    public static void m13343K(String str) {
        RLogger.getInstance().logCount("USER_ACTIONS" + (".save-gif." + str), 1);
    }

    /* renamed from: L */
    public static void m13344L() {
        RLogger.getInstance().logCount("USER_ACTIONS.enable-expand-long-post", 1);
    }

    /* renamed from: M */
    public static void m13346M() {
        RLogger.getInstance().logCount("USER_ACTIONS.enable-auto-play-gif", 1);
    }

    /* renamed from: b */
    private static void m13392b(String str, int i, String str2, int i2) {
        RLogger.getInstance().logCount("USER_ACTIONS" + (".overlay." + str + "." + cqa.a(i) + "." + str2), i2);
    }

    /* renamed from: a */
    public static void m13370a(cco cco, String str) {
        chn.m13392b(cco.f8732d, cco.f8731c, str, 1);
    }

    /* renamed from: L */
    public static void m13345L(String str) {
        f9251i.put(str, Long.valueOf(System.currentTimeMillis()));
    }

    /* renamed from: M */
    public static void m13347M(String str) {
        if (f9251i.containsKey(str)) {
            long longValue = ((Long) f9251i.get(str)).longValue();
            f9251i.remove(str);
            longValue = System.currentTimeMillis() - longValue;
            chn.m13379a("LIST_SESSION_DURATION." + str, "LIST_SESSION_DURATION", "" + longValue, longValue);
        }
    }

    /* renamed from: a */
    public static HashMap<String, Object> m13363a(Object... objArr) {
        return new cpz(objArr).a();
    }

    /* renamed from: d */
    private static void m13406d(String str, String str2, String str3) {
        if (!chn.m13362X(str)) {
            RLogger.getInstance().log(str, str2, str3);
        }
    }

    /* renamed from: a */
    private static void m13375a(String str, int i, String str2, String str3) {
        if (!chn.m13362X(str)) {
            RLogger.getInstance().log(str, i, str2, str3);
        }
    }

    /* renamed from: a */
    private static void m13379a(String str, String str2, String str3, long j) {
        if (!chn.m13362X(str)) {
            RLogger.getInstance().log(str, str2, str3, j);
        }
    }

    /* renamed from: N */
    public static void m13349N(String str) {
        RLogger.getInstance().log("TOKEN_DECRYPT_FAILED", "IN_APP_PURCHASE", str);
    }

    /* renamed from: O */
    public static void m13351O(String str) {
        RLogger.getInstance().log("AUTO_TRANSFER_FAILED", "IN_APP_PURCHASE", str);
    }

    /* renamed from: P */
    public static void m13353P(String str) {
        chn.m13442p(str, null);
    }

    /* renamed from: p */
    public static void m13442p(String str, String str2) {
        Message obtain = Message.obtain(f9246d, 1);
        obtain.what = 1;
        Bundle data = obtain.getData();
        if (data == null) {
            data = new Bundle();
        }
        data.putString("screen_name", str);
        if (!TextUtils.isEmpty(str2)) {
            data.putString("other_user_id", str2);
        }
        obtain.setData(data);
        f9246d.sendMessage(obtain);
    }

    /* renamed from: b */
    public static void m13394b(String str, String str2, String str3) {
        chn.m13400c(str, str2, str3);
    }

    /* renamed from: q */
    public static void m13445q(String str, String str2) {
        chn.m13381a(str, str2, null, null, null);
    }

    /* renamed from: c */
    public static void m13400c(String str, String str2, String str3) {
        chn.m13381a(str, str2, str3, null, null);
    }

    /* renamed from: a */
    public static void m13380a(String str, String str2, String str3, Long l) {
        chn.m13381a(str, str2, str3, l, null);
    }

    /* renamed from: a */
    public static void m13381a(String str, String str2, String str3, Long l, diu diu) {
        Message obtain = Message.obtain(f9246d, 0);
        if (obtain != null) {
            Bundle data = obtain.getData();
            if (data == null) {
                data = new Bundle();
            }
            data.putString("category", str);
            data.putString(NativeProtocol.WEB_DIALOG_ACTION, str2);
            if (str3 != null) {
                data.putString("label", str3);
            }
            if (l != null) {
                data.putString("value", String.valueOf(l));
            }
            if (diu != null) {
                data.putSerializable("cvars", diu);
            }
            f9246d.sendMessage(obtain);
        }
    }

    /* renamed from: r */
    public static void m13448r(String str, String str2) {
        chn.m13406d(str, "USER_EXPERIENCE", str2);
    }

    /* renamed from: Q */
    public static void m13355Q(String str) {
        chn.m13406d("GAG_NOT_FOUND", "USER_EXPERIENCE", str);
    }

    /* renamed from: s */
    public static void m13451s(String str, String str2) {
        chn.m13406d(str, "VIDEO_PLAYBACK", str2);
    }

    /* renamed from: t */
    public static void m13454t(String str, String str2) {
        chn.m13406d(str, "DEBUG_UPLOAD", str2);
    }

    /* renamed from: R */
    public static void m13356R(String str) {
        if (str == null) {
            str = "main";
        }
        RLogger.getInstance().logCount("UPLOAD." + str + ".tap-upload", 1);
    }

    /* renamed from: S */
    public static void m13357S(String str) {
        if (str == null) {
            str = "main";
        }
        RLogger.getInstance().logCount("UPLOAD." + str + ".gallery", 1);
    }

    /* renamed from: T */
    public static void m13358T(String str) {
        if (str == null) {
            str = "main";
        }
        RLogger.getInstance().logCount("UPLOAD." + str + ".direct-image", 1);
    }

    /* renamed from: U */
    public static void m13359U(String str) {
        if (str == null) {
            str = "main";
        }
        RLogger.getInstance().logCount("UPLOAD" + str + ".camera", 1);
    }

    /* renamed from: V */
    public static void m13360V(String str) {
        if (str == null) {
            str = "main";
        }
        RLogger.getInstance().logCount("UPLOAD." + str + ".type-description", 1);
    }

    /* renamed from: N */
    public static void m13348N() {
        RLogger.getInstance().logCount("UPLOAD." + "main" + ".go-pick-section", 1);
    }

    /* renamed from: W */
    public static void m13361W(String str) {
        if (str == null) {
            str = "main";
        }
        RLogger.getInstance().logCount("UPLOAD." + str + ".submit", 1);
    }

    /* renamed from: P */
    private static void m13352P() {
        HandlerThread handlerThread = new HandlerThread("metrics");
        handlerThread.start();
        f9246d = new Handler(handlerThread.getLooper(), new C17323());
    }

    /* renamed from: Q */
    private static void m13354Q() {
        f9248f.add("ViewComment");
        f9248f.add("ViewSearch");
        f9248f.add("ViewSettings");
        f9248f.add("ViewFeaturedPost");
        f9248f.add("ViewVideoList");
        f9248f.add("TapVideoPost");
        f9248f.add("ViewCommentHighlight");
    }
}
