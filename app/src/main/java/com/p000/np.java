package com.p000;

import android.annotation.TargetApi;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window.Callback;
import android.view.WindowManager.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

/* compiled from: WindowCallbackWrapper */
/* renamed from: np */
public class np implements Callback {
    /* renamed from: e */
    final Callback f24502e;

    public np(Callback callback) {
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f24502e = callback;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f24502e.dispatchKeyEvent(keyEvent);
    }

    @TargetApi(11)
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f24502e.dispatchKeyShortcutEvent(keyEvent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f24502e.dispatchTouchEvent(motionEvent);
    }

    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f24502e.dispatchTrackballEvent(motionEvent);
    }

    @TargetApi(12)
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f24502e.dispatchGenericMotionEvent(motionEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f24502e.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public View onCreatePanelView(int i) {
        return this.f24502e.onCreatePanelView(i);
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        return this.f24502e.onCreatePanelMenu(i, menu);
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        return this.f24502e.onPreparePanel(i, view, menu);
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return this.f24502e.onMenuOpened(i, menu);
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f24502e.onMenuItemSelected(i, menuItem);
    }

    public void onWindowAttributesChanged(LayoutParams layoutParams) {
        this.f24502e.onWindowAttributesChanged(layoutParams);
    }

    public void onContentChanged() {
        this.f24502e.onContentChanged();
    }

    public void onWindowFocusChanged(boolean z) {
        this.f24502e.onWindowFocusChanged(z);
    }

    public void onAttachedToWindow() {
        this.f24502e.onAttachedToWindow();
    }

    public void onDetachedFromWindow() {
        this.f24502e.onDetachedFromWindow();
    }

    public void onPanelClosed(int i, Menu menu) {
        this.f24502e.onPanelClosed(i, menu);
    }

    @TargetApi(23)
    public boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f24502e.onSearchRequested(searchEvent);
    }

    public boolean onSearchRequested() {
        return this.f24502e.onSearchRequested();
    }

    @TargetApi(11)
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f24502e.onWindowStartingActionMode(callback);
    }

    @TargetApi(23)
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        return this.f24502e.onWindowStartingActionMode(callback, i);
    }

    @TargetApi(11)
    public void onActionModeStarted(ActionMode actionMode) {
        this.f24502e.onActionModeStarted(actionMode);
    }

    @TargetApi(11)
    public void onActionModeFinished(ActionMode actionMode) {
        this.f24502e.onActionModeFinished(actionMode);
    }

    @TargetApi(24)
    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
        this.f24502e.onProvideKeyboardShortcuts(list, menu, i);
    }
}
