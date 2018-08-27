package com.p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p000.bck.C1001a;

/* renamed from: bco */
public interface bco extends IInterface {

    /* renamed from: bco$a */
    public static abstract class C1031a extends Binder implements bco {

        /* renamed from: bco$a$a */
        static class C1030a implements bco {
            /* renamed from: a */
            private IBinder f5589a;

            C1030a(IBinder iBinder) {
                this.f5589a = iBinder;
            }

            /* renamed from: a */
            public void mo1002a(bck bck) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
                    obtain.writeStrongBinder(bck != null ? bck.asBinder() : null);
                    this.f5589a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f5589a;
            }
        }

        /* renamed from: a */
        public static bco m7500a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof bco)) ? new C1030a(iBinder) : (bco) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
                    mo1002a(C1001a.m7288a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo1002a(bck bck) throws RemoteException;
}
