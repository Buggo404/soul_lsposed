package com.google.android.material.button;

/* loaded from: classes.dex */
public class MaterialButtonToggleGroup extends android.widget.LinearLayout {
    private static final int DEF_STYLE_RES = 0;
    private static final java.lang.String LOG_TAG = "MaterialButtonToggleGroup";
    private int checkedId;
    private final com.google.android.material.button.MaterialButtonToggleGroup.CheckedStateTracker checkedStateTracker;
    private java.lang.Integer[] childOrder;
    private final java.util.Comparator<com.google.android.material.button.MaterialButton> childOrderComparator;
    private final java.util.LinkedHashSet<com.google.android.material.button.MaterialButtonToggleGroup.OnButtonCheckedListener> onButtonCheckedListeners;
    private final java.util.List<com.google.android.material.button.MaterialButtonToggleGroup.CornerData> originalCornerData;
    private final com.google.android.material.button.MaterialButtonToggleGroup.PressedStateTracker pressedStateTracker;
    private boolean selectionRequired;
    private boolean singleSelection;
    private boolean skipCheckedStateTracker;



    private class CheckedStateTracker implements com.google.android.material.button.MaterialButton.OnCheckedChangeListener {
        final /* synthetic */ com.google.android.material.button.MaterialButtonToggleGroup this$0;

