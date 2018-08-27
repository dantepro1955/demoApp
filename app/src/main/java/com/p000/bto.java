package com.p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: bto */
public interface bto extends IInterface {

    /* renamed from: bto$a */
    public static abstract class C1482a extends Binder implements bto {

        /* renamed from: bto$a$a */
        static class C1481a implements bto {
            /* renamed from: a */
            private IBinder f7627a;

            C1481a(IBinder iBinder) {
                this.f7627a = iBinder;
            }

            public final IBinder asBinder() {
                return this.f7627a;
            }
        }

        public C1482a() {
            attachInterface(this, "com.google.android.youtube.player.internal.dynamic.IObjectWrapper");
        }

        /* renamed from: a */
        public static bto m10943a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.youtube.player.internal.dynamic.IObjectWrapper");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof bto)) ? new C1481a(iBinder) : (bto) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            switch (i) {
                case 1598968902:
                    parcel2.writeString("com.google.android.youtube.player.internal.dynamic.IObjectWrapper");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }
}
