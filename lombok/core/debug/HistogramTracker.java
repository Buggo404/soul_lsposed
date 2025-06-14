package lombok.core.debug;

/* loaded from: com.usidqw.qwerklj.apk:lombok/core/debug/HistogramTracker.SCL.lombok */
public class HistogramTracker {
    private static final long[] RANGES = null;
    private static final long REPORT_WINDOW = 60000;
    private final java.lang.String category;
    private final java.util.concurrent.atomic.AtomicStampedReference<long[]> bars;
    private final java.util.concurrent.atomic.AtomicBoolean addedSysHook;
    private final java.io.PrintStream out;


    static {
            r0 = 15
            long[] r0 = new long[r0]
            r1 = r0
            r2 = 0
            r3 = 250001(0x3d091, double:1.23517E-318)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 500001(0x7a121, double:2.470333E-318)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 1000001(0xf4241, double:4.94066E-318)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 2000001(0x1e8481, double:9.88132E-318)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            r3 = 4000001(0x3d0901, double:1.976263E-317)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            r3 = 8000001(0x7a1201, double:3.9525257E-317)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            r3 = 16000001(0xf42401, double:7.905051E-317)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            r3 = 32000001(0x1e84801, double:1.5810101E-316)
            r1[r2] = r3
            r1 = r0
            r2 = 8
            r3 = 64000001(0x3d09001, double:3.1620202E-316)
            r1[r2] = r3
            r1 = r0
            r2 = 9
            r3 = 128000001(0x7a12001, double:6.3240403E-316)
            r1[r2] = r3
            r1 = r0
            r2 = 10
            r3 = 256000001(0xf424001, double:1.26480806E-315)
            r1[r2] = r3
            r1 = r0
            r2 = 11
            r3 = 512000001(0x1e848001, double:2.52961611E-315)
            r1[r2] = r3
            r1 = r0
            r2 = 12
            r3 = 1024000001(0x3d090001, double:5.05923222E-315)
            r1[r2] = r3
            r1 = r0
            r2 = 13
            r3 = 2048000001(0x7a120001, double:1.011846443E-314)
            r1[r2] = r3
            r1 = r0
            r2 = 14
            r3 = 10000000001(0x2540be401, double:4.940656459E-314)
            r1[r2] = r3
            lombok.core.debug.HistogramTracker.RANGES = r0
            return
    }

    public HistogramTracker(java.lang.String r7) {
            r6 = this;
            r0 = r6
            r0.<init>()
            r0 = r6
            java.util.concurrent.atomic.AtomicStampedReference r1 = new java.util.concurrent.atomic.AtomicStampedReference
            r2 = r1
            long[] r3 = lombok.core.debug.HistogramTracker.RANGES
            int r3 = r3.length
            r4 = 2
            int r3 = r3 + r4
            long[] r3 = new long[r3]
            r4 = 0
            r2.<init>(r3, r4)
            r0.bars = r1
            r0 = r6
            java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean
            r2 = r1
            r3 = 0
            r2.<init>(r3)
            r0.addedSysHook = r1
            r0 = r6
            r1 = r7
            r0.category = r1
            r0 = r6
            r1 = 0
            r0.out = r1
            r0 = r6
            r0.printInit()
            return
    }

    public HistogramTracker(java.lang.String r7, java.io.PrintStream r8) {
            r6 = this;
            r0 = r6
            r0.<init>()
            r0 = r6
            java.util.concurrent.atomic.AtomicStampedReference r1 = new java.util.concurrent.atomic.AtomicStampedReference
            r2 = r1
            long[] r3 = lombok.core.debug.HistogramTracker.RANGES
            int r3 = r3.length
            r4 = 2
            int r3 = r3 + r4
            long[] r3 = new long[r3]
            r4 = 0
            r2.<init>(r3, r4)
            r0.bars = r1
            r0 = r6
            java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean
            r2 = r1
            r3 = 0
            r2.<init>(r3)
            r0.addedSysHook = r1
            r0 = r6
            r1 = r7
            r0.category = r1
            r0 = r6
            r1 = r8
            r0.out = r1
            r0 = r6
            r0.printInit()
            return
    }

