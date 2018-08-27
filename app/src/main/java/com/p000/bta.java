package com.p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: bta */
public interface bta extends IInterface {

    /* renamed from: bta$a */
    public static abstract class C1455a extends Binder implements bta {

        /* renamed from: bta$a$a */
        static class C1454a implements bta {
            /* renamed from: a */
            private IBinder f7577a;

            C1454a(IBinder iBinder) {
                this.f7577a = iBinder;
            }

            /* renamed from: a */
            public final void mo1480a(boolean z) throws RemoteException {
                int i = 1;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IOnFullscreenListener");
                    if (!z) {
                        i = 0;
                    }
                    obtain.writeInt(i);
                    this.f7577a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final IBinder asBinder() {
                return this.f7577a;
            }
        }

        public C1455a() {
            attachInterface(this, "com.google.android.youtube.player.internal.IOnFullscreenListener");
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.youtube.player.internal.IOnFullscreenListener");
                    mo1480a(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.youtube.player.internal.IOnFullscreenListener");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo1480a(boolean z) throws RemoteException;
}
