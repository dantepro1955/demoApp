package com.p000;

import android.content.res.Resources.NotFoundException;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: bnh */
abstract class bnh<T extends bng> extends bms {
    /* renamed from: a */
    C1355a<T> f7102a;

    /* renamed from: bnh$a */
    public interface C1355a<U extends bng> {
        /* renamed from: a */
        U mo1356a();

        /* renamed from: a */
        void mo1357a(String str, int i);

        /* renamed from: a */
        void mo1358a(String str, String str2);

        /* renamed from: a */
        void mo1359a(String str, boolean z);

        /* renamed from: b */
        void mo1360b(String str, String str2);
    }

    public bnh(bmw bmw, C1355a<T> c1355a) {
        super(bmw);
        this.f7102a = c1355a;
    }

    /* renamed from: a */
    private T m9930a(XmlResourceParser xmlResourceParser) {
        try {
            xmlResourceParser.next();
            int eventType = xmlResourceParser.getEventType();
            while (eventType != 1) {
                if (xmlResourceParser.getEventType() == 2) {
                    String toLowerCase = xmlResourceParser.getName().toLowerCase();
                    String trim;
                    if (toLowerCase.equals("screenname")) {
                        toLowerCase = xmlResourceParser.getAttributeValue(null, "name");
                        trim = xmlResourceParser.nextText().trim();
                        if (!(TextUtils.isEmpty(toLowerCase) || TextUtils.isEmpty(trim))) {
                            this.f7102a.mo1358a(toLowerCase, trim);
                        }
                    } else if (toLowerCase.equals("string")) {
                        Object attributeValue = xmlResourceParser.getAttributeValue(null, "name");
                        trim = xmlResourceParser.nextText().trim();
                        if (!(TextUtils.isEmpty(attributeValue) || trim == null)) {
                            this.f7102a.mo1360b(attributeValue, trim);
                        }
                    } else if (toLowerCase.equals("bool")) {
                        toLowerCase = xmlResourceParser.getAttributeValue(null, "name");
                        r1 = xmlResourceParser.nextText().trim();
                        if (!(TextUtils.isEmpty(toLowerCase) || TextUtils.isEmpty(r1))) {
                            try {
                                this.f7102a.mo1359a(toLowerCase, Boolean.parseBoolean(r1));
                            } catch (NumberFormatException e) {
                                zzc("Error parsing bool configuration value", r1, e);
                            }
                        }
                    } else if (toLowerCase.equals("integer")) {
                        toLowerCase = xmlResourceParser.getAttributeValue(null, "name");
                        r1 = xmlResourceParser.nextText().trim();
                        if (!(TextUtils.isEmpty(toLowerCase) || TextUtils.isEmpty(r1))) {
                            try {
                                this.f7102a.mo1357a(toLowerCase, Integer.parseInt(r1));
                            } catch (NumberFormatException e2) {
                                zzc("Error parsing int configuration value", r1, e2);
                            }
                        }
                    } else {
                        continue;
                    }
                }
                eventType = xmlResourceParser.next();
            }
        } catch (XmlPullParserException e3) {
            zze("Error parsing tracker configuration file", e3);
        } catch (IOException e4) {
            zze("Error parsing tracker configuration file", e4);
        }
        return this.f7102a.mo1356a();
    }

    /* renamed from: a */
    public T m9931a(int i) {
        try {
            return m9930a(zznQ().m9768c().getResources().getXml(i));
        } catch (NotFoundException e) {
            zzd("inflate() called with unknown resourceId", e);
            return null;
        }
    }
}
