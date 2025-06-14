package androidx.lifecycle;

/* loaded from: classes.dex */
public abstract class Lifecycle {
    java.util.concurrent.atomic.AtomicReference<java.lang.Object> mInternalScopeRef;

    /* renamed from: androidx.lifecycle.Lifecycle$1 */
    static /* synthetic */ class C03301 {
        static final /* synthetic */ int[] $SwitchMap$androidx$lifecycle$Lifecycle$Event = null;
        static final /* synthetic */ int[] $SwitchMap$androidx$lifecycle$Lifecycle$State = null;

        static {
                androidx.lifecycle.Lifecycle$Event[] r0 = androidx.lifecycle.Lifecycle.Event.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.lifecycle.Lifecycle.C03301.$SwitchMap$androidx$lifecycle$Lifecycle$Event = r0
                r1 = 1
                androidx.lifecycle.Lifecycle$Event r2 = androidx.lifecycle.Lifecycle.Event.ON_CREATE     // Catch: java.lang.NoSuchFieldError -> L12
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r0[r2] = r1     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                r0 = 2
                int[] r2 = androidx.lifecycle.Lifecycle.C03301.$SwitchMap$androidx$lifecycle$Lifecycle$Event     // Catch: java.lang.NoSuchFieldError -> L1d
                androidx.lifecycle.Lifecycle$Event r3 = androidx.lifecycle.Lifecycle.Event.ON_STOP     // Catch: java.lang.NoSuchFieldError -> L1d
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2[r3] = r0     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                r2 = 3
                int[] r3 = androidx.lifecycle.Lifecycle.C03301.$SwitchMap$androidx$lifecycle$Lifecycle$Event     // Catch: java.lang.NoSuchFieldError -> L28
                androidx.lifecycle.Lifecycle$Event r4 = androidx.lifecycle.Lifecycle.Event.ON_START     // Catch: java.lang.NoSuchFieldError -> L28
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r3[r4] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                r3 = 4
                int[] r4 = androidx.lifecycle.Lifecycle.C03301.$SwitchMap$androidx$lifecycle$Lifecycle$Event     // Catch: java.lang.NoSuchFieldError -> L33
                androidx.lifecycle.Lifecycle$Event r5 = androidx.lifecycle.Lifecycle.Event.ON_PAUSE     // Catch: java.lang.NoSuchFieldError -> L33
                int r5 = r5.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r4[r5] = r3     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                r4 = 5
                int[] r5 = androidx.lifecycle.Lifecycle.C03301.$SwitchMap$androidx$lifecycle$Lifecycle$Event     // Catch: java.lang.NoSuchFieldError -> L3e
                androidx.lifecycle.Lifecycle$Event r6 = androidx.lifecycle.Lifecycle.Event.ON_RESUME     // Catch: java.lang.NoSuchFieldError -> L3e
                int r6 = r6.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r5[r6] = r4     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r5 = androidx.lifecycle.Lifecycle.C03301.$SwitchMap$androidx$lifecycle$Lifecycle$Event     // Catch: java.lang.NoSuchFieldError -> L49
                androidx.lifecycle.Lifecycle$Event r6 = androidx.lifecycle.Lifecycle.Event.ON_DESTROY     // Catch: java.lang.NoSuchFieldError -> L49
                int r6 = r6.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r7 = 6
                r5[r6] = r7     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r5 = androidx.lifecycle.Lifecycle.C03301.$SwitchMap$androidx$lifecycle$Lifecycle$Event     // Catch: java.lang.NoSuchFieldError -> L54
                androidx.lifecycle.Lifecycle$Event r6 = androidx.lifecycle.Lifecycle.Event.ON_ANY     // Catch: java.lang.NoSuchFieldError -> L54
                int r6 = r6.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r7 = 7
                r5[r6] = r7     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                androidx.lifecycle.Lifecycle$State[] r5 = androidx.lifecycle.Lifecycle.State.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                androidx.lifecycle.Lifecycle.C03301.$SwitchMap$androidx$lifecycle$Lifecycle$State = r5
                androidx.lifecycle.Lifecycle$State r6 = androidx.lifecycle.Lifecycle.State.CREATED     // Catch: java.lang.NoSuchFieldError -> L65
                int r6 = r6.ordinal()     // Catch: java.lang.NoSuchFieldError -> L65
                r5[r6] = r1     // Catch: java.lang.NoSuchFieldError -> L65
            L65:
                int[] r1 = androidx.lifecycle.Lifecycle.C03301.$SwitchMap$androidx$lifecycle$Lifecycle$State     // Catch: java.lang.NoSuchFieldError -> L6f
                androidx.lifecycle.Lifecycle$State r5 = androidx.lifecycle.Lifecycle.State.STARTED     // Catch: java.lang.NoSuchFieldError -> L6f
                int r5 = r5.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6f
                r1[r5] = r0     // Catch: java.lang.NoSuchFieldError -> L6f
            L6f:
                int[] r0 = androidx.lifecycle.Lifecycle.C03301.$SwitchMap$androidx$lifecycle$Lifecycle$State     // Catch: java.lang.NoSuchFieldError -> L79
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.RESUMED     // Catch: java.lang.NoSuchFieldError -> L79
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L79
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L79
            L79:
                int[] r0 = androidx.lifecycle.Lifecycle.C03301.$SwitchMap$androidx$lifecycle$Lifecycle$State     // Catch: java.lang.NoSuchFieldError -> L83
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.DESTROYED     // Catch: java.lang.NoSuchFieldError -> L83
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L83
                r0[r1] = r3     // Catch: java.lang.NoSuchFieldError -> L83
            L83:
                int[] r0 = androidx.lifecycle.Lifecycle.C03301.$SwitchMap$androidx$lifecycle$Lifecycle$State     // Catch: java.lang.NoSuchFieldError -> L8d
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L8d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L8d
                r0[r1] = r4     // Catch: java.lang.NoSuchFieldError -> L8d
            L8d:
                return
        }
    }

