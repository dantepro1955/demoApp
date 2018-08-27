package com.p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.zzmn;

/* renamed from: bhp */
public interface bhp extends IInterface {

    /* renamed from: bhp$a */
    public static abstract class C1208a extends Binder implements bhp {

        /* renamed from: bhp$a$a */
        static class C1211a implements bhp {
            /* renamed from: a */
            private IBinder f6260a;

            C1211a(IBinder iBinder) {
                this.f6260a = iBinder;
            }

            /* renamed from: a */
            public void mo1192a(zzmn zzmn) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.request.IAdResponseListener");
                    if (zzmn != null) {
                        obtain.writeInt(1);
                        zzmn.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f6260a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f6260a;
            }
        }

        public C1208a() {
            attachInterface(this, "com.google.android.gms.ads.internal.request.IAdResponseListener");
        }

        /* renamed from: a */
        public static bhp m8494a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof bhp)) ? new C1211a(iBinder) : (bhp) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                    mo1192a(parcel.readInt() != 0 ? (zzmn) zzmn.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.ads.internal.request.IAdResponseListener");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo1192a(zzmn zzmn) throws RemoteException;
}
