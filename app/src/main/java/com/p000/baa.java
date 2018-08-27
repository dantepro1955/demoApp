package com.p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.zzeg;
import p000.aqq.C0701a;
import p000.azv.C0247a;
import p000.azx.C0217a;
import p000.bac.C0259a;
import p000.bce.C0970a;
import p000.bex.C1124a;
import p000.bfw.C0205a;
import p000.bgd.C0211a;
import p000.bio.C1237a;

/* renamed from: baa */
public interface baa extends IInterface {

    /* renamed from: baa$a */
    public static abstract class C0953a extends Binder implements baa {

        /* renamed from: baa$a$a */
        static class C0952a implements baa {
            /* renamed from: a */
            private IBinder f5198a;

            C0952a(IBinder iBinder) {
                this.f5198a = iBinder;
            }

            public IBinder asBinder() {
                return this.f5198a;
            }

            public azv createAdLoaderBuilder(aqq aqq, String str, bex bex, int i) throws RemoteException {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IClientApi");
                    obtain.writeStrongBinder(aqq != null ? aqq.asBinder() : null);
                    obtain.writeString(str);
                    if (bex != null) {
                        iBinder = bex.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeInt(i);
                    this.f5198a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    azv a = C0247a.m2155a(obtain2.readStrongBinder());
                    return a;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public bfw createAdOverlay(aqq aqq) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IClientApi");
                    obtain.writeStrongBinder(aqq != null ? aqq.asBinder() : null);
                    this.f5198a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    bfw a = C0205a.m1745a(obtain2.readStrongBinder());
                    return a;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public azx createBannerAdManager(aqq aqq, zzeg zzeg, String str, bex bex, int i) throws RemoteException {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IClientApi");
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
                    this.f5198a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    azx a = C0217a.m1945a(obtain2.readStrongBinder());
                    return a;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public bgd createInAppPurchaseManager(aqq aqq) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IClientApi");
                    obtain.writeStrongBinder(aqq != null ? aqq.asBinder() : null);
                    this.f5198a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    bgd a = C0211a.m1880a(obtain2.readStrongBinder());
                    return a;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public azx createInterstitialAdManager(aqq aqq, zzeg zzeg, String str, bex bex, int i) throws RemoteException {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IClientApi");
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
                    this.f5198a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    azx a = C0217a.m1945a(obtain2.readStrongBinder());
                    return a;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public bce createNativeAdViewDelegate(aqq aqq, aqq aqq2) throws RemoteException {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IClientApi");
                    obtain.writeStrongBinder(aqq != null ? aqq.asBinder() : null);
                    if (aqq2 != null) {
                        iBinder = aqq2.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f5198a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    bce a = C0970a.m7028a(obtain2.readStrongBinder());
                    return a;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public bio createRewardedVideoAd(aqq aqq, bex bex, int i) throws RemoteException {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IClientApi");
                    obtain.writeStrongBinder(aqq != null ? aqq.asBinder() : null);
                    if (bex != null) {
                        iBinder = bex.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeInt(i);
                    this.f5198a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    bio a = C1237a.m8687a(obtain2.readStrongBinder());
                    return a;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public azx createSearchAdManager(aqq aqq, zzeg zzeg, String str, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IClientApi");
                    obtain.writeStrongBinder(aqq != null ? aqq.asBinder() : null);
                    if (zzeg != null) {
                        obtain.writeInt(1);
                        zzeg.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.f5198a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    azx a = C0217a.m1945a(obtain2.readStrongBinder());
                    return a;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public bac getMobileAdsSettingsManager(aqq aqq) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IClientApi");
                    obtain.writeStrongBinder(aqq != null ? aqq.asBinder() : null);
                    this.f5198a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    bac a = C0259a.m2226a(obtain2.readStrongBinder());
                    return a;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public bac getMobileAdsSettingsManagerWithClientJarVersion(aqq aqq, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IClientApi");
                    obtain.writeStrongBinder(aqq != null ? aqq.asBinder() : null);
                    obtain.writeInt(i);
                    this.f5198a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    bac a = C0259a.m2226a(obtain2.readStrongBinder());
                    return a;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C0953a() {
            attachInterface(this, "com.google.android.gms.ads.internal.client.IClientApi");
        }

        public static baa asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof baa)) ? new C0952a(iBinder) : (baa) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            IBinder iBinder = null;
            azx createBannerAdManager;
            bac mobileAdsSettingsManager;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    createBannerAdManager = createBannerAdManager(C0701a.m4966a(parcel.readStrongBinder()), parcel.readInt() != 0 ? (zzeg) zzeg.CREATOR.createFromParcel(parcel) : null, parcel.readString(), C1124a.m7920a(parcel.readStrongBinder()), parcel.readInt());
                    parcel2.writeNoException();
                    if (createBannerAdManager != null) {
                        iBinder = createBannerAdManager.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    createBannerAdManager = createInterstitialAdManager(C0701a.m4966a(parcel.readStrongBinder()), parcel.readInt() != 0 ? (zzeg) zzeg.CREATOR.createFromParcel(parcel) : null, parcel.readString(), C1124a.m7920a(parcel.readStrongBinder()), parcel.readInt());
                    parcel2.writeNoException();
                    if (createBannerAdManager != null) {
                        iBinder = createBannerAdManager.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    azv createAdLoaderBuilder = createAdLoaderBuilder(C0701a.m4966a(parcel.readStrongBinder()), parcel.readString(), C1124a.m7920a(parcel.readStrongBinder()), parcel.readInt());
                    parcel2.writeNoException();
                    if (createAdLoaderBuilder != null) {
                        iBinder = createAdLoaderBuilder.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    mobileAdsSettingsManager = getMobileAdsSettingsManager(C0701a.m4966a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    if (mobileAdsSettingsManager != null) {
                        iBinder = mobileAdsSettingsManager.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    bce createNativeAdViewDelegate = createNativeAdViewDelegate(C0701a.m4966a(parcel.readStrongBinder()), C0701a.m4966a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    if (createNativeAdViewDelegate != null) {
                        iBinder = createNativeAdViewDelegate.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    bio createRewardedVideoAd = createRewardedVideoAd(C0701a.m4966a(parcel.readStrongBinder()), C1124a.m7920a(parcel.readStrongBinder()), parcel.readInt());
                    parcel2.writeNoException();
                    if (createRewardedVideoAd != null) {
                        iBinder = createRewardedVideoAd.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 7:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    bgd createInAppPurchaseManager = createInAppPurchaseManager(C0701a.m4966a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    if (createInAppPurchaseManager != null) {
                        iBinder = createInAppPurchaseManager.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 8:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    bfw createAdOverlay = createAdOverlay(C0701a.m4966a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    if (createAdOverlay != null) {
                        iBinder = createAdOverlay.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 9:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    mobileAdsSettingsManager = getMobileAdsSettingsManagerWithClientJarVersion(C0701a.m4966a(parcel.readStrongBinder()), parcel.readInt());
                    parcel2.writeNoException();
                    if (mobileAdsSettingsManager != null) {
                        iBinder = mobileAdsSettingsManager.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 10:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    createBannerAdManager = createSearchAdManager(C0701a.m4966a(parcel.readStrongBinder()), parcel.readInt() != 0 ? (zzeg) zzeg.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    if (createBannerAdManager != null) {
                        iBinder = createBannerAdManager.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.ads.internal.client.IClientApi");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    azv createAdLoaderBuilder(aqq aqq, String str, bex bex, int i) throws RemoteException;

    bfw createAdOverlay(aqq aqq) throws RemoteException;

    azx createBannerAdManager(aqq aqq, zzeg zzeg, String str, bex bex, int i) throws RemoteException;

    bgd createInAppPurchaseManager(aqq aqq) throws RemoteException;

    azx createInterstitialAdManager(aqq aqq, zzeg zzeg, String str, bex bex, int i) throws RemoteException;

    bce createNativeAdViewDelegate(aqq aqq, aqq aqq2) throws RemoteException;

    bio createRewardedVideoAd(aqq aqq, bex bex, int i) throws RemoteException;

    azx createSearchAdManager(aqq aqq, zzeg zzeg, String str, int i) throws RemoteException;

    bac getMobileAdsSettingsManager(aqq aqq) throws RemoteException;

    bac getMobileAdsSettingsManagerWithClientJarVersion(aqq aqq, int i) throws RemoteException;
}
