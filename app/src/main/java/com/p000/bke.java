package com.p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import defpackage.bke.AnonymousClass10;
import defpackage.bke.AnonymousClass11;
import defpackage.bke.AnonymousClass12;
import defpackage.bke.AnonymousClass13;
import defpackage.bke.AnonymousClass14;
import defpackage.bke.AnonymousClass15;
import defpackage.bke.AnonymousClass16;
import defpackage.bke.AnonymousClass17;
import defpackage.bke.AnonymousClass18;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Future;
import p000.bke.C1256b;
import p000.bke.C1264a;

@bhd
/* renamed from: bke */
public final class bke {

    /* renamed from: bke$b */
    public interface C1256b {
        /* renamed from: a */
        void mo1253a(Bundle bundle);
    }

    /* renamed from: bke$a */
    static abstract class C1264a extends bkb {
        private C1264a() {
        }

        /* renamed from: b */
        public void mo197b() {
        }
    }

    /* renamed from: bke$10 */
    class AnonymousClass10 extends C1264a {
        /* renamed from: a */
        final /* synthetic */ Context f6655a;
        /* renamed from: b */
        final /* synthetic */ C1256b f6656b;

        AnonymousClass10(Context context, C1256b c1256b) {
            this.f6655a = context;
            this.f6656b = c1256b;
            super();
        }

        /* renamed from: a */
        public void mo196a() {
            SharedPreferences a = p000.bke.m9034a(this.f6655a);
            Bundle bundle = new Bundle();
            bundle.putString("content_url_hashes", a.getString("content_url_hashes", ""));
            if (this.f6656b != null) {
                this.f6656b.mo1253a(bundle);
            }
        }
    }

    /* renamed from: bke$11 */
    class AnonymousClass11 extends C1264a {
        /* renamed from: a */
        final /* synthetic */ Context f6657a;
        /* renamed from: b */
        final /* synthetic */ String f6658b;

        AnonymousClass11(Context context, String str) {
            this.f6657a = context;
            this.f6658b = str;
            super();
        }

        /* renamed from: a */
        public void mo196a() {
            Editor edit = p000.bke.m9034a(this.f6657a).edit();
            edit.putString("content_vertical_hashes", this.f6658b);
            edit.apply();
        }
    }

    /* renamed from: bke$12 */
    class AnonymousClass12 extends C1264a {
        /* renamed from: a */
        final /* synthetic */ Context f6659a;
        /* renamed from: b */
        final /* synthetic */ boolean f6660b;

        AnonymousClass12(Context context, boolean z) {
            this.f6659a = context;
            this.f6660b = z;
            super();
        }

        /* renamed from: a */
        public void mo196a() {
            Editor edit = p000.bke.m9034a(this.f6659a).edit();
            edit.putBoolean("auto_collect_location", this.f6660b);
            edit.apply();
        }
    }

    /* renamed from: bke$13 */
    class AnonymousClass13 extends C1264a {
        /* renamed from: a */
        final /* synthetic */ Context f6661a;
        /* renamed from: b */
        final /* synthetic */ C1256b f6662b;

        AnonymousClass13(Context context, C1256b c1256b) {
            this.f6661a = context;
            this.f6662b = c1256b;
            super();
        }

        /* renamed from: a */
        public void mo196a() {
            SharedPreferences a = p000.bke.m9034a(this.f6661a);
            Bundle bundle = new Bundle();
            bundle.putBoolean("auto_collect_location", a.getBoolean("auto_collect_location", false));
            if (this.f6662b != null) {
                this.f6662b.mo1253a(bundle);
            }
        }
    }

    /* renamed from: bke$14 */
    class AnonymousClass14 extends C1264a {
        /* renamed from: a */
        final /* synthetic */ Context f6663a;
        /* renamed from: b */
        final /* synthetic */ String f6664b;
        /* renamed from: c */
        final /* synthetic */ long f6665c;

        AnonymousClass14(Context context, String str, long j) {
            this.f6663a = context;
            this.f6664b = str;
            this.f6665c = j;
            super();
        }

        /* renamed from: a */
        public void mo196a() {
            Editor edit = p000.bke.m9034a(this.f6663a).edit();
            edit.putString("app_settings_json", this.f6664b);
            edit.putLong("app_settings_last_update_ms", this.f6665c);
            edit.apply();
        }
    }

