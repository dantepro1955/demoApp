package com.p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p000.aqq.C0701a;

/* renamed from: axw */
public interface axw extends IInterface {

    /* renamed from: axw$a */
    public static abstract class C0878a extends Binder implements axw {

        /* renamed from: axw$a$a */
        static class C0877a implements axw {
            /* renamed from: a */
            private IBinder f4915a;

            C0877a(IBinder iBinder) {
                this.f4915a = iBinder;
            }

            /* renamed from: a */
            public IBinder mo839a(String str, aqq aqq) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.adshield.internal.IAdShieldCreator");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(aqq != null ? aqq.asBinder() : null);
                    this.f4915a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    IBinder readStrongBinder = obtain2.readStrongBinder();
                    return readStrongBinder;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f4915a;
            }

            /* renamed from: b */
            public IBinder mo840b(String str, aqq aqq) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.adshield.internal.IAdShieldCreator");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(aqq != null ? aqq.asBinder() : null);
                    this.f4915a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    IBinder readStrongBinder = obtain2.readStrongBinder();
                    return readStrongBinder;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: a */
        public static axw m6432a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.adshield.internal.IAdShieldCreator");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof axw)) ? new C0877a(iBinder) : (axw) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            IBinder a;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.ads.adshield.internal.IAdShieldCreator");
                    a = mo839a(parcel.readString(), C0701a.m4966a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(a);
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.ads.adshield.internal.IAdShieldCreator");
                    a = mo840b(parcel.readString(), C0701a.m4966a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(a);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.ads.adshield.internal.IAdShieldCreator");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    IBinder mo839a(String str, aqq aqq) throws RemoteException;

    /* renamed from: b */
    IBinder mo840b(String str, aqq aqq) throws RemoteException;
}