    public enum Event extends java.lang.Enum<androidx.lifecycle.Lifecycle.Event> {
        private static final /* synthetic */ androidx.lifecycle.Lifecycle.Event[] $VALUES = null;
        public static final androidx.lifecycle.Lifecycle.Event ON_ANY = null;
        public static final androidx.lifecycle.Lifecycle.Event ON_CREATE = null;
        public static final androidx.lifecycle.Lifecycle.Event ON_DESTROY = null;
        public static final androidx.lifecycle.Lifecycle.Event ON_PAUSE = null;
        public static final androidx.lifecycle.Lifecycle.Event ON_RESUME = null;
        public static final androidx.lifecycle.Lifecycle.Event ON_START = null;
        public static final androidx.lifecycle.Lifecycle.Event ON_STOP = null;

        static {
                androidx.lifecycle.Lifecycle$Event r0 = new androidx.lifecycle.Lifecycle$Event
                java.lang.String r1 = "ON_CREATE"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.lifecycle.Lifecycle.Event.ON_CREATE = r0
                androidx.lifecycle.Lifecycle$Event r1 = new androidx.lifecycle.Lifecycle$Event
                java.lang.String r3 = "ON_START"
                r4 = 1
                r1.<init>(r3, r4)
                androidx.lifecycle.Lifecycle.Event.ON_START = r1
                androidx.lifecycle.Lifecycle$Event r3 = new androidx.lifecycle.Lifecycle$Event
                java.lang.String r5 = "ON_RESUME"
                r6 = 2
                r3.<init>(r5, r6)
                androidx.lifecycle.Lifecycle.Event.ON_RESUME = r3
                androidx.lifecycle.Lifecycle$Event r5 = new androidx.lifecycle.Lifecycle$Event
                java.lang.String r7 = "ON_PAUSE"
                r8 = 3
                r5.<init>(r7, r8)
                androidx.lifecycle.Lifecycle.Event.ON_PAUSE = r5
                androidx.lifecycle.Lifecycle$Event r7 = new androidx.lifecycle.Lifecycle$Event
                java.lang.String r9 = "ON_STOP"
                r10 = 4
                r7.<init>(r9, r10)
                androidx.lifecycle.Lifecycle.Event.ON_STOP = r7
                androidx.lifecycle.Lifecycle$Event r9 = new androidx.lifecycle.Lifecycle$Event
                java.lang.String r11 = "ON_DESTROY"
                r12 = 5
                r9.<init>(r11, r12)
                androidx.lifecycle.Lifecycle.Event.ON_DESTROY = r9
                androidx.lifecycle.Lifecycle$Event r11 = new androidx.lifecycle.Lifecycle$Event
                java.lang.String r13 = "ON_ANY"
                r14 = 6
                r11.<init>(r13, r14)
                androidx.lifecycle.Lifecycle.Event.ON_ANY = r11
                r13 = 7
                androidx.lifecycle.Lifecycle$Event[] r13 = new androidx.lifecycle.Lifecycle.Event[r13]
                r13[r2] = r0
                r13[r4] = r1
                r13[r6] = r3
                r13[r8] = r5
                r13[r10] = r7
                r13[r12] = r9
                r13[r14] = r11
                androidx.lifecycle.Lifecycle.Event.$VALUES = r13
                return
        }

