package com.p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p000.bgb.C0210a;

/* renamed from: bgc */
public interface bgc extends IInterface {

    /* renamed from: bgc$a */
    public static abstract class C1064a extends Binder implements bgc {

        /* renamed from: bgc$a$a */
        static class C1160a implements bgc {
            /* renamed from: a */
            private IBinder f6073a;

            C1160a(IBinder iBinder) {
                this.f6073a = iBinder;
            }

            /* renamed from: a */
            public void mo1008a(bgb bgb) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
                    obtain.writeStrongBinder(bgb != null ? bgb.asBinder() : null);
                    this.f6073a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f6073a;
            }
        }

        public C1064a() {
            attachInterface(this, "com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
        }

        /* renamed from: a */
        public static bgc m7636a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof bgc)) ? new C1160a(iBinder) : (bgc) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
                    mo1008a(C0210a.m1870a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo1008a(bgb bgb) throws RemoteException;
}
