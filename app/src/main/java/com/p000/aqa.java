package com.p000;

import java.net.URI;
import java.net.URLDecoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

/* renamed from: aqa */
public class aqa {
    /* renamed from: a */
    private static final Pattern f3938a = Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");
    /* renamed from: b */
    private static final Pattern f3939b = Pattern.compile("^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$");
    /* renamed from: c */
    private static final Pattern f3940c = Pattern.compile("^((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)::((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)$");

    /* renamed from: a */
    private static String m4904a(String str, String str2) {
        if (str2 == null) {
            str2 = "ISO-8859-1";
        }
        try {
            return URLDecoder.decode(str, str2);
        } catch (Throwable e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public static Map<String, String> m4905a(URI uri, String str) {
        Map<String, String> emptyMap = Collections.emptyMap();
        String rawQuery = uri.getRawQuery();
        if (rawQuery == null || rawQuery.length() <= 0) {
            return emptyMap;
        }
        Map<String, String> hashMap = new HashMap();
        Scanner scanner = new Scanner(rawQuery);
        scanner.useDelimiter("&");
        while (scanner.hasNext()) {
            String[] split = scanner.next().split("=");
            if (split.length == 0 || split.length > 2) {
                throw new IllegalArgumentException("bad parameter");
            }
            String a = aqa.m4904a(split[0], str);
            Object obj = null;
            if (split.length == 2) {
                obj = aqa.m4904a(split[1], str);
            }
            hashMap.put(a, obj);
        }
        return hashMap;
    }
}
