package com.p000;

import android.util.AttributeSet;

/* renamed from: uw */
class uw {
    /* renamed from: a */
    static zd m34285a(AttributeSet attributeSet) {
        if (attributeSet == null) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue("http://schemas.applovin.com/android/1.0", "size");
        return attributeValue != null ? zd.m34946a(attributeValue) : null;
    }

    /* renamed from: b */
    static boolean m34286b(AttributeSet attributeSet) {
        return attributeSet != null && attributeSet.getAttributeBooleanValue("http://schemas.applovin.com/android/1.0", "loadAdOnCreate", false);
    }
}
