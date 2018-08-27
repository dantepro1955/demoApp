package com.p000;

import android.util.StringBuilderPrinter;
import com.facebook.GraphResponse;
import java.util.HashMap;

/* compiled from: ResultPrinter */
/* renamed from: dgs */
public class dgs {
    /* renamed from: a */
    public static String m27232a(String str, HashMap<String, String> hashMap) {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilderPrinter stringBuilderPrinter = new StringBuilderPrinter(stringBuilder);
        stringBuilderPrinter.println(" ");
        stringBuilderPrinter.println("Host=" + str + " success=" + ((String) hashMap.get(GraphResponse.SUCCESS_KEY)));
        int parseInt = Integer.parseInt((String) hashMap.get("num_hops"));
        int length = String.valueOf(parseInt + 1).length();
        for (int i = 0; i < parseInt; i++) {
            int i2;
            String str2 = (String) hashMap.get("hop_" + i + "_addr_1");
            if (str2 == null) {
                str2 = "*";
            }
            String valueOf = String.valueOf(i + 1);
            String str3 = valueOf;
            for (i2 = 0; i2 < (length + 1) - valueOf.length(); i2++) {
                str3 = str3 + " ";
            }
            str3 = str3 + str2;
            for (i2 = 0; i2 < 16 - str2.length(); i2++) {
                str3 = str3 + " ";
            }
            str2 = (String) hashMap.get("hop_" + i + "_rtt_ms");
            if (str2 == null) {
                str2 = "-1";
            }
            float parseFloat = Float.parseFloat(str2);
            stringBuilderPrinter.println(str3 + String.format("%6.2f", new Object[]{Float.valueOf(parseFloat)}) + " ms");
        }
        return stringBuilder.toString();
    }
}
