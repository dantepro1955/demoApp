package com.p000;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Comparator;

/* compiled from: Utils */
/* renamed from: aco */
final class aco {
    /* renamed from: a */
    private static final FilenameFilter f374a = new C00711();

    /* compiled from: Utils */
    /* renamed from: aco$1 */
    static class C00711 implements FilenameFilter {
        C00711() {
        }

        public boolean accept(File file, String str) {
            return true;
        }
    }

    /* renamed from: a */
    static int m504a(File file, int i, Comparator<File> comparator) {
        return aco.m505a(file, f374a, i, comparator);
    }

    /* renamed from: a */
    static int m505a(File file, FilenameFilter filenameFilter, int i, Comparator<File> comparator) {
        int i2 = 0;
        File[] listFiles = file.listFiles(filenameFilter);
        if (listFiles != null) {
            int length = listFiles.length;
            Arrays.sort(listFiles, comparator);
            int length2 = listFiles.length;
            i2 = length;
            length = 0;
            while (length < length2) {
                File file2 = listFiles[length];
                if (i2 <= i) {
                    break;
                }
                file2.delete();
                length++;
                i2--;
            }
        }
        return i2;
    }
}
