package androidx.constraintlayout.core.motion.key;

/* loaded from: classes.dex */
public class MotionKeyAttributes extends androidx.constraintlayout.core.motion.key.MotionKey {
    private static final boolean DEBUG = false;
    public static final int KEY_TYPE = 1;
    static final java.lang.String NAME = "KeyAttribute";
    private static final java.lang.String TAG = "KeyAttributes";
    private float mAlpha;
    private int mCurveFit;
    private float mElevation;
    private float mPivotX;
    private float mPivotY;
    private float mProgress;
    private float mRotation;
    private float mRotationX;
    private float mRotationY;
    private float mScaleX;
    private float mScaleY;
    private java.lang.String mTransitionEasing;
    private float mTransitionPathRotate;
    private float mTranslationX;
    private float mTranslationY;
    private float mTranslationZ;
    private int mVisibility;

    public MotionKeyAttributes() {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.mCurveFit = r0
            r0 = 0
            r1.mVisibility = r0
            r0 = 2143289344(0x7fc00000, float:NaN)
            r1.mAlpha = r0
            r1.mElevation = r0
            r1.mRotation = r0
            r1.mRotationX = r0
            r1.mRotationY = r0
            r1.mPivotX = r0
            r1.mPivotY = r0
            r1.mTransitionPathRotate = r0
            r1.mScaleX = r0
            r1.mScaleY = r0
            r1.mTranslationX = r0
            r1.mTranslationY = r0
            r1.mTranslationZ = r0
            r1.mProgress = r0
            r0 = 1
            r1.mType = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mCustom = r0
            return
    }