        private CheckedStateTracker(com.google.android.material.button.MaterialButtonToggleGroup r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        /* synthetic */ CheckedStateTracker(com.google.android.material.button.MaterialButtonToggleGroup r1, com.google.android.material.button.MaterialButtonToggleGroup.C05231 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.android.material.button.MaterialButton.OnCheckedChangeListener
        public void onCheckedChanged(com.google.android.material.button.MaterialButton r3, boolean r4) {
                r2 = this;
                com.google.android.material.button.MaterialButtonToggleGroup r0 = r2.this$0
                boolean r0 = com.google.android.material.button.MaterialButtonToggleGroup.access$300(r0)
                if (r0 == 0) goto L9
                return
            L9:
                com.google.android.material.button.MaterialButtonToggleGroup r0 = r2.this$0
                boolean r0 = com.google.android.material.button.MaterialButtonToggleGroup.access$400(r0)
                if (r0 == 0) goto L1e
                com.google.android.material.button.MaterialButtonToggleGroup r0 = r2.this$0
                if (r4 == 0) goto L1a
                int r1 = r3.getId()
                goto L1b
            L1a:
                r1 = -1
            L1b:
                com.google.android.material.button.MaterialButtonToggleGroup.access$502(r0, r1)
            L1e:
                com.google.android.material.button.MaterialButtonToggleGroup r0 = r2.this$0
                int r1 = r3.getId()
                boolean r4 = com.google.android.material.button.MaterialButtonToggleGroup.access$600(r0, r1, r4)
                if (r4 == 0) goto L37
                com.google.android.material.button.MaterialButtonToggleGroup r4 = r2.this$0
                int r0 = r3.getId()
                boolean r3 = r3.isChecked()
                com.google.android.material.button.MaterialButtonToggleGroup.access$700(r4, r0, r3)
            L37:
                com.google.android.material.button.MaterialButtonToggleGroup r3 = r2.this$0
                r3.invalidate()
                return
        }
    }

    private static class CornerData {
        private static final com.google.android.material.shape.CornerSize noCorner = null;
        com.google.android.material.shape.CornerSize bottomLeft;
        com.google.android.material.shape.CornerSize bottomRight;
        com.google.android.material.shape.CornerSize topLeft;
        com.google.android.material.shape.CornerSize topRight;

        static {
                com.google.android.material.shape.AbsoluteCornerSize r0 = new com.google.android.material.shape.AbsoluteCornerSize
                r1 = 0
                r0.<init>(r1)
                com.google.android.material.button.MaterialButtonToggleGroup.CornerData.noCorner = r0
                return
        }

        CornerData(com.google.android.material.shape.CornerSize r1, com.google.android.material.shape.CornerSize r2, com.google.android.material.shape.CornerSize r3, com.google.android.material.shape.CornerSize r4) {
                r0 = this;
                r0.<init>()
                r0.topLeft = r1
                r0.topRight = r3
                r0.bottomRight = r4
                r0.bottomLeft = r2
                return
        }

        public static com.google.android.material.button.MaterialButtonToggleGroup.CornerData bottom(com.google.android.material.button.MaterialButtonToggleGroup.CornerData r3) {
                com.google.android.material.button.MaterialButtonToggleGroup$CornerData r0 = new com.google.android.material.button.MaterialButtonToggleGroup$CornerData
                com.google.android.material.shape.CornerSize r1 = com.google.android.material.button.MaterialButtonToggleGroup.CornerData.noCorner
                com.google.android.material.shape.CornerSize r2 = r3.bottomLeft
                com.google.android.material.shape.CornerSize r3 = r3.bottomRight
                r0.<init>(r1, r2, r1, r3)
                return r0
        }

        public static com.google.android.material.button.MaterialButtonToggleGroup.CornerData end(com.google.android.material.button.MaterialButtonToggleGroup.CornerData r0, android.view.View r1) {
                boolean r1 = com.google.android.material.internal.ViewUtils.isLayoutRtl(r1)
                if (r1 == 0) goto Lb
                com.google.android.material.button.MaterialButtonToggleGroup$CornerData r0 = left(r0)
                goto Lf
            Lb:
                com.google.android.material.button.MaterialButtonToggleGroup$CornerData r0 = right(r0)
            Lf:
                return r0
        }

        public static com.google.android.material.button.MaterialButtonToggleGroup.CornerData left(com.google.android.material.button.MaterialButtonToggleGroup.CornerData r3) {
                com.google.android.material.button.MaterialButtonToggleGroup$CornerData r0 = new com.google.android.material.button.MaterialButtonToggleGroup$CornerData
                com.google.android.material.shape.CornerSize r1 = r3.topLeft
                com.google.android.material.shape.CornerSize r3 = r3.bottomLeft
                com.google.android.material.shape.CornerSize r2 = com.google.android.material.button.MaterialButtonToggleGroup.CornerData.noCorner
                r0.<init>(r1, r3, r2, r2)
                return r0
        }

        public static com.google.android.material.button.MaterialButtonToggleGroup.CornerData right(com.google.android.material.button.MaterialButtonToggleGroup.CornerData r3) {
                com.google.android.material.button.MaterialButtonToggleGroup$CornerData r0 = new com.google.android.material.button.MaterialButtonToggleGroup$CornerData
                com.google.android.material.shape.CornerSize r1 = com.google.android.material.button.MaterialButtonToggleGroup.CornerData.noCorner
                com.google.android.material.shape.CornerSize r2 = r3.topRight
                com.google.android.material.shape.CornerSize r3 = r3.bottomRight
                r0.<init>(r1, r1, r2, r3)
                return r0
        }

        public static com.google.android.material.button.MaterialButtonToggleGroup.CornerData start(com.google.android.material.button.MaterialButtonToggleGroup.CornerData r0, android.view.View r1) {
                boolean r1 = com.google.android.material.internal.ViewUtils.isLayoutRtl(r1)
                if (r1 == 0) goto Lb
                com.google.android.material.button.MaterialButtonToggleGroup$CornerData r0 = right(r0)
                goto Lf
            Lb:
                com.google.android.material.button.MaterialButtonToggleGroup$CornerData r0 = left(r0)
            Lf:
                return r0
        }

        public static com.google.android.material.button.MaterialButtonToggleGroup.CornerData top(com.google.android.material.button.MaterialButtonToggleGroup.CornerData r3) {
                com.google.android.material.button.MaterialButtonToggleGroup$CornerData r0 = new com.google.android.material.button.MaterialButtonToggleGroup$CornerData
                com.google.android.material.shape.CornerSize r1 = r3.topLeft
                com.google.android.material.shape.CornerSize r2 = com.google.android.material.button.MaterialButtonToggleGroup.CornerData.noCorner
                com.google.android.material.shape.CornerSize r3 = r3.topRight
                r0.<init>(r1, r2, r3, r2)
                return r0
        }
    }

    public interface OnButtonCheckedListener {
        void onButtonChecked(com.google.android.material.button.MaterialButtonToggleGroup r1, int r2, boolean r3);
    }

    private class PressedStateTracker implements com.google.android.material.button.MaterialButton.OnPressedChangeListener {
        final /* synthetic */ com.google.android.material.button.MaterialButtonToggleGroup this$0;

        private PressedStateTracker(com.google.android.material.button.MaterialButtonToggleGroup r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        /* synthetic */ PressedStateTracker(com.google.android.material.button.MaterialButtonToggleGroup r1, com.google.android.material.button.MaterialButtonToggleGroup.C05231 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.android.material.button.MaterialButton.OnPressedChangeListener
        public void onPressedChanged(com.google.android.material.button.MaterialButton r1, boolean r2) {
                r0 = this;
                com.google.android.material.button.MaterialButtonToggleGroup r1 = r0.this$0
                r1.invalidate()
                return
        }
    }

    static {
            int r0 = com.google.android.material.C0479R.style.Widget_MaterialComponents_MaterialButtonToggleGroup
            com.google.android.material.button.MaterialButtonToggleGroup.DEF_STYLE_RES = r0
            return
    }

    public MaterialButtonToggleGroup(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public MaterialButtonToggleGroup(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = com.google.android.material.C0479R.attr.materialButtonToggleGroupStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public MaterialButtonToggleGroup(android.content.Context r7, android.util.AttributeSet r8, int r9) {
            r6 = this;
            int r4 = com.google.android.material.button.MaterialButtonToggleGroup.DEF_STYLE_RES
            android.content.Context r7 = com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r6.originalCornerData = r7
            com.google.android.material.button.MaterialButtonToggleGroup$CheckedStateTracker r7 = new com.google.android.material.button.MaterialButtonToggleGroup$CheckedStateTracker
            r0 = 0
            r7.<init>(r6, r0)
            r6.checkedStateTracker = r7
            com.google.android.material.button.MaterialButtonToggleGroup$PressedStateTracker r7 = new com.google.android.material.button.MaterialButtonToggleGroup$PressedStateTracker
            r7.<init>(r6, r0)
            r6.pressedStateTracker = r7
            java.util.LinkedHashSet r7 = new java.util.LinkedHashSet
            r7.<init>()
            r6.onButtonCheckedListeners = r7
            com.google.android.material.button.MaterialButtonToggleGroup$1 r7 = new com.google.android.material.button.MaterialButtonToggleGroup$1
            r7.<init>(r6)
            r6.childOrderComparator = r7
            r7 = 0
            r6.skipCheckedStateTracker = r7
            android.content.Context r0 = r6.getContext()
            int[] r2 = com.google.android.material.C0479R.styleable.MaterialButtonToggleGroup
            int[] r5 = new int[r7]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(r0, r1, r2, r3, r4, r5)
            int r9 = com.google.android.material.C0479R.styleable.MaterialButtonToggleGroup_singleSelection
            boolean r9 = r8.getBoolean(r9, r7)
            r6.setSingleSelection(r9)
            int r9 = com.google.android.material.C0479R.styleable.MaterialButtonToggleGroup_checkedButton
            r0 = -1
            int r9 = r8.getResourceId(r9, r0)
            r6.checkedId = r9
            int r9 = com.google.android.material.C0479R.styleable.MaterialButtonToggleGroup_selectionRequired
            boolean r7 = r8.getBoolean(r9, r7)
            r6.selectionRequired = r7
            r7 = 1
            r6.setChildrenDrawingOrderEnabled(r7)
            r8.recycle()
            androidx.core.view.ViewCompat.setImportantForAccessibility(r6, r7)
            return
    }

    static /* synthetic */ int access$200(com.google.android.material.button.MaterialButtonToggleGroup r0, android.view.View r1) {
            int r0 = r0.getIndexWithinVisibleButtons(r1)
            return r0
    }

    static /* synthetic */ boolean access$300(com.google.android.material.button.MaterialButtonToggleGroup r0) {
            boolean r0 = r0.skipCheckedStateTracker
            return r0
    }

    static /* synthetic */ boolean access$400(com.google.android.material.button.MaterialButtonToggleGroup r0) {
            boolean r0 = r0.singleSelection
            return r0
    }

    static /* synthetic */ int access$502(com.google.android.material.button.MaterialButtonToggleGroup r0, int r1) {
            r0.checkedId = r1
            return r1
    }

    static /* synthetic */ boolean access$600(com.google.android.material.button.MaterialButtonToggleGroup r0, int r1, boolean r2) {
            boolean r0 = r0.updateCheckedStates(r1, r2)
            return r0
    }

    static /* synthetic */ void access$700(com.google.android.material.button.MaterialButtonToggleGroup r0, int r1, boolean r2) {
            r0.dispatchOnButtonChecked(r1, r2)
            return
    }

    private void adjustChildMarginsAndUpdateLayout() {
            r7 = this;
            int r0 = r7.getFirstVisibleChildIndex()
            r1 = -1
            if (r0 != r1) goto L8
            return
        L8:
            int r1 = r0 + 1
        La:
            int r2 = r7.getChildCount()
            if (r1 >= r2) goto L49
            com.google.android.material.button.MaterialButton r2 = r7.getChildButton(r1)
            int r3 = r1 + (-1)
            com.google.android.material.button.MaterialButton r3 = r7.getChildButton(r3)
            int r4 = r2.getStrokeWidth()
            int r3 = r3.getStrokeWidth()
            int r3 = java.lang.Math.min(r4, r3)
            android.widget.LinearLayout$LayoutParams r4 = r7.buildLayoutParams(r2)
            int r5 = r7.getOrientation()
            r6 = 0
            if (r5 != 0) goto L3b
            androidx.core.view.MarginLayoutParamsCompat.setMarginEnd(r4, r6)
            int r3 = -r3
            androidx.core.view.MarginLayoutParamsCompat.setMarginStart(r4, r3)
            r4.topMargin = r6
            goto L43
        L3b:
            r4.bottomMargin = r6
            int r3 = -r3
            r4.topMargin = r3
            androidx.core.view.MarginLayoutParamsCompat.setMarginStart(r4, r6)
        L43:
            r2.setLayoutParams(r4)
            int r1 = r1 + 1
            goto La
        L49:
            r7.resetChildMargins(r0)
            return
    }

    private android.widget.LinearLayout.LayoutParams buildLayoutParams(android.view.View r3) {
            r2 = this;
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            boolean r0 = r3 instanceof android.widget.LinearLayout.LayoutParams
            if (r0 == 0) goto Lb
            android.widget.LinearLayout$LayoutParams r3 = (android.widget.LinearLayout.LayoutParams) r3
            return r3
        Lb:
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            int r1 = r3.width
            int r3 = r3.height
            r0.<init>(r1, r3)
            return r0
    }

    private void checkForced(int r2) {
            r1 = this;
            r0 = 1
            r1.setCheckedStateForView(r2, r0)
            r1.updateCheckedStates(r2, r0)
            r1.setCheckedId(r2)
            return
    }

    private void dispatchOnButtonChecked(int r3, boolean r4) {
            r2 = this;
            java.util.LinkedHashSet<com.google.android.material.button.MaterialButtonToggleGroup$OnButtonCheckedListener> r0 = r2.onButtonCheckedListeners
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            com.google.android.material.button.MaterialButtonToggleGroup$OnButtonCheckedListener r1 = (com.google.android.material.button.MaterialButtonToggleGroup.OnButtonCheckedListener) r1
            r1.onButtonChecked(r2, r3, r4)
            goto L6
        L16:
            return
    }

    private com.google.android.material.button.MaterialButton getChildButton(int r1) {
            r0 = this;
            android.view.View r1 = r0.getChildAt(r1)
            com.google.android.material.button.MaterialButton r1 = (com.google.android.material.button.MaterialButton) r1
            return r1
    }

    private int getFirstVisibleChildIndex() {
            r3 = this;
            int r0 = r3.getChildCount()
            r1 = 0
        L5:
            if (r1 >= r0) goto L11
            boolean r2 = r3.isChildVisible(r1)
            if (r2 == 0) goto Le
            return r1
        Le:
            int r1 = r1 + 1
            goto L5
        L11:
            r0 = -1
            return r0
    }

    private int getIndexWithinVisibleButtons(android.view.View r5) {
            r4 = this;
            boolean r0 = r5 instanceof com.google.android.material.button.MaterialButton
            r1 = -1
            if (r0 != 0) goto L6
            return r1
        L6:
            r0 = 0
            r2 = r0
        L8:
            int r3 = r4.getChildCount()
            if (r0 >= r3) goto L28
            android.view.View r3 = r4.getChildAt(r0)
            if (r3 != r5) goto L15
            return r2
        L15:
            android.view.View r3 = r4.getChildAt(r0)
            boolean r3 = r3 instanceof com.google.android.material.button.MaterialButton
            if (r3 == 0) goto L25
            boolean r3 = r4.isChildVisible(r0)
            if (r3 == 0) goto L25
            int r2 = r2 + 1
        L25:
            int r0 = r0 + 1
            goto L8
        L28:
            return r1
    }

    private int getLastVisibleChildIndex() {
            r2 = this;
            int r0 = r2.getChildCount()
            int r0 = r0 + (-1)
        L6:
            if (r0 < 0) goto L12
            boolean r1 = r2.isChildVisible(r0)
            if (r1 == 0) goto Lf
            return r0
        Lf:
            int r0 = r0 + (-1)
            goto L6
        L12:
            r0 = -1
            return r0
    }

    private com.google.android.material.button.MaterialButtonToggleGroup.CornerData getNewCornerData(int r3, int r4, int r5) {
            r2 = this;
            java.util.List<com.google.android.material.button.MaterialButtonToggleGroup$CornerData> r0 = r2.originalCornerData
            java.lang.Object r0 = r0.get(r3)
            com.google.android.material.button.MaterialButtonToggleGroup$CornerData r0 = (com.google.android.material.button.MaterialButtonToggleGroup.CornerData) r0
            if (r4 != r5) goto Lb
            return r0
        Lb:
            int r1 = r2.getOrientation()
            if (r1 != 0) goto L13
            r1 = 1
            goto L14
        L13:
            r1 = 0
        L14:
            if (r3 != r4) goto L22
            if (r1 == 0) goto L1d
            com.google.android.material.button.MaterialButtonToggleGroup$CornerData r3 = com.google.android.material.button.MaterialButtonToggleGroup.CornerData.start(r0, r2)
            goto L21
        L1d:
            com.google.android.material.button.MaterialButtonToggleGroup$CornerData r3 = com.google.android.material.button.MaterialButtonToggleGroup.CornerData.top(r0)
        L21:
            return r3
        L22:
            if (r3 != r5) goto L30
            if (r1 == 0) goto L2b
            com.google.android.material.button.MaterialButtonToggleGroup$CornerData r3 = com.google.android.material.button.MaterialButtonToggleGroup.CornerData.end(r0, r2)
            goto L2f
        L2b:
            com.google.android.material.button.MaterialButtonToggleGroup$CornerData r3 = com.google.android.material.button.MaterialButtonToggleGroup.CornerData.bottom(r0)
        L2f:
            return r3
        L30:
            r3 = 0
            return r3
    }

    private int getVisibleButtonCount() {
            r3 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r3.getChildCount()
            if (r0 >= r2) goto L1b
            android.view.View r2 = r3.getChildAt(r0)
            boolean r2 = r2 instanceof com.google.android.material.button.MaterialButton
            if (r2 == 0) goto L18
            boolean r2 = r3.isChildVisible(r0)
            if (r2 == 0) goto L18
            int r1 = r1 + 1
        L18:
            int r0 = r0 + 1
            goto L2
        L1b:
            return r1
    }

    private boolean isChildVisible(int r2) {
            r1 = this;
            android.view.View r2 = r1.getChildAt(r2)
            int r2 = r2.getVisibility()
            r0 = 8
            if (r2 == r0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            return r2
    }

    private void resetChildMargins(int r4) {
            r3 = this;
            int r0 = r3.getChildCount()
            if (r0 == 0) goto L2b
            r0 = -1
            if (r4 != r0) goto La
            goto L2b
        La:
            com.google.android.material.button.MaterialButton r4 = r3.getChildButton(r4)
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r4 = (android.widget.LinearLayout.LayoutParams) r4
            int r0 = r3.getOrientation()
            r1 = 1
            r2 = 0
            if (r0 != r1) goto L21
            r4.topMargin = r2
            r4.bottomMargin = r2
            return
        L21:
            androidx.core.view.MarginLayoutParamsCompat.setMarginEnd(r4, r2)
            androidx.core.view.MarginLayoutParamsCompat.setMarginStart(r4, r2)
            r4.leftMargin = r2
            r4.rightMargin = r2
        L2b:
            return
    }

    private void setCheckedId(int r2) {
            r1 = this;
            r1.checkedId = r2
            r0 = 1
            r1.dispatchOnButtonChecked(r2, r0)
            return
    }

    private void setCheckedStateForView(int r2, boolean r3) {
            r1 = this;
            android.view.View r2 = r1.findViewById(r2)
            boolean r0 = r2 instanceof com.google.android.material.button.MaterialButton
            if (r0 == 0) goto L13
            r0 = 1
            r1.skipCheckedStateTracker = r0
            com.google.android.material.button.MaterialButton r2 = (com.google.android.material.button.MaterialButton) r2
            r2.setChecked(r3)
            r2 = 0
            r1.skipCheckedStateTracker = r2
        L13:
            return
    }

    private void setGeneratedIdIfNeeded(com.google.android.material.button.MaterialButton r3) {
            r2 = this;
            int r0 = r3.getId()
            r1 = -1
            if (r0 != r1) goto Le
            int r0 = androidx.core.view.ViewCompat.generateViewId()
            r3.setId(r0)
        Le:
            return
    }

    private void setupButtonChild(com.google.android.material.button.MaterialButton r3) {
            r2 = this;
            r0 = 1
            r3.setMaxLines(r0)
            android.text.TextUtils$TruncateAt r1 = android.text.TextUtils.TruncateAt.END
            r3.setEllipsize(r1)
            r3.setCheckable(r0)
            com.google.android.material.button.MaterialButtonToggleGroup$CheckedStateTracker r1 = r2.checkedStateTracker
            r3.addOnCheckedChangeListener(r1)
            com.google.android.material.button.MaterialButtonToggleGroup$PressedStateTracker r1 = r2.pressedStateTracker
            r3.setOnPressedChangeListenerInternal(r1)
            r3.setShouldDrawSurfaceColorStroke(r0)
            return
    }

    private static void updateBuilderWithCornerData(com.google.android.material.shape.ShapeAppearanceModel.Builder r1, com.google.android.material.button.MaterialButtonToggleGroup.CornerData r2) {
            if (r2 != 0) goto L7
            r2 = 0
            r1.setAllCornerSizes(r2)
            return
        L7:
            com.google.android.material.shape.CornerSize r0 = r2.topLeft
            com.google.android.material.shape.ShapeAppearanceModel$Builder r1 = r1.setTopLeftCornerSize(r0)
            com.google.android.material.shape.CornerSize r0 = r2.bottomLeft
            com.google.android.material.shape.ShapeAppearanceModel$Builder r1 = r1.setBottomLeftCornerSize(r0)
            com.google.android.material.shape.CornerSize r0 = r2.topRight
            com.google.android.material.shape.ShapeAppearanceModel$Builder r1 = r1.setTopRightCornerSize(r0)
            com.google.android.material.shape.CornerSize r2 = r2.bottomRight
            r1.setBottomRightCornerSize(r2)
            return
    }

    private boolean updateCheckedStates(int r5, boolean r6) {
            r4 = this;
            java.util.List r0 = r4.getCheckedButtonIds()
            boolean r1 = r4.selectionRequired
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L16
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L16
            r4.setCheckedStateForView(r5, r2)
            r4.checkedId = r5
            return r3
        L16:
            if (r6 == 0) goto L3e
            boolean r6 = r4.singleSelection
            if (r6 == 0) goto L3e
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0.remove(r5)
            java.util.Iterator r5 = r0.iterator()
        L27:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L3e
            java.lang.Object r6 = r5.next()
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r4.setCheckedStateForView(r6, r3)
            r4.dispatchOnButtonChecked(r6, r3)
            goto L27
        L3e:
            return r2
    }

    private void updateChildOrder() {
            r6 = this;
            java.util.TreeMap r0 = new java.util.TreeMap
            java.util.Comparator<com.google.android.material.button.MaterialButton> r1 = r6.childOrderComparator
            r0.<init>(r1)
            int r1 = r6.getChildCount()
            r2 = 0
            r3 = r2
        Ld:
            if (r3 >= r1) goto L1d
            com.google.android.material.button.MaterialButton r4 = r6.getChildButton(r3)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            r0.put(r4, r5)
            int r3 = r3 + 1
            goto Ld
        L1d:
            java.util.Collection r0 = r0.values()
            java.lang.Integer[] r1 = new java.lang.Integer[r2]
            java.lang.Object[] r0 = r0.toArray(r1)
            java.lang.Integer[] r0 = (java.lang.Integer[]) r0
            r6.childOrder = r0
            return
    }

    public void addOnButtonCheckedListener(com.google.android.material.button.MaterialButtonToggleGroup.OnButtonCheckedListener r2) {
            r1 = this;
            java.util.LinkedHashSet<com.google.android.material.button.MaterialButtonToggleGroup$OnButtonCheckedListener> r0 = r1.onButtonCheckedListeners
            r0.add(r2)
            return
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View r5, int r6, android.view.ViewGroup.LayoutParams r7) {
            r4 = this;
            boolean r0 = r5 instanceof com.google.android.material.button.MaterialButton
            if (r0 != 0) goto Lc
            java.lang.String r5 = com.google.android.material.button.MaterialButtonToggleGroup.LOG_TAG
            java.lang.String r6 = "Child views must be of type MaterialButton."
            android.util.Log.e(r5, r6)
            return
        Lc:
            super.addView(r5, r6, r7)
            com.google.android.material.button.MaterialButton r5 = (com.google.android.material.button.MaterialButton) r5
            r4.setGeneratedIdIfNeeded(r5)
            r4.setupButtonChild(r5)
            boolean r6 = r5.isChecked()
            if (r6 == 0) goto L2c
            int r6 = r5.getId()
            r7 = 1
            r4.updateCheckedStates(r6, r7)
            int r6 = r5.getId()
            r4.setCheckedId(r6)
        L2c:
            com.google.android.material.shape.ShapeAppearanceModel r6 = r5.getShapeAppearanceModel()
            java.util.List<com.google.android.material.button.MaterialButtonToggleGroup$CornerData> r7 = r4.originalCornerData
            com.google.android.material.button.MaterialButtonToggleGroup$CornerData r0 = new com.google.android.material.button.MaterialButtonToggleGroup$CornerData
            com.google.android.material.shape.CornerSize r1 = r6.getTopLeftCornerSize()
            com.google.android.material.shape.CornerSize r2 = r6.getBottomLeftCornerSize()
            com.google.android.material.shape.CornerSize r3 = r6.getTopRightCornerSize()
            com.google.android.material.shape.CornerSize r6 = r6.getBottomRightCornerSize()
            r0.<init>(r1, r2, r3, r6)
            r7.add(r0)
            com.google.android.material.button.MaterialButtonToggleGroup$2 r6 = new com.google.android.material.button.MaterialButtonToggleGroup$2
            r6.<init>(r4)
            androidx.core.view.ViewCompat.setAccessibilityDelegate(r5, r6)
            return
    }

    public void check(int r2) {
            r1 = this;
            int r0 = r1.checkedId
            if (r2 != r0) goto L5
            return
        L5:
            r1.checkForced(r2)
            return
    }

    public void clearChecked() {
            r3 = this;
            r0 = 1
            r3.skipCheckedStateTracker = r0
            r0 = 0
            r1 = r0
        L5:
            int r2 = r3.getChildCount()
            if (r1 >= r2) goto L1c
            com.google.android.material.button.MaterialButton r2 = r3.getChildButton(r1)
            r2.setChecked(r0)
            int r2 = r2.getId()
            r3.dispatchOnButtonChecked(r2, r0)
            int r1 = r1 + 1
            goto L5
        L1c:
            r3.skipCheckedStateTracker = r0
            r0 = -1
            r3.setCheckedId(r0)
            return
    }

    public void clearOnButtonCheckedListeners() {
            r1 = this;
            java.util.LinkedHashSet<com.google.android.material.button.MaterialButtonToggleGroup$OnButtonCheckedListener> r0 = r1.onButtonCheckedListeners
            r0.clear()
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(android.graphics.Canvas r1) {
            r0 = this;
            r0.updateChildOrder()
            super.dispatchDraw(r1)
            return
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public java.lang.CharSequence getAccessibilityClassName() {
            r1 = this;
            java.lang.Class<com.google.android.material.button.MaterialButtonToggleGroup> r0 = com.google.android.material.button.MaterialButtonToggleGroup.class
            java.lang.String r0 = r0.getName()
            return r0
    }

    public int getCheckedButtonId() {
            r1 = this;
            boolean r0 = r1.singleSelection
            if (r0 == 0) goto L7
            int r0 = r1.checkedId
            goto L8
        L7:
            r0 = -1
        L8:
            return r0
    }

    public java.util.List<java.lang.Integer> getCheckedButtonIds() {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r4.getChildCount()
            if (r1 >= r2) goto L24
            com.google.android.material.button.MaterialButton r2 = r4.getChildButton(r1)
            boolean r3 = r2.isChecked()
            if (r3 == 0) goto L21
            int r2 = r2.getId()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.add(r2)
        L21:
            int r1 = r1 + 1
            goto L6
        L24:
            return r0
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int r2, int r3) {
            r1 = this;
            java.lang.Integer[] r2 = r1.childOrder
            if (r2 == 0) goto Lf
            int r0 = r2.length
            if (r3 < r0) goto L8
            goto Lf
        L8:
            r2 = r2[r3]
            int r2 = r2.intValue()
            return r2
        Lf:
            java.lang.String r2 = com.google.android.material.button.MaterialButtonToggleGroup.LOG_TAG
            java.lang.String r0 = "Child order wasn't updated"
            android.util.Log.w(r2, r0)
            return r3
    }

    public boolean isSelectionRequired() {
            r1 = this;
            boolean r0 = r1.selectionRequired
            return r0
    }

    public boolean isSingleSelection() {
            r1 = this;
            boolean r0 = r1.singleSelection
            return r0
    }

    @Override // android.view.View
    protected void onFinishInflate() {
            r2 = this;
            super.onFinishInflate()
            int r0 = r2.checkedId
            r1 = -1
            if (r0 == r1) goto Lb
            r2.checkForced(r0)
        Lb:
            return
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r5) {
            r4 = this;
            super.onInitializeAccessibilityNodeInfo(r5)
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r5 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.wrap(r5)
            int r0 = r4.getVisibleButtonCount()
            boolean r1 = r4.isSingleSelection()
            r2 = 1
            if (r1 == 0) goto L14
            r1 = r2
            goto L15
        L14:
            r1 = 2
        L15:
            r3 = 0
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$CollectionInfoCompat r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(r2, r0, r3, r1)
            r5.setCollectionInfo(r0)
            return
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int r1, int r2) {
            r0 = this;
            r0.updateChildShapes()
            r0.adjustChildMarginsAndUpdateLayout()
            super.onMeasure(r1, r2)
            return
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(android.view.View r3) {
            r2 = this;
            super.onViewRemoved(r3)
            boolean r0 = r3 instanceof com.google.android.material.button.MaterialButton
            if (r0 == 0) goto L13
            r0 = r3
            com.google.android.material.button.MaterialButton r0 = (com.google.android.material.button.MaterialButton) r0
            com.google.android.material.button.MaterialButtonToggleGroup$CheckedStateTracker r1 = r2.checkedStateTracker
            r0.removeOnCheckedChangeListener(r1)
            r1 = 0
            r0.setOnPressedChangeListenerInternal(r1)
        L13:
            int r3 = r2.indexOfChild(r3)
            if (r3 < 0) goto L1e
            java.util.List<com.google.android.material.button.MaterialButtonToggleGroup$CornerData> r0 = r2.originalCornerData
            r0.remove(r3)
        L1e:
            r2.updateChildShapes()
            r2.adjustChildMarginsAndUpdateLayout()
            return
    }

    public void removeOnButtonCheckedListener(com.google.android.material.button.MaterialButtonToggleGroup.OnButtonCheckedListener r2) {
            r1 = this;
            java.util.LinkedHashSet<com.google.android.material.button.MaterialButtonToggleGroup$OnButtonCheckedListener> r0 = r1.onButtonCheckedListeners
            r0.remove(r2)
            return
    }

    public void setSelectionRequired(boolean r1) {
            r0 = this;
            r0.selectionRequired = r1
            return
    }

    public void setSingleSelection(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            boolean r2 = r0.getBoolean(r2)
            r1.setSingleSelection(r2)
            return
    }

    public void setSingleSelection(boolean r2) {
            r1 = this;
            boolean r0 = r1.singleSelection
            if (r0 == r2) goto L9
            r1.singleSelection = r2
            r1.clearChecked()
        L9:
            return
    }

    public void uncheck(int r3) {
            r2 = this;
            r0 = 0
            r2.setCheckedStateForView(r3, r0)
            r2.updateCheckedStates(r3, r0)
            r1 = -1
            r2.checkedId = r1
            r2.dispatchOnButtonChecked(r3, r0)
            return
    }

    void updateChildShapes() {
            r7 = this;
            int r0 = r7.getChildCount()
            int r1 = r7.getFirstVisibleChildIndex()
            int r2 = r7.getLastVisibleChildIndex()
            r3 = 0
        Ld:
            if (r3 >= r0) goto L35
            com.google.android.material.button.MaterialButton r4 = r7.getChildButton(r3)
            int r5 = r4.getVisibility()
            r6 = 8
            if (r5 != r6) goto L1c
            goto L32
        L1c:
            com.google.android.material.shape.ShapeAppearanceModel r5 = r4.getShapeAppearanceModel()
            com.google.android.material.shape.ShapeAppearanceModel$Builder r5 = r5.toBuilder()
            com.google.android.material.button.MaterialButtonToggleGroup$CornerData r6 = r7.getNewCornerData(r3, r1, r2)
            updateBuilderWithCornerData(r5, r6)
            com.google.android.material.shape.ShapeAppearanceModel r5 = r5.build()
            r4.setShapeAppearanceModel(r5)
        L32:
            int r3 = r3 + 1
            goto Ld
        L35:
            return
    }
}
