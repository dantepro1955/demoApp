package com.p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p000.bcg.C0996a;

/* renamed from: bcl */
public interface bcl extends IInterface {

    /* renamed from: bcl$a */
    public static abstract class C1025a extends Binder implements bcl {

        /* renamed from: bcl$a$a */
        static class C1024a implements bcl {
            /* renamed from: a */
            private IBinder f5586a;

            C1024a(IBinder iBinder) {
                this.f5586a = iBinder;
            }

            /* renamed from: a */
            public void mo999a(bcg bcg) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
                    obtain.writeStrongBinder(bcg != null ? bcg.asBinder() : null);
                    this.f5586a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f5586a;
            }
        }

        public C1025a() {
            attachInterface(this, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
        }

        /* renamed from: a */
        public static bcl m7491a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof bcl)) ? new C1024a(iBinder) : (bcl) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
                    mo999a(C0996a.m7224a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo999a(bcg bcg) throws RemoteException;
}
