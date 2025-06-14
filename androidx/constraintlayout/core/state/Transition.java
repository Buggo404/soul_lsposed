package androidx.constraintlayout.core.state;

/* loaded from: classes.dex */
public class Transition implements androidx.constraintlayout.core.motion.utils.TypedValues {
    static final int ANTICIPATE = 6;
    static final int BOUNCE = 4;
    static final int EASE_IN = 1;
    static final int EASE_IN_OUT = 0;
    static final int EASE_OUT = 2;
    public static final int END = 1;
    public static final int INTERPOLATED = 2;
    private static final int INTERPOLATOR_REFERENCE_ID = -2;
    static final int LINEAR = 3;
    static final int OVERSHOOT = 5;
    private static final int SPLINE_STRING = -1;
    public static final int START = 0;
    java.util.HashMap<java.lang.Integer, java.util.HashMap<java.lang.String, androidx.constraintlayout.core.state.Transition.KeyPosition>> keyPositions;
    private int mAutoTransition;
    androidx.constraintlayout.core.motion.utils.TypedBundle mBundle;
    private int mDefaultInterpolator;
    private java.lang.String mDefaultInterpolatorString;
    private int mDuration;
    private androidx.constraintlayout.core.motion.utils.Easing mEasing;
    private float mStagger;
    private java.util.HashMap<java.lang.String, androidx.constraintlayout.core.state.Transition.WidgetState> state;

    static class KeyPosition {
        int frame;
        java.lang.String target;
        int type;

        /* renamed from: x */
        float f35x;

        /* renamed from: y */
        float f36y;

        public KeyPosition(java.lang.String r1, int r2, int r3, float r4, float r5) {
                r0 = this;
                r0.<init>()
                r0.target = r1
                r0.frame = r2
                r0.type = r3
                r0.f35x = r4
                r0.f36y = r5
                return
        }
    }

    static class WidgetState {
        androidx.constraintlayout.core.state.WidgetFrame end;
        androidx.constraintlayout.core.state.WidgetFrame interpolated;
        androidx.constraintlayout.core.motion.Motion motionControl;
        androidx.constraintlayout.core.motion.MotionWidget motionWidgetEnd;
        androidx.constraintlayout.core.motion.MotionWidget motionWidgetInterpolated;
        androidx.constraintlayout.core.motion.MotionWidget motionWidgetStart;
        androidx.constraintlayout.core.motion.utils.KeyCache myKeyCache;
        int myParentHeight;
        int myParentWidth;
        androidx.constraintlayout.core.state.WidgetFrame start;

        public WidgetState() {
                r2 = this;
                r2.<init>()
                androidx.constraintlayout.core.motion.utils.KeyCache r0 = new androidx.constraintlayout.core.motion.utils.KeyCache
                r0.<init>()
                r2.myKeyCache = r0
                r0 = -1
                r2.myParentHeight = r0
                r2.myParentWidth = r0
                androidx.constraintlayout.core.state.WidgetFrame r0 = new androidx.constraintlayout.core.state.WidgetFrame
                r0.<init>()
                r2.start = r0
                androidx.constraintlayout.core.state.WidgetFrame r0 = new androidx.constraintlayout.core.state.WidgetFrame
                r0.<init>()
                r2.end = r0
                androidx.constraintlayout.core.state.WidgetFrame r0 = new androidx.constraintlayout.core.state.WidgetFrame
                r0.<init>()
                r2.interpolated = r0
                androidx.constraintlayout.core.motion.MotionWidget r0 = new androidx.constraintlayout.core.motion.MotionWidget
                androidx.constraintlayout.core.state.WidgetFrame r1 = r2.start
                r0.<init>(r1)
                r2.motionWidgetStart = r0
                androidx.constraintlayout.core.motion.MotionWidget r0 = new androidx.constraintlayout.core.motion.MotionWidget
                androidx.constraintlayout.core.state.WidgetFrame r1 = r2.end
                r0.<init>(r1)
                r2.motionWidgetEnd = r0
                androidx.constraintlayout.core.motion.MotionWidget r0 = new androidx.constraintlayout.core.motion.MotionWidget
                androidx.constraintlayout.core.state.WidgetFrame r1 = r2.interpolated
                r0.<init>(r1)
                r2.motionWidgetInterpolated = r0
                androidx.constraintlayout.core.motion.Motion r0 = new androidx.constraintlayout.core.motion.Motion
                androidx.constraintlayout.core.motion.MotionWidget r1 = r2.motionWidgetStart
                r0.<init>(r1)
                r2.motionControl = r0
                androidx.constraintlayout.core.motion.MotionWidget r1 = r2.motionWidgetStart
                r0.setStart(r1)
                androidx.constraintlayout.core.motion.Motion r0 = r2.motionControl
                androidx.constraintlayout.core.motion.MotionWidget r1 = r2.motionWidgetEnd
                r0.setEnd(r1)
                return
        }

