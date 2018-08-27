package com.p000;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;

/* compiled from: ClsFileOutputStream */
/* renamed from: abf */
class abf extends FileOutputStream {
    /* renamed from: a */
    public static final FilenameFilter f170a = new C00091();
    /* renamed from: b */
    private final String f171b;
    /* renamed from: c */
    private File f172c;
    /* renamed from: d */
    private File f173d;
    /* renamed from: e */
    private boolean f174e = false;

    /* compiled from: ClsFileOutputStream */
    /* renamed from: abf$1 */
    static class C00091 implements FilenameFilter {
        C00091() {
        }

        public boolean accept(File file, String str) {
            return str.endsWith(".cls_temp");
        }
    }

    public abf(File file, String str) throws FileNotFoundException {
        super(new File(file, str + ".cls_temp"));
        this.f171b = file + File.separator + str;
        this.f172c = new File(this.f171b + ".cls_temp");
    }

    public synchronized void close() throws IOException {
        if (!this.f174e) {
            this.f174e = true;
            super.flush();
            super.close();
            File file = new File(this.f171b + ".cls");
            if (this.f172c.renameTo(file)) {
                this.f172c = null;
                this.f173d = file;
            } else {
                String str = "";
                if (file.exists()) {
                    str = " (target already exists)";
                } else if (!this.f172c.exists()) {
                    str = " (source does not exist)";
                }
                throw new IOException("Could not rename temp file: " + this.f172c + " -> " + file + str);
            }
        }
    }

    /* renamed from: a */
    public void m163a() throws IOException {
        if (!this.f174e) {
            this.f174e = true;
            super.flush();
            super.close();
        }
    }
}
