package com.p000;

import android.graphics.Bitmap;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: btf */
public interface btf extends IInterface {

    /* renamed from: btf$a */
    public static abstract class C1465a extends Binder implements btf {

        /* renamed from: btf$a$a */
        static class C1464a implements btf {
            /* renamed from: a */
            private IBinder f7582a;

            C1464a(IBinder iBinder) {
                this.f7582a = iBinder;
            }

            /* renamed from: a */
            public final void mo1496a(Bitmap bitmap, String str, boolean z, boolean z2) throws RemoteException {
                int i = 1;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IThumbnailLoaderClient");
                    if (bitmap != null) {
                        obtain.writeInt(1);
                        bitmap.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    obtain.writeInt(z ? 1 : 0);
                    if (!z2) {
                        i = 0;
                    }
                    obtain.writeInt(i);
                    this.f7582a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo1497a(String str, boolean z, boolean z2) throws RemoteException {
                int i = 1;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IThumbnailLoaderClient");
                    obtain.writeString(str);
                    obtain.writeInt(z ? 1 : 0);
                    if (!z2) {
                        i = 0;
                    }
                    obtain.writeInt(i);
                    this.f7582a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final IBinder asBinder() {
                return this.f7582a;
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            boolean z = false;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.youtube.player.internal.IThumbnailLoaderClient");
                    Bitmap bitmap = parcel.readInt() != 0 ? (Bitmap) Bitmap.CREATOR.createFromParcel(parcel) : null;
                    String readString = parcel.readString();
                    boolean z2 = parcel.readInt() != 0;
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    mo1496a(bitmap, readString, z2, z);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.youtube.player.internal.IThumbnailLoaderClient");
                    String readString2 = parcel.readString();
                    boolean z3 = parcel.readInt() != 0;
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    mo1497a(readString2, z3, z);
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.youtube.player.internal.IThumbnailLoaderClient");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo1496a(Bitmap bitmap, String str, boolean z, boolean z2) throws RemoteException;

    /* renamed from: a */
    void mo1497a(String str, boolean z, boolean z2) throws RemoteException;
}
