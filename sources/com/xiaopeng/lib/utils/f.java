package com.xiaopeng.lib.utils;

import android.os.Process;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
/* compiled from: ProcessUtils.java */
/* loaded from: classes12.dex */
public class f {
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0058: MOVE  (r0 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:23:0x0057 */
    public static String oP() {
        FileReader fileReader;
        FileReader fileReader2;
        FileReader fileReader3 = null;
        try {
            try {
                fileReader = new FileReader(new File("/proc/" + Process.myPid() + "/cmdline"));
                try {
                    BufferedReader bufferedReader = new BufferedReader(fileReader);
                    String trim = bufferedReader.readLine().trim();
                    bufferedReader.close();
                    fileReader.close();
                    try {
                        fileReader.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    return trim;
                } catch (Exception e2) {
                    e = e2;
                    e.printStackTrace();
                    try {
                        fileReader.close();
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                fileReader3 = fileReader2;
                try {
                    fileReader3.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
                throw th;
            }
        } catch (Exception e5) {
            e = e5;
            fileReader = null;
        } catch (Throwable th2) {
            th = th2;
            fileReader3.close();
            throw th;
        }
    }
}
