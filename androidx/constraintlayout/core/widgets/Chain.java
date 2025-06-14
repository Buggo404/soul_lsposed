package androidx.constraintlayout.core.widgets;

/* loaded from: classes.dex */
public class Chain {
    private static final boolean DEBUG = false;
    public static final boolean USE_CHAIN_OPTIMIZATION = false;

    public Chain() {
            r0 = this;
            r0.<init>()
            return
    }

    static void applyChainConstraints(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r38, androidx.constraintlayout.core.LinearSystem r39, int r40, int r41, androidx.constraintlayout.core.widgets.ChainHead r42) {
            r0 = r38
            r9 = r39
            r10 = r40
            r1 = r42
            androidx.constraintlayout.core.widgets.ConstraintWidget r11 = r1.mFirst
            androidx.constraintlayout.core.widgets.ConstraintWidget r12 = r1.mLast
            androidx.constraintlayout.core.widgets.ConstraintWidget r13 = r1.mFirstVisibleWidget
            androidx.constraintlayout.core.widgets.ConstraintWidget r14 = r1.mLastVisibleWidget
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r1.mHead
            float r3 = r1.mTotalWeight
            androidx.constraintlayout.core.widgets.ConstraintWidget r4 = r1.mFirstMatchConstraintWidget
            androidx.constraintlayout.core.widgets.ConstraintWidget r4 = r1.mLastMatchConstraintWidget
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r4 = r0.mListDimensionBehaviors
            r4 = r4[r10]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            r6 = 1
            if (r4 != r5) goto L23
            r4 = r6
            goto L24
        L23:
            r4 = 0
        L24:
            r5 = 2
            if (r10 != 0) goto L3a
            int r8 = r2.mHorizontalChainStyle
            if (r8 != 0) goto L2d
            r8 = r6
            goto L2e
        L2d:
            r8 = 0
        L2e:
            int r15 = r2.mHorizontalChainStyle
            if (r15 != r6) goto L34
            r15 = r6
            goto L35
        L34:
            r15 = 0
        L35:
            int r7 = r2.mHorizontalChainStyle
            if (r7 != r5) goto L4e
            goto L4c
        L3a:
            int r7 = r2.mVerticalChainStyle
            if (r7 != 0) goto L40
            r8 = r6
            goto L41
        L40:
            r8 = 0
        L41:
            int r7 = r2.mVerticalChainStyle
            if (r7 != r6) goto L47
            r15 = r6
            goto L48
        L47:
            r15 = 0
        L48:
            int r7 = r2.mVerticalChainStyle
            if (r7 != r5) goto L4e
        L4c:
            r5 = r6
            goto L4f
        L4e:
            r5 = 0
        L4f:
            r17 = r15
            r7 = 0
            r15 = r8
            r8 = r11
        L54:
            r22 = 0
            if (r7 != 0) goto L14a
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r6 = r8.mListAnchors
            r6 = r6[r41]
            if (r5 == 0) goto L61
            r20 = 1
            goto L63
        L61:
            r20 = 4
        L63:
            int r24 = r6.getMargin()
            r25 = r3
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r3 = r8.mListDimensionBehaviors
            r3 = r3[r10]
            r26 = r7
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r3 != r7) goto L7b
            int[] r3 = r8.mResolvedMatchConstraintDefault
            r3 = r3[r10]
            if (r3 != 0) goto L7b
            r3 = 1
            goto L7c
        L7b:
            r3 = 0
        L7c:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r6.mTarget
            if (r7 == 0) goto L8a
            if (r8 == r11) goto L8a
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r6.mTarget
            int r7 = r7.getMargin()
            int r24 = r24 + r7
        L8a:
            r7 = r24
            if (r5 == 0) goto L97
            if (r8 == r11) goto L97
            if (r8 == r13) goto L97
            r24 = r15
            r20 = 8
            goto L99
        L97:
            r24 = r15
        L99:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r15 = r6.mTarget
            if (r15 == 0) goto Ldb
            if (r8 != r13) goto Lae
            androidx.constraintlayout.core.SolverVariable r15 = r6.mSolverVariable
            r27 = r2
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r6.mTarget
            androidx.constraintlayout.core.SolverVariable r2 = r2.mSolverVariable
            r28 = r11
            r11 = 6
            r9.addGreaterThan(r15, r2, r7, r11)
            goto Lbd
        Lae:
            r27 = r2
            r28 = r11
            androidx.constraintlayout.core.SolverVariable r2 = r6.mSolverVariable
            androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r6.mTarget
            androidx.constraintlayout.core.SolverVariable r11 = r11.mSolverVariable
            r15 = 8
            r9.addGreaterThan(r2, r11, r7, r15)
        Lbd:
            if (r3 == 0) goto Lc3
            if (r5 != 0) goto Lc3
            r20 = 5
        Lc3:
            if (r8 != r13) goto Lcf
            if (r5 == 0) goto Lcf
            boolean r2 = r8.isInBarrier(r10)
            if (r2 == 0) goto Lcf
            r2 = 5
            goto Ld1
        Lcf:
            r2 = r20
        Ld1:
            androidx.constraintlayout.core.SolverVariable r3 = r6.mSolverVariable
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r6.mTarget
            androidx.constraintlayout.core.SolverVariable r6 = r6.mSolverVariable
            r9.addEquality(r3, r6, r7, r2)
            goto Ldf
        Ldb:
            r27 = r2
            r28 = r11
        Ldf:
            if (r4 == 0) goto L117
            int r2 = r8.getVisibility()
            r3 = 8
            if (r2 == r3) goto L105
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r2 = r8.mListDimensionBehaviors
            r2 = r2[r10]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r2 != r3) goto L105
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r2 = r8.mListAnchors
            int r3 = r41 + 1
            r2 = r2[r3]
            androidx.constraintlayout.core.SolverVariable r2 = r2.mSolverVariable
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r3 = r8.mListAnchors
            r3 = r3[r41]
            androidx.constraintlayout.core.SolverVariable r3 = r3.mSolverVariable
            r6 = 5
            r7 = 0
            r9.addGreaterThan(r2, r3, r7, r6)
            goto L106
        L105:
            r7 = 0
        L106:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r2 = r8.mListAnchors
            r2 = r2[r41]
            androidx.constraintlayout.core.SolverVariable r2 = r2.mSolverVariable
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r3 = r0.mListAnchors
            r3 = r3[r41]
            androidx.constraintlayout.core.SolverVariable r3 = r3.mSolverVariable
            r6 = 8
            r9.addGreaterThan(r2, r3, r7, r6)
        L117:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r2 = r8.mListAnchors
            int r3 = r41 + 1
            r2 = r2[r3]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.mTarget
            if (r2 == 0) goto L138
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r2.mOwner
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r3 = r2.mListAnchors
            r3 = r3[r41]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.mTarget
            if (r3 == 0) goto L138
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r3 = r2.mListAnchors
            r3 = r3[r41]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.mTarget
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r3.mOwner
            if (r3 == r8) goto L136
            goto L138
        L136:
            r22 = r2
        L138:
            if (r22 == 0) goto L13f
            r8 = r22
            r7 = r26
            goto L140
        L13f:
            r7 = 1
        L140:
            r15 = r24
            r3 = r25
            r2 = r27
            r11 = r28
            goto L54
        L14a:
            r27 = r2
            r25 = r3
            r28 = r11
            r24 = r15
            if (r14 == 0) goto L1b9
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r2 = r12.mListAnchors
            int r3 = r41 + 1
            r2 = r2[r3]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.mTarget
            if (r2 == 0) goto L1b9
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r2 = r14.mListAnchors
            r2 = r2[r3]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r6 = r14.mListDimensionBehaviors
            r6 = r6[r10]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r6 != r7) goto L172
            int[] r6 = r14.mResolvedMatchConstraintDefault
            r6 = r6[r10]
            if (r6 != 0) goto L172
            r6 = 1
            goto L173
        L172:
            r6 = 0
        L173:
            if (r6 == 0) goto L18d
            if (r5 != 0) goto L18d
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r2.mTarget
            androidx.constraintlayout.core.widgets.ConstraintWidget r6 = r6.mOwner
            if (r6 != r0) goto L18d
            androidx.constraintlayout.core.SolverVariable r6 = r2.mSolverVariable
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r2.mTarget
            androidx.constraintlayout.core.SolverVariable r7 = r7.mSolverVariable
            int r8 = r2.getMargin()
            int r8 = -r8
            r11 = 5
            r9.addEquality(r6, r7, r8, r11)
            goto L1a5
        L18d:
            r11 = 5
            if (r5 == 0) goto L1a5
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r2.mTarget
            androidx.constraintlayout.core.widgets.ConstraintWidget r6 = r6.mOwner
            if (r6 != r0) goto L1a5
            androidx.constraintlayout.core.SolverVariable r6 = r2.mSolverVariable
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r2.mTarget
            androidx.constraintlayout.core.SolverVariable r7 = r7.mSolverVariable
            int r8 = r2.getMargin()
            int r8 = -r8
            r15 = 4
            r9.addEquality(r6, r7, r8, r15)
        L1a5:
            androidx.constraintlayout.core.SolverVariable r6 = r2.mSolverVariable
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r7 = r12.mListAnchors
            r3 = r7[r3]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.mTarget
            androidx.constraintlayout.core.SolverVariable r3 = r3.mSolverVariable
            int r2 = r2.getMargin()
            int r2 = -r2
            r7 = 6
            r9.addLowerThan(r6, r3, r2, r7)
            goto L1ba
        L1b9:
            r11 = 5
        L1ba:
            if (r4 == 0) goto L1d7
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r0.mListAnchors
            int r2 = r41 + 1
            r0 = r0[r2]
            androidx.constraintlayout.core.SolverVariable r0 = r0.mSolverVariable
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r3 = r12.mListAnchors
            r3 = r3[r2]
            androidx.constraintlayout.core.SolverVariable r3 = r3.mSolverVariable
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r4 = r12.mListAnchors
            r2 = r4[r2]
            int r2 = r2.getMargin()
            r4 = 8
            r9.addGreaterThan(r0, r3, r2, r4)
        L1d7:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r0 = r1.mWeightedMatchConstraintsWidgets
            if (r0 == 0) goto L28e
            int r2 = r0.size()
            r3 = 1
            if (r2 <= r3) goto L28e
            boolean r4 = r1.mHasUndefinedWeights
            if (r4 == 0) goto L1ee
            boolean r4 = r1.mHasComplexMatchWeights
            if (r4 != 0) goto L1ee
            int r4 = r1.mWidgetsMatchCount
            float r4 = (float) r4
            goto L1f0
        L1ee:
            r4 = r25
        L1f0:
            r6 = 0
            r30 = r6
            r8 = r22
            r7 = 0
        L1f6:
            if (r7 >= r2) goto L28e
            java.lang.Object r15 = r0.get(r7)
            androidx.constraintlayout.core.widgets.ConstraintWidget r15 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r15
            float[] r3 = r15.mWeight
            r3 = r3[r10]
            int r19 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r19 >= 0) goto L224
            boolean r3 = r1.mHasComplexMatchWeights
            if (r3 == 0) goto L21f
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r3 = r15.mListAnchors
            int r19 = r41 + 1
            r3 = r3[r19]
            androidx.constraintlayout.core.SolverVariable r3 = r3.mSolverVariable
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r15 = r15.mListAnchors
            r15 = r15[r41]
            androidx.constraintlayout.core.SolverVariable r15 = r15.mSolverVariable
            r6 = 0
            r11 = 4
            r9.addEquality(r3, r15, r6, r11)
            r11 = r6
            goto L23d
        L21f:
            r11 = 4
            r3 = 1065353216(0x3f800000, float:1.0)
            r6 = 0
            goto L225
        L224:
            r11 = 4
        L225:
            int r19 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r19 != 0) goto L242
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r3 = r15.mListAnchors
            int r19 = r41 + 1
            r3 = r3[r19]
            androidx.constraintlayout.core.SolverVariable r3 = r3.mSolverVariable
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r15 = r15.mListAnchors
            r15 = r15[r41]
            androidx.constraintlayout.core.SolverVariable r15 = r15.mSolverVariable
            r6 = 8
            r11 = 0
            r9.addEquality(r3, r15, r11, r6)
        L23d:
            r25 = r0
            r16 = r2
            goto L283
        L242:
            r11 = 0
            if (r8 == 0) goto L27c
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r6 = r8.mListAnchors
            r6 = r6[r41]
            androidx.constraintlayout.core.SolverVariable r6 = r6.mSolverVariable
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r8 = r8.mListAnchors
            int r16 = r41 + 1
            r8 = r8[r16]
            androidx.constraintlayout.core.SolverVariable r8 = r8.mSolverVariable
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r11 = r15.mListAnchors
            r11 = r11[r41]
            androidx.constraintlayout.core.SolverVariable r11 = r11.mSolverVariable
            r25 = r0
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r15.mListAnchors
            r0 = r0[r16]
            androidx.constraintlayout.core.SolverVariable r0 = r0.mSolverVariable
            r16 = r2
            androidx.constraintlayout.core.ArrayRow r2 = r39.createRow()
            r29 = r2
            r31 = r4
            r32 = r3
            r33 = r6
            r34 = r8
            r35 = r11
            r36 = r0
            r29.createRowEqualMatchDimensions(r30, r31, r32, r33, r34, r35, r36)
            r9.addConstraint(r2)
            goto L280
        L27c:
            r25 = r0
            r16 = r2
        L280:
            r30 = r3
            r8 = r15
        L283:
            int r7 = r7 + 1
            r2 = r16
            r0 = r25
            r3 = 1
            r6 = 0
            r11 = 5
            goto L1f6
        L28e:
            if (r13 == 0) goto L2eb
            if (r13 == r14) goto L294
            if (r5 == 0) goto L2eb
        L294:
            r11 = r28
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r11.mListAnchors
            r0 = r0[r41]
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r12.mListAnchors
            int r2 = r41 + 1
            r1 = r1[r2]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r0.mTarget
            if (r3 == 0) goto L2aa
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mTarget
            androidx.constraintlayout.core.SolverVariable r0 = r0.mSolverVariable
            r3 = r0
            goto L2ac
        L2aa:
            r3 = r22
        L2ac:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r1.mTarget
            if (r0 == 0) goto L2b6
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r1.mTarget
            androidx.constraintlayout.core.SolverVariable r0 = r0.mSolverVariable
            r5 = r0
            goto L2b8
        L2b6:
            r5 = r22
        L2b8:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r13.mListAnchors
            r0 = r0[r41]
            if (r14 == 0) goto L2c2
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r14.mListAnchors
            r1 = r1[r2]
        L2c2:
            if (r3 == 0) goto L51f
            if (r5 == 0) goto L51f
            if (r10 != 0) goto L2cd
            r2 = r27
            float r2 = r2.mHorizontalBiasPercent
            goto L2d1
        L2cd:
            r2 = r27
            float r2 = r2.mVerticalBiasPercent
        L2d1:
            r4 = r2
            int r6 = r0.getMargin()
            int r7 = r1.getMargin()
            androidx.constraintlayout.core.SolverVariable r2 = r0.mSolverVariable
            androidx.constraintlayout.core.SolverVariable r8 = r1.mSolverVariable
            r10 = 7
            r0 = r39
            r1 = r2
            r2 = r3
            r3 = r6
            r6 = r8
            r8 = r10
            r0.addCentering(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L51f
        L2eb:
            r11 = r28
            if (r24 == 0) goto L3e4
            if (r13 == 0) goto L3e4
            int r0 = r1.mWidgetsMatchCount
            if (r0 <= 0) goto L2fe
            int r0 = r1.mWidgetsCount
            int r1 = r1.mWidgetsMatchCount
            if (r0 != r1) goto L2fe
            r18 = 1
            goto L300
        L2fe:
            r18 = 0
        L300:
            r8 = r13
            r15 = r8
        L302:
            if (r15 == 0) goto L51f
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r0 = r15.mNextChainWidget
            r0 = r0[r10]
            r7 = r0
        L309:
            if (r7 == 0) goto L318
            int r0 = r7.getVisibility()
            r6 = 8
            if (r0 != r6) goto L31a
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r0 = r7.mNextChainWidget
            r7 = r0[r10]
            goto L309
        L318:
            r6 = 8
        L31a:
            if (r7 != 0) goto L325
            if (r15 != r14) goto L31f
            goto L325
        L31f:
            r20 = r7
        L321:
            r16 = r8
            goto L3d4
        L325:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r15.mListAnchors
            r0 = r0[r41]
            androidx.constraintlayout.core.SolverVariable r1 = r0.mSolverVariable
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r0.mTarget
            if (r2 == 0) goto L334
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r0.mTarget
            androidx.constraintlayout.core.SolverVariable r2 = r2.mSolverVariable
            goto L336
        L334:
            r2 = r22
        L336:
            if (r8 == r15) goto L341
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r2 = r8.mListAnchors
            int r3 = r41 + 1
            r2 = r2[r3]
            androidx.constraintlayout.core.SolverVariable r2 = r2.mSolverVariable
            goto L356
        L341:
            if (r15 != r13) goto L356
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r2 = r11.mListAnchors
            r2 = r2[r41]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.mTarget
            if (r2 == 0) goto L354
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r2 = r11.mListAnchors
            r2 = r2[r41]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.mTarget
            androidx.constraintlayout.core.SolverVariable r2 = r2.mSolverVariable
            goto L356
        L354:
            r2 = r22
        L356:
            int r0 = r0.getMargin()
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r3 = r15.mListAnchors
            int r4 = r41 + 1
            r3 = r3[r4]
            int r3 = r3.getMargin()
            if (r7 == 0) goto L36f
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r5 = r7.mListAnchors
            r5 = r5[r41]
            androidx.constraintlayout.core.SolverVariable r6 = r5.mSolverVariable
        L36c:
            r38 = r7
            goto L37e
        L36f:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r5 = r12.mListAnchors
            r5 = r5[r4]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r5.mTarget
            if (r5 == 0) goto L37a
            androidx.constraintlayout.core.SolverVariable r6 = r5.mSolverVariable
            goto L36c
        L37a:
            r38 = r7
            r6 = r22
        L37e:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r7 = r15.mListAnchors
            r7 = r7[r4]
            androidx.constraintlayout.core.SolverVariable r7 = r7.mSolverVariable
            if (r5 == 0) goto L38b
            int r5 = r5.getMargin()
            int r3 = r3 + r5
        L38b:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r5 = r8.mListAnchors
            r5 = r5[r4]
            int r5 = r5.getMargin()
            int r0 = r0 + r5
            if (r1 == 0) goto L3d0
            if (r2 == 0) goto L3d0
            if (r6 == 0) goto L3d0
            if (r7 == 0) goto L3d0
            if (r15 != r13) goto L3a6
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r13.mListAnchors
            r0 = r0[r41]
            int r0 = r0.getMargin()
        L3a6:
            r5 = r0
            if (r15 != r14) goto L3b4
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r14.mListAnchors
            r0 = r0[r4]
            int r0 = r0.getMargin()
            r16 = r0
            goto L3b6
        L3b4:
            r16 = r3
        L3b6:
            if (r18 == 0) goto L3bb
            r19 = 8
            goto L3bd
        L3bb:
            r19 = 5
        L3bd:
            r4 = 1056964608(0x3f000000, float:0.5)
            r0 = r39
            r3 = r5
            r5 = r6
            r6 = r7
            r20 = r38
            r7 = r16
            r16 = r8
            r8 = r19
            r0.addCentering(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L3d4
        L3d0:
            r20 = r38
            goto L321
        L3d4:
            int r0 = r15.getVisibility()
            r8 = 8
            if (r0 == r8) goto L3dd
            goto L3df
        L3dd:
            r15 = r16
        L3df:
            r8 = r15
            r15 = r20
            goto L302
        L3e4:
            r8 = 8
            if (r17 == 0) goto L51f
            if (r13 == 0) goto L51f
            int r0 = r1.mWidgetsMatchCount
            if (r0 <= 0) goto L3f7
            int r0 = r1.mWidgetsCount
            int r1 = r1.mWidgetsMatchCount
            if (r0 != r1) goto L3f7
            r18 = 1
            goto L3f9
        L3f7:
            r18 = 0
        L3f9:
            r7 = r13
            r15 = r7
        L3fb:
            if (r15 == 0) goto L4c1
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r0 = r15.mNextChainWidget
            r0 = r0[r10]
        L401:
            if (r0 == 0) goto L40e
            int r1 = r0.getVisibility()
            if (r1 != r8) goto L40e
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r0 = r0.mNextChainWidget
            r0 = r0[r10]
            goto L401
        L40e:
            if (r15 == r13) goto L4ac
            if (r15 == r14) goto L4ac
            if (r0 == 0) goto L4ac
            if (r0 != r14) goto L419
            r6 = r22
            goto L41a
        L419:
            r6 = r0
        L41a:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r15.mListAnchors
            r0 = r0[r41]
            androidx.constraintlayout.core.SolverVariable r1 = r0.mSolverVariable
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r0.mTarget
            if (r2 == 0) goto L428
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r0.mTarget
            androidx.constraintlayout.core.SolverVariable r2 = r2.mSolverVariable
        L428:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r2 = r7.mListAnchors
            int r3 = r41 + 1
            r2 = r2[r3]
            androidx.constraintlayout.core.SolverVariable r2 = r2.mSolverVariable
            int r0 = r0.getMargin()
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r4 = r15.mListAnchors
            r4 = r4[r3]
            int r4 = r4.getMargin()
            if (r6 == 0) goto L457
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r5 = r6.mListAnchors
            r5 = r5[r41]
            androidx.constraintlayout.core.SolverVariable r8 = r5.mSolverVariable
            r38 = r6
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r5.mTarget
            if (r6 == 0) goto L44f
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r5.mTarget
            androidx.constraintlayout.core.SolverVariable r6 = r6.mSolverVariable
            goto L451
        L44f:
            r6 = r22
        L451:
            r37 = r8
            r8 = r6
            r6 = r37
            goto L46a
        L457:
            r38 = r6
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r5 = r14.mListAnchors
            r5 = r5[r41]
            if (r5 == 0) goto L462
            androidx.constraintlayout.core.SolverVariable r6 = r5.mSolverVariable
            goto L464
        L462:
            r6 = r22
        L464:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r8 = r15.mListAnchors
            r8 = r8[r3]
            androidx.constraintlayout.core.SolverVariable r8 = r8.mSolverVariable
        L46a:
            if (r5 == 0) goto L471
            int r5 = r5.getMargin()
            int r4 = r4 + r5
        L471:
            r16 = r4
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r4 = r7.mListAnchors
            r3 = r4[r3]
            int r3 = r3.getMargin()
            int r3 = r3 + r0
            if (r18 == 0) goto L481
            r19 = 8
            goto L483
        L481:
            r19 = 4
        L483:
            if (r1 == 0) goto L4a1
            if (r2 == 0) goto L4a1
            if (r6 == 0) goto L4a1
            if (r8 == 0) goto L4a1
            r4 = 1056964608(0x3f000000, float:0.5)
            r0 = r39
            r5 = r6
            r20 = r38
            r21 = 4
            r6 = r8
            r23 = r7
            r7 = r16
            r10 = 8
            r8 = r19
            r0.addCentering(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L4a9
        L4a1:
            r20 = r38
            r23 = r7
            r10 = 8
            r21 = 4
        L4a9:
            r0 = r20
            goto L4b1
        L4ac:
            r23 = r7
            r10 = r8
            r21 = 4
        L4b1:
            int r1 = r15.getVisibility()
            if (r1 == r10) goto L4b9
            r7 = r15
            goto L4bb
        L4b9:
            r7 = r23
        L4bb:
            r15 = r0
            r8 = r10
            r10 = r40
            goto L3fb
        L4c1:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r13.mListAnchors
            r0 = r0[r41]
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r11.mListAnchors
            r1 = r1[r41]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.mTarget
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r2 = r14.mListAnchors
            int r3 = r41 + 1
            r10 = r2[r3]
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r2 = r12.mListAnchors
            r2 = r2[r3]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r2.mTarget
            if (r1 == 0) goto L50e
            if (r13 == r14) goto L4e8
            androidx.constraintlayout.core.SolverVariable r2 = r0.mSolverVariable
            androidx.constraintlayout.core.SolverVariable r1 = r1.mSolverVariable
            int r0 = r0.getMargin()
            r15 = 5
            r9.addEquality(r2, r1, r0, r15)
            goto L50f
        L4e8:
            r15 = 5
            if (r11 == 0) goto L50f
            androidx.constraintlayout.core.SolverVariable r2 = r0.mSolverVariable
            androidx.constraintlayout.core.SolverVariable r3 = r1.mSolverVariable
            int r4 = r0.getMargin()
            r5 = 1056964608(0x3f000000, float:0.5)
            androidx.constraintlayout.core.SolverVariable r6 = r10.mSolverVariable
            androidx.constraintlayout.core.SolverVariable r7 = r11.mSolverVariable
            int r8 = r10.getMargin()
            r16 = 5
            r0 = r39
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r16
            r0.addCentering(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L50f
        L50e:
            r15 = 5
        L50f:
            if (r11 == 0) goto L51f
            if (r13 == r14) goto L51f
            androidx.constraintlayout.core.SolverVariable r0 = r10.mSolverVariable
            androidx.constraintlayout.core.SolverVariable r1 = r11.mSolverVariable
            int r2 = r10.getMargin()
            int r2 = -r2
            r9.addEquality(r0, r1, r2, r15)
        L51f:
            if (r24 != 0) goto L523
            if (r17 == 0) goto L589
        L523:
            if (r13 == 0) goto L589
            if (r13 == r14) goto L589
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r13.mListAnchors
            r0 = r0[r41]
            if (r14 != 0) goto L52e
            r14 = r13
        L52e:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r14.mListAnchors
            int r2 = r41 + 1
            r1 = r1[r2]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r0.mTarget
            if (r3 == 0) goto L53d
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r0.mTarget
            androidx.constraintlayout.core.SolverVariable r3 = r3.mSolverVariable
            goto L53f
        L53d:
            r3 = r22
        L53f:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r1.mTarget
            if (r4 == 0) goto L548
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r1.mTarget
            androidx.constraintlayout.core.SolverVariable r4 = r4.mSolverVariable
            goto L54a
        L548:
            r4 = r22
        L54a:
            if (r12 == r14) goto L55d
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r4 = r12.mListAnchors
            r4 = r4[r2]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r4.mTarget
            if (r5 == 0) goto L55a
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r4.mTarget
            androidx.constraintlayout.core.SolverVariable r4 = r4.mSolverVariable
            r22 = r4
        L55a:
            r5 = r22
            goto L55e
        L55d:
            r5 = r4
        L55e:
            if (r13 != r14) goto L568
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r13.mListAnchors
            r0 = r0[r41]
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r13.mListAnchors
            r1 = r1[r2]
        L568:
            if (r3 == 0) goto L589
            if (r5 == 0) goto L589
            r4 = 1056964608(0x3f000000, float:0.5)
            int r6 = r0.getMargin()
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r7 = r14.mListAnchors
            r2 = r7[r2]
            int r7 = r2.getMargin()
            androidx.constraintlayout.core.SolverVariable r2 = r0.mSolverVariable
            androidx.constraintlayout.core.SolverVariable r8 = r1.mSolverVariable
            r10 = 5
            r0 = r39
            r1 = r2
            r2 = r3
            r3 = r6
            r6 = r8
            r8 = r10
            r0.addCentering(r1, r2, r3, r4, r5, r6, r7, r8)
        L589:
            return
    }

    public static void applyChainConstraints(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r6, androidx.constraintlayout.core.LinearSystem r7, java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r8, int r9) {
            r0 = 0
            if (r9 != 0) goto L9
            int r1 = r6.mHorizontalChainsSize
            androidx.constraintlayout.core.widgets.ChainHead[] r2 = r6.mHorizontalChainsArray
            r3 = r0
            goto Le
        L9:
            int r1 = r6.mVerticalChainsSize
            androidx.constraintlayout.core.widgets.ChainHead[] r2 = r6.mVerticalChainsArray
            r3 = 2
        Le:
            if (r0 >= r1) goto L27
            r4 = r2[r0]
            r4.define()
            if (r8 == 0) goto L21
            if (r8 == 0) goto L24
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = r4.mFirst
            boolean r5 = r8.contains(r5)
            if (r5 == 0) goto L24
        L21:
            applyChainConstraints(r6, r7, r9, r3, r4)
        L24:
            int r0 = r0 + 1
            goto Le
        L27:
            return
    }
}
