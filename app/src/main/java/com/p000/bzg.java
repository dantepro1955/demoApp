package com.p000;

import com.mopub.common.Preconditions;
import com.mopub.mobileads.util.XmlUtils;
import org.w3c.dom.Node;

/* compiled from: VastMediaXmlManager */
/* renamed from: bzg */
public class bzg {
    /* renamed from: a */
    private final Node f8280a;

    bzg(Node node) {
        Preconditions.checkNotNull(node, "mediaNode cannot be null");
        this.f8280a = node;
    }

    /* renamed from: a */
    public Integer m11885a() {
        return XmlUtils.getAttributeValueAsInt(this.f8280a, "width");
    }

    /* renamed from: b */
    public Integer m11886b() {
        return XmlUtils.getAttributeValueAsInt(this.f8280a, "height");
    }

    /* renamed from: c */
    public String m11887c() {
        return XmlUtils.getAttributeValue(this.f8280a, "type");
    }

    /* renamed from: d */
    public String m11888d() {
        return XmlUtils.getNodeValue(this.f8280a);
    }
}
