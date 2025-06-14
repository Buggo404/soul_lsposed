package androidx.legacy.content;

@java.lang.Deprecated
/* loaded from: classes.dex */
public abstract class WakefulBroadcastReceiver extends android.content.BroadcastReceiver {
    private static final java.lang.String EXTRA_WAKE_LOCK_ID = "androidx.contentpager.content.wakelockid";
    private static int mNextId;
    private static final android.util.SparseArray<android.os.PowerManager.WakeLock> sActiveWakeLocks = null;

    static {
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            androidx.legacy.content.WakefulBroadcastReceiver.sActiveWakeLocks = r0
            r0 = 1
            androidx.legacy.content.WakefulBroadcastReceiver.mNextId = r0
            return
    }

    public WakefulBroadcastReceiver() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean completeWakefulIntent(android.content.Intent r5) {
            java.lang.String r0 = "No active wake lock id #"
            java.lang.String r1 = "androidx.contentpager.content.wakelockid"
            r2 = 0
            int r5 = r5.getIntExtra(r1, r2)
            if (r5 != 0) goto Lc
            return r2
        Lc:
            android.util.SparseArray<android.os.PowerManager$WakeLock> r1 = androidx.legacy.content.WakefulBroadcastReceiver.sActiveWakeLocks
            monitor-enter(r1)
            java.lang.Object r2 = r1.get(r5)     // Catch: java.lang.Throwable -> L34
            android.os.PowerManager$WakeLock r2 = (android.os.PowerManager.WakeLock) r2     // Catch: java.lang.Throwable -> L34
            r3 = 1
            if (r2 == 0) goto L20
            r2.release()     // Catch: java.lang.Throwable -> L34
            r1.remove(r5)     // Catch: java.lang.Throwable -> L34
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L34
            return r3
        L20:
            java.lang.String r2 = "WakefulBroadcastReceiv."
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L34
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L34
            java.lang.StringBuilder r5 = r4.append(r5)     // Catch: java.lang.Throwable -> L34
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L34
            android.util.Log.w(r2, r5)     // Catch: java.lang.Throwable -> L34
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L34
            return r3
        L34:
            r5 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L34
            throw r5
    }

    public static android.content.ComponentName startWakefulService(android.content.Context r5, android.content.Intent r6) {
            java.lang.String r0 = "androidx.core:wake:"
            android.util.SparseArray<android.os.PowerManager$WakeLock> r1 = androidx.legacy.content.WakefulBroadcastReceiver.sActiveWakeLocks
            monitor-enter(r1)
            int r2 = androidx.legacy.content.WakefulBroadcastReceiver.mNextId     // Catch: java.lang.Throwable -> L4a
            int r3 = r2 + 1
            androidx.legacy.content.WakefulBroadcastReceiver.mNextId = r3     // Catch: java.lang.Throwable -> L4a
            r4 = 1
            if (r3 > 0) goto L10
            androidx.legacy.content.WakefulBroadcastReceiver.mNextId = r4     // Catch: java.lang.Throwable -> L4a
        L10:
            java.lang.String r3 = "androidx.contentpager.content.wakelockid"
            r6.putExtra(r3, r2)     // Catch: java.lang.Throwable -> L4a
            android.content.ComponentName r6 = r5.startService(r6)     // Catch: java.lang.Throwable -> L4a
            if (r6 != 0) goto L1e
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4a
            r5 = 0
            return r5
        L1e:
            java.lang.String r3 = "power"
            java.lang.Object r5 = r5.getSystemService(r3)     // Catch: java.lang.Throwable -> L4a
            android.os.PowerManager r5 = (android.os.PowerManager) r5     // Catch: java.lang.Throwable -> L4a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4a
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r0 = r6.flattenToShortString()     // Catch: java.lang.Throwable -> L4a
            java.lang.StringBuilder r0 = r3.append(r0)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L4a
            android.os.PowerManager$WakeLock r5 = r5.newWakeLock(r4, r0)     // Catch: java.lang.Throwable -> L4a
            r0 = 0
            r5.setReferenceCounted(r0)     // Catch: java.lang.Throwable -> L4a
            r3 = 60000(0xea60, double:2.9644E-319)
            r5.acquire(r3)     // Catch: java.lang.Throwable -> L4a
            r1.put(r2, r5)     // Catch: java.lang.Throwable -> L4a
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4a
            return r6
        L4a:
            r5 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4a
            throw r5
    }
}
