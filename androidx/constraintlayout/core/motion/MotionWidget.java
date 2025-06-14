package androidx.constraintlayout.core.motion;

/* loaded from: classes.dex */
public class MotionWidget implements androidx.constraintlayout.core.motion.utils.TypedValues {
    public static final int FILL_PARENT = -1;
    public static final int GONE_UNSET = Integer.MIN_VALUE;
    private static final int INTERNAL_MATCH_CONSTRAINT = -3;
    private static final int INTERNAL_MATCH_PARENT = -1;
    private static final int INTERNAL_WRAP_CONTENT = -2;
    private static final int INTERNAL_WRAP_CONTENT_CONSTRAINED = -4;
    public static final int INVISIBLE = 0;
    public static final int MATCH_CONSTRAINT = 0;
    public static final int MATCH_CONSTRAINT_WRAP = 1;
    public static final int MATCH_PARENT = -1;
    public static final int PARENT_ID = 0;
    public static final int ROTATE_LEFT_OF_PORTRATE = 4;
    public static final int ROTATE_NONE = 0;
    public static final int ROTATE_PORTRATE_OF_LEFT = 2;
    public static final int ROTATE_PORTRATE_OF_RIGHT = 1;
    public static final int ROTATE_RIGHT_OF_PORTRATE = 3;
    public static final int UNSET = -1;
    public static final int VISIBILITY_MODE_IGNORE = 1;
    public static final int VISIBILITY_MODE_NORMAL = 0;
    public static final int VISIBLE = 4;
    public static final int WRAP_CONTENT = -2;
    private float mProgress;
    float mTransitionPathRotate;
    androidx.constraintlayout.core.motion.MotionWidget.Motion motion;
    androidx.constraintlayout.core.motion.MotionWidget.PropertySet propertySet;
    androidx.constraintlayout.core.state.WidgetFrame widgetFrame;

    public static class Motion {
        private static final int INTERPOLATOR_REFERENCE_ID = -2;
        private static final int INTERPOLATOR_UNDEFINED = -3;
        private static final int SPLINE_STRING = -1;
        public int mAnimateCircleAngleTo;
        public int mAnimateRelativeTo;
        public int mDrawPath;
        public float mMotionStagger;
        public int mPathMotionArc;
        public float mPathRotate;
        public int mPolarRelativeTo;
        public int mQuantizeInterpolatorID;
        public java.lang.String mQuantizeInterpolatorString;
        public int mQuantizeInterpolatorType;
        public float mQuantizeMotionPhase;
        public int mQuantizeMotionSteps;
        public java.lang.String mTransitionEasing;

        public Motion() {
                r3 = this;
                r3.<init>()
                r0 = -1
                r3.mAnimateRelativeTo = r0
                r1 = 0
                r3.mAnimateCircleAngleTo = r1
                r2 = 0
                r3.mTransitionEasing = r2
                r3.mPathMotionArc = r0
                r3.mDrawPath = r1
                r1 = 2143289344(0x7fc00000, float:NaN)
                r3.mMotionStagger = r1
                r3.mPolarRelativeTo = r0
                r3.mPathRotate = r1
                r3.mQuantizeMotionPhase = r1
                r3.mQuantizeMotionSteps = r0
                r3.mQuantizeInterpolatorString = r2
                r1 = -3
                r3.mQuantizeInterpolatorType = r1
                r3.mQuantizeInterpolatorID = r0
                return
        }
    }

    public static class PropertySet {
        public float alpha;
        public float mProgress;
        public int mVisibilityMode;
        public int visibility;

        public PropertySet() {
                r1 = this;
                r1.<init>()
                r0 = 4
                r1.visibility = r0
                r0 = 0
                r1.mVisibilityMode = r0
                r0 = 1065353216(0x3f800000, float:1.0)
                r1.alpha = r0
                r0 = 2143289344(0x7fc00000, float:NaN)
                r1.mProgress = r0
                return
        }
    }

