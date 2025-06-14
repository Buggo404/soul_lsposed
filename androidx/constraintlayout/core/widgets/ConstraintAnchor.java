package androidx.constraintlayout.core.widgets;

/* loaded from: classes.dex */
public class ConstraintAnchor {
    private static final boolean ALLOW_BINARY = false;
    private static final int UNSET_GONE_MARGIN = Integer.MIN_VALUE;
    private java.util.HashSet<androidx.constraintlayout.core.widgets.ConstraintAnchor> mDependents;
    private int mFinalValue;
    int mGoneMargin;
    private boolean mHasFinalValue;
    public int mMargin;
    public final androidx.constraintlayout.core.widgets.ConstraintWidget mOwner;
    androidx.constraintlayout.core.SolverVariable mSolverVariable;
    public androidx.constraintlayout.core.widgets.ConstraintAnchor mTarget;
    public final androidx.constraintlayout.core.widgets.ConstraintAnchor.Type mType;

    /* renamed from: androidx.constraintlayout.core.widgets.ConstraintAnchor$1 */
    static /* synthetic */ class C01271 {

        /* renamed from: $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type */
        static final /* synthetic */ int[] f37x6930e354 = null;

        static {
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type[] r0 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.constraintlayout.core.widgets.ConstraintAnchor.C01271.f37x6930e354 = r0
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = androidx.constraintlayout.core.widgets.ConstraintAnchor.C01271.f37x6930e354     // Catch: java.lang.NoSuchFieldError -> L1d
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = androidx.constraintlayout.core.widgets.ConstraintAnchor.C01271.f37x6930e354     // Catch: java.lang.NoSuchFieldError -> L28
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = androidx.constraintlayout.core.widgets.ConstraintAnchor.C01271.f37x6930e354     // Catch: java.lang.NoSuchFieldError -> L33
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = androidx.constraintlayout.core.widgets.ConstraintAnchor.C01271.f37x6930e354     // Catch: java.lang.NoSuchFieldError -> L3e
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = androidx.constraintlayout.core.widgets.ConstraintAnchor.C01271.f37x6930e354     // Catch: java.lang.NoSuchFieldError -> L49
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r0 = androidx.constraintlayout.core.widgets.ConstraintAnchor.C01271.f37x6930e354     // Catch: java.lang.NoSuchFieldError -> L54
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_X     // Catch: java.lang.NoSuchFieldError -> L54
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                int[] r0 = androidx.constraintlayout.core.widgets.ConstraintAnchor.C01271.f37x6930e354     // Catch: java.lang.NoSuchFieldError -> L60
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_Y     // Catch: java.lang.NoSuchFieldError -> L60
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L60
                r2 = 8
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L60
            L60:
                int[] r0 = androidx.constraintlayout.core.widgets.ConstraintAnchor.C01271.f37x6930e354     // Catch: java.lang.NoSuchFieldError -> L6c
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.NONE     // Catch: java.lang.NoSuchFieldError -> L6c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6c
                r2 = 9
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6c
            L6c:
                return
        }
    }

    public enum Type extends java.lang.Enum<androidx.constraintlayout.core.widgets.ConstraintAnchor.Type> {
        private static final /* synthetic */ androidx.constraintlayout.core.widgets.ConstraintAnchor.Type[] $VALUES = null;
        public static final androidx.constraintlayout.core.widgets.ConstraintAnchor.Type BASELINE = null;
        public static final androidx.constraintlayout.core.widgets.ConstraintAnchor.Type BOTTOM = null;
        public static final androidx.constraintlayout.core.widgets.ConstraintAnchor.Type CENTER = null;
        public static final androidx.constraintlayout.core.widgets.ConstraintAnchor.Type CENTER_X = null;
        public static final androidx.constraintlayout.core.widgets.ConstraintAnchor.Type CENTER_Y = null;
        public static final androidx.constraintlayout.core.widgets.ConstraintAnchor.Type LEFT = null;
        public static final androidx.constraintlayout.core.widgets.ConstraintAnchor.Type NONE = null;
        public static final androidx.constraintlayout.core.widgets.ConstraintAnchor.Type RIGHT = null;
        public static final androidx.constraintlayout.core.widgets.ConstraintAnchor.Type TOP = null;

