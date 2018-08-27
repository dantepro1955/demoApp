package com.p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p000.bbm.C0990a;

/* renamed from: bbn */
public interface bbn extends IInterface {

    /* renamed from: bbn$a */
    public static abstract class C0993a extends Binder implements bbn {

        /* renamed from: bbn$a$a */
        static class C0992a implements bbn {
            /* renamed from: a */
            private IBinder f5456a;

            C0992a(IBinder iBinder) {
                this.f5456a = iBinder;
            }

            /* renamed from: a */
            public void mo920a(bbm bbm) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
                    obtain.writeStrongBinder(bbm != null ? bbm.asBinder() : null);
                    this.f5456a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f5456a;
            }
        }

        public C0993a() {
            attachInterface(this, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
        }

        /* renamed from: a */
        public static bbn m7190a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof bbn)) ? new C0992a(iBinder) : (bbn) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
                    mo920a(C0990a.m7177a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo920a(bbm bbm) throws RemoteException;
}
