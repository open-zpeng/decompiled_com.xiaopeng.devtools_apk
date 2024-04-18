package com.xiaopeng.devtools.devdebug.hwcheck;

import android.os.AsyncTask;
import com.xiaopeng.devtools.bean.event.EtcPwmEvent;
import com.xiaopeng.devtools.bean.event.ModemUpgradeEvent;
import com.xiaopeng.lib.utils.c;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import org.greenrobot.eventbus.EventBus;
/* compiled from: HwCheckModel.java */
/* loaded from: classes12.dex */
public class a {
    private b rk = new b();

    public static a fi() {
        return C0057a.rm;
    }

    /* compiled from: HwCheckModel.java */
    /* loaded from: classes12.dex */
    static class b extends AsyncTask<Integer, Void, Boolean> {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a */
        public Boolean doInBackground(Integer... numArr) {
            OutputStreamWriter outputStreamWriter;
            OutputStreamWriter outputStreamWriter2 = null;
            try {
                try {
                    outputStreamWriter = new OutputStreamWriter(new FileOutputStream("/sys/devices/platform/sunxi-rf-pm.0/attr/etcpwm"));
                } catch (Exception e) {
                    e = e;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                outputStreamWriter.write(numArr[0] + "");
                outputStreamWriter.flush();
                try {
                    outputStreamWriter.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
                return true;
            } catch (Exception e3) {
                e = e3;
                outputStreamWriter2 = outputStreamWriter;
                c.i("HwCheckModel", e.getMessage() + "");
                if (outputStreamWriter2 != null) {
                    try {
                        outputStreamWriter2.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                }
                return false;
            } catch (Throwable th2) {
                th = th2;
                outputStreamWriter2 = outputStreamWriter;
                if (outputStreamWriter2 != null) {
                    try {
                        outputStreamWriter2.close();
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                }
                throw th;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            EventBus.getDefault().post(new EtcPwmEvent(bool.booleanValue()));
        }
    }

    public void bS(int i) {
        this.rk.execute(Integer.valueOf(i));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.xiaopeng.devtools.devdebug.hwcheck.a$1] */
    public void fj() {
        new AsyncTask<Void, Void, Boolean>() { // from class: com.xiaopeng.devtools.devdebug.hwcheck.a.1
            /* JADX INFO: Access modifiers changed from: protected */
            /* JADX WARN: Removed duplicated region for block: B:106:0x013a A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:96:0x0144 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @Override // android.os.AsyncTask
            /* renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.lang.Boolean doInBackground(java.lang.Void... r9) {
                /*
                    Method dump skipped, instructions count: 345
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.xiaopeng.devtools.devdebug.hwcheck.a.AnonymousClass1.doInBackground(java.lang.Void[]):java.lang.Boolean");
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* renamed from: a */
            public void onPostExecute(Boolean bool) {
                super.onPostExecute(bool);
                EventBus.getDefault().post(new ModemUpgradeEvent(bool.booleanValue()));
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:110:0x0113 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:112:0x0131 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:114:0x00f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:118:0x0127 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:122:0x00e8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:130:0x011d A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:134:0x00fc A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:83:0x0106 A[Catch: IOException -> 0x010a, TRY_ENTER, TRY_LEAVE, TryCatch #12 {IOException -> 0x010a, blocks: (B:43:0x0099, B:83:0x0106), top: B:126:0x0052 }] */
            /* JADX WARN: Type inference failed for: r1v12 */
            /* JADX WARN: Type inference failed for: r1v13 */
            /* JADX WARN: Type inference failed for: r1v15 */
            /* JADX WARN: Type inference failed for: r1v2 */
            /* JADX WARN: Type inference failed for: r1v3 */
            /* JADX WARN: Type inference failed for: r1v5 */
            /* JADX WARN: Type inference failed for: r1v7, types: [java.io.FileInputStream] */
            /* JADX WARN: Type inference failed for: r2v10 */
            /* JADX WARN: Type inference failed for: r2v15 */
            /* JADX WARN: Type inference failed for: r2v21 */
            /* JADX WARN: Type inference failed for: r2v22 */
            /* JADX WARN: Type inference failed for: r2v3 */
            /* JADX WARN: Type inference failed for: r2v4 */
            /* JADX WARN: Type inference failed for: r2v6 */
            /* JADX WARN: Type inference failed for: r2v8, types: [java.io.FileOutputStream] */
            /* JADX WARN: Type inference failed for: r3v1 */
            /* JADX WARN: Type inference failed for: r3v10 */
            /* JADX WARN: Type inference failed for: r3v11, types: [java.io.BufferedOutputStream] */
            /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.String] */
            /* JADX WARN: Type inference failed for: r3v2 */
            /* JADX WARN: Type inference failed for: r3v3, types: [java.io.BufferedOutputStream] */
            /* JADX WARN: Type inference failed for: r3v4, types: [java.io.BufferedOutputStream] */
            /* JADX WARN: Type inference failed for: r3v5 */
            /* JADX WARN: Type inference failed for: r3v6 */
            /* JADX WARN: Type inference failed for: r3v7 */
            /* JADX WARN: Type inference failed for: r3v8 */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.String] */
            /* JADX WARN: Type inference failed for: r9v11, types: [java.io.BufferedInputStream] */
            /* JADX WARN: Type inference failed for: r9v15, types: [java.io.BufferedInputStream] */
            /* JADX WARN: Type inference failed for: r9v5 */
            /* JADX WARN: Type inference failed for: r9v7 */
            /* JADX WARN: Type inference failed for: r9v8, types: [java.io.BufferedInputStream] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private void A(java.lang.String r9, java.lang.String r10) {
                /*
                    Method dump skipped, instructions count: 314
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.xiaopeng.devtools.devdebug.hwcheck.a.AnonymousClass1.A(java.lang.String, java.lang.String):void");
            }

            private void bn(String str) {
                File file = new File(str);
                if (file.exists()) {
                    file.delete();
                }
            }
        }.execute(new Void[0]);
    }

    /* compiled from: HwCheckModel.java */
    /* renamed from: com.xiaopeng.devtools.devdebug.hwcheck.a$a  reason: collision with other inner class name */
    /* loaded from: classes12.dex */
    private static class C0057a {
        private static final a rm = new a();
    }
}
