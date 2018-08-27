package com.p000;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: Okio */
/* renamed from: dsa */
public final class dsa {
    /* renamed from: a */
    static final Logger f22784a = Logger.getLogger(dsa.class.getName());

    /* compiled from: Okio */
    /* renamed from: dsa$3 */
    static class C50663 implements dsg {
        C50663() {
        }

        public void write(drq drq, long j) throws IOException {
            drq.mo4590h(j);
        }

        public void flush() throws IOException {
        }

        public dsi timeout() {
            return dsi.NONE;
        }

        public void close() throws IOException {
        }
    }

    private dsa() {
    }

    /* renamed from: a */
    public static drs m29051a(dsh dsh) {
        return new dsc(dsh);
    }

    /* renamed from: a */
    public static drr m29050a(dsg dsg) {
        return new dsb(dsg);
    }

    /* renamed from: a */
    public static dsg m29053a(OutputStream outputStream) {
        return dsa.m29054a(outputStream, new dsi());
    }

    /* renamed from: a */
    private static dsg m29054a(final OutputStream outputStream, final dsi dsi) {
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        } else if (dsi != null) {
            return new dsg() {
                public void write(drq drq, long j) throws IOException {
                    dsj.m29130a(drq.f22760b, 0, j);
                    while (j > 0) {
                        dsi.throwIfReached();
                        dsd dsd = drq.f22759a;
                        int min = (int) Math.min(j, (long) (dsd.f22794c - dsd.f22793b));
                        outputStream.write(dsd.f22792a, dsd.f22793b, min);
                        dsd.f22793b += min;
                        j -= (long) min;
                        drq.f22760b -= (long) min;
                        if (dsd.f22793b == dsd.f22794c) {
                            drq.f22759a = dsd.m29105a();
                            dse.m29111a(dsd);
                        }
                    }
                }

                public void flush() throws IOException {
                    outputStream.flush();
                }

                public void close() throws IOException {
                    outputStream.close();
                }

                public dsi timeout() {
                    return dsi;
                }

                public String toString() {
                    return "sink(" + outputStream + ")";
                }
            };
        } else {
            throw new IllegalArgumentException("timeout == null");
        }
    }

    /* renamed from: a */
    public static dsg m29055a(Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        dsi c = dsa.m29062c(socket);
        return c.sink(dsa.m29054a(socket.getOutputStream(), c));
    }

    /* renamed from: a */
    public static dsh m29057a(InputStream inputStream) {
        return dsa.m29058a(inputStream, new dsi());
    }

    /* renamed from: a */
    private static dsh m29058a(final InputStream inputStream, final dsi dsi) {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        } else if (dsi != null) {
            return new dsh() {
                public long read(drq drq, long j) throws IOException {
                    if (j < 0) {
                        throw new IllegalArgumentException("byteCount < 0: " + j);
                    } else if (j == 0) {
                        return 0;
                    } else {
                        try {
                            dsi.throwIfReached();
                            dsd e = drq.m28981e(1);
                            int read = inputStream.read(e.f22792a, e.f22794c, (int) Math.min(j, (long) (8192 - e.f22794c)));
                            if (read == -1) {
                                return -1;
                            }
                            e.f22794c += read;
                            drq.f22760b += (long) read;
                            return (long) read;
                        } catch (AssertionError e2) {
                            if (dsa.m29059a(e2)) {
                                throw new IOException(e2);
                            }
                            throw e2;
                        }
                    }
                }

                public void close() throws IOException {
                    inputStream.close();
                }

                public dsi timeout() {
                    return dsi;
                }

                public String toString() {
                    return "source(" + inputStream + ")";
                }
            };
        } else {
            throw new IllegalArgumentException("timeout == null");
        }
    }

    /* renamed from: a */
    public static dsh m29056a(File file) throws FileNotFoundException {
        if (file != null) {
            return dsa.m29057a(new FileInputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    /* renamed from: b */
    public static dsg m29060b(File file) throws FileNotFoundException {
        if (file != null) {
            return dsa.m29053a(new FileOutputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    /* renamed from: c */
    public static dsg m29063c(File file) throws FileNotFoundException {
        if (file != null) {
            return dsa.m29053a(new FileOutputStream(file, true));
        }
        throw new IllegalArgumentException("file == null");
    }

    /* renamed from: a */
    public static dsg m29052a() {
        return new C50663();
    }

    /* renamed from: b */
    public static dsh m29061b(Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        dsi c = dsa.m29062c(socket);
        return c.source(dsa.m29058a(socket.getInputStream(), c));
    }

    /* renamed from: c */
    private static dro m29062c(final Socket socket) {
        return new dro() {
            protected IOException newTimeoutException(IOException iOException) {
                IOException socketTimeoutException = new SocketTimeoutException("timeout");
                if (iOException != null) {
                    socketTimeoutException.initCause(iOException);
                }
                return socketTimeoutException;
            }

            protected void timedOut() {
                try {
                    socket.close();
                } catch (Throwable e) {
                    dsa.f22784a.log(Level.WARNING, "Failed to close timed out socket " + socket, e);
                } catch (AssertionError e2) {
                    if (dsa.m29059a(e2)) {
                        dsa.f22784a.log(Level.WARNING, "Failed to close timed out socket " + socket, e2);
                        return;
                    }
                    throw e2;
                }
            }
        };
    }

    /* renamed from: a */
    static boolean m29059a(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }
}
