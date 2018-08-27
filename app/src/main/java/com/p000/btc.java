package com.p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: btc */
public interface btc extends IInterface {

    /* renamed from: btc$a */
    public static abstract class C1459a extends Binder implements btc {

        /* renamed from: btc$a$a */
        static class C1458a implements btc {
            /* renamed from: a */
            private IBinder f7579a;

            C1458a(IBinder iBinder) {
                this.f7579a = iBinder;
            }

            /* renamed from: a */
            public final void mo1486a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IPlayerStateChangeListener");
                    this.f7579a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo1487a(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IPlayerStateChangeListener");
                    obtain.writeString(str);
                    this.f7579a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final IBinder asBinder() {
                return this.f7579a;
            }

            /* renamed from: b */
            public final void mo1488b() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IPlayerStateChangeListener");
                    this.f7579a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo1489b(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IPlayerStateChangeListener");
                    obtain.writeString(str);
                    this.f7579a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public final void mo1490c() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IPlayerStateChangeListener");
                    this.f7579a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public final void mo1491d() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IPlayerStateChangeListener");
                    this.f7579a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C1459a() {
            attachInterface(this, "com.google.android.youtube.player.internal.IPlayerStateChangeListener");
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.youtube.player.internal.IPlayerStateChangeListener");
                    mo1486a();
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.youtube.player.internal.IPlayerStateChangeListener");
                    mo1487a(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.youtube.player.internal.IPlayerStateChangeListener");
                    mo1488b();
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.youtube.player.internal.IPlayerStateChangeListener");
                    mo1490c();
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.youtube.player.internal.IPlayerStateChangeListener");
                    mo1491d();
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.android.youtube.player.internal.IPlayerStateChangeListener");
                    mo1489b(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.youtube.player.internal.IPlayerStateChangeListener");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo1486a() throws RemoteException;

    /* renamed from: a */
    void mo1487a(String str) throws RemoteException;

    /* renamed from: b */
    void mo1488b() throws RemoteException;

    /* renamed from: b */
    void mo1489b(String str) throws RemoteException;

    /* renamed from: c */
    void mo1490c() throws RemoteException;

    /* renamed from: d */
    void mo1491d() throws RemoteException;
}
