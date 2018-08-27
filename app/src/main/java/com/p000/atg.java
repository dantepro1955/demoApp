package com.p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p000.atf.C0785a;

/* renamed from: atg */
public interface atg extends IInterface {

    /* renamed from: atg$a */
    public static abstract class C0793a extends Binder implements atg {

        /* renamed from: atg$a$a */
        static class C0792a implements atg {
            /* renamed from: a */
            private IBinder f4323a;

            C0792a(IBinder iBinder) {
                this.f4323a = iBinder;
            }

            /* renamed from: a */
            public void mo717a(atf atf) throws RemoteException {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.service.ICommonService");
                    if (atf != null) {
                        iBinder = atf.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f4323a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f4323a;
            }
        }

        /* renamed from: a */
        public static atg m5593a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.ICommonService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof atg)) ? new C0792a(iBinder) : (atg) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.common.internal.service.ICommonService");
                    mo717a(C0785a.m5571a(parcel.readStrongBinder()));
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.common.internal.service.ICommonService");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo717a(atf atf) throws RemoteException;
}
