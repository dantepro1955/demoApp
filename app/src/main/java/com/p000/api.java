package com.p000;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.zzan;
import com.google.android.gms.common.internal.zzj;

/* renamed from: api */
public interface api extends IInterface {

    /* renamed from: api$a */
    public static abstract class C0686a extends Binder implements api {

        /* renamed from: api$a$a */
        static class C0685a implements api {
            /* renamed from: a */
            private final IBinder f3904a;

            C0685a(IBinder iBinder) {
                this.f3904a = iBinder;
            }

            /* renamed from: a */
            public void mo602a(aph aph, zzj zzj) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(aph != null ? aph.asBinder() : null);
                    if (zzj != null) {
                        obtain.writeInt(1);
                        zzj.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f3904a.transact(46, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f3904a;
            }
        }

        /* renamed from: a */
        public static api m4842a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof api)) ? new C0685a(iBinder) : (api) queryLocalInterface;
        }

        /* renamed from: a */
        protected void m4843a(int i, aph aph, int i2, String str, String str2, String[] strArr, Bundle bundle, IBinder iBinder, String str3, String str4) throws RemoteException {
            throw new UnsupportedOperationException();
        }

        /* renamed from: a */
        protected void m4844a(aph aph, zzan zzan) throws RemoteException {
            throw new UnsupportedOperationException();
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r12, Parcel r13, Parcel r14, int r15) throws RemoteException {
            /*
            r11 = this;
            r1 = 0;
            r0 = 16777215; // 0xffffff float:2.3509886E-38 double:8.2890456E-317;
            if (r12 <= r0) goto L_0x000b;
        L_0x0006:
            r0 = super.onTransact(r12, r13, r14, r15);
        L_0x000a:
            return r0;
        L_0x000b:
            r0 = "com.google.android.gms.common.internal.IGmsServiceBroker";
            r13.enforceInterface(r0);
            r0 = r13.readStrongBinder();
            r2 = p000.aph.C0666a.m4736a(r0);
            r0 = 46;
            if (r12 != r0) goto L_0x0032;
        L_0x001c:
            r0 = r13.readInt();
            if (r0 == 0) goto L_0x0121;
        L_0x0022:
            r0 = com.google.android.gms.common.internal.zzj.CREATOR;
            r0 = r0.createFromParcel(r13);
            r0 = (com.google.android.gms.common.internal.zzj) r0;
        L_0x002a:
            r11.mo602a(r2, r0);
        L_0x002d:
            r14.writeNoException();
            r0 = 1;
            goto L_0x000a;
        L_0x0032:
            r0 = 47;
            if (r12 != r0) goto L_0x0048;
        L_0x0036:
            r0 = r13.readInt();
            if (r0 == 0) goto L_0x011e;
        L_0x003c:
            r0 = com.google.android.gms.common.internal.zzan.CREATOR;
            r0 = r0.createFromParcel(r13);
            r0 = (com.google.android.gms.common.internal.zzan) r0;
        L_0x0044:
            r11.m4844a(r2, r0);
            goto L_0x002d;
        L_0x0048:
            r3 = r13.readInt();
            r0 = 4;
            if (r12 == r0) goto L_0x011b;
        L_0x004f:
            r4 = r13.readString();
        L_0x0053:
            switch(r12) {
                case 1: goto L_0x007a;
                case 2: goto L_0x00f0;
                case 3: goto L_0x0056;
                case 4: goto L_0x0056;
                case 5: goto L_0x00f0;
                case 6: goto L_0x00f0;
                case 7: goto L_0x00f0;
                case 8: goto L_0x00f0;
                case 9: goto L_0x0098;
                case 10: goto L_0x00d7;
                case 11: goto L_0x00f0;
                case 12: goto L_0x00f0;
                case 13: goto L_0x00f0;
                case 14: goto L_0x00f0;
                case 15: goto L_0x00f0;
                case 16: goto L_0x00f0;
                case 17: goto L_0x00f0;
                case 18: goto L_0x00f0;
                case 19: goto L_0x0062;
                case 20: goto L_0x00bc;
                case 21: goto L_0x0056;
                case 22: goto L_0x0056;
                case 23: goto L_0x00f0;
                case 24: goto L_0x0056;
                case 25: goto L_0x00f0;
                case 26: goto L_0x0056;
                case 27: goto L_0x00f0;
                case 28: goto L_0x0056;
                case 29: goto L_0x0056;
                case 30: goto L_0x00bc;
                case 31: goto L_0x0056;
                case 32: goto L_0x0056;
                case 33: goto L_0x0056;
                case 34: goto L_0x00e5;
                case 35: goto L_0x0056;
                case 36: goto L_0x0056;
                case 37: goto L_0x00f0;
                case 38: goto L_0x00f0;
                case 39: goto L_0x0056;
                case 40: goto L_0x0056;
                case 41: goto L_0x00f0;
                case 42: goto L_0x0056;
                case 43: goto L_0x00f0;
                default: goto L_0x0056;
            };
        L_0x0056:
            r10 = r1;
            r9 = r1;
            r8 = r1;
            r7 = r1;
            r6 = r1;
            r5 = r1;
        L_0x005c:
            r0 = r11;
            r1 = r12;
            r0.m4843a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10);
            goto L_0x002d;
        L_0x0062:
            r8 = r13.readStrongBinder();
            r0 = r13.readInt();
            if (r0 == 0) goto L_0x0114;
        L_0x006c:
            r0 = android.os.Bundle.CREATOR;
            r0 = r0.createFromParcel(r13);
            r0 = (android.os.Bundle) r0;
            r10 = r1;
            r9 = r1;
            r7 = r0;
            r6 = r1;
            r5 = r1;
            goto L_0x005c;
        L_0x007a:
            r9 = r13.readString();
            r6 = r13.createStringArray();
            r5 = r13.readString();
            r0 = r13.readInt();
            if (r0 == 0) goto L_0x010f;
        L_0x008c:
            r0 = android.os.Bundle.CREATOR;
            r0 = r0.createFromParcel(r13);
            r0 = (android.os.Bundle) r0;
            r10 = r1;
            r8 = r1;
            r7 = r0;
            goto L_0x005c;
        L_0x0098:
            r5 = r13.readString();
            r6 = r13.createStringArray();
            r9 = r13.readString();
            r8 = r13.readStrongBinder();
            r10 = r13.readString();
            r0 = r13.readInt();
            if (r0 == 0) goto L_0x010c;
        L_0x00b2:
            r0 = android.os.Bundle.CREATOR;
            r0 = r0.createFromParcel(r13);
            r0 = (android.os.Bundle) r0;
            r7 = r0;
            goto L_0x005c;
        L_0x00bc:
            r6 = r13.createStringArray();
            r5 = r13.readString();
            r0 = r13.readInt();
            if (r0 == 0) goto L_0x0106;
        L_0x00ca:
            r0 = android.os.Bundle.CREATOR;
            r0 = r0.createFromParcel(r13);
            r0 = (android.os.Bundle) r0;
            r10 = r1;
            r9 = r1;
            r8 = r1;
            r7 = r0;
            goto L_0x005c;
        L_0x00d7:
            r5 = r13.readString();
            r6 = r13.createStringArray();
            r10 = r1;
            r9 = r1;
            r8 = r1;
            r7 = r1;
            goto L_0x005c;
        L_0x00e5:
            r5 = r13.readString();
            r10 = r1;
            r9 = r1;
            r8 = r1;
            r7 = r1;
            r6 = r1;
            goto L_0x005c;
        L_0x00f0:
            r0 = r13.readInt();
            if (r0 == 0) goto L_0x0056;
        L_0x00f6:
            r0 = android.os.Bundle.CREATOR;
            r0 = r0.createFromParcel(r13);
            r0 = (android.os.Bundle) r0;
            r10 = r1;
            r9 = r1;
            r8 = r1;
            r7 = r0;
            r6 = r1;
            r5 = r1;
            goto L_0x005c;
        L_0x0106:
            r10 = r1;
            r9 = r1;
            r8 = r1;
            r7 = r1;
            goto L_0x005c;
        L_0x010c:
            r7 = r1;
            goto L_0x005c;
        L_0x010f:
            r10 = r1;
            r8 = r1;
            r7 = r1;
            goto L_0x005c;
        L_0x0114:
            r10 = r1;
            r9 = r1;
            r7 = r1;
            r6 = r1;
            r5 = r1;
            goto L_0x005c;
        L_0x011b:
            r4 = r1;
            goto L_0x0053;
        L_0x011e:
            r0 = r1;
            goto L_0x0044;
        L_0x0121:
            r0 = r1;
            goto L_0x002a;
            */
            throw new UnsupportedOperationException("Method not decompiled: api.a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    /* renamed from: a */
    void mo602a(aph aph, zzj zzj) throws RemoteException;
}
