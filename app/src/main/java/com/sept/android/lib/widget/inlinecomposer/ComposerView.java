package com.sept.android.lib.widget.inlinecomposer;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import p000.dnb.C5002e;
import p000.dnb.C5003f;
import p000.dnb.C5005h;

public class ComposerView extends LinearLayout {
    /* renamed from: a */
    int f19606a;
    /* renamed from: b */
    boolean f19607b;
    /* renamed from: c */
    boolean f19608c;
    /* renamed from: d */
    public EditText f19609d;
    /* renamed from: e */
    public TextView f19610e;
    /* renamed from: f */
    public TextView f19611f;
    /* renamed from: g */
    public View f19612g;
    /* renamed from: h */
    public View f19613h;
    /* renamed from: i */
    public View f19614i;
    /* renamed from: j */
    public View f19615j;
    /* renamed from: k */
    public View f19616k;
    /* renamed from: l */
    public ImageView f19617l;
    /* renamed from: m */
    public ImageButton f19618m;
    /* renamed from: n */
    public View f19619n;
    /* renamed from: o */
    public View f19620o;
    /* renamed from: p */
    public CheckBox f19621p;
    /* renamed from: q */
    public TextView f19622q;
    /* renamed from: r */
    public View f19623r;
    /* renamed from: s */
    public View f19624s;
    /* renamed from: t */
    public View f19625t;
    /* renamed from: u */
    public View f19626u;
    /* renamed from: v */
    private OnClickListener f19627v = new C44551(this);

    /* renamed from: com.sept.android.lib.widget.inlinecomposer.ComposerView$1 */
    class C44551 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ ComposerView f19605a;

        C44551(ComposerView composerView) {
            this.f19605a = composerView;
        }

        public void onClick(View view) {
            CheckBox checkBox = (CheckBox) this.f19605a.findViewById(C5002e.markAsSecertCheckbox);
            if (checkBox.isEnabled()) {
                checkBox.setChecked(!checkBox.isChecked());
            }
        }
    }

    public ComposerView(Context context) {
        super(context);
        m23949a(context, null);
    }

    public ComposerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m23949a(context, attributeSet);
    }

    public ComposerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m23949a(context, attributeSet);
    }

    /* renamed from: a */
    public View m23951a() {
        LayoutInflater.from(getContext()).inflate(this.f19606a, this);
        m23950b();
        this.f19608c = true;
        return this;
    }

    public void setLayoutResId(int i) {
        this.f19606a = i;
    }

    public void setVisibility(int i) {
        if (this.f19607b) {
            super.setVisibility(i);
            if (!this.f19608c) {
                if (i == 0 || i == 4) {
                    m23951a();
                    return;
                }
                return;
            }
            return;
        }
        super.setVisibility(i);
    }

    /* renamed from: b */
    private void m23950b() {
        this.f19609d = (EditText) findViewById(C5002e.input_container_hits_box);
        this.f19611f = (TextView) findViewById(C5002e.inline_input_submit);
        this.f19620o = findViewById(C5002e.inline_action_bar);
        this.f19613h = findViewById(C5002e.addMediaFromCapture);
        this.f19614i = findViewById(C5002e.addMediaFromAlbum);
        this.f19615j = findViewById(C5002e.addMediaFromChooser);
        this.f19616k = findViewById(C5002e.addMediaFromChooserAlias);
        this.f19619n = findViewById(C5002e.image_container);
        this.f19617l = (ImageView) findViewById(C5002e.image);
        this.f19618m = (ImageButton) findViewById(C5002e.btn_remove_image);
        this.f19621p = (CheckBox) findViewById(C5002e.markAsSecertCheckbox);
        if (this.f19621p != null) {
            this.f19621p.setChecked(false);
        }
        this.f19622q = (TextView) findViewById(C5002e.markAsSecertLabel);
        if (this.f19622q != null) {
            this.f19622q.setOnClickListener(this.f19627v);
        }
        this.f19623r = findViewById(C5002e.anonymous_container);
        this.f19624s = findViewById(C5002e.inline_anonymous_container);
        this.f19625t = findViewById(C5002e.input_overlay_dismiss);
        this.f19626u = findViewById(C5002e.input_focus_holder);
    }

    /* renamed from: a */
    private void m23949a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5005h.ComposerView);
        this.f19607b = obtainStyledAttributes.getBoolean(C5005h.ComposerView_lazyInflatable, false);
        this.f19606a = obtainStyledAttributes.getResourceId(C5005h.ComposerView_overriddingLayout, C5003f.inline_composer_editor);
        obtainStyledAttributes.recycle();
        if (this.f19607b) {
            setVisibility(8);
            setWillNotDraw(true);
            return;
        }
        LayoutInflater.from(context).inflate(this.f19606a, this);
        m23950b();
        this.f19608c = true;
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }
}