        static {
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r0 = new androidx.constraintlayout.core.widgets.ConstraintAnchor$Type
                java.lang.String r1 = "NONE"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.NONE = r0
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = new androidx.constraintlayout.core.widgets.ConstraintAnchor$Type
                java.lang.String r3 = "LEFT"
                r4 = 1
                r1.<init>(r3, r4)
                androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT = r1
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r3 = new androidx.constraintlayout.core.widgets.ConstraintAnchor$Type
                java.lang.String r5 = "TOP"
                r6 = 2
                r3.<init>(r5, r6)
                androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP = r3
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r5 = new androidx.constraintlayout.core.widgets.ConstraintAnchor$Type
                java.lang.String r7 = "RIGHT"
                r8 = 3
                r5.<init>(r7, r8)
                androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT = r5
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r7 = new androidx.constraintlayout.core.widgets.ConstraintAnchor$Type
                java.lang.String r9 = "BOTTOM"
                r10 = 4
                r7.<init>(r9, r10)
                androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM = r7
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r9 = new androidx.constraintlayout.core.widgets.ConstraintAnchor$Type
                java.lang.String r11 = "BASELINE"
                r12 = 5
                r9.<init>(r11, r12)
                androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE = r9
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r11 = new androidx.constraintlayout.core.widgets.ConstraintAnchor$Type
                java.lang.String r13 = "CENTER"
                r14 = 6
                r11.<init>(r13, r14)
                androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER = r11
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r13 = new androidx.constraintlayout.core.widgets.ConstraintAnchor$Type
                java.lang.String r15 = "CENTER_X"
                r14 = 7
                r13.<init>(r15, r14)
                androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_X = r13
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r15 = new androidx.constraintlayout.core.widgets.ConstraintAnchor$Type
                java.lang.String r14 = "CENTER_Y"
                r12 = 8
                r15.<init>(r14, r12)
                androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_Y = r15
                r14 = 9
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type[] r14 = new androidx.constraintlayout.core.widgets.ConstraintAnchor.Type[r14]
                r14[r2] = r0
                r14[r4] = r1
                r14[r6] = r3
                r14[r8] = r5
                r14[r10] = r7
                r0 = 5
                r14[r0] = r9
                r0 = 6
                r14[r0] = r11
                r0 = 7
                r14[r0] = r13
                r14[r12] = r15
                androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.$VALUES = r14
                return
        }

        Type(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static androidx.constraintlayout.core.widgets.ConstraintAnchor.Type valueOf(java.lang.String r1) {
                java.lang.Class<androidx.constraintlayout.core.widgets.ConstraintAnchor$Type> r0 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = (androidx.constraintlayout.core.widgets.ConstraintAnchor.Type) r1
                return r1
        }

        public static androidx.constraintlayout.core.widgets.ConstraintAnchor.Type[] values() {
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type[] r0 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type[] r0 = (androidx.constraintlayout.core.widgets.ConstraintAnchor.Type[]) r0
                return r0
        }
    }

    public ConstraintAnchor(androidx.constraintlayout.core.widgets.ConstraintWidget r2, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mDependents = r0
            r0 = 0
            r1.mMargin = r0
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.mGoneMargin = r0
            r1.mOwner = r2
            r1.mType = r3
            return
    }

    private boolean isConnectionToMe(androidx.constraintlayout.core.widgets.ConstraintWidget r7, java.util.HashSet<androidx.constraintlayout.core.widgets.ConstraintWidget> r8) {
            r6 = this;
            boolean r0 = r8.contains(r7)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            r8.add(r7)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r6.getOwner()
            r2 = 1
            if (r7 != r0) goto L13
            return r2
        L13:
            java.util.ArrayList r7 = r7.getAnchors()
            int r0 = r7.size()
            r3 = r1
        L1c:
            if (r3 >= r0) goto L42
            java.lang.Object r4 = r7.get(r3)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r4
            boolean r5 = r4.isSimilarDimensionConnection(r6)
            if (r5 == 0) goto L3f
            boolean r5 = r4.isConnected()
            if (r5 == 0) goto L3f
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r4.getTarget()
            androidx.constraintlayout.core.widgets.ConstraintWidget r4 = r4.getOwner()
            boolean r4 = r6.isConnectionToMe(r4, r8)
            if (r4 == 0) goto L3f
            return r2
        L3f:
            int r3 = r3 + 1
            goto L1c
        L42:
            return r1
    }

