package com.p000;

import com.mopub.common.Preconditions;
import com.mopub.mobileads.util.XmlUtils;
import org.w3c.dom.Node;

/* compiled from: VastWrapperXmlManager */
/* renamed from: bzj */
public class bzj extends bza {
    bzj(Node node) {
        super(node);
        Preconditions.checkNotNull(node);
    }

    /* renamed from: f */
    public String m11897f() {
        return XmlUtils.getNodeValue(XmlUtils.getFirstMatchingChildNode(this.a, "VASTAdTagURI"));
    }
}
