package com.p000;

import com.mopub.nativeads.MoPubNativeAdPositioning.MoPubClientPositioning;
import java.util.concurrent.TimeUnit;
import rx.schedulers.Schedulers;

/* compiled from: Observable */
/* renamed from: dtp */
public class dtp<T> {
    /* renamed from: a */
    final C5092a<T> f22925a;

    /* compiled from: Observable */
    /* renamed from: dtp$c */
    public interface C4531c<T, R> extends duo<dtp<T>, dtp<R>> {
    }

    /* compiled from: Observable */
    /* renamed from: dtp$a */
    public interface C5092a<T> extends dul<dtv<? super T>> {
    }

    /* compiled from: Observable */
    /* renamed from: dtp$b */
    public interface C5093b<R, T> extends duo<dtv<? super R>, dtv<? super T>> {
    }

    protected dtp(C5092a<T> c5092a) {
        this.f22925a = c5092a;
    }

    /* renamed from: a */
    public static <T> dtp<T> m29310a(C5092a<T> c5092a) {
        return new dtp(dyg.m29842a((C5092a) c5092a));
    }

    /* renamed from: a */
    public final <R> dtp<R> m29323a(C5093b<? extends R, ? super T> c5093b) {
        return dtp.m29310a(new dvc(this.f22925a, c5093b));
    }

    /* renamed from: a */
    public <R> dtp<R> m29324a(C4531c<? super T, ? extends R> c4531c) {
        return (dtp) c4531c.mo4103a(this);
    }

    /* renamed from: b */
    public dtt<T> m29335b() {
        return new dtt(dvg.m29484a(this));
    }

    /* renamed from: c */
    public dtm m29338c() {
        return dtm.m29290a(this);
    }

    /* renamed from: a */
    public static <T> dtp<T> m29311a(dtp<? extends dtp<? extends T>> dtp) {
        return dtp.m29330a(dxb.m29736b());
    }

    /* renamed from: a */
    public static <T> dtp<T> m29312a(dtp<? extends T> dtp, dtp<? extends T> dtp2) {
        return dtp.m29311a(dtp.m29316a((Object) dtp, (Object) dtp2));
    }

    /* renamed from: a */
    public static <T> dtp<T> m29314a(dun<dtp<T>> dun) {
        return dtp.m29310a(new duy(dun));
    }

    /* renamed from: d */
    public static <T> dtp<T> m29321d() {
        return duv.m29438a();
    }

    /* renamed from: a */
    public static <T> dtp<T> m29317a(Throwable th) {
        return dtp.m29310a(new dvi(th));
    }

    /* renamed from: a */
    public static <T> dtp<T> m29318a(T[] tArr) {
        int length = tArr.length;
        if (length == 0) {
            return dtp.m29321d();
        }
        if (length == 1) {
            return dtp.m29315a(tArr[0]);
        }
        return dtp.m29310a(new dvb(tArr));
    }

    /* renamed from: a */
    public static <T> dtp<T> m29315a(T t) {
        return dwz.m29699b(t);
    }

    /* renamed from: a */
    public static <T> dtp<T> m29316a(T t, T t2) {
        return dtp.m29318a(new Object[]{t, t2});
    }

    /* renamed from: b */
    public static <T> dtp<T> m29320b(dtp<? extends dtp<? extends T>> dtp) {
        if (dtp.getClass() == dwz.class) {
            return ((dwz) dtp).m29702g(dxb.m29736b());
        }
        return dtp.m29323a(dvn.m29517a(false));
    }