    public boolean connect(androidx.constraintlayout.core.widgets.ConstraintAnchor r3, int r4) {
            r2 = this;
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = 0
            boolean r3 = r2.connect(r3, r4, r0, r1)
            return r3
    }

    public boolean connect(androidx.constraintlayout.core.widgets.ConstraintAnchor r2, int r3, int r4, boolean r5) {
            r1 = this;
            r0 = 1
            if (r2 != 0) goto L7
            r1.reset()
            return r0
        L7:
            if (r5 != 0) goto L11
            boolean r5 = r1.isValidConnection(r2)
            if (r5 != 0) goto L11
            r2 = 0
            return r2
        L11:
            r1.mTarget = r2
            java.util.HashSet<androidx.constraintlayout.core.widgets.ConstraintAnchor> r5 = r2.mDependents
            if (r5 != 0) goto L1e
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            r2.mDependents = r5
        L1e:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r1.mTarget
            java.util.HashSet<androidx.constraintlayout.core.widgets.ConstraintAnchor> r2 = r2.mDependents
            if (r2 == 0) goto L27
            r2.add(r1)
        L27:
            r1.mMargin = r3
            r1.mGoneMargin = r4
            return r0
    }

    public void copyFrom(androidx.constraintlayout.core.widgets.ConstraintAnchor r3, java.util.HashMap<androidx.constraintlayout.core.widgets.ConstraintWidget, androidx.constraintlayout.core.widgets.ConstraintWidget> r4) {
            r2 = this;
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r2.mTarget
            if (r0 == 0) goto Lb
            java.util.HashSet<androidx.constraintlayout.core.widgets.ConstraintAnchor> r0 = r0.mDependents
            if (r0 == 0) goto Lb
            r0.remove(r2)
        Lb:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r3.mTarget
            if (r0 == 0) goto L24
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r0 = r0.getType()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r3.mTarget
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r1.mOwner
            java.lang.Object r4 = r4.get(r1)
            androidx.constraintlayout.core.widgets.ConstraintWidget r4 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r4
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r4.getAnchor(r0)
            r2.mTarget = r4
            goto L27
        L24:
            r4 = 0
            r2.mTarget = r4
        L27:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r2.mTarget
            if (r4 == 0) goto L3d
            java.util.HashSet<androidx.constraintlayout.core.widgets.ConstraintAnchor> r0 = r4.mDependents
            if (r0 != 0) goto L36
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r4.mDependents = r0
        L36:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r2.mTarget
            java.util.HashSet<androidx.constraintlayout.core.widgets.ConstraintAnchor> r4 = r4.mDependents
            r4.add(r2)
        L3d:
            int r4 = r3.mMargin
            r2.mMargin = r4
            int r3 = r3.mGoneMargin
            r2.mGoneMargin = r3
            return
    }

    public void findDependents(int r3, java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetGroup> r4, androidx.constraintlayout.core.widgets.analyzer.WidgetGroup r5) {
            r2 = this;
            java.util.HashSet<androidx.constraintlayout.core.widgets.ConstraintAnchor> r0 = r2.mDependents
            if (r0 == 0) goto L1a
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r1
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r1.mOwner
            androidx.constraintlayout.core.widgets.analyzer.Grouping.findDependents(r1, r3, r4, r5)
            goto L8
        L1a:
            return
    }

    public java.util.HashSet<androidx.constraintlayout.core.widgets.ConstraintAnchor> getDependents() {
            r1 = this;
            java.util.HashSet<androidx.constraintlayout.core.widgets.ConstraintAnchor> r0 = r1.mDependents
            return r0
    }

    public int getFinalValue() {
            r1 = this;
            boolean r0 = r1.mHasFinalValue
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r1.mFinalValue
            return r0
    }