    /* renamed from: bke$15 */
    class AnonymousClass15 extends C1264a {
        /* renamed from: a */
        final /* synthetic */ Context f6666a;
        /* renamed from: b */
        final /* synthetic */ C1256b f6667b;

        AnonymousClass15(Context context, C1256b c1256b) {
            this.f6666a = context;
            this.f6667b = c1256b;
            super();
        }

        /* renamed from: a */
        public void mo196a() {
            SharedPreferences a = p000.bke.m9034a(this.f6666a);
            Bundle bundle = new Bundle();
            bundle.putString("app_settings_json", a.getString("app_settings_json", ""));
            bundle.putLong("app_settings_last_update_ms", a.getLong("app_settings_last_update_ms", 0));
            if (this.f6667b != null) {
                this.f6667b.mo1253a(bundle);
            }
        }
    }

    /* renamed from: bke$16 */
    class AnonymousClass16 extends C1264a {
        /* renamed from: a */
        final /* synthetic */ Context f6668a;
        /* renamed from: b */
        final /* synthetic */ long f6669b;

        AnonymousClass16(Context context, long j) {
            this.f6668a = context;
            this.f6669b = j;
            super();
        }

        /* renamed from: a */
        public void mo196a() {
            Editor edit = p000.bke.m9034a(this.f6668a).edit();
            edit.putLong("app_last_background_time_ms", this.f6669b);
            edit.apply();
        }
    }

    /* renamed from: bke$17 */
    class AnonymousClass17 extends C1264a {
        /* renamed from: a */
        final /* synthetic */ Context f6670a;
        /* renamed from: b */
        final /* synthetic */ C1256b f6671b;

        AnonymousClass17(Context context, C1256b c1256b) {
            this.f6670a = context;
            this.f6671b = c1256b;
            super();
        }

        /* renamed from: a */
        public void mo196a() {
            SharedPreferences a = p000.bke.m9034a(this.f6670a);
            Bundle bundle = new Bundle();
            bundle.putLong("app_last_background_time_ms", a.getLong("app_last_background_time_ms", 0));
            if (this.f6671b != null) {
                this.f6671b.mo1253a(bundle);
            }
        }
    }

    /* renamed from: bke$18 */
    class AnonymousClass18 extends C1264a {
        /* renamed from: a */
        final /* synthetic */ Context f6672a;
        /* renamed from: b */
        final /* synthetic */ int f6673b;

        AnonymousClass18(Context context, int i) {
            this.f6672a = context;
            this.f6673b = i;
            super();
        }

        /* renamed from: a */
        public void mo196a() {
            Editor edit = p000.bke.m9034a(this.f6672a).edit();
            edit.putInt("request_in_session_count", this.f6673b);
            edit.apply();
        }
    }

    /* renamed from: bke$1 */
    class C12651 extends C1264a {
        /* renamed from: a */
        final /* synthetic */ Context f6674a;
        /* renamed from: b */
        final /* synthetic */ boolean f6675b;

        C12651(Context context, boolean z) {
            this.f6674a = context;
            this.f6675b = z;
            super();
        }

        /* renamed from: a */
        public void mo196a() {
            Editor edit = bke.m9034a(this.f6674a).edit();
            edit.putBoolean("use_https", this.f6675b);
            edit.apply();
        }
    }

    /* renamed from: bke$2 */
    class C12662 extends C1264a {
        /* renamed from: a */
        final /* synthetic */ Context f6676a;
        /* renamed from: b */
        final /* synthetic */ C1256b f6677b;

        C12662(Context context, C1256b c1256b) {
            this.f6676a = context;
            this.f6677b = c1256b;
            super();
        }

        /* renamed from: a */
        public void mo196a() {
            SharedPreferences a = bke.m9034a(this.f6676a);
            Bundle bundle = new Bundle();
            bundle.putBoolean("use_https", a.getBoolean("use_https", true));
            if (this.f6677b != null) {
                this.f6677b.mo1253a(bundle);
            }
        }
    }

    /* renamed from: bke$3 */
    class C12673 extends C1264a {
        /* renamed from: a */
        final /* synthetic */ Context f6678a;
        /* renamed from: b */
        final /* synthetic */ C1256b f6679b;

