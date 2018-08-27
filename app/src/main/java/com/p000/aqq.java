package com.p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: aqq */
public interface aqq extends IInterface {

    /* renamed from: aqq$a */
    public static abstract class C0701a extends Binder implements aqq {

        /* renamed from: aqq$a$a */
        static class C0700a implements aqq {
            /* renamed from: a */
            private IBinder f3961a;

            C0700a(IBinder iBinder) {
                this.f3961a = iBinder;
            }

            public IBinder asBinder() {
                return this.f3961a;
            }
        }

        public C0701a() {
            attachInterface(this, "com.google.android.gms.dynamic.IObjectWrapper");
        }

        /* renamed from: a */
        public static aqq m4966a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof aqq)) ? new C0700a(iBinder) : (aqq) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            switch (i) {
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.dynamic.IObjectWrapper");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }
}
