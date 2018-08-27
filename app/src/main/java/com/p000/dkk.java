package com.p000;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.webkit.MimeTypeMap;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.facebook.appevents.AppEventsConstants;
import com.ninegag.android.library.upload.BaseUploadSourceActivity;
import com.under9.android.lib.widget.KeyboardEventEditText;
import com.under9.android.lib.widget.KeyboardEventEditText.C4433a;
import com.under9.android.lib.widget.inlinecomposer.ComposerView;
import com.under9.android.lib.widget.inlinecomposer.activity.UploadSourceActivity;
import java.io.File;
import p000.ctx.C4597a;
import p000.dnb.C5000c;
import p000.dnb.C5004g;

/* compiled from: ComposerModule */
/* renamed from: dkk */
public class dkk extends dfy {
    /* renamed from: A */
    private dkl f16747A;
    /* renamed from: B */
    private C4433a f16748B;
    /* renamed from: C */
    private boolean f16749C;
    /* renamed from: D */
    private TextWatcher f16750D;
    /* renamed from: E */
    private OnClickListener f16751E;
    /* renamed from: a */
    private ProgressDialog f16752a;
    /* renamed from: b */
    private boolean f16753b;
    /* renamed from: c */
    private String f16754c;
    /* renamed from: d */
    private String f16755d;
    /* renamed from: e */
    private int f16756e;
    /* renamed from: f */
    private dkk$d f16757f;
    /* renamed from: g */
    private boolean f16758g;
    /* renamed from: h */
    private boolean f16759h;
    /* renamed from: i */
    protected Context f16760i;
    /* renamed from: j */
    protected String f16761j;
    /* renamed from: k */
    protected String f16762k;
    /* renamed from: l */
    protected String f16763l;
    /* renamed from: m */
    protected String f16764m;
    /* renamed from: n */
    protected ComposerView f16765n;
    /* renamed from: o */
    private Intent f16766o;
    /* renamed from: p */
    private dkk$b f16767p;
    /* renamed from: q */
    private dkk$a f16768q;
    /* renamed from: r */
    private dkk$c f16769r;
    /* renamed from: s */
    private boolean f16770s;
    /* renamed from: t */
    private boolean f16771t;
    /* renamed from: u */
    private dkk$e f16772u;
    /* renamed from: v */
    private Bundle f16773v;
    /* renamed from: w */
    private Fragment f16774w;
    /* renamed from: x */
    private boolean f16775x;
    /* renamed from: y */
    private boolean f16776y;
    /* renamed from: z */
    private dkm f16777z;

    public dkk(Context context) {
        this(context, null);
    }

    public dkk(Context context, Fragment fragment) {
        this.f16753b = true;
        this.f16759h = true;
        this.f16770s = false;
        this.f16771t = false;
        this.f16775x = false;
        this.f16750D = new dkk$2(this);
        this.f16751E = new dkk$5(this);
        this.f16760i = context;
        this.f16774w = fragment;
        m21034a(m21000B());
        ctx.a(context);
    }

    /* renamed from: t */
    public dkl m21061t() {
        if (this.f16747A == null) {
            this.f16747A = new dkl();
        }
        return this.f16747A;
    }

    /* renamed from: u */
    public dkm m21062u() {
        if (this.f16777z == null) {
            this.f16777z = new dkm();
        }
        return this.f16777z;
    }

    /* renamed from: v */
    public String m21063v() {
        return this.f16761j;
    }

    /* renamed from: g */
    protected boolean m21050g() {
        return this.f16775x;
    }

    /* renamed from: w */
    protected boolean m21064w() {
        return true;
    }

    /* renamed from: x */
    protected boolean m21065x() {
        return m21061t().f21901e;
    }

    /* renamed from: y */
    protected boolean m21066y() {
        return m21061t().f21902f;
    }

    /* renamed from: z */
    protected int m21067z() {
        return m21061t().f21907k;
    }

    /* renamed from: A */
    protected int m20999A() {
        return m21053j();
    }

    /* renamed from: B */
    protected dkk$b m21000B() {
        return new dkk$b(this);
    }

    /* renamed from: p */
    private View m20998p() {
        return this.f16765n == null ? null : this.f16765n.f19619n;
    }

    private ImageView ag() {
        return this.f16765n == null ? null : this.f16765n.f19617l;
    }

    private View ah() {
        return this.f16765n == null ? null : this.f16765n.f19623r;
    }

    /* renamed from: a */
    public void m21031a(CheckBox checkBox, TextView textView, View view, View view2) {
        if (checkBox != null) {
            checkBox.setChecked(false);
            if (textView != null) {
                textView.setOnClickListener(this.f16751E);
            }
        }
    }

