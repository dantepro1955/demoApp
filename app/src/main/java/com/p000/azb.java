package com.p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.zzdp;
import com.google.android.gms.internal.zzds;

/* renamed from: azb */
public interface azb extends IInterface {

    /* renamed from: azb$a */
    public static abstract class C0928a extends Binder implements azb {

        /* renamed from: azb$a$a */
        static class C0927a implements azb {
            /* renamed from: a */
            private IBinder f5121a;

            C0927a(IBinder iBinder) {
                this.f5121a = iBinder;
            }

            /* renamed from: a */
            public zzdp mo856a(zzds zzds) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.cache.ICacheService");
                    if (zzds != null) {
                        obtain.writeInt(1);
                        zzds.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f5121a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    zzdp zzdp = obtain2.readInt() != 0 ? (zzdp) zzdp.CREATOR.createFromParcel(obtain2) : null;
                    obtain2.recycle();
                    obtain.recycle();
                    return zzdp;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f5121a;
            }
        }

        /* renamed from: a */
        public static azb m6696a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.cache.ICacheService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof azb)) ? new C0927a(iBinder) : (azb) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.cache.ICacheService");
                    zzdp a = mo856a(parcel.readInt() != 0 ? (zzds) zzds.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    if (a != null) {
                        parcel2.writeInt(1);
                        a.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.ads.internal.cache.ICacheService");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    zzdp mo856a(zzds zzds) throws RemoteException;
}
