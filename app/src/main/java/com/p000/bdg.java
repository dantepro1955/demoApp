package com.p000;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.ServerProtocol;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.mopub.common.AdType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@bhd
/* renamed from: bdg */
public final class bdg implements bcy {
    /* renamed from: a */
    private final bda f5643a;
    /* renamed from: b */
    private final ajy f5644b;
    /* renamed from: c */
    private final bfo f5645c;

    /* renamed from: bdg$a */
    public static class C1048a {
        /* renamed from: a */
        private final blo f5642a;

        public C1048a(blo blo) {
            this.f5642a = blo;
        }

        /* renamed from: a */
        public Intent m7572a(Context context, Map<String, String> map) {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            String str = (String) map.get("u");
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (this.f5642a != null) {
                str = ako.m2343e().m9088a(this.f5642a, str);
            }
            Uri parse = Uri.parse(str);
            boolean parseBoolean = Boolean.parseBoolean((String) map.get("use_first_package"));
            boolean parseBoolean2 = Boolean.parseBoolean((String) map.get("use_running_process"));
            Uri build = "http".equalsIgnoreCase(parse.getScheme()) ? parse.buildUpon().scheme("https").build() : "https".equalsIgnoreCase(parse.getScheme()) ? parse.buildUpon().scheme("http").build() : null;
            ArrayList arrayList = new ArrayList();
            Intent a = m7574a(parse);
            Intent a2 = m7574a(build);
            ResolveInfo a3 = m7576a(context, a, arrayList);
            if (a3 != null) {
                return m7573a(a, a3);
            }
            if (a2 != null) {
                ResolveInfo a4 = m7575a(context, a2);
                if (a4 != null) {
                    Intent a5 = m7573a(a, a4);
                    if (m7575a(context, a5) != null) {
                        return a5;
                    }
                }
            }
            if (arrayList.size() == 0) {
                return a;
            }
            if (parseBoolean2 && activityManager != null) {
                List<RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
                if (runningAppProcesses != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ResolveInfo resolveInfo = (ResolveInfo) it.next();
                        for (RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                            if (runningAppProcessInfo.processName.equals(resolveInfo.activityInfo.packageName)) {
                                return m7573a(a, resolveInfo);
                            }
                        }
                    }
                }
            }
            return parseBoolean ? m7573a(a, (ResolveInfo) arrayList.get(0)) : a;
        }

        /* renamed from: a */
        public Intent m7573a(Intent intent, ResolveInfo resolveInfo) {
            Intent intent2 = new Intent(intent);
            intent2.setClassName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
            return intent2;
        }

        /* renamed from: a */
        public Intent m7574a(Uri uri) {
            if (uri == null) {
                return null;
            }
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.addFlags(268435456);
            intent.setData(uri);
            intent.setAction("android.intent.action.VIEW");
            return intent;
        }

        /* renamed from: a */
        public ResolveInfo m7575a(Context context, Intent intent) {
            return m7576a(context, intent, new ArrayList());
        }