    private void ai() {
        Object obj = (djg.a(this.f16760i) && m21055l()) ? 1 : null;
        if (obj != null && m21056m()) {
            ab();
        } else if (obj != null) {
            aw();
        } else if (m21056m()) {
            av();
        }
    }

    /* renamed from: a */
    public void m21029a(View view, View view2, View view3, View view4) {
        if (view != null) {
            view.setOnClickListener(new dkk$1(this));
        }
        if (view3 != null) {
            view3.setOnClickListener(new dkk$9(this));
        }
        if (view2 != null) {
            view2.setOnClickListener(new dkk$10(this));
        }
        OnClickListener dkk_11 = new dkk$11(this);
        if (view4 != null) {
            view4.setOnClickListener(dkk_11);
        }
        if (this.f16765n != null && this.f16765n.f19616k != null) {
            this.f16765n.f19616k.setOnClickListener(dkk_11);
        }
    }

    /* renamed from: a */
    public void m21030a(View view, ImageView imageView, ImageButton imageButton) {
        if (imageButton != null) {
            imageButton.setOnClickListener(new dkk$12(this));
        }
    }

    /* renamed from: a */
    private void m20977a(View view) {
        if (view != null) {
            view.setOnTouchListener(new dkk$13(this));
        }
    }

    /* renamed from: a */
    public void m21032a(EditText editText, TextView textView, View view, View view2) {
        if (editText != null) {
            editText.setOnFocusChangeListener(new dkk$14(this));
            if (!TextUtils.isEmpty(this.f16754c)) {
                editText.setText("" + this.f16754c);
            }
        }
        if (textView != null) {
            textView.setText("" + this.f16756e);
        }
        if (view != null) {
            view.setOnClickListener(new dkk$15(this, editText));
        }
        m21002D();
        ak();
    }

    private void aj() {
        View N = m21012N();
        if (N != null) {
            String L = m21010L();
            if ((L == null || L.length() <= 0) && !m21019U()) {
                N.setEnabled(false);
            } else {
                N.setEnabled(true);
            }
        }
    }

    private void ak() {
        KeyboardEventEditText keyboardEventEditText = (KeyboardEventEditText) m21011M();
        this.f16748B = new dkk$16(this);
        if (keyboardEventEditText != null) {
            keyboardEventEditText.setKeyboardEventEditTextListener(this.f16748B);
        }
    }

    private View al() {
        return this.f16765n == null ? null : this.f16765n.f19620o;
    }

    /* renamed from: C */
    public void m21001C() {
        if (m21050g()) {
            Log.d("ComposerModule", "showInlineActionBar()");
        }
        if (m21064w()) {
            if (al() != null) {
                m20989e(true);
                al().setVisibility(0);
                aq();
                m20985c(true);
                if (this.f16772u != null) {
                    this.f16772u.a();
                }
            }
            m21037a(true);
            return;
        }
        ac();
        m21002D();
    }

    /* renamed from: D */
    public void m21002D() {
        if (m21050g()) {
            Log.d("ComposerModule", "hideInlineActionBar()");
        }
        if (al() != null) {
            m20989e(false);
            m20985c(false);
            al().setVisibility(8);
            aq();
            if (this.f16772u != null) {
                this.f16772u.b();
            }
        }
        if (m21061t().f21904h) {
            m21037a(false);
        }
        ar();
    }

    /* renamed from: c */
    private void m20985c(boolean z) {
        if (m20998p() != null) {
            if (!z || TextUtils.isEmpty(this.f16762k)) {
                m20998p().setVisibility(8);
            } else {
                m20998p().setVisibility(0);
            }
            m20987d(z);
        }
    }

    /* renamed from: d */
    private void m20987d(boolean z) {
        String str = m21061t().f21910n;
        if (z && !TextUtils.isEmpty(m21061t().f21909m)) {
            str = m21061t().f21909m;
        }
        if (TextUtils.isEmpty(m21010L())) {
            m20982b(str);
        } else {
            m20982b("");
        }
    }

    /* renamed from: e */
    private void m20989e(boolean z) {
        this.f16759h = z;
    }

    /* renamed from: b */
    private void m20982b(String str) {
        if (m21011M() != null && str != null) {
            m21011M().setHint(str);
        }
    }

    /* renamed from: E */
    public boolean m21003E() {
        return this.f16771t;
    }

    /* renamed from: a */
    public void m21035a(dkk$d dkk_d) {
        this.f16757f = dkk_d;
    }

    /* renamed from: F */
    public Bundle m21004F() {
        return this.f16773v == null ? new Bundle() : this.f16773v;
    }

