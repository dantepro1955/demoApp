package com.p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: btb */
public interface btb extends IInterface {

    /* renamed from: btb$a */
    public static abstract class C1457a extends Binder implements btb {

        /* renamed from: btb$a$a */
        static class C1456a implements btb {
            /* renamed from: a */
            private IBinder f7578a;

            C1456a(IBinder iBinder) {
                this.f7578a = iBinder;
            }

            /* renamed from: a */
            public final void mo1481a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IPlaybackEventListener");
                    this.f7578a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo1482a(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IPlaybackEventListener");
                    obtain.writeInt(i);
                    this.f7578a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo1483a(boolean z) throws RemoteException {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IPlaybackEventListener");
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f7578a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final IBinder asBinder() {
                return this.f7578a;
            }

            /* renamed from: b */
            public final void mo1484b() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IPlaybackEventListener");
                    this.f7578a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public final void mo1485c() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IPlaybackEventListener");
                    this.f7578a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C1457a() {
            attachInterface(this, "com.google.android.youtube.player.internal.IPlaybackEventListener");
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.youtube.player.internal.IPlaybackEventListener");
                    mo1481a();
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.youtube.player.internal.IPlaybackEventListener");
                    mo1484b();
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.youtube.player.internal.IPlaybackEventListener");
                    mo1485c();
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.youtube.player.internal.IPlaybackEventListener");
                    mo1483a(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.youtube.player.internal.IPlaybackEventListener");
                    mo1482a(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.youtube.player.internal.IPlaybackEventListener");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo1481a() throws RemoteException;

    /* renamed from: a */
    void mo1482a(int i) throws RemoteException;

    /* renamed from: a */
    void mo1483a(boolean z) throws RemoteException;

    /* renamed from: b */
    void mo1484b() throws RemoteException;

    /* renamed from: c */
    void mo1485c() throws RemoteException;
}
