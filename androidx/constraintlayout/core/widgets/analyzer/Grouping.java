package androidx.constraintlayout.core.widgets.analyzer;

/* loaded from: classes.dex */
public class Grouping {
    private static final boolean DEBUG = false;
    private static final boolean DEBUG_GROUPING = false;

    public Grouping() {
            r0 = this;
            r0.<init>()
            return
    }

    public static androidx.constraintlayout.core.widgets.analyzer.WidgetGroup findDependents(androidx.constraintlayout.core.widgets.ConstraintWidget r6, int r7, java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetGroup> r8, androidx.constraintlayout.core.widgets.analyzer.WidgetGroup r9) {
            if (r7 != 0) goto L5
            int r0 = r6.horizontalGroup
            goto L7
        L5:
            int r0 = r6.verticalGroup
        L7:
            r1 = 0
            r2 = -1
            if (r0 == r2) goto L31
            if (r9 == 0) goto L11
            int r3 = r9.f47id
            if (r0 == r3) goto L31
        L11:
            r3 = r1
        L12:
            int r4 = r8.size()
            if (r3 >= r4) goto L34
            java.lang.Object r4 = r8.get(r3)
            androidx.constraintlayout.core.widgets.analyzer.WidgetGroup r4 = (androidx.constraintlayout.core.widgets.analyzer.WidgetGroup) r4
            int r5 = r4.getId()
            if (r5 != r0) goto L2e
            if (r9 == 0) goto L2c
            r9.moveTo(r7, r4)
            r8.remove(r9)
        L2c:
            r9 = r4
            goto L34
        L2e:
            int r3 = r3 + 1
            goto L12
        L31:
            if (r0 == r2) goto L34
            return r9
        L34:
            if (r9 != 0) goto L65
            boolean r0 = r6 instanceof androidx.constraintlayout.core.widgets.HelperWidget
            if (r0 == 0) goto L5b
            r0 = r6
            androidx.constraintlayout.core.widgets.HelperWidget r0 = (androidx.constraintlayout.core.widgets.HelperWidget) r0
            int r0 = r0.findGroupInDependents(r7)
            if (r0 == r2) goto L5b
            r2 = r1
        L44:
            int r3 = r8.size()
            if (r2 >= r3) goto L5b
            java.lang.Object r3 = r8.get(r2)
            androidx.constraintlayout.core.widgets.analyzer.WidgetGroup r3 = (androidx.constraintlayout.core.widgets.analyzer.WidgetGroup) r3
            int r4 = r3.getId()
            if (r4 != r0) goto L58
            r9 = r3
            goto L5b
        L58:
            int r2 = r2 + 1
            goto L44
        L5b:
            if (r9 != 0) goto L62
            androidx.constraintlayout.core.widgets.analyzer.WidgetGroup r9 = new androidx.constraintlayout.core.widgets.analyzer.WidgetGroup
            r9.<init>(r7)
        L62:
            r8.add(r9)
        L65:
            boolean r0 = r9.add(r6)
            if (r0 == 0) goto Lad
            boolean r0 = r6 instanceof androidx.constraintlayout.core.widgets.Guideline
            if (r0 == 0) goto L80
            r0 = r6
            androidx.constraintlayout.core.widgets.Guideline r0 = (androidx.constraintlayout.core.widgets.Guideline) r0
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r0.getAnchor()
            int r0 = r0.getOrientation()
            if (r0 != 0) goto L7d
            r1 = 1
        L7d:
            r2.findDependents(r1, r8, r9)
        L80:
            if (r7 != 0) goto L93
            int r0 = r9.getId()
            r6.horizontalGroup = r0
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r6.mLeft
            r0.findDependents(r7, r8, r9)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r6.mRight
            r0.findDependents(r7, r8, r9)
            goto La8
        L93:
            int r0 = r9.getId()
            r6.verticalGroup = r0
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r6.mTop
            r0.findDependents(r7, r8, r9)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r6.mBaseline
            r0.findDependents(r7, r8, r9)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r6.mBottom
            r0.findDependents(r7, r8, r9)
        La8:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r6.mCenter
            r6.findDependents(r7, r8, r9)
        Lad:
            return r9
    }

    private static androidx.constraintlayout.core.widgets.analyzer.WidgetGroup findGroup(java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetGroup> r4, int r5) {
            int r0 = r4.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L15
            java.lang.Object r2 = r4.get(r1)
            androidx.constraintlayout.core.widgets.analyzer.WidgetGroup r2 = (androidx.constraintlayout.core.widgets.analyzer.WidgetGroup) r2
            int r3 = r2.f47id
            if (r5 != r3) goto L12
            return r2
        L12:
            int r1 = r1 + 1
            goto L5
        L15:
            r4 = 0
            return r4
    }

