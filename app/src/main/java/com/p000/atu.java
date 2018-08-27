package com.p000;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.HashMap;

/* renamed from: atu */
public abstract class atu<K, V> {
    /* renamed from: a */
    private static final String f4510a = atu.class.getSimpleName();

    /* renamed from: b */
    protected static <K, V> HashMap<K, V> m5687b(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                return (HashMap) new ObjectInputStream(new ByteArrayInputStream(Base64.decode(str.getBytes(), 0))).readObject();
            }
        } catch (IOException e) {
            Log.d(f4510a, "decode object failure");
            return null;
        } catch (ClassNotFoundException e2) {
            Log.d(f4510a, "decode object failure");
            return null;
        }
        return null;
    }

    /* renamed from: a */
    protected abstract HashMap<K, V> mo723a();

    /* renamed from: a */
    protected abstract void mo724a(String str);

    public String toString() {
        try {
            OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(mo723a());
            objectOutputStream.close();
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        } catch (IOException e) {
            return null;
        }
    }
}