        /* renamed from: a */
        public ResolveInfo m7576a(Context context, Intent intent, ArrayList<ResolveInfo> arrayList) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return null;
            }
            ResolveInfo resolveInfo;
            Collection queryIntentActivities = packageManager.queryIntentActivities(intent, NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST);
            ResolveInfo resolveActivity = packageManager.resolveActivity(intent, NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST);
            if (!(queryIntentActivities == null || resolveActivity == null)) {
                for (int i = 0; i < queryIntentActivities.size(); i++) {
                    resolveInfo = (ResolveInfo) queryIntentActivities.get(i);
                    if (resolveActivity != null && resolveActivity.activityInfo.name.equals(resolveInfo.activityInfo.name)) {
                        resolveInfo = resolveActivity;
                        break;
                    }
                }
            }
            resolveInfo = null;
            arrayList.addAll(queryIntentActivities);
            return resolveInfo;
        }
    }

    public bdg(bda bda, ajy ajy, bfo bfo) {
        this.f5643a = bda;
        this.f5644b = ajy;
        this.f5645c = bfo;
    }

    /* renamed from: a */
    private void m7577a(boolean z) {
        if (this.f5645c != null) {
            this.f5645c.m8172a(z);
        }
    }

    /* renamed from: a */
    private static boolean m7578a(Map<String, String> map) {
        return "1".equals(map.get("custom_close"));
    }

    /* renamed from: b */
    private static int m7579b(Map<String, String> map) {
        String str = (String) map.get("o");
        if (str != null) {
            if ("p".equalsIgnoreCase(str)) {
                return ako.m2345g().mo1263b();
            }
            if ("l".equalsIgnoreCase(str)) {
                return ako.m2345g().mo1261a();
            }
            if ("c".equalsIgnoreCase(str)) {
                return ako.m2345g().mo1279c();
            }
        }
        return -1;
    }

    /* renamed from: b */
    private static void m7580b(blo blo, Map<String, String> map) {
        Context context = blo.getContext();
        if (TextUtils.isEmpty((String) map.get("u"))) {
            bky.m9011e("Destination url cannot be empty.");
            return;
        }
        try {
            blo.mo1322l().m9418a(new zzc(new C1048a(blo).m7572a(context, (Map) map)));
        } catch (ActivityNotFoundException e) {
            bky.m9011e(e.getMessage());
        }
    }

    /* renamed from: a */
    public void mo277a(blo blo, Map<String, String> map) {
        Object a;
        String str = (String) map.get("a");
        if (str == null) {
            bky.m9011e("Action missing from an open GMSG.");
        } else if (this.f5644b == null || this.f5644b.m2068b()) {
            blp l = blo.mo1322l();
            if ("expand".equalsIgnoreCase(str)) {
                if (blo.mo1331p()) {
                    bky.m9011e("Cannot expand WebView that is already expanded.");
                    return;
                }
                m7577a(false);
                l.m9421a(bdg.m7578a((Map) map), bdg.m7579b(map));
            } else if ("webapp".equalsIgnoreCase(str)) {
                str = (String) map.get("u");
                m7577a(false);
                if (str != null) {
                    l.m9422a(bdg.m7578a((Map) map), bdg.m7579b(map), str);
                } else {
                    l.m9423a(bdg.m7578a((Map) map), bdg.m7579b(map), (String) map.get(AdType.HTML), (String) map.get("baseurl"));
                }
            } else if ("in_app_purchase".equalsIgnoreCase(str)) {
                str = (String) map.get("product_id");
                r1 = (String) map.get("report_urls");
                if (this.f5643a == null) {
                    return;
                }
                if (r1 == null || r1.isEmpty()) {
                    this.f5643a.mo265a(str, new ArrayList());
                } else {
                    this.f5643a.mo265a(str, new ArrayList(Arrays.asList(r1.split(" "))));
                }
            } else if ("app".equalsIgnoreCase(str) && ServerProtocol.DIALOG_RETURN_SCOPES_TRUE.equalsIgnoreCase((String) map.get("system_browser"))) {
                m7577a(true);
                bdg.m7580b(blo, map);
            } else {
                Intent parseUri;
                Uri data;
                Uri parse;
                m7577a(true);
                str = (String) map.get("intent_url");
                r1 = (String) map.get("u");
                if (!TextUtils.isEmpty(str)) {
                    try {
                        parseUri = Intent.parseUri(str, 0);
                    } catch (Throwable e) {
                        String str2 = "Error parsing the url: ";
                        str = String.valueOf(str);
                        bky.m9007b(str.length() != 0 ? str2.concat(str) : new String(str2), e);
                    }
                    if (!(parseUri == null || parseUri.getData() == null)) {
                        data = parseUri.getData();
                        str = data.toString();
                        if (!TextUtils.isEmpty(str)) {
                            a = ako.m2343e().m9088a(blo, str);
                            try {
                                parse = Uri.parse(a);
                            } catch (Throwable e2) {
                                String str3 = "Error parsing the uri: ";
                                str = String.valueOf(a);
                                bky.m9007b(str.length() != 0 ? str3.concat(str) : new String(str3), e2);
                            }
                            parseUri.setData(parse);
                        }
                        parse = data;
                        parseUri.setData(parse);
                    }
                    if (parseUri != null) {
                        l.m9418a(new zzc(parseUri));
                    } else {
                        l.m9418a(new zzc((String) map.get("i"), TextUtils.isEmpty(r1) ? ako.m2343e().m9088a(blo, r1) : r1, (String) map.get("m"), (String) map.get("p"), (String) map.get("c"), (String) map.get("f"), (String) map.get("e")));
                    }
                }
                parseUri = null;
                data = parseUri.getData();
                str = data.toString();
                if (TextUtils.isEmpty(str)) {
                    a = ako.m2343e().m9088a(blo, str);
                    parse = Uri.parse(a);
                    parseUri.setData(parse);
                    if (parseUri != null) {
                        if (TextUtils.isEmpty(r1)) {
                        }
                        l.m9418a(new zzc((String) map.get("i"), TextUtils.isEmpty(r1) ? ako.m2343e().m9088a(blo, r1) : r1, (String) map.get("m"), (String) map.get("p"), (String) map.get("c"), (String) map.get("f"), (String) map.get("e")));
                    } else {
                        l.m9418a(new zzc(parseUri));
                    }
                }
                parse = data;
                parseUri.setData(parse);
                if (parseUri != null) {
                    l.m9418a(new zzc(parseUri));
                } else {
                    if (TextUtils.isEmpty(r1)) {
                    }
                    l.m9418a(new zzc((String) map.get("i"), TextUtils.isEmpty(r1) ? ako.m2343e().m9088a(blo, r1) : r1, (String) map.get("m"), (String) map.get("p"), (String) map.get("c"), (String) map.get("f"), (String) map.get("e")));
                }
            }
        } else {
            this.f5644b.m2067a((String) map.get("u"));
        }
    }
}
