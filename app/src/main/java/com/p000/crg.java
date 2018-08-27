package com.p000;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/* compiled from: ANRDetector */
/* renamed from: crg */
public class crg {
    /* renamed from: a */
    public static String m24569a(int i) {
        File file = new File("/data/anr/traces.txt");
        if (!file.exists()) {
            return "";
        }
        try {
            StringBuilder stringBuilder = new StringBuilder();
            Reader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            do {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                stringBuilder.append(readLine);
                stringBuilder.append("\n");
            } while (stringBuilder.length() <= i);
            fileReader.close();
            return stringBuilder.toString();
        } catch (FileNotFoundException e) {
            return "";
        } catch (IOException e2) {
            return "";
        }
    }
}