        Event(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static androidx.lifecycle.Lifecycle.Event downFrom(androidx.lifecycle.Lifecycle.State r1) {
                int[] r0 = androidx.lifecycle.Lifecycle.C03301.$SwitchMap$androidx$lifecycle$Lifecycle$State
                int r1 = r1.ordinal()
                r1 = r0[r1]
                r0 = 1
                if (r1 == r0) goto L19
                r0 = 2
                if (r1 == r0) goto L16
                r0 = 3
                if (r1 == r0) goto L13
                r1 = 0
                return r1
            L13:
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_PAUSE
                return r1
            L16:
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_STOP
                return r1
            L19:
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_DESTROY
                return r1
        }

        public static androidx.lifecycle.Lifecycle.Event downTo(androidx.lifecycle.Lifecycle.State r1) {
                int[] r0 = androidx.lifecycle.Lifecycle.C03301.$SwitchMap$androidx$lifecycle$Lifecycle$State
                int r1 = r1.ordinal()
                r1 = r0[r1]
                r0 = 1
                if (r1 == r0) goto L19
                r0 = 2
                if (r1 == r0) goto L16
                r0 = 4
                if (r1 == r0) goto L13
                r1 = 0
                return r1
            L13:
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_DESTROY
                return r1
            L16:
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_PAUSE
                return r1
            L19:
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_STOP
                return r1
        }

        public static androidx.lifecycle.Lifecycle.Event upFrom(androidx.lifecycle.Lifecycle.State r1) {
                int[] r0 = androidx.lifecycle.Lifecycle.C03301.$SwitchMap$androidx$lifecycle$Lifecycle$State
                int r1 = r1.ordinal()
                r1 = r0[r1]
                r0 = 1
                if (r1 == r0) goto L19
                r0 = 2
                if (r1 == r0) goto L16
                r0 = 5
                if (r1 == r0) goto L13
                r1 = 0
                return r1
            L13:
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_CREATE
                return r1
            L16:
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_RESUME
                return r1
            L19:
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_START
                return r1
        }

        public static androidx.lifecycle.Lifecycle.Event upTo(androidx.lifecycle.Lifecycle.State r1) {
                int[] r0 = androidx.lifecycle.Lifecycle.C03301.$SwitchMap$androidx$lifecycle$Lifecycle$State
                int r1 = r1.ordinal()
                r1 = r0[r1]
                r0 = 1
                if (r1 == r0) goto L19
                r0 = 2
                if (r1 == r0) goto L16
                r0 = 3
                if (r1 == r0) goto L13
                r1 = 0
                return r1
            L13:
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_RESUME
                return r1
            L16:
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_START
                return r1
            L19:
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_CREATE
                return r1
        }

        public static androidx.lifecycle.Lifecycle.Event valueOf(java.lang.String r1) {
                java.lang.Class<androidx.lifecycle.Lifecycle$Event> r0 = androidx.lifecycle.Lifecycle.Event.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.lifecycle.Lifecycle$Event r1 = (androidx.lifecycle.Lifecycle.Event) r1
                return r1
        }

        public static androidx.lifecycle.Lifecycle.Event[] values() {
                androidx.lifecycle.Lifecycle$Event[] r0 = androidx.lifecycle.Lifecycle.Event.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.lifecycle.Lifecycle$Event[] r0 = (androidx.lifecycle.Lifecycle.Event[]) r0
                return r0
        }

        public androidx.lifecycle.Lifecycle.State getTargetState() {
                r3 = this;
                int[] r0 = androidx.lifecycle.Lifecycle.C03301.$SwitchMap$androidx$lifecycle$Lifecycle$Event
                int r1 = r3.ordinal()
                r0 = r0[r1]
                switch(r0) {
                    case 1: goto L2d;
                    case 2: goto L2d;
                    case 3: goto L2a;
                    case 4: goto L2a;
                    case 5: goto L27;
                    case 6: goto L24;
                    default: goto Lb;
                }
            Lb:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.StringBuilder r1 = r1.append(r3)
                java.lang.String r2 = " has no target state"
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L24:
                androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.DESTROYED
                return r0
            L27:
                androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.RESUMED
                return r0
            L2a:
                androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.STARTED
                return r0
            L2d:
                androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.CREATED
                return r0
        }
    }

