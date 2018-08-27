package com.p000;

import com.ninegag.android.library.upload.model.MediaMeta;
import p000.cuk.C4159a;

/* compiled from: ImageValidator */
/* renamed from: cuo */
public class cuo extends cuk {
    public cuo(cul cul, C4159a c4159a) {
        super(cul, c4159a);
    }

    /* renamed from: b */
    public boolean mo4159b(MediaMeta mediaMeta) {
        cul b = m25021b();
        C4159a a = m25019a();
        if (mediaMeta.f18784g < b.mo4109e() || mediaMeta.f18785h < b.mo4108d()) {
            a.mo3852a(mediaMeta.f18784g, mediaMeta.f18785h, b);
            return false;
        } else if (mediaMeta.f18784g > b.mo4107c() || mediaMeta.f18785h > b.mo4106b()) {
            a.mo3854b(mediaMeta.f18784g, mediaMeta.f18785h, b);
            return false;
        } else {
            long j = (long) mediaMeta.f18784g;
            long j2 = (long) mediaMeta.f18785h;
            if (mediaMeta.f18784g > 1280) {
                j = 1280;
                j2 = (((long) mediaMeta.f18785h) * 1280) / ((long) mediaMeta.f18785h);
            }
            if ((j * j2) / ((long) b.mo4110f()) > ((long) b.mo4112h())) {
                a.mo3855c(mediaMeta.f18784g, mediaMeta.f18785h, b);
                return false;
            } else if (j2 * j <= ((long) b.mo4111g())) {
                return true;
            } else {
                a.mo3856d(mediaMeta.f18784g, mediaMeta.f18785h, b);
                return false;
            }
        }
    }
}
