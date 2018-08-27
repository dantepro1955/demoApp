package com.p000;

import android.text.TextUtils;
import java.util.Map;

@bhd
/* renamed from: bbg */
public abstract class bbg {
    @bhd
    /* renamed from: a */
    public static final bbg f5436a = new C09871();
    @bhd
    /* renamed from: b */
    public static final bbg f5437b = new C09882();
    @bhd
    /* renamed from: c */
    public static final bbg f5438c = new C09893();

    /* renamed from: bbg$1 */
    class C09871 extends bbg {
        C09871() {
        }

        /* renamed from: a */
        public String mo914a(String str, String str2) {
            return str2;
        }
    }

    /* renamed from: bbg$2 */
    class C09882 extends bbg {
        C09882() {
        }

        /* renamed from: a */
        public String mo914a(String str, String str2) {
            return str != null ? str : str2;
        }
    }

    /* renamed from: bbg$3 */
    class C09893 extends bbg {
        C09893() {
        }

        /* renamed from: a */
        private String m7153a(String str) {
            if (TextUtils.isEmpty(str)) {
                return str;
            }
            int i = 0;
            int length = str.length();
            while (i < str.length() && str.charAt(i) == ',') {
                i++;
            }
            while (length > 0 && str.charAt(length - 1) == ',') {
                length--;
            }
            return (i == 0 && length == str.length()) ? str : str.substring(i, length);
        }

        /* renamed from: a */
        public String mo914a(String str, String str2) {
            String a = m7153a(str);
            String a2 = m7153a(str2);
            return TextUtils.isEmpty(a) ? a2 : TextUtils.isEmpty(a2) ? a : new StringBuilder((String.valueOf(a).length() + 1) + String.valueOf(a2).length()).append(a).append(",").append(a2).toString();
        }
    }

    /* renamed from: a */
    public abstract String mo914a(String str, String str2);

    /* renamed from: a */
    public final void m7150a(Map<String, String> map, String str, String str2) {
        map.put(str, mo914a((String) map.get(str), str2));
    }
}
