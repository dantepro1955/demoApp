package com.p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p000.btf.C1465a.C1464a;
import p000.btg.C1467a;

/* renamed from: bth */
public interface bth extends IInterface {

    /* renamed from: bth$a */
    public static abstract class C1469a extends Binder implements bth {

        /* renamed from: bth$a$a */
        static class C1468a implements bth {
            /* renamed from: a */
            private IBinder f7584a;

            C1468a(IBinder iBinder) {
                this.f7584a = iBinder;
            }

            /* renamed from: a */
            public final IBinder mo1504a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IYouTubeService");
                    this.f7584a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    IBinder readStrongBinder = obtain2.readStrongBinder();
                    return readStrongBinder;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final btg mo1505a(btf btf) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IYouTubeService");
                    obtain.writeStrongBinder(btf != null ? btf.asBinder() : null);
                    this.f7584a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    btg a = C1467a.m10854a(obtain2.readStrongBinder());
                    return a;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo1506a(boolean z) throws RemoteException {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IYouTubeService");
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f7584a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final IBinder asBinder() {
                return this.f7584a;
            }
        }

        /* renamed from: a */
        public static bth m10861a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.youtube.player.internal.IYouTubeService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof bth)) ? new C1468a(iBinder) : (bth) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            IBinder iBinder = null;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.youtube.player.internal.IYouTubeService");
                    IBinder a = mo1504a();
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(a);
                    return true;
                case 2:
                    btf btf;
                    parcel.enforceInterface("com.google.android.youtube.player.internal.IYouTubeService");
                    IBinder readStrongBinder = parcel.readStrongBinder();
                    if (readStrongBinder == null) {
                        btf = null;
                    } else {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.youtube.player.internal.IThumbnailLoaderClient");
                        btf = (queryLocalInterface == null || !(queryLocalInterface instanceof btf)) ? new C1464a(readStrongBinder) : (btf) queryLocalInterface;
                    }
                    btg a2 = mo1505a(btf);
                    parcel2.writeNoException();
                    if (a2 != null) {
                        iBinder = a2.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.youtube.player.internal.IYouTubeService");
                    mo1506a(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.youtube.player.internal.IYouTubeService");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    IBinder mo1504a() throws RemoteException;

    /* renamed from: a */
    btg mo1505a(btf btf) throws RemoteException;

    /* renamed from: a */
    void mo1506a(boolean z) throws RemoteException;
}