        public androidx.constraintlayout.core.state.WidgetFrame getFrame(int r2) {
                r1 = this;
                if (r2 != 0) goto L5
                androidx.constraintlayout.core.state.WidgetFrame r2 = r1.start
                return r2
            L5:
                r0 = 1
                if (r2 != r0) goto Lb
                androidx.constraintlayout.core.state.WidgetFrame r2 = r1.end
                return r2
            Lb:
                androidx.constraintlayout.core.state.WidgetFrame r2 = r1.interpolated
                return r2
        }

        public void interpolate(int r8, int r9, float r10, androidx.constraintlayout.core.state.Transition r11) {
                r7 = this;
                r7.myParentHeight = r9
                r7.myParentWidth = r8
                androidx.constraintlayout.core.motion.Motion r0 = r7.motionControl
                r3 = 1065353216(0x3f800000, float:1.0)
                long r4 = java.lang.System.nanoTime()
                r1 = r8
                r2 = r9
                r0.setup(r1, r2, r3, r4)
                androidx.constraintlayout.core.state.WidgetFrame r2 = r7.interpolated
                androidx.constraintlayout.core.state.WidgetFrame r3 = r7.start
                androidx.constraintlayout.core.state.WidgetFrame r4 = r7.end
                r0 = r8
                r1 = r9
                r5 = r11
                r6 = r10
                androidx.constraintlayout.core.state.WidgetFrame.interpolate(r0, r1, r2, r3, r4, r5, r6)
                androidx.constraintlayout.core.state.WidgetFrame r0 = r7.interpolated
                r0.interpolatedPos = r10
                androidx.constraintlayout.core.motion.Motion r1 = r7.motionControl
                androidx.constraintlayout.core.motion.MotionWidget r2 = r7.motionWidgetInterpolated
                long r4 = java.lang.System.nanoTime()
                androidx.constraintlayout.core.motion.utils.KeyCache r6 = r7.myKeyCache
                r3 = r10
                r1.interpolate(r2, r3, r4, r6)
                return
        }

        public void setKeyAttribute(androidx.constraintlayout.core.motion.utils.TypedBundle r2) {
                r1 = this;
                androidx.constraintlayout.core.motion.key.MotionKeyAttributes r0 = new androidx.constraintlayout.core.motion.key.MotionKeyAttributes
                r0.<init>()
                r2.applyDelta(r0)
                androidx.constraintlayout.core.motion.Motion r2 = r1.motionControl
                r2.addKey(r0)
                return
        }

        public void setKeyCycle(androidx.constraintlayout.core.motion.utils.TypedBundle r2) {
                r1 = this;
                androidx.constraintlayout.core.motion.key.MotionKeyCycle r0 = new androidx.constraintlayout.core.motion.key.MotionKeyCycle
                r0.<init>()
                r2.applyDelta(r0)
                androidx.constraintlayout.core.motion.Motion r2 = r1.motionControl
                r2.addKey(r0)
                return
        }

        public void setKeyPosition(androidx.constraintlayout.core.motion.utils.TypedBundle r2) {
                r1 = this;
                androidx.constraintlayout.core.motion.key.MotionKeyPosition r0 = new androidx.constraintlayout.core.motion.key.MotionKeyPosition
                r0.<init>()
                r2.applyDelta(r0)
                androidx.constraintlayout.core.motion.Motion r2 = r1.motionControl
                r2.addKey(r0)
                return
        }

