package androidx.constraintlayout.core.state;

/* loaded from: classes.dex */
public class WidgetFrame {
    private static final boolean OLD_SYSTEM = true;
    public static float phone_orientation = Float.NaN;
    public float alpha;
    public int bottom;
    public float interpolatedPos;
    public int left;
    public final java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> mCustom;
    public java.lang.String name;
    public float pivotX;
    public float pivotY;
    public int right;
    public float rotationX;
    public float rotationY;
    public float rotationZ;
    public float scaleX;
    public float scaleY;
    public int top;
    public float translationX;
    public float translationY;
    public float translationZ;
    public int visibility;
    public androidx.constraintlayout.core.widgets.ConstraintWidget widget;

    static {
            return
    }

    public WidgetFrame() {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.widget = r0
            r1 = 0
            r3.left = r1
            r3.top = r1
            r3.right = r1
            r3.bottom = r1
            r2 = 2143289344(0x7fc00000, float:NaN)
            r3.pivotX = r2
            r3.pivotY = r2
            r3.rotationX = r2
            r3.rotationY = r2
            r3.rotationZ = r2
            r3.translationX = r2
            r3.translationY = r2
            r3.translationZ = r2
            r3.scaleX = r2
            r3.scaleY = r2
            r3.alpha = r2
            r3.interpolatedPos = r2
            r3.visibility = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r3.mCustom = r1
            r3.name = r0
            return
    }

