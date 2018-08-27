package com.p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: atf */
public interface atf extends IInterface {

    /* renamed from: atf$a */
    public static abstract class C0785a extends Binder implements atf {

        /* renamed from: atf$a$a */
        static class C0791a implements atf {
            /* renamed from: a */
            private IBinder f4322a;

            C0791a(IBinder iBinder) {
                this.f4322a = iBinder;
            }

            /* renamed from: a */
            public void mo714a(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.service.ICommonCallbacks");
                    obtain.writeInt(i);
                    this.f4322a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f4322a;
            }
        }

        public C0785a() {
            attachInterface(this, "com.google.android.gms.common.internal.service.ICommonCallbacks");
        }

        /* renamed from: a */
        public static atf m5571a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.ICommonCallbacks");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof atf)) ? new C0791a(iBinder) : (atf) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.common.internal.service.ICommonCallbacks");
                    mo714a(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.common.internal.service.ICommonCallbacks");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo714a(int i) throws RemoteException;
}
