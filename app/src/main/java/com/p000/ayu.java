package com.p000;

import java.text.Normalizer;
import java.text.Normalizer.Form;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import p000.ayp.C0920a;

@bhd
/* renamed from: ayu */
public class ayu {
    /* renamed from: a */
    private final ayo f5102a;
    /* renamed from: b */
    private final int f5103b;
    /* renamed from: c */
    private String f5104c;
    /* renamed from: d */
    private String f5105d;
    /* renamed from: e */
    private final boolean f5106e = false;
    /* renamed from: f */
    private final int f5107f;
    /* renamed from: g */
    private final int f5108g;

    /* renamed from: ayu$a */
    public class C0922a implements Comparator<ayn> {
        public C0922a(ayu ayu) {
        }

        /* renamed from: a */
        public int m6656a(ayn ayn, ayn ayn2) {
            if (ayn.m6627b() < ayn2.m6627b()) {
                return -1;
            }
            if (ayn.m6627b() > ayn2.m6627b()) {
                return 1;
            }
            if (ayn.m6626a() < ayn2.m6626a()) {
                return -1;
            }
            if (ayn.m6626a() > ayn2.m6626a()) {
                return 1;
            }
            float d = (ayn.m6629d() - ayn.m6627b()) * (ayn.m6628c() - ayn.m6626a());
            float d2 = (ayn2.m6629d() - ayn2.m6627b()) * (ayn2.m6628c() - ayn2.m6626a());
            return d <= d2 ? d < d2 ? 1 : 0 : -1;
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return m6656a((ayn) obj, (ayn) obj2);
        }
    }

    public ayu(int i, int i2, int i3) {
        this.f5103b = i;
        if (i2 > 64 || i2 < 0) {
            this.f5107f = 64;
        } else {
            this.f5107f = i2;
        }
        if (i3 < 1) {
            this.f5108g = 1;
        } else {
            this.f5108g = i3;
        }
        this.f5102a = new ayt(this.f5107f);
    }

    /* renamed from: a */
    String m6657a(String str, char c) {
        StringBuilder stringBuilder = new StringBuilder(str);
        Object obj = null;
        int i = 1;
        while (i + 2 <= stringBuilder.length()) {
            if (stringBuilder.charAt(i) == '\'') {
                if (stringBuilder.charAt(i - 1) == c || !((stringBuilder.charAt(i + 1) == 's' || stringBuilder.charAt(i + 1) == 'S') && (i + 2 == stringBuilder.length() || stringBuilder.charAt(i + 2) == c))) {
                    stringBuilder.setCharAt(i, c);
                } else {
                    stringBuilder.insert(i, c);
                    i += 2;
                }
                obj = 1;
            }
            i++;
        }
        return obj != null ? stringBuilder.toString() : null;
    }

    /* renamed from: a */
    public String m6658a(ArrayList<String> arrayList, ArrayList<ayn> arrayList2) {
        Collections.sort(arrayList2, new C0922a(this));
        HashSet hashSet = new HashSet();
        int i = 0;
        while (i < arrayList2.size() && m6659a(Normalizer.normalize((CharSequence) arrayList.get(((ayn) arrayList2.get(i)).m6630e()), Form.NFKC).toLowerCase(Locale.US), hashSet)) {
            i++;
        }
        C0920a c0920a = new C0920a();
        this.f5104c = "";
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            try {
                c0920a.m6634a(this.f5102a.mo854a((String) it.next()));
            } catch (Throwable e) {
                bky.m9007b("Error while writing hash to byteStream", e);
            }
        }
        return c0920a.toString();
    }

    /* renamed from: a */
    boolean m6659a(String str, HashSet<String> hashSet) {
        String[] split = str.split("\n");
        if (split.length == 0) {
            return true;
        }
        for (String str2 : split) {
            String str22;
            String a;
            String[] a2;
            int i;
            Object obj;
            int i2;
            boolean z;
            if (str22.indexOf("'") != -1) {
                a = m6657a(str22, ' ');
                if (a != null) {
                    this.f5105d = a;
                    a2 = ayq.m6641a(a, true);
                    if (a2.length < this.f5108g) {
                        for (i = 0; i < a2.length; i++) {
                            obj = "";
                            for (i2 = 0; i2 < this.f5108g; i2++) {
                                if (i + i2 >= a2.length) {
                                    z = false;
                                    break;
                                }
                                if (i2 > 0) {
                                    obj = String.valueOf(obj).concat(" ");
                                }
                                String valueOf = String.valueOf(obj);
                                str22 = String.valueOf(a2[i + i2]);
                                obj = str22.length() == 0 ? valueOf.concat(str22) : new String(valueOf);
                            }
                            z = true;
                            if (!z) {
                                break;
                            }
                            hashSet.add(obj);
                            if (hashSet.size() < this.f5103b) {
                                return false;
                            }
                        }
                        if (hashSet.size() >= this.f5103b) {
                            return false;
                        }
                    }
                }
            }
            a = str22;
            a2 = ayq.m6641a(a, true);
            if (a2.length < this.f5108g) {
                for (i = 0; i < a2.length; i++) {
                    obj = "";
                    for (i2 = 0; i2 < this.f5108g; i2++) {
                        if (i + i2 >= a2.length) {
                            z = false;
                            break;
                        }
                        if (i2 > 0) {
                            obj = String.valueOf(obj).concat(" ");
                        }
                        String valueOf2 = String.valueOf(obj);
                        str22 = String.valueOf(a2[i + i2]);
                        if (str22.length() == 0) {
                        }
                    }
                    z = true;
                    if (!z) {
                        break;
                    }
                    hashSet.add(obj);
                    if (hashSet.size() < this.f5103b) {
                        return false;
                    }
                }
                if (hashSet.size() >= this.f5103b) {
                    return false;
                }
            }
        }
        return true;
    }
}
