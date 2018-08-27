package com.p000;

import com.facebook.imageutils.JfifUtil;
import java.util.Enumeration;

/* renamed from: dpk */
public class dpk extends dph {
    /* renamed from: a */
    private static final rk f22525a = dnn.m28258a(dpk.class);

    public dpk(String str, String str2, String str3, String str4, String str5, String str6, rg rgVar, String str7, short s, short s2, String str8, String str9, String str10, String str11, byte[] bArr, String str12, String str13, dni dni) {
        super((short) 514);
        if (f22525a.mo4276b()) {
            f22525a.mo4275b((Object) "PDXQueryBegin()");
        }
        m28201a("uid", str, (short) 193);
        m28201a("pdx_version", str2, (short) 193);
        m28201a("client_version", str3, (short) 193);
        m28201a("script_version", str4, (short) 193);
        m28201a("language", str5, (short) 193);
        m28201a("region", str6, (short) 193);
        m28197a("device_codec", (int) rgVar.m28246a());
        m28201a("dictation_language", str7, (short) 193);
        m28197a("lcd_width", (int) s);
        m28197a("lcd_height", (int) s2);
        if (str8 == null) {
            m28203a("carrier", new byte[0], (short) 5);
        } else {
            m28201a("carrier", str8, (short) 193);
        }
        m28201a("phone_model", str9, (short) 193);
        m28201a("phone_number", str10, (short) 193);
        m28201a("original_session_id", str11, (short) 22);
        if (bArr != null) {
            m28201a("new_session_id", dpa.m28522a(bArr), (short) 193);
        }
        m28201a("application", str12, (short) 22);
        m28201a("nmaid", str12, (short) 22);
        m28201a("command", str13, (short) 22);
        if (dni != null) {
            Enumeration a = dni.mo4452a();
            while (a.hasMoreElements()) {
                String str14 = (String) a.nextElement();
                switch (((dnd) dni).m28205b(str14).m28181c()) {
                    case (short) 4:
                        m28203a(str14, dni.mo4461d(str14), (short) 4);
                        break;
                    case (short) 5:
                        m28203a(str14, null, (short) 5);
                        break;
                    case (short) 16:
                        f22525a.mo4281e("PDXQueryBegin() Sequence not accepted in optionalKeys");
                        break;
                    case (short) 22:
                        m28201a(str14, dni.mo4463f(str14), (short) 22);
                        break;
                    case JfifUtil.MARKER_SOFn /*192*/:
                        m28197a(str14, dni.mo4460c(str14));
                        break;
                    case (short) 193:
                        m28201a(str14, dni.mo4462e(str14), (short) 193);
                        break;
                    case (short) 224:
                        f22525a.mo4281e("PDXQueryBegin() Dictionary not accepted in optionalKeys");
                        break;
                    default:
                        break;
                }
            }
        }
    }
}