    /* renamed from: a */
    public static dtp<Integer> m29307a(int i, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("Count can not be negative");
        } else if (i2 == 0) {
            return dtp.m29321d();
        } else {
            if (i > (MoPubClientPositioning.NO_REPEAT - i2) + 1) {
                throw new IllegalArgumentException("start + count can not exceed Integer.MAX_VALUE");
            } else if (i2 == 1) {
                return dtp.m29315a(Integer.valueOf(i));
            } else {
                return dtp.m29310a(new dve(i, (i2 - 1) + i));
            }
        }
    }

    /* renamed from: a */
    public static dtp<Long> m29308a(long j, TimeUnit timeUnit) {
        return dtp.m29309a(j, timeUnit, Schedulers.computation());
    }

    /* renamed from: a */
    public static dtp<Long> m29309a(long j, TimeUnit timeUnit, dts dts) {
        return dtp.m29310a(new dvj(j, timeUnit, dts));
    }

    /* renamed from: a */
    public static <T1, T2, R> dtp<R> m29313a(dtp<? extends T1> dtp, dtp<? extends T2> dtp2, dup<? super T1, ? super T2, ? extends R> dup) {
        return dtp.m29315a(new dtp[]{dtp, dtp2}).m29323a(new dvv(dup));
    }

    /* renamed from: e */
    public final dtp<T> m29342e() {
        return m29323a(dvl.m29492a());
    }

    /* renamed from: a */
    public final <R> dtp<R> m29330a(duo<? super T, ? extends dtp<? extends R>> duo) {
        if (this instanceof dwz) {
            return ((dwz) this).m29702g(duo);
        }
        return dtp.m29310a(new dux(this, duo, 2, 0));
    }

    /* renamed from: c */
    public final dtp<T> m29339c(dtp<? extends T> dtp) {
        return dtp.m29312a(this, (dtp) dtp);
    }

    /* renamed from: a */
    public final dtp<T> m29329a(dul<? super T> dul) {
        return dtp.m29310a(new duz(this, new dwr(dul, dum.m29416a(), dum.m29416a())));
    }

    /* renamed from: b */
    public final dtp<T> m29334b(duo<? super T, Boolean> duo) {
        return dtp.m29310a(new dva(this, duo));
    }

    /* renamed from: c */
    public final <R> dtp<R> m29340c(duo<? super T, ? extends dtp<? extends R>> duo) {
        if (getClass() == dwz.class) {
            return ((dwz) this).m29702g(duo);
        }
        return dtp.m29320b(m29341d(duo));
    }

    /* renamed from: f */
    public final dtp<T> m29344f() {
        return m29323a(dvm.m29495a());
    }

    /* renamed from: g */
    public final dtp<T> m29346g() {
        return m29322a(1).m29349j();
    }

    /* renamed from: d */
    public final <R> dtp<R> m29341d(duo<? super T, ? extends R> duo) {
        return dtp.m29310a(new dvd(this, duo));
    }

    /* renamed from: a */
    public final dtp<T> m29326a(dts dts) {
        return m29327a(dts, dwx.f23363b);
    }

    /* renamed from: a */
    public final dtp<T> m29327a(dts dts, int i) {
        return m29328a(dts, false, i);
    }

    /* renamed from: a */
    public final dtp<T> m29328a(dts dts, boolean z, int i) {
        if (this instanceof dwz) {
            return ((dwz) this).m29701c(dts);
        }
        return m29323a(new dvo(dts, z, i));
    }

    /* renamed from: h */
    public final dtp<T> m29347h() {
        return m29323a(dvp.m29536a());
    }

    /* renamed from: i */
    public final dtp<T> m29348i() {
        return m29323a(dvq.m29542a());
    }

    /* renamed from: e */
    public final dtp<T> m29343e(duo<? super Throwable, ? extends T> duo) {
        return m29323a(dvr.m29547a((duo) duo));
    }

    /* renamed from: f */
    public final dtp<T> m29345f(duo<? super dtp<? extends Throwable>, ? extends dtp<?>> duo) {
        return dvf.m29482a(this, dwv.m29673a(duo));
    }

    /* renamed from: j */
    public final dtp<T> m29349j() {
        return m29323a(dvs.m29550a());
    }

    /* renamed from: b */
    public final dtw m29337b(dul<? super T> dul) {
        if (dul != null) {
            return m29336b(new dws(dul, dwv.f23358g, dum.m29416a()));
        }
        throw new IllegalArgumentException("onNext can not be null");
    }

    /* renamed from: a */
    public final dtw m29332a(dul<? super T> dul, dul<Throwable> dul2) {
        if (dul == null) {
            throw new IllegalArgumentException("onNext can not be null");
        } else if (dul2 != null) {
            return m29336b(new dws(dul, dul2, dum.m29416a()));
        } else {
            throw new IllegalArgumentException("onError can not be null");
        }
    }

    /* renamed from: a */
    public final dtw m29331a(dtv<? super T> dtv) {
        try {
            dtv.onStart();
            dyg.m29843a(this, this.f22925a).call(dtv);
            return dyg.m29847a((dtw) dtv);
        } catch (Throwable th) {
            dud.m29409b(th);
            dyg.m29857c(new dug("Error occurred attempting to subscribe [" + th.getMessage() + "] and then again while trying to pass to onError.", th));
        }
    }

    /* renamed from: b */
    public final dtw m29336b(dtv<? super T> dtv) {
        return dtp.m29319a((dtv) dtv, this);
    }

    /* renamed from: a */
    static <T> dtw m29319a(dtv<? super T> dtv, dtp<T> dtp) {
        if (dtv == null) {
            throw new IllegalArgumentException("subscriber can not be null");
        } else if (dtp.f22925a == null) {
            throw new IllegalStateException("onSubscribe function can not be null.");
        } else {
            dtw dya;
            dtv.onStart();
            if (!(dtv instanceof dya)) {
                dya = new dya(dtv);
            }
            try {
                dyg.m29843a((dtp) dtp, dtp.f22925a).call(dya);
                return dyg.m29847a(dya);
            } catch (Throwable th) {
                dud.m29409b(th);
                dyg.m29857c(new dug("Error occurred attempting to subscribe [" + th.getMessage() + "] and then again while trying to pass to onError.", th));
            }
        }
    }

    /* renamed from: b */
    public final dtp<T> m29333b(dts dts) {
        if (this instanceof dwz) {
            return ((dwz) this).m29701c(dts);
        }
        return dtp.m29310a(new dvt(this, dts));
    }

    /* renamed from: a */
    public final dtp<T> m29322a(int i) {
        if (i == 0) {
            return m29344f();
        }
        if (i == 1) {
            return dtp.m29310a(new dvh(this));
        }
        return m29323a(new dvu(i));
    }

    /* renamed from: a */
    public final <T2, R> dtp<R> m29325a(dtp<? extends T2> dtp, dup<? super T, ? super T2, ? extends R> dup) {
        return dtp.m29313a(this, (dtp) dtp, (dup) dup);
    }
}
