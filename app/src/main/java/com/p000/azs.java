package com.p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: azs */
public interface azs extends IInterface {

    /* renamed from: azs$a */
    public static abstract class C0929a extends Binder implements azs {

        /* renamed from: azs$a$a */
        static class C0941a implements azs {
            /* renamed from: a */
            private IBinder f5190a;

            C0941a(IBinder iBinder) {
                this.f5190a = iBinder;
            }

            /* renamed from: a */
            public void mo858a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdClickListener");
                    this.f5190a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f5190a;
            }
        }

        public C0929a() {
            attachInterface(this, "com.google.android.gms.ads.internal.client.IAdClickListener");
        }

        /* renamed from: a */
        public static azs m6699a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof azs)) ? new C0941a(iBinder) : (azs) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    mo858a();
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.ads.internal.client.IAdClickListener");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo858a() throws RemoteException;
}