    public MotionWidget() {
            r1 = this;
            r1.<init>()
            androidx.constraintlayout.core.state.WidgetFrame r0 = new androidx.constraintlayout.core.state.WidgetFrame
            r0.<init>()
            r1.widgetFrame = r0
            androidx.constraintlayout.core.motion.MotionWidget$Motion r0 = new androidx.constraintlayout.core.motion.MotionWidget$Motion
            r0.<init>()
            r1.motion = r0
            androidx.constraintlayout.core.motion.MotionWidget$PropertySet r0 = new androidx.constraintlayout.core.motion.MotionWidget$PropertySet
            r0.<init>()
            r1.propertySet = r0
            return
    }

    public MotionWidget(androidx.constraintlayout.core.state.WidgetFrame r2) {
            r1 = this;
            r1.<init>()
            androidx.constraintlayout.core.state.WidgetFrame r0 = new androidx.constraintlayout.core.state.WidgetFrame
            r0.<init>()
            r1.widgetFrame = r0
            androidx.constraintlayout.core.motion.MotionWidget$Motion r0 = new androidx.constraintlayout.core.motion.MotionWidget$Motion
            r0.<init>()
            r1.motion = r0
            androidx.constraintlayout.core.motion.MotionWidget$PropertySet r0 = new androidx.constraintlayout.core.motion.MotionWidget$PropertySet
            r0.<init>()
            r1.propertySet = r0
            r1.widgetFrame = r2
            return
    }