        C12673(Context context, C1256b c1256b) {
            this.f6678a = context;
            this.f6679b = c1256b;
            super();
        }

        /* renamed from: a */
        public void mo196a() {
            SharedPreferences a = bke.m9034a(this.f6678a);
            Bundle bundle = new Bundle();
            bundle.putInt("request_in_session_count", a.getInt("request_in_session_count", -1));
            if (this.f6679b != null) {
                this.f6679b.mo1253a(bundle);
            }
        }
    }

    /* renamed from: bke$4 */
    class C12684 extends C1264a {
        /* renamed from: a */
        final /* synthetic */ Context f6680a;
        /* renamed from: b */
        final /* synthetic */ long f6681b;

        C12684(Context context, long j) {
            this.f6680a = context;
            this.f6681b = j;
            super();
        }

        /* renamed from: a */
        public void mo196a() {
            Editor edit = bke.m9034a(this.f6680a).edit();
            edit.putLong("first_ad_req_time_ms", this.f6681b);
            edit.apply();
        }
    }

    /* renamed from: bke$5 */
    class C12695 extends C1264a {
        /* renamed from: a */
        final /* synthetic */ Context f6682a;
        /* renamed from: b */
        final /* synthetic */ C1256b f6683b;

        C12695(Context context, C1256b c1256b) {
            this.f6682a = context;
            this.f6683b = c1256b;
            super();
        }

        /* renamed from: a */
        public void mo196a() {
            SharedPreferences a = bke.m9034a(this.f6682a);
            Bundle bundle = new Bundle();
            bundle.putLong("first_ad_req_time_ms", a.getLong("first_ad_req_time_ms", 0));
            if (this.f6683b != null) {
                this.f6683b.mo1253a(bundle);
            }
        }
    }

    /* renamed from: bke$6 */
    class C12706 extends C1264a {
        /* renamed from: a */
        final /* synthetic */ Context f6684a;
        /* renamed from: b */
        final /* synthetic */ C1256b f6685b;

        C12706(Context context, C1256b c1256b) {
            this.f6684a = context;
            this.f6685b = c1256b;
            super();
        }

        /* renamed from: a */
        public void mo196a() {
            SharedPreferences a = bke.m9034a(this.f6684a);
            Bundle bundle = new Bundle();
            bundle.putInt("webview_cache_version", a.getInt("webview_cache_version", 0));
            if (this.f6685b != null) {
                this.f6685b.mo1253a(bundle);
            }
        }
    }

    /* renamed from: bke$7 */
    class C12717 extends C1264a {
        /* renamed from: a */
        final /* synthetic */ Context f6686a;
        /* renamed from: b */
        final /* synthetic */ boolean f6687b;

        C12717(Context context, boolean z) {
            this.f6686a = context;
            this.f6687b = z;
            super();
        }

        /* renamed from: a */
        public void mo196a() {
            Editor edit = bke.m9034a(this.f6686a).edit();
            edit.putBoolean("content_url_opted_out", this.f6687b);
            edit.apply();
        }
    }

    /* renamed from: bke$8 */
    class C12728 extends C1264a {
        /* renamed from: a */
        final /* synthetic */ Context f6688a;
        /* renamed from: b */
        final /* synthetic */ C1256b f6689b;

        C12728(Context context, C1256b c1256b) {
            this.f6688a = context;
            this.f6689b = c1256b;
            super();
        }

        /* renamed from: a */
        public void mo196a() {
            SharedPreferences a = bke.m9034a(this.f6688a);
            Bundle bundle = new Bundle();
            bundle.putBoolean("content_url_opted_out", a.getBoolean("content_url_opted_out", true));
            if (this.f6689b != null) {
                this.f6689b.mo1253a(bundle);
            }
        }
    }

    /* renamed from: bke$9 */
    class C12739 extends C1264a {
        /* renamed from: a */
        final /* synthetic */ Context f6690a;
        /* renamed from: b */
        final /* synthetic */ String f6691b;

        C12739(Context context, String str) {
            this.f6690a = context;
            this.f6691b = str;
            super();
        }

