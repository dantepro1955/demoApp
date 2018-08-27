package com.p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.zzaqi;
import com.google.android.gms.internal.zzaqk;

/* renamed from: aug */
public interface aug extends IInterface {

    /* renamed from: aug$a */
    public static abstract class C0828a extends Binder implements aug {

        /* renamed from: aug$a$a */
        static class C0827a implements aug {
            /* renamed from: a */
            private IBinder f4598a;

            C0827a(IBinder iBinder) {
                this.f4598a = iBinder;
            }

            /* renamed from: a */
            public zzaqk mo731a(zzaqi zzaqi) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.gass.internal.IGassService");
                    if (zzaqi != null) {
                        obtain.writeInt(1);
                        zzaqi.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f4598a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    zzaqk zzaqk = obtain2.readInt() != 0 ? (zzaqk) zzaqk.CREATOR.createFromParcel(obtain2) : null;
                    obtain2.recycle();
                    obtain.recycle();
                    return zzaqk;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f4598a;
            }
        }

        /* renamed from: a */
        public static aug m5756a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof aug)) ? new C0827a(iBinder) : (aug) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.gass.internal.IGassService");
                    zzaqk a = mo731a(parcel.readInt() != 0 ? (zzaqi) zzaqi.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    if (a != null) {
                        parcel2.writeInt(1);
                        a.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.gass.internal.IGassService");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    zzaqk mo731a(zzaqi zzaqi) throws RemoteException;
}