    public androidx.constraintlayout.core.motion.MotionWidget findViewById(int r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    public float getAlpha() {
            r1 = this;
            androidx.constraintlayout.core.motion.MotionWidget$PropertySet r0 = r1.propertySet
            float r0 = r0.alpha
            return r0
    }

    public int getBottom() {
            r1 = this;
            androidx.constraintlayout.core.state.WidgetFrame r0 = r1.widgetFrame
            int r0 = r0.bottom
            return r0
    }

    public androidx.constraintlayout.core.motion.CustomVariable getCustomAttribute(java.lang.String r2) {
            r1 = this;
            androidx.constraintlayout.core.state.WidgetFrame r0 = r1.widgetFrame
            androidx.constraintlayout.core.motion.CustomVariable r2 = r0.getCustomAttribute(r2)
            return r2
    }

    public java.util.Set<java.lang.String> getCustomAttributeNames() {
            r1 = this;
            androidx.constraintlayout.core.state.WidgetFrame r0 = r1.widgetFrame
            java.util.Set r0 = r0.getCustomAttributeNames()
            return r0
    }

    public int getHeight() {
            r2 = this;
            androidx.constraintlayout.core.state.WidgetFrame r0 = r2.widgetFrame
            int r0 = r0.bottom
            androidx.constraintlayout.core.state.WidgetFrame r1 = r2.widgetFrame
            int r1 = r1.top
            int r0 = r0 - r1
            return r0
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public int getId(java.lang.String r3) {
            r2 = this;
            int r0 = androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.getId(r3)
            r1 = -1
            if (r0 == r1) goto L8
            return r0
        L8:
            int r3 = androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.getId(r3)
            return r3
    }

    public int getLeft() {
            r1 = this;
            androidx.constraintlayout.core.state.WidgetFrame r0 = r1.widgetFrame
            int r0 = r0.left
            return r0
    }

    public java.lang.String getName() {
            r1 = this;
            androidx.constraintlayout.core.state.WidgetFrame r0 = r1.widgetFrame
            java.lang.String r0 = r0.getId()
            return r0
    }

    public androidx.constraintlayout.core.motion.MotionWidget getParent() {
            r1 = this;
            r0 = 0
            return r0
    }

    public float getPivotX() {
            r1 = this;
            androidx.constraintlayout.core.state.WidgetFrame r0 = r1.widgetFrame
            float r0 = r0.pivotX
            return r0
    }

    public float getPivotY() {
            r1 = this;
            androidx.constraintlayout.core.state.WidgetFrame r0 = r1.widgetFrame
            float r0 = r0.pivotY
            return r0
    }

    public int getRight() {
            r1 = this;
            androidx.constraintlayout.core.state.WidgetFrame r0 = r1.widgetFrame
            int r0 = r0.right
            return r0
    }

    public float getRotationX() {
            r1 = this;
            androidx.constraintlayout.core.state.WidgetFrame r0 = r1.widgetFrame
            float r0 = r0.rotationX
            return r0
    }

    public float getRotationY() {
            r1 = this;
            androidx.constraintlayout.core.state.WidgetFrame r0 = r1.widgetFrame
            float r0 = r0.rotationY
            return r0
    }

    public float getRotationZ() {
            r1 = this;
            androidx.constraintlayout.core.state.WidgetFrame r0 = r1.widgetFrame
            float r0 = r0.rotationZ
            return r0
    }

    public float getScaleX() {
            r1 = this;
            androidx.constraintlayout.core.state.WidgetFrame r0 = r1.widgetFrame
            float r0 = r0.scaleX
            return r0
    }

    public float getScaleY() {
            r1 = this;
            androidx.constraintlayout.core.state.WidgetFrame r0 = r1.widgetFrame
            float r0 = r0.scaleY
            return r0
    }

    public int getTop() {
            r1 = this;
            androidx.constraintlayout.core.state.WidgetFrame r0 = r1.widgetFrame
            int r0 = r0.top
            return r0
    }

    public float getTranslationX() {
            r1 = this;
            androidx.constraintlayout.core.state.WidgetFrame r0 = r1.widgetFrame
            float r0 = r0.translationX
            return r0
    }

    public float getTranslationY() {
            r1 = this;
            androidx.constraintlayout.core.state.WidgetFrame r0 = r1.widgetFrame
            float r0 = r0.translationY
            return r0
    }

    public float getTranslationZ() {
            r1 = this;
            androidx.constraintlayout.core.state.WidgetFrame r0 = r1.widgetFrame
            float r0 = r0.translationZ
            return r0
    }

    public float getValueAttributes(int r1) {
            r0 = this;
            switch(r1) {
                case 303: goto L3e;
                case 304: goto L39;
                case 305: goto L34;
                case 306: goto L2f;
                case 307: goto L3;
                case 308: goto L2a;
                case 309: goto L25;
                case 310: goto L20;
                case 311: goto L1b;
                case 312: goto L16;
                case 313: goto L11;
                case 314: goto Lc;
                case 315: goto L9;
                case 316: goto L6;
                default: goto L3;
            }
        L3:
            r1 = 2143289344(0x7fc00000, float:NaN)
            return r1
        L6:
            float r1 = r0.mTransitionPathRotate
            return r1
        L9:
            float r1 = r0.mProgress
            return r1
        Lc:
            androidx.constraintlayout.core.state.WidgetFrame r1 = r0.widgetFrame
            float r1 = r1.pivotY
            return r1
        L11:
            androidx.constraintlayout.core.state.WidgetFrame r1 = r0.widgetFrame
            float r1 = r1.pivotX
            return r1
        L16:
            androidx.constraintlayout.core.state.WidgetFrame r1 = r0.widgetFrame
            float r1 = r1.scaleY
            return r1
        L1b:
            androidx.constraintlayout.core.state.WidgetFrame r1 = r0.widgetFrame
            float r1 = r1.scaleX
            return r1
        L20:
            androidx.constraintlayout.core.state.WidgetFrame r1 = r0.widgetFrame
            float r1 = r1.rotationZ
            return r1
        L25:
            androidx.constraintlayout.core.state.WidgetFrame r1 = r0.widgetFrame
            float r1 = r1.rotationY
            return r1
        L2a:
            androidx.constraintlayout.core.state.WidgetFrame r1 = r0.widgetFrame
            float r1 = r1.rotationX
            return r1
        L2f:
            androidx.constraintlayout.core.state.WidgetFrame r1 = r0.widgetFrame
            float r1 = r1.translationZ
            return r1
        L34:
            androidx.constraintlayout.core.state.WidgetFrame r1 = r0.widgetFrame
            float r1 = r1.translationY
            return r1
        L39:
            androidx.constraintlayout.core.state.WidgetFrame r1 = r0.widgetFrame
            float r1 = r1.translationX
            return r1
        L3e:
            androidx.constraintlayout.core.state.WidgetFrame r1 = r0.widgetFrame
            float r1 = r1.alpha
            return r1
    }

    public int getVisibility() {
            r1 = this;
            androidx.constraintlayout.core.motion.MotionWidget$PropertySet r0 = r1.propertySet
            int r0 = r0.visibility
            return r0
    }

    public androidx.constraintlayout.core.state.WidgetFrame getWidgetFrame() {
            r1 = this;
            androidx.constraintlayout.core.state.WidgetFrame r0 = r1.widgetFrame
            return r0
    }

    public int getWidth() {
            r2 = this;
            androidx.constraintlayout.core.state.WidgetFrame r0 = r2.widgetFrame
            int r0 = r0.right
            androidx.constraintlayout.core.state.WidgetFrame r1 = r2.widgetFrame
            int r1 = r1.left
            int r0 = r0 - r1
            return r0
    }

    public int getX() {
            r1 = this;
            androidx.constraintlayout.core.state.WidgetFrame r0 = r1.widgetFrame
            int r0 = r0.left
            return r0
    }

    public int getY() {
            r1 = this;
            androidx.constraintlayout.core.state.WidgetFrame r0 = r1.widgetFrame
            int r0 = r0.top
            return r0
    }

    public void layout(int r1, int r2, int r3, int r4) {
            r0 = this;
            r0.setBounds(r1, r2, r3, r4)
            return
    }

    public void setBounds(int r4, int r5, int r6, int r7) {
            r3 = this;
            androidx.constraintlayout.core.state.WidgetFrame r0 = r3.widgetFrame
            if (r0 != 0) goto Lf
            androidx.constraintlayout.core.state.WidgetFrame r0 = new androidx.constraintlayout.core.state.WidgetFrame
            r1 = 0
            r2 = r1
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r2
            r0.<init>(r1)
            r3.widgetFrame = r0
        Lf:
            androidx.constraintlayout.core.state.WidgetFrame r0 = r3.widgetFrame
            r0.top = r5
            androidx.constraintlayout.core.state.WidgetFrame r5 = r3.widgetFrame
            r5.left = r4
            androidx.constraintlayout.core.state.WidgetFrame r4 = r3.widgetFrame
            r4.right = r6
            androidx.constraintlayout.core.state.WidgetFrame r4 = r3.widgetFrame
            r4.bottom = r7
            return
    }

    public void setCustomAttribute(java.lang.String r2, int r3, float r4) {
            r1 = this;
            androidx.constraintlayout.core.state.WidgetFrame r0 = r1.widgetFrame
            r0.setCustomAttribute(r2, r3, r4)
            return
    }

    public void setCustomAttribute(java.lang.String r2, int r3, int r4) {
            r1 = this;
            androidx.constraintlayout.core.state.WidgetFrame r0 = r1.widgetFrame
            r0.setCustomAttribute(r2, r3, r4)
            return
    }

    public void setCustomAttribute(java.lang.String r2, int r3, java.lang.String r4) {
            r1 = this;
            androidx.constraintlayout.core.state.WidgetFrame r0 = r1.widgetFrame
            r0.setCustomAttribute(r2, r3, r4)
            return
    }

    public void setCustomAttribute(java.lang.String r2, int r3, boolean r4) {
            r1 = this;
            androidx.constraintlayout.core.state.WidgetFrame r0 = r1.widgetFrame
            r0.setCustomAttribute(r2, r3, r4)
            return
    }

    public void setInterpolatedValue(androidx.constraintlayout.core.motion.CustomAttribute r3, float[] r4) {
            r2 = this;
            androidx.constraintlayout.core.state.WidgetFrame r0 = r2.widgetFrame
            java.lang.String r3 = r3.mName
            r1 = 0
            r4 = r4[r1]
            r1 = 901(0x385, float:1.263E-42)
            r0.setCustomAttribute(r3, r1, r4)
            return
    }

    public void setPivotX(float r2) {
            r1 = this;
            androidx.constraintlayout.core.state.WidgetFrame r0 = r1.widgetFrame
            r0.pivotX = r2
            return
    }

    public void setPivotY(float r2) {
            r1 = this;
            androidx.constraintlayout.core.state.WidgetFrame r0 = r1.widgetFrame
            r0.pivotY = r2
            return
    }

    public void setRotationX(float r2) {
            r1 = this;
            androidx.constraintlayout.core.state.WidgetFrame r0 = r1.widgetFrame
            r0.rotationX = r2
            return
    }

    public void setRotationY(float r2) {
            r1 = this;
            androidx.constraintlayout.core.state.WidgetFrame r0 = r1.widgetFrame
            r0.rotationY = r2
            return
    }

    public void setRotationZ(float r2) {
            r1 = this;
            androidx.constraintlayout.core.state.WidgetFrame r0 = r1.widgetFrame
            r0.rotationZ = r2
            return
    }

    public void setScaleX(float r2) {
            r1 = this;
            androidx.constraintlayout.core.state.WidgetFrame r0 = r1.widgetFrame
            r0.scaleX = r2
            return
    }

    public void setScaleY(float r2) {
            r1 = this;
            androidx.constraintlayout.core.state.WidgetFrame r0 = r1.widgetFrame
            r0.scaleY = r2
            return
    }

    public void setTranslationX(float r2) {
            r1 = this;
            androidx.constraintlayout.core.state.WidgetFrame r0 = r1.widgetFrame
            r0.translationX = r2
            return
    }

    public void setTranslationY(float r2) {
            r1 = this;
            androidx.constraintlayout.core.state.WidgetFrame r0 = r1.widgetFrame
            r0.translationY = r2
            return
    }

    public void setTranslationZ(float r2) {
            r1 = this;
            androidx.constraintlayout.core.state.WidgetFrame r0 = r1.widgetFrame
            r0.translationZ = r2
            return
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int r2, float r3) {
            r1 = this;
            boolean r0 = r1.setValueAttributes(r2, r3)
            if (r0 == 0) goto L8
            r2 = 1
            return r2
        L8:
            boolean r2 = r1.setValueMotion(r2, r3)
            return r2
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int r1, int r2) {
            r0 = this;
            float r2 = (float) r2
            boolean r1 = r0.setValueAttributes(r1, r2)
            return r1
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int r1, java.lang.String r2) {
            r0 = this;
            boolean r1 = r0.setValueMotion(r1, r2)
            return r1
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int r1, boolean r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    public boolean setValueAttributes(int r1, float r2) {
            r0 = this;
            switch(r1) {
                case 303: goto L3d;
                case 304: goto L38;
                case 305: goto L33;
                case 306: goto L2e;
                case 307: goto L3;
                case 308: goto L29;
                case 309: goto L24;
                case 310: goto L1f;
                case 311: goto L1a;
                case 312: goto L15;
                case 313: goto L10;
                case 314: goto Lb;
                case 315: goto L8;
                case 316: goto L5;
                default: goto L3;
            }
        L3:
            r1 = 0
            return r1
        L5:
            r0.mTransitionPathRotate = r2
            goto L41
        L8:
            r0.mProgress = r2
            goto L41
        Lb:
            androidx.constraintlayout.core.state.WidgetFrame r1 = r0.widgetFrame
            r1.pivotY = r2
            goto L41
        L10:
            androidx.constraintlayout.core.state.WidgetFrame r1 = r0.widgetFrame
            r1.pivotX = r2
            goto L41
        L15:
            androidx.constraintlayout.core.state.WidgetFrame r1 = r0.widgetFrame
            r1.scaleY = r2
            goto L41
        L1a:
            androidx.constraintlayout.core.state.WidgetFrame r1 = r0.widgetFrame
            r1.scaleX = r2
            goto L41
        L1f:
            androidx.constraintlayout.core.state.WidgetFrame r1 = r0.widgetFrame
            r1.rotationZ = r2
            goto L41
        L24:
            androidx.constraintlayout.core.state.WidgetFrame r1 = r0.widgetFrame
            r1.rotationY = r2
            goto L41
        L29:
            androidx.constraintlayout.core.state.WidgetFrame r1 = r0.widgetFrame
            r1.rotationX = r2
            goto L41
        L2e:
            androidx.constraintlayout.core.state.WidgetFrame r1 = r0.widgetFrame
            r1.translationZ = r2
            goto L41
        L33:
            androidx.constraintlayout.core.state.WidgetFrame r1 = r0.widgetFrame
            r1.translationY = r2
            goto L41
        L38:
            androidx.constraintlayout.core.state.WidgetFrame r1 = r0.widgetFrame
            r1.translationX = r2
            goto L41
        L3d:
            androidx.constraintlayout.core.state.WidgetFrame r1 = r0.widgetFrame
            r1.alpha = r2
        L41:
            r1 = 1
            return r1
    }

    public boolean setValueMotion(int r1, float r2) {
            r0 = this;
            switch(r1) {
                case 600: goto Lf;
                case 601: goto La;
                case 602: goto L5;
                default: goto L3;
            }
        L3:
            r1 = 0
            return r1
        L5:
            androidx.constraintlayout.core.motion.MotionWidget$Motion r1 = r0.motion
            r1.mQuantizeMotionPhase = r2
            goto L13
        La:
            androidx.constraintlayout.core.motion.MotionWidget$Motion r1 = r0.motion
            r1.mPathRotate = r2
            goto L13
        Lf:
            androidx.constraintlayout.core.motion.MotionWidget$Motion r1 = r0.motion
            r1.mMotionStagger = r2
        L13:
            r1 = 1
            return r1
    }

    public boolean setValueMotion(int r1, int r2) {
            r0 = this;
            switch(r1) {
                case 605: goto L28;
                case 606: goto L23;
                case 607: goto L1e;
                case 608: goto L19;
                case 609: goto L14;
                case 610: goto Lf;
                case 611: goto La;
                case 612: goto L5;
                default: goto L3;
            }
        L3:
            r1 = 0
            return r1
        L5:
            androidx.constraintlayout.core.motion.MotionWidget$Motion r1 = r0.motion
            r1.mQuantizeInterpolatorID = r2
            goto L2c
        La:
            androidx.constraintlayout.core.motion.MotionWidget$Motion r1 = r0.motion
            r1.mQuantizeInterpolatorType = r2
            goto L2c
        Lf:
            androidx.constraintlayout.core.motion.MotionWidget$Motion r1 = r0.motion
            r1.mQuantizeMotionSteps = r2
            goto L2c
        L14:
            androidx.constraintlayout.core.motion.MotionWidget$Motion r1 = r0.motion
            r1.mPolarRelativeTo = r2
            goto L2c
        L19:
            androidx.constraintlayout.core.motion.MotionWidget$Motion r1 = r0.motion
            r1.mDrawPath = r2
            goto L2c
        L1e:
            androidx.constraintlayout.core.motion.MotionWidget$Motion r1 = r0.motion
            r1.mPathMotionArc = r2
            goto L2c
        L23:
            androidx.constraintlayout.core.motion.MotionWidget$Motion r1 = r0.motion
            r1.mAnimateCircleAngleTo = r2
            goto L2c
        L28:
            androidx.constraintlayout.core.motion.MotionWidget$Motion r1 = r0.motion
            r1.mAnimateRelativeTo = r2
        L2c:
            r1 = 1
            return r1
    }

    public boolean setValueMotion(int r2, java.lang.String r3) {
            r1 = this;
            r0 = 603(0x25b, float:8.45E-43)
            if (r2 == r0) goto Lf
            r0 = 604(0x25c, float:8.46E-43)
            if (r2 == r0) goto La
            r2 = 0
            return r2
        La:
            androidx.constraintlayout.core.motion.MotionWidget$Motion r2 = r1.motion
            r2.mQuantizeInterpolatorString = r3
            goto L13
        Lf:
            androidx.constraintlayout.core.motion.MotionWidget$Motion r2 = r1.motion
            r2.mTransitionEasing = r3
        L13:
            r2 = 1
            return r2
    }

    public void setVisibility(int r2) {
            r1 = this;
            androidx.constraintlayout.core.motion.MotionWidget$PropertySet r0 = r1.propertySet
            r0.visibility = r2
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            androidx.constraintlayout.core.state.WidgetFrame r1 = r3.widgetFrame
            int r1 = r1.left
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", "
            java.lang.StringBuilder r0 = r0.append(r1)
            androidx.constraintlayout.core.state.WidgetFrame r2 = r3.widgetFrame
            int r2 = r2.top
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            androidx.constraintlayout.core.state.WidgetFrame r2 = r3.widgetFrame
            int r2 = r2.right
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            androidx.constraintlayout.core.state.WidgetFrame r1 = r3.widgetFrame
            int r1 = r1.bottom
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
