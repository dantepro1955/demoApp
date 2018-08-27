package com.p000;

import android.os.Bundle;
import com.facebook.AccessToken;
import com.ninegag.android.app.component.postlist2.GagPostListFragmentV2;

/* compiled from: GagPostListBuilder */
/* renamed from: cfs */
public class cfs {
    /* renamed from: a */
    private String f9086a;
    /* renamed from: b */
    private String f9087b;
    /* renamed from: c */
    private String f9088c;
    /* renamed from: d */
    private String f9089d;
    /* renamed from: e */
    private String f9090e;
    /* renamed from: f */
    private String f9091f;
    /* renamed from: g */
    private int f9092g = -1;

    private cfs() {
    }

    /* renamed from: a */
    public static cfs m13001a() {
        return new cfs();
    }

    /* renamed from: a */
    public cfs m13003a(String str) {
        this.f9086a = str;
        return this;
    }

    /* renamed from: b */
    public cfs m13004b(String str) {
        this.f9087b = str;
        return this;
    }

    /* renamed from: c */
    public cfs m13006c(String str) {
        this.f9088c = str;
        return this;
    }

    /* renamed from: d */
    public cfs m13007d(String str) {
        this.f9089d = str;
        return this;
    }

    /* renamed from: e */
    public cfs m13008e(String str) {
        this.f9091f = str;
        return this;
    }

    /* renamed from: a */
    public cfs m13002a(int i) {
        this.f9092g = i;
        return this;
    }

    /* renamed from: b */
    public GagPostListFragmentV2 m13005b() {
        GagPostListFragmentV2 gagPostListFragmentV2 = new GagPostListFragmentV2();
        Bundle bundle = new Bundle();
        bundle.putString("group_id", this.f9087b);
        bundle.putString("list_type", this.f9086a);
        bundle.putString("section_name", this.f9088c);
        bundle.putString("type", this.f9089d);
        bundle.putString(AccessToken.USER_ID_KEY, this.f9090e);
        bundle.putString("search_key", this.f9091f);
        if (this.f9092g >= 0) {
            bundle.putInt("empty_space_adapter_height", this.f9092g);
        }
        gagPostListFragmentV2.setArguments(bundle);
        return gagPostListFragmentV2;
    }
}
