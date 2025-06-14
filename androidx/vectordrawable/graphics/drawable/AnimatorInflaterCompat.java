package androidx.vectordrawable.graphics.drawable;

/* loaded from: classes.dex */
public class AnimatorInflaterCompat {
    private static final boolean DBG_ANIMATOR_INFLATER = false;
    private static final int MAX_NUM_POINTS = 100;
    private static final java.lang.String TAG = "AnimatorInflater";
    private static final int TOGETHER = 0;
    private static final int VALUE_TYPE_COLOR = 3;
    private static final int VALUE_TYPE_FLOAT = 0;
    private static final int VALUE_TYPE_INT = 1;
    private static final int VALUE_TYPE_PATH = 2;
    private static final int VALUE_TYPE_UNDEFINED = 4;

    private static class PathDataEvaluator implements android.animation.TypeEvaluator<androidx.core.graphics.PathParser.PathDataNode[]> {
        private androidx.core.graphics.PathParser.PathDataNode[] mNodeArray;

        PathDataEvaluator() {
                r0 = this;
                r0.<init>()
                return
        }

        PathDataEvaluator(androidx.core.graphics.PathParser.PathDataNode[] r1) {
                r0 = this;
                r0.<init>()
                r0.mNodeArray = r1
                return
        }

        @Override // android.animation.TypeEvaluator
        public /* bridge */ /* synthetic */ androidx.core.graphics.PathParser.PathDataNode[] evaluate(float r1, androidx.core.graphics.PathParser.PathDataNode[] r2, androidx.core.graphics.PathParser.PathDataNode[] r3) {
                r0 = this;
                androidx.core.graphics.PathParser$PathDataNode[] r2 = (androidx.core.graphics.PathParser.PathDataNode[]) r2
                androidx.core.graphics.PathParser$PathDataNode[] r3 = (androidx.core.graphics.PathParser.PathDataNode[]) r3
                androidx.core.graphics.PathParser$PathDataNode[] r1 = r0.evaluate2(r1, r2, r3)
                return r1
        }

        /* renamed from: evaluate, reason: avoid collision after fix types in other method */
        public androidx.core.graphics.PathParser.PathDataNode[] evaluate2(float r5, androidx.core.graphics.PathParser.PathDataNode[] r6, androidx.core.graphics.PathParser.PathDataNode[] r7) {
                r4 = this;
                boolean r0 = androidx.core.graphics.PathParser.canMorph(r6, r7)
                if (r0 == 0) goto L29
                androidx.core.graphics.PathParser$PathDataNode[] r0 = r4.mNodeArray
                boolean r0 = androidx.core.graphics.PathParser.canMorph(r0, r6)
                if (r0 != 0) goto L14
                androidx.core.graphics.PathParser$PathDataNode[] r0 = androidx.core.graphics.PathParser.deepCopyNodes(r6)
                r4.mNodeArray = r0
            L14:
                r0 = 0
            L15:
                int r1 = r6.length
                if (r0 >= r1) goto L26
                androidx.core.graphics.PathParser$PathDataNode[] r1 = r4.mNodeArray
                r1 = r1[r0]
                r2 = r6[r0]
                r3 = r7[r0]
                r1.interpolatePathDataNode(r2, r3, r5)
                int r0 = r0 + 1
                goto L15
            L26:
                androidx.core.graphics.PathParser$PathDataNode[] r5 = r4.mNodeArray
                return r5
            L29:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.String r6 = "Can't interpolate between two incompatible pathData"
                r5.<init>(r6)
                throw r5
        }
    }