    public enum State extends java.lang.Enum<androidx.lifecycle.Lifecycle.State> {
        private static final /* synthetic */ androidx.lifecycle.Lifecycle.State[] $VALUES = null;
        public static final androidx.lifecycle.Lifecycle.State CREATED = null;
        public static final androidx.lifecycle.Lifecycle.State DESTROYED = null;
        public static final androidx.lifecycle.Lifecycle.State INITIALIZED = null;
        public static final androidx.lifecycle.Lifecycle.State RESUMED = null;
        public static final androidx.lifecycle.Lifecycle.State STARTED = null;

        static {
                androidx.lifecycle.Lifecycle$State r0 = new androidx.lifecycle.Lifecycle$State
                java.lang.String r1 = "DESTROYED"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.lifecycle.Lifecycle.State.DESTROYED = r0
                androidx.lifecycle.Lifecycle$State r1 = new androidx.lifecycle.Lifecycle$State
                java.lang.String r3 = "INITIALIZED"
                r4 = 1
                r1.<init>(r3, r4)
                androidx.lifecycle.Lifecycle.State.INITIALIZED = r1
                androidx.lifecycle.Lifecycle$State r3 = new androidx.lifecycle.Lifecycle$State
                java.lang.String r5 = "CREATED"
                r6 = 2
                r3.<init>(r5, r6)
                androidx.lifecycle.Lifecycle.State.CREATED = r3
                androidx.lifecycle.Lifecycle$State r5 = new androidx.lifecycle.Lifecycle$State
                java.lang.String r7 = "STARTED"
                r8 = 3
                r5.<init>(r7, r8)
                androidx.lifecycle.Lifecycle.State.STARTED = r5
                androidx.lifecycle.Lifecycle$State r7 = new androidx.lifecycle.Lifecycle$State
                java.lang.String r9 = "RESUMED"
                r10 = 4
                r7.<init>(r9, r10)
                androidx.lifecycle.Lifecycle.State.RESUMED = r7
                r9 = 5
                androidx.lifecycle.Lifecycle$State[] r9 = new androidx.lifecycle.Lifecycle.State[r9]
                r9[r2] = r0
                r9[r4] = r1
                r9[r6] = r3
                r9[r8] = r5
                r9[r10] = r7
                androidx.lifecycle.Lifecycle.State.$VALUES = r9
                return
        }

        State(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static androidx.lifecycle.Lifecycle.State valueOf(java.lang.String r1) {
                java.lang.Class<androidx.lifecycle.Lifecycle$State> r0 = androidx.lifecycle.Lifecycle.State.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.lifecycle.Lifecycle$State r1 = (androidx.lifecycle.Lifecycle.State) r1
                return r1
        }

        public static androidx.lifecycle.Lifecycle.State[] values() {
                androidx.lifecycle.Lifecycle$State[] r0 = androidx.lifecycle.Lifecycle.State.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.lifecycle.Lifecycle$State[] r0 = (androidx.lifecycle.Lifecycle.State[]) r0
                return r0
        }

        public boolean isAtLeast(androidx.lifecycle.Lifecycle.State r1) {
                r0 = this;
                int r1 = r0.compareTo(r1)
                if (r1 < 0) goto L8
                r1 = 1
                goto L9
            L8:
                r1 = 0
            L9:
                return r1
        }
    }

    public Lifecycle() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r1.mInternalScopeRef = r0
            return
    }

    public abstract void addObserver(androidx.lifecycle.LifecycleObserver r1);

    public abstract androidx.lifecycle.Lifecycle.State getCurrentState();

    public abstract void removeObserver(androidx.lifecycle.LifecycleObserver r1);
}
