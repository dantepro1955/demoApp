package com.sept.android.lib.widget.media.overlay;

import android.os.Bundle;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.C0370e;
import android.view.View;
import com.sept.android.lib.lifecycle.LifecycleHookActionBarActivity;
import com.sept.android.lib.widget.uiv.UniversalImageView;
import java.util.ArrayList;
import p000.dkq;
import p000.dkr;
import p000.dkw;
import p000.dle;
import p000.dnb.C5002e;
import p000.dnb.C5003f;

public class MultiImageOverlayBaseActivity extends LifecycleHookActionBarActivity {
    private static final long INVALIDATE_PERIOD_LONG = 2000;
    private static final long INVALIDATE_PERIOD_SHORT = 500;
    private static final String TAG = "MultiImageOverlayBaseActivity";
    protected dkq adapter;
    private dkr mEventController;
    private Handler mInvalidateHandler;
    private long mNextInvalidatePeriod = INVALIDATE_PERIOD_SHORT;
    protected int mPosition;
    protected ViewPager viewPager;

    /* renamed from: com.sept.android.lib.widget.media.overlay.MultiImageOverlayBaseActivity$1 */
    class C44561 implements C0370e {
        /* renamed from: a */
        final /* synthetic */ MultiImageOverlayBaseActivity f19628a;

        C44561(MultiImageOverlayBaseActivity multiImageOverlayBaseActivity) {
            this.f19628a = multiImageOverlayBaseActivity;
        }

        /* renamed from: a */
        public void m23953a(int i, float f, int i2) {
        }

        /* renamed from: b */
        public void m23954b(int i) {
            this.f19628a.onSelectedItem();
        }

        /* renamed from: a */
        public void m23952a(int i) {
        }
    }

    /* renamed from: com.sept.android.lib.widget.media.overlay.MultiImageOverlayBaseActivity$2 */
    class C44572 implements Callback {
        /* renamed from: a */
        final /* synthetic */ MultiImageOverlayBaseActivity f19629a;

        C44572(MultiImageOverlayBaseActivity multiImageOverlayBaseActivity) {
            this.f19629a = multiImageOverlayBaseActivity;
        }

        public boolean handleMessage(Message message) {
            if (this.f19629a.mNextInvalidatePeriod != -1) {
                if (this.f19629a.mNextInvalidatePeriod < MultiImageOverlayBaseActivity.INVALIDATE_PERIOD_LONG) {
                    this.f19629a.mNextInvalidatePeriod = this.f19629a.mNextInvalidatePeriod * 2;
                    if (this.f19629a.mNextInvalidatePeriod > MultiImageOverlayBaseActivity.INVALIDATE_PERIOD_LONG) {
                        this.f19629a.mNextInvalidatePeriod = MultiImageOverlayBaseActivity.INVALIDATE_PERIOD_LONG;
                    }
                }
                View findViewWithTag = this.f19629a.viewPager.findViewWithTag(this.f19629a.adapter.m27749a(this.f19629a.viewPager.getCurrentItem()));
                if (findViewWithTag != null) {
                    this.f19629a.adapter.m27750a(findViewWithTag);
                    if (this.f19629a.mInvalidateHandler != null) {
                        this.f19629a.mInvalidateHandler.sendEmptyMessageDelayed(0, this.f19629a.mNextInvalidatePeriod);
                    }
                }
            }
            return true;
        }
    }

    /* renamed from: com.sept.android.lib.widget.media.overlay.MultiImageOverlayBaseActivity$3 */
    class C44583 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ MultiImageOverlayBaseActivity f19630a;

        C44583(MultiImageOverlayBaseActivity multiImageOverlayBaseActivity) {
            this.f19630a = multiImageOverlayBaseActivity;
        }

        public void run() {
            View findViewWithTag = this.f19630a.viewPager.findViewWithTag(this.f19630a.adapter.m27749a(this.f19630a.viewPager.getCurrentItem()));
            if (findViewWithTag != null) {
                UniversalImageView universalImageView = (UniversalImageView) findViewWithTag.findViewById(C5002e.universalImageView);
                if (universalImageView != null) {
                    dle.m27811a();
                    universalImageView.m24155b();
                }
            }
        }
    }

    public ArrayList<dkw> getMediaWrappers() {
        return new ArrayList();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C5003f.activity_multi_image_overlay);
        this.mPosition = getIntent().getIntExtra("position", 0);
        ArrayList mediaWrappers = getMediaWrappers();
        this.viewPager = (ViewPager) findViewById(C5002e.pager);
        this.adapter = new dkq(this, mediaWrappers);
        this.viewPager.setAdapter(this.adapter);
        this.viewPager.setCurrentItem(this.mPosition);
        this.viewPager.setOnPageChangeListener(new C44561(this));
        this.mEventController = new dkr(this);
        addLifecycleHook(this.mEventController);
    }

    protected void logScreenInfo() {
    }

    private void onSelectedItem() {
        View findViewWithTag = this.viewPager.findViewWithTag(this.adapter.m27749a(this.viewPager.getCurrentItem()));
        if (findViewWithTag != null) {
            this.mNextInvalidatePeriod = INVALIDATE_PERIOD_SHORT;
            this.adapter.m27752b(findViewWithTag);
        }
    }

    public void onStart() {
        super.onStart();
        startInvalidateTimer();
        logScreenInfo();
        checkAutoPlay();
    }

    public void onStop() {
        super.onStop();
        stopInvalidateTimer();
        dle.m27811a();
    }

    protected void onResumeFragments() {
        super.onResumeFragments();
        onSelectedItem();
    }

    private void startInvalidateTimer() {
        if (this.mInvalidateHandler == null) {
            this.mInvalidateHandler = new Handler(new C44572(this));
        }
        this.mInvalidateHandler.sendEmptyMessageDelayed(0, this.mNextInvalidatePeriod);
    }

    private void checkAutoPlay() {
        if (this.viewPager != null) {
            this.viewPager.post(new C44583(this));
        }
    }

    private void stopInvalidateTimer() {
        this.mNextInvalidatePeriod = -1;
        this.mInvalidateHandler.removeMessages(0);
        this.mInvalidateHandler = null;
    }
}
