package com.p000;

import com.facebook.ads.AdError;
import com.facebook.internal.Utility;

/* renamed from: bnp */
public final class bnp {
    /* renamed from: A */
    public static C1357a<Integer> f7114A = C1357a.m9977a("analytics.max_batch_post_length", (int) Utility.DEFAULT_STREAM_BUFFER_SIZE);
    /* renamed from: B */
    public static C1357a<String> f7115B = C1357a.m9981a("analytics.fallback_responses.k", "404,502");
    /* renamed from: C */
    public static C1357a<Integer> f7116C = C1357a.m9977a("analytics.batch_retry_interval.seconds.k", 3600);
    /* renamed from: D */
    public static C1357a<Long> f7117D = C1357a.m9979a("analytics.service_monitor_interval", 86400000);
    /* renamed from: E */
    public static C1357a<Integer> f7118E = C1357a.m9977a("analytics.http_connection.connect_timeout_millis", 60000);
    /* renamed from: F */
    public static C1357a<Integer> f7119F = C1357a.m9977a("analytics.http_connection.read_timeout_millis", 61000);
    /* renamed from: G */
    public static C1357a<Long> f7120G = C1357a.m9979a("analytics.campaigns.time_limit", 86400000);
    /* renamed from: H */
    public static C1357a<String> f7121H = C1357a.m9981a("analytics.first_party_experiment_id", "");
    /* renamed from: I */
    public static C1357a<Integer> f7122I = C1357a.m9977a("analytics.first_party_experiment_variant", 0);
    /* renamed from: J */
    public static C1357a<Boolean> f7123J = C1357a.m9983a("analytics.test.disable_receiver", false);
    /* renamed from: K */
    public static C1357a<Long> f7124K = C1357a.m9980a("analytics.service_client.idle_disconnect_millis", 10000, 10000);
    /* renamed from: L */
    public static C1357a<Long> f7125L = C1357a.m9979a("analytics.service_client.connect_timeout_millis", 5000);
    /* renamed from: M */
    public static C1357a<Long> f7126M = C1357a.m9979a("analytics.service_client.second_connect_delay_millis", 5000);
    /* renamed from: N */
    public static C1357a<Long> f7127N = C1357a.m9979a("analytics.service_client.unexpected_reconnect_millis", 60000);
    /* renamed from: O */
    public static C1357a<Long> f7128O = C1357a.m9979a("analytics.service_client.reconnect_throttle_millis", 1800000);
    /* renamed from: P */
    public static C1357a<Long> f7129P = C1357a.m9979a("analytics.monitoring.sample_period_millis", 86400000);
    /* renamed from: Q */
    public static C1357a<Long> f7130Q = C1357a.m9979a("analytics.initialization_warning_threshold", 5000);
    /* renamed from: a */
    public static C1357a<Boolean> f7131a = C1357a.m9983a("analytics.service_enabled", false);
    /* renamed from: b */
    public static C1357a<Boolean> f7132b = C1357a.m9983a("analytics.service_client_enabled", true);
    /* renamed from: c */
    public static C1357a<String> f7133c = C1357a.m9982a("analytics.log_tag", "GAv4", "GAv4-SVC");
    /* renamed from: d */
    public static C1357a<Long> f7134d = C1357a.m9979a("analytics.max_tokens", 60);
    /* renamed from: e */
    public static C1357a<Float> f7135e = C1357a.m9975a("analytics.tokens_per_sec", 0.5f);
    /* renamed from: f */
    public static C1357a<Integer> f7136f = C1357a.m9978a("analytics.max_stored_hits", (int) AdError.SERVER_ERROR_CODE, 20000);
    /* renamed from: g */
    public static C1357a<Integer> f7137g = C1357a.m9977a("analytics.max_stored_hits_per_app", (int) AdError.SERVER_ERROR_CODE);
    /* renamed from: h */
    public static C1357a<Integer> f7138h = C1357a.m9977a("analytics.max_stored_properties_per_app", 100);
    /* renamed from: i */
    public static C1357a<Long> f7139i = C1357a.m9980a("analytics.local_dispatch_millis", 1800000, 120000);
    /* renamed from: j */
    public static C1357a<Long> f7140j = C1357a.m9980a("analytics.initial_local_dispatch_millis", 5000, 5000);
    /* renamed from: k */
    public static C1357a<Long> f7141k = C1357a.m9979a("analytics.min_local_dispatch_millis", 120000);
    /* renamed from: l */
    public static C1357a<Long> f7142l = C1357a.m9979a("analytics.max_local_dispatch_millis", 7200000);
    /* renamed from: m */
    public static C1357a<Long> f7143m = C1357a.m9979a("analytics.dispatch_alarm_millis", 7200000);
    /* renamed from: n */
    public static C1357a<Long> f7144n = C1357a.m9979a("analytics.max_dispatch_alarm_millis", 32400000);
    /* renamed from: o */
    public static C1357a<Integer> f7145o = C1357a.m9977a("analytics.max_hits_per_dispatch", 20);
    /* renamed from: p */
    public static C1357a<Integer> f7146p = C1357a.m9977a("analytics.max_hits_per_batch", 20);
    /* renamed from: q */
    public static C1357a<String> f7147q = C1357a.m9981a("analytics.insecure_host", "http://www.google-analytics.com");
    /* renamed from: r */
    public static C1357a<String> f7148r = C1357a.m9981a("analytics.secure_host", "https://ssl.google-analytics.com");
    /* renamed from: s */
    public static C1357a<String> f7149s = C1357a.m9981a("analytics.simple_endpoint", "/collect");
    /* renamed from: t */
    public static C1357a<String> f7150t = C1357a.m9981a("analytics.batching_endpoint", "/batch");
    /* renamed from: u */
    public static C1357a<Integer> f7151u = C1357a.m9977a("analytics.max_get_length", 2036);
    /* renamed from: v */
    public static C1357a<String> f7152v = C1357a.m9982a("analytics.batching_strategy.k", bnd.BATCH_BY_COUNT.name(), bnd.BATCH_BY_COUNT.name());
    /* renamed from: w */
    public static C1357a<String> f7153w = C1357a.m9981a("analytics.compression_strategy.k", bnf.GZIP.name());
    /* renamed from: x */
    public static C1357a<Integer> f7154x = C1357a.m9977a("analytics.max_hits_per_request.k", 20);
    /* renamed from: y */
    public static C1357a<Integer> f7155y = C1357a.m9977a("analytics.max_hit_length.k", (int) Utility.DEFAULT_STREAM_BUFFER_SIZE);
    /* renamed from: z */
    public static C1357a<Integer> f7156z = C1357a.m9977a("analytics.max_post_length.k", (int) Utility.DEFAULT_STREAM_BUFFER_SIZE);

