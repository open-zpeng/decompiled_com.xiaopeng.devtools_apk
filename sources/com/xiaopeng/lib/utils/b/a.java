package com.xiaopeng.lib.utils.b;

import android.text.TextUtils;
import android.util.Base64;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
/* compiled from: AESUtils.java */
/* loaded from: classes12.dex */
public class a {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.io.IOException] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17, types: [java.io.OutputStream, java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.io.OutputStream] */
    public static boolean a(File e, File file, String str) {
        FileInputStream fileInputStream;
        Cipher v;
        FileInputStream fileInputStream2 = null;
        try {
            try {
                try {
                    v = v(str, 1);
                    fileInputStream = new FileInputStream((File) e);
                    try {
                        e = new FileOutputStream(file);
                    } catch (Exception e2) {
                        e = e2;
                        e = 0;
                    } catch (OutOfMemoryError e3) {
                        e = e3;
                        e = 0;
                    } catch (Throwable th) {
                        th = th;
                        e = 0;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                }
            } catch (Exception e4) {
                e = e4;
                e = 0;
            } catch (OutOfMemoryError e5) {
                e = e5;
                e = 0;
            } catch (Throwable th3) {
                th = th3;
                e = 0;
                fileInputStream = null;
            }
        } catch (IOException e6) {
            e = e6;
            e.printStackTrace();
        }
        try {
            CipherOutputStream cipherOutputStream = new CipherOutputStream(e, v);
            byte[] bArr = new byte[1048576];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read < 0) {
                    break;
                }
                cipherOutputStream.write(bArr, 0, read);
            }
            cipherOutputStream.close();
            try {
                fileInputStream.close();
            } catch (IOException e7) {
                e7.printStackTrace();
            }
            try {
                e.close();
            } catch (IOException e8) {
                e8.printStackTrace();
            }
            return true;
        } catch (Exception e9) {
            e = e9;
            fileInputStream2 = fileInputStream;
            e = e;
            e.printStackTrace();
            if (fileInputStream2 != null) {
                try {
                    fileInputStream2.close();
                } catch (IOException e10) {
                    e10.printStackTrace();
                }
            }
            if (e != 0) {
                e.close();
                e = e;
            }
            return false;
        } catch (OutOfMemoryError e11) {
            e = e11;
            fileInputStream2 = fileInputStream;
            e = e;
            e.printStackTrace();
            if (fileInputStream2 != null) {
                try {
                    fileInputStream2.close();
                } catch (IOException e12) {
                    e12.printStackTrace();
                }
            }
            if (e != 0) {
                e.close();
                e = e;
            }
            return false;
        } catch (Throwable th4) {
            th = th4;
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e13) {
                    e13.printStackTrace();
                }
            }
            if (e != 0) {
                try {
                    e.close();
                } catch (IOException e14) {
                    e14.printStackTrace();
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.io.FileInputStream, java.io.InputStream] */
    public static boolean r(String str, String str2, String str3) {
        CipherInputStream cipherInputStream;
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return false;
        }
        CipherInputStream cipherInputStream2 = null;
        try {
            try {
                File file = new File((String) str3);
                if (!file.exists()) {
                    if (!file.getParentFile().exists()) {
                        file.getParentFile().mkdir();
                    }
                    file.createNewFile();
                }
                Cipher v = v(str, 1);
                str3 = new FileInputStream((String) str2);
                try {
                    str2 = new FileOutputStream(file);
                    try {
                        cipherInputStream = new CipherInputStream(str3, v);
                    } catch (Exception e) {
                        e = e;
                    }
                } catch (Exception e2) {
                    e = e2;
                    str2 = 0;
                } catch (Throwable th) {
                    th = th;
                    str2 = 0;
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = cipherInputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    str2.write(bArr, 0, read);
                }
                str2.flush();
                str2.getFD().sync();
                try {
                    cipherInputStream.close();
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
                try {
                    str2.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
                try {
                    str3.close();
                    return true;
                } catch (IOException e5) {
                    e5.printStackTrace();
                    return true;
                }
            } catch (Exception e6) {
                e = e6;
                cipherInputStream2 = cipherInputStream;
                e.printStackTrace();
                if (cipherInputStream2 != null) {
                    try {
                        cipherInputStream2.close();
                    } catch (IOException e7) {
                        e7.printStackTrace();
                    }
                }
                if (str2 != 0) {
                    try {
                        str2.close();
                    } catch (IOException e8) {
                        e8.printStackTrace();
                    }
                }
                if (str3 != 0) {
                    try {
                        str3.close();
                    } catch (IOException e9) {
                        e9.printStackTrace();
                    }
                }
                return false;
            } catch (Throwable th3) {
                th = th3;
                cipherInputStream2 = cipherInputStream;
                if (cipherInputStream2 != null) {
                    try {
                        cipherInputStream2.close();
                    } catch (IOException e10) {
                        e10.printStackTrace();
                    }
                }
                if (str2 != 0) {
                    try {
                        str2.close();
                    } catch (IOException e11) {
                        e11.printStackTrace();
                    }
                }
                if (str3 != 0) {
                    try {
                        str3.close();
                    } catch (IOException e12) {
                        e12.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Exception e13) {
            e = e13;
            str2 = 0;
            str3 = 0;
        } catch (Throwable th4) {
            th = th4;
            str2 = 0;
            str3 = 0;
        }
    }

    public static byte[] dD(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = 2 * i;
            bArr[i] = Integer.valueOf(str.substring(i2, i2 + 2), 16).byteValue();
        }
        return bArr;
    }

    public static String Z(String str, String str2) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(Charset.forName("UTF-8")), "AES");
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(2, secretKeySpec);
            return new String(cipher.doFinal(dD(str)));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static Cipher v(String str, int i) {
        Cipher cipher;
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str.getBytes(), "AES");
            cipher = Cipher.getInstance("AES");
            try {
                cipher.init(i, secretKeySpec);
            } catch (InvalidKeyException e) {
                e = e;
                e.printStackTrace();
                return cipher;
            } catch (NoSuchAlgorithmException e2) {
                e = e2;
                e.printStackTrace();
                return cipher;
            } catch (NoSuchPaddingException e3) {
                e = e3;
                e.printStackTrace();
                return cipher;
            }
        } catch (InvalidKeyException e4) {
            e = e4;
            cipher = null;
        } catch (NoSuchAlgorithmException e5) {
            e = e5;
            cipher = null;
        } catch (NoSuchPaddingException e6) {
            e = e6;
            cipher = null;
        }
        return cipher;
    }

    public static String aa(String str, String str2) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(Charset.forName("UTF-8")), "AES");
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(2, secretKeySpec);
            return new String(cipher.doFinal(Base64.decode(str, 0)));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
