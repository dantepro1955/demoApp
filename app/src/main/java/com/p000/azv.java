package com.p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.zzhc;
import p000.azt.C0930a;
import p000.azu.C0246a;
import p000.bab.C0940a;
import p000.bcl.C1025a;
import p000.bcm.C1027a;
import p000.bcn.C1029a;
import p000.bco.C1031a;

/* renamed from: azv */
public interface azv extends IInterface {

    /* renamed from: azv$a */
    public static abstract class C0247a extends Binder implements azv {

        /* renamed from: azv$a$a */
        static class C0944a implements azv {
            /* renamed from: a */
            private IBinder f5193a;

            C0944a(IBinder iBinder) {
                this.f5193a = iBinder;
            }

            /* renamed from: a */
            public azu mo297a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                    this.f5193a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    azu a = C0246a.m2131a(obtain2.readStrongBinder());
                    return a;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo298a(azt azt) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                    obtain.writeStrongBinder(azt != null ? azt.asBinder() : null);
                    this.f5193a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo299a(bab bab) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                    obtain.writeStrongBinder(bab != null ? bab.asBinder() : null);
                    this.f5193a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo300a(bcl bcl) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                    obtain.writeStrongBinder(bcl != null ? bcl.asBinder() : null);
                    this.f5193a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo301a(bcm bcm) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                    obtain.writeStrongBinder(bcm != null ? bcm.asBinder() : null);
                    this.f5193a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo302a(zzhc zzhc) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                    if (zzhc != null) {
                        obtain.writeInt(1);
                        zzhc.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f5193a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo303a(String str, bco bco, bcn bcn) throws RemoteException {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(bco != null ? bco.asBinder() : null);
                    if (bcn != null) {
                        iBinder = bcn.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f5193a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f5193a;
            }
        }

        public C0247a() {
            attachInterface(this, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
        }

        /* renamed from: a */
        public static azv m2155a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof azv)) ? new C0944a(iBinder) : (azv) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            zzhc zzhc = null;
            switch (i) {
                case 1:
                    IBinder asBinder;
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                    azu a = mo297a();
                    parcel2.writeNoException();
                    if (a != null) {
                        asBinder = a.asBinder();
                    }
                    parcel2.writeStrongBinder(asBinder);
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                    mo298a(C0930a.m6706a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                    mo300a(C1025a.m7491a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                    mo301a(C1027a.m7494a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                    mo303a(parcel.readString(), C1031a.m7500a(parcel.readStrongBinder()), C1029a.m7497a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                    if (parcel.readInt() != 0) {
                        zzhc = (zzhc) zzhc.CREATOR.createFromParcel(parcel);
                    }
                    mo302a(zzhc);
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                    mo299a(C0940a.m6794a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    azu mo297a() throws RemoteException;

    /* renamed from: a */
    void mo298a(azt azt) throws RemoteException;

    /* renamed from: a */
    void mo299a(bab bab) throws RemoteException;

    /* renamed from: a */
    void mo300a(bcl bcl) throws RemoteException;

    /* renamed from: a */
    void mo301a(bcm bcm) throws RemoteException;

    /* renamed from: a */
    void mo302a(zzhc zzhc) throws RemoteException;

    /* renamed from: a */
    void mo303a(String str, bco bco, bcn bcn) throws RemoteException;
}