    /* renamed from: c */
    public dkk m21042c(Bundle bundle) {
        this.f16773v = bundle;
        if (m21050g()) {
            for (String str : bundle.keySet()) {
                Log.d("ComposerModule", "setArguments() key=" + str + ", value=" + (bundle.get(str) == null ? null : bundle.get(str).toString()));
            }
        }
        return this;
    }

    /* renamed from: j */
    protected int m21053j() {
        return m21061t().f21908l;
    }

    /* renamed from: a */
    public void m21037a(boolean z) {
        if (this.f16765n != null) {
            this.f16765n.setVisibility(z ? 0 : 8);
            this.f16776y = z;
        }
        ar();
    }

    /* renamed from: G */
    public void m21005G() {
        m20991f(true);
    }

    /* renamed from: f */
    private void m20991f(boolean z) {
        if (m21061t().f21904h) {
            m21037a(false);
        }
        if (z) {
            m21008J();
        }
        m21002D();
        ar();
    }

    /* renamed from: a */
    public void m21033a(ComposerView composerView) {
        this.f16765n = composerView;
        if (composerView != null) {
            m21032a(composerView.f19609d, null, composerView.f19611f, composerView.f19620o);
            m21029a(null, composerView.f19613h, composerView.f19614i, composerView.f19615j);
            m21030a(composerView.f19619n, composerView.f19617l, composerView.f19618m);
            m21031a(composerView.f19621p, composerView.f19622q, composerView.f19623r, composerView.f19624s);
            m20977a(composerView.f19625t);
            m21007I();
        }
    }

    private boolean am() {
        return djg.a(this.f16760i) && (m21055l() || m21024Z());
    }

    private boolean an() {
        return m21056m();
    }

    /* renamed from: H */
    protected boolean m21006H() {
        return (this.f16765n == null || (this.f16765n.f19615j == null && this.f16765n.f19616k == null)) ? false : true;
    }

    /* renamed from: I */
    public void m21007I() {
        int i = 0;
        if (m21050g()) {
            Log.d("ComposerModule", "refreshUiConfig()");
        }
        if (this.f16765n != null) {
            View view;
            int i2;
            if (this.f16765n.f19612g != null) {
                view = this.f16765n.f19612g;
                i2 = (m21006H() || !(am() || an())) ? 8 : 0;
                view.setVisibility(i2);
            }
            if (this.f16765n.f19614i != null) {
                view = this.f16765n.f19614i;
                if (m21006H() || !an()) {
                    i2 = 8;
                } else {
                    i2 = 0;
                }
                view.setVisibility(i2);
            }
            if (this.f16765n.f19613h != null) {
                View view2 = this.f16765n.f19613h;
                if (m21006H() || !am()) {
                    i = 8;
                }
                view2.setVisibility(i);
            }
            ar();
            aq();
            aa();
            m20987d(this.f16771t);
            ao();
            aj();
        }
    }

    private void ao() {
        if (m21011M() != null && !this.f16749C) {
            m21011M().addTextChangedListener(this.f16750D);
            this.f16749C = true;
        }
    }

    private void ap() {
        if (m21011M() != null && this.f16749C) {
            m21011M().removeTextChangedListener(this.f16750D);
            this.f16749C = false;
        }
    }

    private void aq() {
        int i = 1;
        int i2 = 0;
        if (this.f16765n != null) {
            int i3 = (m21006H() && (am() || an())) ? 1 : 0;
            if (this.f16765n.f19615j != null) {
                int i4;
                View view = this.f16765n.f19615j;
                if (i3 != 0) {
                    i4 = 0;
                } else {
                    i4 = 8;
                }
                view.setVisibility(i4);
            }
            if (this.f16765n.f19616k != null) {
                if (this.f16765n.f19620o == null) {
                    i = i3;
                } else if (i3 == 0 || this.f16765n.f19620o.getVisibility() != 8) {
                    i = 0;
                }
                View view2 = this.f16765n.f19616k;
                if (i == 0) {
                    i2 = 8;
                }
                view2.setVisibility(i2);
            }
        }
    }

