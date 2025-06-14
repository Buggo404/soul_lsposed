package androidx.constraintlayout.helper.widget;

/* loaded from: classes.dex */
public class MotionEffect extends androidx.constraintlayout.motion.widget.MotionHelper {
    public static final int AUTO = -1;
    public static final int EAST = 2;
    public static final int NORTH = 0;
    public static final int SOUTH = 1;
    public static final java.lang.String TAG = "FadeMove";
    private static final int UNSET = -1;
    public static final int WEST = 3;
    private int fadeMove;
    private float motionEffectAlpha;
    private int motionEffectEnd;
    private int motionEffectStart;
    private boolean motionEffectStrictMove;
    private int motionEffectTranslationX;
    private int motionEffectTranslationY;
    private int viewTransitionId;

    public MotionEffect(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 1036831949(0x3dcccccd, float:0.1)
            r0.motionEffectAlpha = r1
            r1 = 49
            r0.motionEffectStart = r1
            r1 = 50
            r0.motionEffectEnd = r1
            r1 = 0
            r0.motionEffectTranslationX = r1
            r0.motionEffectTranslationY = r1
            r1 = 1
            r0.motionEffectStrictMove = r1
            r1 = -1
            r0.viewTransitionId = r1
            r0.fadeMove = r1
            return
    }

    public MotionEffect(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r1.<init>(r2, r3)
            r0 = 1036831949(0x3dcccccd, float:0.1)
            r1.motionEffectAlpha = r0
            r0 = 49
            r1.motionEffectStart = r0
            r0 = 50
            r1.motionEffectEnd = r0
            r0 = 0
            r1.motionEffectTranslationX = r0
            r1.motionEffectTranslationY = r0
            r0 = 1
            r1.motionEffectStrictMove = r0
            r0 = -1
            r1.viewTransitionId = r0
            r1.fadeMove = r0
            r1.init(r2, r3)
            return
    }

    public MotionEffect(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r3 = 1036831949(0x3dcccccd, float:0.1)
            r0.motionEffectAlpha = r3
            r3 = 49
            r0.motionEffectStart = r3
            r3 = 50
            r0.motionEffectEnd = r3
            r3 = 0
            r0.motionEffectTranslationX = r3
            r0.motionEffectTranslationY = r3
            r3 = 1
            r0.motionEffectStrictMove = r3
            r3 = -1
            r0.viewTransitionId = r3
            r0.fadeMove = r3
            r0.init(r1, r2)
            return
    }

