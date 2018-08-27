package com.p000;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: FragmentController */
/* renamed from: dn */
public class dn {
    /* renamed from: a */
    private final C5020do<?> f22292a;

    /* renamed from: a */
    public static final dn m28139a(C5020do<?> c5020do) {
        return new dn(c5020do);
    }

    private dn(C5020do<?> c5020do) {
        this.f22292a = c5020do;
    }

    /* renamed from: a */
    public FragmentManager m28141a() {
        return this.f22292a.m28358k();
    }

    /* renamed from: b */
    public dw m28152b() {
        return this.f22292a.m28359l();
    }

    /* renamed from: a */
    public Fragment m28140a(String str) {
        return this.f22292a.f22374d.findFragmentByWho(str);
    }

    /* renamed from: a */
    public void m28145a(Fragment fragment) {
        this.f22292a.f22374d.attachController(this.f22292a, this.f22292a, fragment);
    }

    /* renamed from: a */
    public View m28142a(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f22292a.f22374d.onCreateView(view, str, context, attributeSet);
    }

    /* renamed from: c */
    public void m28156c() {
        this.f22292a.f22374d.noteStateNotSaved();
    }

    /* renamed from: d */
    public Parcelable m28158d() {
        return this.f22292a.f22374d.saveAllState();
    }

    /* renamed from: a */
    public void m28144a(Parcelable parcelable, dp dpVar) {
        this.f22292a.f22374d.restoreAllState(parcelable, dpVar);
    }

    /* renamed from: e */
    public dp m28159e() {
        return this.f22292a.f22374d.retainNonConfig();
    }

    /* renamed from: f */
    public void m28160f() {
        this.f22292a.f22374d.dispatchCreate();
    }

    /* renamed from: g */
    public void m28161g() {
        this.f22292a.f22374d.dispatchActivityCreated();
    }

    /* renamed from: h */
    public void m28162h() {
        this.f22292a.f22374d.dispatchStart();
    }

    /* renamed from: i */
    public void m28163i() {
        this.f22292a.f22374d.dispatchResume();
    }

    /* renamed from: j */
    public void m28164j() {
        this.f22292a.f22374d.dispatchPause();
    }

    /* renamed from: k */
    public void m28165k() {
        this.f22292a.f22374d.dispatchStop();
    }

    /* renamed from: l */
    public void m28166l() {
        this.f22292a.f22374d.dispatchReallyStop();
    }

    /* renamed from: m */
    public void m28167m() {
        this.f22292a.f22374d.dispatchDestroy();
    }

    /* renamed from: a */
    public void m28148a(boolean z) {
        this.f22292a.f22374d.dispatchMultiWindowModeChanged(z);
    }

    /* renamed from: b */
    public void m28154b(boolean z) {
        this.f22292a.f22374d.dispatchPictureInPictureModeChanged(z);
    }

    /* renamed from: a */
    public void m28143a(Configuration configuration) {
        this.f22292a.f22374d.dispatchConfigurationChanged(configuration);
    }

    /* renamed from: n */
    public void m28168n() {
        this.f22292a.f22374d.dispatchLowMemory();
    }

    /* renamed from: a */
    public boolean m28150a(Menu menu, MenuInflater menuInflater) {
        return this.f22292a.f22374d.dispatchCreateOptionsMenu(menu, menuInflater);
    }

    /* renamed from: a */
    public boolean m28149a(Menu menu) {
        return this.f22292a.f22374d.dispatchPrepareOptionsMenu(menu);
    }

    /* renamed from: a */
    public boolean m28151a(MenuItem menuItem) {
        return this.f22292a.f22374d.dispatchOptionsItemSelected(menuItem);
    }

    /* renamed from: b */
    public boolean m28155b(MenuItem menuItem) {
        return this.f22292a.f22374d.dispatchContextItemSelected(menuItem);
    }

    /* renamed from: b */
    public void m28153b(Menu menu) {
        this.f22292a.f22374d.dispatchOptionsMenuClosed(menu);
    }

    /* renamed from: o */
    public boolean m28169o() {
        return this.f22292a.f22374d.execPendingActions();
    }

    /* renamed from: p */
    public void m28170p() {
        this.f22292a.m28361n();
    }

    /* renamed from: c */
    public void m28157c(boolean z) {
        this.f22292a.m28343a(z);
    }

    /* renamed from: q */
    public void m28171q() {
        this.f22292a.m28362o();
    }

    /* renamed from: r */
    public void m28172r() {
        this.f22292a.m28363p();
    }

    /* renamed from: s */
    public hr<String, dw> m28173s() {
        return this.f22292a.m28364q();
    }

    /* renamed from: a */
    public void m28146a(hr<String, dw> hrVar) {
        this.f22292a.m28341a((hr) hrVar);
    }

    /* renamed from: a */
    public void m28147a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f22292a.m28350b(str, fileDescriptor, printWriter, strArr);
    }
}
