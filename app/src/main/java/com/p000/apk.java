package com.p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.zzah;
import p000.aqq.C0701a;

/* renamed from: apk */
public interface apk extends IInterface {

    /* renamed from: apk$a */
    public static abstract class C0690a extends Binder implements apk {

        /* renamed from: apk$a$a */
        static class C0689a implements apk {
            /* renamed from: a */
            private IBinder f3906a;

            C0689a(IBinder iBinder) {
                this.f3906a = iBinder;
            }

            /* renamed from: a */
            public aqq mo604a(aqq aqq, int i, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.ISignInButtonCreator");
                    obtain.writeStrongBinder(aqq != null ? aqq.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.f3906a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    aqq a = C0701a.m4966a(obtain2.readStrongBinder());
                    return a;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public aqq mo605a(aqq aqq, zzah zzah) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.ISignInButtonCreator");
                    obtain.writeStrongBinder(aqq != null ? aqq.asBinder() : null);
                    if (zzah != null) {
                        obtain.writeInt(1);
                        zzah.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f3906a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    aqq a = C0701a.m4966a(obtain2.readStrongBinder());
                    return a;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f3906a;
            }
        }

        /* renamed from: a */
        public static apk m4852a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof apk)) ? new C0689a(iBinder) : (apk) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            IBinder iBinder = null;
            aqq a;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
                    a = mo604a(C0701a.m4966a(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(a != null ? a.asBinder() : null);
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
                    a = mo605a(C0701a.m4966a(parcel.readStrongBinder()), parcel.readInt() != 0 ? (zzah) zzah.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    if (a != null) {
                        iBinder = a.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.common.internal.ISignInButtonCreator");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    aqq mo604a(aqq aqq, int i, int i2) throws RemoteException;

    /* renamed from: a */
    aqq mo605a(aqq aqq, zzah zzah) throws RemoteException;
}
