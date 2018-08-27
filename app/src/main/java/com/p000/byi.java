package com.p000;

import android.media.MediaPlayer;
import android.view.View;
import android.webkit.WebView;
import com.facebook.stetho.server.http.HttpStatus;
import java.util.Map;
import p000.byj.C1599a;
import p000.byj.C1600b;

/* compiled from: NoOp */
/* renamed from: byi */
abstract class byi {

    /* compiled from: NoOp */
    /* renamed from: byi$a */
    public static class C1595a extends byb {
        /* renamed from: a */
        public byo mo1602a(WebView webView) {
            return new C1598d();
        }

        /* renamed from: a */
        public byg mo1601a(String str) {
            return new C1596b();
        }
    }

    /* compiled from: NoOp */
    /* renamed from: byi$b */
    static class C1596b implements byg {
        C1596b() {
        }

        /* renamed from: a */
        public void mo1612a(Map<String, Object> map) {
        }

        /* renamed from: a */
        public boolean mo1607a(Map<String, String> map, MediaPlayer mediaPlayer, View view) {
            return false;
        }
    }

    /* compiled from: NoOp */
    /* renamed from: byi$c */
    static class C1597c implements byj {
        C1597c() {
        }

        /* renamed from: a */
        public C1600b mo1613a() {
            return C1600b.OFF;
        }

        /* renamed from: b */
        public boolean mo1615b() {
            return false;
        }

        /* renamed from: a */
        public void mo1614a(C1599a c1599a) {
        }

        /* renamed from: c */
        public int mo1616c() {
            return HttpStatus.HTTP_OK;
        }
    }

    /* compiled from: NoOp */
    /* renamed from: byi$d */
    static class C1598d implements byo {
        C1598d() {
        }

        /* renamed from: a */
        public boolean mo1617a() {
            return false;
        }
    }
}
