package androidx.constraintlayout.core.motion.utils;

/* loaded from: classes.dex */
public class Utils {
    static androidx.constraintlayout.core.motion.utils.Utils.DebugHandle ourHandle;

    public interface DebugHandle {
        void message(java.lang.String r1);
    }

    public Utils() {
            r0 = this;
            r0.<init>()
            return
    }

    private static int clamp(int r1) {
            int r0 = r1 >> 31
            int r0 = ~r0
            r1 = r1 & r0
            int r1 = r1 + (-255)
            int r0 = r1 >> 31
            r1 = r1 & r0
            int r1 = r1 + 255
            return r1
    }

    public static void log(java.lang.String r5) {
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            r1 = 1
            r0 = r0[r1]
            java.lang.String r1 = r0.getMethodName()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r2 = "                  "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 0
            r3 = 17
            java.lang.String r1 = r1.substring(r2, r3)
            int r2 = r0.getLineNumber()
            java.lang.String r2 = java.lang.Integer.toString(r2)
            int r2 = r2.length()
            java.lang.String r3 = "    "
            java.lang.String r2 = r3.substring(r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = ".("
            r3.<init>(r4)
            java.lang.String r4 = r0.getFileName()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = ":"
            java.lang.StringBuilder r3 = r3.append(r4)
            int r0 = r0.getLineNumber()
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = ")"
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.io.PrintStream r1 = java.lang.System.out
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r3 = " "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r2 = r2.toString()
            r1.println(r2)
            androidx.constraintlayout.core.motion.utils.Utils$DebugHandle r1 = androidx.constraintlayout.core.motion.utils.Utils.ourHandle
            if (r1 == 0) goto La3
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r5 = r0.append(r5)
            java.lang.String r5 = r5.toString()
            r1.message(r5)
        La3:
            return
    }

    public static void log(java.lang.String r2, java.lang.String r3) {
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r2 = r1.append(r2)
            java.lang.String r1 = " : "
            java.lang.StringBuilder r2 = r2.append(r1)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.println(r2)
            return
    }

    public static void logStack(java.lang.String r7, int r8) {
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            int r1 = r0.length
            r2 = 1
            int r1 = r1 - r2
            int r8 = java.lang.Math.min(r8, r1)
            java.lang.String r1 = " "
            r3 = r1
        L13:
            if (r2 > r8) goto L7e
            r4 = r0[r2]
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = ".("
            r4.<init>(r5)
            r5 = r0[r2]
            java.lang.String r5 = r5.getFileName()
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = ":"
            java.lang.StringBuilder r4 = r4.append(r5)
            r5 = r0[r2]
            int r5 = r5.getLineNumber()
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = ") "
            java.lang.StringBuilder r4 = r4.append(r5)
            r5 = r0[r2]
            java.lang.String r5 = r5.getMethodName()
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.StringBuilder r3 = r5.append(r3)
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.String r3 = r3.toString()
            java.io.PrintStream r5 = java.lang.System.out
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.StringBuilder r6 = r6.append(r3)
            java.lang.StringBuilder r4 = r6.append(r4)
            java.lang.StringBuilder r4 = r4.append(r3)
            java.lang.String r4 = r4.toString()
            r5.println(r4)
            int r2 = r2 + 1
            goto L13
        L7e:
            return
    }

    public static void loge(java.lang.String r2, java.lang.String r3) {
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r2 = r1.append(r2)
            java.lang.String r1 = " : "
            java.lang.StringBuilder r2 = r2.append(r1)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.println(r2)
            return
    }

    public static int rgbaTocColor(float r1, float r2, float r3, float r4) {
            r0 = 1132396544(0x437f0000, float:255.0)
            float r1 = r1 * r0
            int r1 = (int) r1
            int r1 = clamp(r1)
            float r2 = r2 * r0
            int r2 = (int) r2
            int r2 = clamp(r2)
            float r3 = r3 * r0
            int r3 = (int) r3
            int r3 = clamp(r3)
            float r4 = r4 * r0
            int r4 = (int) r4
            int r4 = clamp(r4)
            int r4 = r4 << 24
            int r1 = r1 << 16
            r1 = r1 | r4
            int r2 = r2 << 8
            r1 = r1 | r2
            r1 = r1 | r3
            return r1
    }

    public static void setDebugHandle(androidx.constraintlayout.core.motion.utils.Utils.DebugHandle r0) {
            androidx.constraintlayout.core.motion.utils.Utils.ourHandle = r0
            return
    }

    public static void socketSend(java.lang.String r3) {
            java.net.Socket r0 = new java.net.Socket     // Catch: java.io.IOException -> L18
            java.lang.String r1 = "127.0.0.1"
            r2 = 5327(0x14cf, float:7.465E-42)
            r0.<init>(r1, r2)     // Catch: java.io.IOException -> L18
            java.io.OutputStream r0 = r0.getOutputStream()     // Catch: java.io.IOException -> L18
            byte[] r3 = r3.getBytes()     // Catch: java.io.IOException -> L18
            r0.write(r3)     // Catch: java.io.IOException -> L18
            r0.close()     // Catch: java.io.IOException -> L18
            goto L1c
        L18:
            r3 = move-exception
            r3.printStackTrace()
        L1c:
            return
    }

    public int getInterpolatedColor(float[] r8) {
            r7 = this;
            r0 = 0
            r0 = r8[r0]
            double r0 = (double) r0
            r2 = 4601859982876761367(0x3fdd1745d1745d17, double:0.45454545454545453)
            double r0 = java.lang.Math.pow(r0, r2)
            float r0 = (float) r0
            r1 = 1132396544(0x437f0000, float:255.0)
            float r0 = r0 * r1
            int r0 = (int) r0
            int r0 = clamp(r0)
            r4 = 1
            r4 = r8[r4]
            double r4 = (double) r4
            double r4 = java.lang.Math.pow(r4, r2)
            float r4 = (float) r4
            float r4 = r4 * r1
            int r4 = (int) r4
            int r4 = clamp(r4)
            r5 = 2
            r5 = r8[r5]
            double r5 = (double) r5
            double r2 = java.lang.Math.pow(r5, r2)
            float r2 = (float) r2
            float r2 = r2 * r1
            int r2 = (int) r2
            int r2 = clamp(r2)
            r3 = 3
            r8 = r8[r3]
            float r8 = r8 * r1
            int r8 = (int) r8
            int r8 = clamp(r8)
            int r8 = r8 << 24
            int r0 = r0 << 16
            r8 = r8 | r0
            int r0 = r4 << 8
            r8 = r8 | r0
            r8 = r8 | r2
            return r8
    }
}