    public WidgetFrame(androidx.constraintlayout.core.state.WidgetFrame r4) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.widget = r0
            r1 = 0
            r3.left = r1
            r3.top = r1
            r3.right = r1
            r3.bottom = r1
            r2 = 2143289344(0x7fc00000, float:NaN)
            r3.pivotX = r2
            r3.pivotY = r2
            r3.rotationX = r2
            r3.rotationY = r2
            r3.rotationZ = r2
            r3.translationX = r2
            r3.translationY = r2
            r3.translationZ = r2
            r3.scaleX = r2
            r3.scaleY = r2
            r3.alpha = r2
            r3.interpolatedPos = r2
            r3.visibility = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r3.mCustom = r1
            r3.name = r0
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r4.widget
            r3.widget = r0
            int r0 = r4.left
            r3.left = r0
            int r0 = r4.top
            r3.top = r0
            int r0 = r4.right
            r3.right = r0
            int r0 = r4.bottom
            r3.bottom = r0
            r3.updateAttributes(r4)
            return
    }

    public WidgetFrame(androidx.constraintlayout.core.widgets.ConstraintWidget r4) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.widget = r0
            r1 = 0
            r3.left = r1
            r3.top = r1
            r3.right = r1
            r3.bottom = r1
            r2 = 2143289344(0x7fc00000, float:NaN)
            r3.pivotX = r2
            r3.pivotY = r2
            r3.rotationX = r2
            r3.rotationY = r2
            r3.rotationZ = r2
            r3.translationX = r2
            r3.translationY = r2
            r3.translationZ = r2
            r3.scaleX = r2
            r3.scaleY = r2
            r3.alpha = r2
            r3.interpolatedPos = r2
            r3.visibility = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r3.mCustom = r1
            r3.name = r0
            r3.widget = r4
            return
    }

    private static void add(java.lang.StringBuilder r1, java.lang.String r2, float r3) {
            boolean r0 = java.lang.Float.isNaN(r3)
            if (r0 == 0) goto L7
            return
        L7:
            r1.append(r2)
            java.lang.String r2 = ": "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = ",\n"
            r1.append(r2)
            return
    }

    private static void add(java.lang.StringBuilder r0, java.lang.String r1, int r2) {
            r0.append(r1)
            java.lang.String r1 = ": "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = ",\n"
            r0.append(r1)
            return
    }

    private static float interpolate(float r2, float r3, float r4, float r5) {
            boolean r0 = java.lang.Float.isNaN(r2)
            boolean r1 = java.lang.Float.isNaN(r3)
            if (r0 == 0) goto Lf
            if (r1 == 0) goto Lf
            r2 = 2143289344(0x7fc00000, float:NaN)
            return r2
        Lf:
            if (r0 == 0) goto L12
            r2 = r4
        L12:
            if (r1 == 0) goto L15
            r3 = r4
        L15:
            float r3 = r3 - r2
            float r5 = r5 * r3
            float r2 = r2 + r5
            return r2
    }

    public static void interpolate(int r22, int r23, androidx.constraintlayout.core.state.WidgetFrame r24, androidx.constraintlayout.core.state.WidgetFrame r25, androidx.constraintlayout.core.state.WidgetFrame r26, androidx.constraintlayout.core.state.Transition r27, float r28) {
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r25
            r4 = r26
            r5 = r27
            r6 = r28
            r7 = 1120403456(0x42c80000, float:100.0)
            float r7 = r7 * r6
            int r8 = (int) r7
            int r9 = r3.left
            int r10 = r3.top
            int r11 = r4.left
            int r12 = r4.top
            int r13 = r3.right
            int r13 = r13 - r9
            int r14 = r3.bottom
            int r14 = r14 - r10
            int r15 = r4.right
            int r15 = r15 - r11
            r16 = r13
            int r13 = r4.bottom
            int r13 = r13 - r12
            r17 = r14
            float r14 = r3.alpha
            float r6 = r4.alpha
            r18 = r7
            int r7 = r3.visibility
            r19 = 1073741824(0x40000000, float:2.0)
            r1 = 8
            if (r7 != r1) goto L56
            float r7 = (float) r9
            float r9 = (float) r15
            float r9 = r9 / r19
            float r7 = r7 - r9
            int r9 = (int) r7
            float r7 = (float) r10
            float r10 = (float) r13
            float r10 = r10 / r19
            float r7 = r7 - r10
            int r10 = (int) r7
            boolean r7 = java.lang.Float.isNaN(r14)
            r17 = r9
            if (r7 == 0) goto L51
            r14 = r13
            r7 = r15
            r16 = 0
            goto L5e
        L51:
            r16 = r14
            r7 = r15
            r14 = r13
            goto L5e
        L56:
            r7 = r16
            r16 = r14
            r14 = r17
            r17 = r9
        L5e:
            int r9 = r4.visibility
            if (r9 != r1) goto L77
            float r1 = (float) r11
            float r9 = (float) r7
            float r9 = r9 / r19
            float r1 = r1 - r9
            int r11 = (int) r1
            float r1 = (float) r12
            float r9 = (float) r14
            float r9 = r9 / r19
            float r1 = r1 - r9
            int r12 = (int) r1
            boolean r1 = java.lang.Float.isNaN(r6)
            r15 = r7
            r13 = r14
            if (r1 == 0) goto L77
            r6 = 0
        L77:
            boolean r1 = java.lang.Float.isNaN(r16)
            if (r1 == 0) goto L85
            boolean r1 = java.lang.Float.isNaN(r6)
            if (r1 != 0) goto L85
            r16 = 1065353216(0x3f800000, float:1.0)
        L85:
            boolean r1 = java.lang.Float.isNaN(r16)
            if (r1 != 0) goto L93
            boolean r1 = java.lang.Float.isNaN(r6)
            if (r1 == 0) goto L93
            r6 = 1065353216(0x3f800000, float:1.0)
        L93:
            int r1 = r3.visibility
            r9 = 4
            if (r1 != r9) goto L9c
            r16 = r6
            r1 = 0
            goto La0
        L9c:
            r1 = r16
            r16 = r6
        La0:
            int r6 = r4.visibility
            if (r6 != r9) goto La6
            r6 = 0
            goto La8
        La6:
            r6 = r16
        La8:
            androidx.constraintlayout.core.widgets.ConstraintWidget r9 = r2.widget
            r16 = 0
            if (r9 == 0) goto L105
            boolean r9 = r27.hasPositionKeyframes()
            if (r9 == 0) goto L105
            androidx.constraintlayout.core.widgets.ConstraintWidget r9 = r2.widget
            java.lang.String r9 = r9.stringId
            androidx.constraintlayout.core.state.Transition$KeyPosition r9 = r5.findPreviousPosition(r9, r8)
            r21 = r10
            androidx.constraintlayout.core.widgets.ConstraintWidget r10 = r2.widget
            java.lang.String r10 = r10.stringId
            androidx.constraintlayout.core.state.Transition$KeyPosition r5 = r5.findNextPosition(r10, r8)
            if (r9 != r5) goto Lc9
            r5 = 0
        Lc9:
            if (r9 == 0) goto Le1
            float r8 = r9.f35x
            float r10 = (float) r0
            float r8 = r8 * r10
            int r8 = (int) r8
            float r10 = r9.f36y
            r17 = r8
            r20 = r11
            r8 = r23
            float r11 = (float) r8
            float r10 = r10 * r11
            int r10 = (int) r10
            int r9 = r9.frame
            r21 = r10
            r10 = r9
            goto Le7
        Le1:
            r8 = r23
            r20 = r11
            r10 = r16
        Le7:
            r9 = r17
            if (r5 == 0) goto Lfa
            float r11 = r5.f35x
            float r0 = (float) r0
            float r11 = r11 * r0
            int r0 = (int) r11
            float r11 = r5.f36y
            float r8 = (float) r8
            float r11 = r11 * r8
            int r8 = (int) r11
            int r5 = r5.frame
            r11 = r0
            r12 = r8
            goto Lfe
        Lfa:
            r5 = 100
            r11 = r20
        Lfe:
            float r0 = (float) r10
            float r0 = r18 - r0
            int r5 = r5 - r10
            float r5 = (float) r5
            float r0 = r0 / r5
            goto L10f
        L105:
            r21 = r10
            r20 = r11
            r0 = r28
            r9 = r17
            r11 = r20
        L10f:
            r10 = r21
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = r3.widget
            r2.widget = r5
            float r5 = (float) r9
            int r11 = r11 - r9
            float r8 = (float) r11
            float r8 = r8 * r0
            float r5 = r5 + r8
            int r5 = (int) r5
            r2.left = r5
            float r8 = (float) r10
            int r12 = r12 - r10
            float r9 = (float) r12
            float r0 = r0 * r9
            float r8 = r8 + r0
            int r0 = (int) r8
            r2.top = r0
            r8 = r28
            r9 = 1065353216(0x3f800000, float:1.0)
            float r10 = r9 - r8
            float r7 = (float) r7
            float r7 = r7 * r10
            float r9 = (float) r15
            float r9 = r9 * r8
            float r7 = r7 + r9
            int r7 = (int) r7
            float r9 = (float) r14
            float r10 = r10 * r9
            float r9 = (float) r13
            float r9 = r9 * r8
            float r10 = r10 + r9
            int r9 = (int) r10
            int r5 = r5 + r7
            r2.right = r5
            int r0 = r0 + r9
            r2.bottom = r0
            float r0 = r3.pivotX
            float r5 = r4.pivotX
            r7 = 1056964608(0x3f000000, float:0.5)
            float r0 = interpolate(r0, r5, r7, r8)
            r2.pivotX = r0
            float r0 = r3.pivotY
            float r5 = r4.pivotY
            float r0 = interpolate(r0, r5, r7, r8)
            r2.pivotY = r0
            float r0 = r3.rotationX
            float r5 = r4.rotationX
            r7 = 0
            float r0 = interpolate(r0, r5, r7, r8)
            r2.rotationX = r0
            float r0 = r3.rotationY
            float r5 = r4.rotationY
            float r0 = interpolate(r0, r5, r7, r8)
            r2.rotationY = r0
            float r0 = r3.rotationZ
            float r5 = r4.rotationZ
            float r0 = interpolate(r0, r5, r7, r8)
            r2.rotationZ = r0
            float r0 = r3.scaleX
            float r5 = r4.scaleX
            r7 = 1065353216(0x3f800000, float:1.0)
            float r0 = interpolate(r0, r5, r7, r8)
            r2.scaleX = r0
            float r0 = r3.scaleY
            float r5 = r4.scaleY
            float r0 = interpolate(r0, r5, r7, r8)
            r2.scaleY = r0
            float r0 = r3.translationX
            float r5 = r4.translationX
            r7 = 0
            float r0 = interpolate(r0, r5, r7, r8)
            r2.translationX = r0
            float r0 = r3.translationY
            float r5 = r4.translationY
            float r0 = interpolate(r0, r5, r7, r8)
            r2.translationY = r0
            float r0 = r3.translationZ
            float r5 = r4.translationZ
            float r0 = interpolate(r0, r5, r7, r8)
            r2.translationZ = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = interpolate(r1, r6, r0, r8)
            r2.alpha = r0
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r0 = r4.mCustom
            java.util.Set r0 = r0.keySet()
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r1 = r2.mCustom
            r1.clear()
            java.util.Iterator r0 = r0.iterator()
        L1be:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L22d
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r5 = r3.mCustom
            boolean r5 = r5.containsKey(r1)
            if (r5 == 0) goto L22b
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r5 = r3.mCustom
            java.lang.Object r5 = r5.get(r1)
            androidx.constraintlayout.core.motion.CustomVariable r5 = (androidx.constraintlayout.core.motion.CustomVariable) r5
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r6 = r4.mCustom
            java.lang.Object r6 = r6.get(r1)
            androidx.constraintlayout.core.motion.CustomVariable r6 = (androidx.constraintlayout.core.motion.CustomVariable) r6
            androidx.constraintlayout.core.motion.CustomVariable r7 = new androidx.constraintlayout.core.motion.CustomVariable
            r7.<init>(r5)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r9 = r2.mCustom
            r9.put(r1, r7)
            int r1 = r5.numberOfInterpolatedValues()
            r9 = 1
            if (r1 != r9) goto L208
            float r1 = r5.getValueToInterpolate()
            float r5 = r6.getValueToInterpolate()
            r6 = 0
            float r1 = interpolate(r1, r5, r6, r8)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r7.setValue(r1)
            goto L22b
        L208:
            int r1 = r5.numberOfInterpolatedValues()
            float[] r9 = new float[r1]
            float[] r10 = new float[r1]
            r5.getValuesToInterpolate(r9)
            r6.getValuesToInterpolate(r10)
            r5 = r16
        L218:
            if (r5 >= r1) goto L22b
            r6 = r9[r5]
            r11 = r10[r5]
            r12 = 0
            float r6 = interpolate(r6, r11, r12, r8)
            r9[r5] = r6
            r7.setValue(r9)
            int r5 = r5 + 1
            goto L218
        L22b:
            r12 = 0
            goto L1be
        L22d:
            return
    }

    private void serializeAnchor(java.lang.StringBuilder r3, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type r4) {
            r2 = this;
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r2.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.getAnchor(r4)
            if (r0 == 0) goto L4c
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r0.mTarget
            if (r1 != 0) goto Ld
            goto L4c
        Ld:
            java.lang.String r1 = "Anchor"
            r3.append(r1)
            java.lang.String r4 = r4.name()
            r3.append(r4)
            java.lang.String r4 = ": ['"
            r3.append(r4)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r0.mTarget
            androidx.constraintlayout.core.widgets.ConstraintWidget r4 = r4.getOwner()
            java.lang.String r4 = r4.stringId
            if (r4 != 0) goto L2a
            java.lang.String r4 = "#PARENT"
        L2a:
            r3.append(r4)
            java.lang.String r4 = "', '"
            r3.append(r4)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r0.mTarget
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = r1.getType()
            java.lang.String r1 = r1.name()
            r3.append(r1)
            r3.append(r4)
            int r4 = r0.mMargin
            r3.append(r4)
            java.lang.String r4 = "'],\n"
            r3.append(r4)
        L4c:
            return
    }

    public void addCustomColor(java.lang.String r2, int r3) {
            r1 = this;
            r0 = 902(0x386, float:1.264E-42)
            r1.setCustomAttribute(r2, r0, r3)
            return
    }

    public void addCustomFloat(java.lang.String r2, float r3) {
            r1 = this;
            r0 = 901(0x385, float:1.263E-42)
            r1.setCustomAttribute(r2, r0, r3)
            return
    }

    public float centerX() {
            r3 = this;
            int r0 = r3.left
            float r1 = (float) r0
            int r2 = r3.right
            int r2 = r2 - r0
            float r0 = (float) r2
            r2 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r2
            float r1 = r1 + r0
            return r1
    }

    public float centerY() {
            r3 = this;
            int r0 = r3.top
            float r1 = (float) r0
            int r2 = r3.bottom
            int r2 = r2 - r0
            float r0 = (float) r2
            r2 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r2
            float r1 = r1 + r0
            return r1
    }

    public androidx.constraintlayout.core.motion.CustomVariable getCustomAttribute(java.lang.String r2) {
            r1 = this;
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r0 = r1.mCustom
            java.lang.Object r2 = r0.get(r2)
            androidx.constraintlayout.core.motion.CustomVariable r2 = (androidx.constraintlayout.core.motion.CustomVariable) r2
            return r2
    }

    public java.util.Set<java.lang.String> getCustomAttributeNames() {
            r1 = this;
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r0 = r1.mCustom
            java.util.Set r0 = r0.keySet()
            return r0
    }

    public int getCustomColor(java.lang.String r2) {
            r1 = this;
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r0 = r1.mCustom
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L15
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r0 = r1.mCustom
            java.lang.Object r2 = r0.get(r2)
            androidx.constraintlayout.core.motion.CustomVariable r2 = (androidx.constraintlayout.core.motion.CustomVariable) r2
            int r2 = r2.getColorValue()
            return r2
        L15:
            r2 = -21880(0xffffffffffffaa88, float:NaN)
            return r2
    }

    public float getCustomFloat(java.lang.String r2) {
            r1 = this;
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r0 = r1.mCustom
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L15
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r0 = r1.mCustom
            java.lang.Object r2 = r0.get(r2)
            androidx.constraintlayout.core.motion.CustomVariable r2 = (androidx.constraintlayout.core.motion.CustomVariable) r2
            float r2 = r2.getFloatValue()
            return r2
        L15:
            r2 = 2143289344(0x7fc00000, float:NaN)
            return r2
    }

    public java.lang.String getId() {
            r1 = this;
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r1.widget
            if (r0 != 0) goto L7
            java.lang.String r0 = "unknown"
            return r0
        L7:
            java.lang.String r0 = r0.stringId
            return r0
    }

    public int height() {
            r2 = this;
            int r0 = r2.bottom
            int r1 = r2.top
            int r0 = r0 - r1
            r1 = 0
            int r0 = java.lang.Math.max(r1, r0)
            return r0
    }

    public boolean isDefaultTransform() {
            r1 = this;
            float r0 = r1.rotationX
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 == 0) goto L4a
            float r0 = r1.rotationY
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 == 0) goto L4a
            float r0 = r1.rotationZ
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 == 0) goto L4a
            float r0 = r1.translationX
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 == 0) goto L4a
            float r0 = r1.translationY
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 == 0) goto L4a
            float r0 = r1.translationZ
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 == 0) goto L4a
            float r0 = r1.scaleX
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 == 0) goto L4a
            float r0 = r1.scaleY
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 == 0) goto L4a
            float r0 = r1.alpha
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 == 0) goto L4a
            r0 = 1
            goto L4b
        L4a:
            r0 = 0
        L4b:
            return r0
    }

    void logv(java.lang.String r5) {
            r4 = this;
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            r1 = 1
            r0 = r0[r1]
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = ".("
            r1.<init>(r2)
            java.lang.String r2 = r0.getFileName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ":"
            java.lang.StringBuilder r1 = r1.append(r2)
            int r2 = r0.getLineNumber()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ") "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r0 = r0.getMethodName()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = " "
            java.lang.StringBuilder r0 = r0.append(r1)
            int r2 = r4.hashCode()
            int r2 = r2 % 1000
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r4.widget
            if (r2 == 0) goto L7c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r2 = "/"
            java.lang.StringBuilder r0 = r0.append(r2)
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r4.widget
            int r2 = r2.hashCode()
            int r2 = r2 % 1000
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            goto L8f
        L7c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r2 = "/NULL"
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
        L8f:
            java.io.PrintStream r2 = java.lang.System.out
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r5 = r0.append(r5)
            java.lang.String r5 = r5.toString()
            r2.println(r5)
            return
    }

    void parseCustom(androidx.constraintlayout.core.parser.CLElement r7) throws androidx.constraintlayout.core.parser.CLParsingException {
            r6 = this;
            androidx.constraintlayout.core.parser.CLObject r7 = (androidx.constraintlayout.core.parser.CLObject) r7
            int r0 = r7.size()
            r1 = 0
        L7:
            if (r1 >= r0) goto L55
            androidx.constraintlayout.core.parser.CLElement r2 = r7.get(r1)
            androidx.constraintlayout.core.parser.CLKey r2 = (androidx.constraintlayout.core.parser.CLKey) r2
            r2.content()
            androidx.constraintlayout.core.parser.CLElement r3 = r2.getValue()
            java.lang.String r4 = r3.content()
            java.lang.String r5 = "#[0-9a-fA-F]+"
            boolean r5 = r4.matches(r5)
            if (r5 == 0) goto L37
            r3 = 1
            java.lang.String r3 = r4.substring(r3)
            r4 = 16
            int r3 = java.lang.Integer.parseInt(r3, r4)
            java.lang.String r2 = r2.content()
            r4 = 902(0x386, float:1.264E-42)
            r6.setCustomAttribute(r2, r4, r3)
            goto L52
        L37:
            boolean r5 = r3 instanceof androidx.constraintlayout.core.parser.CLNumber
            if (r5 == 0) goto L49
            java.lang.String r2 = r2.content()
            r4 = 901(0x385, float:1.263E-42)
            float r3 = r3.getFloat()
            r6.setCustomAttribute(r2, r4, r3)
            goto L52
        L49:
            java.lang.String r2 = r2.content()
            r3 = 903(0x387, float:1.265E-42)
            r6.setCustomAttribute(r2, r3, r4)
        L52:
            int r1 = r1 + 1
            goto L7
        L55:
            return
    }

    void printCustomAttributes() {
            r6 = this;
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            r1 = 1
            r0 = r0[r1]
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = ".("
            r1.<init>(r2)
            java.lang.String r2 = r0.getFileName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ":"
            java.lang.StringBuilder r1 = r1.append(r2)
            int r2 = r0.getLineNumber()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ") "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r0 = r0.getMethodName()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = " "
            java.lang.StringBuilder r0 = r0.append(r1)
            int r2 = r6.hashCode()
            int r2 = r2 % 1000
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r6.widget
            if (r2 == 0) goto L80
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r2 = "/"
            java.lang.StringBuilder r0 = r0.append(r2)
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r6.widget
            int r2 = r2.hashCode()
            int r2 = r2 % 1000
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L93
        L80:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = "/NULL "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
        L93:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r1 = r6.mCustom
            if (r1 == 0) goto Lce
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
        L9f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lce
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.io.PrintStream r3 = java.lang.System.out
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.StringBuilder r4 = r4.append(r0)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r5 = r6.mCustom
            java.lang.Object r2 = r5.get(r2)
            androidx.constraintlayout.core.motion.CustomVariable r2 = (androidx.constraintlayout.core.motion.CustomVariable) r2
            java.lang.String r2 = r2.toString()
            java.lang.StringBuilder r2 = r4.append(r2)
            java.lang.String r2 = r2.toString()
            r3.println(r2)
            goto L9f
        Lce:
            return
    }

    public java.lang.StringBuilder serialize(java.lang.StringBuilder r2) {
            r1 = this;
            r0 = 0
            java.lang.StringBuilder r2 = r1.serialize(r2, r0)
            return r2
    }

    public java.lang.StringBuilder serialize(java.lang.StringBuilder r7, boolean r8) {
            r6 = this;
            java.lang.String r0 = "{\n"
            r7.append(r0)
            java.lang.String r0 = "left"
            int r1 = r6.left
            add(r7, r0, r1)
            java.lang.String r0 = "top"
            int r1 = r6.top
            add(r7, r0, r1)
            java.lang.String r0 = "right"
            int r1 = r6.right
            add(r7, r0, r1)
            java.lang.String r0 = "bottom"
            int r1 = r6.bottom
            add(r7, r0, r1)
            java.lang.String r0 = "pivotX"
            float r1 = r6.pivotX
            add(r7, r0, r1)
            java.lang.String r0 = "pivotY"
            float r1 = r6.pivotY
            add(r7, r0, r1)
            java.lang.String r0 = "rotationX"
            float r1 = r6.rotationX
            add(r7, r0, r1)
            java.lang.String r0 = "rotationY"
            float r1 = r6.rotationY
            add(r7, r0, r1)
            java.lang.String r0 = "rotationZ"
            float r1 = r6.rotationZ
            add(r7, r0, r1)
            java.lang.String r0 = "translationX"
            float r1 = r6.translationX
            add(r7, r0, r1)
            java.lang.String r0 = "translationY"
            float r1 = r6.translationY
            add(r7, r0, r1)
            java.lang.String r0 = "translationZ"
            float r1 = r6.translationZ
            add(r7, r0, r1)
            java.lang.String r0 = "scaleX"
            float r1 = r6.scaleX
            add(r7, r0, r1)
            java.lang.String r0 = "scaleY"
            float r1 = r6.scaleY
            add(r7, r0, r1)
            java.lang.String r0 = "alpha"
            float r1 = r6.alpha
            add(r7, r0, r1)
            java.lang.String r0 = "visibility"
            int r1 = r6.visibility
            add(r7, r0, r1)
            java.lang.String r0 = "interpolatedPos"
            float r1 = r6.interpolatedPos
            add(r7, r0, r1)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r6.widget
            if (r0 == 0) goto L90
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type[] r0 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.values()
            int r1 = r0.length
            r2 = 0
        L86:
            if (r2 >= r1) goto L90
            r3 = r0[r2]
            r6.serializeAnchor(r7, r3)
            int r2 = r2 + 1
            goto L86
        L90:
            java.lang.String r0 = "phone_orientation"
            if (r8 == 0) goto L99
            float r1 = androidx.constraintlayout.core.state.WidgetFrame.phone_orientation
            add(r7, r0, r1)
        L99:
            if (r8 == 0) goto La0
            float r8 = androidx.constraintlayout.core.state.WidgetFrame.phone_orientation
            add(r7, r0, r8)
        La0:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r8 = r6.mCustom
            int r8 = r8.size()
            java.lang.String r0 = "}\n"
            if (r8 == 0) goto L12a
            java.lang.String r8 = "custom : {\n"
            r7.append(r8)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r8 = r6.mCustom
            java.util.Set r8 = r8.keySet()
            java.util.Iterator r8 = r8.iterator()
        Lb9:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L127
            java.lang.Object r1 = r8.next()
            java.lang.String r1 = (java.lang.String) r1
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r2 = r6.mCustom
            java.lang.Object r2 = r2.get(r1)
            androidx.constraintlayout.core.motion.CustomVariable r2 = (androidx.constraintlayout.core.motion.CustomVariable) r2
            r7.append(r1)
            java.lang.String r1 = ": "
            r7.append(r1)
            int r1 = r2.getType()
            java.lang.String r3 = ",\n"
            java.lang.String r4 = "',\n"
            java.lang.String r5 = "'"
            switch(r1) {
                case 900: goto L11c;
                case 901: goto L111;
                case 902: goto Lff;
                case 903: goto Lf1;
                case 904: goto Le3;
                case 905: goto L111;
                default: goto Le2;
            }
        Le2:
            goto Lb9
        Le3:
            r7.append(r5)
            boolean r1 = r2.getBooleanValue()
            r7.append(r1)
            r7.append(r4)
            goto Lb9
        Lf1:
            r7.append(r5)
            java.lang.String r1 = r2.getStringValue()
            r7.append(r1)
            r7.append(r4)
            goto Lb9
        Lff:
            r7.append(r5)
            int r1 = r2.getIntegerValue()
            java.lang.String r1 = androidx.constraintlayout.core.motion.CustomVariable.colorString(r1)
            r7.append(r1)
            r7.append(r4)
            goto Lb9
        L111:
            float r1 = r2.getFloatValue()
            r7.append(r1)
            r7.append(r3)
            goto Lb9
        L11c:
            int r1 = r2.getIntegerValue()
            r7.append(r1)
            r7.append(r3)
            goto Lb9
        L127:
            r7.append(r0)
        L12a:
            r7.append(r0)
            return r7
    }

    public void setCustomAttribute(java.lang.String r3, int r4, float r5) {
            r2 = this;
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r0 = r2.mCustom
            boolean r0 = r0.containsKey(r3)
            if (r0 == 0) goto L14
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r4 = r2.mCustom
            java.lang.Object r3 = r4.get(r3)
            androidx.constraintlayout.core.motion.CustomVariable r3 = (androidx.constraintlayout.core.motion.CustomVariable) r3
            r3.setFloatValue(r5)
            goto L1e
        L14:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r0 = r2.mCustom
            androidx.constraintlayout.core.motion.CustomVariable r1 = new androidx.constraintlayout.core.motion.CustomVariable
            r1.<init>(r3, r4, r5)
            r0.put(r3, r1)
        L1e:
            return
    }

    public void setCustomAttribute(java.lang.String r3, int r4, int r5) {
            r2 = this;
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r0 = r2.mCustom
            boolean r0 = r0.containsKey(r3)
            if (r0 == 0) goto L14
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r4 = r2.mCustom
            java.lang.Object r3 = r4.get(r3)
            androidx.constraintlayout.core.motion.CustomVariable r3 = (androidx.constraintlayout.core.motion.CustomVariable) r3
            r3.setIntValue(r5)
            goto L1e
        L14:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r0 = r2.mCustom
            androidx.constraintlayout.core.motion.CustomVariable r1 = new androidx.constraintlayout.core.motion.CustomVariable
            r1.<init>(r3, r4, r5)
            r0.put(r3, r1)
        L1e:
            return
    }

    public void setCustomAttribute(java.lang.String r3, int r4, java.lang.String r5) {
            r2 = this;
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r0 = r2.mCustom
            boolean r0 = r0.containsKey(r3)
            if (r0 == 0) goto L14
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r4 = r2.mCustom
            java.lang.Object r3 = r4.get(r3)
            androidx.constraintlayout.core.motion.CustomVariable r3 = (androidx.constraintlayout.core.motion.CustomVariable) r3
            r3.setStringValue(r5)
            goto L1e
        L14:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r0 = r2.mCustom
            androidx.constraintlayout.core.motion.CustomVariable r1 = new androidx.constraintlayout.core.motion.CustomVariable
            r1.<init>(r3, r4, r5)
            r0.put(r3, r1)
        L1e:
            return
    }

    public void setCustomAttribute(java.lang.String r3, int r4, boolean r5) {
            r2 = this;
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r0 = r2.mCustom
            boolean r0 = r0.containsKey(r3)
            if (r0 == 0) goto L14
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r4 = r2.mCustom
            java.lang.Object r3 = r4.get(r3)
            androidx.constraintlayout.core.motion.CustomVariable r3 = (androidx.constraintlayout.core.motion.CustomVariable) r3
            r3.setBooleanValue(r5)
            goto L1e
        L14:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r0 = r2.mCustom
            androidx.constraintlayout.core.motion.CustomVariable r1 = new androidx.constraintlayout.core.motion.CustomVariable
            r1.<init>(r3, r4, r5)
            r0.put(r3, r1)
        L1e:
            return
    }

    public void setCustomValue(androidx.constraintlayout.core.motion.CustomAttribute r1, float[] r2) {
            r0 = this;
            return
    }

    public boolean setValue(java.lang.String r5, androidx.constraintlayout.core.parser.CLElement r6) throws androidx.constraintlayout.core.parser.CLParsingException {
            r4 = this;
            r5.hashCode()
            int r0 = r5.hashCode()
            r1 = 1
            r2 = 0
            r3 = -1
            switch(r0) {
                case -1881940865: goto Le8;
                case -1383228885: goto Ldd;
                case -1349088399: goto Ld2;
                case -1249320806: goto Lc7;
                case -1249320805: goto Lbc;
                case -1249320804: goto Lb1;
                case -1225497657: goto La6;
                case -1225497656: goto L9b;
                case -1225497655: goto L8d;
                case -987906986: goto L7f;
                case -987906985: goto L71;
                case -908189618: goto L63;
                case -908189617: goto L55;
                case 115029: goto L47;
                case 3317767: goto L39;
                case 92909918: goto L2b;
                case 108511772: goto L1d;
                case 642850769: goto Lf;
                default: goto Ld;
            }
        Ld:
            goto Lf2
        Lf:
            java.lang.String r0 = "interpolatedPos"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L19
            goto Lf2
        L19:
            r3 = 17
            goto Lf2
        L1d:
            java.lang.String r0 = "right"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L27
            goto Lf2
        L27:
            r3 = 16
            goto Lf2
        L2b:
            java.lang.String r0 = "alpha"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L35
            goto Lf2
        L35:
            r3 = 15
            goto Lf2
        L39:
            java.lang.String r0 = "left"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L43
            goto Lf2
        L43:
            r3 = 14
            goto Lf2
        L47:
            java.lang.String r0 = "top"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L51
            goto Lf2
        L51:
            r3 = 13
            goto Lf2
        L55:
            java.lang.String r0 = "scaleY"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L5f
            goto Lf2
        L5f:
            r3 = 12
            goto Lf2
        L63:
            java.lang.String r0 = "scaleX"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L6d
            goto Lf2
        L6d:
            r3 = 11
            goto Lf2
        L71:
            java.lang.String r0 = "pivotY"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L7b
            goto Lf2
        L7b:
            r3 = 10
            goto Lf2
        L7f:
            java.lang.String r0 = "pivotX"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L89
            goto Lf2
        L89:
            r3 = 9
            goto Lf2
        L8d:
            java.lang.String r0 = "translationZ"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L97
            goto Lf2
        L97:
            r3 = 8
            goto Lf2
        L9b:
            java.lang.String r0 = "translationY"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto La4
            goto Lf2
        La4:
            r3 = 7
            goto Lf2
        La6:
            java.lang.String r0 = "translationX"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto Laf
            goto Lf2
        Laf:
            r3 = 6
            goto Lf2
        Lb1:
            java.lang.String r0 = "rotationZ"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto Lba
            goto Lf2
        Lba:
            r3 = 5
            goto Lf2
        Lbc:
            java.lang.String r0 = "rotationY"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto Lc5
            goto Lf2
        Lc5:
            r3 = 4
            goto Lf2
        Lc7:
            java.lang.String r0 = "rotationX"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto Ld0
            goto Lf2
        Ld0:
            r3 = 3
            goto Lf2
        Ld2:
            java.lang.String r0 = "custom"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto Ldb
            goto Lf2
        Ldb:
            r3 = 2
            goto Lf2
        Ldd:
            java.lang.String r0 = "bottom"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto Le6
            goto Lf2
        Le6:
            r3 = r1
            goto Lf2
        Le8:
            java.lang.String r0 = "phone_orientation"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto Lf1
            goto Lf2
        Lf1:
            r3 = r2
        Lf2:
            switch(r3) {
                case 0: goto L16d;
                case 1: goto L166;
                case 2: goto L162;
                case 3: goto L15b;
                case 4: goto L154;
                case 5: goto L14d;
                case 6: goto L146;
                case 7: goto L13f;
                case 8: goto L138;
                case 9: goto L131;
                case 10: goto L12a;
                case 11: goto L123;
                case 12: goto L11c;
                case 13: goto L115;
                case 14: goto L10e;
                case 15: goto L106;
                case 16: goto Lfe;
                case 17: goto Lf6;
                default: goto Lf5;
            }
        Lf5:
            return r2
        Lf6:
            float r5 = r6.getFloat()
            r4.interpolatedPos = r5
            goto L173
        Lfe:
            int r5 = r6.getInt()
            r4.right = r5
            goto L173
        L106:
            float r5 = r6.getFloat()
            r4.alpha = r5
            goto L173
        L10e:
            int r5 = r6.getInt()
            r4.left = r5
            goto L173
        L115:
            int r5 = r6.getInt()
            r4.top = r5
            goto L173
        L11c:
            float r5 = r6.getFloat()
            r4.scaleY = r5
            goto L173
        L123:
            float r5 = r6.getFloat()
            r4.scaleX = r5
            goto L173
        L12a:
            float r5 = r6.getFloat()
            r4.pivotY = r5
            goto L173
        L131:
            float r5 = r6.getFloat()
            r4.pivotX = r5
            goto L173
        L138:
            float r5 = r6.getFloat()
            r4.translationZ = r5
            goto L173
        L13f:
            float r5 = r6.getFloat()
            r4.translationY = r5
            goto L173
        L146:
            float r5 = r6.getFloat()
            r4.translationX = r5
            goto L173
        L14d:
            float r5 = r6.getFloat()
            r4.rotationZ = r5
            goto L173
        L154:
            float r5 = r6.getFloat()
            r4.rotationY = r5
            goto L173
        L15b:
            float r5 = r6.getFloat()
            r4.rotationX = r5
            goto L173
        L162:
            r4.parseCustom(r6)
            goto L173
        L166:
            int r5 = r6.getInt()
            r4.bottom = r5
            goto L173
        L16d:
            float r5 = r6.getFloat()
            androidx.constraintlayout.core.state.WidgetFrame.phone_orientation = r5
        L173:
            return r1
    }

    public androidx.constraintlayout.core.state.WidgetFrame update() {
            r1 = this;
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r1.widget
            if (r0 == 0) goto L29
            int r0 = r0.getLeft()
            r1.left = r0
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r1.widget
            int r0 = r0.getTop()
            r1.top = r0
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r1.widget
            int r0 = r0.getRight()
            r1.right = r0
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r1.widget
            int r0 = r0.getBottom()
            r1.bottom = r0
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r1.widget
            androidx.constraintlayout.core.state.WidgetFrame r0 = r0.frame
            r1.updateAttributes(r0)
        L29:
            return r1
    }

    public androidx.constraintlayout.core.state.WidgetFrame update(androidx.constraintlayout.core.widgets.ConstraintWidget r1) {
            r0 = this;
            if (r1 != 0) goto L3
            return r0
        L3:
            r0.widget = r1
            r0.update()
            return r0
    }

    public void updateAttributes(androidx.constraintlayout.core.state.WidgetFrame r4) {
            r3 = this;
            float r0 = r4.pivotX
            r3.pivotX = r0
            float r0 = r4.pivotY
            r3.pivotY = r0
            float r0 = r4.rotationX
            r3.rotationX = r0
            float r0 = r4.rotationY
            r3.rotationY = r0
            float r0 = r4.rotationZ
            r3.rotationZ = r0
            float r0 = r4.translationX
            r3.translationX = r0
            float r0 = r4.translationY
            r3.translationY = r0
            float r0 = r4.translationZ
            r3.translationZ = r0
            float r0 = r4.scaleX
            r3.scaleX = r0
            float r0 = r4.scaleY
            r3.scaleY = r0
            float r0 = r4.alpha
            r3.alpha = r0
            int r0 = r4.visibility
            r3.visibility = r0
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r0 = r3.mCustom
            r0.clear()
            if (r4 == 0) goto L5b
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r4 = r4.mCustom
            java.util.Collection r4 = r4.values()
            java.util.Iterator r4 = r4.iterator()
        L41:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L5b
            java.lang.Object r0 = r4.next()
            androidx.constraintlayout.core.motion.CustomVariable r0 = (androidx.constraintlayout.core.motion.CustomVariable) r0
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r1 = r3.mCustom
            java.lang.String r2 = r0.getName()
            androidx.constraintlayout.core.motion.CustomVariable r0 = r0.copy()
            r1.put(r2, r0)
            goto L41
        L5b:
            return
    }

    public int width() {
            r2 = this;
            int r0 = r2.right
            int r1 = r2.left
            int r0 = r0 - r1
            r1 = 0
            int r0 = java.lang.Math.max(r1, r0)
            return r0
    }
}
