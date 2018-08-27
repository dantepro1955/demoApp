package com.p000;

import android.content.Context;
import com.facebook.internal.NativeProtocol;
import com.flurry.android.AdCreative;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

@bhd
/* renamed from: bbb */
public final class bbb {
    /* renamed from: A */
    public static final baw<Boolean> f5368A = baw.m7058a(1, "gads:video:force_watermark", Boolean.valueOf(false));
    /* renamed from: B */
    public static final baw<Long> f5369B = baw.m7057a(1, "gads:video:surface_update_min_spacing_ms", 1000);
    /* renamed from: C */
    public static final baw<Boolean> f5370C = baw.m7058a(1, "gads:video:spinner:enabled", Boolean.valueOf(false));
    /* renamed from: D */
    public static final baw<Integer> f5371D = baw.m7056a(1, "gads:video:spinner:scale", 4);
    /* renamed from: E */
    public static final baw<Long> f5372E = baw.m7057a(1, "gads:video:spinner:jank_threshold_ms", 50);
    /* renamed from: F */
    public static final baw<Boolean> f5373F = baw.m7058a(1, "gads:memory_bundle:debug_info", Boolean.valueOf(false));
    /* renamed from: G */
    public static final baw<Boolean> f5374G = baw.m7058a(1, "gads:memory_bundle:runtime_info", Boolean.valueOf(true));
    /* renamed from: H */
    public static final baw<String> f5375H = baw.m7060b(0, "gads:spam_ad_id_decorator:experiment_id");
    /* renamed from: I */
    public static final baw<Boolean> f5376I = baw.m7058a(0, "gads:spam_ad_id_decorator:enabled", Boolean.valueOf(false));
    /* renamed from: J */
    public static final baw<Boolean> f5377J = baw.m7058a(0, "gads:ad_id_app_context:enabled", Boolean.valueOf(false));
    /* renamed from: K */
    public static final baw<Float> f5378K = baw.m7055a(0, "gads:ad_id_app_context:ping_ratio", 0.0f);
    /* renamed from: L */
    public static final baw<String> f5379L = baw.m7054a(0, "gads:ad_id_app_context:experiment_id");
    /* renamed from: M */
    public static final baw<String> f5380M = baw.m7060b(0, "gads:looper_for_gms_client:experiment_id");
    /* renamed from: N */
    public static final baw<Boolean> f5381N = baw.m7058a(0, "gads:looper_for_gms_client:enabled", Boolean.valueOf(true));
    /* renamed from: O */
    public static final baw<Boolean> f5382O = baw.m7058a(0, "gads:sw_ad_request_service:enabled", Boolean.valueOf(true));
    /* renamed from: P */
    public static final baw<Boolean> f5383P = baw.m7058a(0, "gads:sw_dynamite:enabled", Boolean.valueOf(true));
    /* renamed from: Q */
    public static final baw<String> f5384Q = baw.m7059a(1, "gad:mraid:url_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_banner.js");
    /* renamed from: R */
    public static final baw<String> f5385R = baw.m7059a(1, "gad:mraid:url_expanded_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_expanded_banner.js");
    /* renamed from: S */
    public static final baw<String> f5386S = baw.m7059a(1, "gad:mraid:url_interstitial", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_interstitial.js");
    /* renamed from: T */
    public static final baw<Boolean> f5387T = baw.m7058a(0, "gads:enabled_sdk_csi", Boolean.valueOf(false));
    /* renamed from: U */
    public static final baw<String> f5388U = baw.m7059a(0, "gads:sdk_csi_server", "https://csi.gstatic.com/csi");
    /* renamed from: V */
    public static final baw<Boolean> f5389V = baw.m7058a(0, "gads:sdk_csi_write_to_file", Boolean.valueOf(false));
    /* renamed from: W */
    public static final baw<Boolean> f5390W = baw.m7058a(0, "gads:enable_content_fetching", Boolean.valueOf(true));
    /* renamed from: X */
    public static final baw<Integer> f5391X = baw.m7056a(0, "gads:content_length_weight", 1);
    /* renamed from: Y */
    public static final baw<Integer> f5392Y = baw.m7056a(0, "gads:content_age_weight", 1);
    /* renamed from: Z */
    public static final baw<Integer> f5393Z = baw.m7056a(0, "gads:min_content_len", 11);
    /* renamed from: a */
    public static final baw<String> f5394a = baw.m7054a(0, "gads:sdk_core_experiment_id");
    public static final baw<Boolean> aA = baw.m7058a(1, "gads:sai:click_gmsg_enabled", Boolean.valueOf(true));
    public static final baw<Integer> aB = baw.m7056a(0, "gads:webview_cache_version", 0);
    public static final baw<Boolean> aC = baw.m7058a(1, "gads:webview_recycle:enabled", Boolean.valueOf(false));
    public static final baw<String> aD = baw.m7054a(1, "gads:webview_recycle:experiment_id");
    public static final baw<Boolean> aE = baw.m7058a(1, "gads:webview:ignore_over_scroll", Boolean.valueOf(true));
    public static final baw<String> aF = baw.m7060b(0, "gads:pan:experiment_id");
    public static final baw<String> aG = baw.m7054a(1, "gads:rewarded:experiment_id");
    public static final baw<Boolean> aH = baw.m7058a(1, "gads:rewarded:adapter_initialization_enabled", Boolean.valueOf(false));
    public static final baw<Long> aI = baw.m7057a(1, "gads:rewarded:adapter_timeout_ms", 20000);
    public static final baw<Boolean> aJ = baw.m7058a(1, "gads:app_activity_tracker:enabled", Boolean.valueOf(true));
    public static final baw<Long> aK = baw.m7057a(1, "gads:app_activity_tracker:notify_background_listeners_delay_ms", 500);
    public static final baw<Long> aL = baw.m7057a(1, "gads:app_activity_tracker:app_session_timeout_ms", TimeUnit.MINUTES.toMillis(5));
    public static final baw<Boolean> aM = baw.m7058a(1, "gads:adid_values_in_adrequest:enabled", Boolean.valueOf(false));
    public static final baw<Long> aN = baw.m7057a(1, "gads:adid_values_in_adrequest:timeout", 2000);
    public static final baw<Boolean> aO = baw.m7058a(1, "gads:disable_adid_values_in_ms", Boolean.valueOf(false));
    public static final baw<Boolean> aP = baw.m7058a(0, "gads:ad_serving:enabled", Boolean.valueOf(true));
    public static final baw<String> aQ = baw.m7054a(1, "gads:ad_manager_enforce_arp_invariant:experiment_id");
    public static final baw<Boolean> aR = baw.m7058a(1, "gads:ad_manager_enforce_arp_invariant:enabled", Boolean.valueOf(false));
    public static final baw<Long> aS = baw.m7057a(1, "gads:ad_overlay:delay_page_close_timeout_ms", 5000);
    public static final baw<String> aT = baw.m7059a(1, "gads:banner_ad_pool:schema", "customTargeting");
    public static final baw<Integer> aU = baw.m7056a(1, "gads:banner_ad_pool:max_queues", 3);
    public static final baw<Integer> aV = baw.m7056a(1, "gads:banner_ad_pool:max_pools", 3);
    public static final baw<Boolean> aW = baw.m7058a(1, "gads:interstitial_ad_pool:enabled", Boolean.valueOf(false));
    public static final baw<Boolean> aX = baw.m7058a(1, "gads:interstitial_ad_pool:enabled_for_rewarded", Boolean.valueOf(false));
    public static final baw<String> aY = baw.m7059a(1, "gads:interstitial_ad_pool:schema", "customTargeting");
    public static final baw<String> aZ = baw.m7059a(1, "gads:interstitial_ad_pool:request_exclusions", "com.google.ads.mediation.admob.AdMobAdapter/_ad");
    public static final baw<Integer> aa = baw.m7056a(0, "gads:fingerprint_number", 10);
    public static final baw<Integer> ab = baw.m7056a(0, "gads:sleep_sec", 10);
    public static final baw<Boolean> ac = baw.m7058a(1, "gads:enable_content_url_hash", Boolean.valueOf(true));
    public static final baw<Integer> ad = baw.m7056a(1, "gads:content_vertical_fingerprint_number", 100);
    public static final baw<Boolean> ae = baw.m7058a(1, "gads:enable_content_vertical_hash", Boolean.valueOf(true));
    public static final baw<Integer> af = baw.m7056a(1, "gads:content_vertical_fingerprint_bits", 23);
    public static final baw<Integer> ag = baw.m7056a(1, "gads:content_vertical_fingerprint_ngram", 3);
    public static final baw<String> ah = baw.m7059a(1, "gads:content_fetch_view_tag_id", "googlebot");
    public static final baw<String> ai = baw.m7059a(1, "gads:content_fetch_exclude_view_tag", AdCreative.kFixNone);
    public static final baw<Boolean> aj = baw.m7058a(0, "gad:app_index_enabled", Boolean.valueOf(true));
    public static final baw<Boolean> ak = baw.m7058a(0, "gads:app_index:without_content_info_present:enabled", Boolean.valueOf(true));
    public static final baw<Long> al = baw.m7057a(0, "gads:app_index:timeout_ms", 1000);
    public static final baw<String> am = baw.m7054a(0, "gads:app_index:experiment_id");
    public static final baw<String> an = baw.m7054a(0, "gads:kitkat_interstitial_workaround:experiment_id");
    public static final baw<Boolean> ao = baw.m7058a(0, "gads:kitkat_interstitial_workaround:enabled", Boolean.valueOf(true));
    public static final baw<Boolean> ap = baw.m7058a(0, "gads:interstitial_follow_url", Boolean.valueOf(true));
    public static final baw<Boolean> aq = baw.m7058a(0, "gads:interstitial_follow_url:register_click", Boolean.valueOf(true));
    public static final baw<String> ar = baw.m7054a(0, "gads:interstitial_follow_url:experiment_id");
    public static final baw<Boolean> as = baw.m7058a(0, "gads:analytics_enabled", Boolean.valueOf(true));
    public static final baw<Boolean> at = baw.m7058a(0, "gads:ad_key_enabled", Boolean.valueOf(false));
    public static final baw<Boolean> au = baw.m7058a(1, "gads:sai:enabled", Boolean.valueOf(false));
    public static final baw<Boolean> av = baw.m7058a(1, "gads:sai:banner_ad_enabled", Boolean.valueOf(true));
    public static final baw<Boolean> aw = baw.m7058a(1, "gads:sai:native_ad_enabled", Boolean.valueOf(true));
    public static final baw<Boolean> ax = baw.m7058a(1, "gads:sai:interstitial_ad_enabled", Boolean.valueOf(true));
    public static final baw<String> ay = baw.m7059a(1, "gads:sai:click_ping_schema", "[\"/aclk\",\"/pcs/click\"]");
    public static final baw<String> az = baw.m7059a(1, "gads:sai:impression_ping_schema", "[\"/adview\"]");
    /* renamed from: b */
    public static final baw<String> f5395b = baw.m7059a(0, "gads:sdk_core_location", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/sdk-core-v40.html");
    public static final baw<Long> bA = baw.m7057a(1, "gads:network:cache_prediction_duration_s", 300);
    public static final baw<Long> bB = baw.m7057a(1, "gads:network:network_prediction_timeout_ms", 2000);
    public static final baw<Boolean> bC = baw.m7058a(0, "gads:mediation:dynamite_first:admobadapter", Boolean.valueOf(true));
    public static final baw<Boolean> bD = baw.m7058a(0, "gads:mediation:dynamite_first:adurladapter", Boolean.valueOf(true));
    public static final baw<Boolean> bE = baw.m7058a(1, "gads:bypass_adrequest_service_for_inlined_mediation", Boolean.valueOf(true));
    public static final baw<Long> bF = baw.m7057a(0, "gads:ad_loader:timeout_ms", 60000);
    public static final baw<Long> bG = baw.m7057a(0, "gads:rendering:timeout_ms", 60000);
    public static final baw<Boolean> bH = baw.m7058a(0, "gads:adshield:enable_adshield_instrumentation", Boolean.valueOf(false));
    public static final baw<Long> bI = baw.m7057a(1, "gads:gestures:task_timeout", 2000);
    public static final baw<Boolean> bJ = baw.m7058a(1, "gads:gestures:encrypt_size_limit:enabled", Boolean.valueOf(false));
    public static final baw<Boolean> bK = baw.m7058a(1, "gads:gestures:adb_query:enabled", Boolean.valueOf(false));
    public static final baw<Boolean> bL = baw.m7058a(1, "gads:gestures:adb_click:enabled", Boolean.valueOf(false));
    public static final baw<Boolean> bM = baw.m7058a(1, "gads:gestures:visibility:enabled", Boolean.valueOf(false));
    public static final baw<Boolean> bN = baw.m7058a(1, "gads:gestures:check_initialization_thread:enabled", Boolean.valueOf(false));
    public static final baw<Boolean> bO = baw.m7058a(1, "gads:gestures:get_query_in_non_ui_thread:enabled", Boolean.valueOf(true));
    public static final baw<Boolean> bP = baw.m7058a(0, "gass:client:enabled", Boolean.valueOf(true));
    public static final baw<Boolean> bQ = baw.m7058a(0, "gass:enabled", Boolean.valueOf(true));
    public static final baw<Boolean> bR = baw.m7058a(0, "gass:enable_int_signal", Boolean.valueOf(true));
    public static final baw<Boolean> bS = baw.m7058a(0, "gads:adid_notification:first_party_check:enabled", Boolean.valueOf(true));
    public static final baw<Boolean> bT = baw.m7058a(0, "gads:edu_device_helper:enabled", Boolean.valueOf(true));
    public static final baw<Boolean> bU = baw.m7058a(0, "gads:support_screen_shot", Boolean.valueOf(true));
    public static final baw<Boolean> bV = baw.m7058a(0, "gads:use_get_drawing_cache_for_screenshot:enabled", Boolean.valueOf(true));
    public static final baw<String> bW = baw.m7054a(0, "gads:use_get_drawing_cache_for_screenshot:experiment_id");
    public static final baw<String> bX = baw.m7054a(1, "gads:sdk_core_constants:experiment_id");
    public static final baw<String> bY = baw.m7059a(1, "gads:sdk_core_constants:caps", "");
    public static final baw<Long> bZ = baw.m7057a(0, "gads:js_flags:update_interval", TimeUnit.HOURS.toMillis(12));
    public static final baw<Integer> ba = baw.m7056a(1, "gads:interstitial_ad_pool:max_pools", 3);
    public static final baw<Integer> bb = baw.m7056a(1, "gads:interstitial_ad_pool:max_pool_depth", 2);
    public static final baw<Integer> bc = baw.m7056a(1, "gads:interstitial_ad_pool:time_limit_sec", 1200);
    public static final baw<String> bd = baw.m7059a(1, "gads:interstitial_ad_pool:ad_unit_exclusions", "(?!)");
    public static final baw<Integer> be = baw.m7056a(1, "gads:interstitial_ad_pool:top_off_latency_min_millis", 0);
    public static final baw<Integer> bf = baw.m7056a(1, "gads:interstitial_ad_pool:top_off_latency_range_millis", 0);
    public static final baw<Float> bg = baw.m7055a(1, "gads:interstitial_ad_pool:discard_threshold", Float.NaN);
    public static final baw<Integer> bh = baw.m7056a(1, "gads:heap_wastage:bytes", 0);
    public static final baw<String> bi = baw.m7059a(1, "gads:spherical_video:vertex_shader", "");
    public static final baw<String> bj = baw.m7059a(1, "gads:spherical_video:fragment_shader", "");
    public static final baw<String> bk = baw.m7054a(1, "gads:spherical_video:experiment_id");
    public static final baw<Boolean> bl = baw.m7058a(0, "gads:log:verbose_enabled", Boolean.valueOf(false));
    public static final baw<Boolean> bm = baw.m7058a(1, "gads:include_local_global_rectangles", Boolean.valueOf(false));
    public static final baw<String> bn = baw.m7054a(1, "gads:include_local_global_rectangles:experiment_id");
    public static final baw<Long> bo = baw.m7057a(1, "gads:position_watcher:throttle_ms", 200);
    public static final baw<Boolean> bp = baw.m7058a(0, "gads:device_info_caching:enabled", Boolean.valueOf(true));
    public static final baw<Long> bq = baw.m7057a(0, "gads:device_info_caching_expiry_ms:expiry", 300000);
    public static final baw<Boolean> br = baw.m7058a(0, "gads:gen204_signals:enabled", Boolean.valueOf(false));
    public static final baw<Boolean> bs = baw.m7058a(0, "gads:webview:error_reporting_enabled", Boolean.valueOf(false));
    public static final baw<Boolean> bt = baw.m7058a(0, "gads:adid_reporting:enabled", Boolean.valueOf(false));
    public static final baw<Boolean> bu = baw.m7058a(0, "gads:ad_settings_page_reporting:enabled", Boolean.valueOf(false));
    public static final baw<Boolean> bv = baw.m7058a(0, "gads:adid_info_gmscore_upgrade_reporting:enabled", Boolean.valueOf(false));
    public static final baw<Boolean> bw = baw.m7058a(0, "gads:request_pkg:enabled", Boolean.valueOf(true));
    public static final baw<Boolean> bx = baw.m7058a(1, "gads:gmsg:disable_back_button:enabled", Boolean.valueOf(true));
    public static final baw<Boolean> by = baw.m7058a(0, "gads:gmsg:video_meta:enabled", Boolean.valueOf(true));
    public static final baw<String> bz = baw.m7054a(0, "gads:gmsg:video_meta:experiment_id");
    /* renamed from: c */
    public static final baw<Boolean> f5396c = baw.m7058a(0, "gads:request_builder:singleton_webview", Boolean.valueOf(false));
    public static final baw<String> cA = baw.m7060b(1, "gads:auto_location_timeout:experiment_id");
    public static final baw<Long> cB = baw.m7057a(1, "gads:auto_location_interval", -1);
    public static final baw<String> cC = baw.m7060b(1, "gads:auto_location_interval:experiment_id");
    public static final baw<Boolean> cD = baw.m7058a(1, "gads:fetch_app_settings_using_cld:enabled", Boolean.valueOf(false));
    public static final baw<String> cE = baw.m7054a(1, "gads:fetch_app_settings_using_cld:enabled:experiment_id");
    public static final baw<Long> cF = baw.m7057a(1, "gads:fetch_app_settings_using_cld:refresh_interval_ms", 7200000);
    public static final baw<String> cG = baw.m7054a(1, "gads:fetch_app_settings_using_cld:refresh_interval_ms:experiment_id");
    public static final baw<String> cH = baw.m7054a(0, "gads:afs:csa:experiment_id");
    public static final baw<String> cI = baw.m7059a(0, "gads:afs:csa_webview_gmsg_ad_failed", "gmsg://noAdLoaded");
    public static final baw<String> cJ = baw.m7059a(0, "gads:afs:csa_webview_gmsg_script_load_failed", "gmsg://scriptLoadFailed");
    public static final baw<String> cK = baw.m7059a(0, "gads:afs:csa_webview_gmsg_ad_loaded", "gmsg://adResized");
    public static final baw<String> cL = baw.m7059a(0, "gads:afs:csa_webview_static_file_path", "/afs/ads/i/webview.html");
    public static final baw<String> cM = baw.m7059a(0, "gads:afs:csa_webview_custom_domain_param_key", "csa_customDomain");
    public static final baw<Long> cN = baw.m7057a(0, "gads:afs:csa_webview_adshield_timeout_ms", 1000);
    public static final baw<Boolean> cO = baw.m7058a(0, "gads:afs:csa_ad_manager_enabled", Boolean.valueOf(true));
    public static final baw<Boolean> cP = baw.m7058a(1, "gads:parental_controls:send_from_client", Boolean.valueOf(true));
    public static final baw<Boolean> cQ = baw.m7058a(1, "gads:parental_controls:cache_results", Boolean.valueOf(true));
    public static final baw<Long> cR = baw.m7057a(1, "gads:parental_controls:timeout", 2000);
    public static final baw<String> cS = baw.m7059a(0, "gads:safe_browsing:api_key", "AIzaSyDRKQ9d6kfsoZT2lUnZcZnBYvH69HExNPE");
    public static final baw<Long> cT = baw.m7057a(0, "gads:safe_browsing:safety_net:delay_ms", 2000);
    public static final baw<Boolean> cU = baw.m7058a(0, "gads:safe_browsing:debug", Boolean.valueOf(false));
    public static final baw<Boolean> cV = baw.m7058a(0, "gads:webview_cookie:enabled", Boolean.valueOf(true));
    public static final baw<Integer> cW = baw.m7056a(1, "gads:cache:max_concurrent_downloads", 10);
    public static final baw<Long> cX = baw.m7057a(1, "gads:cache:javascript_timeout_millis", 5000);
    public static final baw<Boolean> cY = baw.m7058a(1, "gads:cache:bind_on_foreground", Boolean.valueOf(false));
    public static final baw<Boolean> cZ = baw.m7058a(1, "gads:cache:bind_on_init", Boolean.valueOf(false));
    public static final baw<Boolean> ca = baw.m7058a(0, "gads:js_flags:mf", Boolean.valueOf(false));
    public static final baw<Boolean> cb = baw.m7058a(0, "gads:custom_render:ping_on_ad_rendered", Boolean.valueOf(false));
    public static final baw<String> cc = baw.m7059a(0, "gads:native:engine_url", "//googleads.g.doubleclick.net/mads/static/mad/sdk/native/native_ads.html");
    public static final baw<String> cd = baw.m7059a(1, "gads:native:engine_url_with_protocol", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/native_ads.html");
    public static final baw<String> ce = baw.m7059a(1, "gads:native:video_url", "//googleads.g.doubleclick.net/mads/static/mad/sdk/native/native_video_ads.html");
    public static final baw<String> cf = baw.m7059a(1, "gads:native:video_url_with_protocol", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/native_video_ads.html");
    public static final baw<Boolean> cg = baw.m7058a(1, "gads:singleton_webview_native", Boolean.valueOf(false));
    public static final baw<Boolean> ch = baw.m7058a(1, "gads:native_initialize_Webview_request_time", Boolean.valueOf(false));
    public static final baw<String> ci = baw.m7054a(1, "gads:singleton_webview_native:experiment_id");
    public static final baw<Boolean> cj = baw.m7058a(1, "gads:enable_untrack_view_native", Boolean.valueOf(true));
    public static final baw<Boolean> ck = baw.m7058a(1, "gads:ignore_untrack_view_google_native", Boolean.valueOf(true));
    public static final baw<Boolean> cl = baw.m7058a(1, "gads:reset_listeners_preparead_native", Boolean.valueOf(true));
    public static final baw<Integer> cm = baw.m7056a(1, "gads:native_video_load_timeout", 10);
    public static final baw<String> cn = baw.m7054a(1, "gads:native_video_load_timeout:experiment_id");
    public static final baw<String> co = baw.m7059a(1, "gads:ad_choices_content_description", "Ad Choices Icon");
    public static final baw<Boolean> cp = baw.m7058a(1, "gads:clamp_native_video_player_dimensions", Boolean.valueOf(true));
    public static final baw<Boolean> cq = baw.m7058a(1, "gads:enable_tracking_for_native_ad_views", Boolean.valueOf(true));
    public static final baw<Boolean> cr = baw.m7058a(1, "gads:use_new_json_for_native_view_tracking", Boolean.valueOf(true));
    public static final baw<Boolean> cs = baw.m7058a(1, "gads:fluid_ad:use_wrap_content_height", Boolean.valueOf(false));
    public static final baw<Boolean> ct = baw.m7058a(0, "gads:method_tracing:enabled", Boolean.valueOf(false));
    public static final baw<Long> cu = baw.m7057a(0, "gads:method_tracing:duration_ms", 30000);
    public static final baw<Integer> cv = baw.m7056a(0, "gads:method_tracing:count", 5);
    public static final baw<Integer> cw = baw.m7056a(0, "gads:method_tracing:filesize", 134217728);
    public static final baw<Boolean> cx = baw.m7058a(1, "gads:auto_location_for_coarse_permission", Boolean.valueOf(false));
    public static final baw<String> cy = baw.m7060b(1, "gads:auto_location_for_coarse_permission:experiment_id");
    public static final baw<Long> cz = baw.m7057a(1, "gads:auto_location_timeout", 2000);
    /* renamed from: d */
    public static final baw<String> f5397d = baw.m7054a(0, "gads:request_builder:singleton_webview_experiment_id");
    public static final baw<Boolean> da = baw.m7058a(1, "gads:cache:bind_on_request", Boolean.valueOf(false));
    public static final baw<Long> db = baw.m7057a(1, "gads:cache:bind_on_request_keep_alive", TimeUnit.SECONDS.toMillis(30));
    public static final baw<Boolean> dc = baw.m7058a(1, "gads:cache:use_cache_data_source", Boolean.valueOf(false));
    public static final baw<Boolean> dd = baw.m7058a(1, "gads:chrome_custom_tabs:enabled", Boolean.valueOf(true));
    public static final baw<Boolean> de = baw.m7058a(1, "gads:chrome_custom_tabs:disabled", Boolean.valueOf(false));
    public static final baw<Boolean> df = baw.m7058a(1, "gads:drx_in_app_preview:enabled", Boolean.valueOf(false));
    public static final baw<Boolean> dg = baw.m7058a(1, "gads:drx_debug_signals:enabled", Boolean.valueOf(false));
    public static final baw<String> dh = baw.m7059a(1, "gads:drx_debug:debug_device_linking_url", "https://www.google.com/dfp/linkDevice");
    public static final baw<String> di = baw.m7059a(1, "gads:drx_debug:in_app_preview_status_url", "https://www.google.com/dfp/inAppPreview");
    public static final baw<String> dj = baw.m7059a(1, "gads:drx_debug:debug_signal_status_url", "https://www.google.com/dfp/debugSignals");
    public static final baw<String> dk = baw.m7059a(1, "gads:drx_debug:send_debug_data_url", "https://www.google.com/dfp/sendDebugData");
    public static final baw<Integer> dl = baw.m7056a(1, "gads:drx_debug:timeout_ms", 5000);
    public static final baw<Integer> dm = baw.m7056a(1, "gad:pixel_dp_comparision_multiplier", 1);
    public static final baw<Boolean> dn = baw.m7058a(1, "gad:interstitial_for_multi_window", Boolean.valueOf(false));
    /* renamed from: do */
    public static final baw<Boolean> f5398do = baw.m7058a(1, "gad:interstitial_ad_stay_active_in_multi_window", Boolean.valueOf(false));
    public static final baw<Integer> dp = baw.m7056a(1, "gad:interstitial:close_button_padding_dip", 0);
    private static byte[] dq;
    /* renamed from: e */
    public static final baw<Boolean> f5399e = baw.m7058a(0, "gads:sdk_use_dynamic_module", Boolean.valueOf(true));
    /* renamed from: f */
    public static final baw<String> f5400f = baw.m7054a(0, "gads:sdk_use_dynamic_module_experiment_id");
    /* renamed from: g */
    public static final baw<Boolean> f5401g = baw.m7058a(0, "gads:sdk_crash_report_enabled", Boolean.valueOf(false));
    /* renamed from: h */
    public static final baw<Boolean> f5402h = baw.m7058a(0, "gads:sdk_crash_report_full_stacktrace", Boolean.valueOf(false));
    /* renamed from: i */
    public static final baw<String> f5403i = baw.m7059a(0, "gads:sdk_crash_report_class_prefix", "com.google.");
    /* renamed from: j */
    public static final baw<Boolean> f5404j = baw.m7058a(0, "gads:block_autoclicks", Boolean.valueOf(false));
    /* renamed from: k */
    public static final baw<String> f5405k = baw.m7054a(0, "gads:block_autoclicks_experiment_id");
    /* renamed from: l */
    public static final baw<String> f5406l = baw.m7054a(0, "gads:spam_app_context:experiment_id");
    /* renamed from: m */
    public static final baw<Boolean> f5407m = baw.m7058a(1, "gads:spam_app_context:enabled", Boolean.valueOf(false));
    /* renamed from: n */
    public static final baw<Integer> f5408n = baw.m7056a(1, "gads:http_url_connection_factory:timeout_millis", 10000);
    /* renamed from: o */
    public static final baw<String> f5409o = baw.m7059a(1, "gads:video_exo_player:version", "1");
    /* renamed from: p */
    public static final baw<String> f5410p = baw.m7054a(0, "gads:video_stream_cache:experiment_id");
    /* renamed from: q */
    public static final baw<Integer> f5411q = baw.m7056a(1, "gads:video_stream_cache:limit_count", 5);
    /* renamed from: r */
    public static final baw<Integer> f5412r = baw.m7056a(1, "gads:video_stream_cache:limit_space", 8388608);
    /* renamed from: s */
    public static final baw<Integer> f5413s = baw.m7056a(1, "gads:video_stream_exo_allocator:segment_size", (int) NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST);
    /* renamed from: t */
    public static final baw<Integer> f5414t = baw.m7056a(1, "gads:video_stream_exo_cache:buffer_size", 8388608);
    /* renamed from: u */
    public static final baw<Long> f5415u = baw.m7057a(1, "gads:video_stream_cache:limit_time_sec", 300);
    /* renamed from: v */
    public static final baw<Long> f5416v = baw.m7057a(1, "gads:video_stream_cache:notify_interval_millis", 1000);
    /* renamed from: w */
    public static final baw<Integer> f5417w = baw.m7056a(1, "gads:video_stream_cache:connect_timeout_millis", 10000);
    /* renamed from: x */
    public static final baw<Boolean> f5418x = baw.m7058a(0, "gads:video:metric_reporting_enabled", Boolean.valueOf(false));
    /* renamed from: y */
    public static final baw<String> f5419y = baw.m7059a(1, "gads:video:metric_frame_hash_times", "");
    /* renamed from: z */
    public static final baw<Long> f5420z = baw.m7057a(1, "gads:video:metric_frame_hash_time_leniency", 500);

    /* renamed from: bbb$1 */
    class C09851 implements Callable<Void> {
        /* renamed from: a */
        final /* synthetic */ Context f5367a;

        C09851(Context context) {
            this.f5367a = context;
        }

        /* renamed from: a */
        public Void m7126a() {
            ako.m2355q().m7125a(this.f5367a);
            return null;
        }

        public /* synthetic */ Object call() throws Exception {
            return m7126a();
        }
    }

    /* renamed from: a */
    public static List<String> m7127a() {
        return ako.m2354p().m7076a();
    }

    /* renamed from: a */
    public static void m7128a(Context context) {
        bku.m9268a(new C09851(context));
        int intValue = ((Integer) bh.m7064c()).intValue();
        if (intValue > 0 && dq == null) {
            dq = new byte[intValue];
        }
    }

    /* renamed from: b */
    public static List<String> m7129b() {
        return ako.m2354p().m7078b();
    }
}
