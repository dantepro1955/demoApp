package com.p000;

import android.text.TextUtils;
import com.mopub.common.Preconditions;
import com.mopub.mobileads.VastExtensionParentXmlManager;
import com.mopub.mobileads.VastTracker;
import com.mopub.mobileads.util.XmlUtils;
import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.Node;

/* compiled from: VastBaseInLineWrapperXmlManager */
/* renamed from: bza */
public abstract class bza {
    /* renamed from: a */
    protected final Node f8264a;

    bza(Node node) {
        Preconditions.checkNotNull(node);
        this.f8264a = node;
    }

    /* renamed from: a */
    public List<VastTracker> m11849a() {
        List<Node> matchingChildNodes = XmlUtils.getMatchingChildNodes(this.f8264a, "Impression");
        List<VastTracker> arrayList = new ArrayList();
        for (Node nodeValue : matchingChildNodes) {
            Object nodeValue2 = XmlUtils.getNodeValue(nodeValue);
            if (!TextUtils.isEmpty(nodeValue2)) {
                arrayList.add(new VastTracker(nodeValue2));
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public List<VastTracker> m11850b() {
        List<VastTracker> arrayList = new ArrayList();
        List<Node> matchingChildNodes = XmlUtils.getMatchingChildNodes(this.f8264a, "Error");
        if (matchingChildNodes == null) {
            return arrayList;
        }
        for (Node nodeValue : matchingChildNodes) {
            Object nodeValue2 = XmlUtils.getNodeValue(nodeValue);
            if (!TextUtils.isEmpty(nodeValue2)) {
                arrayList.add(new VastTracker(nodeValue2, true));
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public List<bze> m11851c() {
        List<bze> arrayList = new ArrayList();
        Node firstMatchingChildNode = XmlUtils.getFirstMatchingChildNode(this.f8264a, "Creatives");
        if (firstMatchingChildNode == null) {
            return arrayList;
        }
        List<Node> matchingChildNodes = XmlUtils.getMatchingChildNodes(firstMatchingChildNode, "Creative");
        if (matchingChildNodes == null) {
            return arrayList;
        }
        for (Node firstMatchingChildNode2 : matchingChildNodes) {
            firstMatchingChildNode2 = XmlUtils.getFirstMatchingChildNode(firstMatchingChildNode2, "Linear");
            if (firstMatchingChildNode2 != null) {
                arrayList.add(new bze(firstMatchingChildNode2));
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public List<bzb> m11852d() {
        List<bzb> arrayList = new ArrayList();
        Node firstMatchingChildNode = XmlUtils.getFirstMatchingChildNode(this.f8264a, "Creatives");
        if (firstMatchingChildNode == null) {
            return arrayList;
        }
        List<Node> matchingChildNodes = XmlUtils.getMatchingChildNodes(firstMatchingChildNode, "Creative");
        if (matchingChildNodes == null) {
            return arrayList;
        }
        for (Node firstMatchingChildNode2 : matchingChildNodes) {
            firstMatchingChildNode2 = XmlUtils.getFirstMatchingChildNode(firstMatchingChildNode2, "CompanionAds");
            if (firstMatchingChildNode2 != null) {
                matchingChildNodes = XmlUtils.getMatchingChildNodes(firstMatchingChildNode2, "Companion");
                if (matchingChildNodes != null) {
                    for (Node firstMatchingChildNode22 : matchingChildNodes) {
                        arrayList.add(new bzb(firstMatchingChildNode22));
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public VastExtensionParentXmlManager m11853e() {
        Node firstMatchingChildNode = XmlUtils.getFirstMatchingChildNode(this.f8264a, "Extensions");
        if (firstMatchingChildNode == null) {
            return null;
        }
        return new VastExtensionParentXmlManager(firstMatchingChildNode);
    }
}