        public void update(androidx.constraintlayout.core.widgets.ConstraintWidget r2, int r3) {
                r1 = this;
                if (r3 != 0) goto Lf
                androidx.constraintlayout.core.state.WidgetFrame r3 = r1.start
                r3.update(r2)
                androidx.constraintlayout.core.motion.Motion r2 = r1.motionControl
                androidx.constraintlayout.core.motion.MotionWidget r3 = r1.motionWidgetStart
                r2.setStart(r3)
                goto L1e
            Lf:
                r0 = 1
                if (r3 != r0) goto L1e
                androidx.constraintlayout.core.state.WidgetFrame r3 = r1.end
                r3.update(r2)
                androidx.constraintlayout.core.motion.Motion r2 = r1.motionControl
                androidx.constraintlayout.core.motion.MotionWidget r3 = r1.motionWidgetEnd
                r2.setEnd(r3)
            L1e:
                r2 = -1
                r1.myParentWidth = r2
                return
        }
    }

    public Transition() {
            r2 = this;
            r2.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.keyPositions = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.state = r0
            androidx.constraintlayout.core.motion.utils.TypedBundle r0 = new androidx.constraintlayout.core.motion.utils.TypedBundle
            r0.<init>()
            r2.mBundle = r0
            r0 = 0
            r2.mDefaultInterpolator = r0
            r1 = 0
            r2.mDefaultInterpolatorString = r1
            r2.mEasing = r1
            r2.mAutoTransition = r0
            r0 = 400(0x190, float:5.6E-43)
            r2.mDuration = r0
            r0 = 0
            r2.mStagger = r0
            return
    }

    public static androidx.constraintlayout.core.state.Interpolator getInterpolator(int r0, java.lang.String r1) {
            switch(r0) {
                case -1: goto L2f;
                case 0: goto L29;
                case 1: goto L23;
                case 2: goto L1d;
                case 3: goto L17;
                case 4: goto L11;
                case 5: goto Lb;
                case 6: goto L5;
                default: goto L3;
            }
        L3:
            r0 = 0
            return r0
        L5:
            androidx.constraintlayout.core.state.Transition$$ExternalSyntheticLambda5 r0 = new androidx.constraintlayout.core.state.Transition$$ExternalSyntheticLambda5
            r0.<init>()
            return r0
        Lb:
            androidx.constraintlayout.core.state.Transition$$ExternalSyntheticLambda6 r0 = new androidx.constraintlayout.core.state.Transition$$ExternalSyntheticLambda6
            r0.<init>()
            return r0
        L11:
            androidx.constraintlayout.core.state.Transition$$ExternalSyntheticLambda7 r0 = new androidx.constraintlayout.core.state.Transition$$ExternalSyntheticLambda7
            r0.<init>()
            return r0
        L17:
            androidx.constraintlayout.core.state.Transition$$ExternalSyntheticLambda4 r0 = new androidx.constraintlayout.core.state.Transition$$ExternalSyntheticLambda4
            r0.<init>()
            return r0
        L1d:
            androidx.constraintlayout.core.state.Transition$$ExternalSyntheticLambda3 r0 = new androidx.constraintlayout.core.state.Transition$$ExternalSyntheticLambda3
            r0.<init>()
            return r0
        L23:
            androidx.constraintlayout.core.state.Transition$$ExternalSyntheticLambda2 r0 = new androidx.constraintlayout.core.state.Transition$$ExternalSyntheticLambda2
            r0.<init>()
            return r0
        L29:
            androidx.constraintlayout.core.state.Transition$$ExternalSyntheticLambda1 r0 = new androidx.constraintlayout.core.state.Transition$$ExternalSyntheticLambda1
            r0.<init>()
            return r0
        L2f:
            androidx.constraintlayout.core.state.Transition$$ExternalSyntheticLambda0 r0 = new androidx.constraintlayout.core.state.Transition$$ExternalSyntheticLambda0
            r0.<init>(r1)
            return r0
    }

