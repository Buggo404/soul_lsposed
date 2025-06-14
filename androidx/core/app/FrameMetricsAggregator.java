package androidx.core.app;

/* loaded from: classes.dex */
public class FrameMetricsAggregator {
    public static final int ANIMATION_DURATION = 256;
    public static final int ANIMATION_INDEX = 8;
    public static final int COMMAND_DURATION = 32;
    public static final int COMMAND_INDEX = 5;
    public static final int DELAY_DURATION = 128;
    public static final int DELAY_INDEX = 7;
    public static final int DRAW_DURATION = 8;
    public static final int DRAW_INDEX = 3;
    public static final int EVERY_DURATION = 511;
    public static final int INPUT_DURATION = 2;
    public static final int INPUT_INDEX = 1;
    private static final int LAST_INDEX = 8;
    public static final int LAYOUT_MEASURE_DURATION = 4;
    public static final int LAYOUT_MEASURE_INDEX = 2;
    public static final int SWAP_DURATION = 64;
    public static final int SWAP_INDEX = 6;
    public static final int SYNC_DURATION = 16;
    public static final int SYNC_INDEX = 4;
    public static final int TOTAL_DURATION = 1;
    public static final int TOTAL_INDEX = 0;
    private androidx.core.app.FrameMetricsAggregator.FrameMetricsBaseImpl mInstance;

    private static class FrameMetricsApi24Impl extends androidx.core.app.FrameMetricsAggregator.FrameMetricsBaseImpl {
        private static final int NANOS_PER_MS = 1000000;
        private static final int NANOS_ROUNDING_VALUE = 500000;
        private static android.os.Handler sHandler;
        private static android.os.HandlerThread sHandlerThread;
        private java.util.ArrayList<java.lang.ref.WeakReference<android.app.Activity>> mActivities;
        android.view.Window.OnFrameMetricsAvailableListener mListener;
        android.util.SparseIntArray[] mMetrics;
        int mTrackingFlags;


        static {
                return
        }

        FrameMetricsApi24Impl(int r2) {
                r1 = this;
                r1.<init>()
                r0 = 9
                android.util.SparseIntArray[] r0 = new android.util.SparseIntArray[r0]
                r1.mMetrics = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.mActivities = r0
                androidx.core.app.FrameMetricsAggregator$FrameMetricsApi24Impl$1 r0 = new androidx.core.app.FrameMetricsAggregator$FrameMetricsApi24Impl$1
                r0.<init>(r1)
                r1.mListener = r0
                r1.mTrackingFlags = r2
                return
        }

        @Override // androidx.core.app.FrameMetricsAggregator.FrameMetricsBaseImpl
        public void add(android.app.Activity r5) {
                r4 = this;
                android.os.HandlerThread r0 = androidx.core.app.FrameMetricsAggregator.FrameMetricsApi24Impl.sHandlerThread
                if (r0 != 0) goto L1d
                android.os.HandlerThread r0 = new android.os.HandlerThread
                java.lang.String r1 = "FrameMetricsAggregator"
                r0.<init>(r1)
                androidx.core.app.FrameMetricsAggregator.FrameMetricsApi24Impl.sHandlerThread = r0
                r0.start()
                android.os.Handler r0 = new android.os.Handler
                android.os.HandlerThread r1 = androidx.core.app.FrameMetricsAggregator.FrameMetricsApi24Impl.sHandlerThread
                android.os.Looper r1 = r1.getLooper()
                r0.<init>(r1)
                androidx.core.app.FrameMetricsAggregator.FrameMetricsApi24Impl.sHandler = r0
            L1d:
                r0 = 0
            L1e:
                r1 = 8
                if (r0 > r1) goto L39
                android.util.SparseIntArray[] r1 = r4.mMetrics
                r2 = r1[r0]
                if (r2 != 0) goto L36
                int r2 = r4.mTrackingFlags
                r3 = 1
                int r3 = r3 << r0
                r2 = r2 & r3
                if (r2 == 0) goto L36
                android.util.SparseIntArray r2 = new android.util.SparseIntArray
                r2.<init>()
                r1[r0] = r2
            L36:
                int r0 = r0 + 1
                goto L1e
            L39:
                android.view.Window r0 = r5.getWindow()
                android.view.Window$OnFrameMetricsAvailableListener r1 = r4.mListener
                android.os.Handler r2 = androidx.core.app.FrameMetricsAggregator.FrameMetricsApi24Impl.sHandler
                r0.addOnFrameMetricsAvailableListener(r1, r2)
                java.util.ArrayList<java.lang.ref.WeakReference<android.app.Activity>> r0 = r4.mActivities
                java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
                r1.<init>(r5)
                r0.add(r1)
                return
        }

        void addDurationItem(android.util.SparseIntArray r5, long r6) {
                r4 = this;
                if (r5 == 0) goto L1a
                r0 = 500000(0x7a120, double:2.47033E-318)
                long r0 = r0 + r6
                r2 = 1000000(0xf4240, double:4.940656E-318)
                long r0 = r0 / r2
                int r0 = (int) r0
                r1 = 0
                int r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
                if (r6 < 0) goto L1a
                int r6 = r5.get(r0)
                int r6 = r6 + 1
                r5.put(r0, r6)
            L1a:
                return
        }

