package com.p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.zzeg;
import p000.aqq.C0701a;
import p000.bex.C1124a;

/* renamed from: azy */
public interface azy extends IInterface {

    /* renamed from: azy$a */
    public static abstract class C0949a extends Binder implements azy {

        /* renamed from: azy$a$a */
        static class C0948a implements azy {
            /* renamed from: a */
            private IBinder f5196a;

            C0948a(IBinder iBinder) {
                this.f5196a = iBinder;
            }

            /* renamed from: a */
            public IBinder mo877a(aqq aqq, zzeg zzeg, String str, bex bex, int i) throws RemoteException {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                    obtain.writeStrongBinder(aqq != null ? aqq.asBinder() : null);
                    if (zzeg != null) {
                        obtain.writeInt(1);
                        zzeg.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    if (bex != null) {
                        iBinder = bex.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeInt(i);
                    this.f5196a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    iBinder = obtain2.readStrongBinder();
                    return iBinder;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public IBinder mo878a(aqq aqq, zzeg zzeg, String str, bex bex, int i, int i2) throws RemoteException {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                    obtain.writeStrongBinder(aqq != null ? aqq.asBinder() : null);
                    if (zzeg != null) {
                        obtain.writeInt(1);
                        zzeg.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    if (bex != null) {
                        iBinder = bex.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.f5196a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    iBinder = obtain2.readStrongBinder();
                    return iBinder;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f5196a;
            }
        }

        /* renamed from: a */
        public static azy m6846a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof azy)) ? new C0948a(iBinder) : (azy) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            zzeg zzeg = null;
            aqq a;
            IBinder a2;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                    a = C0701a.m4966a(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        zzeg = (zzeg) zzeg.CREATOR.createFromParcel(parcel);
                    }
                    a2 = mo877a(a, zzeg, parcel.readString(), C1124a.m7920a(parcel.readStrongBinder()), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(a2);
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                    a = C0701a.m4966a(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        zzeg = (zzeg) zzeg.CREATOR.createFromParcel(parcel);
                    }
                    a2 = mo878a(a, zzeg, parcel.readString(), C1124a.m7920a(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(a2);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    IBinder mo877a(aqq aqq, zzeg zzeg, String str, bex bex, int i) throws RemoteException;

    /* renamed from: a */
    IBinder mo878a(aqq aqq, zzeg zzeg, String str, bex bex, int i, int i2) throws RemoteException;
}
