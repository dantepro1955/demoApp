package com.p000;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import com.roughike.bottombar.BottomBarTab;
import com.roughike.bottombar.BottomBarTab.C4200a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: TabParser */
/* renamed from: dch */
public class dch {
    /* renamed from: a */
    private final Context f21142a;
    /* renamed from: b */
    private final C4200a f21143b;
    /* renamed from: c */
    private final XmlResourceParser f21144c;
    /* renamed from: d */
    private List<BottomBarTab> f21145d = null;

    /* compiled from: TabParser */
    /* renamed from: dch$a */
    public static class C4798a extends RuntimeException {
    }

    public dch(Context context, C4200a c4200a, int i) {
        this.f21142a = context;
        this.f21143b = c4200a;
        this.f21144c = context.getResources().getXml(i);
    }

    /* renamed from: a */
    public List<BottomBarTab> m26371a() {
        Exception e;
        if (this.f21145d == null) {
            this.f21145d = new ArrayList(5);
            int next;
            do {
                try {
                    next = this.f21144c.next();
                    if (next == 2 && "tab".equals(this.f21144c.getName())) {
                        this.f21145d.add(m26367a(this.f21144c, this.f21145d.size()));
                    }
                } catch (IOException e2) {
                    e = e2;
                } catch (XmlPullParserException e3) {
                    e = e3;
                }
            } while (next != 1);
        }
        return this.f21145d;
        e.printStackTrace();
        throw new C4798a();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private com.roughike.bottombar.BottomBarTab m26367a(XmlResourceParser r9, int r10) {
        /*
        r8 = this;
        r3 = 1;
        r1 = 0;
        r2 = -1;
        r5 = r8.m26368b();
        r5.setIndexInContainer(r10);
        r6 = r9.getAttributeCount();
        r4 = r1;
    L_0x000f:
        if (r4 >= r6) goto L_0x00d4;
    L_0x0011:
        r0 = r9.getAttributeName(r4);
        r7 = r0.hashCode();
        switch(r7) {
            case -1765033179: goto L_0x0056;
            case -1077332995: goto L_0x004c;
            case -738071611: goto L_0x0074;
            case -424740686: goto L_0x0060;
            case 3355: goto L_0x0024;
            case 3226745: goto L_0x002e;
            case 110371416: goto L_0x0038;
            case 1110315790: goto L_0x006a;
            case 1162188184: goto L_0x0042;
            default: goto L_0x001c;
        };
    L_0x001c:
        r0 = r2;
    L_0x001d:
        switch(r0) {
            case 0: goto L_0x007f;
            case 1: goto L_0x0087;
            case 2: goto L_0x008f;
            case 3: goto L_0x0097;
            case 4: goto L_0x00a1;
            case 5: goto L_0x00ac;
            case 6: goto L_0x00b7;
            case 7: goto L_0x00c2;
            case 8: goto L_0x00cb;
            default: goto L_0x0020;
        };
    L_0x0020:
        r0 = r4 + 1;
        r4 = r0;
        goto L_0x000f;
    L_0x0024:
        r7 = "id";
        r0 = r0.equals(r7);
        if (r0 == 0) goto L_0x001c;
    L_0x002c:
        r0 = r1;
        goto L_0x001d;
    L_0x002e:
        r7 = "icon";
        r0 = r0.equals(r7);
        if (r0 == 0) goto L_0x001c;
    L_0x0036:
        r0 = r3;
        goto L_0x001d;
    L_0x0038:
        r7 = "title";
        r0 = r0.equals(r7);
        if (r0 == 0) goto L_0x001c;
    L_0x0040:
        r0 = 2;
        goto L_0x001d;
    L_0x0042:
        r7 = "inActiveColor";
        r0 = r0.equals(r7);
        if (r0 == 0) goto L_0x001c;
    L_0x004a:
        r0 = 3;
        goto L_0x001d;
    L_0x004c:
        r7 = "activeColor";
        r0 = r0.equals(r7);
        if (r0 == 0) goto L_0x001c;
    L_0x0054:
        r0 = 4;
        goto L_0x001d;
    L_0x0056:
        r7 = "barColorWhenSelected";
        r0 = r0.equals(r7);
        if (r0 == 0) goto L_0x001c;
    L_0x005e:
        r0 = 5;
        goto L_0x001d;
    L_0x0060:
        r7 = "badgeBackgroundColor";
        r0 = r0.equals(r7);
        if (r0 == 0) goto L_0x001c;
    L_0x0068:
        r0 = 6;
        goto L_0x001d;
    L_0x006a:
        r7 = "badgeHidesWhenActive";
        r0 = r0.equals(r7);
        if (r0 == 0) goto L_0x001c;
    L_0x0072:
        r0 = 7;
        goto L_0x001d;
    L_0x0074:
        r7 = "iconOnly";
        r0 = r0.equals(r7);
        if (r0 == 0) goto L_0x001c;
    L_0x007c:
        r0 = 8;
        goto L_0x001d;
    L_0x007f:
        r0 = r9.getIdAttributeResourceValue(r4);
        r5.setId(r0);
        goto L_0x0020;
    L_0x0087:
        r0 = r9.getAttributeResourceValue(r4, r1);
        r5.setIconResId(r0);
        goto L_0x0020;
    L_0x008f:
        r0 = r8.m26369b(r9, r4);
        r5.setTitle(r0);
        goto L_0x0020;
    L_0x0097:
        r0 = r8.m26370c(r9, r4);
        if (r0 == r2) goto L_0x0020;
    L_0x009d:
        r5.setInActiveColor(r0);
        goto L_0x0020;
    L_0x00a1:
        r0 = r8.m26370c(r9, r4);
        if (r0 == r2) goto L_0x0020;
    L_0x00a7:
        r5.setActiveColor(r0);
        goto L_0x0020;
    L_0x00ac:
        r0 = r8.m26370c(r9, r4);
        if (r0 == r2) goto L_0x0020;
    L_0x00b2:
        r5.setBarColorWhenSelected(r0);
        goto L_0x0020;
    L_0x00b7:
        r0 = r8.m26370c(r9, r4);
        if (r0 == r2) goto L_0x0020;
    L_0x00bd:
        r5.setBadgeBackgroundColor(r0);
        goto L_0x0020;
    L_0x00c2:
        r0 = r9.getAttributeBooleanValue(r4, r3);
        r5.setBadgeHidesWhenActive(r0);
        goto L_0x0020;
    L_0x00cb:
        r0 = r9.getAttributeBooleanValue(r4, r1);
        r5.setIsTitleless(r0);
        goto L_0x0020;
    L_0x00d4:
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: dch.a(android.content.res.XmlResourceParser, int):com.roughike.bottombar.BottomBarTab");
    }

    /* renamed from: b */
    private BottomBarTab m26368b() {
        BottomBarTab bottomBarTab = new BottomBarTab(this.f21142a);
        bottomBarTab.setConfig(this.f21143b);
        return bottomBarTab;
    }

    /* renamed from: b */
    private String m26369b(XmlResourceParser xmlResourceParser, int i) {
        int attributeResourceValue = xmlResourceParser.getAttributeResourceValue(i, 0);
        return attributeResourceValue == 0 ? xmlResourceParser.getAttributeValue(i) : this.f21142a.getString(attributeResourceValue);
    }

    /* renamed from: c */
    private int m26370c(XmlResourceParser xmlResourceParser, int i) {
        int attributeResourceValue = xmlResourceParser.getAttributeResourceValue(i, 0);
        if (attributeResourceValue != 0) {
            return ew.c(this.f21142a, attributeResourceValue);
        }
        try {
            return Color.parseColor(xmlResourceParser.getAttributeValue(i));
        } catch (Exception e) {
            return -1;
        }
    }
}
