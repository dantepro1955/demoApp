package com.p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p000.aqq.C0701a;

/* renamed from: bcf */
public interface bcf extends IInterface {

    /* renamed from: bcf$a */
    public static abstract class C1020a extends Binder implements bcf {

        /* renamed from: bcf$a$a */
        static class C1019a implements bcf {
            /* renamed from: a */
            private IBinder f5574a;

            C1019a(IBinder iBinder) {
                this.f5574a = iBinder;
            }

            /* renamed from: a */
            public IBinder mo979a(aqq aqq, aqq aqq2, aqq aqq3, int i) throws RemoteException {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
                    obtain.writeStrongBinder(aqq != null ? aqq.asBinder() : null);
                    obtain.writeStrongBinder(aqq2 != null ? aqq2.asBinder() : null);
                    if (aqq3 != null) {
                        iBinder = aqq3.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeInt(i);
                    this.f5574a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    iBinder = obtain2.readStrongBinder();
                    return iBinder;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f5574a;
            }
        }

        /* renamed from: a */
        public static bcf m7432a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof bcf)) ? new C1019a(iBinder) : (bcf) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
                    IBinder a = mo979a(C0701a.m4966a(parcel.readStrongBinder()), C0701a.m4966a(parcel.readStrongBinder()), C0701a.m4966a(parcel.readStrongBinder()), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(a);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    IBinder mo979a(aqq aqq, aqq aqq2, aqq aqq3, int i) throws RemoteException;
}
