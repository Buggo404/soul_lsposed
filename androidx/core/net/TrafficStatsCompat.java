package androidx.core.net;

/* loaded from: classes.dex */
public final class TrafficStatsCompat {
    private TrafficStatsCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    @java.lang.Deprecated
    public static void clearThreadStatsTag() {
            android.net.TrafficStats.clearThreadStatsTag()
            return
    }

    @java.lang.Deprecated
    public static int getThreadStatsTag() {
            int r0 = android.net.TrafficStats.getThreadStatsTag()
            return r0
    }

    @java.lang.Deprecated
    public static void incrementOperationCount(int r0) {
            android.net.TrafficStats.incrementOperationCount(r0)
            return
    }

    @java.lang.Deprecated
    public static void incrementOperationCount(int r0, int r1) {
            android.net.TrafficStats.incrementOperationCount(r0, r1)
            return
    }

    @java.lang.Deprecated
    public static void setThreadStatsTag(int r0) {
            android.net.TrafficStats.setThreadStatsTag(r0)
            return
    }

    public static void tagDatagramSocket(java.net.DatagramSocket r0) throws java.net.SocketException {
            android.net.TrafficStats.tagDatagramSocket(r0)
            return
    }

    @java.lang.Deprecated
    public static void tagSocket(java.net.Socket r0) throws java.net.SocketException {
            android.net.TrafficStats.tagSocket(r0)
            return
    }

    public static void untagDatagramSocket(java.net.DatagramSocket r0) throws java.net.SocketException {
            android.net.TrafficStats.untagDatagramSocket(r0)
            return
    }

    @java.lang.Deprecated
    public static void untagSocket(java.net.Socket r0) throws java.net.SocketException {
            android.net.TrafficStats.untagSocket(r0)
            return
    }
}
