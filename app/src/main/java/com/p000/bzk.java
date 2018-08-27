package com.p000;

import android.text.TextUtils;
import com.mopub.common.Preconditions;
import com.mopub.common.util.DeviceUtils$ForceOrientation;
import com.mopub.mobileads.VastTracker;
import com.mopub.mobileads.util.XmlUtils;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/* compiled from: VastXmlManager */
/* renamed from: bzk */
public class bzk {
    /* renamed from: a */
    private Document f8296a;

    /* renamed from: a */
    public void m11899a(String str) throws ParserConfigurationException, IOException, SAXException {
        Preconditions.checkNotNull(str, "xmlString cannot be null");
        String str2 = "<MPMoVideoXMLDocRoot>" + str.replaceFirst("<\\?.*\\?>", "") + "</MPMoVideoXMLDocRoot>";
        DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
        newInstance.setCoalescing(true);
        this.f8296a = newInstance.newDocumentBuilder().parse(new InputSource(new StringReader(str2)));
    }

    /* renamed from: a */
    public List<byz> m11898a() {
        List<byz> arrayList = new ArrayList();
        if (this.f8296a == null) {
            return arrayList;
        }
        NodeList elementsByTagName = this.f8296a.getElementsByTagName("Ad");
        for (int i = 0; i < elementsByTagName.getLength(); i++) {
            arrayList.add(new byz(elementsByTagName.item(i)));
        }
        return arrayList;
    }

    /* renamed from: b */
    public VastTracker m11900b() {
        if (this.f8296a == null) {
            return null;
        }
        Object firstMatchingStringData = XmlUtils.getFirstMatchingStringData(this.f8296a, "Error");
        if (TextUtils.isEmpty(firstMatchingStringData)) {
            return null;
        }
        return new VastTracker(firstMatchingStringData);
    }

    /* renamed from: c */
    public List<VastTracker> m11901c() {
        List<String> stringDataAsList = XmlUtils.getStringDataAsList(this.f8296a, "MP_TRACKING_URL");
        List<VastTracker> arrayList = new ArrayList(stringDataAsList.size());
        for (String vastTracker : stringDataAsList) {
            arrayList.add(new VastTracker(vastTracker));
        }
        return arrayList;
    }

    /* renamed from: d */
    public String m11902d() {
        String firstMatchingStringData = XmlUtils.getFirstMatchingStringData(this.f8296a, "MoPubCtaText");
        return (firstMatchingStringData == null || firstMatchingStringData.length() > 15) ? null : firstMatchingStringData;
    }

    /* renamed from: e */
    public String m11903e() {
        String firstMatchingStringData = XmlUtils.getFirstMatchingStringData(this.f8296a, "MoPubSkipText");
        return (firstMatchingStringData == null || firstMatchingStringData.length() > 8) ? null : firstMatchingStringData;
    }

    /* renamed from: f */
    public String m11904f() {
        return XmlUtils.getFirstMatchingStringData(this.f8296a, "MoPubCloseIcon");
    }

    /* renamed from: g */
    public DeviceUtils$ForceOrientation m11905g() {
        return DeviceUtils$ForceOrientation.getForceOrientation(XmlUtils.getFirstMatchingStringData(this.f8296a, "MoPubForceOrientation"));
    }
}