        /* renamed from: a */
        public void mo196a() {
            Editor edit = bke.m9034a(this.f6690a).edit();
            edit.putString("content_url_hashes", this.f6691b);
            edit.apply();
        }
    }

    /* renamed from: a */
    public static SharedPreferences m9034a(Context context) {
        return context.getSharedPreferences("admob", 0);
    }

    /* renamed from: a */
    public static Future m9035a(Context context, int i) {
        return (Future) new AnonymousClass18(context, i).mo195d();
    }

    /* renamed from: a */
    public static Future m9036a(Context context, long j) {
        return (Future) new AnonymousClass16(context, j).mo195d();
    }

    /* renamed from: a */
    public static Future m9037a(Context context, C1256b c1256b) {
        return (Future) new C12662(context, c1256b).mo195d();
    }

    /* renamed from: a */
    public static Future m9038a(Context context, String str) {
        return (Future) new C12739(context, str).mo195d();
    }

    /* renamed from: a */
    public static Future m9039a(Context context, String str, long j) {
        return (Future) new AnonymousClass14(context, str, j).mo195d();
    }

    /* renamed from: a */
    public static Future m9040a(Context context, boolean z) {
        return (Future) new C12651(context, z).mo195d();
    }

    /* renamed from: b */
    public static Future m9041b(Context context, long j) {
        return (Future) new C12684(context, j).mo195d();
    }

    /* renamed from: b */
    public static Future m9042b(Context context, C1256b c1256b) {
        return (Future) new C12706(context, c1256b).mo195d();
    }

    /* renamed from: b */
    public static Future m9043b(Context context, String str) {
        return (Future) new AnonymousClass11(context, str).mo195d();
    }

    /* renamed from: b */
    public static Future m9044b(Context context, boolean z) {
        return (Future) new C12717(context, z).mo195d();
    }

    /* renamed from: c */
    public static Future m9045c(Context context, C1256b c1256b) {
        return (Future) new C12728(context, c1256b).mo195d();
    }

    /* renamed from: c */
    public static Future m9046c(Context context, boolean z) {
        return (Future) new AnonymousClass12(context, z).mo195d();
    }

    /* renamed from: c */
    public static void m9047c(Context context, String str) {
        SharedPreferences a = bke.m9034a(context);
        Collection stringSet = a.getStringSet("never_pool_slots", Collections.emptySet());
        if (!stringSet.contains(str)) {
            Set hashSet = new HashSet(stringSet);
            hashSet.add(str);
            Editor edit = a.edit();
            edit.putStringSet("never_pool_slots", hashSet);
            edit.apply();
        }
    }

    /* renamed from: d */
    public static Future m9048d(Context context, C1256b c1256b) {
        return (Future) new AnonymousClass10(context, c1256b).mo195d();
    }

    /* renamed from: d */
    public static void m9049d(Context context, String str) {
        SharedPreferences a = bke.m9034a(context);
        Collection stringSet = a.getStringSet("never_pool_slots", Collections.emptySet());
        if (stringSet.contains(str)) {
            Set hashSet = new HashSet(stringSet);
            hashSet.remove(str);
            Editor edit = a.edit();
            edit.putStringSet("never_pool_slots", hashSet);
            edit.apply();
        }
    }

    /* renamed from: e */
    public static Future m9050e(Context context, C1256b c1256b) {
        return (Future) new AnonymousClass13(context, c1256b).mo195d();
    }

    /* renamed from: e */
    public static boolean m9051e(Context context, String str) {
        return bke.m9034a(context).getStringSet("never_pool_slots", Collections.emptySet()).contains(str);
    }

    /* renamed from: f */
    public static Future m9052f(Context context, C1256b c1256b) {
        return (Future) new AnonymousClass15(context, c1256b).mo195d();
    }

    /* renamed from: g */
    public static Future m9053g(Context context, C1256b c1256b) {
        return (Future) new AnonymousClass17(context, c1256b).mo195d();
    }

    /* renamed from: h */
    public static Future m9054h(Context context, C1256b c1256b) {
        return (Future) new C12673(context, c1256b).mo195d();
    }

    /* renamed from: i */
    public static Future m9055i(Context context, C1256b c1256b) {
        return (Future) new C12695(context, c1256b).mo195d();
    }
}
