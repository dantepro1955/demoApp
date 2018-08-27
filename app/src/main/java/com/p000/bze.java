package com.p000;

import com.mopub.common.Preconditions;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.Strings;
import com.mopub.mobileads.VastAbsoluteProgressTracker;
import com.mopub.mobileads.VastFractionalProgressTracker;
import com.mopub.mobileads.VastIconXmlManager;
import com.mopub.mobileads.VastTracker;
import com.mopub.mobileads.util.XmlUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.w3c.dom.Node;

/* compiled from: VastLinearXmlManager */
/* renamed from: bze */
public class bze {
    public static final String ICON = "Icon";
    public static final String ICONS = "Icons";
    /* renamed from: a */
    private final Node f8278a;

    bze(Node node) {
        Preconditions.checkNotNull(node);
        this.f8278a = node;
    }

    /* renamed from: a */
    public List<VastFractionalProgressTracker> m11873a() {
        List<VastFractionalProgressTracker> arrayList = new ArrayList();
        m11871a(arrayList, m11872b("firstQuartile"), 0.25f);
        m11871a(arrayList, m11872b("midpoint"), 0.5f);
        m11871a(arrayList, m11872b("thirdQuartile"), 0.75f);
        Node firstMatchingChildNode = XmlUtils.getFirstMatchingChildNode(this.f8278a, "TrackingEvents");
        if (firstMatchingChildNode != null) {
            for (Node firstMatchingChildNode2 : XmlUtils.getMatchingChildNodes(firstMatchingChildNode2, "Tracking", "event", Collections.singletonList("progress"))) {
                String attributeValue = XmlUtils.getAttributeValue(firstMatchingChildNode2, VastIconXmlManager.OFFSET);
                if (attributeValue != null) {
                    attributeValue = attributeValue.trim();
                    if (Strings.isPercentageTracker(attributeValue)) {
                        String nodeValue = XmlUtils.getNodeValue(firstMatchingChildNode2);
                        try {
                            float parseFloat = Float.parseFloat(attributeValue.replace("%", "")) / 100.0f;
                            if (parseFloat >= 0.0f) {
                                arrayList.add(new VastFractionalProgressTracker(nodeValue, parseFloat));
                            }
                        } catch (NumberFormatException e) {
                            MoPubLog.d(String.format("Failed to parse VAST progress tracker %s", new Object[]{attributeValue}));
                        }
                    }
                }
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: b */
    public List<VastAbsoluteProgressTracker> m11874b() {
        String nodeValue;
        List<VastAbsoluteProgressTracker> arrayList = new ArrayList();
        for (String nodeValue2 : m11872b("start")) {
            arrayList.add(new VastAbsoluteProgressTracker(nodeValue2, 0));
        }
        Node firstMatchingChildNode = XmlUtils.getFirstMatchingChildNode(this.f8278a, "TrackingEvents");
        if (firstMatchingChildNode != null) {
            for (Node node : XmlUtils.getMatchingChildNodes(firstMatchingChildNode, "Tracking", "event", Collections.singletonList("progress"))) {
                String attributeValue = XmlUtils.getAttributeValue(node, VastIconXmlManager.OFFSET);
                if (attributeValue != null) {
                    attributeValue = attributeValue.trim();
                    if (Strings.isAbsoluteTracker(attributeValue)) {
                        nodeValue2 = XmlUtils.getNodeValue(node);
                        try {
                            Integer parseAbsoluteOffset = Strings.parseAbsoluteOffset(attributeValue);
                            if (parseAbsoluteOffset != null && parseAbsoluteOffset.intValue() >= 0) {
                                arrayList.add(new VastAbsoluteProgressTracker(nodeValue2, parseAbsoluteOffset.intValue()));
                            }
                        } catch (NumberFormatException e) {
                            MoPubLog.d(String.format("Failed to parse VAST progress tracker %s", new Object[]{attributeValue}));
                        }
                    }
                }
            }
            for (Node node2 : XmlUtils.getMatchingChildNodes(firstMatchingChildNode, "Tracking", "event", Collections.singletonList("creativeView"))) {
                nodeValue2 = XmlUtils.getNodeValue(node2);
                if (nodeValue2 != null) {
                    arrayList.add(new VastAbsoluteProgressTracker(nodeValue2, 0));
                }
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: c */
    public List<VastTracker> m11875c() {
        return m11870a("complete");
    }

    /* renamed from: d */
    public List<VastTracker> m11876d() {
        List<String> b = m11872b("pause");
        List<VastTracker> arrayList = new ArrayList();
        for (String vastTracker : b) {
            arrayList.add(new VastTracker(vastTracker, true));
        }
        return arrayList;
    }

    /* renamed from: e */
    public List<VastTracker> m11877e() {
        List<String> b = m11872b("resume");
        List<VastTracker> arrayList = new ArrayList();
        for (String vastTracker : b) {
            arrayList.add(new VastTracker(vastTracker, true));
        }
        return arrayList;
    }

    /* renamed from: f */
    public List<VastTracker> m11878f() {
        List<VastTracker> a = m11870a("close");
        a.addAll(m11870a("closeLinear"));
        return a;
    }

    /* renamed from: g */
    public List<VastTracker> m11879g() {
        return m11870a("skip");
    }

    /* renamed from: h */
    public String m11880h() {
        Node firstMatchingChildNode = XmlUtils.getFirstMatchingChildNode(this.f8278a, "VideoClicks");
        if (firstMatchingChildNode == null) {
            return null;
        }
        return XmlUtils.getNodeValue(XmlUtils.getFirstMatchingChildNode(firstMatchingChildNode, "ClickThrough"));
    }

    /* renamed from: i */
    public List<VastTracker> m11881i() {
        List<VastTracker> arrayList = new ArrayList();
        Node firstMatchingChildNode = XmlUtils.getFirstMatchingChildNode(this.f8278a, "VideoClicks");
        if (firstMatchingChildNode == null) {
            return arrayList;
        }
        for (Node firstMatchingChildNode2 : XmlUtils.getMatchingChildNodes(firstMatchingChildNode2, "ClickTracking")) {
            String nodeValue = XmlUtils.getNodeValue(firstMatchingChildNode2);
            if (nodeValue != null) {
                arrayList.add(new VastTracker(nodeValue));
            }
        }
        return arrayList;
    }

    /* renamed from: j */
    public String m11882j() {
        String attributeValue = XmlUtils.getAttributeValue(this.f8278a, "skipoffset");
        if (attributeValue == null || attributeValue.trim().isEmpty()) {
            return null;
        }
        return attributeValue.trim();
    }

    /* renamed from: k */
    public List<bzg> m11883k() {
        List<bzg> arrayList = new ArrayList();
        Node firstMatchingChildNode = XmlUtils.getFirstMatchingChildNode(this.f8278a, "MediaFiles");
        if (firstMatchingChildNode == null) {
            return arrayList;
        }
        for (Node firstMatchingChildNode2 : XmlUtils.getMatchingChildNodes(firstMatchingChildNode2, "MediaFile")) {
            arrayList.add(new bzg(firstMatchingChildNode2));
        }
        return arrayList;
    }

    /* renamed from: l */
    public List<VastIconXmlManager> m11884l() {
        List<VastIconXmlManager> arrayList = new ArrayList();
        Node firstMatchingChildNode = XmlUtils.getFirstMatchingChildNode(this.f8278a, ICONS);
        if (firstMatchingChildNode == null) {
            return arrayList;
        }
        for (Node firstMatchingChildNode2 : XmlUtils.getMatchingChildNodes(firstMatchingChildNode2, ICON)) {
            arrayList.add(new VastIconXmlManager(firstMatchingChildNode2));
        }
        return arrayList;
    }

    /* renamed from: a */
    private List<VastTracker> m11870a(String str) {
        List<String> b = m11872b(str);
        List<VastTracker> arrayList = new ArrayList(b.size());
        for (String vastTracker : b) {
            arrayList.add(new VastTracker(vastTracker));
        }
        return arrayList;
    }

    /* renamed from: b */
    private List<String> m11872b(String str) {
        Preconditions.checkNotNull(str);
        List<String> arrayList = new ArrayList();
        Node firstMatchingChildNode = XmlUtils.getFirstMatchingChildNode(this.f8278a, "TrackingEvents");
        if (firstMatchingChildNode == null) {
            return arrayList;
        }
        for (Node firstMatchingChildNode2 : XmlUtils.getMatchingChildNodes(firstMatchingChildNode2, "Tracking", "event", Collections.singletonList(str))) {
            String nodeValue = XmlUtils.getNodeValue(firstMatchingChildNode2);
            if (nodeValue != null) {
                arrayList.add(nodeValue);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private void m11871a(List<VastFractionalProgressTracker> list, List<String> list2, float f) {
        Preconditions.checkNotNull(list, "trackers cannot be null");
        Preconditions.checkNotNull(list2, "urls cannot be null");
        for (String vastFractionalProgressTracker : list2) {
            list.add(new VastFractionalProgressTracker(vastFractionalProgressTracker, f));
        }
    }
}
