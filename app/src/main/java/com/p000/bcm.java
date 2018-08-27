package com.p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p000.bci.C0999a;

/* renamed from: bcm */
public interface bcm extends IInterface {

    /* renamed from: bcm$a */
    public static abstract class C1027a extends Binder implements bcm {

        /* renamed from: bcm$a$a */
        static class C1026a implements bcm {
            /* renamed from: a */
            private IBinder f5587a;

            C1026a(IBinder iBinder) {
                this.f5587a = iBinder;
            }

            /* renamed from: a */
            public void mo1000a(bci bci) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
                    obtain.writeStrongBinder(bci != null ? bci.asBinder() : null);
                    this.f5587a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f5587a;
            }
        }

        public C1027a() {
            attachInterface(this, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
        }

        /* renamed from: a */
        public static bcm m7494a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof bcm)) ? new C1026a(iBinder) : (bcm) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
                    mo1000a(C0999a.m7258a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo1000a(bci bci) throws RemoteException;
}
