package com.p000;

import com.facebook.ads.AdError;
import com.facebook.stetho.server.http.HttpStatus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: wp */
class wp {
    /* renamed from: A */
    public static final wr f25871A = wp.m34645a("ad_preload_enabled", Boolean.valueOf(true));
    /* renamed from: B */
    public static final wr f25872B = wp.m34645a("ad_resource_caching_enabled", Boolean.valueOf(true));
    /* renamed from: C */
    public static final wr f25873C = wp.m34645a("resource_cache_prefix", "https://vid.applovin.com/,https://pdn.applovin.com/,https://img.applovin.com/,https://d.applovin.com/,https://assets.applovin.com/,https://cdnjs.cloudflare.com/,http://vid.applovin.com/,http://pdn.applovin.com/,http://img.applovin.com/,http://d.applovin.com/,http://assets.applovin.com/,http://cdnjs.cloudflare.com/");
    /* renamed from: D */
    public static final wr f25874D = wp.m34645a("ad_auto_preload_sizes", "BANNER,INTER");
    /* renamed from: E */
    public static final wr f25875E = wp.m34645a("ad_auto_preload_incent", Boolean.valueOf(true));
    /* renamed from: F */
    public static final wr f25876F = wp.m34645a("is_tracking_enabled", Boolean.valueOf(true));
    /* renamed from: G */
    public static final wr f25877G = wp.m34645a("force_back_button_enabled_always", Boolean.valueOf(false));
    /* renamed from: H */
    public static final wr f25878H = wp.m34645a("countdown_color", "#C8FFFFFF");
    /* renamed from: I */
    public static final wr f25879I = wp.m34645a("close_fade_in_time", Integer.valueOf(400));
    /* renamed from: J */
    public static final wr f25880J = wp.m34645a("show_close_on_exit", Boolean.valueOf(true));
    /* renamed from: K */
    public static final wr f25881K = wp.m34645a("text_incent_prompt_title", "Earn a Reward");
    /* renamed from: L */
    public static final wr f25882L = wp.m34645a("text_incent_prompt_body", "Would you like to watch a video for a reward?");
    /* renamed from: M */
    public static final wr f25883M = wp.m34645a("text_incent_prompt_yes_option", "Watch Now");
    /* renamed from: N */
    public static final wr f25884N = wp.m34645a("text_incent_prompt_no_option", "No Thanks");
    /* renamed from: O */
    public static final wr f25885O = wp.m34645a("text_incent_completion_title", "Video Reward");
    /* renamed from: P */
    public static final wr f25886P = wp.m34645a("text_incent_completion_body_success", "You have earned a reward!");
    /* renamed from: Q */
    public static final wr f25887Q = wp.m34645a("text_incent_completion_body_quota_exceeded", "You have already earned the maximum reward for today.");
    /* renamed from: R */
    public static final wr f25888R = wp.m34645a("text_incent_completion_body_reward_rejected", "Your reward was rejected.");
    /* renamed from: S */
    public static final wr f25889S = wp.m34645a("text_incent_completion_body_network_failure", "We were unable to contact the rewards server. Please try again later.");
    /* renamed from: T */
    public static final wr f25890T = wp.m34645a("text_incent_completion_close_option", "Okay");
    /* renamed from: U */
    public static final wr f25891U = wp.m34645a("show_incent_prepopup", Boolean.valueOf(true));
    /* renamed from: V */
    public static final wr f25892V = wp.m34645a("show_incent_postpopup", Boolean.valueOf(true));
    /* renamed from: W */
    public static final wr f25893W = wp.m34645a("preload_capacity_banner", Integer.valueOf(1));
    /* renamed from: X */
    public static final wr f25894X = wp.m34645a("preload_capacity_mrec", Integer.valueOf(1));
    /* renamed from: Y */
    public static final wr f25895Y = wp.m34645a("preload_capacity_inter", Integer.valueOf(1));
    /* renamed from: Z */
    public static final wr f25896Z = wp.m34645a("preload_capacity_leader", Integer.valueOf(1));
    /* renamed from: a */
    public static final wr f25897a = wp.m34645a("is_disabled", Boolean.valueOf(false));
    public static final wr aA = wp.m34645a("widget_fail_on_slot_count_diff", Boolean.valueOf(true));
    public static final wr aB = wp.m34645a("video_zero_length_as_computed", Boolean.valueOf(false));
    public static final wr aC = wp.m34645a("video_countdown_clock_margin", Integer.valueOf(10));
    public static final wr aD = wp.m34645a("video_countdown_clock_gravity", Integer.valueOf(83));
    public static final wr aE = wp.m34645a("preload_capacity_widget", Integer.valueOf(1));
    public static final wr aF = wp.m34645a("widget_latch_timeout_ms", Integer.valueOf(HttpStatus.HTTP_INTERNAL_SERVER_ERROR));
    public static final wr aG = wp.m34645a("android_gc_on_widget_detach", Boolean.valueOf(true));
    public static final wr aH = wp.m34645a("lhs_close_button_video", Boolean.valueOf(false));
    public static final wr aI = wp.m34645a("lhs_close_button_graphic", Boolean.valueOf(false));
    public static final wr aJ = wp.m34645a("lhs_skip_button", Boolean.valueOf(true));
    public static final wr aK = wp.m34645a("countdown_toggleable", Boolean.valueOf(false));
    public static final wr aL = wp.m34645a("native_batch_precache_count", Integer.valueOf(1));
    public static final wr aM = wp.m34645a("mute_controls_enabled", Boolean.valueOf(false));
    public static final wr aN = wp.m34645a("allow_user_muting", Boolean.valueOf(true));
    public static final wr aO = wp.m34645a("mute_button_size", Integer.valueOf(32));
    public static final wr aP = wp.m34645a("mute_button_margin", Integer.valueOf(10));
    public static final wr aQ = wp.m34645a("mute_button_gravity", Integer.valueOf(85));
    public static final wr aR = wp.m34645a("qq", Boolean.valueOf(false));
    public static final wr aS = wp.m34645a("hw_accelerate_webviews", Boolean.valueOf(false));
    public static final wr aT = wp.m34645a("mute_videos", Boolean.valueOf(false));
    public static final wr aU = wp.m34645a("event_tracking_endpoint", "http://rt.applovin.com/pix");
    public static final wr aV = wp.m34645a("top_level_events", "landing,checkout,iap");
    public static final wr aW = wp.m34645a("events_enabled", Boolean.valueOf(true));
    public static final wr aX = wp.m34645a("force_ssl", Boolean.valueOf(false));
    public static final wr aY = wp.m34645a("postback_service_max_queue_size", Integer.valueOf(100));
    public static final wr aZ = wp.m34645a("max_postback_attempts", Integer.valueOf(3));
    public static final wr aa = wp.m34645a("preload_capacity_incent", Integer.valueOf(2));
    public static final wr ab = wp.m34645a("dismiss_video_on_error", Boolean.valueOf(true));
    public static final wr ac = wp.m34645a("precache_delimiters", ")]',");
    public static final wr ad = wp.m34645a("close_button_size_graphic", Integer.valueOf(27));
    public static final wr ae = wp.m34645a("close_button_size_video", Integer.valueOf(30));
    public static final wr af = wp.m34645a("close_button_top_margin_graphic", Integer.valueOf(10));
    public static final wr ag = wp.m34645a("close_button_right_margin_graphic", Integer.valueOf(10));
    public static final wr ah = wp.m34645a("close_button_top_margin_video", Integer.valueOf(8));
    public static final wr ai = wp.m34645a("close_button_right_margin_video", Integer.valueOf(4));
    public static final wr aj = wp.m34645a("force_back_button_enabled_poststitial", Boolean.valueOf(false));
    public static final wr ak = wp.m34645a("force_back_button_enabled_close_button", Boolean.valueOf(false));
    public static final wr al = wp.m34645a("close_button_touch_area", Integer.valueOf(0));
    public static final wr am = wp.m34645a("is_video_skippable", Boolean.valueOf(false));
    public static final wr an = wp.m34645a("cache_cleanup_enabled", Boolean.valueOf(false));
    public static final wr ao = wp.m34645a("cache_file_ttl_seconds", Long.valueOf(86400));
    public static final wr ap = wp.m34645a("cache_max_size_mb", Integer.valueOf(-1));
    public static final wr aq = wp.m34645a("preload_merge_init_tasks_incent", Boolean.valueOf(true));
    public static final wr ar = wp.m34645a("preload_merge_init_tasks_inter", Boolean.valueOf(true));
    public static final wr as = wp.m34645a("submit_postback_timeout", Integer.valueOf(10000));
    public static final wr at = wp.m34645a("submit_postback_retries", Integer.valueOf(10));
    public static final wr au = wp.m34645a("widget_imp_tracking_delay", Integer.valueOf(AdError.SERVER_ERROR_CODE));
    public static final wr av = wp.m34645a("draw_countdown_clock", Boolean.valueOf(true));
    public static final wr aw = wp.m34645a("countdown_clock_size", Integer.valueOf(32));
    public static final wr ax = wp.m34645a("countdown_clock_stroke_size", Integer.valueOf(4));
    public static final wr ay = wp.m34645a("countdown_clock_text_size", Integer.valueOf(28));
    public static final wr az = wp.m34645a("ad_auto_preload_native", Boolean.valueOf(true));
    /* renamed from: b */
    public static final wr f25898b = wp.m34645a("honor_publisher_settings", Boolean.valueOf(true));
    public static final wr ba = wp.m34645a("click_overlay_enabled", Boolean.valueOf(false));
    public static final wr bb = wp.m34645a("click_overlay_color", "#66000000");
    public static final wr bc = wp.m34645a("click_tracking_retry_count", Integer.valueOf(3));
    public static final wr bd = wp.m34645a("click_tracking_retry_delay", Integer.valueOf(AdError.SERVER_ERROR_CODE));
    public static final wr be = wp.m34645a("click_tracking_timeout", Integer.valueOf(10000));
    public static final wr bf = wp.m34645a("android_click_spinner_size", Integer.valueOf(50));
    public static final wr bg = wp.m34645a("android_click_spinner_style", Integer.valueOf(16973853));
    public static final wr bh = wp.m34645a("android_dismiss_inters_on_click", Boolean.valueOf(false));
    public static final wr bi = wp.m34645a("android_require_external_storage_permission", Boolean.valueOf(true));
    public static final wr bj = wp.m34645a("android_drop_nomedia", Boolean.valueOf(true));
    public static final wr bk = wp.m34645a("native_auto_cache_preload_resources", Boolean.valueOf(true));
    private static final List bl = Arrays.asList(new Class[]{Boolean.class, Float.class, Integer.class, Long.class, String.class});
    private static final List bm = new ArrayList();
    /* renamed from: c */
    public static final wr f25899c = wp.m34645a("device_id", "");
    /* renamed from: d */
    public static final wr f25900d = wp.m34645a("publisher_id", "");
    /* renamed from: e */
    public static final wr f25901e = wp.m34645a("device_token", "");
    /* renamed from: f */
    public static final wr f25902f = wp.m34645a("submit_data_retry_count", Integer.valueOf(1));
    /* renamed from: g */
    public static final wr f25903g = wp.m34645a("vr_retry_count", Integer.valueOf(1));
    /* renamed from: h */
    public static final wr f25904h = wp.m34645a("fetch_ad_retry_count", Integer.valueOf(1));
    /* renamed from: i */
    public static final wr f25905i = wp.m34645a("is_verbose_logging", Boolean.valueOf(false));
    /* renamed from: j */
    public static final wr f25906j = wp.m34645a("api_endpoint", "http://d.applovin.com/");
    /* renamed from: k */
    public static final wr f25907k = wp.m34645a("adserver_endpoint", "http://a.applovin.com/");
    /* renamed from: l */
    public static final wr f25908l = wp.m34645a("get_retry_delay", Long.valueOf(10000));
    /* renamed from: m */
    public static final wr f25909m = wp.m34645a("hash_algorithm", "SHA-1");
    /* renamed from: n */
    public static final wr f25910n = wp.m34645a("short_hash_size", Integer.valueOf(16));
    /* renamed from: o */
    public static final wr f25911o = wp.m34645a("http_connection_timeout", Integer.valueOf(30000));
    /* renamed from: p */
    public static final wr f25912p = wp.m34645a("fetch_ad_connection_timeout", Integer.valueOf(30000));
    /* renamed from: q */
    public static final wr f25913q = wp.m34645a("http_socket_timeout", Integer.valueOf(20000));
    /* renamed from: r */
    public static final wr f25914r = wp.m34645a("ad_session_minutes", Integer.valueOf(60));
    /* renamed from: s */
    public static final wr f25915s = wp.m34645a("ad_request_parameters", "");
    /* renamed from: t */
    public static final wr f25916t = wp.m34645a("ad_refresh_enabled", Boolean.valueOf(true));
    /* renamed from: u */
    public static final wr f25917u = wp.m34645a("ad_refresh_seconds", Long.valueOf(120));
    /* renamed from: v */
    public static final wr f25918v = wp.m34645a("mrec_ad_refresh_enabled", Boolean.valueOf(true));
    /* renamed from: w */
    public static final wr f25919w = wp.m34645a("mrec_ad_refresh_seconds", Long.valueOf(120));
    /* renamed from: x */
    public static final wr f25920x = wp.m34645a("leader_ad_refresh_enabled", Boolean.valueOf(true));
    /* renamed from: y */
    public static final wr f25921y = wp.m34645a("leader_ad_refresh_seconds", Long.valueOf(120));
    /* renamed from: z */
    public static final wr f25922z = wp.m34645a("plugin_version", "");

    /* renamed from: a */
    public static Collection m34644a() {
        return Collections.unmodifiableList(bm);
    }

    /* renamed from: a */
    private static wr m34645a(String str, Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("No default value specified");
        } else if (bl.contains(obj.getClass())) {
            wr wrVar = new wr(str, obj);
            bm.add(wrVar);
            return wrVar;
        } else {
            throw new IllegalArgumentException("Unsupported value type: " + obj.getClass());
        }
    }

    /* renamed from: b */
    public static int m34646b() {
        return bm.size();
    }
}
