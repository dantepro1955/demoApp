package com.p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p000.aqq.C0701a;

/* renamed from: aqt */
public interface aqt extends IInterface {

    /* renamed from: aqt$a */
    public static abstract class C0704a extends Binder implements aqt {

        /* renamed from: aqt$a$a */
        static class C0703a implements aqt {
            /* renamed from: a */
            private IBinder f3963a;

            C0703a(IBinder iBinder) {
                this.f3963a = iBinder;
            }

            /* renamed from: a */
            public int mo614a(aqq aqq, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.dynamite.IDynamiteLoader");
                    obtain.writeStrongBinder(aqq != null ? aqq.asBinder() : null);
                    obtain.writeString(str);
                    this.f3963a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public int mo615a(aqq aqq, String str, boolean z) throws RemoteException {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.dynamite.IDynamiteLoader");
                    obtain.writeStrongBinder(aqq != null ? aqq.asBinder() : null);
                    obtain.writeString(str);
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f3963a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    i = obtain2.readInt();
                    return i;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public aqq mo616a(aqq aqq, String str, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.dynamite.IDynamiteLoader");
                    obtain.writeStrongBinder(aqq != null ? aqq.asBinder() : null);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.f3963a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    aqq a = C0701a.m4966a(obtain2.readStrongBinder());
                    return a;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f3963a;
            }
        }

        /* renamed from: a */
        public static aqt m4975a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof aqt)) ? new C0703a(iBinder) : (aqt) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            int a;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    a = mo614a(C0701a.m4966a(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(a);
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    aqq a2 = mo616a(C0701a.m4966a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(a2 != null ? a2.asBinder() : null);
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    a = mo615a(C0701a.m4966a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt() != 0);
                    parcel2.writeNoException();
                    parcel2.writeInt(a);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.dynamite.IDynamiteLoader");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    int mo614a(aqq aqq, String str) throws RemoteException;

    /* renamed from: a */
    int mo615a(aqq aqq, String str, boolean z) throws RemoteException;

    /* renamed from: a */
    aqq mo616a(aqq aqq, String str, int i) throws RemoteException;
}