    public int getMargin() {
            r3 = this;
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r3.mOwner
            int r0 = r0.getVisibility()
            r1 = 8
            if (r0 != r1) goto Lc
            r0 = 0
            return r0
        Lc:
            int r0 = r3.mGoneMargin
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r2) goto L21
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r3.mTarget
            if (r0 == 0) goto L21
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r0.mOwner
            int r0 = r0.getVisibility()
            if (r0 != r1) goto L21
            int r0 = r3.mGoneMargin
            return r0
        L21:
            int r0 = r3.mMargin
            return r0
    }

    public final androidx.constraintlayout.core.widgets.ConstraintAnchor getOpposite() {
            r2 = this;
            int[] r0 = androidx.constraintlayout.core.widgets.ConstraintAnchor.C01271.f37x6930e354
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = r2.mType
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L2d;
                case 2: goto L28;
                case 3: goto L23;
                case 4: goto L1e;
                case 5: goto L19;
                case 6: goto L2d;
                case 7: goto L2d;
                case 8: goto L2d;
                case 9: goto L2d;
                default: goto Ld;
            }
        Ld:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = r2.mType
            java.lang.String r1 = r1.name()
            r0.<init>(r1)
            throw r0
        L19:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r2.mOwner
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mTop
            return r0
        L1e:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r2.mOwner
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mBottom
            return r0
        L23:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r2.mOwner
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mLeft
            return r0
        L28:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r2.mOwner
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mRight
            return r0
        L2d:
            r0 = 0
            return r0
    }

    public androidx.constraintlayout.core.widgets.ConstraintWidget getOwner() {
            r1 = this;
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r1.mOwner
            return r0
    }

    public androidx.constraintlayout.core.SolverVariable getSolverVariable() {
            r1 = this;
            androidx.constraintlayout.core.SolverVariable r0 = r1.mSolverVariable
            return r0
    }

    public androidx.constraintlayout.core.widgets.ConstraintAnchor getTarget() {
            r1 = this;
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r1.mTarget
            return r0
    }

    public androidx.constraintlayout.core.widgets.ConstraintAnchor.Type getType() {
            r1 = this;
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r0 = r1.mType
            return r0
    }

    public boolean hasCenteredDependents() {
            r3 = this;
            java.util.HashSet<androidx.constraintlayout.core.widgets.ConstraintAnchor> r0 = r3.mDependents
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L22
            java.lang.Object r2 = r0.next()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r2
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.getOpposite()
            boolean r2 = r2.isConnected()
            if (r2 == 0) goto La
            r0 = 1
            return r0
        L22:
            return r1
    }

    public boolean hasDependents() {
            r2 = this;
            java.util.HashSet<androidx.constraintlayout.core.widgets.ConstraintAnchor> r0 = r2.mDependents
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r0.size()
            if (r0 <= 0) goto Ld
            r1 = 1
        Ld:
            return r1
    }

    public boolean hasFinalValue() {
            r1 = this;
            boolean r0 = r1.mHasFinalValue
            return r0
    }

    public boolean isConnected() {
            r1 = this;
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r1.mTarget
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public boolean isConnectionAllowed(androidx.constraintlayout.core.widgets.ConstraintWidget r4) {
            r3 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            boolean r0 = r3.isConnectionToMe(r4, r0)
            r1 = 0
            if (r0 == 0) goto Ld
            return r1
        Ld:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r3.getOwner()
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r0.getParent()
            r2 = 1
            if (r0 != r4) goto L19
            return r2
        L19:
            androidx.constraintlayout.core.widgets.ConstraintWidget r4 = r4.getParent()
            if (r4 != r0) goto L20
            return r2
        L20:
            return r1
    }

    public boolean isConnectionAllowed(androidx.constraintlayout.core.widgets.ConstraintWidget r1, androidx.constraintlayout.core.widgets.ConstraintAnchor r2) {
            r0 = this;
            boolean r1 = r0.isConnectionAllowed(r1)
            return r1
    }

    public boolean isSideAnchor() {
            r2 = this;
            int[] r0 = androidx.constraintlayout.core.widgets.ConstraintAnchor.C01271.f37x6930e354
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = r2.mType
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L1b;
                case 2: goto L19;
                case 3: goto L19;
                case 4: goto L19;
                case 5: goto L19;
                case 6: goto L1b;
                case 7: goto L1b;
                case 8: goto L1b;
                case 9: goto L1b;
                default: goto Ld;
            }
        Ld:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = r2.mType
            java.lang.String r1 = r1.name()
            r0.<init>(r1)
            throw r0
        L19:
            r0 = 1
            return r0
        L1b:
            r0 = 0
            return r0
    }

    public boolean isSimilarDimensionConnection(androidx.constraintlayout.core.widgets.ConstraintAnchor r4) {
            r3 = this;
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = r4.getType()
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r0 = r3.mType
            r1 = 1
            if (r4 != r0) goto La
            return r1
        La:
            int[] r0 = androidx.constraintlayout.core.widgets.ConstraintAnchor.C01271.f37x6930e354
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r2 = r3.mType
            int r2 = r2.ordinal()
            r0 = r0[r2]
            r2 = 0
            switch(r0) {
                case 1: goto L47;
                case 2: goto L38;
                case 3: goto L38;
                case 4: goto L25;
                case 5: goto L25;
                case 6: goto L25;
                case 7: goto L38;
                case 8: goto L25;
                case 9: goto L24;
                default: goto L18;
            }
        L18:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r0 = r3.mType
            java.lang.String r0 = r0.name()
            r4.<init>(r0)
            throw r4
        L24:
            return r2
        L25:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r0 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            if (r4 == r0) goto L37
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r0 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            if (r4 == r0) goto L37
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r0 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_Y
            if (r4 == r0) goto L37
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r0 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE
            if (r4 != r0) goto L36
            goto L37
        L36:
            r1 = r2
        L37:
            return r1
        L38:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r0 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            if (r4 == r0) goto L46
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r0 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            if (r4 == r0) goto L46
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r0 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_X
            if (r4 != r0) goto L45
            goto L46
        L45:
            r1 = r2
        L46:
            return r1
        L47:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r0 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE
            if (r4 == r0) goto L4c
            goto L4d
        L4c:
            r1 = r2
        L4d:
            return r1
    }

    public boolean isValidConnection(androidx.constraintlayout.core.widgets.ConstraintAnchor r6) {
            r5 = this;
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = r6.getType()
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r2 = r5.mType
            r3 = 1
            if (r1 != r2) goto L27
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE
            if (r2 != r1) goto L26
            androidx.constraintlayout.core.widgets.ConstraintWidget r6 = r6.getOwner()
            boolean r6 = r6.hasBaseline()
            if (r6 == 0) goto L25
            androidx.constraintlayout.core.widgets.ConstraintWidget r6 = r5.getOwner()
            boolean r6 = r6.hasBaseline()
            if (r6 != 0) goto L26
        L25:
            return r0
        L26:
            return r3
        L27:
            int[] r2 = androidx.constraintlayout.core.widgets.ConstraintAnchor.C01271.f37x6930e354
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = r5.mType
            int r4 = r4.ordinal()
            r2 = r2[r4]
            switch(r2) {
                case 1: goto L86;
                case 2: goto L69;
                case 3: goto L69;
                case 4: goto L4c;
                case 5: goto L4c;
                case 6: goto L41;
                case 7: goto L40;
                case 8: goto L40;
                case 9: goto L40;
                default: goto L34;
            }
        L34:
            java.lang.AssertionError r6 = new java.lang.AssertionError
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r0 = r5.mType
            java.lang.String r0 = r0.name()
            r6.<init>(r0)
            throw r6
        L40:
            return r0
        L41:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r6 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            if (r1 == r6) goto L4b
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r6 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            if (r1 != r6) goto L4a
            goto L4b
        L4a:
            return r3
        L4b:
            return r0
        L4c:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            if (r1 == r2) goto L57
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            if (r1 != r2) goto L55
            goto L57
        L55:
            r2 = r0
            goto L58
        L57:
            r2 = r3
        L58:
            androidx.constraintlayout.core.widgets.ConstraintWidget r6 = r6.getOwner()
            boolean r6 = r6 instanceof androidx.constraintlayout.core.widgets.Guideline
            if (r6 == 0) goto L68
            if (r2 != 0) goto L66
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r6 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_Y
            if (r1 != r6) goto L67
        L66:
            r0 = r3
        L67:
            r2 = r0
        L68:
            return r2
        L69:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            if (r1 == r2) goto L74
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            if (r1 != r2) goto L72
            goto L74
        L72:
            r2 = r0
            goto L75
        L74:
            r2 = r3
        L75:
            androidx.constraintlayout.core.widgets.ConstraintWidget r6 = r6.getOwner()
            boolean r6 = r6 instanceof androidx.constraintlayout.core.widgets.Guideline
            if (r6 == 0) goto L85
            if (r2 != 0) goto L83
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r6 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_X
            if (r1 != r6) goto L84
        L83:
            r0 = r3
        L84:
            r2 = r0
        L85:
            return r2
        L86:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r6 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE
            if (r1 == r6) goto L93
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r6 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_X
            if (r1 == r6) goto L93
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r6 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_Y
            if (r1 == r6) goto L93
            r0 = r3
        L93:
            return r0
    }

    public boolean isVerticalAnchor() {
            r2 = this;
            int[] r0 = androidx.constraintlayout.core.widgets.ConstraintAnchor.C01271.f37x6930e354
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = r2.mType
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L1b;
                case 2: goto L1b;
                case 3: goto L1b;
                case 4: goto L19;
                case 5: goto L19;
                case 6: goto L19;
                case 7: goto L1b;
                case 8: goto L19;
                case 9: goto L19;
                default: goto Ld;
            }
        Ld:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = r2.mType
            java.lang.String r1 = r1.name()
            r0.<init>(r1)
            throw r0
        L19:
            r0 = 1
            return r0
        L1b:
            r0 = 0
            return r0
    }

    public void reset() {
            r2 = this;
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r2.mTarget
            r1 = 0
            if (r0 == 0) goto L1a
            java.util.HashSet<androidx.constraintlayout.core.widgets.ConstraintAnchor> r0 = r0.mDependents
            if (r0 == 0) goto L1a
            r0.remove(r2)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r2.mTarget
            java.util.HashSet<androidx.constraintlayout.core.widgets.ConstraintAnchor> r0 = r0.mDependents
            int r0 = r0.size()
            if (r0 != 0) goto L1a
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r2.mTarget
            r0.mDependents = r1
        L1a:
            r2.mDependents = r1
            r2.mTarget = r1
            r0 = 0
            r2.mMargin = r0
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2.mGoneMargin = r1
            r2.mHasFinalValue = r0
            r2.mFinalValue = r0
            return
    }

    public void resetFinalResolution() {
            r1 = this;
            r0 = 0
            r1.mHasFinalValue = r0
            r1.mFinalValue = r0
            return
    }

    public void resetSolverVariable(androidx.constraintlayout.core.Cache r3) {
            r2 = this;
            androidx.constraintlayout.core.SolverVariable r3 = r2.mSolverVariable
            if (r3 != 0) goto Lf
            androidx.constraintlayout.core.SolverVariable r3 = new androidx.constraintlayout.core.SolverVariable
            androidx.constraintlayout.core.SolverVariable$Type r0 = androidx.constraintlayout.core.SolverVariable.Type.UNRESTRICTED
            r1 = 0
            r3.<init>(r0, r1)
            r2.mSolverVariable = r3
            goto L12
        Lf:
            r3.reset()
        L12:
            return
    }

    public void setFinalValue(int r1) {
            r0 = this;
            r0.mFinalValue = r1
            r1 = 1
            r0.mHasFinalValue = r1
            return
    }

    public void setGoneMargin(int r2) {
            r1 = this;
            boolean r0 = r1.isConnected()
            if (r0 == 0) goto L8
            r1.mGoneMargin = r2
        L8:
            return
    }

    public void setMargin(int r2) {
            r1 = this;
            boolean r0 = r1.isConnected()
            if (r0 == 0) goto L8
            r1.mMargin = r2
        L8:
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r2.mOwner
            java.lang.String r1 = r1.getDebugName()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ":"
            java.lang.StringBuilder r0 = r0.append(r1)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = r2.mType
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