    private void init(android.content.Context r6, android.util.AttributeSet r7) {
            r5 = this;
            if (r7 == 0) goto La9
            int[] r0 = androidx.constraintlayout.widget.C0156R.styleable.MotionEffect
            android.content.res.TypedArray r6 = r6.obtainStyledAttributes(r7, r0)
            int r7 = r6.getIndexCount()
            r0 = 0
            r1 = r0
        Le:
            if (r1 >= r7) goto L95
            int r2 = r6.getIndex(r1)
            int r3 = androidx.constraintlayout.widget.C0156R.styleable.MotionEffect_motionEffect_start
            r4 = 99
            if (r2 != r3) goto L2d
            int r3 = r5.motionEffectStart
            int r2 = r6.getInt(r2, r3)
            r5.motionEffectStart = r2
            int r2 = java.lang.Math.min(r2, r4)
            int r2 = java.lang.Math.max(r2, r0)
            r5.motionEffectStart = r2
            goto L91
        L2d:
            int r3 = androidx.constraintlayout.widget.C0156R.styleable.MotionEffect_motionEffect_end
            if (r2 != r3) goto L44
            int r3 = r5.motionEffectEnd
            int r2 = r6.getInt(r2, r3)
            r5.motionEffectEnd = r2
            int r2 = java.lang.Math.min(r2, r4)
            int r2 = java.lang.Math.max(r2, r0)
            r5.motionEffectEnd = r2
            goto L91
        L44:
            int r3 = androidx.constraintlayout.widget.C0156R.styleable.MotionEffect_motionEffect_translationX
            if (r2 != r3) goto L51
            int r3 = r5.motionEffectTranslationX
            int r2 = r6.getDimensionPixelOffset(r2, r3)
            r5.motionEffectTranslationX = r2
            goto L91
        L51:
            int r3 = androidx.constraintlayout.widget.C0156R.styleable.MotionEffect_motionEffect_translationY
            if (r2 != r3) goto L5e
            int r3 = r5.motionEffectTranslationY
            int r2 = r6.getDimensionPixelOffset(r2, r3)
            r5.motionEffectTranslationY = r2
            goto L91
        L5e:
            int r3 = androidx.constraintlayout.widget.C0156R.styleable.MotionEffect_motionEffect_alpha
            if (r2 != r3) goto L6b
            float r3 = r5.motionEffectAlpha
            float r2 = r6.getFloat(r2, r3)
            r5.motionEffectAlpha = r2
            goto L91
        L6b:
            int r3 = androidx.constraintlayout.widget.C0156R.styleable.MotionEffect_motionEffect_move
            if (r2 != r3) goto L78
            int r3 = r5.fadeMove
            int r2 = r6.getInt(r2, r3)
            r5.fadeMove = r2
            goto L91
        L78:
            int r3 = androidx.constraintlayout.widget.C0156R.styleable.MotionEffect_motionEffect_strict
            if (r2 != r3) goto L85
            boolean r3 = r5.motionEffectStrictMove
            boolean r2 = r6.getBoolean(r2, r3)
            r5.motionEffectStrictMove = r2
            goto L91
        L85:
            int r3 = androidx.constraintlayout.widget.C0156R.styleable.MotionEffect_motionEffect_viewTransition
            if (r2 != r3) goto L91
            int r3 = r5.viewTransitionId
            int r2 = r6.getResourceId(r2, r3)
            r5.viewTransitionId = r2
        L91:
            int r1 = r1 + 1
            goto Le
        L95:
            int r7 = r5.motionEffectStart
            int r0 = r5.motionEffectEnd
            if (r7 != r0) goto La6
            if (r7 <= 0) goto La2
            int r7 = r7 + (-1)
            r5.motionEffectStart = r7
            goto La6
        La2:
            int r0 = r0 + 1
            r5.motionEffectEnd = r0
        La6:
            r6.recycle()
        La9:
            return
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelper, androidx.constraintlayout.motion.widget.MotionHelperInterface
    public boolean isDecorator() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelper, androidx.constraintlayout.motion.widget.MotionHelperInterface
    public void onPreSetup(androidx.constraintlayout.motion.widget.MotionLayout r22, java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> r23) {
            r21 = this;
            r0 = r21
            r1 = r23
            android.view.ViewParent r2 = r21.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r2 = (androidx.constraintlayout.widget.ConstraintLayout) r2
            android.view.View[] r2 = r0.getViews(r2)
            if (r2 != 0) goto L2d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = androidx.constraintlayout.motion.widget.Debug.getLoc()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " views = null"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "FadeMove"
            android.util.Log.v(r2, r1)
            return
        L2d:
            androidx.constraintlayout.motion.widget.KeyAttributes r3 = new androidx.constraintlayout.motion.widget.KeyAttributes
            r3.<init>()
            androidx.constraintlayout.motion.widget.KeyAttributes r4 = new androidx.constraintlayout.motion.widget.KeyAttributes
            r4.<init>()
            float r5 = r0.motionEffectAlpha
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            java.lang.String r6 = "alpha"
            r3.setValue(r6, r5)
            float r5 = r0.motionEffectAlpha
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            r4.setValue(r6, r5)
            int r5 = r0.motionEffectStart
            r3.setFramePosition(r5)
            int r5 = r0.motionEffectEnd
            r4.setFramePosition(r5)
            androidx.constraintlayout.motion.widget.KeyPosition r5 = new androidx.constraintlayout.motion.widget.KeyPosition
            r5.<init>()
            int r6 = r0.motionEffectStart
            r5.setFramePosition(r6)
            r6 = 0
            r5.setType(r6)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            java.lang.String r8 = "percentX"
            r5.setValue(r8, r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            java.lang.String r9 = "percentY"
            r5.setValue(r9, r7)
            androidx.constraintlayout.motion.widget.KeyPosition r7 = new androidx.constraintlayout.motion.widget.KeyPosition
            r7.<init>()
            int r10 = r0.motionEffectEnd
            r7.setFramePosition(r10)
            r7.setType(r6)
            r10 = 1
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            r7.setValue(r8, r11)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r10)
            r7.setValue(r9, r8)
            int r8 = r0.motionEffectTranslationX
            r9 = 0
            if (r8 <= 0) goto Lbe
            androidx.constraintlayout.motion.widget.KeyAttributes r8 = new androidx.constraintlayout.motion.widget.KeyAttributes
            r8.<init>()
            androidx.constraintlayout.motion.widget.KeyAttributes r11 = new androidx.constraintlayout.motion.widget.KeyAttributes
            r11.<init>()
            int r12 = r0.motionEffectTranslationX
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.String r13 = "translationX"
            r8.setValue(r13, r12)
            int r12 = r0.motionEffectEnd
            r8.setFramePosition(r12)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r6)
            r11.setValue(r13, r12)
            int r12 = r0.motionEffectEnd
            int r12 = r12 - r10
            r11.setFramePosition(r12)
            goto Lc0
        Lbe:
            r8 = r9
            r11 = r8
        Lc0:
            int r12 = r0.motionEffectTranslationY
            if (r12 <= 0) goto Lec
            androidx.constraintlayout.motion.widget.KeyAttributes r9 = new androidx.constraintlayout.motion.widget.KeyAttributes
            r9.<init>()
            androidx.constraintlayout.motion.widget.KeyAttributes r12 = new androidx.constraintlayout.motion.widget.KeyAttributes
            r12.<init>()
            int r13 = r0.motionEffectTranslationY
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.String r14 = "translationY"
            r9.setValue(r14, r13)
            int r13 = r0.motionEffectEnd
            r9.setFramePosition(r13)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r6)
            r12.setValue(r14, r13)
            int r13 = r0.motionEffectEnd
            int r13 = r13 - r10
            r12.setFramePosition(r13)
            goto Led
        Lec:
            r12 = r9
        Led:
            int r13 = r0.fadeMove
            r15 = -1
            r17 = 0
            if (r13 != r15) goto L156
            r13 = 4
            int[] r15 = new int[r13]
            r13 = r6
        Lf8:
            int r14 = r2.length
            if (r13 >= r14) goto L145
            r14 = r2[r13]
            java.lang.Object r14 = r1.get(r14)
            androidx.constraintlayout.motion.widget.MotionController r14 = (androidx.constraintlayout.motion.widget.MotionController) r14
            if (r14 != 0) goto L106
            goto L142
        L106:
            float r19 = r14.getFinalX()
            float r20 = r14.getStartX()
            float r19 = r19 - r20
            float r20 = r14.getFinalY()
            float r14 = r14.getStartY()
            float r20 = r20 - r14
            int r14 = (r20 > r17 ? 1 : (r20 == r17 ? 0 : -1))
            if (r14 >= 0) goto L123
            r14 = r15[r10]
            int r14 = r14 + r10
            r15[r10] = r14
        L123:
            int r14 = (r20 > r17 ? 1 : (r20 == r17 ? 0 : -1))
            if (r14 <= 0) goto L12c
            r14 = r15[r6]
            int r14 = r14 + r10
            r15[r6] = r14
        L12c:
            int r14 = (r19 > r17 ? 1 : (r19 == r17 ? 0 : -1))
            if (r14 <= 0) goto L137
            r14 = 3
            r18 = r15[r14]
            int r18 = r18 + 1
            r15[r14] = r18
        L137:
            int r14 = (r19 > r17 ? 1 : (r19 == r17 ? 0 : -1))
            if (r14 >= 0) goto L142
            r14 = 2
            r16 = r15[r14]
            int r16 = r16 + 1
            r15[r14] = r16
        L142:
            int r13 = r13 + 1
            goto Lf8
        L145:
            r13 = r15[r6]
            r14 = r13
            r13 = r6
            r6 = r10
        L14a:
            r10 = 4
            if (r6 >= r10) goto L156
            r10 = r15[r6]
            if (r14 >= r10) goto L153
            r13 = r6
            r14 = r10
        L153:
            int r6 = r6 + 1
            goto L14a
        L156:
            r6 = 0
        L157:
            int r10 = r2.length
            if (r6 >= r10) goto L1f5
            r10 = r2[r6]
            java.lang.Object r10 = r1.get(r10)
            androidx.constraintlayout.motion.widget.MotionController r10 = (androidx.constraintlayout.motion.widget.MotionController) r10
            if (r10 != 0) goto L169
        L164:
            r1 = r22
            r15 = -1
            goto L1ef
        L169:
            float r14 = r10.getFinalX()
            float r15 = r10.getStartX()
            float r14 = r14 - r15
            float r15 = r10.getFinalY()
            float r20 = r10.getStartY()
            float r15 = r15 - r20
            if (r13 != 0) goto L18f
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 <= 0) goto L18d
            boolean r15 = r0.motionEffectStrictMove
            if (r15 == 0) goto L18a
            int r14 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r14 != 0) goto L18d
        L18a:
            r1 = 3
        L18b:
            r14 = 0
            goto L1c0
        L18d:
            r1 = 3
            goto L1bf
        L18f:
            r1 = 1
            if (r13 != r1) goto L19f
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L18d
            boolean r15 = r0.motionEffectStrictMove
            if (r15 == 0) goto L18a
            int r14 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r14 != 0) goto L18d
            goto L18a
        L19f:
            r1 = 2
            if (r13 != r1) goto L1af
            int r14 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r14 >= 0) goto L18d
            boolean r14 = r0.motionEffectStrictMove
            if (r14 == 0) goto L18a
            int r14 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r14 != 0) goto L18d
            goto L18a
        L1af:
            r1 = 3
            if (r13 != r1) goto L1bf
            int r14 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r14 <= 0) goto L1bf
            boolean r14 = r0.motionEffectStrictMove
            if (r14 == 0) goto L18b
            int r14 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r14 != 0) goto L1bf
            goto L18b
        L1bf:
            r14 = 1
        L1c0:
            if (r14 == 0) goto L164
            int r14 = r0.viewTransitionId
            r15 = -1
            if (r14 != r15) goto L1ea
            r10.addKey(r3)
            r10.addKey(r4)
            r10.addKey(r5)
            r10.addKey(r7)
            int r14 = r0.motionEffectTranslationX
            if (r14 <= 0) goto L1dd
            r10.addKey(r8)
            r10.addKey(r11)
        L1dd:
            int r14 = r0.motionEffectTranslationY
            if (r14 <= 0) goto L1e7
            r10.addKey(r9)
            r10.addKey(r12)
        L1e7:
            r1 = r22
            goto L1ef
        L1ea:
            r1 = r22
            r1.applyViewTransition(r14, r10)
        L1ef:
            int r6 = r6 + 1
            r1 = r23
            goto L157
        L1f5:
            return
    }
}
