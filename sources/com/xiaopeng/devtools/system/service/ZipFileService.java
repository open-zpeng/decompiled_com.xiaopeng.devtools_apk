package com.xiaopeng.devtools.system.service;

import android.app.IntentService;
import java.text.SimpleDateFormat;
import java.util.Date;
/* loaded from: classes12.dex */
public class ZipFileService extends IntentService {
    public ZipFileService() {
        this("ZipFileService");
    }

    public ZipFileService(String str) {
        super(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0113  */
    @Override // android.app.IntentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onHandleIntent(android.content.Intent r9) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaopeng.devtools.system.service.ZipFileService.onHandleIntent(android.content.Intent):void");
    }

    private String eI() {
        return new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
    }
}
