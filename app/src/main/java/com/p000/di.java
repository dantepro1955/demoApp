package com.p000;

import android.content.Intent;
import android.content.IntentSender;
import android.content.IntentSender.SendIntentException;
import android.os.Bundle;

/* compiled from: BaseFragmentActivityJB */
/* renamed from: di */
public abstract class di extends dh {
    protected boolean mStartedActivityFromFragment;

    protected di() {
    }

    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        if (!(this.mStartedActivityFromFragment || i == -1)) {
            dg.checkForValidRequestCode(i);
        }
        super.startActivityForResult(intent, i, bundle);
    }

    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws SendIntentException {
        if (!(this.mStartedIntentSenderFromFragment || i == -1)) {
            dg.checkForValidRequestCode(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}
