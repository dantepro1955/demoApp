package com.p000;

import com.mopub.nativeads.MoPubNativeAdPositioning.MoPubClientPositioning;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractQueue;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: LinkedBlockingDeque */
/* renamed from: cxt */
public class cxt<E> extends AbstractQueue<E> implements cxq<E>, Serializable {
    private static final long serialVersionUID = -387911632671998426L;
    /* renamed from: a */
    transient C4659c<E> f20622a;
    /* renamed from: b */
    transient C4659c<E> f20623b;
    /* renamed from: c */
    final ReentrantLock f20624c;
    /* renamed from: d */
    private transient int f20625d;
    /* renamed from: e */
    private final int f20626e;
    /* renamed from: f */
    private final Condition f20627f;
    /* renamed from: g */
    private final Condition f20628g;

    /* compiled from: LinkedBlockingDeque */
    /* renamed from: cxt$a */
    abstract class C4657a implements Iterator<E> {
        /* renamed from: a */
        C4659c<E> f20629a;
        /* renamed from: b */
        E f20630b;
        /* renamed from: c */
        final /* synthetic */ cxt f20631c;
        /* renamed from: d */
        private C4659c<E> f20632d;

        /* renamed from: a */
        abstract C4659c<E> mo4212a();

        /* renamed from: a */
        abstract C4659c<E> mo4213a(C4659c<E> c4659c);

        C4657a(cxt cxt) {
            this.f20631c = cxt;
            ReentrantLock reentrantLock = cxt.f20624c;
            reentrantLock.lock();
            try {
                this.f20629a = mo4212a();
                this.f20630b = this.f20629a == null ? null : this.f20629a.f20634a;
            } finally {
                reentrantLock.unlock();
            }
        }

        /* renamed from: b */
        private C4659c<E> m25558b(C4659c<E> c4659c) {
            while (true) {
                C4659c<E> a = mo4213a(c4659c);
                if (a == null) {
                    return null;
                }
                if (a.f20634a != null) {
                    return a;
                }
                if (a == c4659c) {
                    return mo4212a();
                }
                c4659c = a;
            }
        }

        /* renamed from: b */
        void m25561b() {
            ReentrantLock reentrantLock = this.f20631c.f20624c;
            reentrantLock.lock();
            try {
                this.f20629a = m25558b(this.f20629a);
                this.f20630b = this.f20629a == null ? null : this.f20629a.f20634a;
            } finally {
                reentrantLock.unlock();
            }
        }

        public boolean hasNext() {
            return this.f20629a != null;
        }

        public E next() {
            if (this.f20629a == null) {
                throw new NoSuchElementException();
            }
            this.f20632d = this.f20629a;
            E e = this.f20630b;
            m25561b();
            return e;
        }

        public void remove() {
            C4659c c4659c = this.f20632d;
            if (c4659c == null) {
                throw new IllegalStateException();
            }
            this.f20632d = null;
            ReentrantLock reentrantLock = this.f20631c.f20624c;
            reentrantLock.lock();
            try {
                if (c4659c.f20634a != null) {
                    this.f20631c.m25547a(c4659c);
                }
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
            }
        }
    }

    /* compiled from: LinkedBlockingDeque */
    /* renamed from: cxt$b */
    class C4658b extends C4657a {
        /* renamed from: d */
        final /* synthetic */ cxt f20633d;

        private C4658b(cxt cxt) {
            this.f20633d = cxt;
            super(cxt);
        }

        /* renamed from: a */
        C4659c<E> mo4212a() {
            return this.f20633d.f20622a;
        }

        /* renamed from: a */
        C4659c<E> mo4213a(C4659c<E> c4659c) {
            return c4659c.f20636c;
        }
    }

    /* compiled from: LinkedBlockingDeque */
    /* renamed from: cxt$c */
    static final class C4659c<E> {
        /* renamed from: a */
        E f20634a;
        /* renamed from: b */
        C4659c<E> f20635b;
        /* renamed from: c */
        C4659c<E> f20636c;

        C4659c(E e) {
            this.f20634a = e;
        }
    }

    public cxt() {
        this(MoPubClientPositioning.NO_REPEAT);
    }

