package com.p000;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.under9.android.lib.network.model.ApiDomainObject;
import com.under9.android.lib.network.model.Constants;
import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.concurrent.ConcurrentHashMap;
import javax.net.ssl.SSLException;
import okhttp3.Response;

/* compiled from: DomainMapperModule */
/* renamed from: dgk */
public class dgk implements dgn {
    /* renamed from: a */
    private static dgk f21555a = new dgk();
    /* renamed from: c */
    private static hh<String, ApiDomainObject> f21556c;
    /* renamed from: d */
    private static final ConcurrentHashMap<String, String> f21557d = new ConcurrentHashMap();
    /* renamed from: b */
    private dgl f21558b;
    /* renamed from: e */
    private Context f21559e;
    /* renamed from: f */
    private dgq f21560f;
    /* renamed from: g */
    private dgw f21561g;
    /* renamed from: h */
    private boolean f21562h;
    /* renamed from: i */
    private djt f21563i;

    /* renamed from: a */
    public void m27208a(Context context, dgq dgq) {
        this.f21559e = context;
        this.f21560f = dgq;
        this.f21562h = dgq.m27223a();
        this.f21561g = new dgw(dgq.m27226d());
        this.f21558b = new dgl(dgq);
        this.f21563i = new djt(context);
    }

    /* renamed from: a */
    public static dgk m27202a() {
        return f21555a;
    }

    /* renamed from: b */
    public void m27209b() {
        try {
            f21556c = dgv.m27247b(dgv.m27246a(this.f21560f.m27225c()));
            m27203a(f21556c);
            if (this.f21562h) {
                Log.d("DomainMapperModule", "fetchConfigFromServer: map=" + f21556c);
            }
        } catch (Throwable e) {
            if (this.f21562h) {
                Log.d("DomainMapperModule", "fetchConfigFromServer " + e.getMessage(), e);
            }
        }
    }

    /* renamed from: c */
    public static hh<String, ApiDomainObject> m27205c() {
        return f21556c;
    }

    /* renamed from: d */
    public static ConcurrentHashMap<String, String> m27206d() {
        return f21557d;
    }

    /* renamed from: b */
    private synchronized String m27204b(String str) {
        String str2;
        if (str == null) {
            str2 = "";
        } else if (f21557d.containsKey(str)) {
            str2 = (String) f21557d.get(str);
        } else {
            str2 = this.f21563i.m27619a(str);
            if (str2 != null) {
                f21557d.putIfAbsent(str, str2);
            } else {
                f21557d.putIfAbsent(str, str);
                this.f21563i.m27622a(str, str);
            }
            str2 = (String) f21557d.get(str);
        }
        return str2;
    }

    /* renamed from: a */
    public synchronized String mo4407a(String str) {
        String host;
        Uri parse = Uri.parse(str);
        host = parse.getHost();
        String str2 = "";
        if (parse.getPath() == null) {
            host = parse.getScheme() + Constants.SCHEME_SEP + m27204b(host);
        } else {
            str2 = parse.getPath();
            if (str2 == null || str2.isEmpty()) {
                host = parse.getScheme() + Constants.SCHEME_SEP + m27204b(host) + Constants.SEP + parse.getPath();
            } else if (str2.startsWith(Constants.SEP)) {
                host = parse.getScheme() + Constants.SCHEME_SEP + m27204b(host) + parse.getPath();
            } else {
                host = parse.getScheme() + Constants.SCHEME_SEP + m27204b(host) + Constants.SEP + parse.getPath();
            }
            String query = parse.getQuery();
            if (!(query == null || query.isEmpty())) {
                host = host + "?" + query;
            }
        }
        if (this.f21562h && !host.equals(str)) {
            Log.d("DomainMapperModule", "getMappedUrl() called with: url = [" + str + "]" + "fallback = [" + host + "]");
        }
        return host;
    }

