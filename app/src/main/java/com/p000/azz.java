package com.p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: azz */
public interface azz extends IInterface {

    /* renamed from: azz$a */
    public static abstract class C0931a extends Binder implements azz {

        /* renamed from: azz$a$a */
        static class C0950a implements azz {
            /* renamed from: a */
            private IBinder f5197a;

            C0950a(IBinder iBinder) {
                this.f5197a = iBinder;
            }

            /* renamed from: a */
            public void mo867a(String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAppEventListener");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f5197a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f5197a;
            }
        }

        public C0931a() {
            attachInterface(this, "com.google.android.gms.ads.internal.client.IAppEventListener");
        }

        /* renamed from: a */
        public static azz m6736a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof azz)) ? new C0950a(iBinder) : (azz) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    mo867a(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.ads.internal.client.IAppEventListener");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo867a(String str, String str2) throws RemoteException;
}