    public static boolean simpleSolvingPass(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r16, androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer r17) {
            r0 = r16
            java.util.ArrayList r1 = r16.getChildren()
            int r2 = r1.size()
            r3 = 0
            r4 = r3
        Lc:
            if (r4 >= r2) goto L33
            java.lang.Object r5 = r1.get(r4)
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r5
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = r16.getHorizontalDimensionBehaviour()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = r16.getVerticalDimensionBehaviour()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = r5.getHorizontalDimensionBehaviour()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r9 = r5.getVerticalDimensionBehaviour()
            boolean r6 = validInGroup(r6, r7, r8, r9)
            if (r6 != 0) goto L2b
            return r3
        L2b:
            boolean r5 = r5 instanceof androidx.constraintlayout.core.widgets.Flow
            if (r5 == 0) goto L30
            return r3
        L30:
            int r4 = r4 + 1
            goto Lc
        L33:
            androidx.constraintlayout.core.Metrics r4 = r0.mMetrics
            if (r4 == 0) goto L40
            androidx.constraintlayout.core.Metrics r4 = r0.mMetrics
            long r5 = r4.grouping
            r7 = 1
            long r5 = r5 + r7
            r4.grouping = r5
        L40:
            r5 = r3
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
        L47:
            if (r5 >= r2) goto L121
            java.lang.Object r13 = r1.get(r5)
            androidx.constraintlayout.core.widgets.ConstraintWidget r13 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r13
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r14 = r16.getHorizontalDimensionBehaviour()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r15 = r16.getVerticalDimensionBehaviour()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = r13.getHorizontalDimensionBehaviour()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r12 = r13.getVerticalDimensionBehaviour()
            boolean r4 = validInGroup(r14, r15, r4, r12)
            if (r4 != 0) goto L6f
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r4 = r0.mMeasure
            int r12 = androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.SELF_DIMENSIONS
            r14 = r17
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer.measure(r3, r13, r14, r4, r12)
            goto L71
        L6f:
            r14 = r17
        L71:
            boolean r4 = r13 instanceof androidx.constraintlayout.core.widgets.Guideline
            if (r4 == 0) goto L99
            r12 = r13
            androidx.constraintlayout.core.widgets.Guideline r12 = (androidx.constraintlayout.core.widgets.Guideline) r12
            int r15 = r12.getOrientation()
            if (r15 != 0) goto L88
            if (r8 != 0) goto L85
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
        L85:
            r8.add(r12)
        L88:
            int r15 = r12.getOrientation()
            r3 = 1
            if (r15 != r3) goto L99
            if (r6 != 0) goto L96
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L96:
            r6.add(r12)
        L99:
            boolean r3 = r13 instanceof androidx.constraintlayout.core.widgets.HelperWidget
            if (r3 == 0) goto Ldd
            boolean r3 = r13 instanceof androidx.constraintlayout.core.widgets.Barrier
            if (r3 == 0) goto Lc6
            r3 = r13
            androidx.constraintlayout.core.widgets.Barrier r3 = (androidx.constraintlayout.core.widgets.Barrier) r3
            int r12 = r3.getOrientation()
            if (r12 != 0) goto Lb4
            if (r7 != 0) goto Lb1
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        Lb1:
            r7.add(r3)
        Lb4:
            int r12 = r3.getOrientation()
            r15 = 1
            if (r12 != r15) goto Ldd
            if (r9 != 0) goto Lc2
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
        Lc2:
            r9.add(r3)
            goto Ldd
        Lc6:
            r3 = r13
            androidx.constraintlayout.core.widgets.HelperWidget r3 = (androidx.constraintlayout.core.widgets.HelperWidget) r3
            if (r7 != 0) goto Ld0
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        Ld0:
            r7.add(r3)
            if (r9 != 0) goto Lda
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
        Lda:
            r9.add(r3)
        Ldd:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r13.mLeft
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.mTarget
            if (r3 != 0) goto Lf9
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r13.mRight
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.mTarget
            if (r3 != 0) goto Lf9
            if (r4 != 0) goto Lf9
            boolean r3 = r13 instanceof androidx.constraintlayout.core.widgets.Barrier
            if (r3 != 0) goto Lf9
            if (r10 != 0) goto Lf6
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
        Lf6:
            r10.add(r13)
        Lf9:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r13.mTop
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.mTarget
            if (r3 != 0) goto L11c
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r13.mBottom
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.mTarget
            if (r3 != 0) goto L11c
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r13.mBaseline
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.mTarget
            if (r3 != 0) goto L11c
            if (r4 != 0) goto L11c
            boolean r3 = r13 instanceof androidx.constraintlayout.core.widgets.Barrier
            if (r3 != 0) goto L11c
            if (r11 != 0) goto L119
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r11 = r3
        L119:
            r11.add(r13)
        L11c:
            int r5 = r5 + 1
            r3 = 0
            goto L47
        L121:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            if (r6 == 0) goto L13e
            java.util.Iterator r4 = r6.iterator()
        L12c:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L13e
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.core.widgets.Guideline r5 = (androidx.constraintlayout.core.widgets.Guideline) r5
            r6 = 0
            r12 = 0
            findDependents(r5, r12, r3, r6)
            goto L12c
        L13e:
            r6 = 0
            r12 = 0
            if (r7 == 0) goto L15f
            java.util.Iterator r4 = r7.iterator()
        L146:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L15f
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.core.widgets.HelperWidget r5 = (androidx.constraintlayout.core.widgets.HelperWidget) r5
            androidx.constraintlayout.core.widgets.analyzer.WidgetGroup r7 = findDependents(r5, r12, r3, r6)
            r5.addDependents(r3, r12, r7)
            r7.cleanup(r3)
            r6 = 0
            r12 = 0
            goto L146
        L15f:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r0.getAnchor(r4)
            java.util.HashSet r5 = r4.getDependents()
            if (r5 == 0) goto L187
            java.util.HashSet r4 = r4.getDependents()
            java.util.Iterator r4 = r4.iterator()
        L173:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L187
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r5
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = r5.mOwner
            r6 = 0
            r7 = 0
            findDependents(r5, r7, r3, r6)
            goto L173
        L187:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r0.getAnchor(r4)
            java.util.HashSet r5 = r4.getDependents()
            if (r5 == 0) goto L1af
            java.util.HashSet r4 = r4.getDependents()
            java.util.Iterator r4 = r4.iterator()
        L19b:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L1af
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r5
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = r5.mOwner
            r6 = 0
            r7 = 0
            findDependents(r5, r7, r3, r6)
            goto L19b
        L1af:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r0.getAnchor(r4)
            java.util.HashSet r5 = r4.getDependents()
            if (r5 == 0) goto L1d7
            java.util.HashSet r4 = r4.getDependents()
            java.util.Iterator r4 = r4.iterator()
        L1c3:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L1d7
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r5
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = r5.mOwner
            r6 = 0
            r7 = 0
            findDependents(r5, r7, r3, r6)
            goto L1c3
        L1d7:
            r6 = 0
            r7 = 0
            if (r10 == 0) goto L1ef
            java.util.Iterator r4 = r10.iterator()
        L1df:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L1ef
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r5
            findDependents(r5, r7, r3, r6)
            goto L1df
        L1ef:
            if (r8 == 0) goto L206
            java.util.Iterator r4 = r8.iterator()
        L1f5:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L206
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.core.widgets.Guideline r5 = (androidx.constraintlayout.core.widgets.Guideline) r5
            r7 = 1
            findDependents(r5, r7, r3, r6)
            goto L1f5
        L206:
            r7 = 1
            if (r9 == 0) goto L226
            java.util.Iterator r4 = r9.iterator()
        L20d:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L226
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.core.widgets.HelperWidget r5 = (androidx.constraintlayout.core.widgets.HelperWidget) r5
            androidx.constraintlayout.core.widgets.analyzer.WidgetGroup r8 = findDependents(r5, r7, r3, r6)
            r5.addDependents(r3, r7, r8)
            r8.cleanup(r3)
            r6 = 0
            r7 = 1
            goto L20d
        L226:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r0.getAnchor(r4)
            java.util.HashSet r5 = r4.getDependents()
            if (r5 == 0) goto L24e
            java.util.HashSet r4 = r4.getDependents()
            java.util.Iterator r4 = r4.iterator()
        L23a:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L24e
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r5
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = r5.mOwner
            r6 = 1
            r7 = 0
            findDependents(r5, r6, r3, r7)
            goto L23a
        L24e:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r0.getAnchor(r4)
            java.util.HashSet r5 = r4.getDependents()
            if (r5 == 0) goto L276
            java.util.HashSet r4 = r4.getDependents()
            java.util.Iterator r4 = r4.iterator()
        L262:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L276
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r5
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = r5.mOwner
            r6 = 1
            r7 = 0
            findDependents(r5, r6, r3, r7)
            goto L262
        L276:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r0.getAnchor(r4)
            java.util.HashSet r5 = r4.getDependents()
            if (r5 == 0) goto L29e
            java.util.HashSet r4 = r4.getDependents()
            java.util.Iterator r4 = r4.iterator()
        L28a:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L29e
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r5
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = r5.mOwner
            r6 = 1
            r7 = 0
            findDependents(r5, r6, r3, r7)
            goto L28a
        L29e:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r0.getAnchor(r4)
            java.util.HashSet r5 = r4.getDependents()
            if (r5 == 0) goto L2c6
            java.util.HashSet r4 = r4.getDependents()
            java.util.Iterator r4 = r4.iterator()
        L2b2:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L2c6
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r5
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = r5.mOwner
            r6 = 0
            r7 = 1
            findDependents(r5, r7, r3, r6)
            goto L2b2
        L2c6:
            r6 = 0
            r7 = 1
            if (r11 == 0) goto L2de
            java.util.Iterator r4 = r11.iterator()
        L2ce:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L2de
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r5
            findDependents(r5, r7, r3, r6)
            goto L2ce
        L2de:
            r4 = 0
        L2df:
            if (r4 >= r2) goto L30b
            java.lang.Object r5 = r1.get(r4)
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r5
            boolean r7 = r5.oppositeDimensionsTied()
            if (r7 == 0) goto L308
            int r7 = r5.horizontalGroup
            androidx.constraintlayout.core.widgets.analyzer.WidgetGroup r7 = findGroup(r3, r7)
            int r5 = r5.verticalGroup
            androidx.constraintlayout.core.widgets.analyzer.WidgetGroup r5 = findGroup(r3, r5)
            if (r7 == 0) goto L308
            if (r5 == 0) goto L308
            r8 = 0
            r7.moveTo(r8, r5)
            r8 = 2
            r5.setOrientation(r8)
            r3.remove(r7)
        L308:
            int r4 = r4 + 1
            goto L2df
        L30b:
            int r1 = r3.size()
            r2 = 1
            if (r1 > r2) goto L314
            r1 = 0
            return r1
        L314:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = r16.getHorizontalDimensionBehaviour()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r1 != r2) goto L356
            java.util.Iterator r1 = r3.iterator()
            r2 = r6
            r12 = 0
        L322:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L347
            java.lang.Object r4 = r1.next()
            androidx.constraintlayout.core.widgets.analyzer.WidgetGroup r4 = (androidx.constraintlayout.core.widgets.analyzer.WidgetGroup) r4
            int r5 = r4.getOrientation()
            r7 = 1
            if (r5 != r7) goto L336
            goto L322
        L336:
            r5 = 0
            r4.setAuthoritative(r5)
            androidx.constraintlayout.core.LinearSystem r7 = r16.getSystem()
            int r7 = r4.measureWrap(r7, r5)
            if (r7 <= r12) goto L322
            r2 = r4
            r12 = r7
            goto L322
        L347:
            if (r2 == 0) goto L356
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r0.setHorizontalDimensionBehaviour(r1)
            r0.setWidth(r12)
            r1 = 1
            r2.setAuthoritative(r1)
            goto L357
        L356:
            r2 = r6
        L357:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = r16.getVerticalDimensionBehaviour()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r1 != r4) goto L39b
            java.util.Iterator r1 = r3.iterator()
            r3 = r6
            r12 = 0
        L365:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L38a
            java.lang.Object r4 = r1.next()
            androidx.constraintlayout.core.widgets.analyzer.WidgetGroup r4 = (androidx.constraintlayout.core.widgets.analyzer.WidgetGroup) r4
            int r5 = r4.getOrientation()
            if (r5 != 0) goto L378
            goto L365
        L378:
            r5 = 0
            r4.setAuthoritative(r5)
            androidx.constraintlayout.core.LinearSystem r7 = r16.getSystem()
            r8 = 1
            int r7 = r4.measureWrap(r7, r8)
            if (r7 <= r12) goto L365
            r3 = r4
            r12 = r7
            goto L365
        L38a:
            r5 = 0
            r8 = 1
            if (r3 == 0) goto L39d
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r0.setVerticalDimensionBehaviour(r1)
            r0.setHeight(r12)
            r3.setAuthoritative(r8)
            r4 = r3
            goto L39e
        L39b:
            r5 = 0
            r8 = 1
        L39d:
            r4 = r6
        L39e:
            if (r2 != 0) goto L3a5
            if (r4 == 0) goto L3a3
            goto L3a5
        L3a3:
            r3 = r5
            goto L3a6
        L3a5:
            r3 = r8
        L3a6:
            return r3
    }

    public static boolean validInGroup(androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour r3, androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour r4, androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour r5, androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour r6) {
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r1 = 0
            r2 = 1
            if (r5 == r0) goto L15
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r5 == r0) goto L15
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r5 != r0) goto L13
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r3 == r5) goto L13
            goto L15
        L13:
            r3 = r1
            goto L16
        L15:
            r3 = r2
        L16:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r6 == r5) goto L29
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r6 == r5) goto L29
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r6 != r5) goto L27
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r4 == r5) goto L27
            goto L29
        L27:
            r4 = r1
            goto L2a
        L29:
            r4 = r2
        L2a:
            if (r3 != 0) goto L30
            if (r4 == 0) goto L2f
            goto L30
        L2f:
            return r1
        L30:
            return r2
    }
}