    private androidx.constraintlayout.core.state.Transition.WidgetState getWidgetState(java.lang.String r2) {
            r1 = this;
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.state.Transition$WidgetState> r0 = r1.state
            java.lang.Object r2 = r0.get(r2)
            androidx.constraintlayout.core.state.Transition$WidgetState r2 = (androidx.constraintlayout.core.state.Transition.WidgetState) r2
            return r2
    }

    private androidx.constraintlayout.core.state.Transition.WidgetState getWidgetState(java.lang.String r4, androidx.constraintlayout.core.widgets.ConstraintWidget r5, int r6) {
            r3 = this;
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.state.Transition$WidgetState> r0 = r3.state
            java.lang.Object r0 = r0.get(r4)
            androidx.constraintlayout.core.state.Transition$WidgetState r0 = (androidx.constraintlayout.core.state.Transition.WidgetState) r0
            if (r0 != 0) goto L20
            androidx.constraintlayout.core.state.Transition$WidgetState r0 = new androidx.constraintlayout.core.state.Transition$WidgetState
            r0.<init>()
            androidx.constraintlayout.core.motion.utils.TypedBundle r1 = r3.mBundle
            androidx.constraintlayout.core.motion.Motion r2 = r0.motionControl
            r1.applyDelta(r2)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.state.Transition$WidgetState> r1 = r3.state
            r1.put(r4, r0)
            if (r5 == 0) goto L20
            r0.update(r5, r6)
        L20:
            return r0
    }

    static /* synthetic */ float lambda$getInterpolator$0(java.lang.String r2, float r3) {
            androidx.constraintlayout.core.motion.utils.Easing r2 = androidx.constraintlayout.core.motion.utils.Easing.getInterpolator(r2)
            double r0 = (double) r3
            double r2 = r2.get(r0)
            float r2 = (float) r2
            return r2
    }

    static /* synthetic */ float lambda$getInterpolator$1(float r3) {
            java.lang.String r0 = "standard"
            androidx.constraintlayout.core.motion.utils.Easing r0 = androidx.constraintlayout.core.motion.utils.Easing.getInterpolator(r0)
            double r1 = (double) r3
            double r0 = r0.get(r1)
            float r3 = (float) r0
            return r3
    }

    static /* synthetic */ float lambda$getInterpolator$2(float r3) {
            java.lang.String r0 = "accelerate"
            androidx.constraintlayout.core.motion.utils.Easing r0 = androidx.constraintlayout.core.motion.utils.Easing.getInterpolator(r0)
            double r1 = (double) r3
            double r0 = r0.get(r1)
            float r3 = (float) r0
            return r3
    }

    static /* synthetic */ float lambda$getInterpolator$3(float r3) {
            java.lang.String r0 = "decelerate"
            androidx.constraintlayout.core.motion.utils.Easing r0 = androidx.constraintlayout.core.motion.utils.Easing.getInterpolator(r0)
            double r1 = (double) r3
            double r0 = r0.get(r1)
            float r3 = (float) r0
            return r3
    }

    static /* synthetic */ float lambda$getInterpolator$4(float r3) {
            java.lang.String r0 = "linear"
            androidx.constraintlayout.core.motion.utils.Easing r0 = androidx.constraintlayout.core.motion.utils.Easing.getInterpolator(r0)
            double r1 = (double) r3
            double r0 = r0.get(r1)
            float r3 = (float) r0
            return r3
    }

    static /* synthetic */ float lambda$getInterpolator$5(float r3) {
            java.lang.String r0 = "anticipate"
            androidx.constraintlayout.core.motion.utils.Easing r0 = androidx.constraintlayout.core.motion.utils.Easing.getInterpolator(r0)
            double r1 = (double) r3
            double r0 = r0.get(r1)
            float r3 = (float) r0
            return r3
    }

    static /* synthetic */ float lambda$getInterpolator$6(float r3) {
            java.lang.String r0 = "overshoot"
            androidx.constraintlayout.core.motion.utils.Easing r0 = androidx.constraintlayout.core.motion.utils.Easing.getInterpolator(r0)
            double r1 = (double) r3
            double r0 = r0.get(r1)
            float r3 = (float) r0
            return r3
    }

