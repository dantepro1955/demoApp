package com.p000;

import java.lang.reflect.Field;
import java.util.Locale;

/* compiled from: FieldNamingPolicy */
/* renamed from: btz */
public enum btz implements bua {
    IDENTITY {
        /* renamed from: a */
        public String mo1535a(Field field) {
            return field.getName();
        }
    },
    UPPER_CAMEL_CASE {
        /* renamed from: a */
        public String mo1535a(Field field) {
            return btz.m10991a(field.getName());
        }
    },
    UPPER_CAMEL_CASE_WITH_SPACES {
        /* renamed from: a */
        public String mo1535a(Field field) {
            return btz.m10991a(btz.m10992a(field.getName(), " "));
        }
    },
    LOWER_CASE_WITH_UNDERSCORES {
        /* renamed from: a */
        public String mo1535a(Field field) {
            return btz.m10992a(field.getName(), "_").toLowerCase(Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_DASHES {
        /* renamed from: a */
        public String mo1535a(Field field) {
            return btz.m10992a(field.getName(), "-").toLowerCase(Locale.ENGLISH);
        }
    };

    /* renamed from: a */
    static String m10992a(String str, String str2) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt) && stringBuilder.length() != 0) {
                stringBuilder.append(str2);
            }
            stringBuilder.append(charAt);
        }
        return stringBuilder.toString();
    }

    /* renamed from: a */
    static String m10991a(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        char charAt = str.charAt(0);
        while (i < str.length() - 1 && !Character.isLetter(charAt)) {
            stringBuilder.append(charAt);
            i++;
            charAt = str.charAt(i);
        }
        if (i == str.length()) {
            return stringBuilder.toString();
        }
        if (Character.isUpperCase(charAt)) {
            return str;
        }
        return stringBuilder.append(btz.m10990a(Character.toUpperCase(charAt), str, i + 1)).toString();
    }

    /* renamed from: a */
    private static String m10990a(char c, String str, int i) {
        if (i < str.length()) {
            return c + str.substring(i);
        }
        return String.valueOf(c);
    }
}
