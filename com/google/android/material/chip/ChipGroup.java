package com.google.android.material.chip;

/* loaded from: classes.dex */
public class ChipGroup extends com.google.android.material.internal.FlowLayout {
    private static final int DEF_STYLE_RES = 0;
    private int checkedId;
    private final com.google.android.material.chip.ChipGroup.CheckedStateTracker checkedStateTracker;
    private int chipSpacingHorizontal;
    private int chipSpacingVertical;
    private com.google.android.material.chip.ChipGroup.OnCheckedChangeListener onCheckedChangeListener;
    private com.google.android.material.chip.ChipGroup.PassThroughHierarchyChangeListener passThroughListener;
    private boolean protectFromCheckedChange;
    private boolean selectionRequired;
    private boolean singleSelection;

    /* renamed from: com.google.android.material.chip.ChipGroup$1 */
    static /* synthetic */ class C05281 {
    }

    private class CheckedStateTracker implements android.widget.CompoundButton.OnCheckedChangeListener {
        final /* synthetic */ com.google.android.material.chip.ChipGroup this$0;

        private CheckedStateTracker(com.google.android.material.chip.ChipGroup r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        /* synthetic */ CheckedStateTracker(com.google.android.material.chip.ChipGroup r1, com.google.android.material.chip.ChipGroup.C05281 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(android.widget.CompoundButton r4, boolean r5) {
                r3 = this;
                com.google.android.material.chip.ChipGroup r0 = r3.this$0
                boolean r0 = com.google.android.material.chip.ChipGroup.access$300(r0)
                if (r0 == 0) goto L9
                return
            L9:
                com.google.android.material.chip.ChipGroup r0 = r3.this$0
                java.util.List r0 = r0.getCheckedChipIds()
                boolean r0 = r0.isEmpty()
                r1 = 0
                if (r0 == 0) goto L32
                com.google.android.material.chip.ChipGroup r0 = r3.this$0
                boolean r0 = com.google.android.material.chip.ChipGroup.access$400(r0)
                if (r0 == 0) goto L32
                com.google.android.material.chip.ChipGroup r5 = r3.this$0
                int r0 = r4.getId()
                r2 = 1
                com.google.android.material.chip.ChipGroup.access$500(r5, r0, r2)
                com.google.android.material.chip.ChipGroup r5 = r3.this$0
                int r4 = r4.getId()
                com.google.android.material.chip.ChipGroup.access$600(r5, r4, r1)
                return
            L32:
                int r4 = r4.getId()
                r0 = -1
                if (r5 == 0) goto L60
                com.google.android.material.chip.ChipGroup r5 = r3.this$0
                int r5 = com.google.android.material.chip.ChipGroup.access$700(r5)
                if (r5 == r0) goto L5a
                com.google.android.material.chip.ChipGroup r5 = r3.this$0
                int r5 = com.google.android.material.chip.ChipGroup.access$700(r5)
                if (r5 == r4) goto L5a
                com.google.android.material.chip.ChipGroup r5 = r3.this$0
                boolean r5 = com.google.android.material.chip.ChipGroup.access$800(r5)
                if (r5 == 0) goto L5a
                com.google.android.material.chip.ChipGroup r5 = r3.this$0
                int r0 = com.google.android.material.chip.ChipGroup.access$700(r5)
                com.google.android.material.chip.ChipGroup.access$500(r5, r0, r1)
            L5a:
                com.google.android.material.chip.ChipGroup r5 = r3.this$0
                com.google.android.material.chip.ChipGroup.access$900(r5, r4)
                goto L6d
            L60:
                com.google.android.material.chip.ChipGroup r5 = r3.this$0
                int r5 = com.google.android.material.chip.ChipGroup.access$700(r5)
                if (r5 != r4) goto L6d
                com.google.android.material.chip.ChipGroup r4 = r3.this$0
                com.google.android.material.chip.ChipGroup.access$900(r4, r0)
            L6d:
                return
        }
    }

    public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams {
        public LayoutParams(int r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public LayoutParams(android.content.Context r1, android.util.AttributeSet r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    public interface OnCheckedChangeListener {
        void onCheckedChanged(com.google.android.material.chip.ChipGroup r1, int r2);
    }

    private class PassThroughHierarchyChangeListener implements android.view.ViewGroup.OnHierarchyChangeListener {
        private android.view.ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener;
        final /* synthetic */ com.google.android.material.chip.ChipGroup this$0;

        private PassThroughHierarchyChangeListener(com.google.android.material.chip.ChipGroup r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        /* synthetic */ PassThroughHierarchyChangeListener(com.google.android.material.chip.ChipGroup r1, com.google.android.material.chip.ChipGroup.C05281 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        static /* synthetic */ android.view.ViewGroup.OnHierarchyChangeListener access$202(com.google.android.material.chip.ChipGroup.PassThroughHierarchyChangeListener r0, android.view.ViewGroup.OnHierarchyChangeListener r1) {
                r0.onHierarchyChangeListener = r1
                return r1
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(android.view.View r4, android.view.View r5) {
                r3 = this;
                com.google.android.material.chip.ChipGroup r0 = r3.this$0
                if (r4 != r0) goto L32
                boolean r0 = r5 instanceof com.google.android.material.chip.Chip
                if (r0 == 0) goto L32
                int r0 = r5.getId()
                r1 = -1
                if (r0 != r1) goto L16
                int r0 = androidx.core.view.ViewCompat.generateViewId()
                r5.setId(r0)
            L16:
                r0 = r5
                com.google.android.material.chip.Chip r0 = (com.google.android.material.chip.Chip) r0
                boolean r1 = r0.isChecked()
                if (r1 == 0) goto L29
                r1 = r4
                com.google.android.material.chip.ChipGroup r1 = (com.google.android.material.chip.ChipGroup) r1
                int r2 = r0.getId()
                r1.check(r2)
            L29:
                com.google.android.material.chip.ChipGroup r1 = r3.this$0
                com.google.android.material.chip.ChipGroup$CheckedStateTracker r1 = com.google.android.material.chip.ChipGroup.access$1000(r1)
                r0.setOnCheckedChangeListenerInternal(r1)
            L32:
                android.view.ViewGroup$OnHierarchyChangeListener r0 = r3.onHierarchyChangeListener
                if (r0 == 0) goto L39
                r0.onChildViewAdded(r4, r5)
            L39:
                return
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(android.view.View r3, android.view.View r4) {
                r2 = this;
                com.google.android.material.chip.ChipGroup r0 = r2.this$0
                if (r3 != r0) goto Lf
                boolean r0 = r4 instanceof com.google.android.material.chip.Chip
                if (r0 == 0) goto Lf
                r0 = r4
                com.google.android.material.chip.Chip r0 = (com.google.android.material.chip.Chip) r0
                r1 = 0
                r0.setOnCheckedChangeListenerInternal(r1)
            Lf:
                android.view.ViewGroup$OnHierarchyChangeListener r0 = r2.onHierarchyChangeListener
                if (r0 == 0) goto L16
                r0.onChildViewRemoved(r3, r4)
            L16:
                return
        }
    }

    static {
            int r0 = com.google.android.material.C0479R.style.Widget_MaterialComponents_ChipGroup
            com.google.android.material.chip.ChipGroup.DEF_STYLE_RES = r0
            return
    }

    public ChipGroup(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ChipGroup(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = com.google.android.material.C0479R.attr.chipGroupStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public ChipGroup(android.content.Context r8, android.util.AttributeSet r9, int r10) {
            r7 = this;
            int r4 = com.google.android.material.chip.ChipGroup.DEF_STYLE_RES
            android.content.Context r8 = com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            com.google.android.material.chip.ChipGroup$CheckedStateTracker r8 = new com.google.android.material.chip.ChipGroup$CheckedStateTracker
            r0 = 0
            r8.<init>(r7, r0)
            r7.checkedStateTracker = r8
            com.google.android.material.chip.ChipGroup$PassThroughHierarchyChangeListener r8 = new com.google.android.material.chip.ChipGroup$PassThroughHierarchyChangeListener
            r8.<init>(r7, r0)
            r7.passThroughListener = r8
            r8 = -1
            r7.checkedId = r8
            r6 = 0
            r7.protectFromCheckedChange = r6
            android.content.Context r0 = r7.getContext()
            int[] r2 = com.google.android.material.C0479R.styleable.ChipGroup
            int[] r5 = new int[r6]
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(r0, r1, r2, r3, r4, r5)
            int r10 = com.google.android.material.C0479R.styleable.ChipGroup_chipSpacing
            int r10 = r9.getDimensionPixelOffset(r10, r6)
            int r0 = com.google.android.material.C0479R.styleable.ChipGroup_chipSpacingHorizontal
            int r0 = r9.getDimensionPixelOffset(r0, r10)
            r7.setChipSpacingHorizontal(r0)
            int r0 = com.google.android.material.C0479R.styleable.ChipGroup_chipSpacingVertical
            int r10 = r9.getDimensionPixelOffset(r0, r10)
            r7.setChipSpacingVertical(r10)
            int r10 = com.google.android.material.C0479R.styleable.ChipGroup_singleLine
            boolean r10 = r9.getBoolean(r10, r6)
            r7.setSingleLine(r10)
            int r10 = com.google.android.material.C0479R.styleable.ChipGroup_singleSelection
            boolean r10 = r9.getBoolean(r10, r6)
            r7.setSingleSelection(r10)
            int r10 = com.google.android.material.C0479R.styleable.ChipGroup_selectionRequired
            boolean r10 = r9.getBoolean(r10, r6)
            r7.setSelectionRequired(r10)
            int r10 = com.google.android.material.C0479R.styleable.ChipGroup_checkedChip
            int r10 = r9.getResourceId(r10, r8)
            if (r10 == r8) goto L69
            r7.checkedId = r10
        L69:
            r9.recycle()
            com.google.android.material.chip.ChipGroup$PassThroughHierarchyChangeListener r8 = r7.passThroughListener
            super.setOnHierarchyChangeListener(r8)
            r8 = 1
            androidx.core.view.ViewCompat.setImportantForAccessibility(r7, r8)
            return
    }

    static /* synthetic */ com.google.android.material.chip.ChipGroup.CheckedStateTracker access$1000(com.google.android.material.chip.ChipGroup r0) {
            com.google.android.material.chip.ChipGroup$CheckedStateTracker r0 = r0.checkedStateTracker
            return r0
    }

    static /* synthetic */ boolean access$300(com.google.android.material.chip.ChipGroup r0) {
            boolean r0 = r0.protectFromCheckedChange
            return r0
    }

    static /* synthetic */ boolean access$400(com.google.android.material.chip.ChipGroup r0) {
            boolean r0 = r0.selectionRequired
            return r0
    }

    static /* synthetic */ void access$500(com.google.android.material.chip.ChipGroup r0, int r1, boolean r2) {
            r0.setCheckedStateForView(r1, r2)
            return
    }

    static /* synthetic */ void access$600(com.google.android.material.chip.ChipGroup r0, int r1, boolean r2) {
            r0.setCheckedId(r1, r2)
            return
    }

    static /* synthetic */ int access$700(com.google.android.material.chip.ChipGroup r0) {
            int r0 = r0.checkedId
            return r0
    }

    static /* synthetic */ boolean access$800(com.google.android.material.chip.ChipGroup r0) {
            boolean r0 = r0.singleSelection
            return r0
    }

    static /* synthetic */ void access$900(com.google.android.material.chip.ChipGroup r0, int r1) {
            r0.setCheckedId(r1)
            return
    }

    private int getChipCount() {
            r3 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r3.getChildCount()
            if (r0 >= r2) goto L15
            android.view.View r2 = r3.getChildAt(r0)
            boolean r2 = r2 instanceof com.google.android.material.chip.Chip
            if (r2 == 0) goto L12
            int r1 = r1 + 1
        L12:
            int r0 = r0 + 1
            goto L2
        L15:
            return r1
    }

    private void setCheckedId(int r2) {
            r1 = this;
            r0 = 1
            r1.setCheckedId(r2, r0)
            return
    }

    private void setCheckedId(int r3, boolean r4) {
            r2 = this;
            r2.checkedId = r3
            com.google.android.material.chip.ChipGroup$OnCheckedChangeListener r0 = r2.onCheckedChangeListener
            if (r0 == 0) goto Lf
            boolean r1 = r2.singleSelection
            if (r1 == 0) goto Lf
            if (r4 == 0) goto Lf
            r0.onCheckedChanged(r2, r3)
        Lf:
            return
    }

    private void setCheckedStateForView(int r2, boolean r3) {
            r1 = this;
            android.view.View r2 = r1.findViewById(r2)
            boolean r0 = r2 instanceof com.google.android.material.chip.Chip
            if (r0 == 0) goto L13
            r0 = 1
            r1.protectFromCheckedChange = r0
            com.google.android.material.chip.Chip r2 = (com.google.android.material.chip.Chip) r2
            r2.setChecked(r3)
            r2 = 0
            r1.protectFromCheckedChange = r2
        L13:
            return
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View r4, int r5, android.view.ViewGroup.LayoutParams r6) {
            r3 = this;
            boolean r0 = r4 instanceof com.google.android.material.chip.Chip
            if (r0 == 0) goto L21
            r0 = r4
            com.google.android.material.chip.Chip r0 = (com.google.android.material.chip.Chip) r0
            boolean r1 = r0.isChecked()
            if (r1 == 0) goto L21
            int r1 = r3.checkedId
            r2 = -1
            if (r1 == r2) goto L1a
            boolean r2 = r3.singleSelection
            if (r2 == 0) goto L1a
            r2 = 0
            r3.setCheckedStateForView(r1, r2)
        L1a:
            int r0 = r0.getId()
            r3.setCheckedId(r0)
        L21:
            super.addView(r4, r5, r6)
            return
    }

    public void check(int r4) {
            r3 = this;
            int r0 = r3.checkedId
            if (r4 != r0) goto L5
            return
        L5:
            r1 = -1
            if (r0 == r1) goto L10
            boolean r2 = r3.singleSelection
            if (r2 == 0) goto L10
            r2 = 0
            r3.setCheckedStateForView(r0, r2)
        L10:
            if (r4 == r1) goto L16
            r0 = 1
            r3.setCheckedStateForView(r4, r0)
        L16:
            r3.setCheckedId(r4)
            return
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            boolean r0 = super.checkLayoutParams(r2)
            if (r0 == 0) goto Lc
            boolean r2 = r2 instanceof com.google.android.material.chip.ChipGroup.LayoutParams
            if (r2 == 0) goto Lc
            r2 = 1
            goto Ld
        Lc:
            r2 = 0
        Ld:
            return r2
    }

    public void clearCheck() {
            r4 = this;
            r0 = 1
            r4.protectFromCheckedChange = r0
            r0 = 0
            r1 = r0
        L5:
            int r2 = r4.getChildCount()
            if (r1 >= r2) goto L1b
            android.view.View r2 = r4.getChildAt(r1)
            boolean r3 = r2 instanceof com.google.android.material.chip.Chip
            if (r3 == 0) goto L18
            com.google.android.material.chip.Chip r2 = (com.google.android.material.chip.Chip) r2
            r2.setChecked(r0)
        L18:
            int r1 = r1 + 1
            goto L5
        L1b:
            r4.protectFromCheckedChange = r0
            r0 = -1
            r4.setCheckedId(r0)
            return
    }

    @Override // android.view.ViewGroup
    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r2 = this;
            com.google.android.material.chip.ChipGroup$LayoutParams r0 = new com.google.android.material.chip.ChipGroup$LayoutParams
            r1 = -2
            r0.<init>(r1, r1)
            return r0
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r3) {
            r2 = this;
            com.google.android.material.chip.ChipGroup$LayoutParams r0 = new com.google.android.material.chip.ChipGroup$LayoutParams
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r3)
            return r0
    }

    @Override // android.view.ViewGroup
    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            com.google.android.material.chip.ChipGroup$LayoutParams r0 = new com.google.android.material.chip.ChipGroup$LayoutParams
            r0.<init>(r2)
            return r0
    }

    public int getCheckedChipId() {
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

    public java.util.List<java.lang.Integer> getCheckedChipIds() {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r4.getChildCount()
            if (r1 >= r2) goto L30
            android.view.View r2 = r4.getChildAt(r1)
            boolean r3 = r2 instanceof com.google.android.material.chip.Chip
            if (r3 == 0) goto L2d
            r3 = r2
            com.google.android.material.chip.Chip r3 = (com.google.android.material.chip.Chip) r3
            boolean r3 = r3.isChecked()
            if (r3 == 0) goto L2d
            int r2 = r2.getId()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.add(r2)
            boolean r2 = r4.singleSelection
            if (r2 == 0) goto L2d
            return r0
        L2d:
            int r1 = r1 + 1
            goto L6
        L30:
            return r0
    }

    public int getChipSpacingHorizontal() {
            r1 = this;
            int r0 = r1.chipSpacingHorizontal
            return r0
    }

    public int getChipSpacingVertical() {
            r1 = this;
            int r0 = r1.chipSpacingVertical
            return r0
    }

    int getIndexOfChip(android.view.View r5) {
            r4 = this;
            boolean r0 = r5 instanceof com.google.android.material.chip.Chip
            r1 = -1
            if (r0 != 0) goto L6
            return r1
        L6:
            r0 = 0
            r2 = r0
        L8:
            int r3 = r4.getChildCount()
            if (r0 >= r3) goto L24
            android.view.View r3 = r4.getChildAt(r0)
            boolean r3 = r3 instanceof com.google.android.material.chip.Chip
            if (r3 == 0) goto L21
            android.view.View r3 = r4.getChildAt(r0)
            com.google.android.material.chip.Chip r3 = (com.google.android.material.chip.Chip) r3
            if (r3 != r5) goto L1f
            return r2
        L1f:
            int r2 = r2 + 1
        L21:
            int r0 = r0 + 1
            goto L8
        L24:
            return r1
    }

    public boolean isSelectionRequired() {
            r1 = this;
            boolean r0 = r1.selectionRequired
            return r0
    }

    @Override // com.google.android.material.internal.FlowLayout
    public boolean isSingleLine() {
            r1 = this;
            boolean r0 = super.isSingleLine()
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
            if (r0 == r1) goto L11
            r1 = 1
            r2.setCheckedStateForView(r0, r1)
            int r0 = r2.checkedId
            r2.setCheckedId(r0)
        L11:
            return
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r5) {
            r4 = this;
            super.onInitializeAccessibilityNodeInfo(r5)
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r5 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.wrap(r5)
            boolean r0 = r4.isSingleLine()
            if (r0 == 0) goto L12
            int r0 = r4.getChipCount()
            goto L13
        L12:
            r0 = -1
        L13:
            int r1 = r4.getRowCount()
            boolean r2 = r4.isSingleSelection()
            if (r2 == 0) goto L1f
            r2 = 1
            goto L20
        L1f:
            r2 = 2
        L20:
            r3 = 0
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$CollectionInfoCompat r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(r1, r0, r3, r2)
            r5.setCollectionInfo(r0)
            return
    }

    public void setChipSpacing(int r1) {
            r0 = this;
            r0.setChipSpacingHorizontal(r1)
            r0.setChipSpacingVertical(r1)
            return
    }

    public void setChipSpacingHorizontal(int r2) {
            r1 = this;
            int r0 = r1.chipSpacingHorizontal
            if (r0 == r2) goto Lc
            r1.chipSpacingHorizontal = r2
            r1.setItemSpacing(r2)
            r1.requestLayout()
        Lc:
            return
    }

    public void setChipSpacingHorizontalResource(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            int r2 = r0.getDimensionPixelOffset(r2)
            r1.setChipSpacingHorizontal(r2)
            return
    }

    public void setChipSpacingResource(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            int r2 = r0.getDimensionPixelOffset(r2)
            r1.setChipSpacing(r2)
            return
    }

    public void setChipSpacingVertical(int r2) {
            r1 = this;
            int r0 = r1.chipSpacingVertical
            if (r0 == r2) goto Lc
            r1.chipSpacingVertical = r2
            r1.setLineSpacing(r2)
            r1.requestLayout()
        Lc:
            return
    }

    public void setChipSpacingVerticalResource(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            int r2 = r0.getDimensionPixelOffset(r2)
            r1.setChipSpacingVertical(r2)
            return
    }

    @java.lang.Deprecated
    public void setDividerDrawableHorizontal(android.graphics.drawable.Drawable r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing."
            r2.<init>(r0)
            throw r2
    }

    @java.lang.Deprecated
    public void setDividerDrawableVertical(android.graphics.drawable.Drawable r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing."
            r2.<init>(r0)
            throw r2
    }

    @java.lang.Deprecated
    public void setFlexWrap(int r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead."
            r2.<init>(r0)
            throw r2
    }

    public void setOnCheckedChangeListener(com.google.android.material.chip.ChipGroup.OnCheckedChangeListener r1) {
            r0 = this;
            r0.onCheckedChangeListener = r1
            return
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(android.view.ViewGroup.OnHierarchyChangeListener r2) {
            r1 = this;
            com.google.android.material.chip.ChipGroup$PassThroughHierarchyChangeListener r0 = r1.passThroughListener
            com.google.android.material.chip.ChipGroup.PassThroughHierarchyChangeListener.access$202(r0, r2)
            return
    }

    public void setSelectionRequired(boolean r1) {
            r0 = this;
            r0.selectionRequired = r1
            return
    }

    @java.lang.Deprecated
    public void setShowDividerHorizontal(int r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing."
            r2.<init>(r0)
            throw r2
    }

    @java.lang.Deprecated
    public void setShowDividerVertical(int r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing."
            r2.<init>(r0)
            throw r2
    }

    public void setSingleLine(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            boolean r2 = r0.getBoolean(r2)
            r1.setSingleLine(r2)
            return
    }

    @Override // com.google.android.material.internal.FlowLayout
    public void setSingleLine(boolean r1) {
            r0 = this;
            super.setSingleLine(r1)
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
            r1.clearCheck()
        L9:
            return
    }
}
