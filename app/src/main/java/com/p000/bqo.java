package com.p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p000.aqq.C0701a;

/* renamed from: bqo */
public interface bqo extends IInterface {

    /* renamed from: bqo$a */
    public static abstract class C1410a extends Binder implements bqo {

        /* renamed from: bqo$a$a */
        static class C1409a implements bqo {
            /* renamed from: a */
            private IBinder f7392a;

            C1409a(IBinder iBinder) {
                this.f7392a = iBinder;
            }

            /* renamed from: a */
            public aqq mo1399a(aqq aqq, int i, int i2, String str, int i3) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusOneButtonCreator");
                    obtain.writeStrongBinder(aqq != null ? aqq.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeString(str);
                    obtain.writeInt(i3);
                    this.f7392a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    aqq a = C0701a.m4966a(obtain2.readStrongBinder());
                    return a;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public aqq mo1400a(aqq aqq, int i, int i2, String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusOneButtonCreator");
                    obtain.writeStrongBinder(aqq != null ? aqq.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f7392a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    aqq a = C0701a.m4966a(obtain2.readStrongBinder());
                    return a;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f7392a;
            }
        }

        /* renamed from: a */
        public static bqo m10426a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.plus.internal.IPlusOneButtonCreator");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof bqo)) ? new C1409a(iBinder) : (bqo) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            IBinder iBinder = null;
            aqq a;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusOneButtonCreator");
                    a = mo1399a(C0701a.m4966a(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(a != null ? a.asBinder() : null);
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusOneButtonCreator");
                    a = mo1400a(C0701a.m4966a(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    if (a != null) {
                        iBinder = a.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.plus.internal.IPlusOneButtonCreator");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    aqq mo1399a(aqq aqq, int i, int i2, String str, int i3) throws RemoteException;

    /* renamed from: a */
    aqq mo1400a(aqq aqq, int i, int i2, String str, String str2) throws RemoteException;
}
