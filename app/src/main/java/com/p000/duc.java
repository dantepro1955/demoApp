package com.p000;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* compiled from: CompositeException */
/* renamed from: duc */
public final class duc extends RuntimeException {
    private static final long serialVersionUID = 3026362227162912146L;
    /* renamed from: a */
    private final List<Throwable> f16845a;
    /* renamed from: b */
    private final String f16846b;
    /* renamed from: c */
    private Throwable f16847c;

    @Deprecated
    public duc(String str, Collection<? extends Throwable> collection) {
        Collection linkedHashSet = new LinkedHashSet();
        List arrayList = new ArrayList();
        if (collection != null) {
            for (Throwable th : collection) {
                if (th instanceof duc) {
                    linkedHashSet.addAll(((duc) th).m21094a());
                } else if (th != null) {
                    linkedHashSet.add(th);
                } else {
                    linkedHashSet.add(new NullPointerException());
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException());
        }
        arrayList.addAll(linkedHashSet);
        this.f16845a = Collections.unmodifiableList(arrayList);
        this.f16846b = this.f16845a.size() + " exceptions occurred. ";
    }

    public duc(Collection<? extends Throwable> collection) {
        this(null, collection);
    }

    public duc(Throwable... thArr) {
        Collection linkedHashSet = new LinkedHashSet();
        List arrayList = new ArrayList();
        if (thArr != null) {
            for (Object obj : thArr) {
                if (obj instanceof duc) {
                    linkedHashSet.addAll(((duc) obj).m21094a());
                } else if (obj != null) {
                    linkedHashSet.add(obj);
                } else {
                    linkedHashSet.add(new NullPointerException());
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException());
        }
        arrayList.addAll(linkedHashSet);
        this.f16845a = Collections.unmodifiableList(arrayList);
        this.f16846b = this.f16845a.size() + " exceptions occurred. ";
    }

    /* renamed from: a */
    public List<Throwable> m21094a() {
        return this.f16845a;
    }

    public String getMessage() {
        return this.f16846b;
    }

    public synchronized Throwable getCause() {
        if (this.f16847c == null) {
            Throwable duc_a = new duc$a();
            Set hashSet = new HashSet();
            Throwable th = duc_a;
            for (Throwable th2 : this.f16845a) {
                if (!hashSet.contains(th2)) {
                    hashSet.add(th2);
                    Throwable th3 = th2;
                    for (Throwable th22 : m21090a(th22)) {
                        if (hashSet.contains(th22)) {
                            th3 = new RuntimeException("Duplicate found in causal chain so cropping to prevent loop ...");
                        } else {
                            hashSet.add(th22);
                        }
                    }
                    try {
                        th.initCause(th3);
                    } catch (Throwable th4) {
                    }
                    th = m21093b(th);
                }
            }
            this.f16847c = duc_a;
        }
        return this.f16847c;
    }

    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public void printStackTrace(PrintStream printStream) {
        m21091a(new duc$c(printStream));
    }

    public void printStackTrace(PrintWriter printWriter) {
        m21091a(new duc$d(printWriter));
    }

    /* renamed from: a */
    private void m21091a(duc$b duc_b) {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append(this).append('\n');
        for (Object append : getStackTrace()) {
            stringBuilder.append("\tat ").append(append).append('\n');
        }
        int i = 1;
        for (Throwable th : this.f16845a) {
            stringBuilder.append("  ComposedException ").append(i).append(" :\n");
            m21092a(stringBuilder, th, "\t");
            i++;
        }
        synchronized (duc_b.a()) {
            duc_b.a(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    private void m21092a(StringBuilder stringBuilder, Throwable th, String str) {
        stringBuilder.append(str).append(th).append('\n');
        for (Object append : th.getStackTrace()) {
            stringBuilder.append("\t\tat ").append(append).append('\n');
        }
        if (th.getCause() != null) {
            stringBuilder.append("\tCaused by: ");
            m21092a(stringBuilder, th.getCause(), "");
        }
    }

    /* renamed from: a */
    private List<Throwable> m21090a(Throwable th) {
        List<Throwable> arrayList = new ArrayList();
        Throwable cause = th.getCause();
        if (cause == null || cause == th) {
            return arrayList;
        }
        while (true) {
            arrayList.add(cause);
            Throwable cause2 = cause.getCause();
            if (cause2 != null && cause2 != cause) {
                cause = cause.getCause();
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    private Throwable m21093b(Throwable th) {
        Throwable cause = th.getCause();
        if (cause == null || cause == th) {
            return th;
        }
        while (true) {
            Throwable cause2 = cause.getCause();
            if (cause2 == null) {
                return cause;
            }
            if (cause2 == cause) {
                return cause;
            }
            cause = cause.getCause();
        }
    }
}
