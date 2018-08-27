package com.p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p000.bey.C1127a;

/* renamed from: bex */
public interface bex extends IInterface {

    /* renamed from: bex$a */
    public static abstract class C1124a extends Binder implements bex {

        /* renamed from: bex$a$a */
        static class C1125a implements bex {
            /* renamed from: a */
            private IBinder f5917a;

            C1125a(IBinder iBinder) {
                this.f5917a = iBinder;
            }

            /* renamed from: a */
            public bey mo1052a(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
                    obtain.writeString(str);
                    this.f5917a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    bey a = C1127a.m7974a(obtain2.readStrongBinder());
                    return a;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f5917a;
            }

            /* renamed from: b */
            public boolean mo1053b(String str) throws RemoteException {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
                    obtain.writeString(str);
                    this.f5917a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C1124a() {
            attachInterface(this, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        }

        /* renamed from: a */
        public static bex m7920a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof bex)) ? new C1125a(iBinder) : (bex) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
                    bey a = mo1052a(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(a != null ? a.asBinder() : null);
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
                    boolean b = mo1053b(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(b ? 1 : 0);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    bey mo1052a(String str) throws RemoteException;

    /* renamed from: b */
    boolean mo1053b(String str) throws RemoteException;
}