    private float getFloatValue(int r2) {
            r1 = this;
            r0 = 100
            if (r2 == r0) goto L34
            switch(r2) {
                case 303: goto L31;
                case 304: goto L2e;
                case 305: goto L2b;
                case 306: goto L28;
                case 307: goto L25;
                case 308: goto L22;
                case 309: goto L1f;
                case 310: goto L1c;
                case 311: goto L19;
                case 312: goto L16;
                case 313: goto L13;
                case 314: goto L10;
                case 315: goto Ld;
                case 316: goto La;
                default: goto L7;
            }
        L7:
            r2 = 2143289344(0x7fc00000, float:NaN)
            return r2
        La:
            float r2 = r1.mTransitionPathRotate
            return r2
        Ld:
            float r2 = r1.mProgress
            return r2
        L10:
            float r2 = r1.mPivotY
            return r2
        L13:
            float r2 = r1.mPivotX
            return r2
        L16:
            float r2 = r1.mScaleY
            return r2
        L19:
            float r2 = r1.mScaleX
            return r2
        L1c:
            float r2 = r1.mRotation
            return r2
        L1f:
            float r2 = r1.mRotationY
            return r2
        L22:
            float r2 = r1.mRotationX
            return r2
        L25:
            float r2 = r1.mElevation
            return r2
        L28:
            float r2 = r1.mTranslationZ
            return r2
        L2b:
            float r2 = r1.mTranslationY
            return r2
        L2e:
            float r2 = r1.mTranslationX
            return r2
        L31:
            float r2 = r1.mAlpha
            return r2
        L34:
            int r2 = r1.mFramePosition
            float r2 = (float) r2
            return r2
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void addValues(java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.SplineSet> r7) {
            r6 = this;
            java.util.Set r0 = r7.keySet()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1f7
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r7.get(r1)
            androidx.constraintlayout.core.motion.utils.SplineSet r2 = (androidx.constraintlayout.core.motion.utils.SplineSet) r2
            if (r2 != 0) goto L1d
            goto L8
        L1d:
            java.lang.String r3 = "CUSTOM"
            boolean r3 = r1.startsWith(r3)
            r4 = 7
            if (r3 == 0) goto L3c
            java.lang.String r1 = r1.substring(r4)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r3 = r6.mCustom
            java.lang.Object r1 = r3.get(r1)
            androidx.constraintlayout.core.motion.CustomVariable r1 = (androidx.constraintlayout.core.motion.CustomVariable) r1
            if (r1 == 0) goto L8
            androidx.constraintlayout.core.motion.utils.SplineSet$CustomSpline r2 = (androidx.constraintlayout.core.motion.utils.SplineSet.CustomSpline) r2
            int r3 = r6.mFramePosition
            r2.setPoint(r3, r1)
            goto L8
        L3c:
            r1.hashCode()
            int r3 = r1.hashCode()
            r5 = -1
            switch(r3) {
                case -1249320806: goto Le5;
                case -1249320805: goto Ld9;
                case -1249320804: goto Lcd;
                case -1225497657: goto Lc1;
                case -1225497656: goto Lb6;
                case -1225497655: goto Lab;
                case -1001078227: goto La0;
                case -987906986: goto L97;
                case -987906985: goto L8b;
                case -908189618: goto L7e;
                case -908189617: goto L71;
                case -4379043: goto L64;
                case 92909918: goto L57;
                case 803192288: goto L4a;
                default: goto L47;
            }
        L47:
            r4 = r5
            goto Lf0
        L4a:
            java.lang.String r3 = "pathRotate"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L53
            goto L47
        L53:
            r4 = 13
            goto Lf0
        L57:
            java.lang.String r3 = "alpha"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L60
            goto L47
        L60:
            r4 = 12
            goto Lf0
        L64:
            java.lang.String r3 = "elevation"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L6d
            goto L47
        L6d:
            r4 = 11
            goto Lf0
        L71:
            java.lang.String r3 = "scaleY"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L7a
            goto L47
        L7a:
            r4 = 10
            goto Lf0
        L7e:
            java.lang.String r3 = "scaleX"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L87
            goto L47
        L87:
            r4 = 9
            goto Lf0
        L8b:
            java.lang.String r3 = "pivotY"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L94
            goto L47
        L94:
            r4 = 8
            goto Lf0
        L97:
            java.lang.String r3 = "pivotX"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto Lf0
            goto L47
        La0:
            java.lang.String r3 = "progress"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto La9
            goto L47
        La9:
            r4 = 6
            goto Lf0
        Lab:
            java.lang.String r3 = "translationZ"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto Lb4
            goto L47
        Lb4:
            r4 = 5
            goto Lf0
        Lb6:
            java.lang.String r3 = "translationY"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto Lbf
            goto L47
        Lbf:
            r4 = 4
            goto Lf0
        Lc1:
            java.lang.String r3 = "translationX"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto Lcb
            goto L47
        Lcb:
            r4 = 3
            goto Lf0
        Lcd:
            java.lang.String r3 = "rotationZ"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto Ld7
            goto L47
        Ld7:
            r4 = 2
            goto Lf0
        Ld9:
            java.lang.String r3 = "rotationY"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto Le3
            goto L47
        Le3:
            r4 = 1
            goto Lf0
        Le5:
            java.lang.String r3 = "rotationX"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto Lef
            goto L47
        Lef:
            r4 = 0
        Lf0:
            switch(r4) {
                case 0: goto L1e6;
                case 1: goto L1d5;
                case 2: goto L1c4;
                case 3: goto L1b3;
                case 4: goto L1a2;
                case 5: goto L191;
                case 6: goto L180;
                case 7: goto L16f;
                case 8: goto L15e;
                case 9: goto L14d;
                case 10: goto L13c;
                case 11: goto L12b;
                case 12: goto L11a;
                case 13: goto L109;
                default: goto Lf3;
            }
        Lf3:
            java.io.PrintStream r2 = java.lang.System.err
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "not supported by KeyAttributes "
            r3.<init>(r4)
            java.lang.StringBuilder r1 = r3.append(r1)
            java.lang.String r1 = r1.toString()
            r2.println(r1)
            goto L8
        L109:
            float r1 = r6.mTransitionPathRotate
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r6.mFramePosition
            float r3 = r6.mTransitionPathRotate
            r2.setPoint(r1, r3)
            goto L8
        L11a:
            float r1 = r6.mAlpha
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r6.mFramePosition
            float r3 = r6.mAlpha
            r2.setPoint(r1, r3)
            goto L8
        L12b:
            float r1 = r6.mElevation
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r6.mFramePosition
            float r3 = r6.mElevation
            r2.setPoint(r1, r3)
            goto L8
        L13c:
            float r1 = r6.mScaleY
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r6.mFramePosition
            float r3 = r6.mScaleY
            r2.setPoint(r1, r3)
            goto L8
        L14d:
            float r1 = r6.mScaleX
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r6.mFramePosition
            float r3 = r6.mScaleX
            r2.setPoint(r1, r3)
            goto L8
        L15e:
            float r1 = r6.mRotationY
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r6.mFramePosition
            float r3 = r6.mPivotY
            r2.setPoint(r1, r3)
            goto L8
        L16f:
            float r1 = r6.mRotationX
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r6.mFramePosition
            float r3 = r6.mPivotX
            r2.setPoint(r1, r3)
            goto L8
        L180:
            float r1 = r6.mProgress
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r6.mFramePosition
            float r3 = r6.mProgress
            r2.setPoint(r1, r3)
            goto L8
        L191:
            float r1 = r6.mTranslationZ
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r6.mFramePosition
            float r3 = r6.mTranslationZ
            r2.setPoint(r1, r3)
            goto L8
        L1a2:
            float r1 = r6.mTranslationY
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r6.mFramePosition
            float r3 = r6.mTranslationY
            r2.setPoint(r1, r3)
            goto L8
        L1b3:
            float r1 = r6.mTranslationX
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r6.mFramePosition
            float r3 = r6.mTranslationX
            r2.setPoint(r1, r3)
            goto L8
        L1c4:
            float r1 = r6.mRotation
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r6.mFramePosition
            float r3 = r6.mRotation
            r2.setPoint(r1, r3)
            goto L8
        L1d5:
            float r1 = r6.mRotationY
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r6.mFramePosition
            float r3 = r6.mRotationY
            r2.setPoint(r1, r3)
            goto L8
        L1e6:
            float r1 = r6.mRotationX
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r6.mFramePosition
            float r3 = r6.mRotationX
            r2.setPoint(r1, r3)
            goto L8
        L1f7:
            return
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public androidx.constraintlayout.core.motion.key.MotionKey clone() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    /* renamed from: clone */
    public /* bridge */ /* synthetic */ java.lang.Object mo128clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            androidx.constraintlayout.core.motion.key.MotionKey r0 = r1.clone()
            return r0
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void getAttributeNames(java.util.HashSet<java.lang.String> r5) {
            r4 = this;
            float r0 = r4.mAlpha
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Ld
            java.lang.String r0 = "alpha"
            r5.add(r0)
        Ld:
            float r0 = r4.mElevation
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L1a
            java.lang.String r0 = "elevation"
            r5.add(r0)
        L1a:
            float r0 = r4.mRotation
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L27
            java.lang.String r0 = "rotationZ"
            r5.add(r0)
        L27:
            float r0 = r4.mRotationX
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L34
            java.lang.String r0 = "rotationX"
            r5.add(r0)
        L34:
            float r0 = r4.mRotationY
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L41
            java.lang.String r0 = "rotationY"
            r5.add(r0)
        L41:
            float r0 = r4.mPivotX
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L4e
            java.lang.String r0 = "pivotX"
            r5.add(r0)
        L4e:
            float r0 = r4.mPivotY
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L5b
            java.lang.String r0 = "pivotY"
            r5.add(r0)
        L5b:
            float r0 = r4.mTranslationX
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L68
            java.lang.String r0 = "translationX"
            r5.add(r0)
        L68:
            float r0 = r4.mTranslationY
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L75
            java.lang.String r0 = "translationY"
            r5.add(r0)
        L75:
            float r0 = r4.mTranslationZ
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L82
            java.lang.String r0 = "translationZ"
            r5.add(r0)
        L82:
            float r0 = r4.mTransitionPathRotate
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L8f
            java.lang.String r0 = "pathRotate"
            r5.add(r0)
        L8f:
            float r0 = r4.mScaleX
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L9c
            java.lang.String r0 = "scaleX"
            r5.add(r0)
        L9c:
            float r0 = r4.mScaleY
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto La9
            java.lang.String r0 = "scaleY"
            r5.add(r0)
        La9:
            float r0 = r4.mProgress
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Lb6
            java.lang.String r0 = "progress"
            r5.add(r0)
        Lb6:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r0 = r4.mCustom
            int r0 = r0.size()
            if (r0 <= 0) goto Le7
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r0 = r4.mCustom
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        Lc8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Le7
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "CUSTOM,"
            r2.<init>(r3)
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r1 = r1.toString()
            r5.add(r1)
            goto Lc8
        Le7:
            return
    }

    public int getCurveFit() {
            r1 = this;
            int r0 = r1.mCurveFit
            return r0
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public int getId(java.lang.String r1) {
            r0 = this;
            int r1 = androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.getId(r1)
            return r1
    }

    public void printAttributes() {
            r6 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r6.getAttributeNames(r0)
            java.io.PrintStream r1 = java.lang.System.out
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = " ------------- "
            r2.<init>(r3)
            int r3 = r6.mFramePosition
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " -------------"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.println(r2)
            r1 = 0
            java.lang.String[] r2 = new java.lang.String[r1]
            java.lang.Object[] r0 = r0.toArray(r2)
            java.lang.String[] r0 = (java.lang.String[]) r0
        L2d:
            int r2 = r0.length
            if (r1 >= r2) goto L5b
            r2 = r0[r1]
            int r2 = androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.getId(r2)
            java.io.PrintStream r3 = java.lang.System.out
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r5 = r0[r1]
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = ":"
            java.lang.StringBuilder r4 = r4.append(r5)
            float r2 = r6.getFloatValue(r2)
            java.lang.StringBuilder r2 = r4.append(r2)
            java.lang.String r2 = r2.toString()
            r3.println(r2)
            int r1 = r1 + 1
            goto L2d
        L5b:
            return
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void setInterpolation(java.util.HashMap<java.lang.String, java.lang.Integer> r5) {
            r4 = this;
            float r0 = r4.mAlpha
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L13
            int r0 = r4.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "alpha"
            r5.put(r1, r0)
        L13:
            float r0 = r4.mElevation
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L26
            int r0 = r4.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "elevation"
            r5.put(r1, r0)
        L26:
            float r0 = r4.mRotation
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L39
            int r0 = r4.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "rotationZ"
            r5.put(r1, r0)
        L39:
            float r0 = r4.mRotationX
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L4c
            int r0 = r4.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "rotationX"
            r5.put(r1, r0)
        L4c:
            float r0 = r4.mRotationY
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L5f
            int r0 = r4.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "rotationY"
            r5.put(r1, r0)
        L5f:
            float r0 = r4.mPivotX
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L72
            int r0 = r4.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "pivotX"
            r5.put(r1, r0)
        L72:
            float r0 = r4.mPivotY
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L85
            int r0 = r4.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "pivotY"
            r5.put(r1, r0)
        L85:
            float r0 = r4.mTranslationX
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L98
            int r0 = r4.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "translationX"
            r5.put(r1, r0)
        L98:
            float r0 = r4.mTranslationY
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Lab
            int r0 = r4.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "translationY"
            r5.put(r1, r0)
        Lab:
            float r0 = r4.mTranslationZ
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Lbe
            int r0 = r4.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "translationZ"
            r5.put(r1, r0)
        Lbe:
            float r0 = r4.mTransitionPathRotate
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Ld1
            int r0 = r4.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "pathRotate"
            r5.put(r1, r0)
        Ld1:
            float r0 = r4.mScaleX
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Le4
            int r0 = r4.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "scaleX"
            r5.put(r1, r0)
        Le4:
            float r0 = r4.mScaleY
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Lf7
            int r0 = r4.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "scaleY"
            r5.put(r1, r0)
        Lf7:
            float r0 = r4.mProgress
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L10a
            int r0 = r4.mCurveFit
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "progress"
            r5.put(r1, r0)
        L10a:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r0 = r4.mCustom
            int r0 = r0.size()
            if (r0 <= 0) goto L141
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r0 = r4.mCustom
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L11c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L141
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "CUSTOM,"
            r2.<init>(r3)
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r1 = r1.toString()
            int r2 = r4.mCurveFit
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r5.put(r1, r2)
            goto L11c
        L141:
            return
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int r2, float r3) {
            r1 = this;
            r0 = 100
            if (r2 == r0) goto L36
            switch(r2) {
                case 303: goto L33;
                case 304: goto L30;
                case 305: goto L2d;
                case 306: goto L2a;
                case 307: goto L27;
                case 308: goto L24;
                case 309: goto L21;
                case 310: goto L1e;
                case 311: goto L1b;
                case 312: goto L18;
                case 313: goto L15;
                case 314: goto L12;
                case 315: goto Lf;
                case 316: goto Lc;
                default: goto L7;
            }
        L7:
            boolean r2 = super.setValue(r2, r3)
            return r2
        Lc:
            r1.mTransitionPathRotate = r3
            goto L38
        Lf:
            r1.mProgress = r3
            goto L38
        L12:
            r1.mPivotY = r3
            goto L38
        L15:
            r1.mPivotX = r3
            goto L38
        L18:
            r1.mScaleY = r3
            goto L38
        L1b:
            r1.mScaleX = r3
            goto L38
        L1e:
            r1.mRotation = r3
            goto L38
        L21:
            r1.mRotationY = r3
            goto L38
        L24:
            r1.mRotationX = r3
            goto L38
        L27:
            r1.mElevation = r3
            goto L38
        L2a:
            r1.mTranslationZ = r3
            goto L38
        L2d:
            r1.mTranslationY = r3
            goto L38
        L30:
            r1.mTranslationX = r3
            goto L38
        L33:
            r1.mAlpha = r3
            goto L38
        L36:
            r1.mTransitionPathRotate = r3
        L38:
            r2 = 1
            return r2
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int r2, int r3) {
            r1 = this;
            r0 = 100
            if (r2 == r0) goto L1d
            r0 = 301(0x12d, float:4.22E-43)
            if (r2 == r0) goto L1a
            r0 = 302(0x12e, float:4.23E-43)
            if (r2 == r0) goto L17
            boolean r0 = r1.setValue(r2, r3)
            if (r0 != 0) goto L1f
            boolean r2 = super.setValue(r2, r3)
            return r2
        L17:
            r1.mVisibility = r3
            goto L1f
        L1a:
            r1.mCurveFit = r3
            goto L1f
        L1d:
            r1.mFramePosition = r3
        L1f:
            r2 = 1
            return r2
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int r2, java.lang.String r3) {
            r1 = this;
            r0 = 101(0x65, float:1.42E-43)
            if (r2 == r0) goto L10
            r0 = 317(0x13d, float:4.44E-43)
            if (r2 == r0) goto Ld
            boolean r2 = super.setValue(r2, r3)
            return r2
        Ld:
            r1.mTransitionEasing = r3
            goto L12
        L10:
            r1.mTargetString = r3
        L12:
            r2 = 1
            return r2
    }
}