    public cxt(int i) {
        this.f20624c = new ReentrantLock();
        this.f20627f = this.f20624c.newCondition();
        this.f20628g = this.f20624c.newCondition();
        if (i <= 0) {
            throw new IllegalArgumentException();
        }
        this.f20626e = i;
    }

    /* renamed from: b */
    private boolean m25541b(C4659c<E> c4659c) {
        if (this.f20625d >= this.f20626e) {
            return false;
        }
        C4659c c4659c2 = this.f20622a;
        c4659c.f20636c = c4659c2;
        this.f20622a = c4659c;
        if (this.f20623b == null) {
            this.f20623b = c4659c;
        } else {
            c4659c2.f20635b = c4659c;
        }
        this.f20625d++;
        this.f20627f.signal();
        return true;
    }

    /* renamed from: c */
    private boolean m25542c(C4659c<E> c4659c) {
        if (this.f20625d >= this.f20626e) {
            return false;
        }
        C4659c c4659c2 = this.f20623b;
        c4659c.f20635b = c4659c2;
        this.f20623b = c4659c;
        if (this.f20622a == null) {
            this.f20622a = c4659c;
        } else {
            c4659c2.f20636c = c4659c;
        }
        this.f20625d++;
        this.f20627f.signal();
        return true;
    }

    /* renamed from: f */
    private E m25543f() {
        C4659c c4659c = this.f20622a;
        if (c4659c == null) {
            return null;
        }
        C4659c c4659c2 = c4659c.f20636c;
        E e = c4659c.f20634a;
        c4659c.f20634a = null;
        c4659c.f20636c = c4659c;
        this.f20622a = c4659c2;
        if (c4659c2 == null) {
            this.f20623b = null;
        } else {
            c4659c2.f20635b = null;
        }
        this.f20625d--;
        this.f20628g.signal();
        return e;
    }

    /* renamed from: g */
    private E m25544g() {
        C4659c c4659c = this.f20623b;
        if (c4659c == null) {
            return null;
        }
        C4659c c4659c2 = c4659c.f20635b;
        E e = c4659c.f20634a;
        c4659c.f20634a = null;
        c4659c.f20635b = c4659c;
        this.f20623b = c4659c2;
        if (c4659c2 == null) {
            this.f20622a = null;
        } else {
            c4659c2.f20636c = null;
        }
        this.f20625d--;
        this.f20628g.signal();
        return e;
    }

    /* renamed from: a */
    void m25547a(C4659c<E> c4659c) {
        C4659c c4659c2 = c4659c.f20635b;
        C4659c c4659c3 = c4659c.f20636c;
        if (c4659c2 == null) {
            m25543f();
        } else if (c4659c3 == null) {
            m25544g();
        } else {
            c4659c2.f20636c = c4659c3;
            c4659c3.f20635b = c4659c2;
            c4659c.f20634a = null;
            this.f20625d--;
            this.f20628g.signal();
        }
    }

    /* renamed from: a */
    public void m25548a(E e) {
        if (!m25553c((Object) e)) {
            throw new IllegalStateException("Deque full");
        }
    }

