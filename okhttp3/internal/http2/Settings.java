package okhttp3.internal.http2;

/* loaded from: classes.dex */
public final class Settings {
    static final int COUNT = 10;
    static final int DEFAULT_INITIAL_WINDOW_SIZE = 65535;
    static final int ENABLE_PUSH = 2;
    static final int HEADER_TABLE_SIZE = 1;
    static final int INITIAL_WINDOW_SIZE = 7;
    static final int MAX_CONCURRENT_STREAMS = 4;
    static final int MAX_FRAME_SIZE = 5;
    static final int MAX_HEADER_LIST_SIZE = 6;
    private int set;
    private final int[] values;

    public Settings() {
            r1 = this;
            r1.<init>()
            r0 = 10
            int[] r0 = new int[r0]
            r1.values = r0
            return
    }

    void clear() {
            r2 = this;
            r0 = 0
            r2.set = r0
            int[] r1 = r2.values
            java.util.Arrays.fill(r1, r0)
            return
    }

    int get(int r2) {
            r1 = this;
            int[] r0 = r1.values
            r2 = r0[r2]
            return r2
    }

    boolean getEnablePush(boolean r4) {
            r3 = this;
            int r0 = r3.set
            r0 = r0 & 4
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Le
            int[] r4 = r3.values
            r0 = 2
            r4 = r4[r0]
            goto L13
        Le:
            if (r4 == 0) goto L12
            r4 = r2
            goto L13
        L12:
            r4 = r1
        L13:
            if (r4 != r2) goto L16
            r1 = r2
        L16:
            return r1
    }

    int getHeaderTableSize() {
            r2 = this;
            int r0 = r2.set
            r0 = r0 & 2
            if (r0 == 0) goto Lc
            int[] r0 = r2.values
            r1 = 1
            r0 = r0[r1]
            goto Ld
        Lc:
            r0 = -1
        Ld:
            return r0
    }

    int getInitialWindowSize() {
            r2 = this;
            int r0 = r2.set
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto Lc
            int[] r0 = r2.values
            r1 = 7
            r0 = r0[r1]
            goto Lf
        Lc:
            r0 = 65535(0xffff, float:9.1834E-41)
        Lf:
            return r0
    }

    int getMaxConcurrentStreams(int r2) {
            r1 = this;
            int r0 = r1.set
            r0 = r0 & 16
            if (r0 == 0) goto Lb
            int[] r2 = r1.values
            r0 = 4
            r2 = r2[r0]
        Lb:
            return r2
    }

    int getMaxFrameSize(int r2) {
            r1 = this;
            int r0 = r1.set
            r0 = r0 & 32
            if (r0 == 0) goto Lb
            int[] r2 = r1.values
            r0 = 5
            r2 = r2[r0]
        Lb:
            return r2
    }

    int getMaxHeaderListSize(int r2) {
            r1 = this;
            int r0 = r1.set
            r0 = r0 & 64
            if (r0 == 0) goto Lb
            int[] r2 = r1.values
            r0 = 6
            r2 = r2[r0]
        Lb:
            return r2
    }

    boolean isSet(int r3) {
            r2 = this;
            r0 = 1
            int r3 = r0 << r3
            int r1 = r2.set
            r3 = r3 & r1
            if (r3 == 0) goto L9
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    void merge(okhttp3.internal.http2.Settings r3) {
            r2 = this;
            r0 = 0
        L1:
            r1 = 10
            if (r0 >= r1) goto L16
            boolean r1 = r3.isSet(r0)
            if (r1 != 0) goto Lc
            goto L13
        Lc:
            int r1 = r3.get(r0)
            r2.set(r0, r1)
        L13:
            int r0 = r0 + 1
            goto L1
        L16:
            return
    }

    okhttp3.internal.http2.Settings set(int r4, int r5) {
            r3 = this;
            if (r4 < 0) goto L11
            int[] r0 = r3.values
            int r1 = r0.length
            if (r4 < r1) goto L8
            goto L11
        L8:
            r1 = 1
            int r1 = r1 << r4
            int r2 = r3.set
            r1 = r1 | r2
            r3.set = r1
            r0[r4] = r5
        L11:
            return r3
    }

    int size() {
            r1 = this;
            int r0 = r1.set
            int r0 = java.lang.Integer.bitCount(r0)
            return r0
    }
}