    private void printInit() {
            r7 = this;
            r0 = r7
            java.lang.String r0 = r0.category
            if (r0 != 0) goto L23
            r0 = r7
            java.io.PrintStream r0 = r0.out
            if (r0 != 0) goto L17
            java.lang.String r0 = "Initialized histogram"
            r1 = 0
            lombok.core.debug.ProblemReporter.info(r0, r1)
            goto L56
        L17:
            r0 = r7
            java.io.PrintStream r0 = r0.out
            java.lang.String r1 = "Initialized histogram"
            r0.println(r1)
            goto L56
        L23:
            r0 = r7
            java.io.PrintStream r0 = r0.out
            if (r0 != 0) goto L41
            java.lang.String r0 = "Initialized histogram tracker for '%s'"
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = r1
            r3 = 0
            r4 = r7
            java.lang.String r4 = r4.category
            r2[r3] = r4
            java.lang.String r0 = java.lang.String.format(r0, r1)
            r1 = 0
            lombok.core.debug.ProblemReporter.info(r0, r1)
            goto L56
        L41:
            r0 = r7
            java.io.PrintStream r0 = r0.out
            java.lang.String r1 = "Initialized histogram tracker for '%s'%n"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r7
            java.lang.String r5 = r5.category
            r3[r4] = r5
            java.io.PrintStream r0 = r0.printf(r1, r2)
        L56:
            return
    }

    public long start() {
            r3 = this;
            long r0 = java.lang.System.nanoTime()
            return r0
    }

    public void end(long r8) {
            r7 = this;
            r0 = r7
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.addedSysHook
            r1 = 1
            boolean r0 = r0.getAndSet(r1)
            if (r0 != 0) goto L1b
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            lombok.core.debug.HistogramTracker$1 r1 = new lombok.core.debug.HistogramTracker$1
            r2 = r1
            r3 = r7
            java.lang.String r4 = "Histogram Printer"
            r2.<init>(r3, r4)
            r0.addShutdownHook(r1)
        L1b:
            long r0 = java.lang.System.nanoTime()
            r10 = r0
            long r0 = java.lang.System.currentTimeMillis()
            r12 = r0
            r0 = r10
            r1 = r8
            long r0 = r0 - r1
            r14 = r0
            r0 = r14
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L33
            r0 = 0
            r14 = r0
        L33:
            r0 = r12
            r1 = 60000(0xea60, double:2.9644E-319)
            long r0 = r0 / r1
            int r0 = (int) r0
            r16 = r0
            r0 = 1
            int[] r0 = new int[r0]
            r17 = r0
            r0 = r7
            java.util.concurrent.atomic.AtomicStampedReference<long[]> r0 = r0.bars
            r1 = r17
            java.lang.Object r0 = r0.get(r1)
            long[] r0 = (long[]) r0
            r18 = r0
            r0 = r17
            r1 = 0
            r0 = r0[r1]
            r1 = r16
            if (r0 == r1) goto L91
            r0 = r7
            r1 = r17
            r2 = 0
            r1 = r1[r2]
            r2 = r18
            r0.printReport(r1, r2)
            long[] r0 = lombok.core.debug.HistogramTracker.RANGES
            int r0 = r0.length
            r1 = 2
            int r0 = r0 + r1
            long[] r0 = new long[r0]
            r19 = r0
            r0 = r7
            java.util.concurrent.atomic.AtomicStampedReference<long[]> r0 = r0.bars
            r1 = r18
            r2 = r19
            r3 = r17
            r4 = 0
            r3 = r3[r4]
            r4 = r16
            boolean r0 = r0.compareAndSet(r1, r2, r3, r4)
            if (r0 != 0) goto L95
            r0 = r7
            java.util.concurrent.atomic.AtomicStampedReference<long[]> r0 = r0.bars
            r1 = r17
            java.lang.Object r0 = r0.get(r1)
            long[] r0 = (long[]) r0
            r19 = r0
            goto L95
        L91:
            r0 = r18
            r19 = r0
        L95:
            r0 = r19
            long[] r1 = lombok.core.debug.HistogramTracker.RANGES
            int r1 = r1.length
            r2 = 1
            int r1 = r1 + r2
            r2 = r0; r3 = r1; 
            r2 = r2[r3]
            r3 = r14
            long r2 = r2 + r3
            r0[r1] = r2
            r0 = 0
            r20 = r0
            goto Lc2
        La9:
            r0 = r14
            long[] r1 = lombok.core.debug.HistogramTracker.RANGES
            r2 = r20
            r1 = r1[r2]
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto Lbf
            r0 = r19
            r1 = r20
            r2 = r0; r3 = r1; 
            r2 = r2[r3]
            r3 = 1
            long r2 = r2 + r3
            r0[r1] = r2
            return
        Lbf:
            int r20 = r20 + 1
        Lc2:
            r0 = r20
            long[] r1 = lombok.core.debug.HistogramTracker.RANGES
            int r1 = r1.length
            if (r0 < r1) goto La9
            r0 = r19
            long[] r1 = lombok.core.debug.HistogramTracker.RANGES
            int r1 = r1.length
            r2 = r0; r3 = r1; 
            r2 = r2[r3]
            r3 = 1
            long r2 = r2 + r3
            r0[r1] = r2
            return
    }

