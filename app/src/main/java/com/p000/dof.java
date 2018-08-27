package com.p000;

import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.CursorWindow;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;

/* compiled from: FastCursor */
/* renamed from: dof */
public final class dof implements Cursor {
    /* renamed from: a */
    private final CursorWindow f22398a;
    /* renamed from: b */
    private int f22399b;
    /* renamed from: c */
    private final int f22400c;

    public dof(CursorWindow cursorWindow) {
        this.f22398a = cursorWindow;
        this.f22400c = cursorWindow.getNumRows();
    }

    public int getCount() {
        return this.f22398a.getNumRows();
    }

    public int getPosition() {
        return this.f22399b;
    }

    public boolean move(int i) {
        return moveToPosition(this.f22399b + i);
    }

    public boolean moveToPosition(int i) {
        if (i < 0 || i >= this.f22400c) {
            return false;
        }
        this.f22399b = i;
        return true;
    }

    public boolean moveToFirst() {
        this.f22399b = 0;
        if (this.f22400c > 0) {
            return true;
        }
        return false;
    }

    public boolean moveToLast() {
        if (this.f22400c <= 0) {
            return false;
        }
        this.f22399b = this.f22400c - 1;
        return true;
    }

    public boolean moveToNext() {
        if (this.f22399b >= this.f22400c - 1) {
            return false;
        }
        this.f22399b++;
        return true;
    }

    public boolean moveToPrevious() {
        if (this.f22399b <= 0) {
            return false;
        }
        this.f22399b--;
        return true;
    }

    public boolean isFirst() {
        return this.f22399b == 0;
    }

    public boolean isLast() {
        return this.f22399b == this.f22400c + -1;
    }

    public boolean isBeforeFirst() {
        throw new UnsupportedOperationException();
    }

    public boolean isAfterLast() {
        throw new UnsupportedOperationException();
    }

    public int getColumnIndex(String str) {
        throw new UnsupportedOperationException();
    }

    public int getColumnIndexOrThrow(String str) throws IllegalArgumentException {
        throw new UnsupportedOperationException();
    }

    public String getColumnName(int i) {
        throw new UnsupportedOperationException();
    }

    public String[] getColumnNames() {
        throw new UnsupportedOperationException();
    }

    public int getColumnCount() {
        throw new UnsupportedOperationException();
    }

    public byte[] getBlob(int i) {
        return this.f22398a.getBlob(this.f22399b, i);
    }

    public String getString(int i) {
        return this.f22398a.getString(this.f22399b, i);
    }

    public void copyStringToBuffer(int i, CharArrayBuffer charArrayBuffer) {
        throw new UnsupportedOperationException();
    }

    public short getShort(int i) {
        return this.f22398a.getShort(this.f22399b, i);
    }

    public int getInt(int i) {
        return this.f22398a.getInt(this.f22399b, i);
    }

    public long getLong(int i) {
        return this.f22398a.getLong(this.f22399b, i);
    }

    public float getFloat(int i) {
        return this.f22398a.getFloat(this.f22399b, i);
    }

    public double getDouble(int i) {
        return this.f22398a.getDouble(this.f22399b, i);
    }

    public boolean isNull(int i) {
        return this.f22398a.isNull(this.f22399b, i);
    }

    public void deactivate() {
        throw new UnsupportedOperationException();
    }

    public boolean requery() {
        throw new UnsupportedOperationException();
    }

    public void close() {
        throw new UnsupportedOperationException();
    }

    public boolean isClosed() {
        throw new UnsupportedOperationException();
    }

    public void registerContentObserver(ContentObserver contentObserver) {
        throw new UnsupportedOperationException();
    }

    public void unregisterContentObserver(ContentObserver contentObserver) {
        throw new UnsupportedOperationException();
    }

    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        throw new UnsupportedOperationException();
    }

    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        throw new UnsupportedOperationException();
    }

    public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
        throw new UnsupportedOperationException();
    }

    public boolean getWantsAllOnMoveCalls() {
        throw new UnsupportedOperationException();
    }

    public Bundle getExtras() {
        throw new UnsupportedOperationException();
    }

    public Bundle respond(Bundle bundle) {
        throw new UnsupportedOperationException();
    }

    public int getType(int i) {
        throw new UnsupportedOperationException();
    }

    public Uri getNotificationUri() {
        return null;
    }
}
