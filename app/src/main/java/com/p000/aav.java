package com.p000;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/* compiled from: BuildProperties */
/* renamed from: aav */
class aav {
    /* renamed from: a */
    public final String f144a;
    /* renamed from: b */
    public final String f145b;
    /* renamed from: c */
    public final String f146c;
    /* renamed from: d */
    public final String f147d;

    aav(String str, String str2, String str3, String str4) {
        this.f144a = str;
        this.f145b = str2;
        this.f146c = str3;
        this.f147d = str4;
    }

    /* renamed from: a */
    public static aav m131a(Properties properties) {
        return new aav(properties.getProperty("version_code"), properties.getProperty("version_name"), properties.getProperty("build_id"), properties.getProperty("package_name"));
    }

    /* renamed from: a */
    public static aav m130a(InputStream inputStream) throws IOException {
        Properties properties = new Properties();
        properties.load(inputStream);
        return aav.m131a(properties);
    }
}