    static /* synthetic */ float lambda$getInterpolator$7(float r3) {
            java.lang.String r0 = "spline(0.0, 0.2, 0.4, 0.6, 0.8 ,1.0, 0.8, 1.0, 0.9, 1.0)"
            androidx.constraintlayout.core.motion.utils.Easing r0 = androidx.constraintlayout.core.motion.utils.Easing.getInterpolator(r0)
            double r1 = (double) r3
            double r0 = r0.get(r1)
            float r3 = (float) r0
            return r3
    }

    public void addCustomColor(int r2, java.lang.String r3, java.lang.String r4, int r5) {
            r1 = this;
            r0 = 0
            androidx.constraintlayout.core.state.Transition$WidgetState r3 = r1.getWidgetState(r3, r0, r2)
            androidx.constraintlayout.core.state.WidgetFrame r2 = r3.getFrame(r2)
            r2.addCustomColor(r4, r5)
            return
    }

    public void addCustomFloat(int r2, java.lang.String r3, java.lang.String r4, float r5) {
            r1 = this;
            r0 = 0
            androidx.constraintlayout.core.state.Transition$WidgetState r3 = r1.getWidgetState(r3, r0, r2)
            androidx.constraintlayout.core.state.WidgetFrame r2 = r3.getFrame(r2)
            r2.addCustomFloat(r4, r5)
            return
    }

    public void addKeyAttribute(java.lang.String r3, androidx.constraintlayout.core.motion.utils.TypedBundle r4) {
            r2 = this;
            r0 = 0
            r1 = 0
            androidx.constraintlayout.core.state.Transition$WidgetState r3 = r2.getWidgetState(r3, r0, r1)
            r3.setKeyAttribute(r4)
            return
    }

    public void addKeyCycle(java.lang.String r3, androidx.constraintlayout.core.motion.utils.TypedBundle r4) {
            r2 = this;
            r0 = 0
            r1 = 0
            androidx.constraintlayout.core.state.Transition$WidgetState r3 = r2.getWidgetState(r3, r0, r1)
            r3.setKeyCycle(r4)
            return
    }

    public void addKeyPosition(java.lang.String r9, int r10, int r11, float r12, float r13) {
            r8 = this;
            androidx.constraintlayout.core.motion.utils.TypedBundle r0 = new androidx.constraintlayout.core.motion.utils.TypedBundle
            r0.<init>()
            r1 = 510(0x1fe, float:7.15E-43)
            r2 = 2
            r0.add(r1, r2)
            r1 = 100
            r0.add(r1, r10)
            r1 = 506(0x1fa, float:7.09E-43)
            r0.add(r1, r12)
            r1 = 507(0x1fb, float:7.1E-43)
            r0.add(r1, r13)
            r1 = 0
            r2 = 0
            androidx.constraintlayout.core.state.Transition$WidgetState r1 = r8.getWidgetState(r9, r1, r2)
            r1.setKeyPosition(r0)
            androidx.constraintlayout.core.state.Transition$KeyPosition r0 = new androidx.constraintlayout.core.state.Transition$KeyPosition
            r2 = r0
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r2.<init>(r3, r4, r5, r6, r7)
            java.util.HashMap<java.lang.Integer, java.util.HashMap<java.lang.String, androidx.constraintlayout.core.state.Transition$KeyPosition>> r11 = r8.keyPositions
            java.lang.Integer r12 = java.lang.Integer.valueOf(r10)
            java.lang.Object r11 = r11.get(r12)
            java.util.HashMap r11 = (java.util.HashMap) r11
            if (r11 != 0) goto L4a
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            java.util.HashMap<java.lang.Integer, java.util.HashMap<java.lang.String, androidx.constraintlayout.core.state.Transition$KeyPosition>> r12 = r8.keyPositions
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r12.put(r10, r11)
        L4a:
            r11.put(r9, r0)
            return
    }

    public void addKeyPosition(java.lang.String r3, androidx.constraintlayout.core.motion.utils.TypedBundle r4) {
            r2 = this;
            r0 = 0
            r1 = 0
            androidx.constraintlayout.core.state.Transition$WidgetState r3 = r2.getWidgetState(r3, r0, r1)
            r3.setKeyPosition(r4)
            return
    }