        @Override // androidx.core.app.FrameMetricsAggregator.FrameMetricsBaseImpl
        public android.util.SparseIntArray[] getMetrics() {
                r1 = this;
                android.util.SparseIntArray[] r0 = r1.mMetrics
                return r0
        }

        @Override // androidx.core.app.FrameMetricsAggregator.FrameMetricsBaseImpl
        public android.util.SparseIntArray[] remove(android.app.Activity r4) {
                r3 = this;
                java.util.ArrayList<java.lang.ref.WeakReference<android.app.Activity>> r0 = r3.mActivities
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L1d
                java.lang.Object r1 = r0.next()
                java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
                java.lang.Object r2 = r1.get()
                if (r2 != r4) goto L6
                java.util.ArrayList<java.lang.ref.WeakReference<android.app.Activity>> r0 = r3.mActivities
                r0.remove(r1)
            L1d:
                android.view.Window r4 = r4.getWindow()
                android.view.Window$OnFrameMetricsAvailableListener r0 = r3.mListener
                r4.removeOnFrameMetricsAvailableListener(r0)
                android.util.SparseIntArray[] r4 = r3.mMetrics
                return r4
        }

        @Override // androidx.core.app.FrameMetricsAggregator.FrameMetricsBaseImpl
        public android.util.SparseIntArray[] reset() {
                r2 = this;
                android.util.SparseIntArray[] r0 = r2.mMetrics
                r1 = 9
                android.util.SparseIntArray[] r1 = new android.util.SparseIntArray[r1]
                r2.mMetrics = r1
                return r0
        }

        @Override // androidx.core.app.FrameMetricsAggregator.FrameMetricsBaseImpl
        public android.util.SparseIntArray[] stop() {
                r3 = this;
                java.util.ArrayList<java.lang.ref.WeakReference<android.app.Activity>> r0 = r3.mActivities
                int r0 = r0.size()
                int r0 = r0 + (-1)
            L8:
                if (r0 < 0) goto L2f
                java.util.ArrayList<java.lang.ref.WeakReference<android.app.Activity>> r1 = r3.mActivities
                java.lang.Object r1 = r1.get(r0)
                java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
                java.lang.Object r2 = r1.get()
                android.app.Activity r2 = (android.app.Activity) r2
                java.lang.Object r1 = r1.get()
                if (r1 == 0) goto L2c
                android.view.Window r1 = r2.getWindow()
                android.view.Window$OnFrameMetricsAvailableListener r2 = r3.mListener
                r1.removeOnFrameMetricsAvailableListener(r2)
                java.util.ArrayList<java.lang.ref.WeakReference<android.app.Activity>> r1 = r3.mActivities
                r1.remove(r0)
            L2c:
                int r0 = r0 + (-1)
                goto L8
            L2f:
                android.util.SparseIntArray[] r0 = r3.mMetrics
                return r0
        }
    }

    private static class FrameMetricsBaseImpl {
        FrameMetricsBaseImpl() {
                r0 = this;
                r0.<init>()
                return
        }

        public void add(android.app.Activity r1) {
                r0 = this;
                return
        }

        public android.util.SparseIntArray[] getMetrics() {
                r1 = this;
                r0 = 0
                return r0
        }

        public android.util.SparseIntArray[] remove(android.app.Activity r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        public android.util.SparseIntArray[] reset() {
                r1 = this;
                r0 = 0
                return r0
        }

        public android.util.SparseIntArray[] stop() {
                r1 = this;
                r0 = 0
                return r0
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface MetricType {
    }

    public FrameMetricsAggregator() {
            r1 = this;
            r0 = 1
            r1.<init>(r0)
            return
    }

    public FrameMetricsAggregator(int r2) {
            r1 = this;
            r1.<init>()
            androidx.core.app.FrameMetricsAggregator$FrameMetricsApi24Impl r0 = new androidx.core.app.FrameMetricsAggregator$FrameMetricsApi24Impl
            r0.<init>(r2)
            r1.mInstance = r0
            return
    }

    public void add(android.app.Activity r2) {
            r1 = this;
            androidx.core.app.FrameMetricsAggregator$FrameMetricsBaseImpl r0 = r1.mInstance
            r0.add(r2)
            return
    }

    public android.util.SparseIntArray[] getMetrics() {
            r1 = this;
            androidx.core.app.FrameMetricsAggregator$FrameMetricsBaseImpl r0 = r1.mInstance
            android.util.SparseIntArray[] r0 = r0.getMetrics()
            return r0
    }

    public android.util.SparseIntArray[] remove(android.app.Activity r2) {
            r1 = this;
            androidx.core.app.FrameMetricsAggregator$FrameMetricsBaseImpl r0 = r1.mInstance
            android.util.SparseIntArray[] r2 = r0.remove(r2)
            return r2
    }

    public android.util.SparseIntArray[] reset() {
            r1 = this;
            androidx.core.app.FrameMetricsAggregator$FrameMetricsBaseImpl r0 = r1.mInstance
            android.util.SparseIntArray[] r0 = r0.reset()
            return r0
    }

    public android.util.SparseIntArray[] stop() {
            r1 = this;
            androidx.core.app.FrameMetricsAggregator$FrameMetricsBaseImpl r0 = r1.mInstance
            android.util.SparseIntArray[] r0 = r0.stop()
            return r0
    }
}
