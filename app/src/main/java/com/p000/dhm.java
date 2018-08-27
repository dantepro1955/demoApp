package com.p000;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.Fragment;
import com.facebook.stetho.server.http.HttpStatus;
import com.under9.android.lib.pickimage.otto.ImagePickedEvent;
import com.under9.android.lib.pickimage.otto.RequestImagePickEvent;

/* compiled from: PickImageController */
/* renamed from: dhm */
public class dhm extends dfx {
    /* renamed from: a */
    Activity f16745a;
    /* renamed from: b */
    Fragment f16746b;

    /* renamed from: a */
    public void m20974a(Fragment fragment) {
        this.f16746b = fragment;
    }

    /* renamed from: a */
    public void m20973a(int i, int i2, Intent intent) {
        if (i2 == -1 && i == 51000) {
            m20971a(intent);
        }
    }

    public void s_() {
        super.s_();
        dhe.a(this);
    }

    public void t_() {
        super.t_();
        dhe.b(this);
    }

    /* renamed from: f */
    public void m20975f() {
        Intent intent = new Intent("android.intent.action.PICK");
        intent.setType("image/*");
        if (this.f16746b != null) {
            this.f16746b.startActivityForResult(Intent.createChooser(intent, m20976g()), 51000);
        } else if (this.f16745a != null) {
            this.f16745a.startActivityForResult(Intent.createChooser(intent, m20976g()), 51000);
        }
    }

    /* renamed from: a */
    private void m20971a(Intent intent) {
        m20972a(intent.getData());
    }

    /* renamed from: a */
    private void m20972a(Uri uri) {
        if (uri != null) {
            String a = dhn.a(this.f16746b != null ? this.f16746b.getActivity() : this.f16745a, uri);
            dhe.a().c(new ImagePickedEvent(a, dja.a(a, HttpStatus.HTTP_OK), null));
        }
    }

    /* renamed from: g */
    protected String m20976g() {
        return "Choose image";
    }

    @dhg
    public void onRequestImagePick(RequestImagePickEvent requestImagePickEvent) {
        m20975f();
    }
}
