package com.p000;

import com.mopub.common.Preconditions;
import com.mopub.mobileads.util.XmlUtils;
import org.w3c.dom.Node;

/* compiled from: VastAdXmlManager */
/* renamed from: byz */
public class byz {
    /* renamed from: a */
    private final Node f8254a;

    byz(Node node) {
        Preconditions.checkNotNull(node);
        this.f8254a = node;
    }

    /* renamed from: a */
    public bzd m11840a() {
        Node firstMatchingChildNode = XmlUtils.getFirstMatchingChildNode(this.f8254a, "InLine");
        if (firstMatchingChildNode != null) {
            return new bzd(firstMatchingChildNode);
        }
        return null;
    }

    /* renamed from: b */
    public bzj m11841b() {
        Node firstMatchingChildNode = XmlUtils.getFirstMatchingChildNode(this.f8254a, "Wrapper");
        if (firstMatchingChildNode != null) {
            return new bzj(firstMatchingChildNode);
        }
        return null;
    }

    /* renamed from: c */
    public String m11842c() {
        return XmlUtils.getAttributeValue(this.f8254a, "sequence");
    }
}
