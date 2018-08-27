package com.p000;

import android.text.TextUtils;
import com.mopub.common.Preconditions;
import com.mopub.mobileads.VastResourceXmlManager;
import com.mopub.mobileads.VastTracker;
import com.mopub.mobileads.util.XmlUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.w3c.dom.Node;

/* compiled from: VastCompanionAdXmlManager */
/* renamed from: bzb */
public class bzb {
    /* renamed from: a */
    private final Node f8265a;
    /* renamed from: b */
    private final VastResourceXmlManager f8266b;

    bzb(Node node) {
        Preconditions.checkNotNull(node, "companionNode cannot be null");
        this.f8265a = node;
        this.f8266b = new VastResourceXmlManager(node);
    }

    /* renamed from: a */
    public Integer m11854a() {
        return XmlUtils.getAttributeValueAsInt(this.f8265a, "width");
    }

    /* renamed from: b */
    public Integer m11855b() {
        return XmlUtils.getAttributeValueAsInt(this.f8265a, "height");
    }

    /* renamed from: c */
    public String m11856c() {
        return XmlUtils.getAttributeValue(this.f8265a, "adSlotID");
    }

    /* renamed from: d */
    public VastResourceXmlManager m11857d() {
        return this.f8266b;
    }

    /* renamed from: e */
    public String m11858e() {
        return XmlUtils.getNodeValue(XmlUtils.getFirstMatchingChildNode(this.f8265a, "CompanionClickThrough"));
    }

    /* renamed from: f */
    public List<VastTracker> m11859f() {
        List<VastTracker> arrayList = new ArrayList();
        List<Node> matchingChildNodes = XmlUtils.getMatchingChildNodes(this.f8265a, "CompanionClickTracking");
        if (matchingChildNodes == null) {
            return arrayList;
        }
        for (Node nodeValue : matchingChildNodes) {
            Object nodeValue2 = XmlUtils.getNodeValue(nodeValue);
            if (!TextUtils.isEmpty(nodeValue2)) {
                arrayList.add(new VastTracker(nodeValue2));
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    public List<VastTracker> m11860g() {
        List<VastTracker> arrayList = new ArrayList();
        Node firstMatchingChildNode = XmlUtils.getFirstMatchingChildNode(this.f8265a, "TrackingEvents");
        if (firstMatchingChildNode == null) {
            return arrayList;
        }
        for (Node firstMatchingChildNode2 : XmlUtils.getMatchingChildNodes(firstMatchingChildNode2, "Tracking", "event", Collections.singletonList("creativeView"))) {
            arrayList.add(new VastTracker(XmlUtils.getNodeValue(firstMatchingChildNode2)));
        }
        return arrayList;
    }

    /* renamed from: h */
    public boolean m11861h() {
        return (TextUtils.isEmpty(this.f8266b.a()) && TextUtils.isEmpty(this.f8266b.d()) && TextUtils.isEmpty(this.f8266b.c())) ? false : true;
    }
}