    /* renamed from: bnp$a */
    public static final class C1357a<V> {
        /* renamed from: a */
        private final V f7112a;
        /* renamed from: b */
        private final asy<V> f7113b;

        private C1357a(asy<V> asy, V v) {
            aoi.m4679a((Object) asy);
            this.f7113b = asy;
            this.f7112a = v;
        }

        /* renamed from: a */
        static C1357a<Float> m9975a(String str, float f) {
            return C1357a.m9976a(str, f, f);
        }

        /* renamed from: a */
        static C1357a<Float> m9976a(String str, float f, float f2) {
            return new C1357a(asy.m5565a(str, Float.valueOf(f2)), Float.valueOf(f));
        }

        /* renamed from: a */
        static C1357a<Integer> m9977a(String str, int i) {
            return C1357a.m9978a(str, i, i);
        }

        /* renamed from: a */
        static C1357a<Integer> m9978a(String str, int i, int i2) {
            return new C1357a(asy.m5566a(str, Integer.valueOf(i2)), Integer.valueOf(i));
        }

        /* renamed from: a */
        static C1357a<Long> m9979a(String str, long j) {
            return C1357a.m9980a(str, j, j);
        }

        /* renamed from: a */
        static C1357a<Long> m9980a(String str, long j, long j2) {
            return new C1357a(asy.m5567a(str, Long.valueOf(j2)), Long.valueOf(j));
        }

        /* renamed from: a */
        static C1357a<String> m9981a(String str, String str2) {
            return C1357a.m9982a(str, str2, str2);
        }

        /* renamed from: a */
        static C1357a<String> m9982a(String str, String str2, String str3) {
            return new C1357a(asy.m5568a(str, str3), str2);
        }

        /* renamed from: a */
        static C1357a<Boolean> m9983a(String str, boolean z) {
            return C1357a.m9984a(str, z, z);
        }

        /* renamed from: a */
        static C1357a<Boolean> m9984a(String str, boolean z, boolean z2) {
            return new C1357a(asy.m5569a(str, z2), Boolean.valueOf(z));
        }

        /* renamed from: a */
        public V m9985a() {
            return this.f7112a;
        }
    }
}
