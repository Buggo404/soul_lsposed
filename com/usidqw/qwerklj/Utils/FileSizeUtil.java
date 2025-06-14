package com.usidqw.qwerklj.Utils;

/* loaded from: classes.dex */
public class FileSizeUtil {
    public static final int SIZETYPE_B = 1;
    public static final int SIZETYPE_GB = 4;
    public static final int SIZETYPE_KB = 2;
    public static final int SIZETYPE_MB = 3;
    private static final java.lang.String TAG = "FileSizeUtil";

    static {
            return
    }

    public FileSizeUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    private static double FormetFileSize(long r3, int r5) {
            java.text.DecimalFormat r0 = new java.text.DecimalFormat
            java.lang.String r1 = "#.00"
            r0.<init>(r1)
            r1 = 1
            if (r5 == r1) goto L49
            r1 = 2
            if (r5 == r1) goto L38
            r1 = 3
            if (r5 == r1) goto L27
            r1 = 4
            if (r5 == r1) goto L16
            r3 = 0
            goto L56
        L16:
            double r3 = (double) r3
            r1 = 4742290407621132288(0x41d0000000000000, double:1.073741824E9)
            double r3 = r3 / r1
            java.lang.String r3 = r0.format(r3)
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            double r3 = r3.doubleValue()
            goto L56
        L27:
            double r3 = (double) r3
            r1 = 4697254411347427328(0x4130000000000000, double:1048576.0)
            double r3 = r3 / r1
            java.lang.String r3 = r0.format(r3)
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            double r3 = r3.doubleValue()
            goto L56
        L38:
            double r3 = (double) r3
            r1 = 4652218415073722368(0x4090000000000000, double:1024.0)
            double r3 = r3 / r1
            java.lang.String r3 = r0.format(r3)
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            double r3 = r3.doubleValue()
            goto L56
        L49:
            double r3 = (double) r3
            java.lang.String r3 = r0.format(r3)
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            double r3 = r3.doubleValue()
        L56:
            return r3
    }

    private static java.lang.String FormetFileSize(long r4) {
            java.text.DecimalFormat r0 = new java.text.DecimalFormat
            java.lang.String r1 = "#.00"
            r0.<init>(r1)
            r1 = 0
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 != 0) goto L10
            java.lang.String r4 = "0B"
            return r4
        L10:
            r1 = 1024(0x400, double:5.06E-321)
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 >= 0) goto L2f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            double r4 = (double) r4
            java.lang.String r4 = r0.format(r4)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r5 = " B"
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            goto L90
        L2f:
            r1 = 1048576(0x100000, double:5.180654E-318)
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 >= 0) goto L52
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            double r4 = (double) r4
            r2 = 4652218415073722368(0x4090000000000000, double:1024.0)
            double r4 = r4 / r2
            java.lang.String r4 = r0.format(r4)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r5 = " KB"
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            goto L90
        L52:
            r1 = 1073741824(0x40000000, double:5.304989477E-315)
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 >= 0) goto L75
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            double r4 = (double) r4
            r2 = 4697254411347427328(0x4130000000000000, double:1048576.0)
            double r4 = r4 / r2
            java.lang.String r4 = r0.format(r4)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r5 = " MB"
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            goto L90
        L75:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            double r4 = (double) r4
            r2 = 4742290407621132288(0x41d0000000000000, double:1.073741824E9)
            double r4 = r4 / r2
            java.lang.String r4 = r0.format(r4)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r5 = " GB"
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
        L90:
            return r4
    }

    public static java.lang.String getAutoFileOrFilesSize(java.io.File r2) {
            boolean r0 = r2.isDirectory()     // Catch: java.lang.Exception -> L10
            if (r0 == 0) goto Lb
            long r0 = getFileSizes(r2)     // Catch: java.lang.Exception -> L10
            goto L1d
        Lb:
            long r0 = getFileSize(r2)     // Catch: java.lang.Exception -> L10
            goto L1d
        L10:
            r2 = move-exception
            r2.printStackTrace()
            java.lang.String r2 = com.usidqw.qwerklj.Utils.FileSizeUtil.TAG
            java.lang.String r0 = "获取文件大小失败!"
            android.util.Log.e(r2, r0)
            r0 = 0
        L1d:
            java.lang.String r2 = FormetFileSize(r0)
            return r2
    }

    public static java.lang.String getAutoFileOrFilesSize(java.lang.String r2) {
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            boolean r2 = r0.isDirectory()     // Catch: java.lang.Exception -> L15
            if (r2 == 0) goto L10
            long r0 = getFileSizes(r0)     // Catch: java.lang.Exception -> L15
            goto L22
        L10:
            long r0 = getFileSize(r0)     // Catch: java.lang.Exception -> L15
            goto L22
        L15:
            r2 = move-exception
            r2.printStackTrace()
            java.lang.String r2 = com.usidqw.qwerklj.Utils.FileSizeUtil.TAG
            java.lang.String r0 = "获取文件大小失败!"
            android.util.Log.e(r2, r0)
            r0 = 0
        L22:
            java.lang.String r2 = FormetFileSize(r0)
            return r2
    }

    public static double getFileOrFilesSize(java.lang.String r2, int r3) {
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            boolean r2 = r0.isDirectory()     // Catch: java.lang.Exception -> L15
            if (r2 == 0) goto L10
            long r0 = getFileSizes(r0)     // Catch: java.lang.Exception -> L15
            goto L22
        L10:
            long r0 = getFileSize(r0)     // Catch: java.lang.Exception -> L15
            goto L22
        L15:
            r2 = move-exception
            r2.printStackTrace()
            java.lang.String r2 = com.usidqw.qwerklj.Utils.FileSizeUtil.TAG
            java.lang.String r0 = "获取文件大小失败!"
            android.util.Log.e(r2, r0)
            r0 = 0
        L22:
            double r2 = FormetFileSize(r0, r3)
            return r2
    }

    private static long getFileSize(java.io.File r2) throws java.lang.Exception {
            boolean r0 = r2.exists()
            if (r0 == 0) goto L11
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r2)
            int r2 = r0.available()
            long r0 = (long) r2
            goto L1d
        L11:
            r2.createNewFile()
            java.lang.String r2 = com.usidqw.qwerklj.Utils.FileSizeUtil.TAG
            java.lang.String r0 = "获取文件大小不存在!"
            android.util.Log.e(r2, r0)
            r0 = 0
        L1d:
            return r0
    }

    private static long getFileSizes(java.io.File r5) throws java.lang.Exception {
            java.io.File[] r5 = r5.listFiles()
            r0 = 0
            r2 = 0
        L7:
            int r3 = r5.length
            if (r2 >= r3) goto L23
            r3 = r5[r2]
            boolean r3 = r3.isDirectory()
            if (r3 == 0) goto L19
            r3 = r5[r2]
            long r3 = getFileSizes(r3)
            goto L1f
        L19:
            r3 = r5[r2]
            long r3 = getFileSize(r3)
        L1f:
            long r0 = r0 + r3
            int r2 = r2 + 1
            goto L7
        L23:
            return r0
    }
}
