package com.p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.zzaf;

/* renamed from: apj */
public interface apj extends IInterface {

    /* renamed from: apj$a */
    public static abstract class C0688a extends Binder implements apj {

        /* renamed from: apj$a$a */
        static class C0687a implements apj {
            /* renamed from: a */
            private IBinder f3905a;

            C0687a(IBinder iBinder) {
                this.f3905a = iBinder;
            }

            /* renamed from: a */
            public void mo603a(zzaf zzaf) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IResolveAccountCallbacks");
                    if (zzaf != null) {
                        obtain.writeInt(1);
                        zzaf.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f3905a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f3905a;
            }
        }

        /* renamed from: a */
        public static apj m4847a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IResolveAccountCallbacks");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof apj)) ? new C0687a(iBinder) : (apj) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            switch (i) {
                case 2:
                    parcel.enforceInterface("com.google.android.gms.common.internal.IResolveAccountCallbacks");
                    mo603a(parcel.readInt() != 0 ? (zzaf) zzaf.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.common.internal.IResolveAccountCallbacks");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo603a(zzaf zzaf) throws RemoteException;
}