    private AnimatorInflaterCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    private static android.animation.Animator createAnimatorFromXml(android.content.Context r8, android.content.res.Resources r9, android.content.res.Resources.Theme r10, org.xmlpull.v1.XmlPullParser r11, float r12) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            android.util.AttributeSet r4 = android.util.Xml.asAttributeSet(r11)
            r5 = 0
            r6 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r7 = r12
            android.animation.Animator r8 = createAnimatorFromXml(r0, r1, r2, r3, r4, r5, r6, r7)
            return r8
    }

    private static android.animation.Animator createAnimatorFromXml(android.content.Context r18, android.content.res.Resources r19, android.content.res.Resources.Theme r20, org.xmlpull.v1.XmlPullParser r21, android.util.AttributeSet r22, android.animation.AnimatorSet r23, int r24, float r25) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r8 = r19
            r9 = r20
            r10 = r21
            r11 = r23
            int r12 = r21.getDepth()
            r0 = 0
            r13 = r0
        Le:
            int r1 = r21.next()
            r2 = 3
            r14 = 0
            if (r1 != r2) goto L1c
            int r2 = r21.getDepth()
            if (r2 <= r12) goto Lde
        L1c:
            r2 = 1
            if (r1 == r2) goto Lde
            r3 = 2
            if (r1 == r3) goto L23
            goto Le
        L23:
            java.lang.String r1 = r21.getName()
            java.lang.String r3 = "objectAnimator"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L43
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r22
            r4 = r25
            r5 = r21
            android.animation.ObjectAnimator r0 = loadObjectAnimator(r0, r1, r2, r3, r4, r5)
        L3f:
            r3 = r18
            goto Lb5
        L43:
            java.lang.String r3 = "animator"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L5d
            r4 = 0
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r22
            r5 = r25
            r6 = r21
            android.animation.ValueAnimator r0 = loadAnimator(r0, r1, r2, r3, r4, r5, r6)
            goto L3f
        L5d:
            java.lang.String r3 = "set"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L96
            android.animation.AnimatorSet r15 = new android.animation.AnimatorSet
            r15.<init>()
            int[] r0 = androidx.vectordrawable.graphics.drawable.AndroidResources.STYLEABLE_ANIMATOR_SET
            r7 = r22
            android.content.res.TypedArray r6 = androidx.core.content.res.TypedArrayUtils.obtainAttributes(r8, r9, r7, r0)
            java.lang.String r0 = "ordering"
            int r16 = androidx.core.content.res.TypedArrayUtils.getNamedInt(r6, r10, r0, r14, r14)
            r0 = r15
            android.animation.AnimatorSet r0 = (android.animation.AnimatorSet) r0
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            r5 = r15
            r17 = r6
            r6 = r16
            r7 = r25
            createAnimatorFromXml(r0, r1, r2, r3, r4, r5, r6, r7)
            r17.recycle()
            r3 = r18
            r0 = r15
            goto Lb5
        L96:
            java.lang.String r3 = "propertyValuesHolder"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto Lc5
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r21)
            r3 = r18
            android.animation.PropertyValuesHolder[] r1 = loadValues(r3, r8, r9, r10, r1)
            if (r1 == 0) goto Lb4
            boolean r4 = r0 instanceof android.animation.ValueAnimator
            if (r4 == 0) goto Lb4
            r4 = r0
            android.animation.ValueAnimator r4 = (android.animation.ValueAnimator) r4
            r4.setValues(r1)
        Lb4:
            r14 = r2
        Lb5:
            if (r11 == 0) goto Le
            if (r14 != 0) goto Le
            if (r13 != 0) goto Lc0
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
        Lc0:
            r13.add(r0)
            goto Le
        Lc5:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unknown animator name: "
            r1.<init>(r2)
            java.lang.String r2 = r21.getName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        Lde:
            if (r11 == 0) goto L107
            if (r13 == 0) goto L107
            int r1 = r13.size()
            android.animation.Animator[] r1 = new android.animation.Animator[r1]
            java.util.Iterator r2 = r13.iterator()
        Lec:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Lfe
            java.lang.Object r3 = r2.next()
            android.animation.Animator r3 = (android.animation.Animator) r3
            int r4 = r14 + 1
            r1[r14] = r3
            r14 = r4
            goto Lec
        Lfe:
            if (r24 != 0) goto L104
            r11.playTogether(r1)
            goto L107
        L104:
            r11.playSequentially(r1)
        L107:
            return r0
    }

    private static android.animation.Keyframe createNewKeyframe(android.animation.Keyframe r2, float r3) {
            java.lang.Class r0 = r2.getType()
            java.lang.Class r1 = java.lang.Float.TYPE
            if (r0 != r1) goto Ld
            android.animation.Keyframe r2 = android.animation.Keyframe.ofFloat(r3)
            goto L1e
        Ld:
            java.lang.Class r2 = r2.getType()
            java.lang.Class r0 = java.lang.Integer.TYPE
            if (r2 != r0) goto L1a
            android.animation.Keyframe r2 = android.animation.Keyframe.ofInt(r3)
            goto L1e
        L1a:
            android.animation.Keyframe r2 = android.animation.Keyframe.ofObject(r3)
        L1e:
            return r2
    }

    private static void distributeKeyframes(android.animation.Keyframe[] r2, float r3, int r4, int r5) {
            int r0 = r5 - r4
            int r0 = r0 + 2
            float r0 = (float) r0
            float r3 = r3 / r0
        L6:
            if (r4 > r5) goto L19
            r0 = r2[r4]
            int r1 = r4 + (-1)
            r1 = r2[r1]
            float r1 = r1.getFraction()
            float r1 = r1 + r3
            r0.setFraction(r1)
            int r4 = r4 + 1
            goto L6
        L19:
            return
    }

    private static void dumpKeyframes(java.lang.Object[] r6, java.lang.String r7) {
            if (r6 == 0) goto L5b
            int r0 = r6.length
            if (r0 != 0) goto L6
            goto L5b
        L6:
            java.lang.String r0 = "AnimatorInflater"
            android.util.Log.d(r0, r7)
            int r7 = r6.length
            r1 = 0
        Ld:
            if (r1 >= r7) goto L5b
            r2 = r6[r1]
            android.animation.Keyframe r2 = (android.animation.Keyframe) r2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Keyframe "
            r3.<init>(r4)
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.String r4 = ": fraction "
            java.lang.StringBuilder r3 = r3.append(r4)
            float r4 = r2.getFraction()
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            java.lang.String r5 = "null"
            if (r4 >= 0) goto L31
            r4 = r5
            goto L39
        L31:
            float r4 = r2.getFraction()
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
        L39:
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = ", , value : "
            java.lang.StringBuilder r3 = r3.append(r4)
            boolean r4 = r2.hasValue()
            if (r4 == 0) goto L4d
            java.lang.Object r5 = r2.getValue()
        L4d:
            java.lang.StringBuilder r2 = r3.append(r5)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r0, r2)
            int r1 = r1 + 1
            goto Ld
        L5b:
            return
    }

    private static android.animation.PropertyValuesHolder getPVH(android.content.res.TypedArray r11, int r12, int r13, int r14, java.lang.String r15) {
            android.util.TypedValue r0 = r11.peekValue(r13)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto La
            r3 = r1
            goto Lb
        La:
            r3 = r2
        Lb:
            if (r3 == 0) goto L10
            int r0 = r0.type
            goto L11
        L10:
            r0 = r2
        L11:
            android.util.TypedValue r4 = r11.peekValue(r14)
            if (r4 == 0) goto L19
            r5 = r1
            goto L1a
        L19:
            r5 = r2
        L1a:
            if (r5 == 0) goto L1f
            int r4 = r4.type
            goto L20
        L1f:
            r4 = r2
        L20:
            r6 = 4
            r7 = 3
            if (r12 != r6) goto L37
            if (r3 == 0) goto L2c
            boolean r12 = isColorType(r0)
            if (r12 != 0) goto L34
        L2c:
            if (r5 == 0) goto L36
            boolean r12 = isColorType(r4)
            if (r12 == 0) goto L36
        L34:
            r12 = r7
            goto L37
        L36:
            r12 = r2
        L37:
            if (r12 != 0) goto L3b
            r6 = r1
            goto L3c
        L3b:
            r6 = r2
        L3c:
            r8 = 0
            r9 = 2
            if (r12 != r9) goto La9
            java.lang.String r12 = r11.getString(r13)
            java.lang.String r11 = r11.getString(r14)
            androidx.core.graphics.PathParser$PathDataNode[] r13 = androidx.core.graphics.PathParser.createNodesFromPathData(r12)
            androidx.core.graphics.PathParser$PathDataNode[] r14 = androidx.core.graphics.PathParser.createNodesFromPathData(r11)
            if (r13 != 0) goto L54
            if (r14 == 0) goto L167
        L54:
            if (r13 == 0) goto L98
            androidx.vectordrawable.graphics.drawable.AnimatorInflaterCompat$PathDataEvaluator r0 = new androidx.vectordrawable.graphics.drawable.AnimatorInflaterCompat$PathDataEvaluator
            r0.<init>()
            if (r14 == 0) goto L8d
            boolean r3 = androidx.core.graphics.PathParser.canMorph(r13, r14)
            if (r3 == 0) goto L6e
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r2] = r13
            r11[r1] = r14
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofObject(r15, r0, r11)
            goto L95
        L6e:
            android.view.InflateException r13 = new android.view.InflateException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r15 = " Can't morph from "
            r14.<init>(r15)
            java.lang.StringBuilder r12 = r14.append(r12)
            java.lang.String r14 = " to "
            java.lang.StringBuilder r12 = r12.append(r14)
            java.lang.StringBuilder r11 = r12.append(r11)
            java.lang.String r11 = r11.toString()
            r13.<init>(r11)
            throw r13
        L8d:
            java.lang.Object[] r11 = new java.lang.Object[r1]
            r11[r2] = r13
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofObject(r15, r0, r11)
        L95:
            r8 = r11
            goto L167
        L98:
            if (r14 == 0) goto L167
            androidx.vectordrawable.graphics.drawable.AnimatorInflaterCompat$PathDataEvaluator r11 = new androidx.vectordrawable.graphics.drawable.AnimatorInflaterCompat$PathDataEvaluator
            r11.<init>()
            java.lang.Object[] r12 = new java.lang.Object[r1]
            r12[r2] = r14
            android.animation.PropertyValuesHolder r8 = android.animation.PropertyValuesHolder.ofObject(r15, r11, r12)
            goto L167
        La9:
            if (r12 != r7) goto Lb0
            androidx.vectordrawable.graphics.drawable.ArgbEvaluator r12 = androidx.vectordrawable.graphics.drawable.ArgbEvaluator.getInstance()
            goto Lb1
        Lb0:
            r12 = r8
        Lb1:
            r7 = 5
            r10 = 0
            if (r6 == 0) goto Lf9
            if (r3 == 0) goto Le3
            if (r0 != r7) goto Lbe
            float r13 = r11.getDimension(r13, r10)
            goto Lc2
        Lbe:
            float r13 = r11.getFloat(r13, r10)
        Lc2:
            if (r5 == 0) goto Lda
            if (r4 != r7) goto Lcb
            float r11 = r11.getDimension(r14, r10)
            goto Lcf
        Lcb:
            float r11 = r11.getFloat(r14, r10)
        Lcf:
            float[] r14 = new float[r9]
            r14[r2] = r13
            r14[r1] = r11
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofFloat(r15, r14)
            goto Lf6
        Lda:
            float[] r11 = new float[r1]
            r11[r2] = r13
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofFloat(r15, r11)
            goto Lf6
        Le3:
            if (r4 != r7) goto Lea
            float r11 = r11.getDimension(r14, r10)
            goto Lee
        Lea:
            float r11 = r11.getFloat(r14, r10)
        Lee:
            float[] r13 = new float[r1]
            r13[r2] = r11
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofFloat(r15, r13)
        Lf6:
            r8 = r11
            goto L160
        Lf9:
            if (r3 == 0) goto L13f
            if (r0 != r7) goto L103
            float r13 = r11.getDimension(r13, r10)
            int r13 = (int) r13
            goto L112
        L103:
            boolean r0 = isColorType(r0)
            if (r0 == 0) goto L10e
            int r13 = r11.getColor(r13, r2)
            goto L112
        L10e:
            int r13 = r11.getInt(r13, r2)
        L112:
            if (r5 == 0) goto L136
            if (r4 != r7) goto L11c
            float r11 = r11.getDimension(r14, r10)
            int r11 = (int) r11
            goto L12b
        L11c:
            boolean r0 = isColorType(r4)
            if (r0 == 0) goto L127
            int r11 = r11.getColor(r14, r2)
            goto L12b
        L127:
            int r11 = r11.getInt(r14, r2)
        L12b:
            int[] r14 = new int[r9]
            r14[r2] = r13
            r14[r1] = r11
            android.animation.PropertyValuesHolder r8 = android.animation.PropertyValuesHolder.ofInt(r15, r14)
            goto L160
        L136:
            int[] r11 = new int[r1]
            r11[r2] = r13
            android.animation.PropertyValuesHolder r8 = android.animation.PropertyValuesHolder.ofInt(r15, r11)
            goto L160
        L13f:
            if (r5 == 0) goto L160
            if (r4 != r7) goto L149
            float r11 = r11.getDimension(r14, r10)
            int r11 = (int) r11
            goto L158
        L149:
            boolean r13 = isColorType(r4)
            if (r13 == 0) goto L154
            int r11 = r11.getColor(r14, r2)
            goto L158
        L154:
            int r11 = r11.getInt(r14, r2)
        L158:
            int[] r13 = new int[r1]
            r13[r2] = r11
            android.animation.PropertyValuesHolder r8 = android.animation.PropertyValuesHolder.ofInt(r15, r13)
        L160:
            if (r8 == 0) goto L167
            if (r12 == 0) goto L167
            r8.setEvaluator(r12)
        L167:
            return r8
    }

    private static int inferValueTypeFromValues(android.content.res.TypedArray r3, int r4, int r5) {
            android.util.TypedValue r4 = r3.peekValue(r4)
            r0 = 1
            r1 = 0
            if (r4 == 0) goto La
            r2 = r0
            goto Lb
        La:
            r2 = r1
        Lb:
            if (r2 == 0) goto L10
            int r4 = r4.type
            goto L11
        L10:
            r4 = r1
        L11:
            android.util.TypedValue r3 = r3.peekValue(r5)
            if (r3 == 0) goto L18
            goto L19
        L18:
            r0 = r1
        L19:
            if (r0 == 0) goto L1e
            int r3 = r3.type
            goto L1f
        L1e:
            r3 = r1
        L1f:
            if (r2 == 0) goto L27
            boolean r4 = isColorType(r4)
            if (r4 != 0) goto L2f
        L27:
            if (r0 == 0) goto L30
            boolean r3 = isColorType(r3)
            if (r3 == 0) goto L30
        L2f:
            r1 = 3
        L30:
            return r1
    }

    private static int inferValueTypeOfKeyframe(android.content.res.Resources r1, android.content.res.Resources.Theme r2, android.util.AttributeSet r3, org.xmlpull.v1.XmlPullParser r4) {
            int[] r0 = androidx.vectordrawable.graphics.drawable.AndroidResources.STYLEABLE_KEYFRAME
            android.content.res.TypedArray r1 = androidx.core.content.res.TypedArrayUtils.obtainAttributes(r1, r2, r3, r0)
            java.lang.String r2 = "value"
            r3 = 0
            android.util.TypedValue r2 = androidx.core.content.res.TypedArrayUtils.peekNamedValue(r1, r4, r2, r3)
            if (r2 == 0) goto L11
            r4 = 1
            goto L12
        L11:
            r4 = r3
        L12:
            if (r4 == 0) goto L1d
            int r2 = r2.type
            boolean r2 = isColorType(r2)
            if (r2 == 0) goto L1d
            r3 = 3
        L1d:
            r1.recycle()
            return r3
    }

    private static boolean isColorType(int r1) {
            r0 = 28
            if (r1 < r0) goto La
            r0 = 31
            if (r1 > r0) goto La
            r1 = 1
            goto Lb
        La:
            r1 = 0
        Lb:
            return r1
    }

    public static android.animation.Animator loadAnimator(android.content.Context r0, int r1) throws android.content.res.Resources.NotFoundException {
            android.animation.Animator r0 = android.animation.AnimatorInflater.loadAnimator(r0, r1)
            return r0
    }

    public static android.animation.Animator loadAnimator(android.content.Context r1, android.content.res.Resources r2, android.content.res.Resources.Theme r3, int r4) throws android.content.res.Resources.NotFoundException {
            r0 = 1065353216(0x3f800000, float:1.0)
            android.animation.Animator r1 = loadAnimator(r1, r2, r3, r4, r0)
            return r1
    }

    public static android.animation.Animator loadAnimator(android.content.Context r2, android.content.res.Resources r3, android.content.res.Resources.Theme r4, int r5, float r6) throws android.content.res.Resources.NotFoundException {
            java.lang.String r0 = "Can't load animation resource ID #0x"
            r1 = 0
            android.content.res.XmlResourceParser r1 = r3.getAnimation(r5)     // Catch: java.lang.Throwable -> L11 java.io.IOException -> L13 org.xmlpull.v1.XmlPullParserException -> L2e
            android.animation.Animator r2 = createAnimatorFromXml(r2, r3, r4, r1, r6)     // Catch: java.lang.Throwable -> L11 java.io.IOException -> L13 org.xmlpull.v1.XmlPullParserException -> L2e
            if (r1 == 0) goto L10
            r1.close()
        L10:
            return r2
        L11:
            r2 = move-exception
            goto L49
        L13:
            r2 = move-exception
            android.content.res.Resources$NotFoundException r3 = new android.content.res.Resources$NotFoundException     // Catch: java.lang.Throwable -> L11
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L11
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L11
            java.lang.String r5 = java.lang.Integer.toHexString(r5)     // Catch: java.lang.Throwable -> L11
            java.lang.StringBuilder r4 = r4.append(r5)     // Catch: java.lang.Throwable -> L11
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L11
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L11
            r3.initCause(r2)     // Catch: java.lang.Throwable -> L11
            throw r3     // Catch: java.lang.Throwable -> L11
        L2e:
            r2 = move-exception
            android.content.res.Resources$NotFoundException r3 = new android.content.res.Resources$NotFoundException     // Catch: java.lang.Throwable -> L11
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L11
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L11
            java.lang.String r5 = java.lang.Integer.toHexString(r5)     // Catch: java.lang.Throwable -> L11
            java.lang.StringBuilder r4 = r4.append(r5)     // Catch: java.lang.Throwable -> L11
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L11
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L11
            r3.initCause(r2)     // Catch: java.lang.Throwable -> L11
            throw r3     // Catch: java.lang.Throwable -> L11
        L49:
            if (r1 == 0) goto L4e
            r1.close()
        L4e:
            throw r2
    }

    private static android.animation.ValueAnimator loadAnimator(android.content.Context r2, android.content.res.Resources r3, android.content.res.Resources.Theme r4, android.util.AttributeSet r5, android.animation.ValueAnimator r6, float r7, org.xmlpull.v1.XmlPullParser r8) throws android.content.res.Resources.NotFoundException {
            int[] r0 = androidx.vectordrawable.graphics.drawable.AndroidResources.STYLEABLE_ANIMATOR
            android.content.res.TypedArray r0 = androidx.core.content.res.TypedArrayUtils.obtainAttributes(r3, r4, r5, r0)
            int[] r1 = androidx.vectordrawable.graphics.drawable.AndroidResources.STYLEABLE_PROPERTY_ANIMATOR
            android.content.res.TypedArray r3 = androidx.core.content.res.TypedArrayUtils.obtainAttributes(r3, r4, r5, r1)
            if (r6 != 0) goto L13
            android.animation.ValueAnimator r6 = new android.animation.ValueAnimator
            r6.<init>()
        L13:
            parseAnimatorFromTypeArray(r6, r0, r3, r7, r8)
            java.lang.String r4 = "interpolator"
            r5 = 0
            int r4 = androidx.core.content.res.TypedArrayUtils.getNamedResourceId(r0, r8, r4, r5, r5)
            if (r4 <= 0) goto L26
            android.view.animation.Interpolator r2 = androidx.vectordrawable.graphics.drawable.AnimationUtilsCompat.loadInterpolator(r2, r4)
            r6.setInterpolator(r2)
        L26:
            r0.recycle()
            if (r3 == 0) goto L2e
            r3.recycle()
        L2e:
            return r6
    }

    private static android.animation.Keyframe loadKeyframe(android.content.Context r6, android.content.res.Resources r7, android.content.res.Resources.Theme r8, android.util.AttributeSet r9, int r10, org.xmlpull.v1.XmlPullParser r11) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            int[] r0 = androidx.vectordrawable.graphics.drawable.AndroidResources.STYLEABLE_KEYFRAME
            android.content.res.TypedArray r7 = androidx.core.content.res.TypedArrayUtils.obtainAttributes(r7, r8, r9, r0)
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            java.lang.String r9 = "fraction"
            r0 = 3
            float r8 = androidx.core.content.res.TypedArrayUtils.getNamedFloat(r7, r11, r9, r0, r8)
            java.lang.String r9 = "value"
            r1 = 0
            android.util.TypedValue r2 = androidx.core.content.res.TypedArrayUtils.peekNamedValue(r7, r11, r9, r1)
            r3 = 1
            if (r2 == 0) goto L1b
            r4 = r3
            goto L1c
        L1b:
            r4 = r1
        L1c:
            r5 = 4
            if (r10 != r5) goto L2c
            if (r4 == 0) goto L2b
            int r10 = r2.type
            boolean r10 = isColorType(r10)
            if (r10 == 0) goto L2b
            r10 = r0
            goto L2c
        L2b:
            r10 = r1
        L2c:
            if (r4 == 0) goto L49
            if (r10 == 0) goto L3f
            if (r10 == r3) goto L36
            if (r10 == r0) goto L36
            r8 = 0
            goto L54
        L36:
            int r9 = androidx.core.content.res.TypedArrayUtils.getNamedInt(r7, r11, r9, r1, r1)
            android.animation.Keyframe r8 = android.animation.Keyframe.ofInt(r8, r9)
            goto L54
        L3f:
            r10 = 0
            float r9 = androidx.core.content.res.TypedArrayUtils.getNamedFloat(r7, r11, r9, r1, r10)
            android.animation.Keyframe r8 = android.animation.Keyframe.ofFloat(r8, r9)
            goto L54
        L49:
            if (r10 != 0) goto L50
            android.animation.Keyframe r8 = android.animation.Keyframe.ofFloat(r8)
            goto L54
        L50:
            android.animation.Keyframe r8 = android.animation.Keyframe.ofInt(r8)
        L54:
            java.lang.String r9 = "interpolator"
            int r9 = androidx.core.content.res.TypedArrayUtils.getNamedResourceId(r7, r11, r9, r3, r1)
            if (r9 <= 0) goto L63
            android.view.animation.Interpolator r6 = androidx.vectordrawable.graphics.drawable.AnimationUtilsCompat.loadInterpolator(r6, r9)
            r8.setInterpolator(r6)
        L63:
            r7.recycle()
            return r8
    }

    private static android.animation.ObjectAnimator loadObjectAnimator(android.content.Context r8, android.content.res.Resources r9, android.content.res.Resources.Theme r10, android.util.AttributeSet r11, float r12, org.xmlpull.v1.XmlPullParser r13) throws android.content.res.Resources.NotFoundException {
            android.animation.ObjectAnimator r7 = new android.animation.ObjectAnimator
            r7.<init>()
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r7
            r5 = r12
            r6 = r13
            loadAnimator(r0, r1, r2, r3, r4, r5, r6)
            return r7
    }

    private static android.animation.PropertyValuesHolder loadPvh(android.content.Context r9, android.content.res.Resources r10, android.content.res.Resources.Theme r11, org.xmlpull.v1.XmlPullParser r12, java.lang.String r13, int r14) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r0 = 0
            r1 = r0
        L2:
            int r2 = r12.next()
            r3 = 3
            if (r2 == r3) goto L40
            r4 = 1
            if (r2 == r4) goto L40
            java.lang.String r2 = r12.getName()
            java.lang.String r3 = "keyframe"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L2
            r2 = 4
            if (r14 != r2) goto L23
            android.util.AttributeSet r14 = android.util.Xml.asAttributeSet(r12)
            int r14 = inferValueTypeOfKeyframe(r10, r11, r14, r12)
        L23:
            android.util.AttributeSet r5 = android.util.Xml.asAttributeSet(r12)
            r2 = r9
            r3 = r10
            r4 = r11
            r6 = r14
            r7 = r12
            android.animation.Keyframe r2 = loadKeyframe(r2, r3, r4, r5, r6, r7)
            if (r2 == 0) goto L3c
            if (r1 != 0) goto L39
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L39:
            r1.add(r2)
        L3c:
            r12.next()
            goto L2
        L40:
            if (r1 == 0) goto Le9
            int r9 = r1.size()
            if (r9 <= 0) goto Le9
            r10 = 0
            java.lang.Object r11 = r1.get(r10)
            android.animation.Keyframe r11 = (android.animation.Keyframe) r11
            int r12 = r9 + (-1)
            java.lang.Object r12 = r1.get(r12)
            android.animation.Keyframe r12 = (android.animation.Keyframe) r12
            float r0 = r12.getFraction()
            r2 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r5 = 0
            if (r4 >= 0) goto L77
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L6a
            r12.setFraction(r2)
            goto L77
        L6a:
            int r0 = r1.size()
            android.animation.Keyframe r12 = createNewKeyframe(r12, r2)
            r1.add(r0, r12)
            int r9 = r9 + 1
        L77:
            float r12 = r11.getFraction()
            int r0 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r0 == 0) goto L90
            int r12 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r12 >= 0) goto L87
            r11.setFraction(r5)
            goto L90
        L87:
            android.animation.Keyframe r11 = createNewKeyframe(r11, r5)
            r1.add(r10, r11)
            int r9 = r9 + 1
        L90:
            android.animation.Keyframe[] r11 = new android.animation.Keyframe[r9]
            r1.toArray(r11)
        L95:
            if (r10 >= r9) goto Ldc
            r12 = r11[r10]
            float r0 = r12.getFraction()
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto Ld9
            if (r10 != 0) goto La7
            r12.setFraction(r5)
            goto Ld9
        La7:
            int r0 = r9 + (-1)
            if (r10 != r0) goto Laf
            r12.setFraction(r2)
            goto Ld9
        Laf:
            int r12 = r10 + 1
            r1 = r10
        Lb2:
            if (r12 >= r0) goto Lc5
            r4 = r11[r12]
            float r4 = r4.getFraction()
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 < 0) goto Lbf
            goto Lc5
        Lbf:
            int r1 = r12 + 1
            r8 = r1
            r1 = r12
            r12 = r8
            goto Lb2
        Lc5:
            int r12 = r1 + 1
            r12 = r11[r12]
            float r12 = r12.getFraction()
            int r0 = r10 + (-1)
            r0 = r11[r0]
            float r0 = r0.getFraction()
            float r12 = r12 - r0
            distributeKeyframes(r11, r12, r10, r1)
        Ld9:
            int r10 = r10 + 1
            goto L95
        Ldc:
            android.animation.PropertyValuesHolder r0 = android.animation.PropertyValuesHolder.ofKeyframe(r13, r11)
            if (r14 != r3) goto Le9
            androidx.vectordrawable.graphics.drawable.ArgbEvaluator r9 = androidx.vectordrawable.graphics.drawable.ArgbEvaluator.getInstance()
            r0.setEvaluator(r9)
        Le9:
            return r0
    }

    private static android.animation.PropertyValuesHolder[] loadValues(android.content.Context r17, android.content.res.Resources r18, android.content.res.Resources.Theme r19, org.xmlpull.v1.XmlPullParser r20, android.util.AttributeSet r21) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r6 = r20
            r7 = 0
            r8 = r7
        L4:
            int r0 = r20.getEventType()
            r9 = 0
            r1 = 3
            if (r0 == r1) goto L6d
            r10 = 1
            if (r0 == r10) goto L6d
            r2 = 2
            if (r0 == r2) goto L16
            r20.next()
            goto L4
        L16:
            java.lang.String r0 = r20.getName()
            java.lang.String r3 = "propertyValuesHolder"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L63
            int[] r0 = androidx.vectordrawable.graphics.drawable.AndroidResources.STYLEABLE_PROPERTY_VALUES_HOLDER
            r11 = r18
            r12 = r19
            r13 = r21
            android.content.res.TypedArray r14 = androidx.core.content.res.TypedArrayUtils.obtainAttributes(r11, r12, r13, r0)
            java.lang.String r0 = "propertyName"
            java.lang.String r15 = androidx.core.content.res.TypedArrayUtils.getNamedString(r14, r6, r0, r1)
            java.lang.String r0 = "valueType"
            r1 = 4
            int r5 = androidx.core.content.res.TypedArrayUtils.getNamedInt(r14, r6, r0, r2, r1)
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r15
            r16 = r5
            android.animation.PropertyValuesHolder r0 = loadPvh(r0, r1, r2, r3, r4, r5)
            if (r0 != 0) goto L52
            r1 = r16
            android.animation.PropertyValuesHolder r0 = getPVH(r14, r1, r9, r10, r15)
        L52:
            if (r0 == 0) goto L5f
            if (r8 != 0) goto L5c
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r8 = r1
        L5c:
            r8.add(r0)
        L5f:
            r14.recycle()
            goto L69
        L63:
            r11 = r18
            r12 = r19
            r13 = r21
        L69:
            r20.next()
            goto L4
        L6d:
            if (r8 == 0) goto L82
            int r0 = r8.size()
            android.animation.PropertyValuesHolder[] r7 = new android.animation.PropertyValuesHolder[r0]
        L75:
            if (r9 >= r0) goto L82
            java.lang.Object r1 = r8.get(r9)
            android.animation.PropertyValuesHolder r1 = (android.animation.PropertyValuesHolder) r1
            r7[r9] = r1
            int r9 = r9 + 1
            goto L75
        L82:
            return r7
    }

    private static void parseAnimatorFromTypeArray(android.animation.ValueAnimator r11, android.content.res.TypedArray r12, android.content.res.TypedArray r13, float r14, org.xmlpull.v1.XmlPullParser r15) {
            r0 = 300(0x12c, float:4.2E-43)
            java.lang.String r1 = "duration"
            r2 = 1
            int r0 = androidx.core.content.res.TypedArrayUtils.getNamedInt(r12, r15, r1, r2, r0)
            long r0 = (long) r0
            java.lang.String r3 = "startOffset"
            r4 = 2
            r5 = 0
            int r3 = androidx.core.content.res.TypedArrayUtils.getNamedInt(r12, r15, r3, r4, r5)
            long r3 = (long) r3
            java.lang.String r6 = "valueType"
            r7 = 7
            r8 = 4
            int r6 = androidx.core.content.res.TypedArrayUtils.getNamedInt(r12, r15, r6, r7, r8)
            java.lang.String r7 = "valueFrom"
            boolean r7 = androidx.core.content.res.TypedArrayUtils.hasAttribute(r15, r7)
            if (r7 == 0) goto L42
            java.lang.String r7 = "valueTo"
            boolean r7 = androidx.core.content.res.TypedArrayUtils.hasAttribute(r15, r7)
            if (r7 == 0) goto L42
            r7 = 6
            r9 = 5
            if (r6 != r8) goto L33
            int r6 = inferValueTypeFromValues(r12, r9, r7)
        L33:
            java.lang.String r10 = ""
            android.animation.PropertyValuesHolder r7 = getPVH(r12, r6, r9, r7, r10)
            if (r7 == 0) goto L42
            android.animation.PropertyValuesHolder[] r9 = new android.animation.PropertyValuesHolder[r2]
            r9[r5] = r7
            r11.setValues(r9)
        L42:
            r11.setDuration(r0)
            r11.setStartDelay(r3)
            java.lang.String r0 = "repeatCount"
            r1 = 3
            int r0 = androidx.core.content.res.TypedArrayUtils.getNamedInt(r12, r15, r0, r1, r5)
            r11.setRepeatCount(r0)
            java.lang.String r0 = "repeatMode"
            int r12 = androidx.core.content.res.TypedArrayUtils.getNamedInt(r12, r15, r0, r8, r2)
            r11.setRepeatMode(r12)
            if (r13 == 0) goto L60
            setupObjectAnimator(r11, r13, r6, r14, r15)
        L60:
            return
    }

    private static void setupObjectAnimator(android.animation.ValueAnimator r5, android.content.res.TypedArray r6, int r7, float r8, org.xmlpull.v1.XmlPullParser r9) {
            android.animation.ObjectAnimator r5 = (android.animation.ObjectAnimator) r5
            java.lang.String r0 = "pathData"
            r1 = 1
            java.lang.String r0 = androidx.core.content.res.TypedArrayUtils.getNamedString(r6, r9, r0, r1)
            if (r0 == 0) goto L49
            java.lang.String r1 = "propertyXName"
            r2 = 2
            java.lang.String r1 = androidx.core.content.res.TypedArrayUtils.getNamedString(r6, r9, r1, r2)
            java.lang.String r3 = "propertyYName"
            r4 = 3
            java.lang.String r9 = androidx.core.content.res.TypedArrayUtils.getNamedString(r6, r9, r3, r4)
            if (r7 == r2) goto L1c
            r2 = 4
        L1c:
            if (r1 != 0) goto L3e
            if (r9 == 0) goto L21
            goto L3e
        L21:
            android.view.InflateException r5 = new android.view.InflateException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r6 = r6.getPositionDescription()
            java.lang.StringBuilder r6 = r7.append(r6)
            java.lang.String r7 = " propertyXName or propertyYName is needed for PathData"
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L3e:
            android.graphics.Path r6 = androidx.core.graphics.PathParser.createPathFromPathData(r0)
            r7 = 1056964608(0x3f000000, float:0.5)
            float r8 = r8 * r7
            setupPathMotion(r6, r5, r8, r1, r9)
            goto L53
        L49:
            java.lang.String r7 = "propertyName"
            r8 = 0
            java.lang.String r6 = androidx.core.content.res.TypedArrayUtils.getNamedString(r6, r9, r7, r8)
            r5.setPropertyName(r6)
        L53:
            return
    }

    private static void setupPathMotion(android.graphics.Path r17, android.animation.ObjectAnimator r18, float r19, java.lang.String r20, java.lang.String r21) {
            r0 = r17
            r1 = r18
            r2 = r20
            r3 = r21
            android.graphics.PathMeasure r4 = new android.graphics.PathMeasure
            r5 = 0
            r4.<init>(r0, r5)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r7 = 0
            java.lang.Float r8 = java.lang.Float.valueOf(r7)
            r6.add(r8)
            r8 = r7
        L1c:
            float r9 = r4.getLength()
            float r8 = r8 + r9
            java.lang.Float r9 = java.lang.Float.valueOf(r8)
            r6.add(r9)
            boolean r9 = r4.nextContour()
            if (r9 != 0) goto L1c
            android.graphics.PathMeasure r4 = new android.graphics.PathMeasure
            r4.<init>(r0, r5)
            float r0 = r8 / r19
            int r0 = (int) r0
            r9 = 1
            int r0 = r0 + r9
            r10 = 100
            int r0 = java.lang.Math.min(r10, r0)
            float[] r10 = new float[r0]
            float[] r11 = new float[r0]
            r12 = 2
            float[] r13 = new float[r12]
            int r14 = r0 + (-1)
            float r14 = (float) r14
            float r8 = r8 / r14
            r14 = r5
            r15 = r14
        L4b:
            r12 = 0
            if (r14 >= r0) goto L85
            java.lang.Object r16 = r6.get(r15)
            java.lang.Float r16 = (java.lang.Float) r16
            float r16 = r16.floatValue()
            float r9 = r7 - r16
            r4.getPosTan(r9, r13, r12)
            r9 = r13[r5]
            r10[r14] = r9
            r9 = 1
            r12 = r13[r9]
            r11[r14] = r12
            float r7 = r7 + r8
            int r9 = r15 + 1
            int r12 = r6.size()
            if (r9 >= r12) goto L81
            java.lang.Object r12 = r6.get(r9)
            java.lang.Float r12 = (java.lang.Float) r12
            float r12 = r12.floatValue()
            int r12 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r12 <= 0) goto L81
            r4.nextContour()
            r15 = r9
        L81:
            int r14 = r14 + 1
            r9 = 1
            goto L4b
        L85:
            if (r2 == 0) goto L8c
            android.animation.PropertyValuesHolder r0 = android.animation.PropertyValuesHolder.ofFloat(r2, r10)
            goto L8d
        L8c:
            r0 = r12
        L8d:
            if (r3 == 0) goto L93
            android.animation.PropertyValuesHolder r12 = android.animation.PropertyValuesHolder.ofFloat(r3, r11)
        L93:
            if (r0 != 0) goto L9e
            r2 = 1
            android.animation.PropertyValuesHolder[] r0 = new android.animation.PropertyValuesHolder[r2]
            r0[r5] = r12
            r1.setValues(r0)
            goto Lb3
        L9e:
            r2 = 1
            if (r12 != 0) goto La9
            android.animation.PropertyValuesHolder[] r2 = new android.animation.PropertyValuesHolder[r2]
            r2[r5] = r0
            r1.setValues(r2)
            goto Lb3
        La9:
            r3 = 2
            android.animation.PropertyValuesHolder[] r3 = new android.animation.PropertyValuesHolder[r3]
            r3[r5] = r0
            r3[r2] = r12
            r1.setValues(r3)
        Lb3:
            return
    }
}