    public void clear() {
            r1 = this;
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.state.Transition$WidgetState> r0 = r1.state
            r0.clear()
            return
    }

    public boolean contains(java.lang.String r2) {
            r1 = this;
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.state.Transition$WidgetState> r0 = r1.state
            boolean r2 = r0.containsKey(r2)
            return r2
    }

    public void fillKeyPositions(androidx.constraintlayout.core.state.WidgetFrame r5, float[] r6, float[] r7, float[] r8) {
            r4 = this;
            r0 = 0
            r1 = r0
        L2:
            r2 = 100
            if (r0 > r2) goto L32
            java.util.HashMap<java.lang.Integer, java.util.HashMap<java.lang.String, androidx.constraintlayout.core.state.Transition$KeyPosition>> r2 = r4.keyPositions
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            java.lang.Object r2 = r2.get(r3)
            java.util.HashMap r2 = (java.util.HashMap) r2
            if (r2 == 0) goto L2f
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r5.widget
            java.lang.String r3 = r3.stringId
            java.lang.Object r2 = r2.get(r3)
            androidx.constraintlayout.core.state.Transition$KeyPosition r2 = (androidx.constraintlayout.core.state.Transition.KeyPosition) r2
            if (r2 == 0) goto L2f
            float r3 = r2.f35x
            r6[r1] = r3
            float r3 = r2.f36y
            r7[r1] = r3
            int r2 = r2.frame
            float r2 = (float) r2
            r8[r1] = r2
            int r1 = r1 + 1
        L2f:
            int r0 = r0 + 1
            goto L2
        L32:
            return
    }

    public androidx.constraintlayout.core.state.Transition.KeyPosition findNextPosition(java.lang.String r3, int r4) {
            r2 = this;
        L0:
            r0 = 100
            if (r4 > r0) goto L1e
            java.util.HashMap<java.lang.Integer, java.util.HashMap<java.lang.String, androidx.constraintlayout.core.state.Transition$KeyPosition>> r0 = r2.keyPositions
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            java.lang.Object r0 = r0.get(r1)
            java.util.HashMap r0 = (java.util.HashMap) r0
            if (r0 == 0) goto L1b
            java.lang.Object r0 = r0.get(r3)
            androidx.constraintlayout.core.state.Transition$KeyPosition r0 = (androidx.constraintlayout.core.state.Transition.KeyPosition) r0
            if (r0 == 0) goto L1b
            return r0
        L1b:
            int r4 = r4 + 1
            goto L0
        L1e:
            r3 = 0
            return r3
    }

    public androidx.constraintlayout.core.state.Transition.KeyPosition findPreviousPosition(java.lang.String r3, int r4) {
            r2 = this;
        L0:
            if (r4 < 0) goto L1c
            java.util.HashMap<java.lang.Integer, java.util.HashMap<java.lang.String, androidx.constraintlayout.core.state.Transition$KeyPosition>> r0 = r2.keyPositions
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            java.lang.Object r0 = r0.get(r1)
            java.util.HashMap r0 = (java.util.HashMap) r0
            if (r0 == 0) goto L19
            java.lang.Object r0 = r0.get(r3)
            androidx.constraintlayout.core.state.Transition$KeyPosition r0 = (androidx.constraintlayout.core.state.Transition.KeyPosition) r0
            if (r0 == 0) goto L19
            return r0
        L19:
            int r4 = r4 + (-1)
            goto L0
        L1c:
            r3 = 0
            return r3
    }

    public int getAutoTransition() {
            r1 = this;
            int r0 = r1.mAutoTransition
            return r0
    }

    public androidx.constraintlayout.core.state.WidgetFrame getEnd(androidx.constraintlayout.core.widgets.ConstraintWidget r3) {
            r2 = this;
            java.lang.String r3 = r3.stringId
            r0 = 0
            r1 = 1
            androidx.constraintlayout.core.state.Transition$WidgetState r3 = r2.getWidgetState(r3, r0, r1)
            androidx.constraintlayout.core.state.WidgetFrame r3 = r3.end
            return r3
    }