    /* renamed from: b */
    public boolean m25551b(E e) {
        if (e == null) {
            throw new NullPointerException();
        }
        C4659c c4659c = new C4659c(e);
        ReentrantLock reentrantLock = this.f20624c;
        reentrantLock.lock();
        try {
            boolean b = m25541b(c4659c);
            return b;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: c */
    public boolean m25553c(E e) {
        if (e == null) {
            throw new NullPointerException();
        }
        C4659c c4659c = new C4659c(e);
        ReentrantLock reentrantLock = this.f20624c;
        reentrantLock.lock();
        try {
            boolean c = m25542c(c4659c);
            return c;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: d */
    public void m25555d(E e) throws InterruptedException {
        if (e == null) {
            throw new NullPointerException();
        }
        C4659c c4659c = new C4659c(e);
        ReentrantLock reentrantLock = this.f20624c;
        reentrantLock.lock();
        while (!m25542c(c4659c)) {
            try {
                this.f20628g.await();
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    /* renamed from: a */
    public boolean m25549a(E e, long j, TimeUnit timeUnit) throws InterruptedException {
        if (e == null) {
            throw new NullPointerException();
        }
        C4659c c4659c = new C4659c(e);
        long toNanos = timeUnit.toNanos(j);
        ReentrantLock reentrantLock = this.f20624c;
        reentrantLock.lockInterruptibly();
        while (!m25542c(c4659c)) {
            try {
                if (toNanos <= 0) {
                    return false;
                }
                toNanos = this.f20628g.awaitNanos(toNanos);
            } finally {
                reentrantLock.unlock();
            }
        }
        reentrantLock.unlock();
        return true;
    }

    /* renamed from: a */
    public E m25545a() {
        E b = m25550b();
        if (b != null) {
            return b;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: b */
    public E m25550b() {
        ReentrantLock reentrantLock = this.f20624c;
        reentrantLock.lock();
        try {
            E f = m25543f();
            return f;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: c */
    public E m25552c() throws InterruptedException {
        E f;
        ReentrantLock reentrantLock = this.f20624c;
        reentrantLock.lock();
        while (true) {
            try {
                f = m25543f();
                if (f != null) {
                    break;
                }
                this.f20627f.await();
            } finally {
                reentrantLock.unlock();
            }
        }
        return f;
    }

    /* renamed from: a */
    public E m25546a(long j, TimeUnit timeUnit) throws InterruptedException {
        long toNanos = timeUnit.toNanos(j);
        ReentrantLock reentrantLock = this.f20624c;
        reentrantLock.lockInterruptibly();
        long j2 = toNanos;
        while (true) {
            try {
                E f = m25543f();
                if (f != null) {
                    reentrantLock.unlock();
                    return f;
                } else if (j2 <= 0) {
                    break;
                } else {
                    j2 = this.f20627f.awaitNanos(j2);
                }
            } finally {
                reentrantLock.unlock();
            }
        }
        return null;
    }

    /* renamed from: d */
    public E m25554d() {
        E e = m25556e();
        if (e != null) {
            return e;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: e */
    public E m25556e() {
        ReentrantLock reentrantLock = this.f20624c;
        reentrantLock.lock();
        try {
            E e = this.f20622a == null ? null : this.f20622a.f20634a;
            reentrantLock.unlock();
            return e;
        } catch (Throwable th) {
            reentrantLock.unlock();
        }
    }

    /* renamed from: e */
    public boolean m25557e(Object obj) {
        if (obj == null) {
            return false;
        }
        ReentrantLock reentrantLock = this.f20624c;
        reentrantLock.lock();
        try {
            for (C4659c c4659c = this.f20622a; c4659c != null; c4659c = c4659c.f20636c) {
                if (obj.equals(c4659c.f20634a)) {
                    m25547a(c4659c);
                    return true;
                }
            }
            reentrantLock.unlock();
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public boolean add(E e) {
        m25548a((Object) e);
        return true;
    }

    public boolean offer(E e) {
        return m25553c((Object) e);
    }

    public void put(E e) throws InterruptedException {
        m25555d(e);
    }

    public boolean offer(E e, long j, TimeUnit timeUnit) throws InterruptedException {
        return m25549a(e, j, timeUnit);
    }

    public E remove() {
        return m25545a();
    }

    public E poll() {
        return m25550b();
    }

    public E take() throws InterruptedException {
        return m25552c();
    }

    public E poll(long j, TimeUnit timeUnit) throws InterruptedException {
        return m25546a(j, timeUnit);
    }

    public E element() {
        return m25554d();
    }

    public E peek() {
        return m25556e();
    }

    public int remainingCapacity() {
        ReentrantLock reentrantLock = this.f20624c;
        reentrantLock.lock();
        try {
            int i = this.f20626e - this.f20625d;
            return i;
        } finally {
            reentrantLock.unlock();
        }
    }

    public int drainTo(Collection<? super E> collection) {
        return drainTo(collection, MoPubClientPositioning.NO_REPEAT);
    }

    public int drainTo(Collection<? super E> collection, int i) {
        if (collection == null) {
            throw new NullPointerException();
        } else if (collection == this) {
            throw new IllegalArgumentException();
        } else {
            ReentrantLock reentrantLock = this.f20624c;
            reentrantLock.lock();
            try {
                int min = Math.min(i, this.f20625d);
                for (int i2 = 0; i2 < min; i2++) {
                    collection.add(this.f20622a.f20634a);
                    m25543f();
                }
                return min;
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public boolean remove(Object obj) {
        return m25557e(obj);
    }

    public int size() {
        ReentrantLock reentrantLock = this.f20624c;
        reentrantLock.lock();
        try {
            int i = this.f20625d;
            return i;
        } finally {
            reentrantLock.unlock();
        }
    }

    public boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        ReentrantLock reentrantLock = this.f20624c;
        reentrantLock.lock();
        try {
            for (C4659c c4659c = this.f20622a; c4659c != null; c4659c = c4659c.f20636c) {
                if (obj.equals(c4659c.f20634a)) {
                    return true;
                }
            }
            reentrantLock.unlock();
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public Object[] toArray() {
        ReentrantLock reentrantLock = this.f20624c;
        reentrantLock.lock();
        try {
            Object[] objArr = new Object[this.f20625d];
            int i = 0;
            C4659c c4659c = this.f20622a;
            while (c4659c != null) {
                int i2 = i + 1;
                objArr[i] = c4659c.f20634a;
                c4659c = c4659c.f20636c;
                i = i2;
            }
            return objArr;
        } finally {
            reentrantLock.unlock();
        }
    }

    public <T> T[] toArray(T[] tArr) {
        ReentrantLock reentrantLock = this.f20624c;
        reentrantLock.lock();
        try {
            if (tArr.length < this.f20625d) {
                tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f20625d);
            }
            int i = 0;
            C4659c c4659c = this.f20622a;
            while (c4659c != null) {
                int i2 = i + 1;
                tArr[i] = c4659c.f20634a;
                c4659c = c4659c.f20636c;
                i = i2;
            }
            if (tArr.length > i) {
                tArr[i] = null;
            }
            reentrantLock.unlock();
            return tArr;
        } catch (Throwable th) {
            reentrantLock.unlock();
        }
    }

    public String toString() {
        ReentrantLock reentrantLock = this.f20624c;
        reentrantLock.lock();
        try {
            String str;
            C4659c c4659c = this.f20622a;
            if (c4659c == null) {
                str = "[]";
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append('[');
                C4659c c4659c2 = c4659c;
                while (true) {
                    Object obj = c4659c2.f20634a;
                    if (obj == this) {
                        obj = "(this Collection)";
                    }
                    stringBuilder.append(obj);
                    c4659c = c4659c2.f20636c;
                    if (c4659c == null) {
                        break;
                    }
                    stringBuilder.append(',').append(' ');
                    c4659c2 = c4659c;
                }
                str = stringBuilder.append(']').toString();
                reentrantLock.unlock();
            }
            return str;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void clear() {
        ReentrantLock reentrantLock = this.f20624c;
        reentrantLock.lock();
        try {
            C4659c c4659c = this.f20622a;
            while (c4659c != null) {
                c4659c.f20634a = null;
                C4659c c4659c2 = c4659c.f20636c;
                c4659c.f20635b = null;
                c4659c.f20636c = null;
                c4659c = c4659c2;
            }
            this.f20623b = null;
            this.f20622a = null;
            this.f20625d = 0;
            this.f20628g.signalAll();
        } finally {
            reentrantLock.unlock();
        }
    }

    public Iterator<E> iterator() {
        return new C4658b();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        ReentrantLock reentrantLock = this.f20624c;
        reentrantLock.lock();
        try {
            objectOutputStream.defaultWriteObject();
            for (C4659c c4659c = this.f20622a; c4659c != null; c4659c = c4659c.f20636c) {
                objectOutputStream.writeObject(c4659c.f20634a);
            }
            objectOutputStream.writeObject(null);
        } finally {
            reentrantLock.unlock();
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.f20625d = 0;
        this.f20622a = null;
        this.f20623b = null;
        while (true) {
            Object readObject = objectInputStream.readObject();
            if (readObject != null) {
                add(readObject);
            } else {
                return;
            }
        }
    }
}