    /* renamed from: a */
    private void m27203a(hh<String, ApiDomainObject> hhVar) {
        String valueOf;
        IOException e;
        String str;
        Response response;
        Throwable th;
        for (String str2 : hhVar.keySet()) {
            Response a;
            Response response2 = (ApiDomainObject) hhVar.get(str2);
            try {
                a = this.f21558b.m27210a(response2.protocol, str2, response2.ping);
                try {
                    if (a.isSuccessful()) {
                        f21557d.put(str2, str2);
                        this.f21563i.m27622a(str2, str2);
                        if (this.f21562h) {
                            Log.d("DomainMapperModule", "populateCurrentDomains: url=" + str2 + " code=" + a.code());
                        }
                        a.body().close();
                    } else {
                        valueOf = String.valueOf(a.code());
                        try {
                            throw new IOException("default domain failed");
                        } catch (IOException e2) {
                            e = e2;
                        }
                    }
                } catch (IOException e3) {
                    e = e3;
                    valueOf = null;
                    try {
                        if (e instanceof UnknownHostException) {
                            this.f21561g.m27248a("DOMAIN_MAPPING_FALLBACK.unknown-host", 1);
                        }
                        if (e instanceof SSLException) {
                            this.f21561g.m27248a("DOMAIN_MAPPING_FALLBACK.ssl-exception", 1);
                        }
                        if (e instanceof SocketTimeoutException) {
                            this.f21561g.m27248a("DOMAIN_MAPPING_FALLBACK.socket-timed-out", 1);
                        }
                        if (e instanceof ConnectException) {
                            this.f21561g.m27248a("DOMAIN_MAPPING_FALLBACK.connect", 1);
                        }
                        if (this.f21562h) {
                            e.printStackTrace();
                        }
                        str = response2.fallback;
                        try {
                            response2 = this.f21558b.m27210a(response2.protocol, str, response2.ping);
                            try {
                                if (response2.isSuccessful()) {
                                    f21557d.put(str2, str);
                                    this.f21563i.m27622a(str2, str);
                                    this.f21561g.m27249a("DOMAIN_MAPPING_FALLBACK", "DOMAIN_MAPPING", String.format("original:%s, fallback:%s, prevCode:%s, reason:%s", new Object[]{str2, str, valueOf, e.toString()}));
                                    if (this.f21562h) {
                                        Log.d("DomainMapperModule", "populateCurrentDomains: fallback, url=" + str + " code=" + response2.code());
                                    }
                                    response2.body().close();
                                    response = response2;
                                    response.body().close();
                                } else {
                                    throw new IOException("fallback domain failed");
                                }
                            } catch (IOException e4) {
                                e = e4;
                                try {
                                    f21557d.put(str2, str2);
                                    this.f21563i.m27622a(str2, str2);
                                    if (e instanceof UnknownHostException) {
                                        this.f21561g.m27248a("DOMAIN_MAPPING_FALLBACK.fallback-unknown-host", 1);
                                    }
                                    if (e instanceof SSLException) {
                                        this.f21561g.m27248a("DOMAIN_MAPPING_FALLBACK.fallback-ssl-exception", 1);
                                    }
                                    if (e instanceof SocketTimeoutException) {
                                        this.f21561g.m27248a("DOMAIN_MAPPING_FALLBACK.fallback-socket-timed-out", 1);
                                    }
                                    if (e instanceof ConnectException) {
                                        this.f21561g.m27248a("DOMAIN_MAPPING_FALLBACK.fallback-connect", 1);
                                    }
                                    if (this.f21562h) {
                                        Log.d("DomainMapperModule", "populateCurrentDomains2: ");
                                    }
                                    this.f21561g.m27249a("DOMAIN_MAPPING_FALLBACK", "DOMAIN_MAPPING", "fallback failed, use default=" + str2 + ", reason=" + e.toString());
                                    response2.body().close();
                                    response = response2;
                                    response.body().close();
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                        } catch (IOException e5) {
                            e = e5;
                            response2 = a;
                            f21557d.put(str2, str2);
                            this.f21563i.m27622a(str2, str2);
                            if (e instanceof UnknownHostException) {
                                this.f21561g.m27248a("DOMAIN_MAPPING_FALLBACK.fallback-unknown-host", 1);
                            }
                            if (e instanceof SSLException) {
                                this.f21561g.m27248a("DOMAIN_MAPPING_FALLBACK.fallback-ssl-exception", 1);
                            }
                            if (e instanceof SocketTimeoutException) {
                                this.f21561g.m27248a("DOMAIN_MAPPING_FALLBACK.fallback-socket-timed-out", 1);
                            }
                            if (e instanceof ConnectException) {
                                this.f21561g.m27248a("DOMAIN_MAPPING_FALLBACK.fallback-connect", 1);
                            }
                            if (this.f21562h) {
                                Log.d("DomainMapperModule", "populateCurrentDomains2: ");
                            }
                            this.f21561g.m27249a("DOMAIN_MAPPING_FALLBACK", "DOMAIN_MAPPING", "fallback failed, use default=" + str2 + ", reason=" + e.toString());
                            response2.body().close();
                            response = response2;
                            response.body().close();
                        } catch (Throwable th3) {
                            th = th3;
                            a = response2;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                }
            } catch (IOException e6) {
                e = e6;
                a = null;
                valueOf = null;
                if (e instanceof UnknownHostException) {
                    this.f21561g.m27248a("DOMAIN_MAPPING_FALLBACK.unknown-host", 1);
                }
                if (e instanceof SSLException) {
                    this.f21561g.m27248a("DOMAIN_MAPPING_FALLBACK.ssl-exception", 1);
                }
                if (e instanceof SocketTimeoutException) {
                    this.f21561g.m27248a("DOMAIN_MAPPING_FALLBACK.socket-timed-out", 1);
                }
                if (e instanceof ConnectException) {
                    this.f21561g.m27248a("DOMAIN_MAPPING_FALLBACK.connect", 1);
                }
                if (this.f21562h) {
                    e.printStackTrace();
                }
                str = response2.fallback;
                response2 = this.f21558b.m27210a(response2.protocol, str, response2.ping);
                if (response2.isSuccessful()) {
                    throw new IOException("fallback domain failed");
                }
                f21557d.put(str2, str);
                this.f21563i.m27622a(str2, str);
                this.f21561g.m27249a("DOMAIN_MAPPING_FALLBACK", "DOMAIN_MAPPING", String.format("original:%s, fallback:%s, prevCode:%s, reason:%s", new Object[]{str2, str, valueOf, e.toString()}));
                if (this.f21562h) {
                    Log.d("DomainMapperModule", "populateCurrentDomains: fallback, url=" + str + " code=" + response2.code());
                }
                response2.body().close();
                response = response2;
                response.body().close();
            } catch (Throwable th5) {
                th = th5;
                a = null;
            }
        }
        return;
        a.body().close();
        throw th;
        response2.body().close();
        throw th;
    }
}