    private void printReport(int r7, long[] r8) {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r9 = r0
            r0 = r6
            java.lang.String r0 = r0.category
            if (r0 == 0) goto L1d
            r0 = r9
            r1 = r6
            java.lang.String r1 = r1.category
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " "
            java.lang.StringBuilder r0 = r0.append(r1)
        L1d:
            r0 = r9
            java.lang.String r1 = "["
            java.lang.StringBuilder r0 = r0.append(r1)
            java.util.GregorianCalendar r0 = new java.util.GregorianCalendar
            r1 = r0
            r1.<init>()
            r10 = r0
            r0 = r10
            r1 = r7
            long r1 = (long) r1
            r2 = 60000(0xea60, double:2.9644E-319)
            long r1 = r1 * r2
            r0.setTimeInMillis(r1)
            r0 = r10
            r1 = 11
            int r0 = r0.get(r1)
            r11 = r0
            r0 = r10
            r1 = 12
            int r0 = r0.get(r1)
            r12 = r0
            r0 = r11
            r1 = 10
            if (r0 >= r1) goto L58
            r0 = r9
            r1 = 48
            java.lang.StringBuilder r0 = r0.append(r1)
        L58:
            r0 = r9
            r1 = r11
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ":"
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r12
            r1 = 10
            if (r0 >= r1) goto L72
            r0 = r9
            r1 = 48
            java.lang.StringBuilder r0 = r0.append(r1)
        L72:
            r0 = r9
            r1 = r12
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "] {"
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r8
            long[] r1 = lombok.core.debug.HistogramTracker.RANGES
            int r1 = r1.length
            r0 = r0[r1]
            r13 = r0
            r0 = 0
            r15 = r0
            r0 = r9
            int r0 = r0.length()
            r16 = r0
            r0 = 0
            r17 = r0
            goto Lde
        L95:
            r0 = r13
            r1 = r8
            r2 = r17
            r1 = r1[r2]
            long r0 = r0 + r1
            r13 = r0
            r0 = r9
            r1 = r8
            r2 = r17
            r1 = r1[r2]
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r8
            r1 = r17
            r0 = r0[r1]
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto Lb6
            r0 = r9
            int r0 = r0.length()
            r16 = r0
        Lb6:
            r0 = r9
            java.lang.String r1 = " "
            java.lang.StringBuilder r0 = r0.append(r1)
            int r15 = r15 + 1
            r0 = r15
            r1 = 3
            if (r0 != r1) goto Lcd
            r0 = r9
            java.lang.String r1 = "-- "
            java.lang.StringBuilder r0 = r0.append(r1)
        Lcd:
            r0 = r15
            r1 = 9
            if (r0 != r1) goto Ldb
            r0 = r9
            java.lang.String r1 = "-- "
            java.lang.StringBuilder r0 = r0.append(r1)
        Ldb:
            int r17 = r17 + 1
        Lde:
            r0 = r17
            long[] r1 = lombok.core.debug.HistogramTracker.RANGES
            int r1 = r1.length
            if (r0 < r1) goto L95
            r0 = r13
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto Lef
            return
        Lef:
            r0 = r9
            r1 = r16
            r0.setLength(r1)
            r0 = r8
            long[] r1 = lombok.core.debug.HistogramTracker.RANGES
            int r1 = r1.length
            r2 = 1
            int r1 = r1 + r2
            r0 = r0[r1]
            double r0 = (double) r0
            r1 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r0 = r0 / r1
            r17 = r0
            r0 = r8
            long[] r1 = lombok.core.debug.HistogramTracker.RANGES
            int r1 = r1.length
            r0 = r0[r1]
            r19 = r0
            r0 = r19
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L123
            r0 = r9
            java.lang.String r1 = " -- "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r8
            long[] r2 = lombok.core.debug.HistogramTracker.RANGES
            int r2 = r2.length
            r1 = r1[r2]
            java.lang.StringBuilder r0 = r0.append(r1)
        L123:
            r0 = r9
            java.lang.String r1 = "} total calls: "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r13
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " total time (millis): "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r17
            r2 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r1 = r1 + r2
            int r1 = (int) r1
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r6
            java.io.PrintStream r0 = r0.out
            if (r0 != 0) goto L150
            r0 = r9
            java.lang.String r0 = r0.toString()
            r1 = 0
            lombok.core.debug.ProblemReporter.info(r0, r1)
            goto L15b
        L150:
            r0 = r6
            java.io.PrintStream r0 = r0.out
            r1 = r9
            java.lang.String r1 = r1.toString()
            r0.println(r1)
        L15b:
            return
    }

    static /* synthetic */ java.util.concurrent.atomic.AtomicStampedReference access$0(lombok.core.debug.HistogramTracker r2) {
            r0 = r2
            java.util.concurrent.atomic.AtomicStampedReference<long[]> r0 = r0.bars
            return r0
    }

    static /* synthetic */ void access$1(lombok.core.debug.HistogramTracker r4, int r5, long[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            r0.printReport(r1, r2)
            return
    }
}
