package com.p000;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import p000.dtp.C5092a;

/* compiled from: TextViewTextChangeEventOnSubscribe */
/* renamed from: bwq */
final class bwq implements C5092a<bwp> {
    /* renamed from: a */
    final TextView f8021a;

    public /* synthetic */ void call(Object obj) {
        m11552a((dtv) obj);
    }

    bwq(TextView textView) {
        this.f8021a = textView;
    }

    /* renamed from: a */
    public void m11552a(final dtv<? super bwp> dtv) {
        dtx.b();
        final TextWatcher c15631 = new TextWatcher(this) {
            /* renamed from: b */
            final /* synthetic */ bwq f8018b;

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                if (!dtv.isUnsubscribed()) {
                    dtv.onNext(bwp.m11549a(this.f8018b.f8021a, charSequence, i, i2, i3));
                }
            }

            public void afterTextChanged(Editable editable) {
            }
        };
        dtv.add(new dtx(this) {
            /* renamed from: b */
            final /* synthetic */ bwq f8020b;

            /* renamed from: a */
            protected void m11551a() {
                this.f8020b.f8021a.removeTextChangedListener(c15631);
            }
        });
        this.f8021a.addTextChangedListener(c15631);
        dtv.onNext(bwp.m11549a(this.f8021a, this.f8021a.getText(), 0, 0, 0));
    }
}
