package com.sept.android.lib.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.EditText;

public class KeyboardEventEditText extends EditText {
    /* renamed from: a */
    private C4433a f19472a;

    /* renamed from: com.sept.android.lib.widget.KeyboardEventEditText$a */
    public interface C4433a {
        /* renamed from: a */
        void mo4424a(KeyboardEventEditText keyboardEventEditText);
    }

    public KeyboardEventEditText(Context context) {
        super(context);
    }

    public KeyboardEventEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public KeyboardEventEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4 && this.f19472a != null) {
            this.f19472a.mo4424a(this);
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    public void setKeyboardEventEditTextListener(C4433a c4433a) {
        this.f19472a = c4433a;
    }
}
