package com.xiaopeng.lib.utils.c;

import android.os.Process;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
/* compiled from: AppInfoUtils.java */
/* loaded from: classes12.dex */
public class a {
    private static String Xd = null;

    public static String getProcessName() {
        BufferedReader bufferedReader;
        if (Xd != null) {
            return Xd;
        }
        BufferedReader bufferedReader2 = null;
        try {
            try {
                bufferedReader = new BufferedReader(new FileReader(new File("/proc/" + Process.myPid() + "/cmdline")));
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            Xd = bufferedReader.readLine().trim();
            com.xiaopeng.lib.utils.b.closeQuietly(bufferedReader);
        } catch (Exception e2) {
            e = e2;
            bufferedReader2 = bufferedReader;
            e.printStackTrace();
            Xd = "";
            com.xiaopeng.lib.utils.b.closeQuietly(bufferedReader2);
            return Xd;
        } catch (Throwable th2) {
            th = th2;
            bufferedReader2 = bufferedReader;
            com.xiaopeng.lib.utils.b.closeQuietly(bufferedReader2);
            throw th;
        }
        return Xd;
    }
}
