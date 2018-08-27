package com.p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p000.aqq.C0701a;

/* renamed from: aqu */
public interface aqu extends IInterface {

    /* renamed from: aqu$a */
    public static abstract class C0706a extends Binder implements aqu {

        /* renamed from: aqu$a$a */
        static class C0705a implements aqu {
            /* renamed from: a */
            private IBinder f3964a;

            C0705a(IBinder iBinder) {
                this.f3964a = iBinder;
            }

            /* renamed from: a */
            public aqq mo617a(aqq aqq, String str, byte[] bArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                    obtain.writeStrongBinder(aqq != null ? aqq.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeByteArray(bArr);
                    this.f3964a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    aqq a = C0701a.m4966a(obtain2.readStrongBinder());
                    return a;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f3964a;
            }
        }

        /* renamed from: a */
        public static aqu m4978a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof aqu)) ? new C0705a(iBinder) : (aqu) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                    aqq a = mo617a(C0701a.m4966a(parcel.readStrongBinder()), parcel.readString(), parcel.createByteArray());
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(a != null ? a.asBinder() : null);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    aqq mo617a(aqq aqq, String str, byte[] bArr) throws RemoteException;
}