    public androidx.constraintlayout.core.state.WidgetFrame getEnd(java.lang.String r2) {
            r1 = this;
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.state.Transition$WidgetState> r0 = r1.state
            java.lang.Object r2 = r0.get(r2)
            androidx.constraintlayout.core.state.Transition$WidgetState r2 = (androidx.constraintlayout.core.state.Transition.WidgetState) r2
            if (r2 != 0) goto Lc
            r2 = 0
            return r2
        Lc:
            androidx.constraintlayout.core.state.WidgetFrame r2 = r2.end
            return r2
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public int getId(java.lang.String r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    public androidx.constraintlayout.core.state.WidgetFrame getInterpolated(androidx.constraintlayout.core.widgets.ConstraintWidget r3) {
            r2 = this;
            java.lang.String r3 = r3.stringId
            r0 = 0
            r1 = 2
            androidx.constraintlayout.core.state.Transition$WidgetState r3 = r2.getWidgetState(r3, r0, r1)
            androidx.constraintlayout.core.state.WidgetFrame r3 = r3.interpolated
            return r3
    }

    public androidx.constraintlayout.core.state.WidgetFrame getInterpolated(java.lang.String r2) {
            r1 = this;
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.state.Transition$WidgetState> r0 = r1.state
            java.lang.Object r2 = r0.get(r2)
            androidx.constraintlayout.core.state.Transition$WidgetState r2 = (androidx.constraintlayout.core.state.Transition.WidgetState) r2
            if (r2 != 0) goto Lc
            r2 = 0
            return r2
        Lc:
            androidx.constraintlayout.core.state.WidgetFrame r2 = r2.interpolated
            return r2
    }

    public androidx.constraintlayout.core.state.Interpolator getInterpolator() {
            r2 = this;
            int r0 = r2.mDefaultInterpolator
            java.lang.String r1 = r2.mDefaultInterpolatorString
            androidx.constraintlayout.core.state.Interpolator r0 = getInterpolator(r0, r1)
            return r0
    }

    public int getKeyFrames(java.lang.String r2, float[] r3, int[] r4, int[] r5) {
            r1 = this;
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.state.Transition$WidgetState> r0 = r1.state
            java.lang.Object r2 = r0.get(r2)
            androidx.constraintlayout.core.state.Transition$WidgetState r2 = (androidx.constraintlayout.core.state.Transition.WidgetState) r2
            androidx.constraintlayout.core.motion.Motion r2 = r2.motionControl
            int r2 = r2.buildKeyFrames(r3, r4, r5)
            return r2
    }

    public androidx.constraintlayout.core.motion.Motion getMotion(java.lang.String r3) {
            r2 = this;
            r0 = 0
            r1 = 0
            androidx.constraintlayout.core.state.Transition$WidgetState r3 = r2.getWidgetState(r3, r0, r1)
            androidx.constraintlayout.core.motion.Motion r3 = r3.motionControl
            return r3
    }

    public int getNumberKeyPositions(androidx.constraintlayout.core.state.WidgetFrame r5) {
            r4 = this;
            r0 = 0
            r1 = r0
        L2:
            r2 = 100
            if (r0 > r2) goto L25
            java.util.HashMap<java.lang.Integer, java.util.HashMap<java.lang.String, androidx.constraintlayout.core.state.Transition$KeyPosition>> r2 = r4.keyPositions
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            java.lang.Object r2 = r2.get(r3)
            java.util.HashMap r2 = (java.util.HashMap) r2
            if (r2 == 0) goto L22
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r5.widget
            java.lang.String r3 = r3.stringId
            java.lang.Object r2 = r2.get(r3)
            androidx.constraintlayout.core.state.Transition$KeyPosition r2 = (androidx.constraintlayout.core.state.Transition.KeyPosition) r2
            if (r2 == 0) goto L22
            int r1 = r1 + 1
        L22:
            int r0 = r0 + 1
            goto L2
        L25:
            return r1
    }

    public float[] getPath(java.lang.String r3) {
            r2 = this;
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.state.Transition$WidgetState> r0 = r2.state
            java.lang.Object r3 = r0.get(r3)
            androidx.constraintlayout.core.state.Transition$WidgetState r3 = (androidx.constraintlayout.core.state.Transition.WidgetState) r3
            r0 = 124(0x7c, float:1.74E-43)
            float[] r0 = new float[r0]
            androidx.constraintlayout.core.motion.Motion r3 = r3.motionControl
            r1 = 62
            r3.buildPath(r0, r1)
            return r0
    }

    public androidx.constraintlayout.core.state.WidgetFrame getStart(androidx.constraintlayout.core.widgets.ConstraintWidget r3) {
            r2 = this;
            java.lang.String r3 = r3.stringId
            r0 = 0
            r1 = 0
            androidx.constraintlayout.core.state.Transition$WidgetState r3 = r2.getWidgetState(r3, r0, r1)
            androidx.constraintlayout.core.state.WidgetFrame r3 = r3.start
            return r3
    }

    public androidx.constraintlayout.core.state.WidgetFrame getStart(java.lang.String r2) {
            r1 = this;
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.state.Transition$WidgetState> r0 = r1.state
            java.lang.Object r2 = r0.get(r2)
            androidx.constraintlayout.core.state.Transition$WidgetState r2 = (androidx.constraintlayout.core.state.Transition.WidgetState) r2
            if (r2 != 0) goto Lc
            r2 = 0
            return r2
        Lc:
            androidx.constraintlayout.core.state.WidgetFrame r2 = r2.start
            return r2
    }

    public boolean hasPositionKeyframes() {
            r1 = this;
            java.util.HashMap<java.lang.Integer, java.util.HashMap<java.lang.String, androidx.constraintlayout.core.state.Transition$KeyPosition>> r0 = r1.keyPositions
            int r0 = r0.size()
            if (r0 <= 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    public void interpolate(int r4, int r5, float r6) {
            r3 = this;
            androidx.constraintlayout.core.motion.utils.Easing r0 = r3.mEasing
            if (r0 == 0) goto La
            double r1 = (double) r6
            double r0 = r0.get(r1)
            float r6 = (float) r0
        La:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.state.Transition$WidgetState> r0 = r3.state
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L14:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.state.Transition$WidgetState> r2 = r3.state
            java.lang.Object r1 = r2.get(r1)
            androidx.constraintlayout.core.state.Transition$WidgetState r1 = (androidx.constraintlayout.core.state.Transition.WidgetState) r1
            r1.interpolate(r4, r5, r6, r3)
            goto L14
        L2c:
            return
    }

    public boolean isEmpty() {
            r1 = this;
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.state.Transition$WidgetState> r0 = r1.state
            boolean r0 = r0.isEmpty()
            return r0
    }

    public void setTransitionProperties(androidx.constraintlayout.core.motion.utils.TypedBundle r2) {
            r1 = this;
            androidx.constraintlayout.core.motion.utils.TypedBundle r0 = r1.mBundle
            r2.applyDelta(r0)
            r2.applyDelta(r1)
            return
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int r2, float r3) {
            r1 = this;
            r0 = 706(0x2c2, float:9.9E-43)
            if (r2 != r0) goto L6
            r1.mStagger = r3
        L6:
            r2 = 0
            return r2
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int r1, int r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int r2, java.lang.String r3) {
            r1 = this;
            r0 = 705(0x2c1, float:9.88E-43)
            if (r2 != r0) goto Lc
            r1.mDefaultInterpolatorString = r3
            androidx.constraintlayout.core.motion.utils.Easing r2 = androidx.constraintlayout.core.motion.utils.Easing.getInterpolator(r3)
            r1.mEasing = r2
        Lc:
            r2 = 0
            return r2
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int r1, boolean r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    public void updateFrom(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r6, int r7) {
            r5 = this;
            java.util.ArrayList r6 = r6.getChildren()
            int r0 = r6.size()
            r1 = 0
        L9:
            if (r1 >= r0) goto L1e
            java.lang.Object r2 = r6.get(r1)
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r2
            java.lang.String r3 = r2.stringId
            r4 = 0
            androidx.constraintlayout.core.state.Transition$WidgetState r3 = r5.getWidgetState(r3, r4, r7)
            r3.update(r2, r7)
            int r1 = r1 + 1
            goto L9
        L1e:
            return
    }
}