    private void ar() {
        int i = 0;
        if (this.f16765n != null && this.f16765n.f19625t != null) {
            int i2;
            if (m21061t().f21905i && this.f16765n.getVisibility() == 0 && this.f16765n.f19620o != null && this.f16765n.f19620o.getVisibility() == 0) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            View view = this.f16765n.f19625t;
            if (i2 == 0) {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    /* renamed from: b */
    public void m21040b(Bundle bundle) {
        if (this.f16753b) {
            m21061t().a(m21004F().getBoolean("allowAnonymous", true));
            m21061t().b(m21004F().getBoolean("allowCameraImage", true));
            m21061t().c(m21004F().getBoolean("allowGalleryImage", true));
        }
        if (bundle != null) {
            this.f16754c = bundle.getString("filledText");
            this.f16755d = bundle.getString("markAsSecret");
            this.f16762k = bundle.getString("mediaPath");
            this.f16763l = bundle.getString("mediaSourceMetaJson");
            this.f16764m = bundle.getString("mediaSourceMetaHash");
        } else {
            this.f16754c = m21004F().getString("prefill");
            this.f16755d = "";
            this.f16762k = "";
        }
        this.f16756e = m20999A();
        m21043c("onCreate");
    }

    /* renamed from: c */
    protected void m21043c(String str) {
        if (m21050g()) {
            Log.d("ComposerModule", "" + str + " isSubmitting=" + this.f16770s);
        }
        if (m21050g()) {
            Log.d("ComposerModule", "" + str + " text=" + (m21011M() == null ? "" : m21011M().getText()));
        }
        if (m21050g()) {
            Log.d("ComposerModule", "" + str + " allowAnonymous=" + m21054k());
        }
        if (m21050g()) {
            Log.d("ComposerModule", "" + str + " allowCameraImage=" + m21055l());
        }
        if (m21050g()) {
            Log.d("ComposerModule", "" + str + " allowGalleryImage=" + m21056m());
        }
        if (m21050g()) {
            Log.d("ComposerModule", "" + str + " mPrefillText=" + this.f16754c);
        }
        if (m21050g()) {
            Log.d("ComposerModule", "" + str + " mMarkAsSecret=" + this.f16755d);
        }
        if (m21050g()) {
            Log.d("ComposerModule", "" + str + " mMediaPath=" + this.f16762k);
        }
        if (m21050g()) {
            Log.d("ComposerModule", "" + str + " mMediaSourceMetaJson=" + this.f16763l);
        }
        if (m21050g()) {
            Log.d("ComposerModule", "" + str + " mMediaSourceMetaHash=" + this.f16764m);
        }
        if (m21050g()) {
            m21061t().b();
        }
    }

    /* renamed from: h */
    protected void m21051h() {
    }

    /* renamed from: i */
    protected void m21052i() {
    }

    public void s_() {
        super.s_();
        m21043c("onStart");
        m21051h();
        ao();
        m21046e(this.f16762k);
    }

    public void t_() {
        super.t_();
        m21052i();
        ap();
        this.f16755d = m21022X();
    }

    public void u_() {
        super.u_();
        m21008J();
    }

    public void w_() {
        super.w_();
        if (m21050g()) {
            Log.d("ComposerModule", "onResume()");
        }
        m21011M();
        if (m21009K()) {
            ad();
        }
        aa();
        m21045d(m21010L());
        at();
        aj();
    }

    /* renamed from: d */
    public void m21044d() {
        super.d();
        if (m21011M() != null) {
            ((KeyboardEventEditText) m21011M()).setKeyboardEventEditTextListener(null);
            if (m21050g()) {
                Log.d("ComposerModule", "onDestroy: ");
            }
        }
    }

    private void as() {
        if (m21050g()) {
            Log.d("ComposerModule", "showKeyboard()");
        }
        m21011M();
        if (m21009K()) {
            ad();
        }
    }

    /* renamed from: J */
    public void m21008J() {
        InputMethodManager inputMethodManager = (InputMethodManager) this.f16760i.getSystemService("input_method");
        EditText M = m21011M();
        if (M != null) {
            if (m21050g()) {
                Log.d("ComposerModule", "hideKeyboard() hideSoftInputFromWindow()");
            }
            inputMethodManager.hideSoftInputFromWindow(M.getWindowToken(), 0);
        }
    }

    /* renamed from: K */
    protected boolean m21009K() {
        return false;
    }

    private void at() {
        if (m21050g()) {
            Log.d("ComposerModule", "checkActivityResult() mMediaIntent=" + this.f16766o);
        }
        if (this.f16766o != null) {
            String stringExtra = this.f16766o.getStringExtra(BaseUploadSourceActivity.KEY_TMP_PATH);
            if (m21050g()) {
                Log.d("ComposerModule", "checkActivityResult() mediaPath=" + stringExtra);
            }
            m20983b(stringExtra, false);
            if (!TextUtils.isEmpty(stringExtra)) {
                ad();
            }
            this.f16766o = null;
        }
    }

    /* renamed from: a */
    protected void m21036a(String str, boolean z) {
        if (m21050g()) {
            Log.d("ComposerModule", "uploadMedia() mediaPath=" + str + ", isOrginalCopy=" + z);
        }
    }

    /* renamed from: b */
    private void m20983b(String str, boolean z) {
        if (str != null) {
            if (m21050g()) {
                Log.d("ComposerModule", "checkActivityResult() mScope=" + m21063v() + ", mediaPath=" + str + ", isOrginalCopy=" + z);
            }
            this.f16762k = str;
            this.f16763l = "";
            this.f16764m = "";
            m21036a(str, z);
            m21046e(str);
        }
        aj();
    }

    /* renamed from: a */
    public void m21026a(int i, int i2, Intent intent) {
        if (m21050g()) {
            Log.d("ComposerModule", "onActivityResult() requestCode=" + i);
        }
        super.a(i, i2, intent);
        if (m21050g()) {
            Log.d("ComposerModule", "onActivityResult() mScope=" + m21063v() + ", requestCode=" + i + ", resultCode=" + i2);
        }
        if (i != 30000) {
            return;
        }
        if (i2 == -1) {
            this.f16766o = intent;
            m21062u().f();
            if (this.f16767p != null) {
                this.f16767p.a(intent);
                return;
            }
            return;
        }
        m21062u().g();
        if (this.f16767p != null) {
            this.f16767p.a();
        }
        aE();
    }

    /* renamed from: a */
    public void m21028a(Bundle bundle) {
        super.a(bundle);
        if (m21050g()) {
            Log.d("ComposerModule", "onSaveInstanceState() mScope=" + m21063v() + ", filledText=" + m21010L());
        }
        if (m21050g()) {
            Log.d("ComposerModule", "onSaveInstanceState() mScope=" + m21063v() + ", markAsSecret=" + m21022X());
        }
        if (m21050g()) {
            Log.d("ComposerModule", "onSaveInstanceState() mScope=" + m21063v() + ", mediaPath=" + this.f16762k);
        }
        if (m21050g()) {
            Log.d("ComposerModule", "onSaveInstanceState() mScope=" + m21063v() + ", mediaSourceMetaJson=" + this.f16763l);
        }
        if (m21050g()) {
            Log.d("ComposerModule", "onSaveInstanceState() mScope=" + m21063v() + ", mediaSourceMetaHash=" + this.f16764m);
        }
        bundle.putString("filledText", m21010L());
        bundle.putString("markAsSecret", m21022X());
        if (TextUtils.isEmpty(this.f16763l) || TextUtils.isEmpty(this.f16764m)) {
            if (m21050g()) {
                Log.d("ComposerModule", "onSaveInstanceState() mScope=" + m21063v() + ", skip media as upload not done");
            }
            bundle.putString("mediaPath", "");
            bundle.putString("mediaSourceMetaJson", "");
            bundle.putString("mediaSourceMetaHash", "");
            return;
        }
        bundle.putString("mediaPath", this.f16762k);
        bundle.putString("mediaSourceMetaJson", this.f16763l);
        bundle.putString("mediaSourceMetaHash", this.f16764m);
    }

    private boolean au() {
        return "on".equals(this.f16755d);
    }

    /* renamed from: L */
    protected String m21010L() {
        try {
            EditText M = m21011M();
            if (M == null || M.getText() == null) {
                return "";
            }
            return M.getText().toString();
        } catch (Exception e) {
            return null;
        }
    }

    /* renamed from: e */
    protected void m21046e(String str) {
        if (m20998p() != null && ag() != null) {
            if (TextUtils.isEmpty(str)) {
                m20998p().setVisibility(8);
                return;
            }
            m20998p().setVisibility(0);
            ag().setImageURI(Uri.fromFile(new File(str)));
        }
    }

    /* renamed from: a */
    protected void m21027a(Intent intent, int i) {
        if (this.f16774w == null) {
            ((Activity) this.f16760i).startActivityForResult(intent, i);
        } else {
            this.f16774w.startActivityForResult(intent, i);
        }
    }

    private void av() {
        if (m21050g()) {
            Log.d("ComposerModule", "goPickFromGallery()");
        }
        Intent intent = new Intent(this.f16760i, UploadSourceActivity.class);
        intent.putExtra("source", BaseUploadSourceActivity.SOURCE_GALLERY);
        m21027a(intent, 30000);
    }

    private void aw() {
        if (m21050g()) {
            Log.d("ComposerModule", "goPickFromCapture()");
        }
        Intent intent = new Intent(this.f16760i, UploadSourceActivity.class);
        intent.putExtra("source", BaseUploadSourceActivity.SOURCE_CAPTURE);
        m21027a(intent, 30000);
    }

    private void ax() {
        if (m21050g()) {
            Log.d("ComposerModule", "goPickFromCustomCamera()");
        }
        Intent intent = new Intent(this.f16760i, UploadSourceActivity.class);
        Intent intent2 = m21061t().f21903g;
        if (intent2 != null) {
            intent.putExtra("source", BaseUploadSourceActivity.SOURCE_CAPTURE_CUSTOM_CAMERA);
            UploadSourceActivity.setCustomCameraIntent(intent2);
            m21027a(intent, 30000);
        }
    }

    private void ay() {
        if (m21050g()) {
            Log.d("ComposerModule", "goPickFromChooser()");
        }
        m21062u().a();
        if (!am() || an()) {
            az();
        } else {
            aw();
        }
    }

    private void az() {
        m21008J();
        C4597a c4597a = new C4597a();
        c4597a.a(am()).b(an()).c(m21024Z()).a(m21061t().a());
        ctx a = m21025a(c4597a);
        a.a(m21063v());
        a.a();
    }

    /* renamed from: a */
    protected ctx m21025a(C4597a c4597a) {
        return new ctx(this.f16760i, c4597a);
    }

    /* renamed from: M */
    protected EditText m21011M() {
        return this.f16765n == null ? null : this.f16765n.f19609d;
    }

    /* renamed from: N */
    protected TextView m21012N() {
        return this.f16765n == null ? null : this.f16765n.f19611f;
    }

    /* renamed from: d */
    protected void m21045d(String str) {
        boolean z = false;
        if (m21050g()) {
            Log.d("ComposerModule", "dispatchTextStatus() mScope=" + m21063v() + ", s=" + str);
        }
        int length = str == null ? 0 : str.length();
        int i = this.f16756e - length;
        if (i < 0) {
            z = true;
        }
        if (!(this.f16765n == null || this.f16765n.f19610e == null)) {
            if (z) {
                this.f16765n.f19610e.setTextColor(this.f16760i.getResources().getColor(C5000c.cs_meta_text_warning_color));
            } else {
                this.f16765n.f19610e.setTextColor(this.f16760i.getResources().getColor(C5000c.cs_meta_text_color));
            }
            this.f16765n.f19610e.setText("" + i);
        }
        if (this.f16757f != null) {
            this.f16757f.onTextCountChanged(i, z, length);
        }
        m20995h(str);
    }

    /* renamed from: h */
    private void m20995h(String str) {
        if (m21050g()) {
            Log.d("ComposerModule", "updatePlaceholderText() mHasFocus=" + this.f16771t + ", s=" + str);
        }
        if (TextUtils.isEmpty(str)) {
            m20987d(this.f16771t);
        } else {
            m20982b("");
        }
    }

    @dhg
    public void onRequestImageSourceGalleryEvent(dkp dkp) {
        av();
    }

    @dhg
    public void onRequestImageSourceCaptureEvent(dko dko) {
        aw();
    }

    /* renamed from: O */
    protected void m21013O() {
        if (m21050g()) {
            Log.d("ComposerModule", "checkPendingSubmit() mScope=" + m21063v() + ", mPendingSubmit=" + this.f16758g);
        }
        new Handler(Looper.getMainLooper()).post(new dkk$3(this));
    }

    /* renamed from: P */
    public void m21014P() {
        this.f16758g = true;
        this.f16770s = true;
        m21038a(true, "Uploading...");
    }

    /* renamed from: Q */
    public boolean m21015Q() {
        return this.f16758g;
    }

    /* renamed from: R */
    public boolean m21016R() {
        m21043c("post");
        EditText M = m21011M();
        if (M == null) {
            return false;
        }
        Editable text = M.getText();
        if (text != null) {
            if (text.length() == 0) {
                if (!m21065x()) {
                    Toast.makeText(this.f16760i, C5004g.empty_content_not_allowed, 1).show();
                    return false;
                } else if (!m21023Y() || TextUtils.isEmpty(this.f16762k)) {
                    if (m21050g()) {
                        Log.d("ComposerModule", "post() empty text while only text allow");
                    }
                    Toast.makeText(this.f16760i, C5004g.empty_content_not_allowed, 1).show();
                    return false;
                }
            } else if (text.length() < m21067z()) {
                Toast.makeText(this.f16760i, C5004g.error_message_post_title_min_char_limit, 1).show();
                return false;
            } else if (text.length() > m20999A()) {
                Toast.makeText(this.f16760i, C5004g.error_message_post_title_max_char_limit, 1).show();
                return false;
            } else if (TextUtils.isEmpty(this.f16762k) && !m21066y()) {
                Toast.makeText(this.f16760i, C5004g.error_message_photo_required, 1).show();
                return false;
            }
            if (m21018T()) {
                m21014P();
                if (!m21050g()) {
                    return false;
                }
                Log.d("ComposerModule", "post() mScope=" + m21063v() + ", embed media found not finished uploaded, pendingPost()");
                return false;
            }
            m21058o();
            if (m21017S()) {
                m21020V();
            }
            m21059q();
            af().dismiss();
            return true;
        } else if (!m21050g()) {
            return false;
        } else {
            Log.d("ComposerModule", "post() text not found");
            return false;
        }
    }

    /* renamed from: S */
    protected boolean m21017S() {
        return true;
    }

    /* renamed from: T */
    protected boolean m21018T() {
        if (TextUtils.isEmpty(this.f16762k) || (!TextUtils.isEmpty(this.f16763l) && !TextUtils.isEmpty(this.f16764m))) {
            return false;
        }
        return true;
    }

    /* renamed from: o */
    protected void m21058o() {
        if (m21050g()) {
            Log.d("ComposerModule", "processPostData()");
        }
    }

    /* renamed from: U */
    protected boolean m21019U() {
        if (m21050g()) {
            Log.d("ComposerModule", "isMediaExist() mScope=" + m21063v() + ", returned: " + this.f16762k);
        }
        if (this.f16766o != null) {
            this.f16762k = this.f16766o.getStringExtra(BaseUploadSourceActivity.KEY_TMP_PATH);
        }
        return !TextUtils.isEmpty(this.f16762k);
    }

    private void aA() {
        if (m21050g()) {
            Log.d("ComposerModule", "cancelMedia() mScope=" + m21063v());
        }
        this.f16762k = "";
        this.f16763l = "";
        this.f16764m = "";
        aj();
    }

    /* renamed from: V */
    protected void m21020V() {
        if (m21050g()) {
            Log.d("ComposerModule", "resetSubmitData() mScope=" + m21063v());
        }
        this.f16758g = false;
        if (m21011M() != null) {
            m21011M().setText("");
        }
        if (m21061t().f21913q) {
            ac();
        }
        m21021W();
        this.f16770s = false;
        aj();
        m21043c("resetSubmitData");
        m21002D();
        if (m21061t().f21912p) {
            m21008J();
        }
    }

    /* renamed from: W */
    protected void m21021W() {
        aA();
        m21046e(null);
    }

    private CheckBox aB() {
        return this.f16765n == null ? null : this.f16765n.f19621p;
    }

    /* renamed from: q */
    protected void m21059q() {
    }

    /* renamed from: X */
    protected String m21022X() {
        try {
            String str = (aB() == null || !aB().isChecked()) ? "" : "on";
            this.f16755d = str;
            return this.f16755d;
        } catch (Exception e) {
            return AppEventsConstants.EVENT_PARAM_VALUE_NO;
        }
    }

    /* renamed from: k */
    public boolean m21054k() {
        return m21061t().f21897a;
    }

    /* renamed from: n */
    public Boolean m21057n() {
        return null;
    }

    /* renamed from: Y */
    public boolean m21023Y() {
        return m21055l() || m21056m() || m21024Z();
    }

    /* renamed from: l */
    public boolean m21055l() {
        return m21061t().f21898b;
    }

    /* renamed from: Z */
    public boolean m21024Z() {
        return m21061t().f21899c;
    }

    /* renamed from: m */
    public boolean m21056m() {
        return m21061t().f21900d;
    }

    private TextView aC() {
        return this.f16765n == null ? null : this.f16765n.f19622q;
    }

    protected void aa() {
        if (m21050g()) {
            Log.d("ComposerModule", "showAnonymousOption() mScope=" + m21063v());
        }
        CheckBox aB = aB();
        if (aB != null) {
            TextView aC = aC();
            View ah = ah();
            if (ah != null && aC != null) {
                if (m21054k()) {
                    ah.setVisibility(0);
                    Boolean n = m21057n();
                    if (n == null) {
                        aB.setChecked(au());
                        aB.setEnabled(true);
                        if (VERSION.SDK_INT >= 14) {
                            aC.setAlpha(1.0f);
                            return;
                        }
                        return;
                    }
                    aB.setChecked(n.booleanValue());
                    aB.setEnabled(false);
                    if (VERSION.SDK_INT >= 14) {
                        aC.setAlpha(0.5f);
                        return;
                    }
                    return;
                }
                ah.setVisibility(8);
                aB.setChecked(false);
                aB.setEnabled(false);
            }
        }
    }

    /* renamed from: r */
    public void m21060r() {
    }

    protected void ab() {
        m21060r();
    }

    private boolean aD() {
        if (m21050g()) {
            Log.d("ComposerModule", "requestProceed()");
        }
        boolean w = m21064w();
        if (w) {
            return w;
        }
        ac();
        m21002D();
        return false;
    }

    /* renamed from: f */
    public boolean m21048f() {
        if (m21050g()) {
            Log.d("ComposerModule", "requestSwitchToInput()");
        }
        boolean w = m21064w();
        if (w) {
            m21001C();
            ad();
            return w;
        }
        ac();
        m21002D();
        return false;
    }

    public void ac() {
        if (m21011M() != null) {
            m21011M().clearFocus();
            if (this.f16765n != null && this.f16765n.f19626u != null) {
                this.f16765n.f19626u.requestFocus();
            }
        }
    }

    public void ad() {
        if (m21011M() != null) {
            m21011M().requestFocus();
            m21011M().postDelayed(new dkk$4(this), 200);
        }
    }

    /* renamed from: a */
    public void m21034a(dkk$b dkk_b) {
        this.f16767p = dkk_b;
    }

    public dkk$c ae() {
        return this.f16769r;
    }

    protected ProgressDialog af() {
        if (this.f16752a == null) {
            this.f16752a = ProgressDialog.show(this.f16760i, "", "", true);
        }
        return this.f16752a;
    }

    @dhg
    public void onSelectUploadFromGallery(cva cva) {
        if (m21050g()) {
            Log.d("ComposerModule", "onSelectUploadFromGallery()");
        }
        if (aD()) {
            av();
            m21062u().d();
        }
    }

    @dhg
    public void onSelectUploadFromGallery(cuy cuy) {
        if (m21050g()) {
            Log.d("ComposerModule", "onSelectUploadFromGallery()");
        }
        if (aD()) {
            ax();
            m21062u().c();
        }
    }

    @dhg
    public void onSelectUploadFromCapture(cux cux) {
        if (m21050g()) {
            Log.d("ComposerModule", "onSelectUploadFromCapture()");
        }
        if (aD()) {
            aw();
            m21062u().b();
        }
    }

    @dhg
    public void onSelectUploadFromDirect(cuz cuz) {
        if (m21050g()) {
            Log.d("ComposerModule", "onSelectUploadFromDirect()");
        }
        if (m21048f()) {
            if (m21050g()) {
                Log.d("ComposerModule", "onSelectUploadFromDirect() event.filePath=" + cuz.f20274a);
            }
            String str = "";
            if (MimeTypeMap.getFileExtensionFromUrl(cuz.f20274a).equals("gif")) {
                str = cuz.f20274a;
            } else {
                str = dkn.a(this.f16760i, cuz.f20274a);
            }
            if (m21050g()) {
                Log.d("ComposerModule", "onSelectUploadFromDirect() tmpPath=" + str);
            }
            m20983b(str, true);
            as();
            m21062u().e();
        }
    }

    @dhg
    public void onSelectUploadChooserCancelled(cuw cuw) {
        if (m21050g()) {
            Log.d("ComposerModule", "onSelectUploadChooserCancelled()");
        }
        aE();
    }

    @dhg
    public void onDialogPlusDismiss(cuv cuv) {
    }

    private void aE() {
        if (m21019U() || !TextUtils.isEmpty(m21010L())) {
            ad();
        } else {
            m21005G();
        }
    }

    private void aF() {
        m20993g(true);
    }

    /* renamed from: g */
    private void m20993g(boolean z) {
        if (!m21019U() && TextUtils.isEmpty(m21010L())) {
            m20991f(z);
        } else if (z) {
            m21008J();
        }
        ac();
    }

    /* renamed from: a */
    protected boolean m21039a(String str) {
        return (str == null || str.isEmpty()) ? false : true;
    }

    /* renamed from: f */
    public void m21047f(String str) {
        EditText M = m21011M();
        if (M != null && m21039a(str)) {
            M.setText(str);
            M.requestFocus();
            M.postDelayed(new dkk$6(this, M), 200);
        }
    }

    /* renamed from: g */
    public void m21049g(String str) {
        if (!TextUtils.isEmpty(str)) {
            new Handler(Looper.getMainLooper()).post(new dkk$7(this, str));
        }
    }

    /* renamed from: b */
    public void m21041b(boolean z) {
        m21038a(z, "");
    }

    /* renamed from: a */
    public void m21038a(boolean z, String str) {
        new Handler(Looper.getMainLooper()).post(new dkk$8(this, z, str));
    }
}
